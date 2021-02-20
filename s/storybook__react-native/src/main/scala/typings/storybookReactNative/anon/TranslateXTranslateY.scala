package typings.storybookReactNative.anon

import typings.reactNative.mod.Animated.AnimatedInterpolation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TranslateXTranslateY extends StObject {
  
  var translateX: js.UndefOr[scala.Nothing] = js.native
  
  var translateY: AnimatedInterpolation = js.native
}
object TranslateXTranslateY {
  
  @scala.inline
  def apply(translateY: AnimatedInterpolation): TranslateXTranslateY = {
    val __obj = js.Dynamic.literal(translateY = translateY.asInstanceOf[js.Any])
    __obj.asInstanceOf[TranslateXTranslateY]
  }
  
  @scala.inline
  implicit class TranslateXTranslateYMutableBuilder[Self <: TranslateXTranslateY] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setTranslateY(value: AnimatedInterpolation): Self = StObject.set(x, "translateY", value.asInstanceOf[js.Any])
  }
}
