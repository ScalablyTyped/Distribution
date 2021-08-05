package typings.screeps.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `10` extends StObject {
  
  var fatigue: typings.screeps.screepsNumbers.`3`
}
object `10` {
  
  inline def apply(): `10` = {
    val __obj = js.Dynamic.literal(fatigue = 3)
    __obj.asInstanceOf[`10`]
  }
  
  extension [Self <: `10`](x: Self) {
    
    inline def setFatigue(value: typings.screeps.screepsNumbers.`3`): Self = StObject.set(x, "fatigue", value.asInstanceOf[js.Any])
  }
}
