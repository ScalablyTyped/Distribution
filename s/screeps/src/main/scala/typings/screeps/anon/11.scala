package typings.screeps.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `11` extends StObject {
  
  var fatigue: typings.screeps.screepsNumbers.`4`
}
object `11` {
  
  inline def apply(): `11` = {
    val __obj = js.Dynamic.literal(fatigue = 4)
    __obj.asInstanceOf[`11`]
  }
  
  extension [Self <: `11`](x: Self) {
    
    inline def setFatigue(value: typings.screeps.screepsNumbers.`4`): Self = StObject.set(x, "fatigue", value.asInstanceOf[js.Any])
  }
}
