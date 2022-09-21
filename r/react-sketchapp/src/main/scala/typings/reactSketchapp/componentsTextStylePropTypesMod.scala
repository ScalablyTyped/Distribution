package typings.reactSketchapp

import typings.propTypes.mod.InferProps
import typings.propTypes.mod.Requireable
import typings.reactSketchapp.anon.Height
import typings.reactSketchapp.reactSketchappStrings.`column-reverse`
import typings.reactSketchapp.reactSketchappStrings.`flex-end`
import typings.reactSketchapp.reactSketchappStrings.`flex-start`
import typings.reactSketchapp.reactSketchappStrings.`line-through`
import typings.reactSketchapp.reactSketchappStrings.`row-reverse`
import typings.reactSketchapp.reactSketchappStrings.`space-around`
import typings.reactSketchapp.reactSketchappStrings.`space-between`
import typings.reactSketchapp.reactSketchappStrings.`wrap-reverse`
import typings.reactSketchapp.reactSketchappStrings.absolute
import typings.reactSketchapp.reactSketchappStrings.auto
import typings.reactSketchapp.reactSketchappStrings.baseline
import typings.reactSketchapp.reactSketchappStrings.center
import typings.reactSketchapp.reactSketchappStrings.column
import typings.reactSketchapp.reactSketchappStrings.dashed
import typings.reactSketchapp.reactSketchappStrings.dotted
import typings.reactSketchapp.reactSketchappStrings.double
import typings.reactSketchapp.reactSketchappStrings.hidden
import typings.reactSketchapp.reactSketchappStrings.italic
import typings.reactSketchapp.reactSketchappStrings.justify
import typings.reactSketchapp.reactSketchappStrings.left
import typings.reactSketchapp.reactSketchappStrings.lowercase
import typings.reactSketchapp.reactSketchappStrings.none
import typings.reactSketchapp.reactSketchappStrings.normal
import typings.reactSketchapp.reactSketchappStrings.nowrap
import typings.reactSketchapp.reactSketchappStrings.relative
import typings.reactSketchapp.reactSketchappStrings.right
import typings.reactSketchapp.reactSketchappStrings.row
import typings.reactSketchapp.reactSketchappStrings.scroll
import typings.reactSketchapp.reactSketchappStrings.solid
import typings.reactSketchapp.reactSketchappStrings.stretch
import typings.reactSketchapp.reactSketchappStrings.underline
import typings.reactSketchapp.reactSketchappStrings.uppercase
import typings.reactSketchapp.reactSketchappStrings.visible
import typings.reactSketchapp.reactSketchappStrings.wrap
import typings.std.NotificationDirection
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object componentsTextStylePropTypesMod {
  
  object TextStylePropTypes {
    
    @JSImport("react-sketchapp/lib/module/components/TextStylePropTypes", "TextStylePropTypes")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("react-sketchapp/lib/module/components/TextStylePropTypes", "TextStylePropTypes.alignContent")
    @js.native
    def alignContent: Requireable[
        auto | center | `space-around` | `space-between` | stretch | `flex-end` | `flex-start` | baseline
      ] = js.native
    inline def alignContent_=(
      x: Requireable[
          auto | center | `space-around` | `space-between` | stretch | `flex-end` | `flex-start` | baseline
        ]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("alignContent")(x.asInstanceOf[js.Any])
    
    @JSImport("react-sketchapp/lib/module/components/TextStylePropTypes", "TextStylePropTypes.alignItems")
    @js.native
    def alignItems: Requireable[center | stretch | `flex-end` | `flex-start` | baseline] = js.native
    inline def alignItems_=(x: Requireable[center | stretch | `flex-end` | `flex-start` | baseline]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("alignItems")(x.asInstanceOf[js.Any])
    
    @JSImport("react-sketchapp/lib/module/components/TextStylePropTypes", "TextStylePropTypes.alignSelf")
    @js.native
    def alignSelf: Requireable[auto | center | stretch | `flex-end` | `flex-start` | baseline] = js.native
    inline def alignSelf_=(x: Requireable[auto | center | stretch | `flex-end` | `flex-start` | baseline]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("alignSelf")(x.asInstanceOf[js.Any])
    
    @JSImport("react-sketchapp/lib/module/components/TextStylePropTypes", "TextStylePropTypes.aspectRatio")
    @js.native
    def aspectRatio: Requireable[Double] = js.native
    inline def aspectRatio_=(x: Requireable[Double]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("aspectRatio")(x.asInstanceOf[js.Any])
    
    @JSImport("react-sketchapp/lib/module/components/TextStylePropTypes", "TextStylePropTypes.backfaceVisibility")
    @js.native
    def backfaceVisibility: Requireable[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify VisibilityState */ Any
      ] = js.native
    inline def backfaceVisibility_=(
      x: Requireable[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify VisibilityState */ Any
        ]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("backfaceVisibility")(x.asInstanceOf[js.Any])
    
    @JSImport("react-sketchapp/lib/module/components/TextStylePropTypes", "TextStylePropTypes.backgroundColor")
    @js.native
    def backgroundColor: Requireable[String | Double] = js.native
    inline def backgroundColor_=(x: Requireable[String | Double]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("backgroundColor")(x.asInstanceOf[js.Any])
    
    @JSImport("react-sketchapp/lib/module/components/TextStylePropTypes", "TextStylePropTypes.borderBottomColor")
    @js.native
    def borderBottomColor: Requireable[String | Double] = js.native
    inline def borderBottomColor_=(x: Requireable[String | Double]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("borderBottomColor")(x.asInstanceOf[js.Any])
    
    @JSImport("react-sketchapp/lib/module/components/TextStylePropTypes", "TextStylePropTypes.borderBottomLeftRadius")
    @js.native
    def borderBottomLeftRadius: Requireable[Double] = js.native
    inline def borderBottomLeftRadius_=(x: Requireable[Double]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("borderBottomLeftRadius")(x.asInstanceOf[js.Any])
    
    @JSImport("react-sketchapp/lib/module/components/TextStylePropTypes", "TextStylePropTypes.borderBottomRightRadius")
    @js.native
    def borderBottomRightRadius: Requireable[Double] = js.native
    inline def borderBottomRightRadius_=(x: Requireable[Double]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("borderBottomRightRadius")(x.asInstanceOf[js.Any])
    
    @JSImport("react-sketchapp/lib/module/components/TextStylePropTypes", "TextStylePropTypes.borderBottomStyle")
    @js.native
    def borderBottomStyle: Requireable[dashed | dotted | solid] = js.native
    inline def borderBottomStyle_=(x: Requireable[dashed | dotted | solid]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("borderBottomStyle")(x.asInstanceOf[js.Any])
    
    @JSImport("react-sketchapp/lib/module/components/TextStylePropTypes", "TextStylePropTypes.borderBottomWidth")
    @js.native
    def borderBottomWidth: Requireable[Double] = js.native
    inline def borderBottomWidth_=(x: Requireable[Double]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("borderBottomWidth")(x.asInstanceOf[js.Any])
    
    @JSImport("react-sketchapp/lib/module/components/TextStylePropTypes", "TextStylePropTypes.borderColor")
    @js.native
    def borderColor: Requireable[String | Double] = js.native
    inline def borderColor_=(x: Requireable[String | Double]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("borderColor")(x.asInstanceOf[js.Any])
    
    @JSImport("react-sketchapp/lib/module/components/TextStylePropTypes", "TextStylePropTypes.borderLeftColor")
    @js.native
    def borderLeftColor: Requireable[String | Double] = js.native
    inline def borderLeftColor_=(x: Requireable[String | Double]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("borderLeftColor")(x.asInstanceOf[js.Any])
    
    @JSImport("react-sketchapp/lib/module/components/TextStylePropTypes", "TextStylePropTypes.borderLeftStyle")
    @js.native
    def borderLeftStyle: Requireable[dashed | dotted | solid] = js.native
    inline def borderLeftStyle_=(x: Requireable[dashed | dotted | solid]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("borderLeftStyle")(x.asInstanceOf[js.Any])
    
    @JSImport("react-sketchapp/lib/module/components/TextStylePropTypes", "TextStylePropTypes.borderLeftWidth")
    @js.native
    def borderLeftWidth: Requireable[Double] = js.native
    inline def borderLeftWidth_=(x: Requireable[Double]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("borderLeftWidth")(x.asInstanceOf[js.Any])
    
    @JSImport("react-sketchapp/lib/module/components/TextStylePropTypes", "TextStylePropTypes.borderRadius")
    @js.native
    def borderRadius: Requireable[Double] = js.native
    inline def borderRadius_=(x: Requireable[Double]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("borderRadius")(x.asInstanceOf[js.Any])
    
    @JSImport("react-sketchapp/lib/module/components/TextStylePropTypes", "TextStylePropTypes.borderRightColor")
    @js.native
    def borderRightColor: Requireable[String | Double] = js.native
    inline def borderRightColor_=(x: Requireable[String | Double]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("borderRightColor")(x.asInstanceOf[js.Any])
    
    @JSImport("react-sketchapp/lib/module/components/TextStylePropTypes", "TextStylePropTypes.borderRightStyle")
    @js.native
    def borderRightStyle: Requireable[dashed | dotted | solid] = js.native
    inline def borderRightStyle_=(x: Requireable[dashed | dotted | solid]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("borderRightStyle")(x.asInstanceOf[js.Any])
    
    @JSImport("react-sketchapp/lib/module/components/TextStylePropTypes", "TextStylePropTypes.borderRightWidth")
    @js.native
    def borderRightWidth: Requireable[Double] = js.native
    inline def borderRightWidth_=(x: Requireable[Double]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("borderRightWidth")(x.asInstanceOf[js.Any])
    
    @JSImport("react-sketchapp/lib/module/components/TextStylePropTypes", "TextStylePropTypes.borderStyle")
    @js.native
    def borderStyle: Requireable[dashed | dotted | solid] = js.native
    inline def borderStyle_=(x: Requireable[dashed | dotted | solid]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("borderStyle")(x.asInstanceOf[js.Any])
    
    @JSImport("react-sketchapp/lib/module/components/TextStylePropTypes", "TextStylePropTypes.borderTopColor")
    @js.native
    def borderTopColor: Requireable[String | Double] = js.native
    inline def borderTopColor_=(x: Requireable[String | Double]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("borderTopColor")(x.asInstanceOf[js.Any])
    
    @JSImport("react-sketchapp/lib/module/components/TextStylePropTypes", "TextStylePropTypes.borderTopLeftRadius")
    @js.native
    def borderTopLeftRadius: Requireable[Double] = js.native
    inline def borderTopLeftRadius_=(x: Requireable[Double]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("borderTopLeftRadius")(x.asInstanceOf[js.Any])
    
    @JSImport("react-sketchapp/lib/module/components/TextStylePropTypes", "TextStylePropTypes.borderTopRightRadius")
    @js.native
    def borderTopRightRadius: Requireable[Double] = js.native
    inline def borderTopRightRadius_=(x: Requireable[Double]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("borderTopRightRadius")(x.asInstanceOf[js.Any])
    
    @JSImport("react-sketchapp/lib/module/components/TextStylePropTypes", "TextStylePropTypes.borderTopStyle")
    @js.native
    def borderTopStyle: Requireable[dashed | dotted | solid] = js.native
    inline def borderTopStyle_=(x: Requireable[dashed | dotted | solid]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("borderTopStyle")(x.asInstanceOf[js.Any])
    
    @JSImport("react-sketchapp/lib/module/components/TextStylePropTypes", "TextStylePropTypes.borderTopWidth")
    @js.native
    def borderTopWidth: Requireable[Double] = js.native
    inline def borderTopWidth_=(x: Requireable[Double]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("borderTopWidth")(x.asInstanceOf[js.Any])
    
    @JSImport("react-sketchapp/lib/module/components/TextStylePropTypes", "TextStylePropTypes.borderWidth")
    @js.native
    def borderWidth: Requireable[Double] = js.native
    inline def borderWidth_=(x: Requireable[Double]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("borderWidth")(x.asInstanceOf[js.Any])
    
    @JSImport("react-sketchapp/lib/module/components/TextStylePropTypes", "TextStylePropTypes.bottom")
    @js.native
    def bottom: Requireable[Double] = js.native
    inline def bottom_=(x: Requireable[Double]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("bottom")(x.asInstanceOf[js.Any])
    
    @JSImport("react-sketchapp/lib/module/components/TextStylePropTypes", "TextStylePropTypes.color")
    @js.native
    def color: Requireable[String | Double] = js.native
    inline def color_=(x: Requireable[String | Double]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("color")(x.asInstanceOf[js.Any])
    
    @JSImport("react-sketchapp/lib/module/components/TextStylePropTypes", "TextStylePropTypes.display")
    @js.native
    def display: Requireable[String] = js.native
    inline def display_=(x: Requireable[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("display")(x.asInstanceOf[js.Any])
    
    @JSImport("react-sketchapp/lib/module/components/TextStylePropTypes", "TextStylePropTypes.flex")
    @js.native
    def flex: Requireable[Double] = js.native
    
    @JSImport("react-sketchapp/lib/module/components/TextStylePropTypes", "TextStylePropTypes.flexBasis")
    @js.native
    def flexBasis: Requireable[Double] = js.native
    inline def flexBasis_=(x: Requireable[Double]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("flexBasis")(x.asInstanceOf[js.Any])
    
    @JSImport("react-sketchapp/lib/module/components/TextStylePropTypes", "TextStylePropTypes.flexDirection")
    @js.native
    def flexDirection: Requireable[column | `column-reverse` | row | `row-reverse`] = js.native
    inline def flexDirection_=(x: Requireable[column | `column-reverse` | row | `row-reverse`]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("flexDirection")(x.asInstanceOf[js.Any])
    
    @JSImport("react-sketchapp/lib/module/components/TextStylePropTypes", "TextStylePropTypes.flexGrow")
    @js.native
    def flexGrow: Requireable[Double] = js.native
    inline def flexGrow_=(x: Requireable[Double]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("flexGrow")(x.asInstanceOf[js.Any])
    
    @JSImport("react-sketchapp/lib/module/components/TextStylePropTypes", "TextStylePropTypes.flexShrink")
    @js.native
    def flexShrink: Requireable[Double] = js.native
    inline def flexShrink_=(x: Requireable[Double]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("flexShrink")(x.asInstanceOf[js.Any])
    
    @JSImport("react-sketchapp/lib/module/components/TextStylePropTypes", "TextStylePropTypes.flexWrap")
    @js.native
    def flexWrap: Requireable[nowrap | wrap | `wrap-reverse`] = js.native
    inline def flexWrap_=(x: Requireable[nowrap | wrap | `wrap-reverse`]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("flexWrap")(x.asInstanceOf[js.Any])
    
    inline def flex_=(x: Requireable[Double]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("flex")(x.asInstanceOf[js.Any])
    
    @JSImport("react-sketchapp/lib/module/components/TextStylePropTypes", "TextStylePropTypes.fontFamily")
    @js.native
    def fontFamily: Requireable[String] = js.native
    inline def fontFamily_=(x: Requireable[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("fontFamily")(x.asInstanceOf[js.Any])
    
    @JSImport("react-sketchapp/lib/module/components/TextStylePropTypes", "TextStylePropTypes.fontSize")
    @js.native
    def fontSize: Requireable[Double] = js.native
    inline def fontSize_=(x: Requireable[Double]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("fontSize")(x.asInstanceOf[js.Any])
    
    @JSImport("react-sketchapp/lib/module/components/TextStylePropTypes", "TextStylePropTypes.fontStyle")
    @js.native
    def fontStyle: Requireable[normal | italic] = js.native
    inline def fontStyle_=(x: Requireable[normal | italic]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("fontStyle")(x.asInstanceOf[js.Any])
    
    @JSImport("react-sketchapp/lib/module/components/TextStylePropTypes", "TextStylePropTypes.fontWeight")
    @js.native
    def fontWeight: Requireable[String | Double] = js.native
    inline def fontWeight_=(x: Requireable[String | Double]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("fontWeight")(x.asInstanceOf[js.Any])
    
    @JSImport("react-sketchapp/lib/module/components/TextStylePropTypes", "TextStylePropTypes.height")
    @js.native
    def height: Requireable[Double] = js.native
    inline def height_=(x: Requireable[Double]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("height")(x.asInstanceOf[js.Any])
    
    @JSImport("react-sketchapp/lib/module/components/TextStylePropTypes", "TextStylePropTypes.justifyContent")
    @js.native
    def justifyContent: Requireable[center | `space-around` | `space-between` | `flex-end` | `flex-start`] = js.native
    inline def justifyContent_=(x: Requireable[center | `space-around` | `space-between` | `flex-end` | `flex-start`]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("justifyContent")(x.asInstanceOf[js.Any])
    
    @JSImport("react-sketchapp/lib/module/components/TextStylePropTypes", "TextStylePropTypes.left")
    @js.native
    def left: Requireable[Double] = js.native
    inline def left_=(x: Requireable[Double]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("left")(x.asInstanceOf[js.Any])
    
    @JSImport("react-sketchapp/lib/module/components/TextStylePropTypes", "TextStylePropTypes.letterSpacing")
    @js.native
    def letterSpacing: Requireable[Double] = js.native
    inline def letterSpacing_=(x: Requireable[Double]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("letterSpacing")(x.asInstanceOf[js.Any])
    
    @JSImport("react-sketchapp/lib/module/components/TextStylePropTypes", "TextStylePropTypes.lineHeight")
    @js.native
    def lineHeight: Requireable[Double] = js.native
    inline def lineHeight_=(x: Requireable[Double]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("lineHeight")(x.asInstanceOf[js.Any])
    
    @JSImport("react-sketchapp/lib/module/components/TextStylePropTypes", "TextStylePropTypes.margin")
    @js.native
    def margin: Requireable[Double] = js.native
    
    @JSImport("react-sketchapp/lib/module/components/TextStylePropTypes", "TextStylePropTypes.marginBottom")
    @js.native
    def marginBottom: Requireable[Double] = js.native
    inline def marginBottom_=(x: Requireable[Double]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("marginBottom")(x.asInstanceOf[js.Any])
    
    @JSImport("react-sketchapp/lib/module/components/TextStylePropTypes", "TextStylePropTypes.marginHorizontal")
    @js.native
    def marginHorizontal: Requireable[Double] = js.native
    inline def marginHorizontal_=(x: Requireable[Double]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("marginHorizontal")(x.asInstanceOf[js.Any])
    
    @JSImport("react-sketchapp/lib/module/components/TextStylePropTypes", "TextStylePropTypes.marginLeft")
    @js.native
    def marginLeft: Requireable[Double] = js.native
    inline def marginLeft_=(x: Requireable[Double]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("marginLeft")(x.asInstanceOf[js.Any])
    
    @JSImport("react-sketchapp/lib/module/components/TextStylePropTypes", "TextStylePropTypes.marginRight")
    @js.native
    def marginRight: Requireable[Double] = js.native
    inline def marginRight_=(x: Requireable[Double]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("marginRight")(x.asInstanceOf[js.Any])
    
    @JSImport("react-sketchapp/lib/module/components/TextStylePropTypes", "TextStylePropTypes.marginTop")
    @js.native
    def marginTop: Requireable[Double] = js.native
    inline def marginTop_=(x: Requireable[Double]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("marginTop")(x.asInstanceOf[js.Any])
    
    @JSImport("react-sketchapp/lib/module/components/TextStylePropTypes", "TextStylePropTypes.marginVertical")
    @js.native
    def marginVertical: Requireable[Double] = js.native
    inline def marginVertical_=(x: Requireable[Double]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("marginVertical")(x.asInstanceOf[js.Any])
    
    inline def margin_=(x: Requireable[Double]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("margin")(x.asInstanceOf[js.Any])
    
    @JSImport("react-sketchapp/lib/module/components/TextStylePropTypes", "TextStylePropTypes.maxHeight")
    @js.native
    def maxHeight: Requireable[Double] = js.native
    inline def maxHeight_=(x: Requireable[Double]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("maxHeight")(x.asInstanceOf[js.Any])
    
    @JSImport("react-sketchapp/lib/module/components/TextStylePropTypes", "TextStylePropTypes.maxWidth")
    @js.native
    def maxWidth: Requireable[Double] = js.native
    inline def maxWidth_=(x: Requireable[Double]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("maxWidth")(x.asInstanceOf[js.Any])
    
    @JSImport("react-sketchapp/lib/module/components/TextStylePropTypes", "TextStylePropTypes.minHeight")
    @js.native
    def minHeight: Requireable[Double] = js.native
    inline def minHeight_=(x: Requireable[Double]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("minHeight")(x.asInstanceOf[js.Any])
    
    @JSImport("react-sketchapp/lib/module/components/TextStylePropTypes", "TextStylePropTypes.minWidth")
    @js.native
    def minWidth: Requireable[Double] = js.native
    inline def minWidth_=(x: Requireable[Double]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("minWidth")(x.asInstanceOf[js.Any])
    
    @JSImport("react-sketchapp/lib/module/components/TextStylePropTypes", "TextStylePropTypes.opacity")
    @js.native
    def opacity: Requireable[Double] = js.native
    inline def opacity_=(x: Requireable[Double]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("opacity")(x.asInstanceOf[js.Any])
    
    @JSImport("react-sketchapp/lib/module/components/TextStylePropTypes", "TextStylePropTypes.overflow")
    @js.native
    def overflow: Requireable[hidden | visible | scroll] = js.native
    
    @JSImport("react-sketchapp/lib/module/components/TextStylePropTypes", "TextStylePropTypes.overflowX")
    @js.native
    def overflowX: Requireable[hidden | visible | scroll] = js.native
    inline def overflowX_=(x: Requireable[hidden | visible | scroll]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("overflowX")(x.asInstanceOf[js.Any])
    
    @JSImport("react-sketchapp/lib/module/components/TextStylePropTypes", "TextStylePropTypes.overflowY")
    @js.native
    def overflowY: Requireable[hidden | visible | scroll] = js.native
    inline def overflowY_=(x: Requireable[hidden | visible | scroll]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("overflowY")(x.asInstanceOf[js.Any])
    
    inline def overflow_=(x: Requireable[hidden | visible | scroll]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("overflow")(x.asInstanceOf[js.Any])
    
    @JSImport("react-sketchapp/lib/module/components/TextStylePropTypes", "TextStylePropTypes.padding")
    @js.native
    def padding: Requireable[Double] = js.native
    
    @JSImport("react-sketchapp/lib/module/components/TextStylePropTypes", "TextStylePropTypes.paddingBottom")
    @js.native
    def paddingBottom: Requireable[Double] = js.native
    inline def paddingBottom_=(x: Requireable[Double]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("paddingBottom")(x.asInstanceOf[js.Any])
    
    @JSImport("react-sketchapp/lib/module/components/TextStylePropTypes", "TextStylePropTypes.paddingHorizontal")
    @js.native
    def paddingHorizontal: Requireable[Double] = js.native
    inline def paddingHorizontal_=(x: Requireable[Double]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("paddingHorizontal")(x.asInstanceOf[js.Any])
    
    @JSImport("react-sketchapp/lib/module/components/TextStylePropTypes", "TextStylePropTypes.paddingLeft")
    @js.native
    def paddingLeft: Requireable[Double] = js.native
    inline def paddingLeft_=(x: Requireable[Double]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("paddingLeft")(x.asInstanceOf[js.Any])
    
    @JSImport("react-sketchapp/lib/module/components/TextStylePropTypes", "TextStylePropTypes.paddingRight")
    @js.native
    def paddingRight: Requireable[Double] = js.native
    inline def paddingRight_=(x: Requireable[Double]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("paddingRight")(x.asInstanceOf[js.Any])
    
    @JSImport("react-sketchapp/lib/module/components/TextStylePropTypes", "TextStylePropTypes.paddingTop")
    @js.native
    def paddingTop: Requireable[Double] = js.native
    inline def paddingTop_=(x: Requireable[Double]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("paddingTop")(x.asInstanceOf[js.Any])
    
    @JSImport("react-sketchapp/lib/module/components/TextStylePropTypes", "TextStylePropTypes.paddingVertical")
    @js.native
    def paddingVertical: Requireable[Double] = js.native
    inline def paddingVertical_=(x: Requireable[Double]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("paddingVertical")(x.asInstanceOf[js.Any])
    
    inline def padding_=(x: Requireable[Double]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("padding")(x.asInstanceOf[js.Any])
    
    @JSImport("react-sketchapp/lib/module/components/TextStylePropTypes", "TextStylePropTypes.paragraphSpacing")
    @js.native
    def paragraphSpacing: Requireable[Double] = js.native
    inline def paragraphSpacing_=(x: Requireable[Double]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("paragraphSpacing")(x.asInstanceOf[js.Any])
    
    @JSImport("react-sketchapp/lib/module/components/TextStylePropTypes", "TextStylePropTypes.position")
    @js.native
    def position: Requireable[absolute | relative] = js.native
    inline def position_=(x: Requireable[absolute | relative]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("position")(x.asInstanceOf[js.Any])
    
    @JSImport("react-sketchapp/lib/module/components/TextStylePropTypes", "TextStylePropTypes.right")
    @js.native
    def right: Requireable[Double] = js.native
    inline def right_=(x: Requireable[Double]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("right")(x.asInstanceOf[js.Any])
    
    @JSImport("react-sketchapp/lib/module/components/TextStylePropTypes", "TextStylePropTypes.shadowColor")
    @js.native
    def shadowColor: Requireable[String | Double] = js.native
    inline def shadowColor_=(x: Requireable[String | Double]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("shadowColor")(x.asInstanceOf[js.Any])
    
    @JSImport("react-sketchapp/lib/module/components/TextStylePropTypes", "TextStylePropTypes.shadowInner")
    @js.native
    def shadowInner: Requireable[Boolean] = js.native
    inline def shadowInner_=(x: Requireable[Boolean]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("shadowInner")(x.asInstanceOf[js.Any])
    
    @JSImport("react-sketchapp/lib/module/components/TextStylePropTypes", "TextStylePropTypes.shadowOffset")
    @js.native
    def shadowOffset: Requireable[InferProps[Height]] = js.native
    inline def shadowOffset_=(x: Requireable[InferProps[Height]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("shadowOffset")(x.asInstanceOf[js.Any])
    
    @JSImport("react-sketchapp/lib/module/components/TextStylePropTypes", "TextStylePropTypes.shadowOpacity")
    @js.native
    def shadowOpacity: Requireable[Double] = js.native
    inline def shadowOpacity_=(x: Requireable[Double]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("shadowOpacity")(x.asInstanceOf[js.Any])
    
    @JSImport("react-sketchapp/lib/module/components/TextStylePropTypes", "TextStylePropTypes.shadowRadius")
    @js.native
    def shadowRadius: Requireable[Double] = js.native
    inline def shadowRadius_=(x: Requireable[Double]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("shadowRadius")(x.asInstanceOf[js.Any])
    
    @JSImport("react-sketchapp/lib/module/components/TextStylePropTypes", "TextStylePropTypes.shadowSpread")
    @js.native
    def shadowSpread: Requireable[Double] = js.native
    inline def shadowSpread_=(x: Requireable[Double]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("shadowSpread")(x.asInstanceOf[js.Any])
    
    @JSImport("react-sketchapp/lib/module/components/TextStylePropTypes", "TextStylePropTypes.textAlign")
    @js.native
    def textAlign: Requireable[auto | left | right | center | justify] = js.native
    inline def textAlign_=(x: Requireable[auto | left | right | center | justify]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("textAlign")(x.asInstanceOf[js.Any])
    
    @JSImport("react-sketchapp/lib/module/components/TextStylePropTypes", "TextStylePropTypes.textDecoration")
    @js.native
    def textDecoration: Requireable[none | double | `line-through` | underline] = js.native
    inline def textDecoration_=(x: Requireable[none | double | `line-through` | underline]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("textDecoration")(x.asInstanceOf[js.Any])
    
    @JSImport("react-sketchapp/lib/module/components/TextStylePropTypes", "TextStylePropTypes.textShadowColor")
    @js.native
    def textShadowColor: Requireable[String | Double] = js.native
    inline def textShadowColor_=(x: Requireable[String | Double]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("textShadowColor")(x.asInstanceOf[js.Any])
    
    @JSImport("react-sketchapp/lib/module/components/TextStylePropTypes", "TextStylePropTypes.textShadowOffset")
    @js.native
    def textShadowOffset: Requireable[InferProps[Height]] = js.native
    inline def textShadowOffset_=(x: Requireable[InferProps[Height]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("textShadowOffset")(x.asInstanceOf[js.Any])
    
    @JSImport("react-sketchapp/lib/module/components/TextStylePropTypes", "TextStylePropTypes.textShadowOpacity")
    @js.native
    def textShadowOpacity: Requireable[Double] = js.native
    inline def textShadowOpacity_=(x: Requireable[Double]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("textShadowOpacity")(x.asInstanceOf[js.Any])
    
    @JSImport("react-sketchapp/lib/module/components/TextStylePropTypes", "TextStylePropTypes.textShadowRadius")
    @js.native
    def textShadowRadius: Requireable[Double] = js.native
    inline def textShadowRadius_=(x: Requireable[Double]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("textShadowRadius")(x.asInstanceOf[js.Any])
    
    @JSImport("react-sketchapp/lib/module/components/TextStylePropTypes", "TextStylePropTypes.textShadowSpread")
    @js.native
    def textShadowSpread: Requireable[Double] = js.native
    inline def textShadowSpread_=(x: Requireable[Double]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("textShadowSpread")(x.asInstanceOf[js.Any])
    
    @JSImport("react-sketchapp/lib/module/components/TextStylePropTypes", "TextStylePropTypes.textTransform")
    @js.native
    def textTransform: Requireable[lowercase | uppercase] = js.native
    inline def textTransform_=(x: Requireable[lowercase | uppercase]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("textTransform")(x.asInstanceOf[js.Any])
    
    @JSImport("react-sketchapp/lib/module/components/TextStylePropTypes", "TextStylePropTypes.top")
    @js.native
    def top: Requireable[Double] = js.native
    inline def top_=(x: Requireable[Double]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("top")(x.asInstanceOf[js.Any])
    
    @JSImport("react-sketchapp/lib/module/components/TextStylePropTypes", "TextStylePropTypes.transform")
    @js.native
    def transform: Requireable[String] = js.native
    
    @JSImport("react-sketchapp/lib/module/components/TextStylePropTypes", "TextStylePropTypes.transformOrigin")
    @js.native
    def transformOrigin: Requireable[String] = js.native
    inline def transformOrigin_=(x: Requireable[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("transformOrigin")(x.asInstanceOf[js.Any])
    
    inline def transform_=(x: Requireable[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("transform")(x.asInstanceOf[js.Any])
    
    @JSImport("react-sketchapp/lib/module/components/TextStylePropTypes", "TextStylePropTypes.width")
    @js.native
    def width: Requireable[Double] = js.native
    inline def width_=(x: Requireable[Double]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("width")(x.asInstanceOf[js.Any])
    
    @JSImport("react-sketchapp/lib/module/components/TextStylePropTypes", "TextStylePropTypes.writingDirection")
    @js.native
    def writingDirection: Requireable[NotificationDirection] = js.native
    inline def writingDirection_=(x: Requireable[NotificationDirection]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("writingDirection")(x.asInstanceOf[js.Any])
    
    @JSImport("react-sketchapp/lib/module/components/TextStylePropTypes", "TextStylePropTypes.zIndex")
    @js.native
    def zIndex: Requireable[Double] = js.native
    inline def zIndex_=(x: Requireable[Double]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("zIndex")(x.asInstanceOf[js.Any])
  }
}
