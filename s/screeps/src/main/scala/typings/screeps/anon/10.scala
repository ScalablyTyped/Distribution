package typings.screeps.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `10` extends StObject {
  
  var fatigue: typings.screeps.screepsNumbers.`3` = js.native
}
object `10` {
  
  @scala.inline
  def apply(fatigue: typings.screeps.screepsNumbers.`3`): `10` = {
    val __obj = js.Dynamic.literal(fatigue = fatigue.asInstanceOf[js.Any])
    __obj.asInstanceOf[`10`]
  }
  
  @scala.inline
  implicit class `10MutableBuilder`[Self <: `10`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFatigue(value: typings.screeps.screepsNumbers.`3`): Self = StObject.set(x, "fatigue", value.asInstanceOf[js.Any])
  }
}
