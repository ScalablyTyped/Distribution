package typings.reactNative.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RotateTransform extends StObject {
  
  var rotate: String
}
object RotateTransform {
  
  @scala.inline
  def apply(rotate: String): RotateTransform = {
    val __obj = js.Dynamic.literal(rotate = rotate.asInstanceOf[js.Any])
    __obj.asInstanceOf[RotateTransform]
  }
  
  @scala.inline
  implicit class RotateTransformMutableBuilder[Self <: RotateTransform] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRotate(value: String): Self = StObject.set(x, "rotate", value.asInstanceOf[js.Any])
  }
}
