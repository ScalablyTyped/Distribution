package typings.reactNative.mod

import typings.react.mod.ElementRef
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NativeMouseEvent
  extends StObject
     with NativeUIEvent {
  
  /**
    * Returns true if the alt key was down when the mouse event was fired.
    */
  val altKey: Boolean
  
  /**
    * The button number that was pressed (if applicable) when the mouse event was fired.
    */
  val button: Double
  
  /**
    * The buttons being depressed (if any) when the mouse event was fired.
    */
  val buttons: Double
  
  /**
    * The X coordinate of the mouse pointer in local (DOM content) coordinates.
    */
  val clientX: Double
  
  /**
    * The Y coordinate of the mouse pointer in local (DOM content) coordinates.
    */
  val clientY: Double
  
  /**
    * Returns true if the control key was down when the mouse event was fired.
    */
  val ctrlKey: Boolean
  
  /**
    * Returns true if the meta key was down when the mouse event was fired.
    */
  val metaKey: Boolean
  
  // offset is proposed: https://drafts.csswg.org/cssom-view/#extensions-to-the-mouseevent-interface
  /**
    * The X coordinate of the mouse pointer between that event and the padding edge of the target node
    */
  val offsetX: Double
  
  /**
    * The Y coordinate of the mouse pointer between that event and the padding edge of the target node
    */
  val offsetY: Double
  
  /**
    * The X coordinate of the mouse pointer relative to the whole document.
    */
  val pageX: Double
  
  /**
    * The Y coordinate of the mouse pointer relative to the whole document.
    */
  val pageY: Double
  
  /**
    * The secondary target for the event, if there is one.
    */
  val relatedTarget: Null | Double | ElementRef[HostComponent[Any]]
  
  /**
    * The X coordinate of the mouse pointer in global (screen) coordinates.
    */
  val screenX: Double
  
  /**
    * The Y coordinate of the mouse pointer in global (screen) coordinates.
    */
  val screenY: Double
  
  /**
    * Returns true if the shift key was down when the mouse event was fired.
    */
  val shiftKey: Boolean
  
  /**
    * Alias for NativeMouseEvent.clientX
    */
  val x: Double
  
  /**
    * Alias for NativeMouseEvent.clientY
    */
  val y: Double
}
object NativeMouseEvent {
  
  inline def apply(
    altKey: Boolean,
    button: Double,
    buttons: Double,
    clientX: Double,
    clientY: Double,
    ctrlKey: Boolean,
    detail: Double,
    metaKey: Boolean,
    offsetX: Double,
    offsetY: Double,
    pageX: Double,
    pageY: Double,
    screenX: Double,
    screenY: Double,
    shiftKey: Boolean,
    x: Double,
    y: Double
  ): NativeMouseEvent = {
    val __obj = js.Dynamic.literal(altKey = altKey.asInstanceOf[js.Any], button = button.asInstanceOf[js.Any], buttons = buttons.asInstanceOf[js.Any], clientX = clientX.asInstanceOf[js.Any], clientY = clientY.asInstanceOf[js.Any], ctrlKey = ctrlKey.asInstanceOf[js.Any], detail = detail.asInstanceOf[js.Any], metaKey = metaKey.asInstanceOf[js.Any], offsetX = offsetX.asInstanceOf[js.Any], offsetY = offsetY.asInstanceOf[js.Any], pageX = pageX.asInstanceOf[js.Any], pageY = pageY.asInstanceOf[js.Any], screenX = screenX.asInstanceOf[js.Any], screenY = screenY.asInstanceOf[js.Any], shiftKey = shiftKey.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any], relatedTarget = null)
    __obj.asInstanceOf[NativeMouseEvent]
  }
  
  extension [Self <: NativeMouseEvent](x: Self) {
    
    inline def setAltKey(value: Boolean): Self = StObject.set(x, "altKey", value.asInstanceOf[js.Any])
    
    inline def setButton(value: Double): Self = StObject.set(x, "button", value.asInstanceOf[js.Any])
    
    inline def setButtons(value: Double): Self = StObject.set(x, "buttons", value.asInstanceOf[js.Any])
    
    inline def setClientX(value: Double): Self = StObject.set(x, "clientX", value.asInstanceOf[js.Any])
    
    inline def setClientY(value: Double): Self = StObject.set(x, "clientY", value.asInstanceOf[js.Any])
    
    inline def setCtrlKey(value: Boolean): Self = StObject.set(x, "ctrlKey", value.asInstanceOf[js.Any])
    
    inline def setMetaKey(value: Boolean): Self = StObject.set(x, "metaKey", value.asInstanceOf[js.Any])
    
    inline def setOffsetX(value: Double): Self = StObject.set(x, "offsetX", value.asInstanceOf[js.Any])
    
    inline def setOffsetY(value: Double): Self = StObject.set(x, "offsetY", value.asInstanceOf[js.Any])
    
    inline def setPageX(value: Double): Self = StObject.set(x, "pageX", value.asInstanceOf[js.Any])
    
    inline def setPageY(value: Double): Self = StObject.set(x, "pageY", value.asInstanceOf[js.Any])
    
    inline def setRelatedTarget(value: Double | ElementRef[HostComponent[Any]]): Self = StObject.set(x, "relatedTarget", value.asInstanceOf[js.Any])
    
    inline def setRelatedTargetNull: Self = StObject.set(x, "relatedTarget", null)
    
    inline def setScreenX(value: Double): Self = StObject.set(x, "screenX", value.asInstanceOf[js.Any])
    
    inline def setScreenY(value: Double): Self = StObject.set(x, "screenY", value.asInstanceOf[js.Any])
    
    inline def setShiftKey(value: Boolean): Self = StObject.set(x, "shiftKey", value.asInstanceOf[js.Any])
    
    inline def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
    
    inline def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
  }
}
