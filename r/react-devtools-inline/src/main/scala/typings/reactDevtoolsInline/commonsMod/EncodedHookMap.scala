package typings.reactDevtoolsInline.commonsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EncodedHookMap extends StObject {
  
  var mappings: String
  
  var names: js.Array[String]
}
object EncodedHookMap {
  
  inline def apply(mappings: String, names: js.Array[String]): EncodedHookMap = {
    val __obj = js.Dynamic.literal(mappings = mappings.asInstanceOf[js.Any], names = names.asInstanceOf[js.Any])
    __obj.asInstanceOf[EncodedHookMap]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: EncodedHookMap] (val x: Self) extends AnyVal {
    
    inline def setMappings(value: String): Self = StObject.set(x, "mappings", value.asInstanceOf[js.Any])
    
    inline def setNames(value: js.Array[String]): Self = StObject.set(x, "names", value.asInstanceOf[js.Any])
    
    inline def setNamesVarargs(value: String*): Self = StObject.set(x, "names", js.Array(value*))
  }
}
