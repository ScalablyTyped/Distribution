package typings.reactTypesShared.srcEventsMod

import typings.reactTypesShared.reactTypesSharedStrings.move
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MoveMoveEvent
  extends StObject
     with BaseMoveEvent
     with MoveEvent {
  
  /** The amount moved in the X direction since the last event. */
  var deltaX: Double
  
  /** The amount moved in the Y direction since the last event. */
  var deltaY: Double
  
  /** The type of move event being fired. */
  var `type`: move
}
object MoveMoveEvent {
  
  inline def apply(
    altKey: Boolean,
    ctrlKey: Boolean,
    deltaX: Double,
    deltaY: Double,
    metaKey: Boolean,
    pointerType: PointerType,
    shiftKey: Boolean
  ): MoveMoveEvent = {
    val __obj = js.Dynamic.literal(altKey = altKey.asInstanceOf[js.Any], ctrlKey = ctrlKey.asInstanceOf[js.Any], deltaX = deltaX.asInstanceOf[js.Any], deltaY = deltaY.asInstanceOf[js.Any], metaKey = metaKey.asInstanceOf[js.Any], pointerType = pointerType.asInstanceOf[js.Any], shiftKey = shiftKey.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("move")
    __obj.asInstanceOf[MoveMoveEvent]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MoveMoveEvent] (val x: Self) extends AnyVal {
    
    inline def setDeltaX(value: Double): Self = StObject.set(x, "deltaX", value.asInstanceOf[js.Any])
    
    inline def setDeltaY(value: Double): Self = StObject.set(x, "deltaY", value.asInstanceOf[js.Any])
    
    inline def setType(value: move): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
