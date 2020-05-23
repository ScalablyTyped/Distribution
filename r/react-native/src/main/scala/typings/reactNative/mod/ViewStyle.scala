package typings.reactNative.mod

import typings.reactNative.anon.Height
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
import typings.reactNative.reactNativeStrings.dashed
import typings.reactNative.reactNativeStrings.dotted
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
import typings.reactNative.reactNativeStrings.solid
import typings.reactNative.reactNativeStrings.stretch
import typings.reactNative.reactNativeStrings.visible
import typings.reactNative.reactNativeStrings.wrap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ViewStyle
  extends FlexStyle
     with ShadowStyleIOS
     with TransformsStyle {
  var backfaceVisibility: js.UndefOr[visible | hidden] = js.undefined
  var backgroundColor: js.UndefOr[String] = js.undefined
  var borderBottomColor: js.UndefOr[String] = js.undefined
  var borderBottomEndRadius: js.UndefOr[Double] = js.undefined
  var borderBottomLeftRadius: js.UndefOr[Double] = js.undefined
  var borderBottomRightRadius: js.UndefOr[Double] = js.undefined
  var borderBottomStartRadius: js.UndefOr[Double] = js.undefined
  var borderColor: js.UndefOr[String] = js.undefined
  var borderEndColor: js.UndefOr[String] = js.undefined
  var borderLeftColor: js.UndefOr[String] = js.undefined
  var borderRadius: js.UndefOr[Double] = js.undefined
  var borderRightColor: js.UndefOr[String] = js.undefined
  var borderStartColor: js.UndefOr[String] = js.undefined
  var borderStyle: js.UndefOr[solid | dotted | dashed] = js.undefined
  var borderTopColor: js.UndefOr[String] = js.undefined
  var borderTopEndRadius: js.UndefOr[Double] = js.undefined
  var borderTopLeftRadius: js.UndefOr[Double] = js.undefined
  var borderTopRightRadius: js.UndefOr[Double] = js.undefined
  var borderTopStartRadius: js.UndefOr[Double] = js.undefined
  /**
    * Sets the elevation of a view, using Android's underlying
    * [elevation API](https://developer.android.com/training/material/shadows-clipping.html#Elevation).
    * This adds a drop shadow to the item and affects z-order for overlapping views.
    * Only supported on Android 5.0+, has no effect on earlier versions.
    *
    * @platform android
    */
  var elevation: js.UndefOr[Double] = js.undefined
  var opacity: js.UndefOr[Double] = js.undefined
  var testID: js.UndefOr[String] = js.undefined
}

