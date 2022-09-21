package typings.steamUser.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ProductChanges extends StObject {
  
  var appChanges: AppChanges
  
  var currentChangenumber: Double
  
  var packageChanges: PackageChanges
}
object ProductChanges {
  
  inline def apply(appChanges: AppChanges, currentChangenumber: Double, packageChanges: PackageChanges): ProductChanges = {
    val __obj = js.Dynamic.literal(appChanges = appChanges.asInstanceOf[js.Any], currentChangenumber = currentChangenumber.asInstanceOf[js.Any], packageChanges = packageChanges.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProductChanges]
  }
  
  extension [Self <: ProductChanges](x: Self) {
    
    inline def setAppChanges(value: AppChanges): Self = StObject.set(x, "appChanges", value.asInstanceOf[js.Any])
    
    inline def setCurrentChangenumber(value: Double): Self = StObject.set(x, "currentChangenumber", value.asInstanceOf[js.Any])
    
    inline def setPackageChanges(value: PackageChanges): Self = StObject.set(x, "packageChanges", value.asInstanceOf[js.Any])
  }
}
