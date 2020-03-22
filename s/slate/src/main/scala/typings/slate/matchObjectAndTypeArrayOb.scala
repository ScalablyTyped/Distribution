package typings.slate

import org.scalablytyped.runtime.StringDictionary
import typings.slate.mod.Editor
import typings.slate.mod.ObjectAndType
import typings.slate.mod.SlateError
import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined {  match  :slate.slate.ObjectAndType | std.Array<slate.slate.ObjectAndType>} & slate.slate.Rules */
trait matchObjectAndTypeArrayOb extends js.Object {
  var data: js.UndefOr[StringDictionary[js.Function1[/* v */ js.Any, Boolean]]] = js.undefined
  var first: js.UndefOr[ObjectAndType | js.Array[ObjectAndType]] = js.undefined
  var isAtomic: js.UndefOr[Boolean] = js.undefined
  var isVoid: js.UndefOr[Boolean] = js.undefined
  var last: js.UndefOr[ObjectAndType | js.Array[ObjectAndType]] = js.undefined
  var marks: js.UndefOr[js.Array[AnonType]] = js.undefined
  var `match`: ObjectAndType | js.Array[ObjectAndType]
  var next: js.UndefOr[ObjectAndType | js.Array[ObjectAndType]] = js.undefined
  var nodes: js.UndefOr[js.Array[AnonMatch]] = js.undefined
  var normalize: js.UndefOr[js.Function2[/* editor */ Editor, /* error */ SlateError, Unit]] = js.undefined
  var parent: js.UndefOr[ObjectAndType | js.Array[ObjectAndType]] = js.undefined
  var previous: js.UndefOr[ObjectAndType | js.Array[ObjectAndType]] = js.undefined
  var text: js.UndefOr[RegExp | (js.Function1[/* text */ String, Boolean])] = js.undefined
}

object matchObjectAndTypeArrayOb {
  @scala.inline
  def apply(
    `match`: ObjectAndType | js.Array[ObjectAndType],
    data: StringDictionary[js.Function1[/* v */ js.Any, Boolean]] = null,
    first: ObjectAndType | js.Array[ObjectAndType] = null,
    isAtomic: js.UndefOr[Boolean] = js.undefined,
    isVoid: js.UndefOr[Boolean] = js.undefined,
    last: ObjectAndType | js.Array[ObjectAndType] = null,
    marks: js.Array[AnonType] = null,
    next: ObjectAndType | js.Array[ObjectAndType] = null,
    nodes: js.Array[AnonMatch] = null,
    normalize: (/* editor */ Editor, /* error */ SlateError) => Unit = null,
    parent: ObjectAndType | js.Array[ObjectAndType] = null,
    previous: ObjectAndType | js.Array[ObjectAndType] = null,
    text: RegExp | (js.Function1[/* text */ String, Boolean]) = null
  ): matchObjectAndTypeArrayOb = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("match")(`match`.asInstanceOf[js.Any])
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (first != null) __obj.updateDynamic("first")(first.asInstanceOf[js.Any])
    if (!js.isUndefined(isAtomic)) __obj.updateDynamic("isAtomic")(isAtomic.asInstanceOf[js.Any])
    if (!js.isUndefined(isVoid)) __obj.updateDynamic("isVoid")(isVoid.asInstanceOf[js.Any])
    if (last != null) __obj.updateDynamic("last")(last.asInstanceOf[js.Any])
    if (marks != null) __obj.updateDynamic("marks")(marks.asInstanceOf[js.Any])
    if (next != null) __obj.updateDynamic("next")(next.asInstanceOf[js.Any])
    if (nodes != null) __obj.updateDynamic("nodes")(nodes.asInstanceOf[js.Any])
    if (normalize != null) __obj.updateDynamic("normalize")(js.Any.fromFunction2(normalize))
    if (parent != null) __obj.updateDynamic("parent")(parent.asInstanceOf[js.Any])
    if (previous != null) __obj.updateDynamic("previous")(previous.asInstanceOf[js.Any])
    if (text != null) __obj.updateDynamic("text")(text.asInstanceOf[js.Any])
    __obj.asInstanceOf[matchObjectAndTypeArrayOb]
  }
}

