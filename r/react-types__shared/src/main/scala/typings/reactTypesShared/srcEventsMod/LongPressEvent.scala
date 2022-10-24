package typings.reactTypesShared.srcEventsMod

import typings.reactTypesShared.reactTypesSharedStrings.longpress
import typings.reactTypesShared.reactTypesSharedStrings.longpressend
import typings.reactTypesShared.reactTypesSharedStrings.longpressstart
import typings.std.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined parent std.Omit<@react-types/shared.@react-types/shared/src/events.PressEvent, 'type'> */
trait LongPressEvent extends StObject {
  
  var altKey: Boolean
  
  var ctrlKey: Boolean
  
  var metaKey: Boolean
  
  var pointerType: PointerType
  
  var shiftKey: Boolean
  
  var target: Element
  
  /** The type of long press event being fired. */
  var `type`: longpressstart | longpressend | longpress
}
object LongPressEvent {
  
  inline def apply(
    altKey: Boolean,
    ctrlKey: Boolean,
    metaKey: Boolean,
    pointerType: PointerType,
    shiftKey: Boolean,
    target: Element,
    `type`: longpressstart | longpressend | longpress
  ): LongPressEvent = {
    val __obj = js.Dynamic.literal(altKey = altKey.asInstanceOf[js.Any], ctrlKey = ctrlKey.asInstanceOf[js.Any], metaKey = metaKey.asInstanceOf[js.Any], pointerType = pointerType.asInstanceOf[js.Any], shiftKey = shiftKey.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[LongPressEvent]
  }
  
  extension [Self <: LongPressEvent](x: Self) {
    
    inline def setAltKey(value: Boolean): Self = StObject.set(x, "altKey", value.asInstanceOf[js.Any])
    
    inline def setCtrlKey(value: Boolean): Self = StObject.set(x, "ctrlKey", value.asInstanceOf[js.Any])
    
    inline def setMetaKey(value: Boolean): Self = StObject.set(x, "metaKey", value.asInstanceOf[js.Any])
    
    inline def setPointerType(value: PointerType): Self = StObject.set(x, "pointerType", value.asInstanceOf[js.Any])
    
    inline def setShiftKey(value: Boolean): Self = StObject.set(x, "shiftKey", value.asInstanceOf[js.Any])
    
    inline def setTarget(value: Element): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
    
    inline def setType(value: longpressstart | longpressend | longpress): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
