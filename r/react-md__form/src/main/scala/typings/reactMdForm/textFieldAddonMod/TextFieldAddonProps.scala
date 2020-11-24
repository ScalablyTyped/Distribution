package typings.reactMdForm.textFieldAddonMod

import typings.react.mod.HTMLAttributes
import typings.std.HTMLSpanElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TextFieldAddonProps extends HTMLAttributes[HTMLSpanElement] {
  
  /**
    * Boolean if the addon should be presentational only and prevent pointer
    * events.
    */
  var presentational: js.UndefOr[Boolean] = js.native
}
object TextFieldAddonProps {
  
  @scala.inline
  def apply(): TextFieldAddonProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TextFieldAddonProps]
  }
  
  @scala.inline
  implicit class TextFieldAddonPropsOps[Self <: TextFieldAddonProps] (val x: Self) extends AnyVal {
    
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
    def setPresentational(value: Boolean): Self = this.set("presentational", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePresentational: Self = this.set("presentational", js.undefined)
  }
}
