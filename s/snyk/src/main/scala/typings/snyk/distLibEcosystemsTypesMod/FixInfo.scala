package typings.snyk.distLibEcosystemsTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FixInfo extends StObject {
  
  var isPatchable: Boolean
  
  var nearestFixedInVersion: js.UndefOr[String] = js.undefined
  
  var upgradePaths: js.Array[UpgradePath]
}
object FixInfo {
  
  inline def apply(isPatchable: Boolean, upgradePaths: js.Array[UpgradePath]): FixInfo = {
    val __obj = js.Dynamic.literal(isPatchable = isPatchable.asInstanceOf[js.Any], upgradePaths = upgradePaths.asInstanceOf[js.Any])
    __obj.asInstanceOf[FixInfo]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: FixInfo] (val x: Self) extends AnyVal {
    
    inline def setIsPatchable(value: Boolean): Self = StObject.set(x, "isPatchable", value.asInstanceOf[js.Any])
    
    inline def setNearestFixedInVersion(value: String): Self = StObject.set(x, "nearestFixedInVersion", value.asInstanceOf[js.Any])
    
    inline def setNearestFixedInVersionUndefined: Self = StObject.set(x, "nearestFixedInVersion", js.undefined)
    
    inline def setUpgradePaths(value: js.Array[UpgradePath]): Self = StObject.set(x, "upgradePaths", value.asInstanceOf[js.Any])
    
    inline def setUpgradePathsVarargs(value: UpgradePath*): Self = StObject.set(x, "upgradePaths", js.Array(value*))
  }
}
