package typings.reactNativeSvg

import org.scalablytyped.runtime.Shortcut
import typings.reactNative.librariesTypesCodegenTypesMod.Float
import typings.reactNative.librariesTypesCodegenTypesMod.Int32
import typings.reactNative.librariesTypesCodegenTypesMod.WithDefault
import typings.reactNative.librariesUtilitiesCodegenNativeComponentMod.NativeComponentType
import typings.reactNative.mod.ColorValue
import typings.reactNativeSvg.libTypescriptFabricUtilsMod.ViewProps
import typings.reactNativeSvg.reactNativeSvgDoubles.`1.0`
import typings.reactNativeSvg.reactNativeSvgInts.`-1`
import typings.reactNativeSvg.reactNativeSvgInts.`0`
import typings.reactNativeSvg.reactNativeSvgInts.`1`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libTypescriptFabricTextPathNativeComponentMod extends Shortcut {
  
  @JSImport("react-native-svg/lib/typescript/fabric/TextPathNativeComponent", JSImport.Default)
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
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ColorStruct] (val x: Self) extends AnyVal {
      
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
    
    @scala.inline
    implicit open class MutableBuilder[Self <: FontObject] (val x: Self) extends AnyVal {
      
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
       with SvgGroupCommonProps
       with SvgTextCommonProps {
    
    var href: js.UndefOr[String] = js.undefined
    
    var method: js.UndefOr[String] = js.undefined
    
    var midLine: js.UndefOr[String] = js.undefined
    
    var side: js.UndefOr[String] = js.undefined
    
    var spacing: js.UndefOr[String] = js.undefined
    
    var startOffset: js.UndefOr[String] = js.undefined
  }
  object NativeProps {
    
    inline def apply(): NativeProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[NativeProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: NativeProps] (val x: Self) extends AnyVal {
      
      inline def setHref(value: String): Self = StObject.set(x, "href", value.asInstanceOf[js.Any])
      
      inline def setHrefUndefined: Self = StObject.set(x, "href", js.undefined)
      
      inline def setMethod(value: String): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
      
      inline def setMethodUndefined: Self = StObject.set(x, "method", js.undefined)
      
      inline def setMidLine(value: String): Self = StObject.set(x, "midLine", value.asInstanceOf[js.Any])
      
      inline def setMidLineUndefined: Self = StObject.set(x, "midLine", js.undefined)
      
      inline def setSide(value: String): Self = StObject.set(x, "side", value.asInstanceOf[js.Any])
      
      inline def setSideUndefined: Self = StObject.set(x, "side", js.undefined)
      
      inline def setSpacing(value: String): Self = StObject.set(x, "spacing", value.asInstanceOf[js.Any])
      
      inline def setSpacingUndefined: Self = StObject.set(x, "spacing", js.undefined)
      
      inline def setStartOffset(value: String): Self = StObject.set(x, "startOffset", value.asInstanceOf[js.Any])
      
      inline def setStartOffsetUndefined: Self = StObject.set(x, "startOffset", js.undefined)
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
    
    @scala.inline
    implicit open class MutableBuilder[Self <: SvgGroupCommonProps] (val x: Self) extends AnyVal {
      
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
    
    var pointerEvents: js.UndefOr[String] = js.undefined
    
    var responsible: js.UndefOr[Boolean] = js.undefined
  }
  object SvgNodeCommonProps {
    
    inline def apply(): SvgNodeCommonProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SvgNodeCommonProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: SvgNodeCommonProps] (val x: Self) extends AnyVal {
      
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
      
      inline def setPointerEvents(value: String): Self = StObject.set(x, "pointerEvents", value.asInstanceOf[js.Any])
      
      inline def setPointerEventsUndefined: Self = StObject.set(x, "pointerEvents", js.undefined)
      
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
    
    @scala.inline
    implicit open class MutableBuilder[Self <: SvgRenderableCommonProps] (val x: Self) extends AnyVal {
      
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
  
  trait SvgTextCommonProps extends StObject {
    
    var alignmentBaseline: js.UndefOr[String] = js.undefined
    
    var baselineShift: js.UndefOr[String] = js.undefined
    
    var dx: js.UndefOr[js.Array[String]] = js.undefined
    
    var dy: js.UndefOr[js.Array[String]] = js.undefined
    
    var inlineSize: js.UndefOr[String] = js.undefined
    
    var lengthAdjust: js.UndefOr[String] = js.undefined
    
    var rotate: js.UndefOr[js.Array[String]] = js.undefined
    
    var textLength: js.UndefOr[String] = js.undefined
    
    var verticalAlign: js.UndefOr[String] = js.undefined
    
    var x: js.UndefOr[js.Array[String]] = js.undefined
    
    var y: js.UndefOr[js.Array[String]] = js.undefined
  }
  object SvgTextCommonProps {
    
    inline def apply(): SvgTextCommonProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SvgTextCommonProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: SvgTextCommonProps] (val x: Self) extends AnyVal {
      
      inline def setAlignmentBaseline(value: String): Self = StObject.set(x, "alignmentBaseline", value.asInstanceOf[js.Any])
      
      inline def setAlignmentBaselineUndefined: Self = StObject.set(x, "alignmentBaseline", js.undefined)
      
      inline def setBaselineShift(value: String): Self = StObject.set(x, "baselineShift", value.asInstanceOf[js.Any])
      
      inline def setBaselineShiftUndefined: Self = StObject.set(x, "baselineShift", js.undefined)
      
      inline def setDx(value: js.Array[String]): Self = StObject.set(x, "dx", value.asInstanceOf[js.Any])
      
      inline def setDxUndefined: Self = StObject.set(x, "dx", js.undefined)
      
      inline def setDxVarargs(value: String*): Self = StObject.set(x, "dx", js.Array(value*))
      
      inline def setDy(value: js.Array[String]): Self = StObject.set(x, "dy", value.asInstanceOf[js.Any])
      
      inline def setDyUndefined: Self = StObject.set(x, "dy", js.undefined)
      
      inline def setDyVarargs(value: String*): Self = StObject.set(x, "dy", js.Array(value*))
      
      inline def setInlineSize(value: String): Self = StObject.set(x, "inlineSize", value.asInstanceOf[js.Any])
      
      inline def setInlineSizeUndefined: Self = StObject.set(x, "inlineSize", js.undefined)
      
      inline def setLengthAdjust(value: String): Self = StObject.set(x, "lengthAdjust", value.asInstanceOf[js.Any])
      
      inline def setLengthAdjustUndefined: Self = StObject.set(x, "lengthAdjust", js.undefined)
      
      inline def setRotate(value: js.Array[String]): Self = StObject.set(x, "rotate", value.asInstanceOf[js.Any])
      
      inline def setRotateUndefined: Self = StObject.set(x, "rotate", js.undefined)
      
      inline def setRotateVarargs(value: String*): Self = StObject.set(x, "rotate", js.Array(value*))
      
      inline def setTextLength(value: String): Self = StObject.set(x, "textLength", value.asInstanceOf[js.Any])
      
      inline def setTextLengthUndefined: Self = StObject.set(x, "textLength", js.undefined)
      
      inline def setVerticalAlign(value: String): Self = StObject.set(x, "verticalAlign", value.asInstanceOf[js.Any])
      
      inline def setVerticalAlignUndefined: Self = StObject.set(x, "verticalAlign", js.undefined)
      
      inline def setX(value: js.Array[String]): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
      
      inline def setXUndefined: Self = StObject.set(x, "x", js.undefined)
      
      inline def setXVarargs(value: String*): Self = StObject.set(x, "x", js.Array(value*))
      
      inline def setY(value: js.Array[String]): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
      
      inline def setYUndefined: Self = StObject.set(x, "y", js.undefined)
      
      inline def setYVarargs(value: String*): Self = StObject.set(x, "y", js.Array(value*))
    }
  }
  
  type _To = NativeComponentType[NativeProps]
  
  /* This means you don't have to write `default`, but can instead just say `libTypescriptFabricTextPathNativeComponentMod.foo` */
  override def _to: NativeComponentType[NativeProps] = default
}
