package typings.reactNativeSvg.anon

import typings.reactNative.mod.MatrixTransform
import typings.reactNative.mod.PerpectiveTransform
import typings.reactNative.mod.RotateTransform
import typings.reactNative.mod.RotateXTransform
import typings.reactNative.mod.RotateYTransform
import typings.reactNative.mod.RotateZTransform
import typings.reactNative.mod.ScaleTransform
import typings.reactNative.mod.ScaleXTransform
import typings.reactNative.mod.ScaleYTransform
import typings.reactNative.mod.SkewXTransform
import typings.reactNative.mod.SkewYTransform
import typings.reactNative.mod.TranslateXTransform
import typings.reactNative.mod.TranslateYTransform
import typings.reactNativeSvg.libTypescriptLibExtractTypesMod.ColumnMajorTransformMatrix
import typings.reactNativeSvg.libTypescriptLibExtractTypesMod.NumberArray
import typings.reactNativeSvg.libTypescriptLibExtractTypesMod.NumberProp
import typings.std.PropertyKey
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Object & {  matrix :std.Array<number> | undefined} & react-native-svg.react-native-svg/lib/typescript/lib/extract/types.TransformProps */
trait ObjectmatrixArraynumberun extends StObject {
  
  /** The initial value of Object.prototype.constructor is the standard built-in Object constructor. */
  /* standard es5 */
  var constructor: js.Function
  
  /**
    * Determines whether an object has a property with the specified name.
    * @param v A property name.
    */
  /* standard es5 */
  def hasOwnProperty(v: PropertyKey): Boolean
  
  var matrix: js.UndefOr[js.Array[Double]] = js.undefined
  
  var origin: js.UndefOr[NumberArray] = js.undefined
  
  var originX: js.UndefOr[NumberProp] = js.undefined
  
  var originY: js.UndefOr[NumberProp] = js.undefined
  
  /**
    * Determines whether a specified property is enumerable.
    * @param v A property name.
    */
  /* standard es5 */
  def propertyIsEnumerable(v: PropertyKey): Boolean
  
  var rotation: js.UndefOr[NumberProp] = js.undefined
  
  var scale: js.UndefOr[NumberArray] = js.undefined
  
  var scaleX: js.UndefOr[NumberProp] = js.undefined
  
  var scaleY: js.UndefOr[NumberProp] = js.undefined
  
  var skew: js.UndefOr[NumberArray] = js.undefined
  
  var skewX: js.UndefOr[NumberProp] = js.undefined
  
  var skewY: js.UndefOr[NumberProp] = js.undefined
  
  var transform: js.UndefOr[
    ColumnMajorTransformMatrix | String | (js.Array[
      PerpectiveTransform | RotateTransform | RotateXTransform | RotateYTransform | RotateZTransform | ScaleTransform | ScaleXTransform | ScaleYTransform | TranslateXTransform | TranslateYTransform | SkewXTransform | SkewYTransform | MatrixTransform
    ])
  ] = js.undefined
  
  var translate: js.UndefOr[NumberArray] = js.undefined
  
  var translateX: js.UndefOr[NumberProp] = js.undefined
  
  var translateY: js.UndefOr[NumberProp] = js.undefined
  
  var x: js.UndefOr[NumberArray] = js.undefined
  
  var y: js.UndefOr[NumberArray] = js.undefined
}
object ObjectmatrixArraynumberun {
  
