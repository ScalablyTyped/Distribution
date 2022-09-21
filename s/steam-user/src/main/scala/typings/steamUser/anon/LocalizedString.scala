package typings.steamUser.anon

import typings.steamUser.mod.RichPresence
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LocalizedString extends StObject {
  
  var localizedString: String | Null
  
  var richPresence: RichPresence
}
object LocalizedString {
  
  inline def apply(richPresence: RichPresence): LocalizedString = {
    val __obj = js.Dynamic.literal(richPresence = richPresence.asInstanceOf[js.Any], localizedString = null)
    __obj.asInstanceOf[LocalizedString]
  }
  
  extension [Self <: LocalizedString](x: Self) {
    
    inline def setLocalizedString(value: String): Self = StObject.set(x, "localizedString", value.asInstanceOf[js.Any])
    
    inline def setLocalizedStringNull: Self = StObject.set(x, "localizedString", null)
    
    inline def setRichPresence(value: RichPresence): Self = StObject.set(x, "richPresence", value.asInstanceOf[js.Any])
  }
}
