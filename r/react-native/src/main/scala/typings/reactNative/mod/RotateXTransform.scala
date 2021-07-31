package typings.reactNative.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RotateXTransform extends StObject {
  
  var rotateX: String
}
object RotateXTransform {
  
  @scala.inline
  def apply(rotateX: String): RotateXTransform = {
    val __obj = js.Dynamic.literal(rotateX = rotateX.asInstanceOf[js.Any])
    __obj.asInstanceOf[RotateXTransform]
  }
  
  @scala.inline
  implicit class RotateXTransformMutableBuilder[Self <: RotateXTransform] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRotateX(value: String): Self = StObject.set(x, "rotateX", value.asInstanceOf[js.Any])
  }
}
