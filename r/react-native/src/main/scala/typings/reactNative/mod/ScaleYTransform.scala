package typings.reactNative.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ScaleYTransform extends StObject {
  
  var scaleY: Double = js.native
}
object ScaleYTransform {
  
  @scala.inline
  def apply(scaleY: Double): ScaleYTransform = {
    val __obj = js.Dynamic.literal(scaleY = scaleY.asInstanceOf[js.Any])
    __obj.asInstanceOf[ScaleYTransform]
  }
  
  @scala.inline
  implicit class ScaleYTransformMutableBuilder[Self <: ScaleYTransform] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setScaleY(value: Double): Self = StObject.set(x, "scaleY", value.asInstanceOf[js.Any])
  }
}
