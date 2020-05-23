package typings.reactSketchapp.typesMod

import typings.reactSketchapp.anon.Width
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
import typings.reactSketchapp.reactSketchappStrings.hidden
import typings.reactSketchapp.reactSketchappStrings.nowrap
import typings.reactSketchapp.reactSketchappStrings.relative
import typings.reactSketchapp.reactSketchappStrings.row
import typings.reactSketchapp.reactSketchappStrings.stretch
import typings.reactSketchapp.reactSketchappStrings.visible
import typings.reactSketchapp.reactSketchappStrings.wrap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ViewStyle extends js.Object {
  var alignItems: js.UndefOr[`flex-start` | `flex-end` | center | stretch] = js.undefined
  var alignSelf: js.UndefOr[auto | `flex-start` | `flex-end` | center | stretch] = js.undefined
  var aspectRatio: js.UndefOr[Double] = js.undefined
  var backfaceVisibility: js.UndefOr[visible | hidden] = js.undefined
  var backgroundColor: js.UndefOr[Color] = js.undefined
  var borderBottomColor: js.UndefOr[Color] = js.undefined
  var borderBottomLeftRadius: js.UndefOr[Double] = js.undefined
  var borderBottomRightRadius: js.UndefOr[Double] = js.undefined
  var borderBottomStyle: js.UndefOr[BorderStyle] = js.undefined
  var borderBottomWidth: js.UndefOr[Double] = js.undefined
  var borderColor: js.UndefOr[Color] = js.undefined
  var borderLeftColor: js.UndefOr[Color] = js.undefined
  var borderLeftStyle: js.UndefOr[BorderStyle] = js.undefined
  var borderLeftWidth: js.UndefOr[Double] = js.undefined
  var borderRadius: js.UndefOr[Double] = js.undefined
  var borderRightColor: js.UndefOr[Color] = js.undefined
  var borderRightStyle: js.UndefOr[BorderStyle] = js.undefined
  var borderRightWidth: js.UndefOr[Double] = js.undefined
  var borderStyle: js.UndefOr[BorderStyle] = js.undefined
  var borderTopColor: js.UndefOr[Color] = js.undefined
  var borderTopLeftRadius: js.UndefOr[Double] = js.undefined
  var borderTopRightRadius: js.UndefOr[Double] = js.undefined
  var borderTopStyle: js.UndefOr[BorderStyle] = js.undefined
  var borderTopWidth: js.UndefOr[Double] = js.undefined
  var borderWidth: js.UndefOr[Double] = js.undefined
  var bottom: js.UndefOr[Double] = js.undefined
  var color: js.UndefOr[Color] = js.undefined
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
  var overflow: js.UndefOr[Overflow] = js.undefined
  var overflowX: js.UndefOr[Overflow] = js.undefined
  var overflowY: js.UndefOr[Overflow] = js.undefined
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
  var shadowInner: js.UndefOr[Boolean] = js.undefined
  var shadowOffset: js.UndefOr[Width] = js.undefined
  var shadowOpacity: js.UndefOr[Double] = js.undefined
  var shadowRadius: js.UndefOr[Double] = js.undefined
  var shadowSpread: js.UndefOr[Double] = js.undefined
  var top: js.UndefOr[Double] = js.undefined
  var transform: js.UndefOr[String] = js.undefined
  var transformOrigin: js.UndefOr[String] = js.undefined
  var width: js.UndefOr[Double] = js.undefined
  var zIndex: js.UndefOr[Double] = js.undefined
}

