package typings.steamUser.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EnglishName extends StObject {
  
  var englishName: String
  
  var name: String
}
object EnglishName {
  
  inline def apply(englishName: String, name: String): EnglishName = {
    val __obj = js.Dynamic.literal(englishName = englishName.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[EnglishName]
  }
  
  extension [Self <: EnglishName](x: Self) {
    
    inline def setEnglishName(value: String): Self = StObject.set(x, "englishName", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
