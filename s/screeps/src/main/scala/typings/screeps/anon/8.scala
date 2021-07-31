package typings.screeps.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `8` extends StObject {
  
  var capacity: typings.screeps.screepsNumbers.`3`
}
object `8` {
  
  @scala.inline
  def apply(): `8` = {
    val __obj = js.Dynamic.literal(capacity = 3)
    __obj.asInstanceOf[`8`]
  }
  
  @scala.inline
  implicit class `8MutableBuilder`[Self <: `8`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCapacity(value: typings.screeps.screepsNumbers.`3`): Self = StObject.set(x, "capacity", value.asInstanceOf[js.Any])
  }
}
