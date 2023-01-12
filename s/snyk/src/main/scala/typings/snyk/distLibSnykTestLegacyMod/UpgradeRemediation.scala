package typings.snyk.distLibSnykTestLegacyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpgradeRemediation
  extends StObject
     with UpgradeVulns {
  
  var upgrades: js.Array[String]
}
object UpgradeRemediation {
  
  inline def apply(upgradeTo: String, upgrades: js.Array[String], vulns: js.Array[String]): UpgradeRemediation = {
    val __obj = js.Dynamic.literal(upgradeTo = upgradeTo.asInstanceOf[js.Any], upgrades = upgrades.asInstanceOf[js.Any], vulns = vulns.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpgradeRemediation]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UpgradeRemediation] (val x: Self) extends AnyVal {
    
    inline def setUpgrades(value: js.Array[String]): Self = StObject.set(x, "upgrades", value.asInstanceOf[js.Any])
    
    inline def setUpgradesVarargs(value: String*): Self = StObject.set(x, "upgrades", js.Array(value*))
  }
}
