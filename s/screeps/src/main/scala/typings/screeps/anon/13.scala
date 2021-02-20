package typings.screeps.anon

import typings.screeps.screepsNumbers.`0.3`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `13` extends StObject {
  
  var damage: `0.3` = js.native
}
object `13` {
  
  @scala.inline
  def apply(damage: `0.3`): `13` = {
    val __obj = js.Dynamic.literal(damage = damage.asInstanceOf[js.Any])
    __obj.asInstanceOf[`13`]
  }
  
  @scala.inline
  implicit class `13MutableBuilder`[Self <: `13`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDamage(value: `0.3`): Self = StObject.set(x, "damage", value.asInstanceOf[js.Any])
  }
}
