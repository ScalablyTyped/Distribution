package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SVGAnimatedPoints extends StObject {
  
  val animatedPoints: SVGPointList
  
  val points: SVGPointList
}
object SVGAnimatedPoints {
  
  @scala.inline
  def apply(animatedPoints: SVGPointList, points: SVGPointList): SVGAnimatedPoints = {
    val __obj = js.Dynamic.literal(animatedPoints = animatedPoints.asInstanceOf[js.Any], points = points.asInstanceOf[js.Any])
    __obj.asInstanceOf[SVGAnimatedPoints]
  }
  
  @scala.inline
  implicit class SVGAnimatedPointsMutableBuilder[Self <: SVGAnimatedPoints] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAnimatedPoints(value: SVGPointList): Self = StObject.set(x, "animatedPoints", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPoints(value: SVGPointList): Self = StObject.set(x, "points", value.asInstanceOf[js.Any])
  }
}
