package typings.reactSketchapp

import typings.propTypes.mod.InferProps
import typings.propTypes.mod.Requireable
import typings.reactSketchapp.anon.Height
import typings.reactSketchapp.reactSketchappStrings.`column-reverse`
import typings.reactSketchapp.reactSketchappStrings.`flex-end`
import typings.reactSketchapp.reactSketchappStrings.`flex-start`
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
import typings.reactSketchapp.reactSketchappStrings.hidden
import typings.reactSketchapp.reactSketchappStrings.nowrap
import typings.reactSketchapp.reactSketchappStrings.relative
import typings.reactSketchapp.reactSketchappStrings.row
import typings.reactSketchapp.reactSketchappStrings.scroll
import typings.reactSketchapp.reactSketchappStrings.solid
import typings.reactSketchapp.reactSketchappStrings.stretch
import typings.reactSketchapp.reactSketchappStrings.visible
import typings.reactSketchapp.reactSketchappStrings.wrap
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object viewStylePropTypesMod {
  
  @JSImport("react-sketchapp/lib/components/ViewStylePropTypes", "BorderStyle")
  @js.native
  val BorderStyle: Requireable[dashed | dotted | solid] = js.native
  
  @JSImport("react-sketchapp/lib/components/ViewStylePropTypes", "Color")
  @js.native
  val Color: Requireable[String | Double] = js.native
  
  @JSImport("react-sketchapp/lib/components/ViewStylePropTypes", "Overflow")
  @js.native
  val Overflow: Requireable[hidden | visible | scroll] = js.native
  
  object ViewStylePropTypes {
    
    @JSImport("react-sketchapp/lib/components/ViewStylePropTypes", "ViewStylePropTypes")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("react-sketchapp/lib/components/ViewStylePropTypes", "ViewStylePropTypes.alignContent")
    @js.native
    def alignContent: Requireable[
        auto | center | `space-around` | `space-between` | stretch | `flex-end` | `flex-start` | baseline
      ] = js.native
    inline def alignContent_=(
      x: Requireable[
          auto | center | `space-around` | `space-between` | stretch | `flex-end` | `flex-start` | baseline
        ]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("alignContent")(x.asInstanceOf[js.Any])
    
    @JSImport("react-sketchapp/lib/components/ViewStylePropTypes", "ViewStylePropTypes.alignItems")
    @js.native
    def alignItems: Requireable[center | stretch | `flex-end` | `flex-start` | baseline] = js.native
    inline def alignItems_=(x: Requireable[center | stretch | `flex-end` | `flex-start` | baseline]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("alignItems")(x.asInstanceOf[js.Any])
    
    @JSImport("react-sketchapp/lib/components/ViewStylePropTypes", "ViewStylePropTypes.alignSelf")
    @js.native
    def alignSelf: Requireable[auto | center | stretch | `flex-end` | `flex-start` | baseline] = js.native
    inline def alignSelf_=(x: Requireable[auto | center | stretch | `flex-end` | `flex-start` | baseline]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("alignSelf")(x.asInstanceOf[js.Any])
    
    @JSImport("react-sketchapp/lib/components/ViewStylePropTypes", "ViewStylePropTypes.aspectRatio")
    @js.native
    def aspectRatio: Requireable[Double] = js.native
    inline def aspectRatio_=(x: Requireable[Double]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("aspectRatio")(x.asInstanceOf[js.Any])
    
    @JSImport("react-sketchapp/lib/components/ViewStylePropTypes", "ViewStylePropTypes.backfaceVisibility")
    @js.native
    def backfaceVisibility: Requireable[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify VisibilityState */ Any
      ] = js.native
    inline def backfaceVisibility_=(
      x: Requireable[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify VisibilityState */ Any
        ]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("backfaceVisibility")(x.asInstanceOf[js.Any])
    
    @JSImport("react-sketchapp/lib/components/ViewStylePropTypes", "ViewStylePropTypes.backgroundColor")
    @js.native
    def backgroundColor: Requireable[String | Double] = js.native
    inline def backgroundColor_=(x: Requireable[String | Double]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("backgroundColor")(x.asInstanceOf[js.Any])
    
    @JSImport("react-sketchapp/lib/components/ViewStylePropTypes", "ViewStylePropTypes.borderBottomColor")
    @js.native
    def borderBottomColor: Requireable[String | Double] = js.native
    inline def borderBottomColor_=(x: Requireable[String | Double]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("borderBottomColor")(x.asInstanceOf[js.Any])
    
    @JSImport("react-sketchapp/lib/components/ViewStylePropTypes", "ViewStylePropTypes.borderBottomLeftRadius")
    @js.native
    def borderBottomLeftRadius: Requireable[Double] = js.native
    inline def borderBottomLeftRadius_=(x: Requireable[Double]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("borderBottomLeftRadius")(x.asInstanceOf[js.Any])
    
    @JSImport("react-sketchapp/lib/components/ViewStylePropTypes", "ViewStylePropTypes.borderBottomRightRadius")
    @js.native
    def borderBottomRightRadius: Requireable[Double] = js.native
    inline def borderBottomRightRadius_=(x: Requireable[Double]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("borderBottomRightRadius")(x.asInstanceOf[js.Any])
    
    @JSImport("react-sketchapp/lib/components/ViewStylePropTypes", "ViewStylePropTypes.borderBottomStyle")
    @js.native
    def borderBottomStyle: Requireable[dashed | dotted | solid] = js.native
    inline def borderBottomStyle_=(x: Requireable[dashed | dotted | solid]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("borderBottomStyle")(x.asInstanceOf[js.Any])
    
    @JSImport("react-sketchapp/lib/components/ViewStylePropTypes", "ViewStylePropTypes.borderBottomWidth")
    @js.native
    def borderBottomWidth: Requireable[Double] = js.native
    inline def borderBottomWidth_=(x: Requireable[Double]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("borderBottomWidth")(x.asInstanceOf[js.Any])
    
    @JSImport("react-sketchapp/lib/components/ViewStylePropTypes", "ViewStylePropTypes.borderColor")
    @js.native
    def borderColor: Requireable[String | Double] = js.native
    inline def borderColor_=(x: Requireable[String | Double]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("borderColor")(x.asInstanceOf[js.Any])
    
    @JSImport("react-sketchapp/lib/components/ViewStylePropTypes", "ViewStylePropTypes.borderLeftColor")
    @js.native
    def borderLeftColor: Requireable[String | Double] = js.native
    inline def borderLeftColor_=(x: Requireable[String | Double]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("borderLeftColor")(x.asInstanceOf[js.Any])
    
    @JSImport("react-sketchapp/lib/components/ViewStylePropTypes", "ViewStylePropTypes.borderLeftStyle")
    @js.native
    def borderLeftStyle: Requireable[dashed | dotted | solid] = js.native
    inline def borderLeftStyle_=(x: Requireable[dashed | dotted | solid]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("borderLeftStyle")(x.asInstanceOf[js.Any])
    
    @JSImport("react-sketchapp/lib/components/ViewStylePropTypes", "ViewStylePropTypes.borderLeftWidth")
    @js.native
    def borderLeftWidth: Requireable[Double] = js.native
    inline def borderLeftWidth_=(x: Requireable[Double]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("borderLeftWidth")(x.asInstanceOf[js.Any])
    
    @JSImport("react-sketchapp/lib/components/ViewStylePropTypes", "ViewStylePropTypes.borderRadius")
    @js.native
    def borderRadius: Requireable[Double] = js.native
    inline def borderRadius_=(x: Requireable[Double]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("borderRadius")(x.asInstanceOf[js.Any])
    
    @JSImport("react-sketchapp/lib/components/ViewStylePropTypes", "ViewStylePropTypes.borderRightColor")
    @js.native
    def borderRightColor: Requireable[String | Double] = js.native
    inline def borderRightColor_=(x: Requireable[String | Double]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("borderRightColor")(x.asInstanceOf[js.Any])
    
    @JSImport("react-sketchapp/lib/components/ViewStylePropTypes", "ViewStylePropTypes.borderRightStyle")
    @js.native
    def borderRightStyle: Requireable[dashed | dotted | solid] = js.native
    inline def borderRightStyle_=(x: Requireable[dashed | dotted | solid]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("borderRightStyle")(x.asInstanceOf[js.Any])
    
    @JSImport("react-sketchapp/lib/components/ViewStylePropTypes", "ViewStylePropTypes.borderRightWidth")
    @js.native
    def borderRightWidth: Requireable[Double] = js.native
    inline def borderRightWidth_=(x: Requireable[Double]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("borderRightWidth")(x.asInstanceOf[js.Any])
    
    @JSImport("react-sketchapp/lib/components/ViewStylePropTypes", "ViewStylePropTypes.borderStyle")
    @js.native
    def borderStyle: Requireable[dashed | dotted | solid] = js.native
    inline def borderStyle_=(x: Requireable[dashed | dotted | solid]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("borderStyle")(x.asInstanceOf[js.Any])
    
    @JSImport("react-sketchapp/lib/components/ViewStylePropTypes", "ViewStylePropTypes.borderTopColor")
    @js.native
    def borderTopColor: Requireable[String | Double] = js.native
    inline def borderTopColor_=(x: Requireable[String | Double]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("borderTopColor")(x.asInstanceOf[js.Any])
    
    @JSImport("react-sketchapp/lib/components/ViewStylePropTypes", "ViewStylePropTypes.borderTopLeftRadius")
    @js.native
    def borderTopLeftRadius: Requireable[Double] = js.native
    inline def borderTopLeftRadius_=(x: Requireable[Double]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("borderTopLeftRadius")(x.asInstanceOf[js.Any])
    
    @JSImport("react-sketchapp/lib/components/ViewStylePropTypes", "ViewStylePropTypes.borderTopRightRadius")
    @js.native
    def borderTopRightRadius: Requireable[Double] = js.native
    inline def borderTopRightRadius_=(x: Requireable[Double]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("borderTopRightRadius")(x.asInstanceOf[js.Any])
    
    @JSImport("react-sketchapp/lib/components/ViewStylePropTypes", "ViewStylePropTypes.borderTopStyle")
    @js.native
    def borderTopStyle: Requireable[dashed | dotted | solid] = js.native
    inline def borderTopStyle_=(x: Requireable[dashed | dotted | solid]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("borderTopStyle")(x.asInstanceOf[js.Any])
    
    @JSImport("react-sketchapp/lib/components/ViewStylePropTypes", "ViewStylePropTypes.borderTopWidth")
    @js.native
    def borderTopWidth: Requireable[Double] = js.native
    inline def borderTopWidth_=(x: Requireable[Double]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("borderTopWidth")(x.asInstanceOf[js.Any])
    
    @JSImport("react-sketchapp/lib/components/ViewStylePropTypes", "ViewStylePropTypes.borderWidth")
    @js.native
    def borderWidth: Requireable[Double] = js.native
    inline def borderWidth_=(x: Requireable[Double]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("borderWidth")(x.asInstanceOf[js.Any])
    
    @JSImport("react-sketchapp/lib/components/ViewStylePropTypes", "ViewStylePropTypes.bottom")
    @js.native
    def bottom: Requireable[Double] = js.native
    inline def bottom_=(x: Requireable[Double]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("bottom")(x.asInstanceOf[js.Any])
    
    @JSImport("react-sketchapp/lib/components/ViewStylePropTypes", "ViewStylePropTypes.color")
    @js.native
    def color: Requireable[String | Double] = js.native
    inline def color_=(x: Requireable[String | Double]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("color")(x.asInstanceOf[js.Any])
    
    @JSImport("react-sketchapp/lib/components/ViewStylePropTypes", "ViewStylePropTypes.display")
    @js.native
    def display: Requireable[String] = js.native
    inline def display_=(x: Requireable[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("display")(x.asInstanceOf[js.Any])
    
    @JSImport("react-sketchapp/lib/components/ViewStylePropTypes", "ViewStylePropTypes.flex")
    @js.native
    def flex: Requireable[Double] = js.native
    
    @JSImport("react-sketchapp/lib/components/ViewStylePropTypes", "ViewStylePropTypes.flexBasis")
    @js.native
    def flexBasis: Requireable[Double] = js.native
    inline def flexBasis_=(x: Requireable[Double]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("flexBasis")(x.asInstanceOf[js.Any])
    
    @JSImport("react-sketchapp/lib/components/ViewStylePropTypes", "ViewStylePropTypes.flexDirection")
    @js.native
    def flexDirection: Requireable[column | `column-reverse` | row | `row-reverse`] = js.native
    inline def flexDirection_=(x: Requireable[column | `column-reverse` | row | `row-reverse`]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("flexDirection")(x.asInstanceOf[js.Any])
    
    @JSImport("react-sketchapp/lib/components/ViewStylePropTypes", "ViewStylePropTypes.flexGrow")
    @js.native
    def flexGrow: Requireable[Double] = js.native
    inline def flexGrow_=(x: Requireable[Double]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("flexGrow")(x.asInstanceOf[js.Any])
    
    @JSImport("react-sketchapp/lib/components/ViewStylePropTypes", "ViewStylePropTypes.flexShrink")
    @js.native
    def flexShrink: Requireable[Double] = js.native
    inline def flexShrink_=(x: Requireable[Double]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("flexShrink")(x.asInstanceOf[js.Any])
    
    @JSImport("react-sketchapp/lib/components/ViewStylePropTypes", "ViewStylePropTypes.flexWrap")
    @js.native
    def flexWrap: Requireable[nowrap | wrap | `wrap-reverse`] = js.native
    inline def flexWrap_=(x: Requireable[nowrap | wrap | `wrap-reverse`]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("flexWrap")(x.asInstanceOf[js.Any])
    
    inline def flex_=(x: Requireable[Double]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("flex")(x.asInstanceOf[js.Any])
    
    @JSImport("react-sketchapp/lib/components/ViewStylePropTypes", "ViewStylePropTypes.height")
    @js.native
    def height: Requireable[Double] = js.native
    inline def height_=(x: Requireable[Double]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("height")(x.asInstanceOf[js.Any])
    
    @JSImport("react-sketchapp/lib/components/ViewStylePropTypes", "ViewStylePropTypes.justifyContent")
    @js.native
    def justifyContent: Requireable[center | `space-around` | `space-between` | `flex-end` | `flex-start`] = js.native
    inline def justifyContent_=(x: Requireable[center | `space-around` | `space-between` | `flex-end` | `flex-start`]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("justifyContent")(x.asInstanceOf[js.Any])
    
    @JSImport("react-sketchapp/lib/components/ViewStylePropTypes", "ViewStylePropTypes.left")
    @js.native
    def left: Requireable[Double] = js.native
    inline def left_=(x: Requireable[Double]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("left")(x.asInstanceOf[js.Any])
    
    @JSImport("react-sketchapp/lib/components/ViewStylePropTypes", "ViewStylePropTypes.margin")
    @js.native
    def margin: Requireable[Double] = js.native
    
    @JSImport("react-sketchapp/lib/components/ViewStylePropTypes", "ViewStylePropTypes.marginBottom")
    @js.native
    def marginBottom: Requireable[Double] = js.native
    inline def marginBottom_=(x: Requireable[Double]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("marginBottom")(x.asInstanceOf[js.Any])
    
    @JSImport("react-sketchapp/lib/components/ViewStylePropTypes", "ViewStylePropTypes.marginHorizontal")
    @js.native
    def marginHorizontal: Requireable[Double] = js.native
    inline def marginHorizontal_=(x: Requireable[Double]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("marginHorizontal")(x.asInstanceOf[js.Any])
    
    @JSImport("react-sketchapp/lib/components/ViewStylePropTypes", "ViewStylePropTypes.marginLeft")
    @js.native
    def marginLeft: Requireable[Double] = js.native
    inline def marginLeft_=(x: Requireable[Double]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("marginLeft")(x.asInstanceOf[js.Any])
    
    @JSImport("react-sketchapp/lib/components/ViewStylePropTypes", "ViewStylePropTypes.marginRight")
    @js.native
    def marginRight: Requireable[Double] = js.native
    inline def marginRight_=(x: Requireable[Double]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("marginRight")(x.asInstanceOf[js.Any])
    
    @JSImport("react-sketchapp/lib/components/ViewStylePropTypes", "ViewStylePropTypes.marginTop")
    @js.native
    def marginTop: Requireable[Double] = js.native
    inline def marginTop_=(x: Requireable[Double]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("marginTop")(x.asInstanceOf[js.Any])
    
    @JSImport("react-sketchapp/lib/components/ViewStylePropTypes", "ViewStylePropTypes.marginVertical")
    @js.native
    def marginVertical: Requireable[Double] = js.native
    inline def marginVertical_=(x: Requireable[Double]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("marginVertical")(x.asInstanceOf[js.Any])
    
    inline def margin_=(x: Requireable[Double]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("margin")(x.asInstanceOf[js.Any])
    
    @JSImport("react-sketchapp/lib/components/ViewStylePropTypes", "ViewStylePropTypes.maxHeight")
    @js.native
    def maxHeight: Requireable[Double] = js.native
    inline def maxHeight_=(x: Requireable[Double]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("maxHeight")(x.asInstanceOf[js.Any])
    
    @JSImport("react-sketchapp/lib/components/ViewStylePropTypes", "ViewStylePropTypes.maxWidth")
    @js.native
    def maxWidth: Requireable[Double] = js.native
    inline def maxWidth_=(x: Requireable[Double]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("maxWidth")(x.asInstanceOf[js.Any])
    
    @JSImport("react-sketchapp/lib/components/ViewStylePropTypes", "ViewStylePropTypes.minHeight")
    @js.native
    def minHeight: Requireable[Double] = js.native
    inline def minHeight_=(x: Requireable[Double]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("minHeight")(x.asInstanceOf[js.Any])
    
    @JSImport("react-sketchapp/lib/components/ViewStylePropTypes", "ViewStylePropTypes.minWidth")
    @js.native
    def minWidth: Requireable[Double] = js.native
    inline def minWidth_=(x: Requireable[Double]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("minWidth")(x.asInstanceOf[js.Any])
    
    @JSImport("react-sketchapp/lib/components/ViewStylePropTypes", "ViewStylePropTypes.opacity")
    @js.native
    def opacity: Requireable[Double] = js.native
    inline def opacity_=(x: Requireable[Double]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("opacity")(x.asInstanceOf[js.Any])
    
    @JSImport("react-sketchapp/lib/components/ViewStylePropTypes", "ViewStylePropTypes.overflow")
    @js.native
    def overflow: Requireable[hidden | visible | scroll] = js.native
    
    @JSImport("react-sketchapp/lib/components/ViewStylePropTypes", "ViewStylePropTypes.overflowX")
    @js.native
    def overflowX: Requireable[hidden | visible | scroll] = js.native
    inline def overflowX_=(x: Requireable[hidden | visible | scroll]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("overflowX")(x.asInstanceOf[js.Any])
    
    @JSImport("react-sketchapp/lib/components/ViewStylePropTypes", "ViewStylePropTypes.overflowY")
    @js.native
    def overflowY: Requireable[hidden | visible | scroll] = js.native
    inline def overflowY_=(x: Requireable[hidden | visible | scroll]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("overflowY")(x.asInstanceOf[js.Any])
    
    inline def overflow_=(x: Requireable[hidden | visible | scroll]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("overflow")(x.asInstanceOf[js.Any])
    
    @JSImport("react-sketchapp/lib/components/ViewStylePropTypes", "ViewStylePropTypes.padding")
    @js.native
    def padding: Requireable[Double] = js.native
    
    @JSImport("react-sketchapp/lib/components/ViewStylePropTypes", "ViewStylePropTypes.paddingBottom")
    @js.native
    def paddingBottom: Requireable[Double] = js.native
    inline def paddingBottom_=(x: Requireable[Double]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("paddingBottom")(x.asInstanceOf[js.Any])
    
    @JSImport("react-sketchapp/lib/components/ViewStylePropTypes", "ViewStylePropTypes.paddingHorizontal")
    @js.native
    def paddingHorizontal: Requireable[Double] = js.native
    inline def paddingHorizontal_=(x: Requireable[Double]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("paddingHorizontal")(x.asInstanceOf[js.Any])
    
    @JSImport("react-sketchapp/lib/components/ViewStylePropTypes", "ViewStylePropTypes.paddingLeft")
    @js.native
    def paddingLeft: Requireable[Double] = js.native
    inline def paddingLeft_=(x: Requireable[Double]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("paddingLeft")(x.asInstanceOf[js.Any])
    
    @JSImport("react-sketchapp/lib/components/ViewStylePropTypes", "ViewStylePropTypes.paddingRight")
    @js.native
    def paddingRight: Requireable[Double] = js.native
    inline def paddingRight_=(x: Requireable[Double]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("paddingRight")(x.asInstanceOf[js.Any])
    
    @JSImport("react-sketchapp/lib/components/ViewStylePropTypes", "ViewStylePropTypes.paddingTop")
    @js.native
    def paddingTop: Requireable[Double] = js.native
    inline def paddingTop_=(x: Requireable[Double]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("paddingTop")(x.asInstanceOf[js.Any])
    
    @JSImport("react-sketchapp/lib/components/ViewStylePropTypes", "ViewStylePropTypes.paddingVertical")
    @js.native
    def paddingVertical: Requireable[Double] = js.native
    inline def paddingVertical_=(x: Requireable[Double]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("paddingVertical")(x.asInstanceOf[js.Any])
    
    inline def padding_=(x: Requireable[Double]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("padding")(x.asInstanceOf[js.Any])
    
    @JSImport("react-sketchapp/lib/components/ViewStylePropTypes", "ViewStylePropTypes.position")
    @js.native
    def position: Requireable[absolute | relative] = js.native
    inline def position_=(x: Requireable[absolute | relative]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("position")(x.asInstanceOf[js.Any])
    
    @JSImport("react-sketchapp/lib/components/ViewStylePropTypes", "ViewStylePropTypes.right")
    @js.native
    def right: Requireable[Double] = js.native
    inline def right_=(x: Requireable[Double]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("right")(x.asInstanceOf[js.Any])
    
    @JSImport("react-sketchapp/lib/components/ViewStylePropTypes", "ViewStylePropTypes.shadowColor")
    @js.native
    def shadowColor: Requireable[String | Double] = js.native
    inline def shadowColor_=(x: Requireable[String | Double]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("shadowColor")(x.asInstanceOf[js.Any])
    
    @JSImport("react-sketchapp/lib/components/ViewStylePropTypes", "ViewStylePropTypes.shadowInner")
    @js.native
    def shadowInner: Requireable[Boolean] = js.native
    inline def shadowInner_=(x: Requireable[Boolean]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("shadowInner")(x.asInstanceOf[js.Any])
    
    @JSImport("react-sketchapp/lib/components/ViewStylePropTypes", "ViewStylePropTypes.shadowOffset")
    @js.native
    def shadowOffset: Requireable[InferProps[Height]] = js.native
    inline def shadowOffset_=(x: Requireable[InferProps[Height]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("shadowOffset")(x.asInstanceOf[js.Any])
    
    @JSImport("react-sketchapp/lib/components/ViewStylePropTypes", "ViewStylePropTypes.shadowOpacity")
    @js.native
    def shadowOpacity: Requireable[Double] = js.native
    inline def shadowOpacity_=(x: Requireable[Double]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("shadowOpacity")(x.asInstanceOf[js.Any])
    
    @JSImport("react-sketchapp/lib/components/ViewStylePropTypes", "ViewStylePropTypes.shadowRadius")
    @js.native
    def shadowRadius: Requireable[Double] = js.native
    inline def shadowRadius_=(x: Requireable[Double]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("shadowRadius")(x.asInstanceOf[js.Any])
    
    @JSImport("react-sketchapp/lib/components/ViewStylePropTypes", "ViewStylePropTypes.shadowSpread")
    @js.native
    def shadowSpread: Requireable[Double] = js.native
    inline def shadowSpread_=(x: Requireable[Double]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("shadowSpread")(x.asInstanceOf[js.Any])
    
    @JSImport("react-sketchapp/lib/components/ViewStylePropTypes", "ViewStylePropTypes.top")
    @js.native
    def top: Requireable[Double] = js.native
    inline def top_=(x: Requireable[Double]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("top")(x.asInstanceOf[js.Any])
    
    @JSImport("react-sketchapp/lib/components/ViewStylePropTypes", "ViewStylePropTypes.transform")
    @js.native
    def transform: Requireable[String] = js.native
    
    @JSImport("react-sketchapp/lib/components/ViewStylePropTypes", "ViewStylePropTypes.transformOrigin")
    @js.native
    def transformOrigin: Requireable[String] = js.native
    inline def transformOrigin_=(x: Requireable[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("transformOrigin")(x.asInstanceOf[js.Any])
    
    inline def transform_=(x: Requireable[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("transform")(x.asInstanceOf[js.Any])
    
    @JSImport("react-sketchapp/lib/components/ViewStylePropTypes", "ViewStylePropTypes.width")
    @js.native
    def width: Requireable[Double] = js.native
    inline def width_=(x: Requireable[Double]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("width")(x.asInstanceOf[js.Any])
    
    @JSImport("react-sketchapp/lib/components/ViewStylePropTypes", "ViewStylePropTypes.zIndex")
    @js.native
    def zIndex: Requireable[Double] = js.native
    inline def zIndex_=(x: Requireable[Double]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("zIndex")(x.asInstanceOf[js.Any])
  }
}
