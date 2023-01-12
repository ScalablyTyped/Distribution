package typings.reactTypesShared.srcEventsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ScrollEvent extends StObject {
  
  /** The amount moved in the X direction since the last event. */
  var deltaX: Double
  
  /** The amount moved in the Y direction since the last event. */
  var deltaY: Double
}
object ScrollEvent {
  
  inline def apply(deltaX: Double, deltaY: Double): ScrollEvent = {
    val __obj = js.Dynamic.literal(deltaX = deltaX.asInstanceOf[js.Any], deltaY = deltaY.asInstanceOf[js.Any])
    __obj.asInstanceOf[ScrollEvent]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ScrollEvent] (val x: Self) extends AnyVal {
    
    inline def setDeltaX(value: Double): Self = StObject.set(x, "deltaX", value.asInstanceOf[js.Any])
    
    inline def setDeltaY(value: Double): Self = StObject.set(x, "deltaY", value.asInstanceOf[js.Any])
  }
}
