package typings.screeps.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `21` extends StObject {
  
  var harvest: typings.screeps.screepsInts.`5`
}
object `21` {
  
  inline def apply(): `21` = {
    val __obj = js.Dynamic.literal(harvest = 5)
    __obj.asInstanceOf[`21`]
  }
  
  extension [Self <: `21`](x: Self) {
    
    inline def setHarvest(value: typings.screeps.screepsInts.`5`): Self = StObject.set(x, "harvest", value.asInstanceOf[js.Any])
  }
}
