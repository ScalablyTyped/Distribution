package typings.steamUser.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PackageInfo extends StObject {
  
  var changenumber: Double
  
  var missingToken: Boolean
  
  var packageinfo: Any
}
object PackageInfo {
  
  inline def apply(changenumber: Double, missingToken: Boolean, packageinfo: Any): PackageInfo = {
    val __obj = js.Dynamic.literal(changenumber = changenumber.asInstanceOf[js.Any], missingToken = missingToken.asInstanceOf[js.Any], packageinfo = packageinfo.asInstanceOf[js.Any])
    __obj.asInstanceOf[PackageInfo]
  }
  
  extension [Self <: PackageInfo](x: Self) {
    
    inline def setChangenumber(value: Double): Self = StObject.set(x, "changenumber", value.asInstanceOf[js.Any])
    
    inline def setMissingToken(value: Boolean): Self = StObject.set(x, "missingToken", value.asInstanceOf[js.Any])
    
    inline def setPackageinfo(value: Any): Self = StObject.set(x, "packageinfo", value.asInstanceOf[js.Any])
  }
}
