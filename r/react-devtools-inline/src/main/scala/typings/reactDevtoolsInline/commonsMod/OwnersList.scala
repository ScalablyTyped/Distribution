package typings.reactDevtoolsInline.commonsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OwnersList extends StObject {
  
  var id: Double
  
  var owners: js.Array[SerializedElement] | Null
}
object OwnersList {
  
  inline def apply(id: Double): OwnersList = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], owners = null)
    __obj.asInstanceOf[OwnersList]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: OwnersList] (val x: Self) extends AnyVal {
    
    inline def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setOwners(value: js.Array[SerializedElement]): Self = StObject.set(x, "owners", value.asInstanceOf[js.Any])
    
    inline def setOwnersNull: Self = StObject.set(x, "owners", null)
    
    inline def setOwnersVarargs(value: SerializedElement*): Self = StObject.set(x, "owners", js.Array(value*))
  }
}
