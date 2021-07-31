package typings.reactNativeCalendars.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DotMarking
  extends StObject
     with Marking {
  
  var activeOpacity: js.UndefOr[Double] = js.undefined
  
  var disableTouchEvent: js.UndefOr[Boolean] = js.undefined
  
  var disabled: js.UndefOr[Boolean] = js.undefined
  
  var dotColor: js.UndefOr[String] = js.undefined
  
  var marked: js.UndefOr[Boolean] = js.undefined
  
  var selected: js.UndefOr[Boolean] = js.undefined
  
  var selectedColor: js.UndefOr[String] = js.undefined
}
object DotMarking {
  
  @scala.inline
  def apply(): DotMarking = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DotMarking]
  }
  
  @scala.inline
  implicit class DotMarkingMutableBuilder[Self <: DotMarking] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setActiveOpacity(value: Double): Self = StObject.set(x, "activeOpacity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setActiveOpacityUndefined: Self = StObject.set(x, "activeOpacity", js.undefined)
    
    @scala.inline
    def setDisableTouchEvent(value: Boolean): Self = StObject.set(x, "disableTouchEvent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisableTouchEventUndefined: Self = StObject.set(x, "disableTouchEvent", js.undefined)
    
    @scala.inline
    def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
    
    @scala.inline
    def setDotColor(value: String): Self = StObject.set(x, "dotColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDotColorUndefined: Self = StObject.set(x, "dotColor", js.undefined)
    
    @scala.inline
    def setMarked(value: Boolean): Self = StObject.set(x, "marked", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMarkedUndefined: Self = StObject.set(x, "marked", js.undefined)
    
    @scala.inline
    def setSelected(value: Boolean): Self = StObject.set(x, "selected", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelectedColor(value: String): Self = StObject.set(x, "selectedColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelectedColorUndefined: Self = StObject.set(x, "selectedColor", js.undefined)
    
    @scala.inline
    def setSelectedUndefined: Self = StObject.set(x, "selected", js.undefined)
  }
}
