package typings.reactTypesShared.srcEventsMod

import typings.reactTypesShared.reactTypesSharedStrings.hoverend
import typings.reactTypesShared.reactTypesSharedStrings.hoverstart
import typings.reactTypesShared.reactTypesSharedStrings.mouse
import typings.reactTypesShared.reactTypesSharedStrings.pen
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HoverEvent extends StObject {
  
  /** The pointer type that triggered the hover event. */
  var pointerType: mouse | pen
  
  /** The target element of the hover event. */
  var target: HTMLElement
  
  /** The type of hover event being fired. */
  var `type`: hoverstart | hoverend
}
object HoverEvent {
  
  inline def apply(pointerType: mouse | pen, target: HTMLElement, `type`: hoverstart | hoverend): HoverEvent = {
    val __obj = js.Dynamic.literal(pointerType = pointerType.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[HoverEvent]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: HoverEvent] (val x: Self) extends AnyVal {
    
    inline def setPointerType(value: mouse | pen): Self = StObject.set(x, "pointerType", value.asInstanceOf[js.Any])
    
    inline def setTarget(value: HTMLElement): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
    
    inline def setType(value: hoverstart | hoverend): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
