package typings.screeps.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `6` extends StObject {
  
  var attack: typings.screeps.screepsNumbers.`3` = js.native
}
object `6` {
  
  @scala.inline
  def apply(attack: typings.screeps.screepsNumbers.`3`): `6` = {
    val __obj = js.Dynamic.literal(attack = attack.asInstanceOf[js.Any])
    __obj.asInstanceOf[`6`]
  }
  
  @scala.inline
  implicit class `6MutableBuilder`[Self <: `6`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAttack(value: typings.screeps.screepsNumbers.`3`): Self = StObject.set(x, "attack", value.asInstanceOf[js.Any])
  }
}
