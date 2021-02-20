package typings.reactNative.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NativeScrollVelocity extends StObject {
  
  var x: Double = js.native
  
  var y: Double = js.native
}
object NativeScrollVelocity {
  
  @scala.inline
  def apply(x: Double, y: Double): NativeScrollVelocity = {
    val __obj = js.Dynamic.literal(x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.asInstanceOf[NativeScrollVelocity]
  }
  
  @scala.inline
  implicit class NativeScrollVelocityMutableBuilder[Self <: NativeScrollVelocity] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
  }
}
