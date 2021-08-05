package typings.reactSketchapp.mod

import typings.reactSketchapp.anon.Height
import typings.reactSketchapp.reactSketchappStrings.`column-reverse`
import typings.reactSketchapp.reactSketchappStrings.`flex-end`
import typings.reactSketchapp.reactSketchappStrings.`flex-start`
import typings.reactSketchapp.reactSketchappStrings.`row-reverse`
import typings.reactSketchapp.reactSketchappStrings.`space-around`
import typings.reactSketchapp.reactSketchappStrings.`space-between`
import typings.reactSketchapp.reactSketchappStrings.absolute
import typings.reactSketchapp.reactSketchappStrings.auto
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
import typings.reactSketchapp.typesMod.Color
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Style extends StObject {
  
  var alignItems: js.UndefOr[`flex-start` | `flex-end` | center | stretch] = js.undefined
  
  var alignSelf: js.UndefOr[auto | `flex-start` | `flex-end` | center | stretch] = js.undefined
  
  var aspectRatio: js.UndefOr[Double] = js.undefined
  
  var backfaceVisibility: js.UndefOr[visible | hidden] = js.undefined
  
  var backgroundColor: js.UndefOr[Color] = js.undefined
  
  var borderBottomColor: js.UndefOr[Color] = js.undefined
  
  var borderBottomLeftRadius: js.UndefOr[Double] = js.undefined
  
  var borderBottomRightRadius: js.UndefOr[Double] = js.undefined
  
  var borderBottomWidth: js.UndefOr[Double] = js.undefined
  
  var borderColor: js.UndefOr[Color] = js.undefined
  
  var borderLeftColor: js.UndefOr[Color] = js.undefined
  
  var borderLeftWidth: js.UndefOr[Double] = js.undefined
  
  var borderRadius: js.UndefOr[Double] = js.undefined
  
  var borderRightColor: js.UndefOr[Color] = js.undefined
  
  var borderRightWidth: js.UndefOr[Double] = js.undefined
  
  var borderStyle: js.UndefOr[solid | dotted | dashed] = js.undefined
  
  var borderTopColor: js.UndefOr[Color] = js.undefined
  
  var borderTopLeftRadius: js.UndefOr[Double] = js.undefined
  
  var borderTopRightRadius: js.UndefOr[Double] = js.undefined
  
  var borderTopWidth: js.UndefOr[Double] = js.undefined
  
  var borderWidth: js.UndefOr[Double] = js.undefined
  
  var bottom: js.UndefOr[Double] = js.undefined
  
  var flex: js.UndefOr[Double] = js.undefined
  
  var flexBasis: js.UndefOr[Double] = js.undefined
  
  var flexDirection: js.UndefOr[row | `row-reverse` | column | `column-reverse`] = js.undefined
  
  var flexGrow: js.UndefOr[Double] = js.undefined
  
  var flexShrink: js.UndefOr[Double] = js.undefined
  
  var flexWrap: js.UndefOr[wrap | nowrap] = js.undefined
  
  var height: js.UndefOr[Double] = js.undefined
  
  var justifyContent: js.UndefOr[`flex-start` | `flex-end` | center | `space-between` | `space-around`] = js.undefined
  
  var left: js.UndefOr[Double] = js.undefined
  
  var margin: js.UndefOr[Double] = js.undefined
  
  var marginBottom: js.UndefOr[Double] = js.undefined
  
  var marginHorizontal: js.UndefOr[Double] = js.undefined
  
  var marginLeft: js.UndefOr[Double] = js.undefined
  
  var marginRight: js.UndefOr[Double] = js.undefined
  
  var marginTop: js.UndefOr[Double] = js.undefined
  
  var marginVertical: js.UndefOr[Double] = js.undefined
  
  var maxHeight: js.UndefOr[Double] = js.undefined
  
  var maxWidth: js.UndefOr[Double] = js.undefined
  
  var minHeight: js.UndefOr[Double] = js.undefined
  
  var minWidth: js.UndefOr[Double] = js.undefined
  
  var opacity: js.UndefOr[Double] = js.undefined
  
  var overflow: js.UndefOr[visible | hidden | scroll] = js.undefined
  
  var padding: js.UndefOr[Double] = js.undefined
  
  var paddingBottom: js.UndefOr[Double] = js.undefined
  
  var paddingHorizontal: js.UndefOr[Double] = js.undefined
  
  var paddingLeft: js.UndefOr[Double] = js.undefined
  
  var paddingRight: js.UndefOr[Double] = js.undefined
  
  var paddingTop: js.UndefOr[Double] = js.undefined
  
  var paddingVertical: js.UndefOr[Double] = js.undefined
  
  var position: js.UndefOr[absolute | relative] = js.undefined
  
  var right: js.UndefOr[Double] = js.undefined
  
  var shadowColor: js.UndefOr[Color] = js.undefined
  
  var shadowOffset: js.UndefOr[Height] = js.undefined
  
  var shadowOpacity: js.UndefOr[Double] = js.undefined
  
  var shadowRadius: js.UndefOr[Double] = js.undefined
  
  var top: js.UndefOr[Double] = js.undefined
  
  var width: js.UndefOr[Double] = js.undefined
  
  var zIndex: js.UndefOr[Double] = js.undefined
}
object Style {
  
