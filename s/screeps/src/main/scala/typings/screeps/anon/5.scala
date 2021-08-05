package typings.screeps.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `5` extends StObject {
  
  var upgradeController: typings.screeps.screepsNumbers.`2`
}
object `5` {
  
  inline def apply(): `5` = {
    val __obj = js.Dynamic.literal(upgradeController = 2)
    __obj.asInstanceOf[`5`]
  }
  
  extension [Self <: `5`](x: Self) {
    
    inline def setUpgradeController(value: typings.screeps.screepsNumbers.`2`): Self = StObject.set(x, "upgradeController", value.asInstanceOf[js.Any])
  }
}
