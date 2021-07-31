package typings.reactNativeTabView.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SpringVelocityScale extends StObject {
  
  var springVelocityScale: Double
  
  var swipeVelocityImpact: Double
}
object SpringVelocityScale {
  
  @scala.inline
  def apply(springVelocityScale: Double, swipeVelocityImpact: Double): SpringVelocityScale = {
    val __obj = js.Dynamic.literal(springVelocityScale = springVelocityScale.asInstanceOf[js.Any], swipeVelocityImpact = swipeVelocityImpact.asInstanceOf[js.Any])
    __obj.asInstanceOf[SpringVelocityScale]
  }
  
  @scala.inline
  implicit class SpringVelocityScaleMutableBuilder[Self <: SpringVelocityScale] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSpringVelocityScale(value: Double): Self = StObject.set(x, "springVelocityScale", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSwipeVelocityImpact(value: Double): Self = StObject.set(x, "swipeVelocityImpact", value.asInstanceOf[js.Any])
  }
}
