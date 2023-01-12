package typings.reactNativeWindows.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DistanceFromEnd extends StObject {
  
  var distanceFromEnd: Double
}
object DistanceFromEnd {
  
  inline def apply(distanceFromEnd: Double): DistanceFromEnd = {
    val __obj = js.Dynamic.literal(distanceFromEnd = distanceFromEnd.asInstanceOf[js.Any])
    __obj.asInstanceOf[DistanceFromEnd]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DistanceFromEnd] (val x: Self) extends AnyVal {
    
    inline def setDistanceFromEnd(value: Double): Self = StObject.set(x, "distanceFromEnd", value.asInstanceOf[js.Any])
  }
}
