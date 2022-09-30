package typings.reactNativeWindows.rntypesMod

import typings.reactNativeWindows.reactNativeWindowsStrings.`column-reverse`
import typings.reactNativeWindows.reactNativeWindowsStrings.`flex-end`
import typings.reactNativeWindows.reactNativeWindowsStrings.`flex-start`
import typings.reactNativeWindows.reactNativeWindowsStrings.`row-reverse`
import typings.reactNativeWindows.reactNativeWindowsStrings.`space-around`
import typings.reactNativeWindows.reactNativeWindowsStrings.`space-between`
import typings.reactNativeWindows.reactNativeWindowsStrings.`space-evenly`
import typings.reactNativeWindows.reactNativeWindowsStrings.`wrap-reverse`
import typings.reactNativeWindows.reactNativeWindowsStrings.absolute
import typings.reactNativeWindows.reactNativeWindowsStrings.auto
import typings.reactNativeWindows.reactNativeWindowsStrings.center
import typings.reactNativeWindows.reactNativeWindowsStrings.column
import typings.reactNativeWindows.reactNativeWindowsStrings.flex
import typings.reactNativeWindows.reactNativeWindowsStrings.hidden
import typings.reactNativeWindows.reactNativeWindowsStrings.inherit
import typings.reactNativeWindows.reactNativeWindowsStrings.ltr
import typings.reactNativeWindows.reactNativeWindowsStrings.none
import typings.reactNativeWindows.reactNativeWindowsStrings.nowrap
import typings.reactNativeWindows.reactNativeWindowsStrings.relative
import typings.reactNativeWindows.reactNativeWindowsStrings.row
import typings.reactNativeWindows.reactNativeWindowsStrings.rtl
import typings.reactNativeWindows.reactNativeWindowsStrings.scroll
import typings.reactNativeWindows.reactNativeWindowsStrings.stretch
import typings.reactNativeWindows.reactNativeWindowsStrings.visible
import typings.reactNativeWindows.reactNativeWindowsStrings.wrap
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FlexStyle extends StObject {
  
  var alignContent: js.UndefOr[`flex-start` | `flex-end` | center | stretch | `space-between` | `space-around`] = js.undefined
  
  var alignItems: js.UndefOr[FlexAlignType] = js.undefined
  
  var alignSelf: js.UndefOr[auto | FlexAlignType] = js.undefined
  
  var aspectRatio: js.UndefOr[Double] = js.undefined
  
  var borderBottomWidth: js.UndefOr[Double] = js.undefined
  
  var borderEndWidth: js.UndefOr[Double | String] = js.undefined
  
  var borderLeftWidth: js.UndefOr[Double] = js.undefined
  
  var borderRightWidth: js.UndefOr[Double] = js.undefined
  
  var borderStartWidth: js.UndefOr[Double | String] = js.undefined
  
  var borderTopWidth: js.UndefOr[Double] = js.undefined
  
  var borderWidth: js.UndefOr[Double] = js.undefined
  
  var bottom: js.UndefOr[Double | String] = js.undefined
  
  /**
    * @platform ios
    */
  var direction: js.UndefOr[inherit | ltr | rtl] = js.undefined
  
  var display: js.UndefOr[none | flex] = js.undefined
  
  var end: js.UndefOr[Double | String] = js.undefined
  
  var flex: js.UndefOr[Double] = js.undefined
  
  var flexBasis: js.UndefOr[Double | String] = js.undefined
  
  var flexDirection: js.UndefOr[row | column | `row-reverse` | `column-reverse`] = js.undefined
  
  var flexGrow: js.UndefOr[Double] = js.undefined
  
  var flexShrink: js.UndefOr[Double] = js.undefined
  
  var flexWrap: js.UndefOr[wrap | nowrap | `wrap-reverse`] = js.undefined
  
  var height: js.UndefOr[Double | String] = js.undefined
  
  var justifyContent: js.UndefOr[
    `flex-start` | `flex-end` | center | `space-between` | `space-around` | `space-evenly`
  ] = js.undefined
  
  var left: js.UndefOr[Double | String] = js.undefined
  
  var margin: js.UndefOr[Double | String] = js.undefined
  
  var marginBottom: js.UndefOr[Double | String] = js.undefined
  
  var marginEnd: js.UndefOr[Double | String] = js.undefined
  
  var marginHorizontal: js.UndefOr[Double | String] = js.undefined
  
  var marginLeft: js.UndefOr[Double | String] = js.undefined
  
  var marginRight: js.UndefOr[Double | String] = js.undefined
  
  var marginStart: js.UndefOr[Double | String] = js.undefined
  
  var marginTop: js.UndefOr[Double | String] = js.undefined
  
  var marginVertical: js.UndefOr[Double | String] = js.undefined
  
  var maxHeight: js.UndefOr[Double | String] = js.undefined
  
  var maxWidth: js.UndefOr[Double | String] = js.undefined
  
  var minHeight: js.UndefOr[Double | String] = js.undefined
  
  var minWidth: js.UndefOr[Double | String] = js.undefined
  
  var overflow: js.UndefOr[visible | hidden | scroll] = js.undefined
  
  var padding: js.UndefOr[Double | String] = js.undefined
  
  var paddingBottom: js.UndefOr[Double | String] = js.undefined
  
  var paddingEnd: js.UndefOr[Double | String] = js.undefined
  
  var paddingHorizontal: js.UndefOr[Double | String] = js.undefined
  
  var paddingLeft: js.UndefOr[Double | String] = js.undefined
  
  var paddingRight: js.UndefOr[Double | String] = js.undefined
  
  var paddingStart: js.UndefOr[Double | String] = js.undefined
  
  var paddingTop: js.UndefOr[Double | String] = js.undefined
  
  var paddingVertical: js.UndefOr[Double | String] = js.undefined
  
  var position: js.UndefOr[absolute | relative] = js.undefined
  
  var right: js.UndefOr[Double | String] = js.undefined
  
  var start: js.UndefOr[Double | String] = js.undefined
  
  var top: js.UndefOr[Double | String] = js.undefined
  
  var width: js.UndefOr[Double | String] = js.undefined
  
  var zIndex: js.UndefOr[Double] = js.undefined
}
object FlexStyle {
  
