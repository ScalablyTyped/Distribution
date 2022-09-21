package typings.steamUser.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PersonaName extends StObject {
  
  var personaName: String
}
object PersonaName {
  
  inline def apply(personaName: String): PersonaName = {
    val __obj = js.Dynamic.literal(personaName = personaName.asInstanceOf[js.Any])
    __obj.asInstanceOf[PersonaName]
  }
  
  extension [Self <: PersonaName](x: Self) {
    
    inline def setPersonaName(value: String): Self = StObject.set(x, "personaName", value.asInstanceOf[js.Any])
  }
}
