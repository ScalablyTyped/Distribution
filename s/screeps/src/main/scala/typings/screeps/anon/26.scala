package typings.screeps.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `26` extends StObject {
  
  var upgradeController: typings.screeps.screepsInts.`2`
}
object `26` {
  
  inline def apply(): `26` = {
    val __obj = js.Dynamic.literal(upgradeController = 2)
    __obj.asInstanceOf[`26`]
  }
  
  extension [Self <: `26`](x: Self) {
    
    inline def setUpgradeController(value: typings.screeps.screepsInts.`2`): Self = StObject.set(x, "upgradeController", value.asInstanceOf[js.Any])
  }
}