object ViewStyle {
  @scala.inline
  def apply(
    alignContent: `flex-start` | `flex-end` | center | stretch | `space-between` | `space-around` = null,
    alignItems: FlexAlignType = null,
    alignSelf: auto | FlexAlignType = null,
    aspectRatio: js.UndefOr[Double] = js.undefined,
    backfaceVisibility: visible | hidden = null,
    backgroundColor: String = null,
    borderBottomColor: String = null,
    borderBottomEndRadius: js.UndefOr[Double] = js.undefined,
    borderBottomLeftRadius: js.UndefOr[Double] = js.undefined,
    borderBottomRightRadius: js.UndefOr[Double] = js.undefined,
    borderBottomStartRadius: js.UndefOr[Double] = js.undefined,
    borderBottomWidth: js.UndefOr[Double] = js.undefined,
    borderColor: String = null,
    borderEndColor: String = null,
    borderEndWidth: Double | String = null,
    borderLeftColor: String = null,
    borderLeftWidth: js.UndefOr[Double] = js.undefined,
    borderRadius: js.UndefOr[Double] = js.undefined,
    borderRightColor: String = null,
    borderRightWidth: js.UndefOr[Double] = js.undefined,
    borderStartColor: String = null,
    borderStartWidth: Double | String = null,
    borderStyle: solid | dotted | dashed = null,
    borderTopColor: String = null,
    borderTopEndRadius: js.UndefOr[Double] = js.undefined,
    borderTopLeftRadius: js.UndefOr[Double] = js.undefined,
    borderTopRightRadius: js.UndefOr[Double] = js.undefined,
    borderTopStartRadius: js.UndefOr[Double] = js.undefined,
    borderTopWidth: js.UndefOr[Double] = js.undefined,
    borderWidth: js.UndefOr[Double] = js.undefined,
    bottom: Double | String = null,
    direction: inherit | ltr | rtl = null,
    display: none | flex = null,
    elevation: js.UndefOr[Double] = js.undefined,
    end: Double | String = null,
    flex: js.UndefOr[Double] = js.undefined,
    flexBasis: Double | String = null,
    flexDirection: row | column | `row-reverse` | `column-reverse` = null,
    flexGrow: js.UndefOr[Double] = js.undefined,
    flexShrink: js.UndefOr[Double] = js.undefined,
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
    opacity: js.UndefOr[Double] = js.undefined,
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
    rotation: js.UndefOr[Double] = js.undefined,
    scaleX: js.UndefOr[Double] = js.undefined,
    scaleY: js.UndefOr[Double] = js.undefined,
    shadowColor: String = null,
    shadowOffset: Height = null,
    shadowOpacity: js.UndefOr[Double] = js.undefined,
    shadowRadius: js.UndefOr[Double] = js.undefined,
    start: Double | String = null,
    testID: String = null,
    top: Double | String = null,
    transform: js.Array[
      PerpectiveTransform | RotateTransform | RotateXTransform | RotateYTransform | RotateZTransform | ScaleTransform | ScaleXTransform | ScaleYTransform | TranslateXTransform | TranslateYTransform | SkewXTransform | SkewYTransform
    ] = null,
    transformMatrix: js.Array[Double] = null,
    translateX: js.UndefOr[Double] = js.undefined,
    translateY: js.UndefOr[Double] = js.undefined,
    width: Double | String = null,
    zIndex: js.UndefOr[Double] = js.undefined
  ): ViewStyle = {
    val __obj = js.Dynamic.literal()
    if (alignContent != null) __obj.updateDynamic("alignContent")(alignContent.asInstanceOf[js.Any])
    if (alignItems != null) __obj.updateDynamic("alignItems")(alignItems.asInstanceOf[js.Any])
    if (alignSelf != null) __obj.updateDynamic("alignSelf")(alignSelf.asInstanceOf[js.Any])
    if (!js.isUndefined(aspectRatio)) __obj.updateDynamic("aspectRatio")(aspectRatio.get.asInstanceOf[js.Any])
    if (backfaceVisibility != null) __obj.updateDynamic("backfaceVisibility")(backfaceVisibility.asInstanceOf[js.Any])
    if (backgroundColor != null) __obj.updateDynamic("backgroundColor")(backgroundColor.asInstanceOf[js.Any])
    if (borderBottomColor != null) __obj.updateDynamic("borderBottomColor")(borderBottomColor.asInstanceOf[js.Any])
    if (!js.isUndefined(borderBottomEndRadius)) __obj.updateDynamic("borderBottomEndRadius")(borderBottomEndRadius.get.asInstanceOf[js.Any])
    if (!js.isUndefined(borderBottomLeftRadius)) __obj.updateDynamic("borderBottomLeftRadius")(borderBottomLeftRadius.get.asInstanceOf[js.Any])
    if (!js.isUndefined(borderBottomRightRadius)) __obj.updateDynamic("borderBottomRightRadius")(borderBottomRightRadius.get.asInstanceOf[js.Any])
    if (!js.isUndefined(borderBottomStartRadius)) __obj.updateDynamic("borderBottomStartRadius")(borderBottomStartRadius.get.asInstanceOf[js.Any])
    if (!js.isUndefined(borderBottomWidth)) __obj.updateDynamic("borderBottomWidth")(borderBottomWidth.get.asInstanceOf[js.Any])
    if (borderColor != null) __obj.updateDynamic("borderColor")(borderColor.asInstanceOf[js.Any])
    if (borderEndColor != null) __obj.updateDynamic("borderEndColor")(borderEndColor.asInstanceOf[js.Any])
    if (borderEndWidth != null) __obj.updateDynamic("borderEndWidth")(borderEndWidth.asInstanceOf[js.Any])
    if (borderLeftColor != null) __obj.updateDynamic("borderLeftColor")(borderLeftColor.asInstanceOf[js.Any])
    if (!js.isUndefined(borderLeftWidth)) __obj.updateDynamic("borderLeftWidth")(borderLeftWidth.get.asInstanceOf[js.Any])
    if (!js.isUndefined(borderRadius)) __obj.updateDynamic("borderRadius")(borderRadius.get.asInstanceOf[js.Any])
    if (borderRightColor != null) __obj.updateDynamic("borderRightColor")(borderRightColor.asInstanceOf[js.Any])
    if (!js.isUndefined(borderRightWidth)) __obj.updateDynamic("borderRightWidth")(borderRightWidth.get.asInstanceOf[js.Any])
    if (borderStartColor != null) __obj.updateDynamic("borderStartColor")(borderStartColor.asInstanceOf[js.Any])
    if (borderStartWidth != null) __obj.updateDynamic("borderStartWidth")(borderStartWidth.asInstanceOf[js.Any])
    if (borderStyle != null) __obj.updateDynamic("borderStyle")(borderStyle.asInstanceOf[js.Any])
    if (borderTopColor != null) __obj.updateDynamic("borderTopColor")(borderTopColor.asInstanceOf[js.Any])
    if (!js.isUndefined(borderTopEndRadius)) __obj.updateDynamic("borderTopEndRadius")(borderTopEndRadius.get.asInstanceOf[js.Any])
    if (!js.isUndefined(borderTopLeftRadius)) __obj.updateDynamic("borderTopLeftRadius")(borderTopLeftRadius.get.asInstanceOf[js.Any])
    if (!js.isUndefined(borderTopRightRadius)) __obj.updateDynamic("borderTopRightRadius")(borderTopRightRadius.get.asInstanceOf[js.Any])
    if (!js.isUndefined(borderTopStartRadius)) __obj.updateDynamic("borderTopStartRadius")(borderTopStartRadius.get.asInstanceOf[js.Any])
    if (!js.isUndefined(borderTopWidth)) __obj.updateDynamic("borderTopWidth")(borderTopWidth.get.asInstanceOf[js.Any])
    if (!js.isUndefined(borderWidth)) __obj.updateDynamic("borderWidth")(borderWidth.get.asInstanceOf[js.Any])
    if (bottom != null) __obj.updateDynamic("bottom")(bottom.asInstanceOf[js.Any])
    if (direction != null) __obj.updateDynamic("direction")(direction.asInstanceOf[js.Any])
    if (display != null) __obj.updateDynamic("display")(display.asInstanceOf[js.Any])
    if (!js.isUndefined(elevation)) __obj.updateDynamic("elevation")(elevation.get.asInstanceOf[js.Any])
    if (end != null) __obj.updateDynamic("end")(end.asInstanceOf[js.Any])
    if (!js.isUndefined(flex)) __obj.updateDynamic("flex")(flex.get.asInstanceOf[js.Any])
    if (flexBasis != null) __obj.updateDynamic("flexBasis")(flexBasis.asInstanceOf[js.Any])
    if (flexDirection != null) __obj.updateDynamic("flexDirection")(flexDirection.asInstanceOf[js.Any])
    if (!js.isUndefined(flexGrow)) __obj.updateDynamic("flexGrow")(flexGrow.get.asInstanceOf[js.Any])
    if (!js.isUndefined(flexShrink)) __obj.updateDynamic("flexShrink")(flexShrink.get.asInstanceOf[js.Any])
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
    if (!js.isUndefined(opacity)) __obj.updateDynamic("opacity")(opacity.get.asInstanceOf[js.Any])
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
    if (!js.isUndefined(rotation)) __obj.updateDynamic("rotation")(rotation.get.asInstanceOf[js.Any])
    if (!js.isUndefined(scaleX)) __obj.updateDynamic("scaleX")(scaleX.get.asInstanceOf[js.Any])
    if (!js.isUndefined(scaleY)) __obj.updateDynamic("scaleY")(scaleY.get.asInstanceOf[js.Any])
    if (shadowColor != null) __obj.updateDynamic("shadowColor")(shadowColor.asInstanceOf[js.Any])
    if (shadowOffset != null) __obj.updateDynamic("shadowOffset")(shadowOffset.asInstanceOf[js.Any])
    if (!js.isUndefined(shadowOpacity)) __obj.updateDynamic("shadowOpacity")(shadowOpacity.get.asInstanceOf[js.Any])
    if (!js.isUndefined(shadowRadius)) __obj.updateDynamic("shadowRadius")(shadowRadius.get.asInstanceOf[js.Any])
    if (start != null) __obj.updateDynamic("start")(start.asInstanceOf[js.Any])
    if (testID != null) __obj.updateDynamic("testID")(testID.asInstanceOf[js.Any])
    if (top != null) __obj.updateDynamic("top")(top.asInstanceOf[js.Any])
    if (transform != null) __obj.updateDynamic("transform")(transform.asInstanceOf[js.Any])
    if (transformMatrix != null) __obj.updateDynamic("transformMatrix")(transformMatrix.asInstanceOf[js.Any])
    if (!js.isUndefined(translateX)) __obj.updateDynamic("translateX")(translateX.get.asInstanceOf[js.Any])
    if (!js.isUndefined(translateY)) __obj.updateDynamic("translateY")(translateY.get.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    if (!js.isUndefined(zIndex)) __obj.updateDynamic("zIndex")(zIndex.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[ViewStyle]
  }
}

