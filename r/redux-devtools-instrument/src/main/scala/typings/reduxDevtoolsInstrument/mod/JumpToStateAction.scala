package typings.reduxDevtoolsInstrument.mod

import typings.reduxDevtoolsInstrument.reduxDevtoolsInstrumentStrings.JUMP_TO_STATE
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait JumpToStateAction
  extends StObject
     with LiftedAction[Any, Any, Any] {
  
  var index: Double
  
  var `type`: JUMP_TO_STATE
}
object JumpToStateAction {
  
  inline def apply(index: Double): JumpToStateAction = {
    val __obj = js.Dynamic.literal(index = index.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("JUMP_TO_STATE")
    __obj.asInstanceOf[JumpToStateAction]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: JumpToStateAction] (val x: Self) extends AnyVal {
    
    inline def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
    
    inline def setType(value: JUMP_TO_STATE): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
