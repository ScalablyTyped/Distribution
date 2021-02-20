package typings.screeps.anon

import typings.screeps.screepsNumbers.`0.5`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `12` extends StObject {
  
  var damage: `0.5` = js.native
}
object `12` {
  
  @scala.inline
  def apply(damage: `0.5`): `12` = {
    val __obj = js.Dynamic.literal(damage = damage.asInstanceOf[js.Any])
    __obj.asInstanceOf[`12`]
  }
  
  @scala.inline
  implicit class `12MutableBuilder`[Self <: `12`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDamage(value: `0.5`): Self = StObject.set(x, "damage", value.asInstanceOf[js.Any])
  }
}
