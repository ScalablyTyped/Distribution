package typings.reactI18next.mod

import typings.i18next.mod.i18n
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UseTranslationOptions extends js.Object {
  
  var i18n: js.UndefOr[typings.i18next.mod.i18n] = js.native
  
  var useSuspense: js.UndefOr[Boolean] = js.native
}
object UseTranslationOptions {
  
  @scala.inline
  def apply(): UseTranslationOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UseTranslationOptions]
  }
  
  @scala.inline
  implicit class UseTranslationOptionsOps[Self <: UseTranslationOptions] (val x: Self) extends AnyVal {
    
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
    def setI18n(value: i18n): Self = this.set("i18n", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteI18n: Self = this.set("i18n", js.undefined)
    
    @scala.inline
    def setUseSuspense(value: Boolean): Self = this.set("useSuspense", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUseSuspense: Self = this.set("useSuspense", js.undefined)
  }
}
