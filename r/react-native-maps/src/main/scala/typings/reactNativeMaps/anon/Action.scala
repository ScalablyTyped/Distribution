package typings.reactNativeMaps.anon

import typings.reactNativeMaps.reactNativeMapsStrings.`callout-inside-press`
import typings.reactNativeMaps.reactNativeMapsStrings.`marker-inside-overlay-press`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Action extends StObject {
  
  /**
    * Apple Maps: `callout-inside-press`
    *
    * Google Maps: `marker-inside-overlay-press`
    */
  var action: `callout-inside-press` | `marker-inside-overlay-press`
  
  var frame: typings.reactNativeMaps.libSharedTypesMod.Frame
  
  var id: String
  
  var point: typings.reactNativeMaps.libSharedTypesMod.Point
}
object Action {
  
  inline def apply(
    action: `callout-inside-press` | `marker-inside-overlay-press`,
    frame: typings.reactNativeMaps.libSharedTypesMod.Frame,
    id: String,
    point: typings.reactNativeMaps.libSharedTypesMod.Point
  ): Action = {
    val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any], frame = frame.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], point = point.asInstanceOf[js.Any])
    __obj.asInstanceOf[Action]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Action] (val x: Self) extends AnyVal {
    
    inline def setAction(value: `callout-inside-press` | `marker-inside-overlay-press`): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
    
    inline def setFrame(value: typings.reactNativeMaps.libSharedTypesMod.Frame): Self = StObject.set(x, "frame", value.asInstanceOf[js.Any])
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setPoint(value: typings.reactNativeMaps.libSharedTypesMod.Point): Self = StObject.set(x, "point", value.asInstanceOf[js.Any])
  }
}
