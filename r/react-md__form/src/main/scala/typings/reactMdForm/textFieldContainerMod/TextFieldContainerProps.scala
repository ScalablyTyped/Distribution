package typings.reactMdForm.textFieldContainerMod

import typings.react.mod.HTMLAttributes
import typings.std.HTMLDivElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TextFieldContainerProps
  extends HTMLAttributes[HTMLDivElement]
     with TextFieldContainerOptions {
  
  /**
    * Boolean if the text field is currently active (focused) to applied the
    * active color to the current theme.
    */
  var active: js.UndefOr[Boolean] = js.native
  
  /**
    * Boolean if the text field is currently disabled.
    */
  var disabled: js.UndefOr[Boolean] = js.native
  
  /**
    * Boolean if there is a floating label with the text field.
    */
  var label: js.UndefOr[Boolean] = js.native
}
object TextFieldContainerProps {
  
  @scala.inline
  def apply(): TextFieldContainerProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TextFieldContainerProps]
  }
  
  @scala.inline
  implicit class TextFieldContainerPropsOps[Self <: TextFieldContainerProps] (val x: Self) extends AnyVal {
    
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
    def setActive(value: Boolean): Self = this.set("active", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteActive: Self = this.set("active", js.undefined)
    
    @scala.inline
    def setDisabled(value: Boolean): Self = this.set("disabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisabled: Self = this.set("disabled", js.undefined)
    
    @scala.inline
    def setLabel(value: Boolean): Self = this.set("label", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLabel: Self = this.set("label", js.undefined)
  }
}
