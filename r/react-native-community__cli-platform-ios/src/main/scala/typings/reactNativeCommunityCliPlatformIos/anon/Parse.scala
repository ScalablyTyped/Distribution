package typings.reactNativeCommunityCliPlatformIos.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Parse extends StObject {
  
  var default: Unit
  
  var description: String
  
  var name: String
  
  def parse(`val`: String): js.Array[String]
}
object Parse {
  
  inline def apply(default: Unit, description: String, name: String, parse: String => js.Array[String]): Parse = {
    val __obj = js.Dynamic.literal(default = default.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], parse = js.Any.fromFunction1(parse))
    __obj.asInstanceOf[Parse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Parse] (val x: Self) extends AnyVal {
    
    inline def setDefault(value: Unit): Self = StObject.set(x, "default", value.asInstanceOf[js.Any])
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setParse(value: String => js.Array[String]): Self = StObject.set(x, "parse", js.Any.fromFunction1(value))
  }
}
