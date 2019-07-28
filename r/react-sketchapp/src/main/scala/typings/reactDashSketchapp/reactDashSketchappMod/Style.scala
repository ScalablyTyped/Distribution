package typings.reactDashSketchapp.reactDashSketchappMod

import typings.reactDashSketchapp.Anon_Height
import typings.reactDashSketchapp.reactDashSketchappStrings.`column-reverse`
import typings.reactDashSketchapp.reactDashSketchappStrings.`flex-end`
import typings.reactDashSketchapp.reactDashSketchappStrings.`flex-start`
import typings.reactDashSketchapp.reactDashSketchappStrings.`row-reverse`
import typings.reactDashSketchapp.reactDashSketchappStrings.`space-around`
import typings.reactDashSketchapp.reactDashSketchappStrings.`space-between`
import typings.reactDashSketchapp.reactDashSketchappStrings.absolute
import typings.reactDashSketchapp.reactDashSketchappStrings.auto
import typings.reactDashSketchapp.reactDashSketchappStrings.center
import typings.reactDashSketchapp.reactDashSketchappStrings.column
import typings.reactDashSketchapp.reactDashSketchappStrings.dashed
import typings.reactDashSketchapp.reactDashSketchappStrings.dotted
import typings.reactDashSketchapp.reactDashSketchappStrings.hidden
import typings.reactDashSketchapp.reactDashSketchappStrings.nowrap
import typings.reactDashSketchapp.reactDashSketchappStrings.relative
import typings.reactDashSketchapp.reactDashSketchappStrings.row
import typings.reactDashSketchapp.reactDashSketchappStrings.scroll
import typings.reactDashSketchapp.reactDashSketchappStrings.solid
import typings.reactDashSketchapp.reactDashSketchappStrings.stretch
import typings.reactDashSketchapp.reactDashSketchappStrings.visible
import typings.reactDashSketchapp.reactDashSketchappStrings.wrap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Style extends js.Object {
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
  var shadowOffset: js.UndefOr[Anon_Height] = js.undefined
  var shadowOpacity: js.UndefOr[Double] = js.undefined
  var shadowRadius: js.UndefOr[Double] = js.undefined
  var top: js.UndefOr[Double] = js.undefined
  var width: js.UndefOr[Double] = js.undefined
  var zIndex: js.UndefOr[Double] = js.undefined
}

