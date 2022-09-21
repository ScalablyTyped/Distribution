package typings.steamUser.anon

import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Personas extends StObject {
  
  var personas: Record[String, Any]
}
object Personas {
  
  inline def apply(personas: Record[String, Any]): Personas = {
    val __obj = js.Dynamic.literal(personas = personas.asInstanceOf[js.Any])
    __obj.asInstanceOf[Personas]
  }
  
  extension [Self <: Personas](x: Self) {
    
    inline def setPersonas(value: Record[String, Any]): Self = StObject.set(x, "personas", value.asInstanceOf[js.Any])
  }
}
