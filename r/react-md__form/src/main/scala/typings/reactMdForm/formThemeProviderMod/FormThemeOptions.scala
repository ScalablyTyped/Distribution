package typings.reactMdForm.formThemeProviderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FormThemeOptions extends js.Object {
  
  /**
    * The current theme type.
    */
  var theme: js.UndefOr[FormTheme] = js.native
  
  /**
    * The current underline direction.
    */
  var underlineDirection: js.UndefOr[FormUnderlineDirection] = js.native
}
object FormThemeOptions {
  
  @scala.inline
  def apply(): FormThemeOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FormThemeOptions]
  }
  
  @scala.inline
  implicit class FormThemeOptionsOps[Self <: FormThemeOptions] (val x: Self) extends AnyVal {
    
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
    def deleteTheme: Self = this.set("theme", js.undefined)
    
    @scala.inline
    def setUnderlineDirection(value: FormUnderlineDirection): Self = this.set("underlineDirection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUnderlineDirection: Self = this.set("underlineDirection", js.undefined)
  }
}
