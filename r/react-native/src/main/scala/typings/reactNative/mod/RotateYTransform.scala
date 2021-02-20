package typings.reactNative.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RotateYTransform extends StObject {
  
  var rotateY: String = js.native
}
object RotateYTransform {
  
  @scala.inline
  def apply(rotateY: String): RotateYTransform = {
    val __obj = js.Dynamic.literal(rotateY = rotateY.asInstanceOf[js.Any])
    __obj.asInstanceOf[RotateYTransform]
  }
  
  @scala.inline
  implicit class RotateYTransformMutableBuilder[Self <: RotateYTransform] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRotateY(value: String): Self = StObject.set(x, "rotateY", value.asInstanceOf[js.Any])
  }
}
