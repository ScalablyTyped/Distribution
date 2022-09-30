package typings.screeps.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Harvest extends StObject {
  
  var harvest: typings.screeps.screepsInts.`3`
}
object Harvest {
  
  inline def apply(): Harvest = {
    val __obj = js.Dynamic.literal(harvest = 3)
    __obj.asInstanceOf[Harvest]
  }
  
  extension [Self <: Harvest](x: Self) {
    
    inline def setHarvest(value: typings.screeps.screepsInts.`3`): Self = StObject.set(x, "harvest", value.asInstanceOf[js.Any])
  }
}
