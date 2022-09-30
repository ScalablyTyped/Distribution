package typings.screeps.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `6` extends StObject {
  
  var attack: typings.screeps.screepsInts.`3`
}
object `6` {
  
  inline def apply(): `6` = {
    val __obj = js.Dynamic.literal(attack = 3)
    __obj.asInstanceOf[`6`]
  }
  
  extension [Self <: `6`](x: Self) {
    
    inline def setAttack(value: typings.screeps.screepsInts.`3`): Self = StObject.set(x, "attack", value.asInstanceOf[js.Any])
  }
}
