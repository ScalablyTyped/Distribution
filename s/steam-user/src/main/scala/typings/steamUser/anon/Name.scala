package typings.steamUser.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Name extends StObject {
  
  var name: String
  
  var name_since: js.Date
}
object Name {
  
  inline def apply(name: String, name_since: js.Date): Name = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], name_since = name_since.asInstanceOf[js.Any])
    __obj.asInstanceOf[Name]
  }
  
  extension [Self <: Name](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setName_since(value: js.Date): Self = StObject.set(x, "name_since", value.asInstanceOf[js.Any])
  }
}
