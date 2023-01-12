package typings.snyk.distLibSnykTestLegacyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Upgrade extends StObject {
  
  var upgradeTo: String
}
object Upgrade {
  
  inline def apply(upgradeTo: String): Upgrade = {
    val __obj = js.Dynamic.literal(upgradeTo = upgradeTo.asInstanceOf[js.Any])
    __obj.asInstanceOf[Upgrade]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Upgrade] (val x: Self) extends AnyVal {
    
    inline def setUpgradeTo(value: String): Self = StObject.set(x, "upgradeTo", value.asInstanceOf[js.Any])
  }
}
