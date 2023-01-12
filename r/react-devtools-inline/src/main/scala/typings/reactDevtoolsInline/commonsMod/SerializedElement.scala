package typings.reactDevtoolsInline.commonsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SerializedElement extends StObject {
  
  var displayName: String | Null
  
  var hocDisplayNames: js.Array[String] | Null
  
  var id: Double
  
  var key: Double | String | Null
  
  var `type`: ElementType
}
object SerializedElement {
  
  inline def apply(id: Double, `type`: ElementType): SerializedElement = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], displayName = null, hocDisplayNames = null, key = null)
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[SerializedElement]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SerializedElement] (val x: Self) extends AnyVal {
    
    inline def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    inline def setDisplayNameNull: Self = StObject.set(x, "displayName", null)
    
    inline def setHocDisplayNames(value: js.Array[String]): Self = StObject.set(x, "hocDisplayNames", value.asInstanceOf[js.Any])
    
    inline def setHocDisplayNamesNull: Self = StObject.set(x, "hocDisplayNames", null)
    
    inline def setHocDisplayNamesVarargs(value: String*): Self = StObject.set(x, "hocDisplayNames", js.Array(value*))
    
    inline def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setKey(value: Double | String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    inline def setKeyNull: Self = StObject.set(x, "key", null)
    
    inline def setType(value: ElementType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
