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
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Style extends js.Object {
  var alignItems: js.UndefOr[`flex-start` | `flex-end` | center | stretch] = js.native
  var alignSelf: js.UndefOr[auto | `flex-start` | `flex-end` | center | stretch] = js.native
  var aspectRatio: js.UndefOr[Double] = js.native
  var backfaceVisibility: js.UndefOr[visible | hidden] = js.native
  var backgroundColor: js.UndefOr[Color] = js.native
  var borderBottomColor: js.UndefOr[Color] = js.native
  var borderBottomLeftRadius: js.UndefOr[Double] = js.native
  var borderBottomRightRadius: js.UndefOr[Double] = js.native
  var borderBottomWidth: js.UndefOr[Double] = js.native
  var borderColor: js.UndefOr[Color] = js.native
  var borderLeftColor: js.UndefOr[Color] = js.native
  var borderLeftWidth: js.UndefOr[Double] = js.native
  var borderRadius: js.UndefOr[Double] = js.native
  var borderRightColor: js.UndefOr[Color] = js.native
  var borderRightWidth: js.UndefOr[Double] = js.native
  var borderStyle: js.UndefOr[solid | dotted | dashed] = js.native
  var borderTopColor: js.UndefOr[Color] = js.native
  var borderTopLeftRadius: js.UndefOr[Double] = js.native
  var borderTopRightRadius: js.UndefOr[Double] = js.native
  var borderTopWidth: js.UndefOr[Double] = js.native
  var borderWidth: js.UndefOr[Double] = js.native
  var bottom: js.UndefOr[Double] = js.native
  var flex: js.UndefOr[Double] = js.native
  var flexBasis: js.UndefOr[Double] = js.native
  var flexDirection: js.UndefOr[row | `row-reverse` | column | `column-reverse`] = js.native
  var flexGrow: js.UndefOr[Double] = js.native
  var flexShrink: js.UndefOr[Double] = js.native
  var flexWrap: js.UndefOr[wrap | nowrap] = js.native
  var height: js.UndefOr[Double] = js.native
  var justifyContent: js.UndefOr[`flex-start` | `flex-end` | center | `space-between` | `space-around`] = js.native
  var left: js.UndefOr[Double] = js.native
  var margin: js.UndefOr[Double] = js.native
  var marginBottom: js.UndefOr[Double] = js.native
  var marginHorizontal: js.UndefOr[Double] = js.native
  var marginLeft: js.UndefOr[Double] = js.native
  var marginRight: js.UndefOr[Double] = js.native
  var marginTop: js.UndefOr[Double] = js.native
  var marginVertical: js.UndefOr[Double] = js.native
  var maxHeight: js.UndefOr[Double] = js.native
  var maxWidth: js.UndefOr[Double] = js.native
  var minHeight: js.UndefOr[Double] = js.native
  var minWidth: js.UndefOr[Double] = js.native
  var opacity: js.UndefOr[Double] = js.native
  var overflow: js.UndefOr[visible | hidden | scroll] = js.native
  var padding: js.UndefOr[Double] = js.native
  var paddingBottom: js.UndefOr[Double] = js.native
  var paddingHorizontal: js.UndefOr[Double] = js.native
  var paddingLeft: js.UndefOr[Double] = js.native
  var paddingRight: js.UndefOr[Double] = js.native
  var paddingTop: js.UndefOr[Double] = js.native
  var paddingVertical: js.UndefOr[Double] = js.native
  var position: js.UndefOr[absolute | relative] = js.native
  var right: js.UndefOr[Double] = js.native
  var shadowColor: js.UndefOr[Color] = js.native
  var shadowOffset: js.UndefOr[Height] = js.native
  var shadowOpacity: js.UndefOr[Double] = js.native
  var shadowRadius: js.UndefOr[Double] = js.native
  var top: js.UndefOr[Double] = js.native
  var width: js.UndefOr[Double] = js.native
  var zIndex: js.UndefOr[Double] = js.native
}

