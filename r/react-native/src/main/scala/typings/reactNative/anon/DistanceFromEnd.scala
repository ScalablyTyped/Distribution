package typings.reactNative.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DistanceFromEnd extends StObject {
  
  var distanceFromEnd: Double = js.native
}
object DistanceFromEnd {
  
  @scala.inline
  def apply(distanceFromEnd: Double): DistanceFromEnd = {
    val __obj = js.Dynamic.literal(distanceFromEnd = distanceFromEnd.asInstanceOf[js.Any])
    __obj.asInstanceOf[DistanceFromEnd]
  }
  
  @scala.inline
  implicit class DistanceFromEndMutableBuilder[Self <: DistanceFromEnd] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDistanceFromEnd(value: Double): Self = StObject.set(x, "distanceFromEnd", value.asInstanceOf[js.Any])
  }
}
