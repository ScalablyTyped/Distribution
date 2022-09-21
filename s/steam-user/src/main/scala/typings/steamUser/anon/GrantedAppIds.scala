package typings.steamUser.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GrantedAppIds extends StObject {
  
  var grantedAppIds: js.Array[Double]
  
  var grantedPackageIds: js.Array[Double]
}
object GrantedAppIds {
  
  inline def apply(grantedAppIds: js.Array[Double], grantedPackageIds: js.Array[Double]): GrantedAppIds = {
    val __obj = js.Dynamic.literal(grantedAppIds = grantedAppIds.asInstanceOf[js.Any], grantedPackageIds = grantedPackageIds.asInstanceOf[js.Any])
    __obj.asInstanceOf[GrantedAppIds]
  }
  
  extension [Self <: GrantedAppIds](x: Self) {
    
    inline def setGrantedAppIds(value: js.Array[Double]): Self = StObject.set(x, "grantedAppIds", value.asInstanceOf[js.Any])
    
    inline def setGrantedAppIdsVarargs(value: Double*): Self = StObject.set(x, "grantedAppIds", js.Array(value*))
    
    inline def setGrantedPackageIds(value: js.Array[Double]): Self = StObject.set(x, "grantedPackageIds", value.asInstanceOf[js.Any])
    
    inline def setGrantedPackageIdsVarargs(value: Double*): Self = StObject.set(x, "grantedPackageIds", js.Array(value*))
  }
}
