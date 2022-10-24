package typings.reactTypesShared.srcEventsMod

import typings.reactTypesShared.reactTypesSharedStrings.movestart
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MoveStartEvent
  extends StObject
     with BaseMoveEvent
     with MoveEvent {
  
  /** The type of move event being fired. */
  var `type`: movestart
}
object MoveStartEvent {
  
  inline def apply(altKey: Boolean, ctrlKey: Boolean, metaKey: Boolean, pointerType: PointerType, shiftKey: Boolean): MoveStartEvent = {
    val __obj = js.Dynamic.literal(altKey = altKey.asInstanceOf[js.Any], ctrlKey = ctrlKey.asInstanceOf[js.Any], metaKey = metaKey.asInstanceOf[js.Any], pointerType = pointerType.asInstanceOf[js.Any], shiftKey = shiftKey.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("movestart")
    __obj.asInstanceOf[MoveStartEvent]
  }
  
  extension [Self <: MoveStartEvent](x: Self) {
    
    inline def setType(value: movestart): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
