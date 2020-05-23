package typings.reduxForm.fieldsMod

import typings.react.mod.ComponentType
import typings.reduxForm.fieldMod.Formatter
import typings.reduxForm.fieldMod.Parser
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BaseFieldsProps[P] extends js.Object {
  var component: js.UndefOr[ComponentType[_]] = js.undefined
  var format: js.UndefOr[Formatter | Null] = js.undefined
  var forwardRef: js.UndefOr[Boolean] = js.undefined
  var names: js.Array[String]
  var parse: js.UndefOr[Parser] = js.undefined
  var props: js.UndefOr[P] = js.undefined
  var validate: js.UndefOr[FieldsWarnerOrValidator] = js.undefined
  var warn: js.UndefOr[FieldsWarnerOrValidator] = js.undefined
}

object BaseFieldsProps {
  @scala.inline
  def apply[P](
    names: js.Array[String],
    component: ComponentType[_] = null,
    format: js.UndefOr[Null | ((/* value */ js.Any, /* name */ String) => js.Any)] = js.undefined,
    forwardRef: js.UndefOr[Boolean] = js.undefined,
    parse: (/* value */ js.Any, /* name */ String) => js.Any = null,
    props: P = null,
    validate: FieldsWarnerOrValidator = null,
    warn: FieldsWarnerOrValidator = null
  ): BaseFieldsProps[P] = {
    val __obj = js.Dynamic.literal(names = names.asInstanceOf[js.Any])
    if (component != null) __obj.updateDynamic("component")(component.asInstanceOf[js.Any])
    if (!js.isUndefined(format)) __obj.updateDynamic("format")(if (format != null) js.Any.fromFunction2(format.asInstanceOf[(/* value */ js.Any, /* name */ String) => js.Any]) else null)
    if (!js.isUndefined(forwardRef)) __obj.updateDynamic("forwardRef")(forwardRef.get.asInstanceOf[js.Any])
    if (parse != null) __obj.updateDynamic("parse")(js.Any.fromFunction2(parse))
    if (props != null) __obj.updateDynamic("props")(props.asInstanceOf[js.Any])
    if (validate != null) __obj.updateDynamic("validate")(validate.asInstanceOf[js.Any])
    if (warn != null) __obj.updateDynamic("warn")(warn.asInstanceOf[js.Any])
    __obj.asInstanceOf[BaseFieldsProps[P]]
  }
}