object ViewStyle {
  @scala.inline
  def apply(
    alignItems: `flex-start` | `flex-end` | center | stretch = null,
    alignSelf: auto | `flex-start` | `flex-end` | center | stretch = null,
    aspectRatio: js.UndefOr[Double] = js.undefined,
    backfaceVisibility: visible | hidden = null,
    backgroundColor: Color = null,
    borderBottomColor: Color = null,
    borderBottomLeftRadius: js.UndefOr[Double] = js.undefined,
    borderBottomRightRadius: js.UndefOr[Double] = js.undefined,
    borderBottomStyle: BorderStyle = null,
    borderBottomWidth: js.UndefOr[Double] = js.undefined,
    borderColor: Color = null,
    borderLeftColor: Color = null,
    borderLeftStyle: BorderStyle = null,
    borderLeftWidth: js.UndefOr[Double] = js.undefined,
    borderRadius: js.UndefOr[Double] = js.undefined,
    borderRightColor: Color = null,
    borderRightStyle: BorderStyle = null,
    borderRightWidth: js.UndefOr[Double] = js.undefined,
    borderStyle: BorderStyle = null,
    borderTopColor: Color = null,
    borderTopLeftRadius: js.UndefOr[Double] = js.undefined,
    borderTopRightRadius: js.UndefOr[Double] = js.undefined,
    borderTopStyle: BorderStyle = null,
    borderTopWidth: js.UndefOr[Double] = js.undefined,
    borderWidth: js.UndefOr[Double] = js.undefined,
    bottom: js.UndefOr[Double] = js.undefined,
    color: Color = null,
    flex: js.UndefOr[Double] = js.undefined,
    flexBasis: js.UndefOr[Double] = js.undefined,
    flexDirection: row | `row-reverse` | column | `column-reverse` = null,
    flexGrow: js.UndefOr[Double] = js.undefined,
    flexShrink: js.UndefOr[Double] = js.undefined,
    flexWrap: wrap | nowrap = null,
    height: js.UndefOr[Double] = js.undefined,
    justifyContent: `flex-start` | `flex-end` | center | `space-between` | `space-around` = null,
    left: js.UndefOr[Double] = js.undefined,
    margin: js.UndefOr[Double] = js.undefined,
    marginBottom: js.UndefOr[Double] = js.undefined,
    marginHorizontal: js.UndefOr[Double] = js.undefined,
    marginLeft: js.UndefOr[Double] = js.undefined,
    marginRight: js.UndefOr[Double] = js.undefined,
    marginTop: js.UndefOr[Double] = js.undefined,
    marginVertical: js.UndefOr[Double] = js.undefined,
    maxHeight: js.UndefOr[Double] = js.undefined,
    maxWidth: js.UndefOr[Double] = js.undefined,
    minHeight: js.UndefOr[Double] = js.undefined,
    minWidth: js.UndefOr[Double] = js.undefined,
    opacity: js.UndefOr[Double] = js.undefined,
    overflow: Overflow = null,
    overflowX: Overflow = null,
    overflowY: Overflow = null,
    padding: js.UndefOr[Double] = js.undefined,
    paddingBottom: js.UndefOr[Double] = js.undefined,
    paddingHorizontal: js.UndefOr[Double] = js.undefined,
    paddingLeft: js.UndefOr[Double] = js.undefined,
    paddingRight: js.UndefOr[Double] = js.undefined,
    paddingTop: js.UndefOr[Double] = js.undefined,
    paddingVertical: js.UndefOr[Double] = js.undefined,
    position: absolute | relative = null,
    right: js.UndefOr[Double] = js.undefined,
    shadowColor: Color = null,
    shadowInner: js.UndefOr[Boolean] = js.undefined,
    shadowOffset: Width = null,
    shadowOpacity: js.UndefOr[Double] = js.undefined,
    shadowRadius: js.UndefOr[Double] = js.undefined,
    shadowSpread: js.UndefOr[Double] = js.undefined,
    top: js.UndefOr[Double] = js.undefined,
    transform: String = null,
    transformOrigin: String = null,
    width: js.UndefOr[Double] = js.undefined,
    zIndex: js.UndefOr[Double] = js.undefined
  ): ViewStyle = {
    val __obj = js.Dynamic.literal()
    if (alignItems != null) __obj.updateDynamic("alignItems")(alignItems.asInstanceOf[js.Any])
    if (alignSelf != null) __obj.updateDynamic("alignSelf")(alignSelf.asInstanceOf[js.Any])
    if (!js.isUndefined(aspectRatio)) __obj.updateDynamic("aspectRatio")(aspectRatio.get.asInstanceOf[js.Any])
    if (backfaceVisibility != null) __obj.updateDynamic("backfaceVisibility")(backfaceVisibility.asInstanceOf[js.Any])
    if (backgroundColor != null) __obj.updateDynamic("backgroundColor")(backgroundColor.asInstanceOf[js.Any])
    if (borderBottomColor != null) __obj.updateDynamic("borderBottomColor")(borderBottomColor.asInstanceOf[js.Any])
    if (!js.isUndefined(borderBottomLeftRadius)) __obj.updateDynamic("borderBottomLeftRadius")(borderBottomLeftRadius.get.asInstanceOf[js.Any])
    if (!js.isUndefined(borderBottomRightRadius)) __obj.updateDynamic("borderBottomRightRadius")(borderBottomRightRadius.get.asInstanceOf[js.Any])
    if (borderBottomStyle != null) __obj.updateDynamic("borderBottomStyle")(borderBottomStyle.asInstanceOf[js.Any])
    if (!js.isUndefined(borderBottomWidth)) __obj.updateDynamic("borderBottomWidth")(borderBottomWidth.get.asInstanceOf[js.Any])
    if (borderColor != null) __obj.updateDynamic("borderColor")(borderColor.asInstanceOf[js.Any])
    if (borderLeftColor != null) __obj.updateDynamic("borderLeftColor")(borderLeftColor.asInstanceOf[js.Any])
    if (borderLeftStyle != null) __obj.updateDynamic("borderLeftStyle")(borderLeftStyle.asInstanceOf[js.Any])
    if (!js.isUndefined(borderLeftWidth)) __obj.updateDynamic("borderLeftWidth")(borderLeftWidth.get.asInstanceOf[js.Any])
    if (!js.isUndefined(borderRadius)) __obj.updateDynamic("borderRadius")(borderRadius.get.asInstanceOf[js.Any])
    if (borderRightColor != null) __obj.updateDynamic("borderRightColor")(borderRightColor.asInstanceOf[js.Any])
    if (borderRightStyle != null) __obj.updateDynamic("borderRightStyle")(borderRightStyle.asInstanceOf[js.Any])
    if (!js.isUndefined(borderRightWidth)) __obj.updateDynamic("borderRightWidth")(borderRightWidth.get.asInstanceOf[js.Any])
    if (borderStyle != null) __obj.updateDynamic("borderStyle")(borderStyle.asInstanceOf[js.Any])
    if (borderTopColor != null) __obj.updateDynamic("borderTopColor")(borderTopColor.asInstanceOf[js.Any])
    if (!js.isUndefined(borderTopLeftRadius)) __obj.updateDynamic("borderTopLeftRadius")(borderTopLeftRadius.get.asInstanceOf[js.Any])
    if (!js.isUndefined(borderTopRightRadius)) __obj.updateDynamic("borderTopRightRadius")(borderTopRightRadius.get.asInstanceOf[js.Any])
    if (borderTopStyle != null) __obj.updateDynamic("borderTopStyle")(borderTopStyle.asInstanceOf[js.Any])
    if (!js.isUndefined(borderTopWidth)) __obj.updateDynamic("borderTopWidth")(borderTopWidth.get.asInstanceOf[js.Any])
    if (!js.isUndefined(borderWidth)) __obj.updateDynamic("borderWidth")(borderWidth.get.asInstanceOf[js.Any])
    if (!js.isUndefined(bottom)) __obj.updateDynamic("bottom")(bottom.get.asInstanceOf[js.Any])
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (!js.isUndefined(flex)) __obj.updateDynamic("flex")(flex.get.asInstanceOf[js.Any])
    if (!js.isUndefined(flexBasis)) __obj.updateDynamic("flexBasis")(flexBasis.get.asInstanceOf[js.Any])
    if (flexDirection != null) __obj.updateDynamic("flexDirection")(flexDirection.asInstanceOf[js.Any])
    if (!js.isUndefined(flexGrow)) __obj.updateDynamic("flexGrow")(flexGrow.get.asInstanceOf[js.Any])
    if (!js.isUndefined(flexShrink)) __obj.updateDynamic("flexShrink")(flexShrink.get.asInstanceOf[js.Any])
    if (flexWrap != null) __obj.updateDynamic("flexWrap")(flexWrap.asInstanceOf[js.Any])
    if (!js.isUndefined(height)) __obj.updateDynamic("height")(height.get.asInstanceOf[js.Any])
    if (justifyContent != null) __obj.updateDynamic("justifyContent")(justifyContent.asInstanceOf[js.Any])
    if (!js.isUndefined(left)) __obj.updateDynamic("left")(left.get.asInstanceOf[js.Any])
    if (!js.isUndefined(margin)) __obj.updateDynamic("margin")(margin.get.asInstanceOf[js.Any])
    if (!js.isUndefined(marginBottom)) __obj.updateDynamic("marginBottom")(marginBottom.get.asInstanceOf[js.Any])
    if (!js.isUndefined(marginHorizontal)) __obj.updateDynamic("marginHorizontal")(marginHorizontal.get.asInstanceOf[js.Any])
    if (!js.isUndefined(marginLeft)) __obj.updateDynamic("marginLeft")(marginLeft.get.asInstanceOf[js.Any])
    if (!js.isUndefined(marginRight)) __obj.updateDynamic("marginRight")(marginRight.get.asInstanceOf[js.Any])
    if (!js.isUndefined(marginTop)) __obj.updateDynamic("marginTop")(marginTop.get.asInstanceOf[js.Any])
    if (!js.isUndefined(marginVertical)) __obj.updateDynamic("marginVertical")(marginVertical.get.asInstanceOf[js.Any])
    if (!js.isUndefined(maxHeight)) __obj.updateDynamic("maxHeight")(maxHeight.get.asInstanceOf[js.Any])
    if (!js.isUndefined(maxWidth)) __obj.updateDynamic("maxWidth")(maxWidth.get.asInstanceOf[js.Any])
    if (!js.isUndefined(minHeight)) __obj.updateDynamic("minHeight")(minHeight.get.asInstanceOf[js.Any])
    if (!js.isUndefined(minWidth)) __obj.updateDynamic("minWidth")(minWidth.get.asInstanceOf[js.Any])
    if (!js.isUndefined(opacity)) __obj.updateDynamic("opacity")(opacity.get.asInstanceOf[js.Any])
    if (overflow != null) __obj.updateDynamic("overflow")(overflow.asInstanceOf[js.Any])
    if (overflowX != null) __obj.updateDynamic("overflowX")(overflowX.asInstanceOf[js.Any])
    if (overflowY != null) __obj.updateDynamic("overflowY")(overflowY.asInstanceOf[js.Any])
    if (!js.isUndefined(padding)) __obj.updateDynamic("padding")(padding.get.asInstanceOf[js.Any])
    if (!js.isUndefined(paddingBottom)) __obj.updateDynamic("paddingBottom")(paddingBottom.get.asInstanceOf[js.Any])
    if (!js.isUndefined(paddingHorizontal)) __obj.updateDynamic("paddingHorizontal")(paddingHorizontal.get.asInstanceOf[js.Any])
    if (!js.isUndefined(paddingLeft)) __obj.updateDynamic("paddingLeft")(paddingLeft.get.asInstanceOf[js.Any])
    if (!js.isUndefined(paddingRight)) __obj.updateDynamic("paddingRight")(paddingRight.get.asInstanceOf[js.Any])
    if (!js.isUndefined(paddingTop)) __obj.updateDynamic("paddingTop")(paddingTop.get.asInstanceOf[js.Any])
    if (!js.isUndefined(paddingVertical)) __obj.updateDynamic("paddingVertical")(paddingVertical.get.asInstanceOf[js.Any])
    if (position != null) __obj.updateDynamic("position")(position.asInstanceOf[js.Any])
    if (!js.isUndefined(right)) __obj.updateDynamic("right")(right.get.asInstanceOf[js.Any])
    if (shadowColor != null) __obj.updateDynamic("shadowColor")(shadowColor.asInstanceOf[js.Any])
    if (!js.isUndefined(shadowInner)) __obj.updateDynamic("shadowInner")(shadowInner.get.asInstanceOf[js.Any])
    if (shadowOffset != null) __obj.updateDynamic("shadowOffset")(shadowOffset.asInstanceOf[js.Any])
    if (!js.isUndefined(shadowOpacity)) __obj.updateDynamic("shadowOpacity")(shadowOpacity.get.asInstanceOf[js.Any])
    if (!js.isUndefined(shadowRadius)) __obj.updateDynamic("shadowRadius")(shadowRadius.get.asInstanceOf[js.Any])
    if (!js.isUndefined(shadowSpread)) __obj.updateDynamic("shadowSpread")(shadowSpread.get.asInstanceOf[js.Any])
    if (!js.isUndefined(top)) __obj.updateDynamic("top")(top.get.asInstanceOf[js.Any])
    if (transform != null) __obj.updateDynamic("transform")(transform.asInstanceOf[js.Any])
    if (transformOrigin != null) __obj.updateDynamic("transformOrigin")(transformOrigin.asInstanceOf[js.Any])
    if (!js.isUndefined(width)) __obj.updateDynamic("width")(width.get.asInstanceOf[js.Any])
    if (!js.isUndefined(zIndex)) __obj.updateDynamic("zIndex")(zIndex.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[ViewStyle]
  }
}

