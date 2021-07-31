package typings.reactMapGl.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// https://developer.mozilla.org/en-US/docs/Web/API/PositionOptions
trait PositionOptions extends StObject {
  
  var enableHighAccuracy: js.UndefOr[Boolean] = js.undefined
  
  var maximumAge: Double
  
  var timeout: Double
}
object PositionOptions {
  
  @scala.inline
  def apply(maximumAge: Double, timeout: Double): PositionOptions = {
    val __obj = js.Dynamic.literal(maximumAge = maximumAge.asInstanceOf[js.Any], timeout = timeout.asInstanceOf[js.Any])
    __obj.asInstanceOf[PositionOptions]
  }
  
  @scala.inline
  implicit class PositionOptionsMutableBuilder[Self <: PositionOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEnableHighAccuracy(value: Boolean): Self = StObject.set(x, "enableHighAccuracy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnableHighAccuracyUndefined: Self = StObject.set(x, "enableHighAccuracy", js.undefined)
    
    @scala.inline
    def setMaximumAge(value: Double): Self = StObject.set(x, "maximumAge", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
  }
}
