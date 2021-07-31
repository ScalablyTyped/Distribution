package typings.reactMdForm.typesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SliderDragValues
  extends StObject
     with SliderStepParts {
  
  var clientX: Double
  
  var clientY: Double
  
  var height: Double
  
  var left: Double
  
  var reversed: Boolean
  
  var top: Double
  
  var vertical: Boolean
  
  var width: Double
}
object SliderDragValues {
  
  @scala.inline
  def apply(
    clientX: Double,
    clientY: Double,
    height: Double,
    left: Double,
    max: Double,
    min: Double,
    reversed: Boolean,
    step: Double,
    top: Double,
    vertical: Boolean,
    width: Double
  ): SliderDragValues = {
    val __obj = js.Dynamic.literal(clientX = clientX.asInstanceOf[js.Any], clientY = clientY.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], left = left.asInstanceOf[js.Any], max = max.asInstanceOf[js.Any], min = min.asInstanceOf[js.Any], reversed = reversed.asInstanceOf[js.Any], step = step.asInstanceOf[js.Any], top = top.asInstanceOf[js.Any], vertical = vertical.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.asInstanceOf[SliderDragValues]
  }
  
  @scala.inline
  implicit class SliderDragValuesMutableBuilder[Self <: SliderDragValues] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClientX(value: Double): Self = StObject.set(x, "clientX", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClientY(value: Double): Self = StObject.set(x, "clientY", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLeft(value: Double): Self = StObject.set(x, "left", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReversed(value: Boolean): Self = StObject.set(x, "reversed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTop(value: Double): Self = StObject.set(x, "top", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVertical(value: Boolean): Self = StObject.set(x, "vertical", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
  }
}