  inline def apply(): FlexStyle = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FlexStyle]
  }
  
  extension [Self <: FlexStyle](x: Self) {
    
    inline def setAlignContent(value: `flex-start` | `flex-end` | center | stretch | `space-between` | `space-around`): Self = StObject.set(x, "alignContent", value.asInstanceOf[js.Any])
    
    inline def setAlignContentUndefined: Self = StObject.set(x, "alignContent", js.undefined)
    
    inline def setAlignItems(value: FlexAlignType): Self = StObject.set(x, "alignItems", value.asInstanceOf[js.Any])
    
    inline def setAlignItemsUndefined: Self = StObject.set(x, "alignItems", js.undefined)
    
    inline def setAlignSelf(value: auto | FlexAlignType): Self = StObject.set(x, "alignSelf", value.asInstanceOf[js.Any])
    
    inline def setAlignSelfUndefined: Self = StObject.set(x, "alignSelf", js.undefined)
    
    inline def setAspectRatio(value: Double): Self = StObject.set(x, "aspectRatio", value.asInstanceOf[js.Any])
    
    inline def setAspectRatioUndefined: Self = StObject.set(x, "aspectRatio", js.undefined)
    
    inline def setBorderBottomWidth(value: Double): Self = StObject.set(x, "borderBottomWidth", value.asInstanceOf[js.Any])
    
    inline def setBorderBottomWidthUndefined: Self = StObject.set(x, "borderBottomWidth", js.undefined)
    
    inline def setBorderEndWidth(value: Double | String): Self = StObject.set(x, "borderEndWidth", value.asInstanceOf[js.Any])
    
    inline def setBorderEndWidthUndefined: Self = StObject.set(x, "borderEndWidth", js.undefined)
    
    inline def setBorderLeftWidth(value: Double): Self = StObject.set(x, "borderLeftWidth", value.asInstanceOf[js.Any])
    
    inline def setBorderLeftWidthUndefined: Self = StObject.set(x, "borderLeftWidth", js.undefined)
    
    inline def setBorderRightWidth(value: Double): Self = StObject.set(x, "borderRightWidth", value.asInstanceOf[js.Any])
    
    inline def setBorderRightWidthUndefined: Self = StObject.set(x, "borderRightWidth", js.undefined)
    
    inline def setBorderStartWidth(value: Double | String): Self = StObject.set(x, "borderStartWidth", value.asInstanceOf[js.Any])
    
    inline def setBorderStartWidthUndefined: Self = StObject.set(x, "borderStartWidth", js.undefined)
    
    inline def setBorderTopWidth(value: Double): Self = StObject.set(x, "borderTopWidth", value.asInstanceOf[js.Any])
    
    inline def setBorderTopWidthUndefined: Self = StObject.set(x, "borderTopWidth", js.undefined)
    
    inline def setBorderWidth(value: Double): Self = StObject.set(x, "borderWidth", value.asInstanceOf[js.Any])
    
    inline def setBorderWidthUndefined: Self = StObject.set(x, "borderWidth", js.undefined)
    
    inline def setBottom(value: Double | String): Self = StObject.set(x, "bottom", value.asInstanceOf[js.Any])
    
    inline def setBottomUndefined: Self = StObject.set(x, "bottom", js.undefined)
    
    inline def setDirection(value: inherit | ltr | rtl): Self = StObject.set(x, "direction", value.asInstanceOf[js.Any])
    
    inline def setDirectionUndefined: Self = StObject.set(x, "direction", js.undefined)
    
    inline def setDisplay(value: none | flex): Self = StObject.set(x, "display", value.asInstanceOf[js.Any])
    
    inline def setDisplayUndefined: Self = StObject.set(x, "display", js.undefined)
    
    inline def setEnd(value: Double | String): Self = StObject.set(x, "end", value.asInstanceOf[js.Any])
    
    inline def setEndUndefined: Self = StObject.set(x, "end", js.undefined)
    
    inline def setFlex(value: Double): Self = StObject.set(x, "flex", value.asInstanceOf[js.Any])
    
    inline def setFlexBasis(value: Double | String): Self = StObject.set(x, "flexBasis", value.asInstanceOf[js.Any])
    
    inline def setFlexBasisUndefined: Self = StObject.set(x, "flexBasis", js.undefined)
    
    inline def setFlexDirection(value: row | column | `row-reverse` | `column-reverse`): Self = StObject.set(x, "flexDirection", value.asInstanceOf[js.Any])
    
    inline def setFlexDirectionUndefined: Self = StObject.set(x, "flexDirection", js.undefined)
    
    inline def setFlexGrow(value: Double): Self = StObject.set(x, "flexGrow", value.asInstanceOf[js.Any])
    
    inline def setFlexGrowUndefined: Self = StObject.set(x, "flexGrow", js.undefined)
    
    inline def setFlexShrink(value: Double): Self = StObject.set(x, "flexShrink", value.asInstanceOf[js.Any])
    
    inline def setFlexShrinkUndefined: Self = StObject.set(x, "flexShrink", js.undefined)
    
    inline def setFlexUndefined: Self = StObject.set(x, "flex", js.undefined)
    
    inline def setFlexWrap(value: wrap | nowrap | `wrap-reverse`): Self = StObject.set(x, "flexWrap", value.asInstanceOf[js.Any])
    
    inline def setFlexWrapUndefined: Self = StObject.set(x, "flexWrap", js.undefined)
    
    inline def setHeight(value: Double | String): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
    
    inline def setJustifyContent(value: `flex-start` | `flex-end` | center | `space-between` | `space-around` | `space-evenly`): Self = StObject.set(x, "justifyContent", value.asInstanceOf[js.Any])
    
    inline def setJustifyContentUndefined: Self = StObject.set(x, "justifyContent", js.undefined)
    
    inline def setLeft(value: Double | String): Self = StObject.set(x, "left", value.asInstanceOf[js.Any])
    
    inline def setLeftUndefined: Self = StObject.set(x, "left", js.undefined)
    
    inline def setMargin(value: Double | String): Self = StObject.set(x, "margin", value.asInstanceOf[js.Any])
    
    inline def setMarginBottom(value: Double | String): Self = StObject.set(x, "marginBottom", value.asInstanceOf[js.Any])
    
    inline def setMarginBottomUndefined: Self = StObject.set(x, "marginBottom", js.undefined)
    
    inline def setMarginEnd(value: Double | String): Self = StObject.set(x, "marginEnd", value.asInstanceOf[js.Any])
    
    inline def setMarginEndUndefined: Self = StObject.set(x, "marginEnd", js.undefined)
    
    inline def setMarginHorizontal(value: Double | String): Self = StObject.set(x, "marginHorizontal", value.asInstanceOf[js.Any])
    
    inline def setMarginHorizontalUndefined: Self = StObject.set(x, "marginHorizontal", js.undefined)
    
    inline def setMarginLeft(value: Double | String): Self = StObject.set(x, "marginLeft", value.asInstanceOf[js.Any])
    
    inline def setMarginLeftUndefined: Self = StObject.set(x, "marginLeft", js.undefined)
    
    inline def setMarginRight(value: Double | String): Self = StObject.set(x, "marginRight", value.asInstanceOf[js.Any])
    
    inline def setMarginRightUndefined: Self = StObject.set(x, "marginRight", js.undefined)
    
    inline def setMarginStart(value: Double | String): Self = StObject.set(x, "marginStart", value.asInstanceOf[js.Any])
    
    inline def setMarginStartUndefined: Self = StObject.set(x, "marginStart", js.undefined)
    
    inline def setMarginTop(value: Double | String): Self = StObject.set(x, "marginTop", value.asInstanceOf[js.Any])
    
    inline def setMarginTopUndefined: Self = StObject.set(x, "marginTop", js.undefined)
    
    inline def setMarginUndefined: Self = StObject.set(x, "margin", js.undefined)
    
    inline def setMarginVertical(value: Double | String): Self = StObject.set(x, "marginVertical", value.asInstanceOf[js.Any])
    
    inline def setMarginVerticalUndefined: Self = StObject.set(x, "marginVertical", js.undefined)
    
    inline def setMaxHeight(value: Double | String): Self = StObject.set(x, "maxHeight", value.asInstanceOf[js.Any])
    
    inline def setMaxHeightUndefined: Self = StObject.set(x, "maxHeight", js.undefined)
    
    inline def setMaxWidth(value: Double | String): Self = StObject.set(x, "maxWidth", value.asInstanceOf[js.Any])
    
    inline def setMaxWidthUndefined: Self = StObject.set(x, "maxWidth", js.undefined)
    
    inline def setMinHeight(value: Double | String): Self = StObject.set(x, "minHeight", value.asInstanceOf[js.Any])
    
    inline def setMinHeightUndefined: Self = StObject.set(x, "minHeight", js.undefined)
    
    inline def setMinWidth(value: Double | String): Self = StObject.set(x, "minWidth", value.asInstanceOf[js.Any])
    
    inline def setMinWidthUndefined: Self = StObject.set(x, "minWidth", js.undefined)
    
    inline def setOverflow(value: visible | hidden | scroll): Self = StObject.set(x, "overflow", value.asInstanceOf[js.Any])
    
    inline def setOverflowUndefined: Self = StObject.set(x, "overflow", js.undefined)
    
    inline def setPadding(value: Double | String): Self = StObject.set(x, "padding", value.asInstanceOf[js.Any])
    
    inline def setPaddingBottom(value: Double | String): Self = StObject.set(x, "paddingBottom", value.asInstanceOf[js.Any])
    
    inline def setPaddingBottomUndefined: Self = StObject.set(x, "paddingBottom", js.undefined)
    
    inline def setPaddingEnd(value: Double | String): Self = StObject.set(x, "paddingEnd", value.asInstanceOf[js.Any])
    
    inline def setPaddingEndUndefined: Self = StObject.set(x, "paddingEnd", js.undefined)
    
    inline def setPaddingHorizontal(value: Double | String): Self = StObject.set(x, "paddingHorizontal", value.asInstanceOf[js.Any])
    
    inline def setPaddingHorizontalUndefined: Self = StObject.set(x, "paddingHorizontal", js.undefined)
    
    inline def setPaddingLeft(value: Double | String): Self = StObject.set(x, "paddingLeft", value.asInstanceOf[js.Any])
    
    inline def setPaddingLeftUndefined: Self = StObject.set(x, "paddingLeft", js.undefined)
    
    inline def setPaddingRight(value: Double | String): Self = StObject.set(x, "paddingRight", value.asInstanceOf[js.Any])
    
    inline def setPaddingRightUndefined: Self = StObject.set(x, "paddingRight", js.undefined)
    
    inline def setPaddingStart(value: Double | String): Self = StObject.set(x, "paddingStart", value.asInstanceOf[js.Any])
    
    inline def setPaddingStartUndefined: Self = StObject.set(x, "paddingStart", js.undefined)
    
    inline def setPaddingTop(value: Double | String): Self = StObject.set(x, "paddingTop", value.asInstanceOf[js.Any])
    
    inline def setPaddingTopUndefined: Self = StObject.set(x, "paddingTop", js.undefined)
    
    inline def setPaddingUndefined: Self = StObject.set(x, "padding", js.undefined)
    
    inline def setPaddingVertical(value: Double | String): Self = StObject.set(x, "paddingVertical", value.asInstanceOf[js.Any])
    
    inline def setPaddingVerticalUndefined: Self = StObject.set(x, "paddingVertical", js.undefined)
    
    inline def setPosition(value: absolute | relative): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
    
    inline def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
    
    inline def setRight(value: Double | String): Self = StObject.set(x, "right", value.asInstanceOf[js.Any])
    
    inline def setRightUndefined: Self = StObject.set(x, "right", js.undefined)
    
    inline def setStart(value: Double | String): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
    
    inline def setStartUndefined: Self = StObject.set(x, "start", js.undefined)
    
    inline def setTop(value: Double | String): Self = StObject.set(x, "top", value.asInstanceOf[js.Any])
    
    inline def setTopUndefined: Self = StObject.set(x, "top", js.undefined)
    
    inline def setWidth(value: Double | String): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    
    inline def setZIndex(value: Double): Self = StObject.set(x, "zIndex", value.asInstanceOf[js.Any])
    
    inline def setZIndexUndefined: Self = StObject.set(x, "zIndex", js.undefined)
  }
}