object Style {
  @scala.inline
  def apply(): Style = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Style]
  }
  @scala.inline
  implicit class StyleOps[Self <: Style] (val x: Self) extends AnyVal {
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
    def setAlignItems(value: `flex-start` | `flex-end` | center | stretch): Self = this.set("alignItems", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAlignItems: Self = this.set("alignItems", js.undefined)
    @scala.inline
    def setAlignSelf(value: auto | `flex-start` | `flex-end` | center | stretch): Self = this.set("alignSelf", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAlignSelf: Self = this.set("alignSelf", js.undefined)
    @scala.inline
    def setAspectRatio(value: Double): Self = this.set("aspectRatio", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAspectRatio: Self = this.set("aspectRatio", js.undefined)
    @scala.inline
    def setBackfaceVisibility(value: visible | hidden): Self = this.set("backfaceVisibility", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBackfaceVisibility: Self = this.set("backfaceVisibility", js.undefined)
    @scala.inline
    def setBackgroundColor(value: Color): Self = this.set("backgroundColor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBackgroundColor: Self = this.set("backgroundColor", js.undefined)
    @scala.inline
    def setBorderBottomColor(value: Color): Self = this.set("borderBottomColor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBorderBottomColor: Self = this.set("borderBottomColor", js.undefined)
    @scala.inline
    def setBorderBottomLeftRadius(value: Double): Self = this.set("borderBottomLeftRadius", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBorderBottomLeftRadius: Self = this.set("borderBottomLeftRadius", js.undefined)
    @scala.inline
    def setBorderBottomRightRadius(value: Double): Self = this.set("borderBottomRightRadius", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBorderBottomRightRadius: Self = this.set("borderBottomRightRadius", js.undefined)
    @scala.inline
    def setBorderBottomWidth(value: Double): Self = this.set("borderBottomWidth", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBorderBottomWidth: Self = this.set("borderBottomWidth", js.undefined)
    @scala.inline
    def setBorderColor(value: Color): Self = this.set("borderColor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBorderColor: Self = this.set("borderColor", js.undefined)
    @scala.inline
    def setBorderLeftColor(value: Color): Self = this.set("borderLeftColor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBorderLeftColor: Self = this.set("borderLeftColor", js.undefined)
    @scala.inline
    def setBorderLeftWidth(value: Double): Self = this.set("borderLeftWidth", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBorderLeftWidth: Self = this.set("borderLeftWidth", js.undefined)
    @scala.inline
    def setBorderRadius(value: Double): Self = this.set("borderRadius", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBorderRadius: Self = this.set("borderRadius", js.undefined)
    @scala.inline
    def setBorderRightColor(value: Color): Self = this.set("borderRightColor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBorderRightColor: Self = this.set("borderRightColor", js.undefined)
    @scala.inline
    def setBorderRightWidth(value: Double): Self = this.set("borderRightWidth", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBorderRightWidth: Self = this.set("borderRightWidth", js.undefined)
    @scala.inline
    def setBorderStyle(value: solid | dotted | dashed): Self = this.set("borderStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBorderStyle: Self = this.set("borderStyle", js.undefined)
    @scala.inline
    def setBorderTopColor(value: Color): Self = this.set("borderTopColor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBorderTopColor: Self = this.set("borderTopColor", js.undefined)
    @scala.inline
    def setBorderTopLeftRadius(value: Double): Self = this.set("borderTopLeftRadius", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBorderTopLeftRadius: Self = this.set("borderTopLeftRadius", js.undefined)
    @scala.inline
    def setBorderTopRightRadius(value: Double): Self = this.set("borderTopRightRadius", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBorderTopRightRadius: Self = this.set("borderTopRightRadius", js.undefined)
    @scala.inline
    def setBorderTopWidth(value: Double): Self = this.set("borderTopWidth", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBorderTopWidth: Self = this.set("borderTopWidth", js.undefined)
    @scala.inline
    def setBorderWidth(value: Double): Self = this.set("borderWidth", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBorderWidth: Self = this.set("borderWidth", js.undefined)
    @scala.inline
    def setBottom(value: Double): Self = this.set("bottom", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBottom: Self = this.set("bottom", js.undefined)
    @scala.inline
    def setFlex(value: Double): Self = this.set("flex", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFlex: Self = this.set("flex", js.undefined)
    @scala.inline
    def setFlexBasis(value: Double): Self = this.set("flexBasis", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFlexBasis: Self = this.set("flexBasis", js.undefined)
    @scala.inline
    def setFlexDirection(value: row | `row-reverse` | column | `column-reverse`): Self = this.set("flexDirection", value.asInstanceOf[js.Any])
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
    def setFlexWrap(value: wrap | nowrap): Self = this.set("flexWrap", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFlexWrap: Self = this.set("flexWrap", js.undefined)
    @scala.inline
    def setHeight(value: Double): Self = this.set("height", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHeight: Self = this.set("height", js.undefined)
    @scala.inline
    def setJustifyContent(value: `flex-start` | `flex-end` | center | `space-between` | `space-around`): Self = this.set("justifyContent", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteJustifyContent: Self = this.set("justifyContent", js.undefined)
    @scala.inline
    def setLeft(value: Double): Self = this.set("left", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLeft: Self = this.set("left", js.undefined)
    @scala.inline
    def setMargin(value: Double): Self = this.set("margin", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMargin: Self = this.set("margin", js.undefined)
    @scala.inline
    def setMarginBottom(value: Double): Self = this.set("marginBottom", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMarginBottom: Self = this.set("marginBottom", js.undefined)
    @scala.inline
    def setMarginHorizontal(value: Double): Self = this.set("marginHorizontal", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMarginHorizontal: Self = this.set("marginHorizontal", js.undefined)
    @scala.inline
    def setMarginLeft(value: Double): Self = this.set("marginLeft", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMarginLeft: Self = this.set("marginLeft", js.undefined)
    @scala.inline
    def setMarginRight(value: Double): Self = this.set("marginRight", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMarginRight: Self = this.set("marginRight", js.undefined)
    @scala.inline
    def setMarginTop(value: Double): Self = this.set("marginTop", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMarginTop: Self = this.set("marginTop", js.undefined)
    @scala.inline
    def setMarginVertical(value: Double): Self = this.set("marginVertical", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMarginVertical: Self = this.set("marginVertical", js.undefined)
    @scala.inline
    def setMaxHeight(value: Double): Self = this.set("maxHeight", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxHeight: Self = this.set("maxHeight", js.undefined)
    @scala.inline
    def setMaxWidth(value: Double): Self = this.set("maxWidth", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxWidth: Self = this.set("maxWidth", js.undefined)
    @scala.inline
    def setMinHeight(value: Double): Self = this.set("minHeight", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMinHeight: Self = this.set("minHeight", js.undefined)
    @scala.inline
    def setMinWidth(value: Double): Self = this.set("minWidth", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMinWidth: Self = this.set("minWidth", js.undefined)
    @scala.inline
    def setOpacity(value: Double): Self = this.set("opacity", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOpacity: Self = this.set("opacity", js.undefined)
    @scala.inline
    def setOverflow(value: visible | hidden | scroll): Self = this.set("overflow", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOverflow: Self = this.set("overflow", js.undefined)
    @scala.inline
    def setPadding(value: Double): Self = this.set("padding", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePadding: Self = this.set("padding", js.undefined)
    @scala.inline
    def setPaddingBottom(value: Double): Self = this.set("paddingBottom", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePaddingBottom: Self = this.set("paddingBottom", js.undefined)
    @scala.inline
    def setPaddingHorizontal(value: Double): Self = this.set("paddingHorizontal", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePaddingHorizontal: Self = this.set("paddingHorizontal", js.undefined)
    @scala.inline
    def setPaddingLeft(value: Double): Self = this.set("paddingLeft", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePaddingLeft: Self = this.set("paddingLeft", js.undefined)
    @scala.inline
    def setPaddingRight(value: Double): Self = this.set("paddingRight", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePaddingRight: Self = this.set("paddingRight", js.undefined)
    @scala.inline
    def setPaddingTop(value: Double): Self = this.set("paddingTop", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePaddingTop: Self = this.set("paddingTop", js.undefined)
    @scala.inline
    def setPaddingVertical(value: Double): Self = this.set("paddingVertical", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePaddingVertical: Self = this.set("paddingVertical", js.undefined)
    @scala.inline
    def setPosition(value: absolute | relative): Self = this.set("position", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePosition: Self = this.set("position", js.undefined)
    @scala.inline
    def setRight(value: Double): Self = this.set("right", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRight: Self = this.set("right", js.undefined)
    @scala.inline
    def setShadowColor(value: Color): Self = this.set("shadowColor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShadowColor: Self = this.set("shadowColor", js.undefined)
    @scala.inline
    def setShadowOffset(value: Height): Self = this.set("shadowOffset", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShadowOffset: Self = this.set("shadowOffset", js.undefined)
    @scala.inline
    def setShadowOpacity(value: Double): Self = this.set("shadowOpacity", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShadowOpacity: Self = this.set("shadowOpacity", js.undefined)
    @scala.inline
    def setShadowRadius(value: Double): Self = this.set("shadowRadius", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShadowRadius: Self = this.set("shadowRadius", js.undefined)
    @scala.inline
    def setTop(value: Double): Self = this.set("top", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTop: Self = this.set("top", js.undefined)
    @scala.inline
    def setWidth(value: Double): Self = this.set("width", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWidth: Self = this.set("width", js.undefined)
    @scala.inline
    def setZIndex(value: Double): Self = this.set("zIndex", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteZIndex: Self = this.set("zIndex", js.undefined)
  }
  
}

