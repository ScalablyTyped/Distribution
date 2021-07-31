package typings.reactNativeMaps.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CoordinateAccuracy extends StObject {
  
  var coordinate: Accuracy
}
object CoordinateAccuracy {
  
  @scala.inline
  def apply(coordinate: Accuracy): CoordinateAccuracy = {
    val __obj = js.Dynamic.literal(coordinate = coordinate.asInstanceOf[js.Any])
    __obj.asInstanceOf[CoordinateAccuracy]
  }
  
  @scala.inline
  implicit class CoordinateAccuracyMutableBuilder[Self <: CoordinateAccuracy] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCoordinate(value: Accuracy): Self = StObject.set(x, "coordinate", value.asInstanceOf[js.Any])
  }
}
