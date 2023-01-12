package typings.reactNative.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TransformsStyle extends StObject {
  
  /**
    * @deprecated Use rotate in transform prop instead.
    */
  var rotation: js.UndefOr[Double] = js.undefined
  
  /**
    * @deprecated Use scaleX in transform prop instead.
    */
  var scaleX: js.UndefOr[Double] = js.undefined
  
  /**
    * @deprecated Use scaleY in transform prop instead.
    */
  var scaleY: js.UndefOr[Double] = js.undefined
  
  var transform: js.UndefOr[
    js.Array[
      PerpectiveTransform | RotateTransform | RotateXTransform | RotateYTransform | RotateZTransform | ScaleTransform | ScaleXTransform | ScaleYTransform | TranslateXTransform | TranslateYTransform | SkewXTransform | SkewYTransform | MatrixTransform
    ]
  ] = js.undefined
  
  /**
    * @deprecated Use matrix in transform prop instead.
    */
  var transformMatrix: js.UndefOr[js.Array[Double]] = js.undefined
  
  /**
    * @deprecated Use translateX in transform prop instead.
    */
  var translateX: js.UndefOr[Double] = js.undefined
  
  /**
    * @deprecated Use translateY in transform prop instead.
    */
  var translateY: js.UndefOr[Double] = js.undefined
}
object TransformsStyle {
  
  inline def apply(): TransformsStyle = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TransformsStyle]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TransformsStyle] (val x: Self) extends AnyVal {
    
    inline def setRotation(value: Double): Self = StObject.set(x, "rotation", value.asInstanceOf[js.Any])
    
    inline def setRotationUndefined: Self = StObject.set(x, "rotation", js.undefined)
    
    inline def setScaleX(value: Double): Self = StObject.set(x, "scaleX", value.asInstanceOf[js.Any])
    
    inline def setScaleXUndefined: Self = StObject.set(x, "scaleX", js.undefined)
    
    inline def setScaleY(value: Double): Self = StObject.set(x, "scaleY", value.asInstanceOf[js.Any])
    
    inline def setScaleYUndefined: Self = StObject.set(x, "scaleY", js.undefined)
    
    inline def setTransform(
      value: js.Array[
          PerpectiveTransform | RotateTransform | RotateXTransform | RotateYTransform | RotateZTransform | ScaleTransform | ScaleXTransform | ScaleYTransform | TranslateXTransform | TranslateYTransform | SkewXTransform | SkewYTransform | MatrixTransform
        ]
    ): Self = StObject.set(x, "transform", value.asInstanceOf[js.Any])
    
    inline def setTransformMatrix(value: js.Array[Double]): Self = StObject.set(x, "transformMatrix", value.asInstanceOf[js.Any])
    
    inline def setTransformMatrixUndefined: Self = StObject.set(x, "transformMatrix", js.undefined)
    
    inline def setTransformMatrixVarargs(value: Double*): Self = StObject.set(x, "transformMatrix", js.Array(value*))
    
    inline def setTransformUndefined: Self = StObject.set(x, "transform", js.undefined)
    
    inline def setTransformVarargs(
      value: (PerpectiveTransform | RotateTransform | RotateXTransform | RotateYTransform | RotateZTransform | ScaleTransform | ScaleXTransform | ScaleYTransform | TranslateXTransform | TranslateYTransform | SkewXTransform | SkewYTransform | MatrixTransform)*
    ): Self = StObject.set(x, "transform", js.Array(value*))
    
    inline def setTranslateX(value: Double): Self = StObject.set(x, "translateX", value.asInstanceOf[js.Any])
    
    inline def setTranslateXUndefined: Self = StObject.set(x, "translateX", js.undefined)
    
    inline def setTranslateY(value: Double): Self = StObject.set(x, "translateY", value.asInstanceOf[js.Any])
    
    inline def setTranslateYUndefined: Self = StObject.set(x, "translateY", js.undefined)
  }
}
