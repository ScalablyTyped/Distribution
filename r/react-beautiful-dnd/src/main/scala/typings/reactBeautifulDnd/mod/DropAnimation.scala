package typings.reactBeautifulDnd.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DropAnimation extends StObject {
  
  var curve: String
  
  var duration: Double
  
  var moveTo: Position
  
  var opacity: js.UndefOr[Double] = js.undefined
  
  var scale: js.UndefOr[Double] = js.undefined
}
object DropAnimation {
  
  @scala.inline
  def apply(curve: String, duration: Double, moveTo: Position): DropAnimation = {
    val __obj = js.Dynamic.literal(curve = curve.asInstanceOf[js.Any], duration = duration.asInstanceOf[js.Any], moveTo = moveTo.asInstanceOf[js.Any])
    __obj.asInstanceOf[DropAnimation]
  }
  
  @scala.inline
  implicit class DropAnimationMutableBuilder[Self <: DropAnimation] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCurve(value: String): Self = StObject.set(x, "curve", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDuration(value: Double): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMoveTo(value: Position): Self = StObject.set(x, "moveTo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOpacity(value: Double): Self = StObject.set(x, "opacity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOpacityUndefined: Self = StObject.set(x, "opacity", js.undefined)
    
    @scala.inline
    def setScale(value: Double): Self = StObject.set(x, "scale", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScaleUndefined: Self = StObject.set(x, "scale", js.undefined)
  }
}
