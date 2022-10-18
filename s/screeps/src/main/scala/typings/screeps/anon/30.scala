package typings.screeps.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `30` extends StObject {
  
  var capacity: typings.screeps.screepsInts.`4`
}
object `30` {
  
  inline def apply(): `30` = {
    val __obj = js.Dynamic.literal(capacity = 4)
    __obj.asInstanceOf[`30`]
  }
  
  extension [Self <: `30`](x: Self) {
    
    inline def setCapacity(value: typings.screeps.screepsInts.`4`): Self = StObject.set(x, "capacity", value.asInstanceOf[js.Any])
  }
}
