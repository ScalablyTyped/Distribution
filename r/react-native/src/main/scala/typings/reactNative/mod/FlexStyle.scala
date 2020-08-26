package typings.reactNative.mod

import typings.reactNative.reactNativeStrings.`column-reverse`
import typings.reactNative.reactNativeStrings.`flex-end`
import typings.reactNative.reactNativeStrings.`flex-start`
import typings.reactNative.reactNativeStrings.`row-reverse`
import typings.reactNative.reactNativeStrings.`space-around`
import typings.reactNative.reactNativeStrings.`space-between`
import typings.reactNative.reactNativeStrings.`space-evenly`
import typings.reactNative.reactNativeStrings.`wrap-reverse`
import typings.reactNative.reactNativeStrings.absolute
import typings.reactNative.reactNativeStrings.auto
import typings.reactNative.reactNativeStrings.center
import typings.reactNative.reactNativeStrings.column
import typings.reactNative.reactNativeStrings.flex
import typings.reactNative.reactNativeStrings.hidden
import typings.reactNative.reactNativeStrings.inherit
import typings.reactNative.reactNativeStrings.ltr
import typings.reactNative.reactNativeStrings.none
import typings.reactNative.reactNativeStrings.nowrap
import typings.reactNative.reactNativeStrings.relative
import typings.reactNative.reactNativeStrings.row
import typings.reactNative.reactNativeStrings.rtl
import typings.reactNative.reactNativeStrings.scroll
import typings.reactNative.reactNativeStrings.stretch
import typings.reactNative.reactNativeStrings.visible
import typings.reactNative.reactNativeStrings.wrap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FlexStyle extends js.Object {
  var alignContent: js.UndefOr[`flex-start` | `flex-end` | center | stretch | `space-between` | `space-around`] = js.native
  var alignItems: js.UndefOr[FlexAlignType] = js.native
  var alignSelf: js.UndefOr[auto | FlexAlignType] = js.native
  var aspectRatio: js.UndefOr[Double] = js.native
  var borderBottomWidth: js.UndefOr[Double] = js.native
  var borderEndWidth: js.UndefOr[Double | String] = js.native
  var borderLeftWidth: js.UndefOr[Double] = js.native
  var borderRightWidth: js.UndefOr[Double] = js.native
  var borderStartWidth: js.UndefOr[Double | String] = js.native
  var borderTopWidth: js.UndefOr[Double] = js.native
  var borderWidth: js.UndefOr[Double] = js.native
  var bottom: js.UndefOr[Double | String] = js.native
  /**
    * @platform ios
    */
  var direction: js.UndefOr[inherit | ltr | rtl] = js.native
  var display: js.UndefOr[none | flex] = js.native
  var end: js.UndefOr[Double | String] = js.native
  var flex: js.UndefOr[Double] = js.native
  var flexBasis: js.UndefOr[Double | String] = js.native
  var flexDirection: js.UndefOr[row | column | `row-reverse` | `column-reverse`] = js.native
  var flexGrow: js.UndefOr[Double] = js.native
  var flexShrink: js.UndefOr[Double] = js.native
  var flexWrap: js.UndefOr[wrap | nowrap | `wrap-reverse`] = js.native
  var height: js.UndefOr[Double | String] = js.native
  var justifyContent: js.UndefOr[
    `flex-start` | `flex-end` | center | `space-between` | `space-around` | `space-evenly`
  ] = js.native
  var left: js.UndefOr[Double | String] = js.native
  var margin: js.UndefOr[Double | String] = js.native
  var marginBottom: js.UndefOr[Double | String] = js.native
  var marginEnd: js.UndefOr[Double | String] = js.native
  var marginHorizontal: js.UndefOr[Double | String] = js.native
  var marginLeft: js.UndefOr[Double | String] = js.native
  var marginRight: js.UndefOr[Double | String] = js.native
  var marginStart: js.UndefOr[Double | String] = js.native
  var marginTop: js.UndefOr[Double | String] = js.native
  var marginVertical: js.UndefOr[Double | String] = js.native
  var maxHeight: js.UndefOr[Double | String] = js.native
  var maxWidth: js.UndefOr[Double | String] = js.native
  var minHeight: js.UndefOr[Double | String] = js.native
  var minWidth: js.UndefOr[Double | String] = js.native
  var overflow: js.UndefOr[visible | hidden | scroll] = js.native
  var padding: js.UndefOr[Double | String] = js.native
  var paddingBottom: js.UndefOr[Double | String] = js.native
  var paddingEnd: js.UndefOr[Double | String] = js.native
  var paddingHorizontal: js.UndefOr[Double | String] = js.native
  var paddingLeft: js.UndefOr[Double | String] = js.native
  var paddingRight: js.UndefOr[Double | String] = js.native
  var paddingStart: js.UndefOr[Double | String] = js.native
  var paddingTop: js.UndefOr[Double | String] = js.native
  var paddingVertical: js.UndefOr[Double | String] = js.native
  var position: js.UndefOr[absolute | relative] = js.native
  var right: js.UndefOr[Double | String] = js.native
  var start: js.UndefOr[Double | String] = js.native
  var top: js.UndefOr[Double | String] = js.native
  var width: js.UndefOr[Double | String] = js.native
  var zIndex: js.UndefOr[Double] = js.native
}

