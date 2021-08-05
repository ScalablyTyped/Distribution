package typings.sawtoothSdk.protobufMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ITpRegisterRequest extends StObject {
  
  /** TpRegisterRequest family */
  var family: js.UndefOr[String | Null] = js.undefined
  
  /** TpRegisterRequest maxOccupancy */
  var maxOccupancy: js.UndefOr[Double | Null] = js.undefined
  
  /** TpRegisterRequest namespaces */
  var namespaces: js.UndefOr[js.Array[String] | Null] = js.undefined
  
  /** TpRegisterRequest version */
  var version: js.UndefOr[String | Null] = js.undefined
}
object ITpRegisterRequest {
  
  inline def apply(): ITpRegisterRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ITpRegisterRequest]
  }
  
  extension [Self <: ITpRegisterRequest](x: Self) {
    
    inline def setFamily(value: String): Self = StObject.set(x, "family", value.asInstanceOf[js.Any])
    
    inline def setFamilyNull: Self = StObject.set(x, "family", null)
    
    inline def setFamilyUndefined: Self = StObject.set(x, "family", js.undefined)
    
    inline def setMaxOccupancy(value: Double): Self = StObject.set(x, "maxOccupancy", value.asInstanceOf[js.Any])
    
    inline def setMaxOccupancyNull: Self = StObject.set(x, "maxOccupancy", null)
    
    inline def setMaxOccupancyUndefined: Self = StObject.set(x, "maxOccupancy", js.undefined)
    
    inline def setNamespaces(value: js.Array[String]): Self = StObject.set(x, "namespaces", value.asInstanceOf[js.Any])
    
    inline def setNamespacesNull: Self = StObject.set(x, "namespaces", null)
    
    inline def setNamespacesUndefined: Self = StObject.set(x, "namespaces", js.undefined)
    
    inline def setNamespacesVarargs(value: String*): Self = StObject.set(x, "namespaces", js.Array(value :_*))
    
    inline def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    
    inline def setVersionNull: Self = StObject.set(x, "version", null)
    
    inline def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
  }
}
