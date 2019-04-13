package typings
package reactDashEditextLib.reactDashEditextMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EdiTextProps extends js.Object {
  /**
    * Custom class name for CANCEL button.
    */
  var cancelButtonClassName: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Content for CANCEL button. Any valid element and node are allowed.
    */
  var cancelButtonContent: js.UndefOr[js.Any] = js.undefined
  /**
    * Custom class name for EDIT button.
    */
  var editButtonClassName: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Content for EDIT button. Any valid element and node are allowed.
    */
  var editButtonContent: js.UndefOr[js.Any] = js.undefined
  /**
    * Set it to `true` if you don't want to see default icons
    * on action buttons.See Examples page for more details.
    */
  var hideIcons: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * A simple hint message appears at the bottom of input element.
    * Any valid element is allowed.
    */
  var hint: js.UndefOr[reactLib.reactMod.ReactNode] = js.undefined
  /**
    * Props to be passed to input element.
    * Any kind of valid DOM attributes are welcome
    */
  var inputProps: js.UndefOr[js.Object] = js.undefined
  /**
    * will be called when user clicked cancel button
    */
  var onCancel: js.UndefOr[js.Function1[/* repeated */ js.Any, _]] = js.undefined
  /**
    * will be called when validation fails.
    * takes one param <value> which is the current value of input
    */
  var onValidationFail: js.UndefOr[js.Function1[/* repeated */ java.lang.String, _]] = js.undefined
  /**
    * Custom class name for SAVE button.
    */
  var saveButtonClassName: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Content for SAVE button. Any valid element and node are allowed.
    */
  var saveButtonContent: js.UndefOr[js.Any] = js.undefined
  /**
    * Input type. Possible options are:
    * `text`, `number`, `email`, `textarea`, `date`,
    * `datetime-local`, `time`, `month`, `url`, `week`, `tel`
    */
  var `type`: EdiTextType
  /**
    * Pass your own validation function.
    * takes one param -> `value`.
    * It must return `true` or `false`
    */
  var validation: js.UndefOr[js.Function1[/* repeated */ java.lang.String, scala.Boolean]] = js.undefined
  /**
    * If validation fails this message will appear
    */
  var validationMessage: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Value of the content [in view mode] and input [in edit mode]
    */
  var value: java.lang.String
  /**
    * Props to be passed to div element that shows the text.
    * You can specify your own `styles` or `className`
    */
  var viewProps: js.UndefOr[js.Object] = js.undefined
  /**
    * will be called when user clicked save button.
    * takes one param <value> which is the current value of input
    */
  def onSave(args: java.lang.String*): js.Any
}

object EdiTextProps {
  @scala.inline
  def apply(
    onSave: /* repeated */ java.lang.String => js.Any,
    `type`: EdiTextType,
    value: java.lang.String,
    cancelButtonClassName: java.lang.String = null,
    cancelButtonContent: js.Any = null,
    editButtonClassName: java.lang.String = null,
    editButtonContent: js.Any = null,
    hideIcons: js.UndefOr[scala.Boolean] = js.undefined,
    hint: reactLib.reactMod.ReactNode = null,
    inputProps: js.Object = null,
    onCancel: /* repeated */ js.Any => _ = null,
    onValidationFail: /* repeated */ java.lang.String => _ = null,
    saveButtonClassName: java.lang.String = null,
    saveButtonContent: js.Any = null,
    validation: /* repeated */ java.lang.String => scala.Boolean = null,
    validationMessage: java.lang.String = null,
    viewProps: js.Object = null
  ): EdiTextProps = {
    val __obj = js.Dynamic.literal(onSave = js.Any.fromFunction1(onSave), value = value)
    __obj.updateDynamic("type")(`type`)
    if (cancelButtonClassName != null) __obj.updateDynamic("cancelButtonClassName")(cancelButtonClassName)
    if (cancelButtonContent != null) __obj.updateDynamic("cancelButtonContent")(cancelButtonContent)
    if (editButtonClassName != null) __obj.updateDynamic("editButtonClassName")(editButtonClassName)
    if (editButtonContent != null) __obj.updateDynamic("editButtonContent")(editButtonContent)
    if (!js.isUndefined(hideIcons)) __obj.updateDynamic("hideIcons")(hideIcons)
    if (hint != null) __obj.updateDynamic("hint")(hint.asInstanceOf[js.Any])
    if (inputProps != null) __obj.updateDynamic("inputProps")(inputProps)
    if (onCancel != null) __obj.updateDynamic("onCancel")(js.Any.fromFunction1(onCancel))
    if (onValidationFail != null) __obj.updateDynamic("onValidationFail")(js.Any.fromFunction1(onValidationFail))
    if (saveButtonClassName != null) __obj.updateDynamic("saveButtonClassName")(saveButtonClassName)
    if (saveButtonContent != null) __obj.updateDynamic("saveButtonContent")(saveButtonContent)
    if (validation != null) __obj.updateDynamic("validation")(js.Any.fromFunction1(validation))
    if (validationMessage != null) __obj.updateDynamic("validationMessage")(validationMessage)
    if (viewProps != null) __obj.updateDynamic("viewProps")(viewProps)
    __obj.asInstanceOf[EdiTextProps]
  }
}

