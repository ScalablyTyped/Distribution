package typings.reactInstantsearchCore.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TranslatableExposed extends js.Object {
  
  var translations: js.UndefOr[StringDictionary[String | (js.Function1[/* repeated */ js.Any, String])]] = js.native
}
object TranslatableExposed {
  
  @scala.inline
  def apply(): TranslatableExposed = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TranslatableExposed]
  }
  
  @scala.inline
  implicit class TranslatableExposedOps[Self <: TranslatableExposed] (val x: Self) extends AnyVal {
    
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
    def setTranslations(value: StringDictionary[String | (js.Function1[/* repeated */ js.Any, String])]): Self = this.set("translations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTranslations: Self = this.set("translations", js.undefined)
  }
}
