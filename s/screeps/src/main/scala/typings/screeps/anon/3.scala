package typings.screeps.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `3` extends StObject {
  
  var dismantle: typings.screeps.screepsInts.`4`
}
object `3` {
  
  inline def apply(): `3` = {
    val __obj = js.Dynamic.literal(dismantle = 4)
    __obj.asInstanceOf[`3`]
  }
  
  extension [Self <: `3`](x: Self) {
    
    inline def setDismantle(value: typings.screeps.screepsInts.`4`): Self = StObject.set(x, "dismantle", value.asInstanceOf[js.Any])
  }
}
