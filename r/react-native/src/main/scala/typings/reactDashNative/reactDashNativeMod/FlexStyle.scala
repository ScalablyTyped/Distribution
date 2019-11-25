package typings.reactDashNative.reactDashNativeMod

import typings.reactDashNative.reactDashNativeStrings.`column-reverse`
import typings.reactDashNative.reactDashNativeStrings.`flex-end`
import typings.reactDashNative.reactDashNativeStrings.`flex-start`
import typings.reactDashNative.reactDashNativeStrings.`row-reverse`
import typings.reactDashNative.reactDashNativeStrings.`space-around`
import typings.reactDashNative.reactDashNativeStrings.`space-between`
import typings.reactDashNative.reactDashNativeStrings.`space-evenly`
import typings.reactDashNative.reactDashNativeStrings.`wrap-reverse`
import typings.reactDashNative.reactDashNativeStrings.absolute
import typings.reactDashNative.reactDashNativeStrings.auto
import typings.reactDashNative.reactDashNativeStrings.center
import typings.reactDashNative.reactDashNativeStrings.column
import typings.reactDashNative.reactDashNativeStrings.flex
import typings.reactDashNative.reactDashNativeStrings.hidden
import typings.reactDashNative.reactDashNativeStrings.inherit
import typings.reactDashNative.reactDashNativeStrings.ltr
import typings.reactDashNative.reactDashNativeStrings.none
import typings.reactDashNative.reactDashNativeStrings.nowrap
import typings.reactDashNative.reactDashNativeStrings.relative
import typings.reactDashNative.reactDashNativeStrings.row
import typings.reactDashNative.reactDashNativeStrings.rtl
import typings.reactDashNative.reactDashNativeStrings.scroll
import typings.reactDashNative.reactDashNativeStrings.stretch
import typings.reactDashNative.reactDashNativeStrings.visible
import typings.reactDashNative.reactDashNativeStrings.wrap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FlexStyle extends js.Object {
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
  @scala.inline
  def apply(
    alignContent: `flex-start` | `flex-end` | center | stretch | `space-between` | `space-around` = null,
    alignItems: FlexAlignType = null,
    alignSelf: auto | FlexAlignType = null,
    aspectRatio: Int | Double = null,
    borderBottomWidth: Int | Double = null,
    borderEndWidth: Double | String = null,
    borderLeftWidth: Int | Double = null,
    borderRightWidth: Int | Double = null,
    borderStartWidth: Double | String = null,
    borderTopWidth: Int | Double = null,
    borderWidth: Int | Double = null,
    bottom: Double | String = null,
    direction: inherit | ltr | rtl = null,
    display: none | flex = null,
    end: Double | String = null,
    flex: Int | Double = null,
    flexBasis: Double | String = null,
    flexDirection: row | column | `row-reverse` | `column-reverse` = null,
    flexGrow: Int | Double = null,
    flexShrink: Int | Double = null,
    flexWrap: wrap | nowrap | `wrap-reverse` = null,
    height: Double | String = null,
    justifyContent: `flex-start` | `flex-end` | center | `space-between` | `space-around` | `space-evenly` = null,
    left: Double | String = null,
    margin: Double | String = null,
    marginBottom: Double | String = null,
    marginEnd: Double | String = null,
    marginHorizontal: Double | String = null,
    marginLeft: Double | String = null,
    marginRight: Double | String = null,
    marginStart: Double | String = null,
    marginTop: Double | String = null,
    marginVertical: Double | String = null,
    maxHeight: Double | String = null,
    maxWidth: Double | String = null,
    minHeight: Double | String = null,
    minWidth: Double | String = null,
    overflow: visible | hidden | scroll = null,
    padding: Double | String = null,
    paddingBottom: Double | String = null,
    paddingEnd: Double | String = null,
    paddingHorizontal: Double | String = null,
    paddingLeft: Double | String = null,
    paddingRight: Double | String = null,
    paddingStart: Double | String = null,
    paddingTop: Double | String = null,
    paddingVertical: Double | String = null,
    position: absolute | relative = null,
    right: Double | String = null,
    start: Double | String = null,
    top: Double | String = null,
    width: Double | String = null,
    zIndex: Int | Double = null
  ): FlexStyle = {
    val __obj = js.Dynamic.literal()
    if (alignContent != null) __obj.updateDynamic("alignContent")(alignContent.asInstanceOf[js.Any])
    if (alignItems != null) __obj.updateDynamic("alignItems")(alignItems.asInstanceOf[js.Any])
    if (alignSelf != null) __obj.updateDynamic("alignSelf")(alignSelf.asInstanceOf[js.Any])
    if (aspectRatio != null) __obj.updateDynamic("aspectRatio")(aspectRatio.asInstanceOf[js.Any])
    if (borderBottomWidth != null) __obj.updateDynamic("borderBottomWidth")(borderBottomWidth.asInstanceOf[js.Any])
    if (borderEndWidth != null) __obj.updateDynamic("borderEndWidth")(borderEndWidth.asInstanceOf[js.Any])
    if (borderLeftWidth != null) __obj.updateDynamic("borderLeftWidth")(borderLeftWidth.asInstanceOf[js.Any])
    if (borderRightWidth != null) __obj.updateDynamic("borderRightWidth")(borderRightWidth.asInstanceOf[js.Any])
    if (borderStartWidth != null) __obj.updateDynamic("borderStartWidth")(borderStartWidth.asInstanceOf[js.Any])
    if (borderTopWidth != null) __obj.updateDynamic("borderTopWidth")(borderTopWidth.asInstanceOf[js.Any])
    if (borderWidth != null) __obj.updateDynamic("borderWidth")(borderWidth.asInstanceOf[js.Any])
    if (bottom != null) __obj.updateDynamic("bottom")(bottom.asInstanceOf[js.Any])
    if (direction != null) __obj.updateDynamic("direction")(direction.asInstanceOf[js.Any])
    if (display != null) __obj.updateDynamic("display")(display.asInstanceOf[js.Any])
    if (end != null) __obj.updateDynamic("end")(end.asInstanceOf[js.Any])
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
    if (marginEnd != null) __obj.updateDynamic("marginEnd")(marginEnd.asInstanceOf[js.Any])
    if (marginHorizontal != null) __obj.updateDynamic("marginHorizontal")(marginHorizontal.asInstanceOf[js.Any])
    if (marginLeft != null) __obj.updateDynamic("marginLeft")(marginLeft.asInstanceOf[js.Any])
    if (marginRight != null) __obj.updateDynamic("marginRight")(marginRight.asInstanceOf[js.Any])
    if (marginStart != null) __obj.updateDynamic("marginStart")(marginStart.asInstanceOf[js.Any])
    if (marginTop != null) __obj.updateDynamic("marginTop")(marginTop.asInstanceOf[js.Any])
    if (marginVertical != null) __obj.updateDynamic("marginVertical")(marginVertical.asInstanceOf[js.Any])
    if (maxHeight != null) __obj.updateDynamic("maxHeight")(maxHeight.asInstanceOf[js.Any])
    if (maxWidth != null) __obj.updateDynamic("maxWidth")(maxWidth.asInstanceOf[js.Any])
    if (minHeight != null) __obj.updateDynamic("minHeight")(minHeight.asInstanceOf[js.Any])
    if (minWidth != null) __obj.updateDynamic("minWidth")(minWidth.asInstanceOf[js.Any])
    if (overflow != null) __obj.updateDynamic("overflow")(overflow.asInstanceOf[js.Any])
    if (padding != null) __obj.updateDynamic("padding")(padding.asInstanceOf[js.Any])
    if (paddingBottom != null) __obj.updateDynamic("paddingBottom")(paddingBottom.asInstanceOf[js.Any])
    if (paddingEnd != null) __obj.updateDynamic("paddingEnd")(paddingEnd.asInstanceOf[js.Any])
    if (paddingHorizontal != null) __obj.updateDynamic("paddingHorizontal")(paddingHorizontal.asInstanceOf[js.Any])
    if (paddingLeft != null) __obj.updateDynamic("paddingLeft")(paddingLeft.asInstanceOf[js.Any])
    if (paddingRight != null) __obj.updateDynamic("paddingRight")(paddingRight.asInstanceOf[js.Any])
    if (paddingStart != null) __obj.updateDynamic("paddingStart")(paddingStart.asInstanceOf[js.Any])
    if (paddingTop != null) __obj.updateDynamic("paddingTop")(paddingTop.asInstanceOf[js.Any])
    if (paddingVertical != null) __obj.updateDynamic("paddingVertical")(paddingVertical.asInstanceOf[js.Any])
    if (position != null) __obj.updateDynamic("position")(position.asInstanceOf[js.Any])
    if (right != null) __obj.updateDynamic("right")(right.asInstanceOf[js.Any])
    if (start != null) __obj.updateDynamic("start")(start.asInstanceOf[js.Any])
    if (top != null) __obj.updateDynamic("top")(top.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    if (zIndex != null) __obj.updateDynamic("zIndex")(zIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[FlexStyle]
  }
}

