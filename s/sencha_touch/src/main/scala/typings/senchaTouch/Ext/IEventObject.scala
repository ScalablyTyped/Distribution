package typings.senchaTouch.Ext

import typings.senchaTouch.Ext.event.IDom
import typings.senchaTouch.Ext.event.IEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IEventObject
  extends StObject
     with IBase
     with IDom {
  
  /** [Property] (Number) */
  var angle: js.UndefOr[Double] = js.undefined
  
  /** [Property] (Number) */
  var direction: js.UndefOr[Double] = js.undefined
  
  /** [Property] (Number) */
  var duration: js.UndefOr[Double] = js.undefined
  
  /** [Property] (Number) */
  var rotation: js.UndefOr[Double] = js.undefined
  
  /** [Property] (Number) */
  var scale: js.UndefOr[Double] = js.undefined
  
  /** [Method] Stop the event preventDefault and stopPropagation
    * @returns Ext.event.Event this
    */
  var stopEvent: js.UndefOr[js.Function0[IEvent]] = js.undefined
  
  /** [Method] Cancels bubbling of the event
    * @returns Ext.event.Event this
    */
  var stopPropagation: js.UndefOr[js.Function0[IEvent]] = js.undefined
}
object IEventObject {
  
  inline def apply(): IEventObject = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IEventObject]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IEventObject] (val x: Self) extends AnyVal {
    
    inline def setAngle(value: Double): Self = StObject.set(x, "angle", value.asInstanceOf[js.Any])
    
    inline def setAngleUndefined: Self = StObject.set(x, "angle", js.undefined)
    
    inline def setDirection(value: Double): Self = StObject.set(x, "direction", value.asInstanceOf[js.Any])
    
    inline def setDirectionUndefined: Self = StObject.set(x, "direction", js.undefined)
    
    inline def setDuration(value: Double): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
    
    inline def setDurationUndefined: Self = StObject.set(x, "duration", js.undefined)
    
    inline def setRotation(value: Double): Self = StObject.set(x, "rotation", value.asInstanceOf[js.Any])
    
    inline def setRotationUndefined: Self = StObject.set(x, "rotation", js.undefined)
    
    inline def setScale(value: Double): Self = StObject.set(x, "scale", value.asInstanceOf[js.Any])
    
    inline def setScaleUndefined: Self = StObject.set(x, "scale", js.undefined)
    
    inline def setStopEvent(value: () => IEvent): Self = StObject.set(x, "stopEvent", js.Any.fromFunction0(value))
    
    inline def setStopEventUndefined: Self = StObject.set(x, "stopEvent", js.undefined)
    
    inline def setStopPropagation(value: () => IEvent): Self = StObject.set(x, "stopPropagation", js.Any.fromFunction0(value))
    
    inline def setStopPropagationUndefined: Self = StObject.set(x, "stopPropagation", js.undefined)
  }
}
