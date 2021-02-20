package typings.reactNative.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SkewYTransform extends StObject {
  
  var skewY: String = js.native
}
object SkewYTransform {
  
  @scala.inline
  def apply(skewY: String): SkewYTransform = {
    val __obj = js.Dynamic.literal(skewY = skewY.asInstanceOf[js.Any])
    __obj.asInstanceOf[SkewYTransform]
  }
  
  @scala.inline
  implicit class SkewYTransformMutableBuilder[Self <: SkewYTransform] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSkewY(value: String): Self = StObject.set(x, "skewY", value.asInstanceOf[js.Any])
  }
}
