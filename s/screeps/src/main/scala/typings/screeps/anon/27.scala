package typings.screeps.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `27` extends StObject {
  
  var attack: typings.screeps.screepsInts.`3`
}
object `27` {
  
  inline def apply(): `27` = {
    val __obj = js.Dynamic.literal(attack = 3)
    __obj.asInstanceOf[`27`]
  }
  
  extension [Self <: `27`](x: Self) {
    
    inline def setAttack(value: typings.screeps.screepsInts.`3`): Self = StObject.set(x, "attack", value.asInstanceOf[js.Any])
  }
}
