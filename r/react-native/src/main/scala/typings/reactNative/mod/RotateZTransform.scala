package typings.reactNative.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RotateZTransform extends StObject {
  
  var rotateZ: String = js.native
}
object RotateZTransform {
  
  @scala.inline
  def apply(rotateZ: String): RotateZTransform = {
    val __obj = js.Dynamic.literal(rotateZ = rotateZ.asInstanceOf[js.Any])
    __obj.asInstanceOf[RotateZTransform]
  }
  
  @scala.inline
  implicit class RotateZTransformMutableBuilder[Self <: RotateZTransform] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRotateZ(value: String): Self = StObject.set(x, "rotateZ", value.asInstanceOf[js.Any])
  }
}
