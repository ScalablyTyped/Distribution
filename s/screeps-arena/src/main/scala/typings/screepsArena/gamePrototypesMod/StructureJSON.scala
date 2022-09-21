package typings.screepsArena.gamePrototypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StructureJSON
  extends StObject
     with RoomObjectJSON {
  
  var hits: Double
  
  var hitsMax: Double
}
object StructureJSON {
  
  inline def apply(hits: Double, hitsMax: Double, id: Double, x: Double, y: Double): StructureJSON = {
    val __obj = js.Dynamic.literal(hits = hits.asInstanceOf[js.Any], hitsMax = hitsMax.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.asInstanceOf[StructureJSON]
  }
  
  extension [Self <: StructureJSON](x: Self) {
    
    inline def setHits(value: Double): Self = StObject.set(x, "hits", value.asInstanceOf[js.Any])
    
    inline def setHitsMax(value: Double): Self = StObject.set(x, "hitsMax", value.asInstanceOf[js.Any])
  }
}
