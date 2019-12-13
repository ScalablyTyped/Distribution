package typings.slate.slateMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Plugin[T /* <: Controller */] extends js.Object {
  var commands: js.UndefOr[StringDictionary[CommandFunc[T]]] = js.undefined
  var normalizeNode: js.UndefOr[
    js.Function3[
      /* node */ Node, 
      /* editor */ T, 
      /* next */ js.Function0[Unit], 
      (js.Function1[/* editor */ T, Unit]) | Unit
    ]
  ] = js.undefined
  var onChange: js.UndefOr[js.Function2[/* editor */ T, /* next */ js.Function0[Unit], Unit]] = js.undefined
  var onCommand: js.UndefOr[
    js.Function3[/* command */ Command, /* editor */ T, /* next */ js.Function0[Unit], Unit]
  ] = js.undefined
  var onConstruct: js.UndefOr[js.Function2[/* editor */ T, /* next */ js.Function0[Unit], Unit]] = js.undefined
  var onQuery: js.UndefOr[
    js.Function3[/* query */ Query, /* editor */ T, /* next */ js.Function0[Unit], Unit]
  ] = js.undefined
  var queries: js.UndefOr[StringDictionary[QueryFunc[T]]] = js.undefined
  var schema: js.UndefOr[SchemaProperties] = js.undefined
  var validateNode: js.UndefOr[
    js.Function3[/* node */ Node, /* editor */ T, /* next */ js.Function0[Unit], SlateError | Unit]
  ] = js.undefined
}

object Plugin {
  @scala.inline
  def apply[T /* <: Controller */](
    commands: StringDictionary[CommandFunc[T]] = null,
    normalizeNode: (/* node */ Node, /* editor */ T, /* next */ js.Function0[Unit]) => (js.Function1[/* editor */ T, Unit]) | Unit = null,
    onChange: (/* editor */ T, /* next */ js.Function0[Unit]) => Unit = null,
    onCommand: (/* command */ Command, /* editor */ T, /* next */ js.Function0[Unit]) => Unit = null,
    onConstruct: (/* editor */ T, /* next */ js.Function0[Unit]) => Unit = null,
    onQuery: (/* query */ Query, /* editor */ T, /* next */ js.Function0[Unit]) => Unit = null,
    queries: StringDictionary[QueryFunc[T]] = null,
    schema: SchemaProperties = null,
    validateNode: (/* node */ Node, /* editor */ T, /* next */ js.Function0[Unit]) => SlateError | Unit = null
  ): Plugin[T] = {
    val __obj = js.Dynamic.literal()
    if (commands != null) __obj.updateDynamic("commands")(commands.asInstanceOf[js.Any])
    if (normalizeNode != null) __obj.updateDynamic("normalizeNode")(js.Any.fromFunction3(normalizeNode))
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction2(onChange))
    if (onCommand != null) __obj.updateDynamic("onCommand")(js.Any.fromFunction3(onCommand))
    if (onConstruct != null) __obj.updateDynamic("onConstruct")(js.Any.fromFunction2(onConstruct))
    if (onQuery != null) __obj.updateDynamic("onQuery")(js.Any.fromFunction3(onQuery))
    if (queries != null) __obj.updateDynamic("queries")(queries.asInstanceOf[js.Any])
    if (schema != null) __obj.updateDynamic("schema")(schema.asInstanceOf[js.Any])
    if (validateNode != null) __obj.updateDynamic("validateNode")(js.Any.fromFunction3(validateNode))
    __obj.asInstanceOf[Plugin[T]]
  }
}

