package typings.screeps.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Capacity extends StObject {
  
  var capacity: typings.screeps.screepsInts.`2`
}
object Capacity {
  
  inline def apply(): Capacity = {
    val __obj = js.Dynamic.literal(capacity = 2)
    __obj.asInstanceOf[Capacity]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Capacity] (val x: Self) extends AnyVal {
    
    inline def setCapacity(value: typings.screeps.screepsInts.`2`): Self = StObject.set(x, "capacity", value.asInstanceOf[js.Any])
  }
}