  inline def apply(): Style = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Style]
  }
  
  extension [Self <: Style](x: Self) {
    
    inline def setAlignItems(value: `flex-start` | `flex-end` | center | stretch): Self = StObject.set(x, "alignItems", value.asInstanceOf[js.Any])
    
    inline def setAlignItemsUndefined: Self = StObject.set(x, "alignItems", js.undefined)
    
    inline def setAlignSelf(value: auto | `flex-start` | `flex-end` | center | stretch): Self = StObject.set(x, "alignSelf", value.asInstanceOf[js.Any])
    
    inline def setAlignSelfUndefined: Self = StObject.set(x, "alignSelf", js.undefined)
    
    inline def setAspectRatio(value: Double): Self = StObject.set(x, "aspectRatio", value.asInstanceOf[js.Any])
    
    inline def setAspectRatioUndefined: Self = StObject.set(x, "aspectRatio", js.undefined)
    
    inline def setBackfaceVisibility(value: visible | hidden): Self = StObject.set(x, "backfaceVisibility", value.asInstanceOf[js.Any])
    
    inline def setBackfaceVisibilityUndefined: Self = StObject.set(x, "backfaceVisibility", js.undefined)
    
    inline def setBackgroundColor(value: Color): Self = StObject.set(x, "backgroundColor", value.asInstanceOf[js.Any])
    
    inline def setBackgroundColorUndefined: Self = StObject.set(x, "backgroundColor", js.undefined)
    
    inline def setBorderBottomColor(value: Color): Self = StObject.set(x, "borderBottomColor", value.asInstanceOf[js.Any])
    
    inline def setBorderBottomColorUndefined: Self = StObject.set(x, "borderBottomColor", js.undefined)
    
    inline def setBorderBottomLeftRadius(value: Double): Self = StObject.set(x, "borderBottomLeftRadius", value.asInstanceOf[js.Any])
    
    inline def setBorderBottomLeftRadiusUndefined: Self = StObject.set(x, "borderBottomLeftRadius", js.undefined)
    
    inline def setBorderBottomRightRadius(value: Double): Self = StObject.set(x, "borderBottomRightRadius", value.asInstanceOf[js.Any])
    
    inline def setBorderBottomRightRadiusUndefined: Self = StObject.set(x, "borderBottomRightRadius", js.undefined)
    
    inline def setBorderBottomWidth(value: Double): Self = StObject.set(x, "borderBottomWidth", value.asInstanceOf[js.Any])
    
    inline def setBorderBottomWidthUndefined: Self = StObject.set(x, "borderBottomWidth", js.undefined)
    
    inline def setBorderColor(value: Color): Self = StObject.set(x, "borderColor", value.asInstanceOf[js.Any])
    
    inline def setBorderColorUndefined: Self = StObject.set(x, "borderColor", js.undefined)
    
    inline def setBorderLeftColor(value: Color): Self = StObject.set(x, "borderLeftColor", value.asInstanceOf[js.Any])
    
    inline def setBorderLeftColorUndefined: Self = StObject.set(x, "borderLeftColor", js.undefined)
    
    inline def setBorderLeftWidth(value: Double): Self = StObject.set(x, "borderLeftWidth", value.asInstanceOf[js.Any])
    
    inline def setBorderLeftWidthUndefined: Self = StObject.set(x, "borderLeftWidth", js.undefined)
    
    inline def setBorderRadius(value: Double): Self = StObject.set(x, "borderRadius", value.asInstanceOf[js.Any])
    
    inline def setBorderRadiusUndefined: Self = StObject.set(x, "borderRadius", js.undefined)
    
    inline def setBorderRightColor(value: Color): Self = StObject.set(x, "borderRightColor", value.asInstanceOf[js.Any])
    
    inline def setBorderRightColorUndefined: Self = StObject.set(x, "borderRightColor", js.undefined)
    
    inline def setBorderRightWidth(value: Double): Self = StObject.set(x, "borderRightWidth", value.asInstanceOf[js.Any])
    
    inline def setBorderRightWidthUndefined: Self = StObject.set(x, "borderRightWidth", js.undefined)
    
    inline def setBorderStyle(value: solid | dotted | dashed): Self = StObject.set(x, "borderStyle", value.asInstanceOf[js.Any])
    
    inline def setBorderStyleUndefined: Self = StObject.set(x, "borderStyle", js.undefined)
    
    inline def setBorderTopColor(value: Color): Self = StObject.set(x, "borderTopColor", value.asInstanceOf[js.Any])
    
    inline def setBorderTopColorUndefined: Self = StObject.set(x, "borderTopColor", js.undefined)
    
    inline def setBorderTopLeftRadius(value: Double): Self = StObject.set(x, "borderTopLeftRadius", value.asInstanceOf[js.Any])
    
    inline def setBorderTopLeftRadiusUndefined: Self = StObject.set(x, "borderTopLeftRadius", js.undefined)
    
    inline def setBorderTopRightRadius(value: Double): Self = StObject.set(x, "borderTopRightRadius", value.asInstanceOf[js.Any])
    
    inline def setBorderTopRightRadiusUndefined: Self = StObject.set(x, "borderTopRightRadius", js.undefined)
    
    inline def setBorderTopWidth(value: Double): Self = StObject.set(x, "borderTopWidth", value.asInstanceOf[js.Any])
    
    inline def setBorderTopWidthUndefined: Self = StObject.set(x, "borderTopWidth", js.undefined)
    
    inline def setBorderWidth(value: Double): Self = StObject.set(x, "borderWidth", value.asInstanceOf[js.Any])
    
    inline def setBorderWidthUndefined: Self = StObject.set(x, "borderWidth", js.undefined)
    
    inline def setBottom(value: Double): Self = StObject.set(x, "bottom", value.asInstanceOf[js.Any])
    
    inline def setBottomUndefined: Self = StObject.set(x, "bottom", js.undefined)
    
    inline def setFlex(value: Double): Self = StObject.set(x, "flex", value.asInstanceOf[js.Any])
    
    inline def setFlexBasis(value: Double): Self = StObject.set(x, "flexBasis", value.asInstanceOf[js.Any])
    
    inline def setFlexBasisUndefined: Self = StObject.set(x, "flexBasis", js.undefined)
    
    inline def setFlexDirection(value: row | `row-reverse` | column | `column-reverse`): Self = StObject.set(x, "flexDirection", value.asInstanceOf[js.Any])
    
    inline def setFlexDirectionUndefined: Self = StObject.set(x, "flexDirection", js.undefined)
    
    inline def setFlexGrow(value: Double): Self = StObject.set(x, "flexGrow", value.asInstanceOf[js.Any])
    
    inline def setFlexGrowUndefined: Self = StObject.set(x, "flexGrow", js.undefined)
    
    inline def setFlexShrink(value: Double): Self = StObject.set(x, "flexShrink", value.asInstanceOf[js.Any])
    
    inline def setFlexShrinkUndefined: Self = StObject.set(x, "flexShrink", js.undefined)
    
    inline def setFlexUndefined: Self = StObject.set(x, "flex", js.undefined)
    
    inline def setFlexWrap(value: wrap | nowrap): Self = StObject.set(x, "flexWrap", value.asInstanceOf[js.Any])
    
    inline def setFlexWrapUndefined: Self = StObject.set(x, "flexWrap", js.undefined)
    
    inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
    
    inline def setJustifyContent(value: `flex-start` | `flex-end` | center | `space-between` | `space-around`): Self = StObject.set(x, "justifyContent", value.asInstanceOf[js.Any])
    
    inline def setJustifyContentUndefined: Self = StObject.set(x, "justifyContent", js.undefined)
    
    inline def setLeft(value: Double): Self = StObject.set(x, "left", value.asInstanceOf[js.Any])
    
    inline def setLeftUndefined: Self = StObject.set(x, "left", js.undefined)
    
    inline def setMargin(value: Double): Self = StObject.set(x, "margin", value.asInstanceOf[js.Any])
    
    inline def setMarginBottom(value: Double): Self = StObject.set(x, "marginBottom", value.asInstanceOf[js.Any])
    
    inline def setMarginBottomUndefined: Self = StObject.set(x, "marginBottom", js.undefined)
    
    inline def setMarginHorizontal(value: Double): Self = StObject.set(x, "marginHorizontal", value.asInstanceOf[js.Any])
    
    inline def setMarginHorizontalUndefined: Self = StObject.set(x, "marginHorizontal", js.undefined)
    
    inline def setMarginLeft(value: Double): Self = StObject.set(x, "marginLeft", value.asInstanceOf[js.Any])
    
    inline def setMarginLeftUndefined: Self = StObject.set(x, "marginLeft", js.undefined)
    
    inline def setMarginRight(value: Double): Self = StObject.set(x, "marginRight", value.asInstanceOf[js.Any])
    
    inline def setMarginRightUndefined: Self = StObject.set(x, "marginRight", js.undefined)
    
    inline def setMarginTop(value: Double): Self = StObject.set(x, "marginTop", value.asInstanceOf[js.Any])
    
    inline def setMarginTopUndefined: Self = StObject.set(x, "marginTop", js.undefined)
    
    inline def setMarginUndefined: Self = StObject.set(x, "margin", js.undefined)
    
    inline def setMarginVertical(value: Double): Self = StObject.set(x, "marginVertical", value.asInstanceOf[js.Any])
    
    inline def setMarginVerticalUndefined: Self = StObject.set(x, "marginVertical", js.undefined)
    
    inline def setMaxHeight(value: Double): Self = StObject.set(x, "maxHeight", value.asInstanceOf[js.Any])
    
    inline def setMaxHeightUndefined: Self = StObject.set(x, "maxHeight", js.undefined)
    
    inline def setMaxWidth(value: Double): Self = StObject.set(x, "maxWidth", value.asInstanceOf[js.Any])
    
    inline def setMaxWidthUndefined: Self = StObject.set(x, "maxWidth", js.undefined)
    
    inline def setMinHeight(value: Double): Self = StObject.set(x, "minHeight", value.asInstanceOf[js.Any])
    
    inline def setMinHeightUndefined: Self = StObject.set(x, "minHeight", js.undefined)
    
    inline def setMinWidth(value: Double): Self = StObject.set(x, "minWidth", value.asInstanceOf[js.Any])
    
    inline def setMinWidthUndefined: Self = StObject.set(x, "minWidth", js.undefined)
    
    inline def setOpacity(value: Double): Self = StObject.set(x, "opacity", value.asInstanceOf[js.Any])
    
    inline def setOpacityUndefined: Self = StObject.set(x, "opacity", js.undefined)
    
    inline def setOverflow(value: visible | hidden | scroll): Self = StObject.set(x, "overflow", value.asInstanceOf[js.Any])
    
    inline def setOverflowUndefined: Self = StObject.set(x, "overflow", js.undefined)
    
    inline def setPadding(value: Double): Self = StObject.set(x, "padding", value.asInstanceOf[js.Any])
    
    inline def setPaddingBottom(value: Double): Self = StObject.set(x, "paddingBottom", value.asInstanceOf[js.Any])
    
    inline def setPaddingBottomUndefined: Self = StObject.set(x, "paddingBottom", js.undefined)
    
    inline def setPaddingHorizontal(value: Double): Self = StObject.set(x, "paddingHorizontal", value.asInstanceOf[js.Any])
    
    inline def setPaddingHorizontalUndefined: Self = StObject.set(x, "paddingHorizontal", js.undefined)
    
    inline def setPaddingLeft(value: Double): Self = StObject.set(x, "paddingLeft", value.asInstanceOf[js.Any])
    
    inline def setPaddingLeftUndefined: Self = StObject.set(x, "paddingLeft", js.undefined)
    
    inline def setPaddingRight(value: Double): Self = StObject.set(x, "paddingRight", value.asInstanceOf[js.Any])
    
    inline def setPaddingRightUndefined: Self = StObject.set(x, "paddingRight", js.undefined)
    
    inline def setPaddingTop(value: Double): Self = StObject.set(x, "paddingTop", value.asInstanceOf[js.Any])
    
    inline def setPaddingTopUndefined: Self = StObject.set(x, "paddingTop", js.undefined)
    
    inline def setPaddingUndefined: Self = StObject.set(x, "padding", js.undefined)
    
    inline def setPaddingVertical(value: Double): Self = StObject.set(x, "paddingVertical", value.asInstanceOf[js.Any])
    
    inline def setPaddingVerticalUndefined: Self = StObject.set(x, "paddingVertical", js.undefined)
    
    inline def setPosition(value: absolute | relative): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
    
    inline def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
    
    inline def setRight(value: Double): Self = StObject.set(x, "right", value.asInstanceOf[js.Any])
    
    inline def setRightUndefined: Self = StObject.set(x, "right", js.undefined)
    
    inline def setShadowColor(value: Color): Self = StObject.set(x, "shadowColor", value.asInstanceOf[js.Any])
    
    inline def setShadowColorUndefined: Self = StObject.set(x, "shadowColor", js.undefined)
    
    inline def setShadowOffset(value: Height): Self = StObject.set(x, "shadowOffset", value.asInstanceOf[js.Any])
    
    inline def setShadowOffsetUndefined: Self = StObject.set(x, "shadowOffset", js.undefined)
    
    inline def setShadowOpacity(value: Double): Self = StObject.set(x, "shadowOpacity", value.asInstanceOf[js.Any])
    
    inline def setShadowOpacityUndefined: Self = StObject.set(x, "shadowOpacity", js.undefined)
    
    inline def setShadowRadius(value: Double): Self = StObject.set(x, "shadowRadius", value.asInstanceOf[js.Any])
    
    inline def setShadowRadiusUndefined: Self = StObject.set(x, "shadowRadius", js.undefined)
    
    inline def setTop(value: Double): Self = StObject.set(x, "top", value.asInstanceOf[js.Any])
    
    inline def setTopUndefined: Self = StObject.set(x, "top", js.undefined)
    
    inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    
    inline def setZIndex(value: Double): Self = StObject.set(x, "zIndex", value.asInstanceOf[js.Any])
    
    inline def setZIndexUndefined: Self = StObject.set(x, "zIndex", js.undefined)
  }
}
