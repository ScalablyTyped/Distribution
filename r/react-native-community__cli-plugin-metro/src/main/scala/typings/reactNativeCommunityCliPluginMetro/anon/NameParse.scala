package typings.reactNativeCommunityCliPluginMetro.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NameParse extends StObject {
  
  var default: Unit
  
  var description: String
  
  var name: String
  
  def parse(`val`: String): String
}
object NameParse {
  
  inline def apply(default: Unit, description: String, name: String, parse: String => String): NameParse = {
    val __obj = js.Dynamic.literal(default = default.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], parse = js.Any.fromFunction1(parse))
    __obj.asInstanceOf[NameParse]
  }
  
  extension [Self <: NameParse](x: Self) {
    
    inline def setDefault(value: Unit): Self = StObject.set(x, "default", value.asInstanceOf[js.Any])
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setParse(value: String => String): Self = StObject.set(x, "parse", js.Any.fromFunction1(value))
  }
}
