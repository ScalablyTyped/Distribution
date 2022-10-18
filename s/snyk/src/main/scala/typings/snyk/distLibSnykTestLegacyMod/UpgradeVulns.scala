package typings.snyk.distLibSnykTestLegacyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpgradeVulns
  extends StObject
     with Upgrade {
  
  var vulns: js.Array[String]
}
object UpgradeVulns {
  
  inline def apply(upgradeTo: String, vulns: js.Array[String]): UpgradeVulns = {
    val __obj = js.Dynamic.literal(upgradeTo = upgradeTo.asInstanceOf[js.Any], vulns = vulns.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpgradeVulns]
  }
  
  extension [Self <: UpgradeVulns](x: Self) {
    
    inline def setVulns(value: js.Array[String]): Self = StObject.set(x, "vulns", value.asInstanceOf[js.Any])
    
    inline def setVulnsVarargs(value: String*): Self = StObject.set(x, "vulns", js.Array(value*))
  }
}
