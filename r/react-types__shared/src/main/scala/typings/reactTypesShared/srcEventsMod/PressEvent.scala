package typings.reactTypesShared.srcEventsMod

import typings.reactTypesShared.reactTypesSharedStrings.press
import typings.reactTypesShared.reactTypesSharedStrings.pressend
import typings.reactTypesShared.reactTypesSharedStrings.pressstart
import typings.reactTypesShared.reactTypesSharedStrings.pressup
import typings.std.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PressEvent extends StObject {
  
  /** Whether the alt keyboard modifier was held during the press event. */
  var altKey: Boolean
  
  /** Whether the ctrl keyboard modifier was held during the press event. */
  var ctrlKey: Boolean
  
  /** Whether the meta keyboard modifier was held during the press event. */
  var metaKey: Boolean
  
  /** The pointer type that triggered the press event. */
  var pointerType: PointerType
  
  /** Whether the shift keyboard modifier was held during the press event. */
  var shiftKey: Boolean
  
  /** The target element of the press event. */
  var target: Element
  
  /** The type of press event being fired. */
  var `type`: pressstart | pressend | pressup | press
}
object PressEvent {
  
  inline def apply(
    altKey: Boolean,
    ctrlKey: Boolean,
    metaKey: Boolean,
    pointerType: PointerType,
    shiftKey: Boolean,
    target: Element,
    `type`: pressstart | pressend | pressup | press
  ): PressEvent = {
    val __obj = js.Dynamic.literal(altKey = altKey.asInstanceOf[js.Any], ctrlKey = ctrlKey.asInstanceOf[js.Any], metaKey = metaKey.asInstanceOf[js.Any], pointerType = pointerType.asInstanceOf[js.Any], shiftKey = shiftKey.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[PressEvent]
  }
  
  extension [Self <: PressEvent](x: Self) {
    
    inline def setAltKey(value: Boolean): Self = StObject.set(x, "altKey", value.asInstanceOf[js.Any])
    
    inline def setCtrlKey(value: Boolean): Self = StObject.set(x, "ctrlKey", value.asInstanceOf[js.Any])
    
    inline def setMetaKey(value: Boolean): Self = StObject.set(x, "metaKey", value.asInstanceOf[js.Any])
    
    inline def setPointerType(value: PointerType): Self = StObject.set(x, "pointerType", value.asInstanceOf[js.Any])
    
    inline def setShiftKey(value: Boolean): Self = StObject.set(x, "shiftKey", value.asInstanceOf[js.Any])
    
    inline def setTarget(value: Element): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
    
    inline def setType(value: pressstart | pressend | pressup | press): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
