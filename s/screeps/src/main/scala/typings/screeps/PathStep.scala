package typings.screeps

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PathStep extends StObject {
  
  var direction: DirectionConstant = js.native
  
  var dx: Double = js.native
  
  var dy: Double = js.native
  
  var x: Double = js.native
  
  var y: Double = js.native
}
object PathStep {
  
  @scala.inline
  def apply(direction: DirectionConstant, dx: Double, dy: Double, x: Double, y: Double): PathStep = {
    val __obj = js.Dynamic.literal(direction = direction.asInstanceOf[js.Any], dx = dx.asInstanceOf[js.Any], dy = dy.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.asInstanceOf[PathStep]
  }
  
  @scala.inline
  implicit class PathStepMutableBuilder[Self <: PathStep] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDirection(value: DirectionConstant): Self = StObject.set(x, "direction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDx(value: Double): Self = StObject.set(x, "dx", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDy(value: Double): Self = StObject.set(x, "dy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
  }
}
