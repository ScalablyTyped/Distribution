package typings.screeps.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `11` extends StObject {
  
  var fatigue: typings.screeps.screepsNumbers.`4` = js.native
}
object `11` {
  
  @scala.inline
  def apply(fatigue: typings.screeps.screepsNumbers.`4`): `11` = {
    val __obj = js.Dynamic.literal(fatigue = fatigue.asInstanceOf[js.Any])
    __obj.asInstanceOf[`11`]
  }
  
  @scala.inline
  implicit class `11MutableBuilder`[Self <: `11`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFatigue(value: typings.screeps.screepsNumbers.`4`): Self = StObject.set(x, "fatigue", value.asInstanceOf[js.Any])
  }
}
