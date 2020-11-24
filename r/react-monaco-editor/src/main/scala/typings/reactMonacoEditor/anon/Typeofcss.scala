package typings.reactMonacoEditor.anon

import typings.monacoEditor.mod.languages.css.LanguageServiceDefaults
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Typeofcss extends js.Object {
  
  val cssDefaults: LanguageServiceDefaults = js.native
  
  val lessDefaults: LanguageServiceDefaults = js.native
  
  val scssDefaults: LanguageServiceDefaults = js.native
}
object Typeofcss {
  
  @scala.inline
  def apply(
    cssDefaults: LanguageServiceDefaults,
    lessDefaults: LanguageServiceDefaults,
    scssDefaults: LanguageServiceDefaults
  ): Typeofcss = {
    val __obj = js.Dynamic.literal(cssDefaults = cssDefaults.asInstanceOf[js.Any], lessDefaults = lessDefaults.asInstanceOf[js.Any], scssDefaults = scssDefaults.asInstanceOf[js.Any])
    __obj.asInstanceOf[Typeofcss]
  }
  
  @scala.inline
  implicit class TypeofcssOps[Self <: Typeofcss] (val x: Self) extends AnyVal {
    
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
    def setCssDefaults(value: LanguageServiceDefaults): Self = this.set("cssDefaults", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLessDefaults(value: LanguageServiceDefaults): Self = this.set("lessDefaults", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScssDefaults(value: LanguageServiceDefaults): Self = this.set("scssDefaults", value.asInstanceOf[js.Any])
  }
}
