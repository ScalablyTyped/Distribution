package typings.reactNativeSvg.anon

import typings.react.mod.ReactElement
import typings.reactNativeSvg.reactNativeSvgStrings.objectBoundingBox
import typings.reactNativeSvg.reactNativeSvgStrings.userSpaceOnUse
import typings.reactNativeSvg.typesMod.ColumnMajorTransformMatrix
import typings.reactNativeSvg.typesMod.NumberArray
import typings.reactNativeSvg.typesMod.NumberProp
import typings.reactNativeSvg.typesMod.TransformObject
import typings.reactNativeSvg.typesMod.TransformProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined {  id :string | undefined,   children :std.Array<react.react.ReactElement> | undefined,   transform :std.Array<number> | string | react-native-svg.react-native-svg/lib/typescript/lib/extract/types.TransformProps | undefined,   gradientTransform :std.Array<number> | string | react-native-svg.react-native-svg/lib/typescript/lib/extract/types.TransformProps | undefined,   gradientUnits :'objectBoundingBox' | 'userSpaceOnUse' | undefined} & react-native-svg.react-native-svg/lib/typescript/lib/extract/types.TransformProps */
trait idstringundefinedchildren extends StObject {
  
  var children: js.UndefOr[js.Array[ReactElement]] = js.undefined
  
  var gradientTransform: js.UndefOr[js.Array[Double] | String | TransformProps] = js.undefined
  
  var gradientUnits: js.UndefOr[objectBoundingBox | userSpaceOnUse] = js.undefined
  
  var id: js.UndefOr[String] = js.undefined
  
  var origin: js.UndefOr[NumberArray] = js.undefined
  
  var originX: js.UndefOr[NumberProp] = js.undefined
  
  var originY: js.UndefOr[NumberProp] = js.undefined
  
  var rotation: js.UndefOr[NumberProp] = js.undefined
  
  var scale: js.UndefOr[NumberArray] = js.undefined
  
  var scaleX: js.UndefOr[NumberProp] = js.undefined
  
  var scaleY: js.UndefOr[NumberProp] = js.undefined
  
  var skew: js.UndefOr[NumberArray] = js.undefined
  
  var skewX: js.UndefOr[NumberProp] = js.undefined
  
  var skewY: js.UndefOr[NumberProp] = js.undefined
  
  var transform: (js.UndefOr[js.Array[Double] | String | TransformProps]) & (js.UndefOr[ColumnMajorTransformMatrix | String | TransformObject])
  
  var translate: js.UndefOr[NumberArray] = js.undefined
  
  var translateX: js.UndefOr[NumberProp] = js.undefined
  
  var translateY: js.UndefOr[NumberProp] = js.undefined
  
  var x: js.UndefOr[NumberArray] = js.undefined
  
  var y: js.UndefOr[NumberArray] = js.undefined
}
object idstringundefinedchildren {
  
  inline def apply(
    transform: (js.UndefOr[js.Array[Double] | String | TransformProps]) & (js.UndefOr[ColumnMajorTransformMatrix | String | TransformObject])
  ): idstringundefinedchildren = {
    val __obj = js.Dynamic.literal(transform = transform.asInstanceOf[js.Any])
    __obj.asInstanceOf[idstringundefinedchildren]
  }
  
  extension [Self <: idstringundefinedchildren](x: Self) {
    
    inline def setChildren(value: js.Array[ReactElement]): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
    
    inline def setChildrenVarargs(value: ReactElement*): Self = StObject.set(x, "children", js.Array(value*))
    
    inline def setGradientTransform(value: js.Array[Double] | String | TransformProps): Self = StObject.set(x, "gradientTransform", value.asInstanceOf[js.Any])
    
    inline def setGradientTransformUndefined: Self = StObject.set(x, "gradientTransform", js.undefined)
    
    inline def setGradientTransformVarargs(value: Double*): Self = StObject.set(x, "gradientTransform", js.Array(value*))
    
    inline def setGradientUnits(value: objectBoundingBox | userSpaceOnUse): Self = StObject.set(x, "gradientUnits", value.asInstanceOf[js.Any])
    
    inline def setGradientUnitsUndefined: Self = StObject.set(x, "gradientUnits", js.undefined)
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setOrigin(value: NumberArray): Self = StObject.set(x, "origin", value.asInstanceOf[js.Any])
    
    inline def setOriginUndefined: Self = StObject.set(x, "origin", js.undefined)
    
    inline def setOriginVarargs(value: NumberProp*): Self = StObject.set(x, "origin", js.Array(value*))
    
    inline def setOriginX(value: NumberProp): Self = StObject.set(x, "originX", value.asInstanceOf[js.Any])
    
    inline def setOriginXUndefined: Self = StObject.set(x, "originX", js.undefined)
    
    inline def setOriginY(value: NumberProp): Self = StObject.set(x, "originY", value.asInstanceOf[js.Any])
    
    inline def setOriginYUndefined: Self = StObject.set(x, "originY", js.undefined)
    
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
      value: (js.UndefOr[js.Array[Double] | String | TransformProps]) & (js.UndefOr[ColumnMajorTransformMatrix | String | TransformObject])
    ): Self = StObject.set(x, "transform", value.asInstanceOf[js.Any])
    
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
