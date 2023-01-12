package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SVGAnimatedPoints extends StObject {
  
  /* standard dom */
  val animatedPoints: SVGPointList
  
  /* standard dom */
  val points: SVGPointList
}
object SVGAnimatedPoints {
  
  inline def apply(animatedPoints: SVGPointList, points: SVGPointList): SVGAnimatedPoints = {
    val __obj = js.Dynamic.literal(animatedPoints = animatedPoints.asInstanceOf[js.Any], points = points.asInstanceOf[js.Any])
    __obj.asInstanceOf[SVGAnimatedPoints]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SVGAnimatedPoints] (val x: Self) extends AnyVal {
    
    inline def setAnimatedPoints(value: SVGPointList): Self = StObject.set(x, "animatedPoints", value.asInstanceOf[js.Any])
    
    inline def setPoints(value: SVGPointList): Self = StObject.set(x, "points", value.asInstanceOf[js.Any])
  }
}
