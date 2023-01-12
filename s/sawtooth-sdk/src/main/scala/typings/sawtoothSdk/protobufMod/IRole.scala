package typings.sawtoothSdk.protobufMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IRole extends StObject {
  
  /** Role name */
  var name: js.UndefOr[String | Null] = js.undefined
  
  /** Role policyName */
  var policyName: js.UndefOr[String | Null] = js.undefined
}
object IRole {
  
  inline def apply(): IRole = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IRole]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IRole] (val x: Self) extends AnyVal {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameNull: Self = StObject.set(x, "name", null)
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setPolicyName(value: String): Self = StObject.set(x, "policyName", value.asInstanceOf[js.Any])
    
    inline def setPolicyNameNull: Self = StObject.set(x, "policyName", null)
    
    inline def setPolicyNameUndefined: Self = StObject.set(x, "policyName", js.undefined)
  }
}
