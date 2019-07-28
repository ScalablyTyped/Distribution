package typings.reactDashNative.reactDashNativeMod

import typings.reactDashNative.Anon_Height
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
import typings.reactDashNative.reactDashNativeStrings.capitalize
import typings.reactDashNative.reactDashNativeStrings.center
import typings.reactDashNative.reactDashNativeStrings.column
import typings.reactDashNative.reactDashNativeStrings.dashed
import typings.reactDashNative.reactDashNativeStrings.dotted
import typings.reactDashNative.reactDashNativeStrings.double
import typings.reactDashNative.reactDashNativeStrings.flex
import typings.reactDashNative.reactDashNativeStrings.hidden
import typings.reactDashNative.reactDashNativeStrings.inherit
import typings.reactDashNative.reactDashNativeStrings.lowercase
import typings.reactDashNative.reactDashNativeStrings.ltr
import typings.reactDashNative.reactDashNativeStrings.none
import typings.reactDashNative.reactDashNativeStrings.nowrap
import typings.reactDashNative.reactDashNativeStrings.relative
import typings.reactDashNative.reactDashNativeStrings.row
import typings.reactDashNative.reactDashNativeStrings.rtl
import typings.reactDashNative.reactDashNativeStrings.scroll
import typings.reactDashNative.reactDashNativeStrings.solid
import typings.reactDashNative.reactDashNativeStrings.stretch
import typings.reactDashNative.reactDashNativeStrings.uppercase
import typings.reactDashNative.reactDashNativeStrings.visible
import typings.reactDashNative.reactDashNativeStrings.wrap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TextStyleIOS extends ViewStyle {
  var fontVariant: js.UndefOr[js.Array[FontVariant]] = js.undefined
  var letterSpacing: js.UndefOr[Double] = js.undefined
  var textDecorationColor: js.UndefOr[String] = js.undefined
  var textDecorationStyle: js.UndefOr[solid | double | dotted | dashed] = js.undefined
  var textTransform: js.UndefOr[none | capitalize | uppercase | lowercase] = js.undefined
  var writingDirection: js.UndefOr[auto | ltr | rtl] = js.undefined
}

