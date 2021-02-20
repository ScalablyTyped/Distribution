package typings.senchaTouch.Ext

import typings.senchaTouch.Ext.event.IDom
import typings.senchaTouch.Ext.event.IEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IEventObject
  extends IBase
     with IDom {
  
  /** [Property] (Number) */
  var angle: js.UndefOr[Double] = js.native
  
  /** [Property] (Number) */
  var direction: js.UndefOr[Double] = js.native
  
  /** [Property] (Number) */
  var duration: js.UndefOr[Double] = js.native
  
  /** [Property] (Number) */
  var rotation: js.UndefOr[Double] = js.native
  
  /** [Property] (Number) */
  var scale: js.UndefOr[Double] = js.native
  
  /** [Method] Stop the event preventDefault and stopPropagation
    * @returns Ext.event.Event this
    */
  var stopEvent: js.UndefOr[js.Function0[IEvent]] = js.native
  
  /** [Method] Cancels bubbling of the event
    * @returns Ext.event.Event this
    */
  var stopPropagation: js.UndefOr[js.Function0[IEvent]] = js.native
}
object IEventObject {
  
  @scala.inline
  def apply(): IEventObject = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IEventObject]
  }
  
  @scala.inline
  implicit class IEventObjectMutableBuilder[Self <: IEventObject] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAngle(value: Double): Self = StObject.set(x, "angle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAngleUndefined: Self = StObject.set(x, "angle", js.undefined)
    
    @scala.inline
    def setDirection(value: Double): Self = StObject.set(x, "direction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDirectionUndefined: Self = StObject.set(x, "direction", js.undefined)
    
    @scala.inline
    def setDuration(value: Double): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDurationUndefined: Self = StObject.set(x, "duration", js.undefined)
    
    @scala.inline
    def setRotation(value: Double): Self = StObject.set(x, "rotation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRotationUndefined: Self = StObject.set(x, "rotation", js.undefined)
    
    @scala.inline
    def setScale(value: Double): Self = StObject.set(x, "scale", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScaleUndefined: Self = StObject.set(x, "scale", js.undefined)
    
    @scala.inline
    def setStopEvent(value: () => IEvent): Self = StObject.set(x, "stopEvent", js.Any.fromFunction0(value))
    
    @scala.inline
    def setStopEventUndefined: Self = StObject.set(x, "stopEvent", js.undefined)
    
    @scala.inline
    def setStopPropagation(value: () => IEvent): Self = StObject.set(x, "stopPropagation", js.Any.fromFunction0(value))
    
    @scala.inline
    def setStopPropagationUndefined: Self = StObject.set(x, "stopPropagation", js.undefined)
  }
}
