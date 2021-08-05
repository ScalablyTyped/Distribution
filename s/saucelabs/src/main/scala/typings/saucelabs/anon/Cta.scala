package typings.saucelabs.anon

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Cta
  extends StObject
     with /* key */ StringDictionary[js.Any] {
  
  var cta: js.UndefOr[String] = js.undefined
  
  var id: js.UndefOr[String] = js.undefined
  
  var message: js.UndefOr[String] = js.undefined
}
object Cta {
  
  inline def apply(): Cta = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Cta]
  }
  
  extension [Self <: Cta](x: Self) {
    
    inline def setCta(value: String): Self = StObject.set(x, "cta", value.asInstanceOf[js.Any])
    
    inline def setCtaUndefined: Self = StObject.set(x, "cta", js.undefined)
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    inline def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
  }
}
