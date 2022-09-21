package typings.reactNativeSvg

import org.scalablytyped.runtime.Shortcut
import typings.reactNative.codegenNativeComponentMod.NativeComponentType
import typings.reactNative.codegenTypesMod.Float
import typings.reactNative.codegenTypesMod.Int32
import typings.reactNative.codegenTypesMod.WithDefault
import typings.reactNative.mod.ColorValue
import typings.reactNative.mod.ViewProps
import typings.reactNativeSvg.reactNativeSvgNumbers.`-1`
import typings.reactNativeSvg.reactNativeSvgNumbers.`0`
import typings.reactNativeSvg.reactNativeSvgNumbers.`1.0`
import typings.reactNativeSvg.reactNativeSvgNumbers.`1`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object lineNativeComponentMod extends Shortcut {
  
  @JSImport("react-native-svg/lib/typescript/fabric/LineNativeComponent", JSImport.Default)
  @js.native
  val default: NativeComponentType[NativeProps] = js.native
  
  /* Inlined std.Readonly<{  type :react-native.react-native/Libraries/Types/CodegenTypes.WithDefault<react-native.react-native/Libraries/Types/CodegenTypes.Int32, -1> | undefined,   payload :react-native.react-native.ColorValue | undefined,   brushRef :string | undefined}> */
  trait ColorStruct extends StObject {
    
    val brushRef: js.UndefOr[String] = js.undefined
    
    val payload: js.UndefOr[ColorValue] = js.undefined
    
    val `type`: js.UndefOr[WithDefault[Int32, `-1`]] = js.undefined
  }
  object ColorStruct {
    
    inline def apply(): ColorStruct = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ColorStruct]
    }
    
    extension [Self <: ColorStruct](x: Self) {
      
      inline def setBrushRef(value: String): Self = StObject.set(x, "brushRef", value.asInstanceOf[js.Any])
      
      inline def setBrushRefUndefined: Self = StObject.set(x, "brushRef", js.undefined)
      
      inline def setPayload(value: ColorValue): Self = StObject.set(x, "payload", value.asInstanceOf[js.Any])
      
      inline def setPayloadUndefined: Self = StObject.set(x, "payload", js.undefined)
      
      inline def setType(value: WithDefault[Int32, `-1`]): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeNull: Self = StObject.set(x, "type", null)
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  trait NativeProps
    extends StObject
       with ViewProps
       with SvgNodeCommonProps
       with SvgRenderableCommonProps {
    
    var x1: js.UndefOr[String] = js.undefined
    
    var x2: js.UndefOr[String] = js.undefined
    
    var y1: js.UndefOr[String] = js.undefined
    
    var y2: js.UndefOr[String] = js.undefined
  }
  object NativeProps {
    
    inline def apply(): NativeProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[NativeProps]
    }
    
    extension [Self <: NativeProps](x: Self) {
      
      inline def setX1(value: String): Self = StObject.set(x, "x1", value.asInstanceOf[js.Any])
      
      inline def setX1Undefined: Self = StObject.set(x, "x1", js.undefined)
      
      inline def setX2(value: String): Self = StObject.set(x, "x2", value.asInstanceOf[js.Any])
      
      inline def setX2Undefined: Self = StObject.set(x, "x2", js.undefined)
      
      inline def setY1(value: String): Self = StObject.set(x, "y1", value.asInstanceOf[js.Any])
      
      inline def setY1Undefined: Self = StObject.set(x, "y1", js.undefined)
      
      inline def setY2(value: String): Self = StObject.set(x, "y2", value.asInstanceOf[js.Any])
      
      inline def setY2Undefined: Self = StObject.set(x, "y2", js.undefined)
    }
  }
  
  trait SvgNodeCommonProps extends StObject {
    
    var clipPath: js.UndefOr[String] = js.undefined
    
    var clipRule: js.UndefOr[WithDefault[Int32, `0`]] = js.undefined
    
    var display: js.UndefOr[String] = js.undefined
    
    var markerEnd: js.UndefOr[String] = js.undefined
    
    var markerMid: js.UndefOr[String] = js.undefined
    
    var markerStart: js.UndefOr[String] = js.undefined
    
    var mask: js.UndefOr[String] = js.undefined
    
    var matrix: js.UndefOr[js.Array[Float]] = js.undefined
    
    var name: js.UndefOr[String] = js.undefined
    
    var opacity: js.UndefOr[WithDefault[Float, `1.0`]] = js.undefined
    
    var responsible: js.UndefOr[Boolean] = js.undefined
  }
  object SvgNodeCommonProps {
    
    inline def apply(): SvgNodeCommonProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SvgNodeCommonProps]
    }
    
    extension [Self <: SvgNodeCommonProps](x: Self) {
      
      inline def setClipPath(value: String): Self = StObject.set(x, "clipPath", value.asInstanceOf[js.Any])
      
      inline def setClipPathUndefined: Self = StObject.set(x, "clipPath", js.undefined)
      
      inline def setClipRule(value: WithDefault[Int32, `0`]): Self = StObject.set(x, "clipRule", value.asInstanceOf[js.Any])
      
      inline def setClipRuleNull: Self = StObject.set(x, "clipRule", null)
      
      inline def setClipRuleUndefined: Self = StObject.set(x, "clipRule", js.undefined)
      
      inline def setDisplay(value: String): Self = StObject.set(x, "display", value.asInstanceOf[js.Any])
      
      inline def setDisplayUndefined: Self = StObject.set(x, "display", js.undefined)
      
      inline def setMarkerEnd(value: String): Self = StObject.set(x, "markerEnd", value.asInstanceOf[js.Any])
      
      inline def setMarkerEndUndefined: Self = StObject.set(x, "markerEnd", js.undefined)
      
      inline def setMarkerMid(value: String): Self = StObject.set(x, "markerMid", value.asInstanceOf[js.Any])
      
      inline def setMarkerMidUndefined: Self = StObject.set(x, "markerMid", js.undefined)
      
      inline def setMarkerStart(value: String): Self = StObject.set(x, "markerStart", value.asInstanceOf[js.Any])
      
      inline def setMarkerStartUndefined: Self = StObject.set(x, "markerStart", js.undefined)
      
      inline def setMask(value: String): Self = StObject.set(x, "mask", value.asInstanceOf[js.Any])
      
      inline def setMaskUndefined: Self = StObject.set(x, "mask", js.undefined)
      
      inline def setMatrix(value: js.Array[Float]): Self = StObject.set(x, "matrix", value.asInstanceOf[js.Any])
      
      inline def setMatrixUndefined: Self = StObject.set(x, "matrix", js.undefined)
      
      inline def setMatrixVarargs(value: Float*): Self = StObject.set(x, "matrix", js.Array(value*))
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      inline def setOpacity(value: WithDefault[Float, `1.0`]): Self = StObject.set(x, "opacity", value.asInstanceOf[js.Any])
      
      inline def setOpacityNull: Self = StObject.set(x, "opacity", null)
      
      inline def setOpacityUndefined: Self = StObject.set(x, "opacity", js.undefined)
      
      inline def setResponsible(value: Boolean): Self = StObject.set(x, "responsible", value.asInstanceOf[js.Any])
      
      inline def setResponsibleUndefined: Self = StObject.set(x, "responsible", js.undefined)
    }
  }
  
  trait SvgRenderableCommonProps extends StObject {
    
    var fill: js.UndefOr[ColorStruct] = js.undefined
    
    var fillOpacity: js.UndefOr[WithDefault[Float, `1.0`]] = js.undefined
    
    var fillRule: js.UndefOr[WithDefault[Int32, `1`]] = js.undefined
    
    var propList: js.UndefOr[js.Array[String]] = js.undefined
    
    var stroke: js.UndefOr[ColorStruct] = js.undefined
    
    var strokeDasharray: js.UndefOr[js.Array[String]] = js.undefined
    
    var strokeDashoffset: js.UndefOr[Float] = js.undefined
    
    var strokeLinecap: js.UndefOr[WithDefault[Int32, `0`]] = js.undefined
    
    var strokeLinejoin: js.UndefOr[WithDefault[Int32, `0`]] = js.undefined
    
    var strokeMiterlimit: js.UndefOr[Float] = js.undefined
    
    var strokeOpacity: js.UndefOr[WithDefault[Float, `1.0`]] = js.undefined
    
    var strokeWidth: js.UndefOr[WithDefault[String, typings.reactNativeSvg.reactNativeSvgStrings.`1`]] = js.undefined
    
    var vectorEffect: js.UndefOr[WithDefault[Int32, `0`]] = js.undefined
  }
  object SvgRenderableCommonProps {
    
    inline def apply(): SvgRenderableCommonProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SvgRenderableCommonProps]
    }
    
    extension [Self <: SvgRenderableCommonProps](x: Self) {
      
      inline def setFill(value: ColorStruct): Self = StObject.set(x, "fill", value.asInstanceOf[js.Any])
      
      inline def setFillOpacity(value: WithDefault[Float, `1.0`]): Self = StObject.set(x, "fillOpacity", value.asInstanceOf[js.Any])
      
      inline def setFillOpacityNull: Self = StObject.set(x, "fillOpacity", null)
      
      inline def setFillOpacityUndefined: Self = StObject.set(x, "fillOpacity", js.undefined)
      
      inline def setFillRule(value: WithDefault[Int32, `1`]): Self = StObject.set(x, "fillRule", value.asInstanceOf[js.Any])
      
      inline def setFillRuleNull: Self = StObject.set(x, "fillRule", null)
      
      inline def setFillRuleUndefined: Self = StObject.set(x, "fillRule", js.undefined)
      
      inline def setFillUndefined: Self = StObject.set(x, "fill", js.undefined)
      
      inline def setPropList(value: js.Array[String]): Self = StObject.set(x, "propList", value.asInstanceOf[js.Any])
      
      inline def setPropListUndefined: Self = StObject.set(x, "propList", js.undefined)
      
      inline def setPropListVarargs(value: String*): Self = StObject.set(x, "propList", js.Array(value*))
      
      inline def setStroke(value: ColorStruct): Self = StObject.set(x, "stroke", value.asInstanceOf[js.Any])
      
      inline def setStrokeDasharray(value: js.Array[String]): Self = StObject.set(x, "strokeDasharray", value.asInstanceOf[js.Any])
      
      inline def setStrokeDasharrayUndefined: Self = StObject.set(x, "strokeDasharray", js.undefined)
      
      inline def setStrokeDasharrayVarargs(value: String*): Self = StObject.set(x, "strokeDasharray", js.Array(value*))
      
      inline def setStrokeDashoffset(value: Float): Self = StObject.set(x, "strokeDashoffset", value.asInstanceOf[js.Any])
      
      inline def setStrokeDashoffsetUndefined: Self = StObject.set(x, "strokeDashoffset", js.undefined)
      
      inline def setStrokeLinecap(value: WithDefault[Int32, `0`]): Self = StObject.set(x, "strokeLinecap", value.asInstanceOf[js.Any])
      
      inline def setStrokeLinecapNull: Self = StObject.set(x, "strokeLinecap", null)
      
      inline def setStrokeLinecapUndefined: Self = StObject.set(x, "strokeLinecap", js.undefined)
      
      inline def setStrokeLinejoin(value: WithDefault[Int32, `0`]): Self = StObject.set(x, "strokeLinejoin", value.asInstanceOf[js.Any])
      
      inline def setStrokeLinejoinNull: Self = StObject.set(x, "strokeLinejoin", null)
      
      inline def setStrokeLinejoinUndefined: Self = StObject.set(x, "strokeLinejoin", js.undefined)
      
      inline def setStrokeMiterlimit(value: Float): Self = StObject.set(x, "strokeMiterlimit", value.asInstanceOf[js.Any])
      
      inline def setStrokeMiterlimitUndefined: Self = StObject.set(x, "strokeMiterlimit", js.undefined)
      
      inline def setStrokeOpacity(value: WithDefault[Float, `1.0`]): Self = StObject.set(x, "strokeOpacity", value.asInstanceOf[js.Any])
      
      inline def setStrokeOpacityNull: Self = StObject.set(x, "strokeOpacity", null)
      
      inline def setStrokeOpacityUndefined: Self = StObject.set(x, "strokeOpacity", js.undefined)
      
      inline def setStrokeUndefined: Self = StObject.set(x, "stroke", js.undefined)
      
      inline def setStrokeWidth(value: WithDefault[String, typings.reactNativeSvg.reactNativeSvgStrings.`1`]): Self = StObject.set(x, "strokeWidth", value.asInstanceOf[js.Any])
      
      inline def setStrokeWidthNull: Self = StObject.set(x, "strokeWidth", null)
      
      inline def setStrokeWidthUndefined: Self = StObject.set(x, "strokeWidth", js.undefined)
      
      inline def setVectorEffect(value: WithDefault[Int32, `0`]): Self = StObject.set(x, "vectorEffect", value.asInstanceOf[js.Any])
      
      inline def setVectorEffectNull: Self = StObject.set(x, "vectorEffect", null)
      
      inline def setVectorEffectUndefined: Self = StObject.set(x, "vectorEffect", js.undefined)
    }
  }
  
  type _To = NativeComponentType[NativeProps]
  
  /* This means you don't have to write `default`, but can instead just say `lineNativeComponentMod.foo` */
  override def _to: NativeComponentType[NativeProps] = default
}
