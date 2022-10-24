package typings.reactTypesShared.srcEventsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.reactTypesShared.srcEventsMod.MoveStartEvent
  - typings.reactTypesShared.srcEventsMod.MoveMoveEvent
  - typings.reactTypesShared.srcEventsMod.MoveEndEvent
*/
trait MoveEvent extends StObject
object MoveEvent {
  
  inline def MoveEndEvent(altKey: Boolean, ctrlKey: Boolean, metaKey: Boolean, pointerType: PointerType, shiftKey: Boolean): typings.reactTypesShared.srcEventsMod.MoveEndEvent = {
    val __obj = js.Dynamic.literal(altKey = altKey.asInstanceOf[js.Any], ctrlKey = ctrlKey.asInstanceOf[js.Any], metaKey = metaKey.asInstanceOf[js.Any], pointerType = pointerType.asInstanceOf[js.Any], shiftKey = shiftKey.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("moveend")
    __obj.asInstanceOf[typings.reactTypesShared.srcEventsMod.MoveEndEvent]
  }
  
  inline def MoveMoveEvent(
    altKey: Boolean,
    ctrlKey: Boolean,
    deltaX: Double,
    deltaY: Double,
    metaKey: Boolean,
    pointerType: PointerType,
    shiftKey: Boolean
  ): typings.reactTypesShared.srcEventsMod.MoveMoveEvent = {
    val __obj = js.Dynamic.literal(altKey = altKey.asInstanceOf[js.Any], ctrlKey = ctrlKey.asInstanceOf[js.Any], deltaX = deltaX.asInstanceOf[js.Any], deltaY = deltaY.asInstanceOf[js.Any], metaKey = metaKey.asInstanceOf[js.Any], pointerType = pointerType.asInstanceOf[js.Any], shiftKey = shiftKey.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("move")
    __obj.asInstanceOf[typings.reactTypesShared.srcEventsMod.MoveMoveEvent]
  }
  
  inline def MoveStartEvent(altKey: Boolean, ctrlKey: Boolean, metaKey: Boolean, pointerType: PointerType, shiftKey: Boolean): typings.reactTypesShared.srcEventsMod.MoveStartEvent = {
    val __obj = js.Dynamic.literal(altKey = altKey.asInstanceOf[js.Any], ctrlKey = ctrlKey.asInstanceOf[js.Any], metaKey = metaKey.asInstanceOf[js.Any], pointerType = pointerType.asInstanceOf[js.Any], shiftKey = shiftKey.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("movestart")
    __obj.asInstanceOf[typings.reactTypesShared.srcEventsMod.MoveStartEvent]
  }
}
