package typings.storybookReactNative.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TransformArray extends StObject {
  
  var transform: js.Array[TranslateY | TranslateXTranslateY]
}
object TransformArray {
  
  @scala.inline
  def apply(transform: js.Array[TranslateY | TranslateXTranslateY]): TransformArray = {
    val __obj = js.Dynamic.literal(transform = transform.asInstanceOf[js.Any])
    __obj.asInstanceOf[TransformArray]
  }
  
  @scala.inline
  implicit class TransformArrayMutableBuilder[Self <: TransformArray] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setTransform(value: js.Array[TranslateY | TranslateXTranslateY]): Self = StObject.set(x, "transform", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTransformVarargs(value: (TranslateY | TranslateXTranslateY)*): Self = StObject.set(x, "transform", js.Array(value :_*))
  }
}
