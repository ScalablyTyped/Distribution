package typings.reactNative.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TranslateXTransform extends StObject {
  
  var translateX: Double = js.native
}
object TranslateXTransform {
  
  @scala.inline
  def apply(translateX: Double): TranslateXTransform = {
    val __obj = js.Dynamic.literal(translateX = translateX.asInstanceOf[js.Any])
    __obj.asInstanceOf[TranslateXTransform]
  }
  
  @scala.inline
  implicit class TranslateXTransformMutableBuilder[Self <: TranslateXTransform] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setTranslateX(value: Double): Self = StObject.set(x, "translateX", value.asInstanceOf[js.Any])
  }
}
