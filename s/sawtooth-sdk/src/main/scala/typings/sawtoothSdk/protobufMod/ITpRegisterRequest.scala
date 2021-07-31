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
  
  @scala.inline
  def apply(): ITpRegisterRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ITpRegisterRequest]
  }
  
  @scala.inline
  implicit class ITpRegisterRequestMutableBuilder[Self <: ITpRegisterRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFamily(value: String): Self = StObject.set(x, "family", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFamilyNull: Self = StObject.set(x, "family", null)
    
    @scala.inline
    def setFamilyUndefined: Self = StObject.set(x, "family", js.undefined)
    
    @scala.inline
    def setMaxOccupancy(value: Double): Self = StObject.set(x, "maxOccupancy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxOccupancyNull: Self = StObject.set(x, "maxOccupancy", null)
    
    @scala.inline
    def setMaxOccupancyUndefined: Self = StObject.set(x, "maxOccupancy", js.undefined)
    
    @scala.inline
    def setNamespaces(value: js.Array[String]): Self = StObject.set(x, "namespaces", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNamespacesNull: Self = StObject.set(x, "namespaces", null)
    
    @scala.inline
    def setNamespacesUndefined: Self = StObject.set(x, "namespaces", js.undefined)
    
    @scala.inline
    def setNamespacesVarargs(value: String*): Self = StObject.set(x, "namespaces", js.Array(value :_*))
    
    @scala.inline
    def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVersionNull: Self = StObject.set(x, "version", null)
    
    @scala.inline
    def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
  }
}
