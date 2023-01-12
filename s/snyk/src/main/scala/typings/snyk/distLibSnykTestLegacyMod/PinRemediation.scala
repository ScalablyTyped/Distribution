package typings.snyk.distLibSnykTestLegacyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PinRemediation
  extends StObject
     with UpgradeVulns {
  
  var isTransitive: Boolean
}
object PinRemediation {
  
  inline def apply(isTransitive: Boolean, upgradeTo: String, vulns: js.Array[String]): PinRemediation = {
    val __obj = js.Dynamic.literal(isTransitive = isTransitive.asInstanceOf[js.Any], upgradeTo = upgradeTo.asInstanceOf[js.Any], vulns = vulns.asInstanceOf[js.Any])
    __obj.asInstanceOf[PinRemediation]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PinRemediation] (val x: Self) extends AnyVal {
    
    inline def setIsTransitive(value: Boolean): Self = StObject.set(x, "isTransitive", value.asInstanceOf[js.Any])
  }
}
