package typings.sketchapp

import typings.sketchapp.anon.X
import typings.sketchapp.sketchappStrings.gradient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SketchMSGradient extends js.Object {
  
  var _class: gradient = js.native
  
  var elipseLength: Double = js.native
  
  var from: X = js.native
  
  var gradientType: Double = js.native
  
  var shouldSmoothenOpacity: Boolean = js.native
  
  var stops: js.Array[SketchMSGradientStop] = js.native
  
  var to: X = js.native
}
object SketchMSGradient {
  
  @scala.inline
  def apply(
    _class: gradient,
    elipseLength: Double,
    from: X,
    gradientType: Double,
    shouldSmoothenOpacity: Boolean,
    stops: js.Array[SketchMSGradientStop],
    to: X
  ): SketchMSGradient = {
    val __obj = js.Dynamic.literal(_class = _class.asInstanceOf[js.Any], elipseLength = elipseLength.asInstanceOf[js.Any], from = from.asInstanceOf[js.Any], gradientType = gradientType.asInstanceOf[js.Any], shouldSmoothenOpacity = shouldSmoothenOpacity.asInstanceOf[js.Any], stops = stops.asInstanceOf[js.Any], to = to.asInstanceOf[js.Any])
    __obj.asInstanceOf[SketchMSGradient]
  }
  
  @scala.inline
  implicit class SketchMSGradientOps[Self <: SketchMSGradient] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def set_class(value: gradient): Self = this.set("_class", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setElipseLength(value: Double): Self = this.set("elipseLength", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFrom(value: X): Self = this.set("from", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGradientType(value: Double): Self = this.set("gradientType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShouldSmoothenOpacity(value: Boolean): Self = this.set("shouldSmoothenOpacity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStopsVarargs(value: SketchMSGradientStop*): Self = this.set("stops", js.Array(value :_*))
    
    @scala.inline
    def setStops(value: js.Array[SketchMSGradientStop]): Self = this.set("stops", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTo(value: X): Self = this.set("to", value.asInstanceOf[js.Any])
  }
}
