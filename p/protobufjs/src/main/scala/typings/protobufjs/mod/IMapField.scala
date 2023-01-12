package typings.protobufjs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IMapField
  extends StObject
     with IField {
  
  /** Key type */
  var keyType: String
}
object IMapField {
  
  inline def apply(id: Double, keyType: String, `type`: String): IMapField = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], keyType = keyType.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[IMapField]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IMapField] (val x: Self) extends AnyVal {
    
    inline def setKeyType(value: String): Self = StObject.set(x, "keyType", value.asInstanceOf[js.Any])
  }
}
