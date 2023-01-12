package typings.screeps.anon

import typings.screeps.screepsDoubles.`1.8`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `25` extends StObject {
  
  var upgradeController: `1.8`
}
object `25` {
  
  inline def apply(): `25` = {
    val __obj = js.Dynamic.literal(upgradeController = 1.8d)
    __obj.asInstanceOf[`25`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `25`] (val x: Self) extends AnyVal {
    
    inline def setUpgradeController(value: `1.8`): Self = StObject.set(x, "upgradeController", value.asInstanceOf[js.Any])
  }
}
