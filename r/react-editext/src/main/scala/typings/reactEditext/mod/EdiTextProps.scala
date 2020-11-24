package typings.reactEditext.mod

import typings.react.mod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EdiTextProps extends js.Object {
  
  /**
    * Custom class name for CANCEL button.
    */
  var cancelButtonClassName: js.UndefOr[String] = js.native
  
  /**
    * Content for CANCEL button. Any valid element and node are allowed.
    */
  var cancelButtonContent: js.UndefOr[js.Any] = js.native
  
  /**
    * Custom class name for EDIT button.
    */
  var editButtonClassName: js.UndefOr[String] = js.native
  
  /**
    * Content for EDIT button. Any valid element and node are allowed.
    */
  var editButtonContent: js.UndefOr[js.Any] = js.native
  
  /**
    * Set it to `true` if you don't want to see default icons
    * on action buttons.See Examples page for more details.
    */
  var hideIcons: js.UndefOr[Boolean] = js.native
  
  /**
    * A simple hint message appears at the bottom of input element.
    * Any valid element is allowed.
    */
  var hint: js.UndefOr[ReactNode] = js.native
  
  /**
    * Props to be passed to input element.
    * Any kind of valid DOM attributes are welcome
    */
  var inputProps: js.UndefOr[js.Object] = js.native
  
  /**
    * will be called when user clicked cancel button
    */
  var onCancel: js.UndefOr[js.Function1[/* repeated */ js.Any, _]] = js.native
  
  /**
    * will be called when user clicked save button.
    * takes one param <value> which is the current value of input
    */
  def onSave(args: String*): js.Any = js.native
  
  /**
    * will be called when validation fails.
    * takes one param <value> which is the current value of input
    */
  var onValidationFail: js.UndefOr[js.Function1[/* repeated */ String, _]] = js.native
  
  /**
    * Custom class name for SAVE button.
    */
  var saveButtonClassName: js.UndefOr[String] = js.native
  
  /**
    * Content for SAVE button. Any valid element and node are allowed.
    */
  var saveButtonContent: js.UndefOr[js.Any] = js.native
  
  /**
    * Input type. Possible options are:
    * `text`, `number`, `email`, `textarea`, `date`,
    * `datetime-local`, `time`, `month`, `url`, `week`, `tel`
    */
  var `type`: EdiTextType = js.native
  
  /**
    * Pass your own validation function.
    * takes one param -> `value`.
    * It must return `true` or `false`
    */
  var validation: js.UndefOr[js.Function1[/* repeated */ String, Boolean]] = js.native
  
  /**
    * If validation fails this message will appear
    */
  var validationMessage: js.UndefOr[String] = js.native
  
  /**
    * Value of the content [in view mode] and input [in edit mode]
    */
  var value: String = js.native
  
  /**
    * Props to be passed to div element that shows the text.
    * You can specify your own `styles` or `className`
    */
  var viewProps: js.UndefOr[js.Object] = js.native
}
object EdiTextProps {
  
  @scala.inline
  def apply(onSave: /* repeated */ String => js.Any, `type`: EdiTextType, value: String): EdiTextProps = {
    val __obj = js.Dynamic.literal(onSave = js.Any.fromFunction1(onSave), value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[EdiTextProps]
  }
  
  @scala.inline
  implicit class EdiTextPropsOps[Self <: EdiTextProps] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setOnSave(value: /* repeated */ String => js.Any): Self = this.set("onSave", js.Any.fromFunction1(value))
    
    @scala.inline
    def setType(value: EdiTextType): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: String): Self = this.set("value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCancelButtonClassName(value: String): Self = this.set("cancelButtonClassName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCancelButtonClassName: Self = this.set("cancelButtonClassName", js.undefined)
    
    @scala.inline
    def setCancelButtonContent(value: js.Any): Self = this.set("cancelButtonContent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCancelButtonContent: Self = this.set("cancelButtonContent", js.undefined)
    
    @scala.inline
    def setEditButtonClassName(value: String): Self = this.set("editButtonClassName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEditButtonClassName: Self = this.set("editButtonClassName", js.undefined)
    
    @scala.inline
    def setEditButtonContent(value: js.Any): Self = this.set("editButtonContent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEditButtonContent: Self = this.set("editButtonContent", js.undefined)
    
    @scala.inline
    def setHideIcons(value: Boolean): Self = this.set("hideIcons", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHideIcons: Self = this.set("hideIcons", js.undefined)
    
    @scala.inline
    def setHint(value: ReactNode): Self = this.set("hint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHint: Self = this.set("hint", js.undefined)
    
    @scala.inline
    def setInputProps(value: js.Object): Self = this.set("inputProps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInputProps: Self = this.set("inputProps", js.undefined)
    
    @scala.inline
    def setOnCancel(value: /* repeated */ js.Any => _): Self = this.set("onCancel", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnCancel: Self = this.set("onCancel", js.undefined)
    
    @scala.inline
    def setOnValidationFail(value: /* repeated */ String => _): Self = this.set("onValidationFail", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnValidationFail: Self = this.set("onValidationFail", js.undefined)
    
    @scala.inline
    def setSaveButtonClassName(value: String): Self = this.set("saveButtonClassName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSaveButtonClassName: Self = this.set("saveButtonClassName", js.undefined)
    
    @scala.inline
    def setSaveButtonContent(value: js.Any): Self = this.set("saveButtonContent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSaveButtonContent: Self = this.set("saveButtonContent", js.undefined)
    
    @scala.inline
    def setValidation(value: /* repeated */ String => Boolean): Self = this.set("validation", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteValidation: Self = this.set("validation", js.undefined)
    
    @scala.inline
    def setValidationMessage(value: String): Self = this.set("validationMessage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteValidationMessage: Self = this.set("validationMessage", js.undefined)
    
    @scala.inline
    def setViewProps(value: js.Object): Self = this.set("viewProps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteViewProps: Self = this.set("viewProps", js.undefined)
  }
}
