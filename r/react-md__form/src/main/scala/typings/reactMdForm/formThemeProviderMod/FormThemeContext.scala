package typings.reactMdForm.formThemeProviderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Required<@react-md/form.@react-md/form/types/FormThemeProvider.FormThemeOptions> */
@js.native
trait FormThemeContext extends js.Object {
  
  var theme: FormTheme = js.native
  
  var underlineDirection: FormUnderlineDirection = js.native
}
object FormThemeContext {
  
  @scala.inline
  def apply(theme: FormTheme, underlineDirection: FormUnderlineDirection): FormThemeContext = {
    val __obj = js.Dynamic.literal(theme = theme.asInstanceOf[js.Any], underlineDirection = underlineDirection.asInstanceOf[js.Any])
    __obj.asInstanceOf[FormThemeContext]
  }
  
  @scala.inline
  implicit class FormThemeContextOps[Self <: FormThemeContext] (val x: Self) extends AnyVal {
    
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
    def setTheme(value: FormTheme): Self = this.set("theme", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUnderlineDirection(value: FormUnderlineDirection): Self = this.set("underlineDirection", value.asInstanceOf[js.Any])
  }
}
