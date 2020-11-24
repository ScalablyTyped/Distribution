package typings.reactI18next.anon

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait InitialI18nStore extends js.Object {
  
  var initialI18nStore: StringDictionary[js.Object] = js.native
  
  var initialLanguage: String = js.native
}
object InitialI18nStore {
  
  @scala.inline
  def apply(initialI18nStore: StringDictionary[js.Object], initialLanguage: String): InitialI18nStore = {
    val __obj = js.Dynamic.literal(initialI18nStore = initialI18nStore.asInstanceOf[js.Any], initialLanguage = initialLanguage.asInstanceOf[js.Any])
    __obj.asInstanceOf[InitialI18nStore]
  }
  
  @scala.inline
  implicit class InitialI18nStoreOps[Self <: InitialI18nStore] (val x: Self) extends AnyVal {
    
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
    def setInitialI18nStore(value: StringDictionary[js.Object]): Self = this.set("initialI18nStore", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInitialLanguage(value: String): Self = this.set("initialLanguage", value.asInstanceOf[js.Any])
  }
}
