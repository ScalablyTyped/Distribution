package typings.screeps.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `9` extends StObject {
  
  var capacity: typings.screeps.screepsNumbers.`4`
}
object `9` {
  
  inline def apply(): `9` = {
    val __obj = js.Dynamic.literal(capacity = 4)
    __obj.asInstanceOf[`9`]
  }
  
  extension [Self <: `9`](x: Self) {
    
    inline def setCapacity(value: typings.screeps.screepsNumbers.`4`): Self = StObject.set(x, "capacity", value.asInstanceOf[js.Any])
  }
}
