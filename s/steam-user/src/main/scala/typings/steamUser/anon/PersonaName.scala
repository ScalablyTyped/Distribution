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
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PersonaName] (val x: Self) extends AnyVal {
    
    inline def setPersonaName(value: String): Self = StObject.set(x, "personaName", value.asInstanceOf[js.Any])
  }
}
