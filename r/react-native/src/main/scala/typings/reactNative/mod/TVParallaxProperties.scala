package typings.reactNative.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TVParallaxProperties extends StObject {
  
  /**
    * If true, parallax effects are enabled.  Defaults to true.
    */
  var enabled: js.UndefOr[Boolean] = js.native
  
  /**
    * Defaults to 1.0
    */
  var magnification: js.UndefOr[Double] = js.native
  
  /**
    * Defaults to 0.3
    */
  var pressDelay: js.UndefOr[Double] = js.native
  
  /**
    * Defaults to 0.3
    */
  var pressDuration: js.UndefOr[Double] = js.native
  
  /**
    * Defaults to 1.0
    */
  var pressMagnification: js.UndefOr[Double] = js.native
  
  /**
    * Defaults to 2.0.
    */
  var shiftDistanceX: js.UndefOr[Double] = js.native
  
  /**
    * Defaults to 2.0.
    */
  var shiftDistanceY: js.UndefOr[Double] = js.native
  
  /**
    * Defaults to 0.05.
    */
  var tiltAngle: js.UndefOr[Double] = js.native
}
object TVParallaxProperties {
  
  @scala.inline
  def apply(): TVParallaxProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TVParallaxProperties]
  }
  
  @scala.inline
  implicit class TVParallaxPropertiesMutableBuilder[Self <: TVParallaxProperties] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
    
    @scala.inline
    def setMagnification(value: Double): Self = StObject.set(x, "magnification", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMagnificationUndefined: Self = StObject.set(x, "magnification", js.undefined)
    
    @scala.inline
    def setPressDelay(value: Double): Self = StObject.set(x, "pressDelay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPressDelayUndefined: Self = StObject.set(x, "pressDelay", js.undefined)
    
    @scala.inline
    def setPressDuration(value: Double): Self = StObject.set(x, "pressDuration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPressDurationUndefined: Self = StObject.set(x, "pressDuration", js.undefined)
    
    @scala.inline
    def setPressMagnification(value: Double): Self = StObject.set(x, "pressMagnification", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPressMagnificationUndefined: Self = StObject.set(x, "pressMagnification", js.undefined)
    
    @scala.inline
    def setShiftDistanceX(value: Double): Self = StObject.set(x, "shiftDistanceX", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShiftDistanceXUndefined: Self = StObject.set(x, "shiftDistanceX", js.undefined)
    
    @scala.inline
    def setShiftDistanceY(value: Double): Self = StObject.set(x, "shiftDistanceY", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShiftDistanceYUndefined: Self = StObject.set(x, "shiftDistanceY", js.undefined)
    
    @scala.inline
    def setTiltAngle(value: Double): Self = StObject.set(x, "tiltAngle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTiltAngleUndefined: Self = StObject.set(x, "tiltAngle", js.undefined)
  }
}
