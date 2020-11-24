package typings.reactEditText.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EditTextProps extends SharedProps {
  
  /**
    * Sets the element display to inline when set to true,
    * default: false
    */
  var `inline`: js.UndefOr[Boolean] = js.native
  
  /**
    * type attribute set for input element,
    * default: 'text'
    */
  var `type`: js.UndefOr[inputTextType] = js.native
}
object EditTextProps {
  
  @scala.inline
  def apply(): EditTextProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EditTextProps]
  }
  
  @scala.inline
  implicit class EditTextPropsOps[Self <: EditTextProps] (val x: Self) extends AnyVal {
    
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
    def setInline(value: Boolean): Self = this.set("inline", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInline: Self = this.set("inline", js.undefined)
    
    @scala.inline
    def setType(value: inputTextType): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
  }
}
