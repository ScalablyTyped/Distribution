package typings.reactMdForm.floatingLabelMod

import typings.reactMdForm.labelLabelMod.LabelProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FloatingLabelProps extends LabelProps {
  
  /**
    * Boolean if it should use the dense spec.
    */
  var dense: js.UndefOr[Boolean] = js.native
  
  /**
    * Boolean if the label is currently floating over the text field.
    */
  var floating: js.UndefOr[Boolean] = js.native
  
  /**
    * Boolean if the text input or textarea currently have a value.
    */
  var valued: Boolean = js.native
}
object FloatingLabelProps {
  
  @scala.inline
  def apply(htmlFor: String, valued: Boolean): FloatingLabelProps = {
    val __obj = js.Dynamic.literal(htmlFor = htmlFor.asInstanceOf[js.Any], valued = valued.asInstanceOf[js.Any])
    __obj.asInstanceOf[FloatingLabelProps]
  }
  
  @scala.inline
  implicit class FloatingLabelPropsOps[Self <: FloatingLabelProps] (val x: Self) extends AnyVal {
    
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
    def setValued(value: Boolean): Self = this.set("valued", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDense(value: Boolean): Self = this.set("dense", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDense: Self = this.set("dense", js.undefined)
    
    @scala.inline
    def setFloating(value: Boolean): Self = this.set("floating", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFloating: Self = this.set("floating", js.undefined)
  }
}
