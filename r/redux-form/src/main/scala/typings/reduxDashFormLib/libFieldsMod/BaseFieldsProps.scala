package typings
package reduxDashFormLib.libFieldsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BaseFieldsProps[P] extends js.Object {
  var component: js.UndefOr[reactLib.reactMod.ComponentType[_]] = js.undefined
  var format: js.UndefOr[reduxDashFormLib.libFieldMod.Formatter | scala.Null] = js.undefined
  var forwardRef: js.UndefOr[scala.Boolean] = js.undefined
  var names: js.Array[java.lang.String]
  var parse: js.UndefOr[reduxDashFormLib.libFieldMod.Parser] = js.undefined
  var props: js.UndefOr[P] = js.undefined
  var validate: js.UndefOr[FieldsWarnerOrValidator] = js.undefined
  var warn: js.UndefOr[FieldsWarnerOrValidator] = js.undefined
}

object BaseFieldsProps {
  @scala.inline
  def apply[P](
    names: js.Array[java.lang.String],
    component: reactLib.reactMod.ComponentType[_] = null,
    format: reduxDashFormLib.libFieldMod.Formatter = null,
    forwardRef: js.UndefOr[scala.Boolean] = js.undefined,
    parse: reduxDashFormLib.libFieldMod.Parser = null,
    props: P = null,
    validate: FieldsWarnerOrValidator = null,
    warn: FieldsWarnerOrValidator = null
  ): BaseFieldsProps[P] = {
    val __obj = js.Dynamic.literal(names = names)
    if (component != null) __obj.updateDynamic("component")(component.asInstanceOf[js.Any])
    if (format != null) __obj.updateDynamic("format")(format)
    if (!js.isUndefined(forwardRef)) __obj.updateDynamic("forwardRef")(forwardRef)
    if (parse != null) __obj.updateDynamic("parse")(parse)
    if (props != null) __obj.updateDynamic("props")(props.asInstanceOf[js.Any])
    if (validate != null) __obj.updateDynamic("validate")(validate.asInstanceOf[js.Any])
    if (warn != null) __obj.updateDynamic("warn")(warn.asInstanceOf[js.Any])
    __obj.asInstanceOf[BaseFieldsProps[P]]
  }
}

