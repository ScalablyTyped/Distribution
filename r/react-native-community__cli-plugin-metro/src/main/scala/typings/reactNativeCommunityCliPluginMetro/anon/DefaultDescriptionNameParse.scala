package typings.reactNativeCommunityCliPluginMetro.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DefaultDescriptionNameParse extends StObject {
  
  var default: String
  
  var description: Unit
  
  var name: String
  
  var parse: Unit
}
object DefaultDescriptionNameParse {
  
  inline def apply(default: String, description: Unit, name: String, parse: Unit): DefaultDescriptionNameParse = {
    val __obj = js.Dynamic.literal(default = default.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], parse = parse.asInstanceOf[js.Any])
    __obj.asInstanceOf[DefaultDescriptionNameParse]
  }
  
  extension [Self <: DefaultDescriptionNameParse](x: Self) {
    
    inline def setDefault(value: String): Self = StObject.set(x, "default", value.asInstanceOf[js.Any])
    
    inline def setDescription(value: Unit): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setParse(value: Unit): Self = StObject.set(x, "parse", value.asInstanceOf[js.Any])
  }
}
