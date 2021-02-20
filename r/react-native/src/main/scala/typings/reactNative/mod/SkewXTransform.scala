package typings.reactNative.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SkewXTransform extends StObject {
  
  var skewX: String = js.native
}
object SkewXTransform {
  
  @scala.inline
  def apply(skewX: String): SkewXTransform = {
    val __obj = js.Dynamic.literal(skewX = skewX.asInstanceOf[js.Any])
    __obj.asInstanceOf[SkewXTransform]
  }
  
  @scala.inline
  implicit class SkewXTransformMutableBuilder[Self <: SkewXTransform] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSkewX(value: String): Self = StObject.set(x, "skewX", value.asInstanceOf[js.Any])
  }
}
