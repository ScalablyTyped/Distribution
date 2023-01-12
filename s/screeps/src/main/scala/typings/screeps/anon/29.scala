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
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `29`] (val x: Self) extends AnyVal {
    
    inline def setCapacity(value: typings.screeps.screepsInts.`3`): Self = StObject.set(x, "capacity", value.asInstanceOf[js.Any])
  }
}
