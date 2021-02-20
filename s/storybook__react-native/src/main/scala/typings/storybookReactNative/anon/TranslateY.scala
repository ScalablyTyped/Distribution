package typings.storybookReactNative.anon

import typings.reactNative.mod.Animated.AnimatedInterpolation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TranslateY extends StObject {
  
  var translateX: AnimatedInterpolation = js.native
  
  var translateY: js.UndefOr[scala.Nothing] = js.native
}
object TranslateY {
  
  @scala.inline
  def apply(translateX: AnimatedInterpolation): TranslateY = {
    val __obj = js.Dynamic.literal(translateX = translateX.asInstanceOf[js.Any])
    __obj.asInstanceOf[TranslateY]
  }
  
  @scala.inline
  implicit class TranslateYMutableBuilder[Self <: TranslateY] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setTranslateX(value: AnimatedInterpolation): Self = StObject.set(x, "translateX", value.asInstanceOf[js.Any])
  }
}
