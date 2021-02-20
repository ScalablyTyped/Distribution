package typings.screeps.anon

import typings.screeps.screepsNumbers.`1.8`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `4` extends StObject {
  
  var upgradeController: `1.8` = js.native
}
object `4` {
  
  @scala.inline
  def apply(upgradeController: `1.8`): `4` = {
    val __obj = js.Dynamic.literal(upgradeController = upgradeController.asInstanceOf[js.Any])
    __obj.asInstanceOf[`4`]
  }
  
  @scala.inline
  implicit class `4MutableBuilder`[Self <: `4`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setUpgradeController(value: `1.8`): Self = StObject.set(x, "upgradeController", value.asInstanceOf[js.Any])
  }
}