  inline def apply(
    constructor: js.Function,
    hasOwnProperty: PropertyKey => Boolean,
    propertyIsEnumerable: PropertyKey => Boolean
  ): ObjectmatrixArraynumberun = {
    val __obj = js.Dynamic.literal(constructor = constructor.asInstanceOf[js.Any], hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable))
    __obj.asInstanceOf[ObjectmatrixArraynumberun]
  }
  
  extension [Self <: ObjectmatrixArraynumberun](x: Self) {
    
    inline def setConstructor(value: js.Function): Self = StObject.set(x, "constructor", value.asInstanceOf[js.Any])
    
    inline def setHasOwnProperty(value: PropertyKey => Boolean): Self = StObject.set(x, "hasOwnProperty", js.Any.fromFunction1(value))
    
    inline def setMatrix(value: js.Array[Double]): Self = StObject.set(x, "matrix", value.asInstanceOf[js.Any])
    
    inline def setMatrixUndefined: Self = StObject.set(x, "matrix", js.undefined)
    
    inline def setMatrixVarargs(value: Double*): Self = StObject.set(x, "matrix", js.Array(value*))
    
    inline def setOrigin(value: NumberArray): Self = StObject.set(x, "origin", value.asInstanceOf[js.Any])
    
    inline def setOriginUndefined: Self = StObject.set(x, "origin", js.undefined)
    
    inline def setOriginVarargs(value: NumberProp*): Self = StObject.set(x, "origin", js.Array(value*))
    
    inline def setOriginX(value: NumberProp): Self = StObject.set(x, "originX", value.asInstanceOf[js.Any])
    
    inline def setOriginXUndefined: Self = StObject.set(x, "originX", js.undefined)
    
    inline def setOriginY(value: NumberProp): Self = StObject.set(x, "originY", value.asInstanceOf[js.Any])
    
    inline def setOriginYUndefined: Self = StObject.set(x, "originY", js.undefined)
    
    inline def setPropertyIsEnumerable(value: PropertyKey => Boolean): Self = StObject.set(x, "propertyIsEnumerable", js.Any.fromFunction1(value))
    
    inline def setRotation(value: NumberProp): Self = StObject.set(x, "rotation", value.asInstanceOf[js.Any])
    
    inline def setRotationUndefined: Self = StObject.set(x, "rotation", js.undefined)
    
    inline def setScale(value: NumberArray): Self = StObject.set(x, "scale", value.asInstanceOf[js.Any])
    
    inline def setScaleUndefined: Self = StObject.set(x, "scale", js.undefined)
    
    inline def setScaleVarargs(value: NumberProp*): Self = StObject.set(x, "scale", js.Array(value*))
    
    inline def setScaleX(value: NumberProp): Self = StObject.set(x, "scaleX", value.asInstanceOf[js.Any])
    
    inline def setScaleXUndefined: Self = StObject.set(x, "scaleX", js.undefined)
    
    inline def setScaleY(value: NumberProp): Self = StObject.set(x, "scaleY", value.asInstanceOf[js.Any])
    
    inline def setScaleYUndefined: Self = StObject.set(x, "scaleY", js.undefined)
    
    inline def setSkew(value: NumberArray): Self = StObject.set(x, "skew", value.asInstanceOf[js.Any])
    
    inline def setSkewUndefined: Self = StObject.set(x, "skew", js.undefined)
    
    inline def setSkewVarargs(value: NumberProp*): Self = StObject.set(x, "skew", js.Array(value*))
    
    inline def setSkewX(value: NumberProp): Self = StObject.set(x, "skewX", value.asInstanceOf[js.Any])
    
    inline def setSkewXUndefined: Self = StObject.set(x, "skewX", js.undefined)
    
    inline def setSkewY(value: NumberProp): Self = StObject.set(x, "skewY", value.asInstanceOf[js.Any])
    
    inline def setSkewYUndefined: Self = StObject.set(x, "skewY", js.undefined)
    
    inline def setTransform(
      value: ColumnMajorTransformMatrix | String | (js.Array[
          PerpectiveTransform | RotateTransform | RotateXTransform | RotateYTransform | RotateZTransform | ScaleTransform | ScaleXTransform | ScaleYTransform | TranslateXTransform | TranslateYTransform | SkewXTransform | SkewYTransform | MatrixTransform
        ])
    ): Self = StObject.set(x, "transform", value.asInstanceOf[js.Any])
    
    inline def setTransformUndefined: Self = StObject.set(x, "transform", js.undefined)
    
    inline def setTransformVarargs(
      value: (PerpectiveTransform | RotateTransform | RotateXTransform | RotateYTransform | RotateZTransform | ScaleTransform | ScaleXTransform | ScaleYTransform | TranslateXTransform | TranslateYTransform | SkewXTransform | SkewYTransform | MatrixTransform)*
    ): Self = StObject.set(x, "transform", js.Array(value*))
    
    inline def setTranslate(value: NumberArray): Self = StObject.set(x, "translate", value.asInstanceOf[js.Any])
    
    inline def setTranslateUndefined: Self = StObject.set(x, "translate", js.undefined)
    
    inline def setTranslateVarargs(value: NumberProp*): Self = StObject.set(x, "translate", js.Array(value*))
    
    inline def setTranslateX(value: NumberProp): Self = StObject.set(x, "translateX", value.asInstanceOf[js.Any])
    
    inline def setTranslateXUndefined: Self = StObject.set(x, "translateX", js.undefined)
    
    inline def setTranslateY(value: NumberProp): Self = StObject.set(x, "translateY", value.asInstanceOf[js.Any])
    
    inline def setTranslateYUndefined: Self = StObject.set(x, "translateY", js.undefined)
    
    inline def setX(value: NumberArray): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
    
    inline def setXUndefined: Self = StObject.set(x, "x", js.undefined)
    
    inline def setXVarargs(value: NumberProp*): Self = StObject.set(x, "x", js.Array(value*))
    
    inline def setY(value: NumberArray): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    
    inline def setYUndefined: Self = StObject.set(x, "y", js.undefined)
    
    inline def setYVarargs(value: NumberProp*): Self = StObject.set(x, "y", js.Array(value*))
  }
}