object TextStyleIOS {
  @scala.inline
  def apply(
    alignContent: `flex-start` | `flex-end` | center | stretch | `space-between` | `space-around` = null,
    alignItems: FlexAlignType = null,
    alignSelf: auto | FlexAlignType = null,
    aspectRatio: Int | Double = null,
    backfaceVisibility: visible | hidden = null,
    backgroundColor: String = null,
    borderBottomColor: String = null,
    borderBottomEndRadius: Int | Double = null,
    borderBottomLeftRadius: Int | Double = null,
    borderBottomRightRadius: Int | Double = null,
    borderBottomStartRadius: Int | Double = null,
    borderBottomWidth: Int | Double = null,
    borderColor: String = null,
    borderEndColor: String = null,
    borderEndWidth: Double | String = null,
    borderLeftColor: String = null,
    borderLeftWidth: Int | Double = null,
    borderRadius: Int | Double = null,
    borderRightColor: String = null,
    borderRightWidth: Int | Double = null,
    borderStartColor: String = null,
    borderStartWidth: Double | String = null,
    borderStyle: solid | dotted | dashed = null,
    borderTopColor: String = null,
    borderTopEndRadius: Int | Double = null,
    borderTopLeftRadius: Int | Double = null,
    borderTopRightRadius: Int | Double = null,
    borderTopStartRadius: Int | Double = null,
    borderTopWidth: Int | Double = null,
    borderWidth: Int | Double = null,
    bottom: Double | String = null,
    direction: inherit | ltr | rtl = null,
    display: none | flex = null,
    elevation: Int | Double = null,
    end: Double | String = null,
    flex: Int | Double = null,
    flexBasis: Double | String = null,
    flexDirection: row | column | `row-reverse` | `column-reverse` = null,
    flexGrow: Int | Double = null,
    flexShrink: Int | Double = null,
    flexWrap: wrap | nowrap | `wrap-reverse` = null,
    fontVariant: js.Array[FontVariant] = null,
    height: Double | String = null,
    justifyContent: `flex-start` | `flex-end` | center | `space-between` | `space-around` | `space-evenly` = null,
    left: Double | String = null,
    letterSpacing: Int | Double = null,
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
    opacity: Int | Double = null,
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
    rotation: Int | Double = null,
    scaleX: Int | Double = null,
    scaleY: Int | Double = null,
    shadowColor: String = null,
    shadowOffset: Anon_Height = null,
    shadowOpacity: Int | Double = null,
    shadowRadius: Int | Double = null,
    start: Double | String = null,
    testID: String = null,
    textDecorationColor: String = null,
    textDecorationStyle: solid | double | dotted | dashed = null,
    textTransform: none | capitalize | uppercase | lowercase = null,
    top: Double | String = null,
    transform: js.Array[
      PerpectiveTransform | RotateTransform | RotateXTransform | RotateYTransform | RotateZTransform | ScaleTransform | ScaleXTransform | ScaleYTransform | TranslateXTransform | TranslateYTransform | SkewXTransform | SkewYTransform
    ] = null,
    transformMatrix: js.Array[Double] = null,
    translateX: Int | Double = null,
    translateY: Int | Double = null,
    width: Double | String = null,
    writingDirection: auto | ltr | rtl = null,
    zIndex: Int | Double = null
  ): TextStyleIOS = {
    val __obj = js.Dynamic.literal()
    if (alignContent != null) __obj.updateDynamic("alignContent")(alignContent.asInstanceOf[js.Any])
    if (alignItems != null) __obj.updateDynamic("alignItems")(alignItems)
    if (alignSelf != null) __obj.updateDynamic("alignSelf")(alignSelf.asInstanceOf[js.Any])
    if (aspectRatio != null) __obj.updateDynamic("aspectRatio")(aspectRatio.asInstanceOf[js.Any])
    if (backfaceVisibility != null) __obj.updateDynamic("backfaceVisibility")(backfaceVisibility.asInstanceOf[js.Any])
    if (backgroundColor != null) __obj.updateDynamic("backgroundColor")(backgroundColor)
    if (borderBottomColor != null) __obj.updateDynamic("borderBottomColor")(borderBottomColor)
    if (borderBottomEndRadius != null) __obj.updateDynamic("borderBottomEndRadius")(borderBottomEndRadius.asInstanceOf[js.Any])
    if (borderBottomLeftRadius != null) __obj.updateDynamic("borderBottomLeftRadius")(borderBottomLeftRadius.asInstanceOf[js.Any])
    if (borderBottomRightRadius != null) __obj.updateDynamic("borderBottomRightRadius")(borderBottomRightRadius.asInstanceOf[js.Any])
    if (borderBottomStartRadius != null) __obj.updateDynamic("borderBottomStartRadius")(borderBottomStartRadius.asInstanceOf[js.Any])
    if (borderBottomWidth != null) __obj.updateDynamic("borderBottomWidth")(borderBottomWidth.asInstanceOf[js.Any])
    if (borderColor != null) __obj.updateDynamic("borderColor")(borderColor)
    if (borderEndColor != null) __obj.updateDynamic("borderEndColor")(borderEndColor)
    if (borderEndWidth != null) __obj.updateDynamic("borderEndWidth")(borderEndWidth.asInstanceOf[js.Any])
    if (borderLeftColor != null) __obj.updateDynamic("borderLeftColor")(borderLeftColor)
    if (borderLeftWidth != null) __obj.updateDynamic("borderLeftWidth")(borderLeftWidth.asInstanceOf[js.Any])
    if (borderRadius != null) __obj.updateDynamic("borderRadius")(borderRadius.asInstanceOf[js.Any])
    if (borderRightColor != null) __obj.updateDynamic("borderRightColor")(borderRightColor)
    if (borderRightWidth != null) __obj.updateDynamic("borderRightWidth")(borderRightWidth.asInstanceOf[js.Any])
    if (borderStartColor != null) __obj.updateDynamic("borderStartColor")(borderStartColor)
    if (borderStartWidth != null) __obj.updateDynamic("borderStartWidth")(borderStartWidth.asInstanceOf[js.Any])
    if (borderStyle != null) __obj.updateDynamic("borderStyle")(borderStyle.asInstanceOf[js.Any])
    if (borderTopColor != null) __obj.updateDynamic("borderTopColor")(borderTopColor)
    if (borderTopEndRadius != null) __obj.updateDynamic("borderTopEndRadius")(borderTopEndRadius.asInstanceOf[js.Any])
    if (borderTopLeftRadius != null) __obj.updateDynamic("borderTopLeftRadius")(borderTopLeftRadius.asInstanceOf[js.Any])
    if (borderTopRightRadius != null) __obj.updateDynamic("borderTopRightRadius")(borderTopRightRadius.asInstanceOf[js.Any])
    if (borderTopStartRadius != null) __obj.updateDynamic("borderTopStartRadius")(borderTopStartRadius.asInstanceOf[js.Any])
    if (borderTopWidth != null) __obj.updateDynamic("borderTopWidth")(borderTopWidth.asInstanceOf[js.Any])
    if (borderWidth != null) __obj.updateDynamic("borderWidth")(borderWidth.asInstanceOf[js.Any])
    if (bottom != null) __obj.updateDynamic("bottom")(bottom.asInstanceOf[js.Any])
    if (direction != null) __obj.updateDynamic("direction")(direction.asInstanceOf[js.Any])
    if (display != null) __obj.updateDynamic("display")(display.asInstanceOf[js.Any])
    if (elevation != null) __obj.updateDynamic("elevation")(elevation.asInstanceOf[js.Any])
    if (end != null) __obj.updateDynamic("end")(end.asInstanceOf[js.Any])
    if (flex != null) __obj.updateDynamic("flex")(flex.asInstanceOf[js.Any])
    if (flexBasis != null) __obj.updateDynamic("flexBasis")(flexBasis.asInstanceOf[js.Any])
    if (flexDirection != null) __obj.updateDynamic("flexDirection")(flexDirection.asInstanceOf[js.Any])
    if (flexGrow != null) __obj.updateDynamic("flexGrow")(flexGrow.asInstanceOf[js.Any])
    if (flexShrink != null) __obj.updateDynamic("flexShrink")(flexShrink.asInstanceOf[js.Any])
    if (flexWrap != null) __obj.updateDynamic("flexWrap")(flexWrap.asInstanceOf[js.Any])
    if (fontVariant != null) __obj.updateDynamic("fontVariant")(fontVariant)
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (justifyContent != null) __obj.updateDynamic("justifyContent")(justifyContent.asInstanceOf[js.Any])
    if (left != null) __obj.updateDynamic("left")(left.asInstanceOf[js.Any])
    if (letterSpacing != null) __obj.updateDynamic("letterSpacing")(letterSpacing.asInstanceOf[js.Any])
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
    if (opacity != null) __obj.updateDynamic("opacity")(opacity.asInstanceOf[js.Any])
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
    if (rotation != null) __obj.updateDynamic("rotation")(rotation.asInstanceOf[js.Any])
    if (scaleX != null) __obj.updateDynamic("scaleX")(scaleX.asInstanceOf[js.Any])
    if (scaleY != null) __obj.updateDynamic("scaleY")(scaleY.asInstanceOf[js.Any])
    if (shadowColor != null) __obj.updateDynamic("shadowColor")(shadowColor)
    if (shadowOffset != null) __obj.updateDynamic("shadowOffset")(shadowOffset)
    if (shadowOpacity != null) __obj.updateDynamic("shadowOpacity")(shadowOpacity.asInstanceOf[js.Any])
    if (shadowRadius != null) __obj.updateDynamic("shadowRadius")(shadowRadius.asInstanceOf[js.Any])
    if (start != null) __obj.updateDynamic("start")(start.asInstanceOf[js.Any])
    if (testID != null) __obj.updateDynamic("testID")(testID)
    if (textDecorationColor != null) __obj.updateDynamic("textDecorationColor")(textDecorationColor)
    if (textDecorationStyle != null) __obj.updateDynamic("textDecorationStyle")(textDecorationStyle.asInstanceOf[js.Any])
    if (textTransform != null) __obj.updateDynamic("textTransform")(textTransform.asInstanceOf[js.Any])
    if (top != null) __obj.updateDynamic("top")(top.asInstanceOf[js.Any])
    if (transform != null) __obj.updateDynamic("transform")(transform)
    if (transformMatrix != null) __obj.updateDynamic("transformMatrix")(transformMatrix)
    if (translateX != null) __obj.updateDynamic("translateX")(translateX.asInstanceOf[js.Any])
    if (translateY != null) __obj.updateDynamic("translateY")(translateY.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    if (writingDirection != null) __obj.updateDynamic("writingDirection")(writingDirection.asInstanceOf[js.Any])
    if (zIndex != null) __obj.updateDynamic("zIndex")(zIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[TextStyleIOS]
  }
}

