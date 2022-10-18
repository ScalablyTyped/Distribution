package typings.screeps.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `29` extends StObject {
  
  var capacity: typings.screeps.screepsInts.`3`
}
object `29` {
  
  inline def apply(): `29` = {
    val __obj = js.Dynamic.literal(capacity = 3)
    __obj.asInstanceOf[`29`]
  }
  
  extension [Self <: `29`](x: Self) {
    
    inline def setCapacity(value: typings.screeps.screepsInts.`3`): Self = StObject.set(x, "capacity", value.asInstanceOf[js.Any])
  }
}
