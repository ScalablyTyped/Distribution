package typings.screeps.anon

import typings.screeps.screepsDoubles.`1.5`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpgradeController extends StObject {
  
  var upgradeController: `1.5`
}
object UpgradeController {
  
  inline def apply(): UpgradeController = {
    val __obj = js.Dynamic.literal(upgradeController = 1.5d)
    __obj.asInstanceOf[UpgradeController]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UpgradeController] (val x: Self) extends AnyVal {
    
    inline def setUpgradeController(value: `1.5`): Self = StObject.set(x, "upgradeController", value.asInstanceOf[js.Any])
  }
}
