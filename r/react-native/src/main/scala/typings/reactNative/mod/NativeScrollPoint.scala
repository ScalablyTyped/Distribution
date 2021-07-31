package typings.reactNative.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NativeScrollPoint extends StObject {
  
  var x: Double
  
  var y: Double
}
object NativeScrollPoint {
  
  @scala.inline
  def apply(x: Double, y: Double): NativeScrollPoint = {
    val __obj = js.Dynamic.literal(x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.asInstanceOf[NativeScrollPoint]
  }
  
  @scala.inline
  implicit class NativeScrollPointMutableBuilder[Self <: NativeScrollPoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
  }
}