object FlexStyle {
  @scala.inline
  def apply(): FlexStyle = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FlexStyle]
  }
  @scala.inline
  implicit class FlexStyleOps[Self <: FlexStyle] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAlignContent(value: `flex-start` | `flex-end` | center | stretch | `space-between` | `space-around`): Self = this.set("alignContent", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAlignContent: Self = this.set("alignContent", js.undefined)
    @scala.inline
    def setAlignItems(value: FlexAlignType): Self = this.set("alignItems", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAlignItems: Self = this.set("alignItems", js.undefined)
    @scala.inline
    def setAlignSelf(value: auto | FlexAlignType): Self = this.set("alignSelf", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAlignSelf: Self = this.set("alignSelf", js.undefined)
    @scala.inline
    def setAspectRatio(value: Double): Self = this.set("aspectRatio", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAspectRatio: Self = this.set("aspectRatio", js.undefined)
    @scala.inline
    def setBorderBottomWidth(value: Double): Self = this.set("borderBottomWidth", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBorderBottomWidth: Self = this.set("borderBottomWidth", js.undefined)
    @scala.inline
    def setBorderEndWidth(value: Double | String): Self = this.set("borderEndWidth", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBorderEndWidth: Self = this.set("borderEndWidth", js.undefined)
    @scala.inline
    def setBorderLeftWidth(value: Double): Self = this.set("borderLeftWidth", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBorderLeftWidth: Self = this.set("borderLeftWidth", js.undefined)
    @scala.inline
    def setBorderRightWidth(value: Double): Self = this.set("borderRightWidth", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBorderRightWidth: Self = this.set("borderRightWidth", js.undefined)
    @scala.inline
    def setBorderStartWidth(value: Double | String): Self = this.set("borderStartWidth", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBorderStartWidth: Self = this.set("borderStartWidth", js.undefined)
    @scala.inline
    def setBorderTopWidth(value: Double): Self = this.set("borderTopWidth", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBorderTopWidth: Self = this.set("borderTopWidth", js.undefined)
    @scala.inline
    def setBorderWidth(value: Double): Self = this.set("borderWidth", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBorderWidth: Self = this.set("borderWidth", js.undefined)
    @scala.inline
    def setBottom(value: Double | String): Self = this.set("bottom", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBottom: Self = this.set("bottom", js.undefined)
    @scala.inline
    def setDirection(value: inherit | ltr | rtl): Self = this.set("direction", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDirection: Self = this.set("direction", js.undefined)
    @scala.inline
    def setDisplay(value: none | flex): Self = this.set("display", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDisplay: Self = this.set("display", js.undefined)
    @scala.inline
    def setEnd(value: Double | String): Self = this.set("end", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnd: Self = this.set("end", js.undefined)
    @scala.inline
    def setFlex(value: Double): Self = this.set("flex", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFlex: Self = this.set("flex", js.undefined)
    @scala.inline
    def setFlexBasis(value: Double | String): Self = this.set("flexBasis", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFlexBasis: Self = this.set("flexBasis", js.undefined)
    @scala.inline
    def setFlexDirection(value: row | column | `row-reverse` | `column-reverse`): Self = this.set("flexDirection", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFlexDirection: Self = this.set("flexDirection", js.undefined)
    @scala.inline
    def setFlexGrow(value: Double): Self = this.set("flexGrow", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFlexGrow: Self = this.set("flexGrow", js.undefined)
    @scala.inline
    def setFlexShrink(value: Double): Self = this.set("flexShrink", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFlexShrink: Self = this.set("flexShrink", js.undefined)
    @scala.inline
    def setFlexWrap(value: wrap | nowrap | `wrap-reverse`): Self = this.set("flexWrap", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFlexWrap: Self = this.set("flexWrap", js.undefined)
    @scala.inline
    def setHeight(value: Double | String): Self = this.set("height", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHeight: Self = this.set("height", js.undefined)
    @scala.inline
    def setJustifyContent(value: `flex-start` | `flex-end` | center | `space-between` | `space-around` | `space-evenly`): Self = this.set("justifyContent", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteJustifyContent: Self = this.set("justifyContent", js.undefined)
    @scala.inline
    def setLeft(value: Double | String): Self = this.set("left", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLeft: Self = this.set("left", js.undefined)
    @scala.inline
    def setMargin(value: Double | String): Self = this.set("margin", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMargin: Self = this.set("margin", js.undefined)
    @scala.inline
    def setMarginBottom(value: Double | String): Self = this.set("marginBottom", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMarginBottom: Self = this.set("marginBottom", js.undefined)
    @scala.inline
    def setMarginEnd(value: Double | String): Self = this.set("marginEnd", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMarginEnd: Self = this.set("marginEnd", js.undefined)
    @scala.inline
    def setMarginHorizontal(value: Double | String): Self = this.set("marginHorizontal", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMarginHorizontal: Self = this.set("marginHorizontal", js.undefined)
    @scala.inline
    def setMarginLeft(value: Double | String): Self = this.set("marginLeft", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMarginLeft: Self = this.set("marginLeft", js.undefined)
    @scala.inline
    def setMarginRight(value: Double | String): Self = this.set("marginRight", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMarginRight: Self = this.set("marginRight", js.undefined)
    @scala.inline
    def setMarginStart(value: Double | String): Self = this.set("marginStart", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMarginStart: Self = this.set("marginStart", js.undefined)
    @scala.inline
    def setMarginTop(value: Double | String): Self = this.set("marginTop", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMarginTop: Self = this.set("marginTop", js.undefined)
    @scala.inline
    def setMarginVertical(value: Double | String): Self = this.set("marginVertical", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMarginVertical: Self = this.set("marginVertical", js.undefined)
    @scala.inline
    def setMaxHeight(value: Double | String): Self = this.set("maxHeight", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxHeight: Self = this.set("maxHeight", js.undefined)
    @scala.inline
    def setMaxWidth(value: Double | String): Self = this.set("maxWidth", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxWidth: Self = this.set("maxWidth", js.undefined)
    @scala.inline
    def setMinHeight(value: Double | String): Self = this.set("minHeight", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMinHeight: Self = this.set("minHeight", js.undefined)
    @scala.inline
    def setMinWidth(value: Double | String): Self = this.set("minWidth", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMinWidth: Self = this.set("minWidth", js.undefined)
    @scala.inline
    def setOverflow(value: visible | hidden | scroll): Self = this.set("overflow", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOverflow: Self = this.set("overflow", js.undefined)
    @scala.inline
    def setPadding(value: Double | String): Self = this.set("padding", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePadding: Self = this.set("padding", js.undefined)
    @scala.inline
    def setPaddingBottom(value: Double | String): Self = this.set("paddingBottom", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePaddingBottom: Self = this.set("paddingBottom", js.undefined)
    @scala.inline
    def setPaddingEnd(value: Double | String): Self = this.set("paddingEnd", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePaddingEnd: Self = this.set("paddingEnd", js.undefined)
    @scala.inline
    def setPaddingHorizontal(value: Double | String): Self = this.set("paddingHorizontal", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePaddingHorizontal: Self = this.set("paddingHorizontal", js.undefined)
    @scala.inline
    def setPaddingLeft(value: Double | String): Self = this.set("paddingLeft", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePaddingLeft: Self = this.set("paddingLeft", js.undefined)
    @scala.inline
    def setPaddingRight(value: Double | String): Self = this.set("paddingRight", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePaddingRight: Self = this.set("paddingRight", js.undefined)
    @scala.inline
    def setPaddingStart(value: Double | String): Self = this.set("paddingStart", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePaddingStart: Self = this.set("paddingStart", js.undefined)
    @scala.inline
    def setPaddingTop(value: Double | String): Self = this.set("paddingTop", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePaddingTop: Self = this.set("paddingTop", js.undefined)
    @scala.inline
    def setPaddingVertical(value: Double | String): Self = this.set("paddingVertical", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePaddingVertical: Self = this.set("paddingVertical", js.undefined)
    @scala.inline
    def setPosition(value: absolute | relative): Self = this.set("position", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePosition: Self = this.set("position", js.undefined)
    @scala.inline
    def setRight(value: Double | String): Self = this.set("right", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRight: Self = this.set("right", js.undefined)
    @scala.inline
    def setStart(value: Double | String): Self = this.set("start", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStart: Self = this.set("start", js.undefined)
    @scala.inline
    def setTop(value: Double | String): Self = this.set("top", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTop: Self = this.set("top", js.undefined)
    @scala.inline
    def setWidth(value: Double | String): Self = this.set("width", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWidth: Self = this.set("width", js.undefined)
    @scala.inline
    def setZIndex(value: Double): Self = this.set("zIndex", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteZIndex: Self = this.set("zIndex", js.undefined)
  }
  
}

