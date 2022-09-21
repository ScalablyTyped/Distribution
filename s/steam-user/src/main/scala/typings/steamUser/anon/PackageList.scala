package typings.steamUser.anon

import typings.std.Record
import typings.steamUser.mod.EPurchaseResult
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PackageList extends StObject {
  
  var packageList: Record[String, String]
  
  var purchaseResultDetails: EPurchaseResult
}
object PackageList {
  
  inline def apply(packageList: Record[String, String], purchaseResultDetails: EPurchaseResult): PackageList = {
    val __obj = js.Dynamic.literal(packageList = packageList.asInstanceOf[js.Any], purchaseResultDetails = purchaseResultDetails.asInstanceOf[js.Any])
    __obj.asInstanceOf[PackageList]
  }
  
  extension [Self <: PackageList](x: Self) {
    
    inline def setPackageList(value: Record[String, String]): Self = StObject.set(x, "packageList", value.asInstanceOf[js.Any])
    
    inline def setPurchaseResultDetails(value: EPurchaseResult): Self = StObject.set(x, "purchaseResultDetails", value.asInstanceOf[js.Any])
  }
}
