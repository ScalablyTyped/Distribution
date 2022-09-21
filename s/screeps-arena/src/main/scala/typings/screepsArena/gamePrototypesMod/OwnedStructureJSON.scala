package typings.screepsArena.gamePrototypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OwnedStructureJSON
  extends StObject
     with StructureJSON {
  
  var my: js.UndefOr[Boolean] = js.undefined
}
object OwnedStructureJSON {
  
  inline def apply(hits: Double, hitsMax: Double, id: Double, x: Double, y: Double): OwnedStructureJSON = {
    val __obj = js.Dynamic.literal(hits = hits.asInstanceOf[js.Any], hitsMax = hitsMax.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.asInstanceOf[OwnedStructureJSON]
  }
  
  extension [Self <: OwnedStructureJSON](x: Self) {
    
    inline def setMy(value: Boolean): Self = StObject.set(x, "my", value.asInstanceOf[js.Any])
    
    inline def setMyUndefined: Self = StObject.set(x, "my", js.undefined)
  }
}
