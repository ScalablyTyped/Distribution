package typings.screeps.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `0` extends StObject {
  
  var harvest: typings.screeps.screepsInts.`5`
}
object `0` {
  
  inline def apply(): `0` = {
    val __obj = js.Dynamic.literal(harvest = 5)
    __obj.asInstanceOf[`0`]
  }
  
  extension [Self <: `0`](x: Self) {
    
    inline def setHarvest(value: typings.screeps.screepsInts.`5`): Self = StObject.set(x, "harvest", value.asInstanceOf[js.Any])
  }
}
