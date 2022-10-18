package typings.screeps.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `32` extends StObject {
  
  var fatigue: typings.screeps.screepsInts.`4`
}
object `32` {
  
  inline def apply(): `32` = {
    val __obj = js.Dynamic.literal(fatigue = 4)
    __obj.asInstanceOf[`32`]
  }
  
  extension [Self <: `32`](x: Self) {
    
    inline def setFatigue(value: typings.screeps.screepsInts.`4`): Self = StObject.set(x, "fatigue", value.asInstanceOf[js.Any])
  }
}
