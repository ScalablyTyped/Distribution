package typings.steamUser.mod

import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ProductInfo extends StObject {
  
  var apps: Record[Double, AppInfo]
  
  var packages: Record[Double, PackageInfo]
  
  var unknownApps: js.Array[Double]
  
  var unknownPackages: js.Array[Double]
}
object ProductInfo {
  
  inline def apply(
    apps: Record[Double, AppInfo],
    packages: Record[Double, PackageInfo],
    unknownApps: js.Array[Double],
    unknownPackages: js.Array[Double]
  ): ProductInfo = {
    val __obj = js.Dynamic.literal(apps = apps.asInstanceOf[js.Any], packages = packages.asInstanceOf[js.Any], unknownApps = unknownApps.asInstanceOf[js.Any], unknownPackages = unknownPackages.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProductInfo]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ProductInfo] (val x: Self) extends AnyVal {
    
    inline def setApps(value: Record[Double, AppInfo]): Self = StObject.set(x, "apps", value.asInstanceOf[js.Any])
    
    inline def setPackages(value: Record[Double, PackageInfo]): Self = StObject.set(x, "packages", value.asInstanceOf[js.Any])
    
    inline def setUnknownApps(value: js.Array[Double]): Self = StObject.set(x, "unknownApps", value.asInstanceOf[js.Any])
    
    inline def setUnknownAppsVarargs(value: Double*): Self = StObject.set(x, "unknownApps", js.Array(value*))
    
    inline def setUnknownPackages(value: js.Array[Double]): Self = StObject.set(x, "unknownPackages", value.asInstanceOf[js.Any])
    
    inline def setUnknownPackagesVarargs(value: Double*): Self = StObject.set(x, "unknownPackages", js.Array(value*))
  }
}
