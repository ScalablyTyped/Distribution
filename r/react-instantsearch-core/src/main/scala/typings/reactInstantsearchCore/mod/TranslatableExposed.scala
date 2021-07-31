package typings.reactInstantsearchCore.mod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TranslatableExposed extends StObject {
  
  var translations: js.UndefOr[StringDictionary[String | (js.Function1[/* repeated */ js.Any, String])]] = js.undefined
}
object TranslatableExposed {
  
  @scala.inline
  def apply(): TranslatableExposed = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TranslatableExposed]
  }
  
  @scala.inline
  implicit class TranslatableExposedMutableBuilder[Self <: TranslatableExposed] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setTranslations(value: StringDictionary[String | (js.Function1[/* repeated */ js.Any, String])]): Self = StObject.set(x, "translations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTranslationsUndefined: Self = StObject.set(x, "translations", js.undefined)
  }
}
