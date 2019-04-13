package typings
package reduxDashFormLib.libFieldMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in keyof redux-form.redux-form/lib/Field.CommonFieldProps ]:? redux-form.redux-form/lib/Field.CommonFieldProps[P]} */ trait BaseFieldProps[P] extends js.Object {
  var component: js.UndefOr[
    (reactLib.reactMod.ComponentType[WrappedFieldProps with P]) | reduxDashFormLib.reduxDashFormLibStrings.input | reduxDashFormLib.reduxDashFormLibStrings.select | reduxDashFormLib.reduxDashFormLibStrings.textarea
  ] = js.undefined
  var format: js.UndefOr[Formatter | scala.Null] = js.undefined
  var forwardRef: js.UndefOr[scala.Boolean] = js.undefined
  var immutableProps: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var name: java.lang.String
  var normalize: js.UndefOr[Normalizer] = js.undefined
  var parse: js.UndefOr[Parser] = js.undefined
  var props: js.UndefOr[P] = js.undefined
  var validate: js.UndefOr[Validator | js.Array[Validator]] = js.undefined
  var warn: js.UndefOr[Validator | js.Array[Validator]] = js.undefined
}

object BaseFieldProps {
  @scala.inline
  def apply[P](
    name: java.lang.String,
    component: (reactLib.reactMod.ComponentType[WrappedFieldProps with P]) | reduxDashFormLib.reduxDashFormLibStrings.input | reduxDashFormLib.reduxDashFormLibStrings.select | reduxDashFormLib.reduxDashFormLibStrings.textarea = null,
    format: Formatter = null,
    forwardRef: js.UndefOr[scala.Boolean] = js.undefined,
    immutableProps: js.Array[java.lang.String] = null,
    normalize: Normalizer = null,
    parse: Parser = null,
    props: P = null,
    validate: Validator | js.Array[Validator] = null,
    warn: Validator | js.Array[Validator] = null
  ): BaseFieldProps[P] = {
    val __obj = js.Dynamic.literal(name = name)
    if (component != null) __obj.updateDynamic("component")(component.asInstanceOf[js.Any])
    if (format != null) __obj.updateDynamic("format")(format)
    if (!js.isUndefined(forwardRef)) __obj.updateDynamic("forwardRef")(forwardRef)
    if (immutableProps != null) __obj.updateDynamic("immutableProps")(immutableProps)
    if (normalize != null) __obj.updateDynamic("normalize")(normalize)
    if (parse != null) __obj.updateDynamic("parse")(parse)
    if (props != null) __obj.updateDynamic("props")(props.asInstanceOf[js.Any])
    if (validate != null) __obj.updateDynamic("validate")(validate.asInstanceOf[js.Any])
    if (warn != null) __obj.updateDynamic("warn")(warn.asInstanceOf[js.Any])
    __obj.asInstanceOf[BaseFieldProps[P]]
  }
}

