package typings.reactNativeSvg

import org.scalablytyped.runtime.Shortcut
import typings.reactNative.codegenNativeComponentMod.NativeComponentType
import typings.reactNative.codegenTypesMod.Float
import typings.reactNative.codegenTypesMod.Int32
import typings.reactNative.codegenTypesMod.WithDefault
import typings.reactNative.mod.ColorValue
import typings.reactNative.mod.ViewProps
import typings.reactNativeSvg.reactNativeSvgDoubles.`1.0`
import typings.reactNativeSvg.reactNativeSvgInts.`-1`
import typings.reactNativeSvg.reactNativeSvgInts.`0`
import typings.reactNativeSvg.reactNativeSvgInts.`1`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object patternNativeComponentMod extends Shortcut {
  
  @JSImport("react-native-svg/lib/typescript/fabric/PatternNativeComponent", JSImport.Default)
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
  
  /* Inlined std.Readonly<{  fontStyle :string | undefined,   fontVariant :string | undefined,   fontWeight :string | undefined,   fontStretch :string | undefined,   fontSize :string | undefined,   fontFamily :string | undefined,   textAnchor :string | undefined,   textDecoration :string | undefined,   letterSpacing :string | undefined,   wordSpacing :string | undefined,   kerning :string | undefined,   fontFeatureSettings :string | undefined,   fontVariantLigatures :string | undefined,   fontVariationSettings :string | undefined}> */
  trait FontObject extends StObject {
    
    val fontFamily: js.UndefOr[String] = js.undefined
    
    val fontFeatureSettings: js.UndefOr[String] = js.undefined
    
    val fontSize: js.UndefOr[String] = js.undefined
    
    val fontStretch: js.UndefOr[String] = js.undefined
    
    val fontStyle: js.UndefOr[String] = js.undefined
    
    val fontVariant: js.UndefOr[String] = js.undefined
    
    val fontVariantLigatures: js.UndefOr[String] = js.undefined
    
    val fontVariationSettings: js.UndefOr[String] = js.undefined
    
    val fontWeight: js.UndefOr[String] = js.undefined
    
    val kerning: js.UndefOr[String] = js.undefined
    
    val letterSpacing: js.UndefOr[String] = js.undefined
    
    val textAnchor: js.UndefOr[String] = js.undefined
    
    val textDecoration: js.UndefOr[String] = js.undefined
    
    val wordSpacing: js.UndefOr[String] = js.undefined
  }
  object FontObject {
    
    inline def apply(): FontObject = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FontObject]
    }
    
    extension [Self <: FontObject](x: Self) {
      
      inline def setFontFamily(value: String): Self = StObject.set(x, "fontFamily", value.asInstanceOf[js.Any])
      
      inline def setFontFamilyUndefined: Self = StObject.set(x, "fontFamily", js.undefined)
      
      inline def setFontFeatureSettings(value: String): Self = StObject.set(x, "fontFeatureSettings", value.asInstanceOf[js.Any])
      
      inline def setFontFeatureSettingsUndefined: Self = StObject.set(x, "fontFeatureSettings", js.undefined)
      
      inline def setFontSize(value: String): Self = StObject.set(x, "fontSize", value.asInstanceOf[js.Any])
      
      inline def setFontSizeUndefined: Self = StObject.set(x, "fontSize", js.undefined)
      
      inline def setFontStretch(value: String): Self = StObject.set(x, "fontStretch", value.asInstanceOf[js.Any])
      
      inline def setFontStretchUndefined: Self = StObject.set(x, "fontStretch", js.undefined)
      
      inline def setFontStyle(value: String): Self = StObject.set(x, "fontStyle", value.asInstanceOf[js.Any])
      
      inline def setFontStyleUndefined: Self = StObject.set(x, "fontStyle", js.undefined)
      
      inline def setFontVariant(value: String): Self = StObject.set(x, "fontVariant", value.asInstanceOf[js.Any])
      
      inline def setFontVariantLigatures(value: String): Self = StObject.set(x, "fontVariantLigatures", value.asInstanceOf[js.Any])
      
      inline def setFontVariantLigaturesUndefined: Self = StObject.set(x, "fontVariantLigatures", js.undefined)
      
      inline def setFontVariantUndefined: Self = StObject.set(x, "fontVariant", js.undefined)
      
      inline def setFontVariationSettings(value: String): Self = StObject.set(x, "fontVariationSettings", value.asInstanceOf[js.Any])
      
      inline def setFontVariationSettingsUndefined: Self = StObject.set(x, "fontVariationSettings", js.undefined)
      
      inline def setFontWeight(value: String): Self = StObject.set(x, "fontWeight", value.asInstanceOf[js.Any])
      
      inline def setFontWeightUndefined: Self = StObject.set(x, "fontWeight", js.undefined)
      
      inline def setKerning(value: String): Self = StObject.set(x, "kerning", value.asInstanceOf[js.Any])
      
      inline def setKerningUndefined: Self = StObject.set(x, "kerning", js.undefined)
      
      inline def setLetterSpacing(value: String): Self = StObject.set(x, "letterSpacing", value.asInstanceOf[js.Any])
      
      inline def setLetterSpacingUndefined: Self = StObject.set(x, "letterSpacing", js.undefined)
      
      inline def setTextAnchor(value: String): Self = StObject.set(x, "textAnchor", value.asInstanceOf[js.Any])
      
      inline def setTextAnchorUndefined: Self = StObject.set(x, "textAnchor", js.undefined)
      
      inline def setTextDecoration(value: String): Self = StObject.set(x, "textDecoration", value.asInstanceOf[js.Any])
      
      inline def setTextDecorationUndefined: Self = StObject.set(x, "textDecoration", js.undefined)
      
      inline def setWordSpacing(value: String): Self = StObject.set(x, "wordSpacing", value.asInstanceOf[js.Any])
      
      inline def setWordSpacingUndefined: Self = StObject.set(x, "wordSpacing", js.undefined)
    }
  }
  
  trait NativeProps
    extends StObject
       with ViewProps
       with SvgNodeCommonProps
       with SvgRenderableCommonProps
       with SvgGroupCommonProps {
    
    var align: js.UndefOr[String] = js.undefined
    
    var height: js.UndefOr[String] = js.undefined
    
    var meetOrSlice: js.UndefOr[Int32] = js.undefined
    
    var minX: js.UndefOr[Float] = js.undefined
    
    var minY: js.UndefOr[Float] = js.undefined
    
    var patternContentUnits: js.UndefOr[Int32] = js.undefined
    
    var patternTransform: js.UndefOr[js.Array[Float]] = js.undefined
    
    var patternUnits: js.UndefOr[Int32] = js.undefined
    
    var vbHeight: js.UndefOr[Float] = js.undefined
    
    var vbWidth: js.UndefOr[Float] = js.undefined
    
    var width: js.UndefOr[String] = js.undefined
    
    var x: js.UndefOr[String] = js.undefined
    
    var y: js.UndefOr[String] = js.undefined
  }
  object NativeProps {
    
    inline def apply(): NativeProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[NativeProps]
    }
    
    extension [Self <: NativeProps](x: Self) {
      
      inline def setAlign(value: String): Self = StObject.set(x, "align", value.asInstanceOf[js.Any])
      
      inline def setAlignUndefined: Self = StObject.set(x, "align", js.undefined)
      
      inline def setHeight(value: String): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
      
      inline def setMeetOrSlice(value: Int32): Self = StObject.set(x, "meetOrSlice", value.asInstanceOf[js.Any])
      
      inline def setMeetOrSliceUndefined: Self = StObject.set(x, "meetOrSlice", js.undefined)
      
      inline def setMinX(value: Float): Self = StObject.set(x, "minX", value.asInstanceOf[js.Any])
      
      inline def setMinXUndefined: Self = StObject.set(x, "minX", js.undefined)
      
      inline def setMinY(value: Float): Self = StObject.set(x, "minY", value.asInstanceOf[js.Any])
      
      inline def setMinYUndefined: Self = StObject.set(x, "minY", js.undefined)
      
      inline def setPatternContentUnits(value: Int32): Self = StObject.set(x, "patternContentUnits", value.asInstanceOf[js.Any])
      
      inline def setPatternContentUnitsUndefined: Self = StObject.set(x, "patternContentUnits", js.undefined)
      
      inline def setPatternTransform(value: js.Array[Float]): Self = StObject.set(x, "patternTransform", value.asInstanceOf[js.Any])
      
      inline def setPatternTransformUndefined: Self = StObject.set(x, "patternTransform", js.undefined)
      
      inline def setPatternTransformVarargs(value: Float*): Self = StObject.set(x, "patternTransform", js.Array(value*))
      
      inline def setPatternUnits(value: Int32): Self = StObject.set(x, "patternUnits", value.asInstanceOf[js.Any])
      
      inline def setPatternUnitsUndefined: Self = StObject.set(x, "patternUnits", js.undefined)
      
      inline def setVbHeight(value: Float): Self = StObject.set(x, "vbHeight", value.asInstanceOf[js.Any])
      
      inline def setVbHeightUndefined: Self = StObject.set(x, "vbHeight", js.undefined)
      
      inline def setVbWidth(value: Float): Self = StObject.set(x, "vbWidth", value.asInstanceOf[js.Any])
      
      inline def setVbWidthUndefined: Self = StObject.set(x, "vbWidth", js.undefined)
      
      inline def setWidth(value: String): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
      
      inline def setX(value: String): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
      
      inline def setXUndefined: Self = StObject.set(x, "x", js.undefined)
      
      inline def setY(value: String): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
      
      inline def setYUndefined: Self = StObject.set(x, "y", js.undefined)
    }
  }
  
  trait SvgGroupCommonProps extends StObject {
    
    var font: js.UndefOr[FontObject] = js.undefined
    
    var fontSize: js.UndefOr[String] = js.undefined
    
    var fontWeight: js.UndefOr[String] = js.undefined
  }
  object SvgGroupCommonProps {
    
    inline def apply(): SvgGroupCommonProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SvgGroupCommonProps]
    }
    
    extension [Self <: SvgGroupCommonProps](x: Self) {
      
      inline def setFont(value: FontObject): Self = StObject.set(x, "font", value.asInstanceOf[js.Any])
      
      inline def setFontSize(value: String): Self = StObject.set(x, "fontSize", value.asInstanceOf[js.Any])
      
      inline def setFontSizeUndefined: Self = StObject.set(x, "fontSize", js.undefined)
      
      inline def setFontUndefined: Self = StObject.set(x, "font", js.undefined)
      
      inline def setFontWeight(value: String): Self = StObject.set(x, "fontWeight", value.asInstanceOf[js.Any])
      
      inline def setFontWeightUndefined: Self = StObject.set(x, "fontWeight", js.undefined)
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
  
  /* This means you don't have to write `default`, but can instead just say `patternNativeComponentMod.foo` */
  override def _to: NativeComponentType[NativeProps] = default
}
