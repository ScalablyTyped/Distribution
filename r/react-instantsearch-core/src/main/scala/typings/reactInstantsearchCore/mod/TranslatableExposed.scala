package typings.reactInstantsearchCore.mod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TranslatableExposed extends StObject {
  
  var translations: js.UndefOr[StringDictionary[String | (js.Function1[/* repeated */ Any, String])]] = js.undefined
}
object TranslatableExposed {
  
  inline def apply(): TranslatableExposed = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TranslatableExposed]
  }
  
  extension [Self <: TranslatableExposed](x: Self) {
    
    inline def setTranslations(value: StringDictionary[String | (js.Function1[/* repeated */ Any, String])]): Self = StObject.set(x, "translations", value.asInstanceOf[js.Any])
    
    inline def setTranslationsUndefined: Self = StObject.set(x, "translations", js.undefined)
  }
}
