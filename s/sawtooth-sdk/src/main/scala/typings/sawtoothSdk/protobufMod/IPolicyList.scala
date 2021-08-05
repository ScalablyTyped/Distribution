package typings.sawtoothSdk.protobufMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IPolicyList extends StObject {
  
  /** PolicyList policies */
  var policies: js.UndefOr[js.Array[IPolicy] | Null] = js.undefined
}
object IPolicyList {
  
  inline def apply(): IPolicyList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IPolicyList]
  }
  
  extension [Self <: IPolicyList](x: Self) {
    
    inline def setPolicies(value: js.Array[IPolicy]): Self = StObject.set(x, "policies", value.asInstanceOf[js.Any])
    
    inline def setPoliciesNull: Self = StObject.set(x, "policies", null)
    
    inline def setPoliciesUndefined: Self = StObject.set(x, "policies", js.undefined)
    
    inline def setPoliciesVarargs(value: IPolicy*): Self = StObject.set(x, "policies", js.Array(value :_*))
  }
}