object Style {
  @scala.inline
  def apply(
    alignItems: `flex-start` | `flex-end` | center | stretch = null,
    alignSelf: auto | `flex-start` | `flex-end` | center | stretch = null,
    aspectRatio: Int | Double = null,
    backfaceVisibility: visible | hidden = null,
    backgroundColor: Color = null,
    borderBottomColor: Color = null,
    borderBottomLeftRadius: Int | Double = null,
    borderBottomRightRadius: Int | Double = null,
    borderBottomWidth: Int | Double = null,
    borderColor: Color = null,
    borderLeftColor: Color = null,
    borderLeftWidth: Int | Double = null,
    borderRadius: Int | Double = null,
    borderRightColor: Color = null,
    borderRightWidth: Int | Double = null,
    borderStyle: solid | dotted | dashed = null,
    borderTopColor: Color = null,
    borderTopLeftRadius: Int | Double = null,
    borderTopRightRadius: Int | Double = null,
    borderTopWidth: Int | Double = null,
    borderWidth: Int | Double = null,
    bottom: Int | Double = null,
    flex: Int | Double = null,
    flexBasis: Int | Double = null,
    flexDirection: row | `row-reverse` | column | `column-reverse` = null,
    flexGrow: Int | Double = null,
    flexShrink: Int | Double = null,
    flexWrap: wrap | nowrap = null,
    height: Int | Double = null,
    justifyContent: `flex-start` | `flex-end` | center | `space-between` | `space-around` = null,
    left: Int | Double = null,
    margin: Int | Double = null,
    marginBottom: Int | Double = null,
    marginHorizontal: Int | Double = null,
    marginLeft: Int | Double = null,
    marginRight: Int | Double = null,
    marginTop: Int | Double = null,
    marginVertical: Int | Double = null,
    maxHeight: Int | Double = null,
    maxWidth: Int | Double = null,
    minHeight: Int | Double = null,
    minWidth: Int | Double = null,
    opacity: Int | Double = null,
    overflow: visible | hidden | scroll = null,
    padding: Int | Double = null,
    paddingBottom: Int | Double = null,
    paddingHorizontal: Int | Double = null,
    paddingLeft: Int | Double = null,
    paddingRight: Int | Double = null,
    paddingTop: Int | Double = null,
    paddingVertical: Int | Double = null,
    position: absolute | relative = null,
    right: Int | Double = null,
    shadowColor: Color = null,
    shadowOffset: Anon_Height = null,
    shadowOpacity: Int | Double = null,
    shadowRadius: Int | Double = null,
    top: Int | Double = null,
    width: Int | Double = null,
    zIndex: Int | Double = null
  ): Style = {
    val __obj = js.Dynamic.literal()
    if (alignItems != null) __obj.updateDynamic("alignItems")(alignItems.asInstanceOf[js.Any])
    if (alignSelf != null) __obj.updateDynamic("alignSelf")(alignSelf.asInstanceOf[js.Any])
    if (aspectRatio != null) __obj.updateDynamic("aspectRatio")(aspectRatio.asInstanceOf[js.Any])
    if (backfaceVisibility != null) __obj.updateDynamic("backfaceVisibility")(backfaceVisibility.asInstanceOf[js.Any])
    if (backgroundColor != null) __obj.updateDynamic("backgroundColor")(backgroundColor.asInstanceOf[js.Any])
    if (borderBottomColor != null) __obj.updateDynamic("borderBottomColor")(borderBottomColor.asInstanceOf[js.Any])
    if (borderBottomLeftRadius != null) __obj.updateDynamic("borderBottomLeftRadius")(borderBottomLeftRadius.asInstanceOf[js.Any])
    if (borderBottomRightRadius != null) __obj.updateDynamic("borderBottomRightRadius")(borderBottomRightRadius.asInstanceOf[js.Any])
    if (borderBottomWidth != null) __obj.updateDynamic("borderBottomWidth")(borderBottomWidth.asInstanceOf[js.Any])
    if (borderColor != null) __obj.updateDynamic("borderColor")(borderColor.asInstanceOf[js.Any])
    if (borderLeftColor != null) __obj.updateDynamic("borderLeftColor")(borderLeftColor.asInstanceOf[js.Any])
    if (borderLeftWidth != null) __obj.updateDynamic("borderLeftWidth")(borderLeftWidth.asInstanceOf[js.Any])
    if (borderRadius != null) __obj.updateDynamic("borderRadius")(borderRadius.asInstanceOf[js.Any])
    if (borderRightColor != null) __obj.updateDynamic("borderRightColor")(borderRightColor.asInstanceOf[js.Any])
    if (borderRightWidth != null) __obj.updateDynamic("borderRightWidth")(borderRightWidth.asInstanceOf[js.Any])
    if (borderStyle != null) __obj.updateDynamic("borderStyle")(borderStyle.asInstanceOf[js.Any])
    if (borderTopColor != null) __obj.updateDynamic("borderTopColor")(borderTopColor.asInstanceOf[js.Any])
    if (borderTopLeftRadius != null) __obj.updateDynamic("borderTopLeftRadius")(borderTopLeftRadius.asInstanceOf[js.Any])
    if (borderTopRightRadius != null) __obj.updateDynamic("borderTopRightRadius")(borderTopRightRadius.asInstanceOf[js.Any])
    if (borderTopWidth != null) __obj.updateDynamic("borderTopWidth")(borderTopWidth.asInstanceOf[js.Any])
    if (borderWidth != null) __obj.updateDynamic("borderWidth")(borderWidth.asInstanceOf[js.Any])
    if (bottom != null) __obj.updateDynamic("bottom")(bottom.asInstanceOf[js.Any])
    if (flex != null) __obj.updateDynamic("flex")(flex.asInstanceOf[js.Any])
    if (flexBasis != null) __obj.updateDynamic("flexBasis")(flexBasis.asInstanceOf[js.Any])
    if (flexDirection != null) __obj.updateDynamic("flexDirection")(flexDirection.asInstanceOf[js.Any])
    if (flexGrow != null) __obj.updateDynamic("flexGrow")(flexGrow.asInstanceOf[js.Any])
    if (flexShrink != null) __obj.updateDynamic("flexShrink")(flexShrink.asInstanceOf[js.Any])
    if (flexWrap != null) __obj.updateDynamic("flexWrap")(flexWrap.asInstanceOf[js.Any])
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (justifyContent != null) __obj.updateDynamic("justifyContent")(justifyContent.asInstanceOf[js.Any])
    if (left != null) __obj.updateDynamic("left")(left.asInstanceOf[js.Any])
    if (margin != null) __obj.updateDynamic("margin")(margin.asInstanceOf[js.Any])
    if (marginBottom != null) __obj.updateDynamic("marginBottom")(marginBottom.asInstanceOf[js.Any])
    if (marginHorizontal != null) __obj.updateDynamic("marginHorizontal")(marginHorizontal.asInstanceOf[js.Any])
    if (marginLeft != null) __obj.updateDynamic("marginLeft")(marginLeft.asInstanceOf[js.Any])
    if (marginRight != null) __obj.updateDynamic("marginRight")(marginRight.asInstanceOf[js.Any])
    if (marginTop != null) __obj.updateDynamic("marginTop")(marginTop.asInstanceOf[js.Any])
    if (marginVertical != null) __obj.updateDynamic("marginVertical")(marginVertical.asInstanceOf[js.Any])
    if (maxHeight != null) __obj.updateDynamic("maxHeight")(maxHeight.asInstanceOf[js.Any])
    if (maxWidth != null) __obj.updateDynamic("maxWidth")(maxWidth.asInstanceOf[js.Any])
    if (minHeight != null) __obj.updateDynamic("minHeight")(minHeight.asInstanceOf[js.Any])
    if (minWidth != null) __obj.updateDynamic("minWidth")(minWidth.asInstanceOf[js.Any])
    if (opacity != null) __obj.updateDynamic("opacity")(opacity.asInstanceOf[js.Any])
    if (overflow != null) __obj.updateDynamic("overflow")(overflow.asInstanceOf[js.Any])
    if (padding != null) __obj.updateDynamic("padding")(padding.asInstanceOf[js.Any])
    if (paddingBottom != null) __obj.updateDynamic("paddingBottom")(paddingBottom.asInstanceOf[js.Any])
    if (paddingHorizontal != null) __obj.updateDynamic("paddingHorizontal")(paddingHorizontal.asInstanceOf[js.Any])
    if (paddingLeft != null) __obj.updateDynamic("paddingLeft")(paddingLeft.asInstanceOf[js.Any])
    if (paddingRight != null) __obj.updateDynamic("paddingRight")(paddingRight.asInstanceOf[js.Any])
    if (paddingTop != null) __obj.updateDynamic("paddingTop")(paddingTop.asInstanceOf[js.Any])
    if (paddingVertical != null) __obj.updateDynamic("paddingVertical")(paddingVertical.asInstanceOf[js.Any])
    if (position != null) __obj.updateDynamic("position")(position.asInstanceOf[js.Any])
    if (right != null) __obj.updateDynamic("right")(right.asInstanceOf[js.Any])
    if (shadowColor != null) __obj.updateDynamic("shadowColor")(shadowColor.asInstanceOf[js.Any])
    if (shadowOffset != null) __obj.updateDynamic("shadowOffset")(shadowOffset)
    if (shadowOpacity != null) __obj.updateDynamic("shadowOpacity")(shadowOpacity.asInstanceOf[js.Any])
    if (shadowRadius != null) __obj.updateDynamic("shadowRadius")(shadowRadius.asInstanceOf[js.Any])
    if (top != null) __obj.updateDynamic("top")(top.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    if (zIndex != null) __obj.updateDynamic("zIndex")(zIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[Style]
  }
}

