package typings.screeps.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Fatigue extends StObject {
  
  var fatigue: typings.screeps.screepsNumbers.`2` = js.native
}
object Fatigue {
  
  @scala.inline
  def apply(fatigue: typings.screeps.screepsNumbers.`2`): Fatigue = {
    val __obj = js.Dynamic.literal(fatigue = fatigue.asInstanceOf[js.Any])
    __obj.asInstanceOf[Fatigue]
  }
  
  @scala.inline
  implicit class FatigueMutableBuilder[Self <: Fatigue] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFatigue(value: typings.screeps.screepsNumbers.`2`): Self = StObject.set(x, "fatigue", value.asInstanceOf[js.Any])
  }
}
