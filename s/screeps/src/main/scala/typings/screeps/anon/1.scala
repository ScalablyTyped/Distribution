package typings.screeps.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `1` extends StObject {
  
  var harvest: typings.screeps.screepsInts.`7`
}
object `1` {
  
  inline def apply(): `1` = {
    val __obj = js.Dynamic.literal(harvest = 7)
    __obj.asInstanceOf[`1`]
  }
  
  extension [Self <: `1`](x: Self) {
    
    inline def setHarvest(value: typings.screeps.screepsInts.`7`): Self = StObject.set(x, "harvest", value.asInstanceOf[js.Any])
  }
}
