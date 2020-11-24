package typings.reactI18next.mod

import typings.i18next.mod.i18n
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait I18nextProviderProps extends js.Object {
  
  var defaultNS: js.UndefOr[String] = js.native
  
  var i18n: typings.i18next.mod.i18n = js.native
}
object I18nextProviderProps {
  
  @scala.inline
  def apply(i18n: i18n): I18nextProviderProps = {
    val __obj = js.Dynamic.literal(i18n = i18n.asInstanceOf[js.Any])
    __obj.asInstanceOf[I18nextProviderProps]
  }
  
  @scala.inline
  implicit class I18nextProviderPropsOps[Self <: I18nextProviderProps] (val x: Self) extends AnyVal {
    
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
    def setDefaultNS(value: String): Self = this.set("defaultNS", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDefaultNS: Self = this.set("defaultNS", js.undefined)
  }
}
