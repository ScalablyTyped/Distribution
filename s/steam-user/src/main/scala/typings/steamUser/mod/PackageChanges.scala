package typings.steamUser.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PackageChanges extends StObject {
  
  var change_number: Double
  
  var needs_token: Boolean
  
  var packageid: Double
}
object PackageChanges {
  
  inline def apply(change_number: Double, needs_token: Boolean, packageid: Double): PackageChanges = {
    val __obj = js.Dynamic.literal(change_number = change_number.asInstanceOf[js.Any], needs_token = needs_token.asInstanceOf[js.Any], packageid = packageid.asInstanceOf[js.Any])
    __obj.asInstanceOf[PackageChanges]
  }
  
  extension [Self <: PackageChanges](x: Self) {
    
    inline def setChange_number(value: Double): Self = StObject.set(x, "change_number", value.asInstanceOf[js.Any])
    
    inline def setNeeds_token(value: Boolean): Self = StObject.set(x, "needs_token", value.asInstanceOf[js.Any])
    
    inline def setPackageid(value: Double): Self = StObject.set(x, "packageid", value.asInstanceOf[js.Any])
  }
}
