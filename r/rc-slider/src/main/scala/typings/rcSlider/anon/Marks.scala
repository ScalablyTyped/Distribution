package typings.rcSlider.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Marks extends StObject {
  
  var marks: js.Any
  
  var max: js.Any
  
  var min: js.Any
  
  var step: js.Any
}
object Marks {
  
  @scala.inline
  def apply(marks: js.Any, max: js.Any, min: js.Any, step: js.Any): Marks = {
    val __obj = js.Dynamic.literal(marks = marks.asInstanceOf[js.Any], max = max.asInstanceOf[js.Any], min = min.asInstanceOf[js.Any], step = step.asInstanceOf[js.Any])
    __obj.asInstanceOf[Marks]
  }
  
  @scala.inline
  implicit class MarksMutableBuilder[Self <: Marks] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMarks(value: js.Any): Self = StObject.set(x, "marks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMax(value: js.Any): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMin(value: js.Any): Self = StObject.set(x, "min", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStep(value: js.Any): Self = StObject.set(x, "step", value.asInstanceOf[js.Any])
  }
}
