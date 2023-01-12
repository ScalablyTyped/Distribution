package typings.screeps.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Fatigue extends StObject {
  
  var fatigue: typings.screeps.screepsInts.`2`
}
object Fatigue {
  
  inline def apply(): Fatigue = {
    val __obj = js.Dynamic.literal(fatigue = 2)
    __obj.asInstanceOf[Fatigue]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Fatigue] (val x: Self) extends AnyVal {
    
    inline def setFatigue(value: typings.screeps.screepsInts.`2`): Self = StObject.set(x, "fatigue", value.asInstanceOf[js.Any])
  }
}
