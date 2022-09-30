package typings.screeps.anon

import typings.screeps.screepsDoubles.`1.8`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Repair extends StObject {
  
  var build: `1.8`
  
  var repair: `1.8`
}
object Repair {
  
  inline def apply(): Repair = {
    val __obj = js.Dynamic.literal(build = 1.8d, repair = 1.8d)
    __obj.asInstanceOf[Repair]
  }
  
  extension [Self <: Repair](x: Self) {
    
    inline def setBuild(value: `1.8`): Self = StObject.set(x, "build", value.asInstanceOf[js.Any])
    
    inline def setRepair(value: `1.8`): Self = StObject.set(x, "repair", value.asInstanceOf[js.Any])
  }
}
