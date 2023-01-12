package typings.storybookReactNative.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TransformArray extends StObject {
  
  var transform: js.Array[TranslateY | TranslateXTranslateY]
}
object TransformArray {
  
  inline def apply(transform: js.Array[TranslateY | TranslateXTranslateY]): TransformArray = {
    val __obj = js.Dynamic.literal(transform = transform.asInstanceOf[js.Any])
    __obj.asInstanceOf[TransformArray]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TransformArray] (val x: Self) extends AnyVal {
    
    inline def setTransform(value: js.Array[TranslateY | TranslateXTranslateY]): Self = StObject.set(x, "transform", value.asInstanceOf[js.Any])
    
    inline def setTransformVarargs(value: (TranslateY | TranslateXTranslateY)*): Self = StObject.set(x, "transform", js.Array(value*))
  }
}
