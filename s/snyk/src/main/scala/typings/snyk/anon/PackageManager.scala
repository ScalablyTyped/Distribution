package typings.snyk.anon

import typings.snyk.distLibPackageManagersMod.SupportedPackageManagers
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PackageManager extends StObject {
  
  var packageManager: js.UndefOr[SupportedPackageManagers] = js.undefined
}
object PackageManager {
  
  inline def apply(): PackageManager = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PackageManager]
  }
  
  extension [Self <: PackageManager](x: Self) {
    
    inline def setPackageManager(value: SupportedPackageManagers): Self = StObject.set(x, "packageManager", value.asInstanceOf[js.Any])
    
    inline def setPackageManagerUndefined: Self = StObject.set(x, "packageManager", js.undefined)
  }
}
