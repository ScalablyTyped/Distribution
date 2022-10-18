package typings.reactNativeCommunityCliPluginMetro.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Parse extends StObject {
  
  var default: Boolean
  
  var description: String
  
  var name: String
  
  def parse(`val`: String): Boolean
}
object Parse {
  
  inline def apply(default: Boolean, description: String, name: String, parse: String => Boolean): Parse = {
    val __obj = js.Dynamic.literal(default = default.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], parse = js.Any.fromFunction1(parse))
    __obj.asInstanceOf[Parse]
  }
  
  extension [Self <: Parse](x: Self) {
    
    inline def setDefault(value: Boolean): Self = StObject.set(x, "default", value.asInstanceOf[js.Any])
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setParse(value: String => Boolean): Self = StObject.set(x, "parse", js.Any.fromFunction1(value))
  }
}
