package typings.reactNativeSvg

import org.scalablytyped.runtime.StringDictionary
import typings.react.mod.ComponentType
import typings.react.mod.ReactElement
import typings.reactNativeSvg.anon.AlignmentBaseline
import typings.reactNativeSvg.libTypescriptLibExtractTypesMod.NumberArray
import typings.reactNativeSvg.libTypescriptLibExtractTypesMod.NumberProp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libTypescriptLibExtractExtractTextMod {
  
  @JSImport("react-native-svg/lib/typescript/lib/extract/extractText", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(props: TextProps, container: Boolean): AlignmentBaseline = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(props.asInstanceOf[js.Any], container.asInstanceOf[js.Any])).asInstanceOf[AlignmentBaseline]
  
  inline def extractFont(props: fontProps): StringDictionary[String | Null] = ^.asInstanceOf[js.Dynamic].applyDynamic("extractFont")(props.asInstanceOf[js.Any]).asInstanceOf[StringDictionary[String | Null]]
  
  inline def setTSpan(TSpanImplementation: ComponentType[js.Object]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setTSpan")(TSpanImplementation.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  /** 
  NOTE: Rewritten from type alias:
  {{{
  type TextChild = undefined | string | number | react.react.ComponentType<{}> | react.react.ReactElement | std.Array<react-native-svg.react-native-svg/lib/typescript/lib/extract/extractText.TextChild>
  }}}
  to avoid circular code involving: 
  - react-native-svg.react-native-svg/lib/typescript/lib/extract/extractText.TextChild
  */
  type TextChild = js.UndefOr[String | Double | ComponentType[js.Object] | ReactElement | js.Array[Any]]
  
  trait TextProps
    extends StObject
       with fontProps {
    
    var alignmentBaseline: js.UndefOr[String] = js.undefined
    
    var baselineShift: js.UndefOr[NumberProp] = js.undefined
    
    var children: js.UndefOr[TextChild] = js.undefined
    
    var dx: js.UndefOr[NumberArray] = js.undefined
    
    var dy: js.UndefOr[NumberArray] = js.undefined
    
    var inlineSize: js.UndefOr[NumberProp] = js.undefined
    
    var rotate: js.UndefOr[NumberArray] = js.undefined
    
    var verticalAlign: js.UndefOr[NumberProp] = js.undefined
    
    var x: js.UndefOr[NumberArray] = js.undefined
    
    var y: js.UndefOr[NumberArray] = js.undefined
  }
  object TextProps {
    
    inline def apply(): TextProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TextProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: TextProps] (val x: Self) extends AnyVal {
      
      inline def setAlignmentBaseline(value: String): Self = StObject.set(x, "alignmentBaseline", value.asInstanceOf[js.Any])
      
      inline def setAlignmentBaselineUndefined: Self = StObject.set(x, "alignmentBaseline", js.undefined)
      
      inline def setBaselineShift(value: NumberProp): Self = StObject.set(x, "baselineShift", value.asInstanceOf[js.Any])
      
      inline def setBaselineShiftUndefined: Self = StObject.set(x, "baselineShift", js.undefined)
      
      inline def setChildren(value: TextChild): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setChildrenVarargs(value: Any*): Self = StObject.set(x, "children", js.Array(value*))
      
      inline def setDx(value: NumberArray): Self = StObject.set(x, "dx", value.asInstanceOf[js.Any])
      
      inline def setDxUndefined: Self = StObject.set(x, "dx", js.undefined)
      
      inline def setDxVarargs(value: NumberProp*): Self = StObject.set(x, "dx", js.Array(value*))
      
      inline def setDy(value: NumberArray): Self = StObject.set(x, "dy", value.asInstanceOf[js.Any])
      
      inline def setDyUndefined: Self = StObject.set(x, "dy", js.undefined)
      
      inline def setDyVarargs(value: NumberProp*): Self = StObject.set(x, "dy", js.Array(value*))
      
      inline def setInlineSize(value: NumberProp): Self = StObject.set(x, "inlineSize", value.asInstanceOf[js.Any])
      
      inline def setInlineSizeUndefined: Self = StObject.set(x, "inlineSize", js.undefined)
      
      inline def setRotate(value: NumberArray): Self = StObject.set(x, "rotate", value.asInstanceOf[js.Any])
      
      inline def setRotateUndefined: Self = StObject.set(x, "rotate", js.undefined)
      
      inline def setRotateVarargs(value: NumberProp*): Self = StObject.set(x, "rotate", js.Array(value*))
      
      inline def setVerticalAlign(value: NumberProp): Self = StObject.set(x, "verticalAlign", value.asInstanceOf[js.Any])
      
      inline def setVerticalAlignUndefined: Self = StObject.set(x, "verticalAlign", js.undefined)
      
      inline def setX(value: NumberArray): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
      
      inline def setXUndefined: Self = StObject.set(x, "x", js.undefined)
      
      inline def setXVarargs(value: NumberProp*): Self = StObject.set(x, "x", js.Array(value*))
      
      inline def setY(value: NumberArray): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
      
      inline def setYUndefined: Self = StObject.set(x, "y", js.undefined)
      
      inline def setYVarargs(value: NumberProp*): Self = StObject.set(x, "y", js.Array(value*))
    }
  }
  
  trait fontProps extends StObject {
    
    var font: js.UndefOr[String] = js.undefined
    
    var fontData: js.UndefOr[Any] = js.undefined
    
    var fontFamily: js.UndefOr[String] = js.undefined
    
    var fontFeatureSettings: js.UndefOr[String] = js.undefined
    
    var fontSize: js.UndefOr[NumberProp] = js.undefined
    
    var fontStretch: js.UndefOr[String] = js.undefined
    
    var fontStyle: js.UndefOr[String] = js.undefined
    
    var fontVariant: js.UndefOr[String] = js.undefined
    
    var fontVariantLigatures: js.UndefOr[String] = js.undefined
    
    var fontVariationSettings: js.UndefOr[String] = js.undefined
    
    var fontWeight: js.UndefOr[NumberProp] = js.undefined
    
    var kerning: js.UndefOr[NumberProp] = js.undefined
    
    var letterSpacing: js.UndefOr[NumberProp] = js.undefined
    
    var textAnchor: js.UndefOr[String] = js.undefined
    
    var textDecoration: js.UndefOr[String] = js.undefined
    
    var wordSpacing: js.UndefOr[NumberProp] = js.undefined
  }
  object fontProps {
    
    inline def apply(): fontProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[fontProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: fontProps] (val x: Self) extends AnyVal {
      
      inline def setFont(value: String): Self = StObject.set(x, "font", value.asInstanceOf[js.Any])
      
      inline def setFontData(value: Any): Self = StObject.set(x, "fontData", value.asInstanceOf[js.Any])
      
      inline def setFontDataUndefined: Self = StObject.set(x, "fontData", js.undefined)
      
      inline def setFontFamily(value: String): Self = StObject.set(x, "fontFamily", value.asInstanceOf[js.Any])
      
      inline def setFontFamilyUndefined: Self = StObject.set(x, "fontFamily", js.undefined)
      
      inline def setFontFeatureSettings(value: String): Self = StObject.set(x, "fontFeatureSettings", value.asInstanceOf[js.Any])
      
      inline def setFontFeatureSettingsUndefined: Self = StObject.set(x, "fontFeatureSettings", js.undefined)
      
      inline def setFontSize(value: NumberProp): Self = StObject.set(x, "fontSize", value.asInstanceOf[js.Any])
      
      inline def setFontSizeUndefined: Self = StObject.set(x, "fontSize", js.undefined)
      
      inline def setFontStretch(value: String): Self = StObject.set(x, "fontStretch", value.asInstanceOf[js.Any])
      
      inline def setFontStretchUndefined: Self = StObject.set(x, "fontStretch", js.undefined)
      
      inline def setFontStyle(value: String): Self = StObject.set(x, "fontStyle", value.asInstanceOf[js.Any])
      
      inline def setFontStyleUndefined: Self = StObject.set(x, "fontStyle", js.undefined)
      
      inline def setFontUndefined: Self = StObject.set(x, "font", js.undefined)
      
      inline def setFontVariant(value: String): Self = StObject.set(x, "fontVariant", value.asInstanceOf[js.Any])
      
      inline def setFontVariantLigatures(value: String): Self = StObject.set(x, "fontVariantLigatures", value.asInstanceOf[js.Any])
      
      inline def setFontVariantLigaturesUndefined: Self = StObject.set(x, "fontVariantLigatures", js.undefined)
      
      inline def setFontVariantUndefined: Self = StObject.set(x, "fontVariant", js.undefined)
      
      inline def setFontVariationSettings(value: String): Self = StObject.set(x, "fontVariationSettings", value.asInstanceOf[js.Any])
      
      inline def setFontVariationSettingsUndefined: Self = StObject.set(x, "fontVariationSettings", js.undefined)
      
      inline def setFontWeight(value: NumberProp): Self = StObject.set(x, "fontWeight", value.asInstanceOf[js.Any])
      
      inline def setFontWeightUndefined: Self = StObject.set(x, "fontWeight", js.undefined)
      
      inline def setKerning(value: NumberProp): Self = StObject.set(x, "kerning", value.asInstanceOf[js.Any])
      
      inline def setKerningUndefined: Self = StObject.set(x, "kerning", js.undefined)
      
      inline def setLetterSpacing(value: NumberProp): Self = StObject.set(x, "letterSpacing", value.asInstanceOf[js.Any])
      
      inline def setLetterSpacingUndefined: Self = StObject.set(x, "letterSpacing", js.undefined)
      
      inline def setTextAnchor(value: String): Self = StObject.set(x, "textAnchor", value.asInstanceOf[js.Any])
      
      inline def setTextAnchorUndefined: Self = StObject.set(x, "textAnchor", js.undefined)
      
      inline def setTextDecoration(value: String): Self = StObject.set(x, "textDecoration", value.asInstanceOf[js.Any])
      
      inline def setTextDecorationUndefined: Self = StObject.set(x, "textDecoration", js.undefined)
      
      inline def setWordSpacing(value: NumberProp): Self = StObject.set(x, "wordSpacing", value.asInstanceOf[js.Any])
      
      inline def setWordSpacingUndefined: Self = StObject.set(x, "wordSpacing", js.undefined)
    }
  }
}
