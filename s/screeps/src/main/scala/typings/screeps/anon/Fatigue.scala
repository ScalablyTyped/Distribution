package typings.screeps.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Fatigue extends StObject {
  
  var fatigue: typings.screeps.screepsNumbers.`2`
}
object Fatigue {
  
  @scala.inline
  def apply(): Fatigue = {
    val __obj = js.Dynamic.literal(fatigue = 2)
    __obj.asInstanceOf[Fatigue]
  }
  
  @scala.inline
  implicit class FatigueMutableBuilder[Self <: Fatigue] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFatigue(value: typings.screeps.screepsNumbers.`2`): Self = StObject.set(x, "fatigue", value.asInstanceOf[js.Any])
  }
}
