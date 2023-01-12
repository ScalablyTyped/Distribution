package typings.reactTypesShared.srcEventsMod

import typings.reactTypesShared.reactTypesSharedStrings.moveend
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MoveEndEvent
  extends StObject
     with BaseMoveEvent
     with MoveEvent {
  
  /** The type of move event being fired. */
  var `type`: moveend
}
object MoveEndEvent {
  
  inline def apply(altKey: Boolean, ctrlKey: Boolean, metaKey: Boolean, pointerType: PointerType, shiftKey: Boolean): MoveEndEvent = {
    val __obj = js.Dynamic.literal(altKey = altKey.asInstanceOf[js.Any], ctrlKey = ctrlKey.asInstanceOf[js.Any], metaKey = metaKey.asInstanceOf[js.Any], pointerType = pointerType.asInstanceOf[js.Any], shiftKey = shiftKey.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("moveend")
    __obj.asInstanceOf[MoveEndEvent]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MoveEndEvent] (val x: Self) extends AnyVal {
    
    inline def setType(value: moveend): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
