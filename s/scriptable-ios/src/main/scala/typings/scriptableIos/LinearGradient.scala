package typings.scriptableIos

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * _Linear gradient._
  * @see https://docs.scriptable.app/lineargradient/#-new-lineargradient
  */
trait LinearGradient extends StObject {
  
  /**
    * _Colors of the gradient._
    *
    * The array of colors should include the same amount of elements as the gradients `locations` property.
    * @see https://docs.scriptable.app/lineargradient/#colors
    */
  var colors: js.Array[Color]
  
  /**
    * _Point to end the gradient._
    *
    * The normalized ending point of the gradient. The `endPoint` and `startPoint` together controls the direction of the gradient. The X and Y component should each range from 0 to 1.
    * Defaults to (0, 1).
    * @see https://docs.scriptable.app/lineargradient/#endpoint
    */
  var endPoint: Point
  
  /**
    * _Locations of each color._
    *
    * Each location should be a value in the range of 0 to 1 and indicates the location of each color in the gradients `colors` array.
    *
    * The array of locations should include the same amount of elements as the gradients `colors` property.
    * @see https://docs.scriptable.app/lineargradient/#locations
    */
  var locations: js.Array[Double]
  
  /**
    * _Point to start the gradient._
    *
    * The normalized starting point of the gradient. The `endPoint` and `startPoint` together controls the direction of the gradient. The X and Y component should each range from 0 to 1.
    * Defaults to (0, 1).
    * @see https://docs.scriptable.app/lineargradient/#startpoint
    */
  var startPoint: Point
}
object LinearGradient {
  
  @scala.inline
  def apply(colors: js.Array[Color], endPoint: Point, locations: js.Array[Double], startPoint: Point): LinearGradient = {
    val __obj = js.Dynamic.literal(colors = colors.asInstanceOf[js.Any], endPoint = endPoint.asInstanceOf[js.Any], locations = locations.asInstanceOf[js.Any], startPoint = startPoint.asInstanceOf[js.Any])
    __obj.asInstanceOf[LinearGradient]
  }
  
  @scala.inline
  implicit class LinearGradientMutableBuilder[Self <: LinearGradient] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setColors(value: js.Array[Color]): Self = StObject.set(x, "colors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColorsVarargs(value: Color*): Self = StObject.set(x, "colors", js.Array(value :_*))
    
    @scala.inline
    def setEndPoint(value: Point): Self = StObject.set(x, "endPoint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocations(value: js.Array[Double]): Self = StObject.set(x, "locations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocationsVarargs(value: Double*): Self = StObject.set(x, "locations", js.Array(value :_*))
    
    @scala.inline
    def setStartPoint(value: Point): Self = StObject.set(x, "startPoint", value.asInstanceOf[js.Any])
  }
}
