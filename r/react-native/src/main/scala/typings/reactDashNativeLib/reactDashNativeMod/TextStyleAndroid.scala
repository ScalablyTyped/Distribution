package typings
package reactDashNativeLib.reactDashNativeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TextStyleAndroid extends ViewStyle {
  var includeFontPadding: js.UndefOr[scala.Boolean] = js.undefined
  var textAlignVertical: js.UndefOr[
    reactDashNativeLib.reactDashNativeLibStrings.auto | reactDashNativeLib.reactDashNativeLibStrings.top | reactDashNativeLib.reactDashNativeLibStrings.bottom | reactDashNativeLib.reactDashNativeLibStrings.center
  ] = js.undefined
}

object TextStyleAndroid {
  @scala.inline
  def apply(
    alignContent: reactDashNativeLib.reactDashNativeLibStrings.`flex-start` | reactDashNativeLib.reactDashNativeLibStrings.`flex-end` | reactDashNativeLib.reactDashNativeLibStrings.center | reactDashNativeLib.reactDashNativeLibStrings.stretch | reactDashNativeLib.reactDashNativeLibStrings.`space-between` | reactDashNativeLib.reactDashNativeLibStrings.`space-around` = null,
    alignItems: reactDashNativeLib.FlexAlignType = null,
    alignSelf: reactDashNativeLib.reactDashNativeLibStrings.auto | reactDashNativeLib.FlexAlignType = null,
    aspectRatio: scala.Int | scala.Double = null,
    backfaceVisibility: reactDashNativeLib.reactDashNativeLibStrings.visible | reactDashNativeLib.reactDashNativeLibStrings.hidden = null,
    backgroundColor: java.lang.String = null,
    borderBottomColor: java.lang.String = null,
    borderBottomEndRadius: scala.Int | scala.Double = null,
    borderBottomLeftRadius: scala.Int | scala.Double = null,
    borderBottomRightRadius: scala.Int | scala.Double = null,
    borderBottomStartRadius: scala.Int | scala.Double = null,
    borderBottomWidth: scala.Int | scala.Double = null,
    borderColor: java.lang.String = null,
    borderEndColor: java.lang.String = null,
    borderEndWidth: scala.Double | java.lang.String = null,
    borderLeftColor: java.lang.String = null,
    borderLeftWidth: scala.Int | scala.Double = null,
    borderRadius: scala.Int | scala.Double = null,
    borderRightColor: java.lang.String = null,
    borderRightWidth: scala.Int | scala.Double = null,
    borderStartColor: java.lang.String = null,
    borderStartWidth: scala.Double | java.lang.String = null,
    borderStyle: reactDashNativeLib.reactDashNativeLibStrings.solid | reactDashNativeLib.reactDashNativeLibStrings.dotted | reactDashNativeLib.reactDashNativeLibStrings.dashed = null,
    borderTopColor: java.lang.String = null,
    borderTopEndRadius: scala.Int | scala.Double = null,
    borderTopLeftRadius: scala.Int | scala.Double = null,
    borderTopRightRadius: scala.Int | scala.Double = null,
    borderTopStartRadius: scala.Int | scala.Double = null,
    borderTopWidth: scala.Int | scala.Double = null,
    borderWidth: scala.Int | scala.Double = null,
    bottom: scala.Double | java.lang.String = null,
    direction: reactDashNativeLib.reactDashNativeLibStrings.inherit | reactDashNativeLib.reactDashNativeLibStrings.ltr | reactDashNativeLib.reactDashNativeLibStrings.rtl = null,
    display: reactDashNativeLib.reactDashNativeLibStrings.none | reactDashNativeLib.reactDashNativeLibStrings.flex = null,
    elevation: scala.Int | scala.Double = null,
    end: scala.Double | java.lang.String = null,
    flex: scala.Int | scala.Double = null,
    flexBasis: scala.Double | java.lang.String = null,
    flexDirection: reactDashNativeLib.reactDashNativeLibStrings.row | reactDashNativeLib.reactDashNativeLibStrings.column | reactDashNativeLib.reactDashNativeLibStrings.`row-reverse` | reactDashNativeLib.reactDashNativeLibStrings.`column-reverse` = null,
    flexGrow: scala.Int | scala.Double = null,
    flexShrink: scala.Int | scala.Double = null,
    flexWrap: reactDashNativeLib.reactDashNativeLibStrings.wrap | reactDashNativeLib.reactDashNativeLibStrings.nowrap | reactDashNativeLib.reactDashNativeLibStrings.`wrap-reverse` = null,
    height: scala.Double | java.lang.String = null,
    includeFontPadding: js.UndefOr[scala.Boolean] = js.undefined,
    justifyContent: reactDashNativeLib.reactDashNativeLibStrings.`flex-start` | reactDashNativeLib.reactDashNativeLibStrings.`flex-end` | reactDashNativeLib.reactDashNativeLibStrings.center | reactDashNativeLib.reactDashNativeLibStrings.`space-between` | reactDashNativeLib.reactDashNativeLibStrings.`space-around` | reactDashNativeLib.reactDashNativeLibStrings.`space-evenly` = null,
    left: scala.Double | java.lang.String = null,
    margin: scala.Double | java.lang.String = null,
    marginBottom: scala.Double | java.lang.String = null,
    marginEnd: scala.Double | java.lang.String = null,
    marginHorizontal: scala.Double | java.lang.String = null,
    marginLeft: scala.Double | java.lang.String = null,
    marginRight: scala.Double | java.lang.String = null,
    marginStart: scala.Double | java.lang.String = null,
    marginTop: scala.Double | java.lang.String = null,
    marginVertical: scala.Double | java.lang.String = null,
    maxHeight: scala.Double | java.lang.String = null,
    maxWidth: scala.Double | java.lang.String = null,
    minHeight: scala.Double | java.lang.String = null,
    minWidth: scala.Double | java.lang.String = null,
    opacity: scala.Int | scala.Double = null,
    overflow: reactDashNativeLib.reactDashNativeLibStrings.visible | reactDashNativeLib.reactDashNativeLibStrings.hidden | reactDashNativeLib.reactDashNativeLibStrings.scroll = null,
    padding: scala.Double | java.lang.String = null,
    paddingBottom: scala.Double | java.lang.String = null,
    paddingEnd: scala.Double | java.lang.String = null,
    paddingHorizontal: scala.Double | java.lang.String = null,
    paddingLeft: scala.Double | java.lang.String = null,
    paddingRight: scala.Double | java.lang.String = null,
    paddingStart: scala.Double | java.lang.String = null,
    paddingTop: scala.Double | java.lang.String = null,
    paddingVertical: scala.Double | java.lang.String = null,
    position: reactDashNativeLib.reactDashNativeLibStrings.absolute | reactDashNativeLib.reactDashNativeLibStrings.relative = null,
    right: scala.Double | java.lang.String = null,
    rotation: scala.Int | scala.Double = null,
    scaleX: scala.Int | scala.Double = null,
    scaleY: scala.Int | scala.Double = null,
    shadowColor: java.lang.String = null,
    shadowOffset: reactDashNativeLib.Anon_Height = null,
    shadowOpacity: scala.Int | scala.Double = null,
    shadowRadius: scala.Int | scala.Double = null,
    start: scala.Double | java.lang.String = null,
    testID: java.lang.String = null,
    textAlignVertical: reactDashNativeLib.reactDashNativeLibStrings.auto | reactDashNativeLib.reactDashNativeLibStrings.top | reactDashNativeLib.reactDashNativeLibStrings.bottom | reactDashNativeLib.reactDashNativeLibStrings.center = null,
    top: scala.Double | java.lang.String = null,
    transform: js.Array[
      PerpectiveTransform | RotateTransform | RotateXTransform | RotateYTransform | RotateZTransform | ScaleTransform | ScaleXTransform | ScaleYTransform | TranslateXTransform | TranslateYTransform | SkewXTransform | SkewYTransform
    ] = null,
    transformMatrix: js.Array[scala.Double] = null,
    translateX: scala.Int | scala.Double = null,
    translateY: scala.Int | scala.Double = null,
    width: scala.Double | java.lang.String = null,
    zIndex: scala.Int | scala.Double = null
  ): TextStyleAndroid = {
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
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (!js.isUndefined(includeFontPadding)) __obj.updateDynamic("includeFontPadding")(includeFontPadding)
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
    if (textAlignVertical != null) __obj.updateDynamic("textAlignVertical")(textAlignVertical.asInstanceOf[js.Any])
    if (top != null) __obj.updateDynamic("top")(top.asInstanceOf[js.Any])
    if (transform != null) __obj.updateDynamic("transform")(transform)
    if (transformMatrix != null) __obj.updateDynamic("transformMatrix")(transformMatrix)
    if (translateX != null) __obj.updateDynamic("translateX")(translateX.asInstanceOf[js.Any])
    if (translateY != null) __obj.updateDynamic("translateY")(translateY.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    if (zIndex != null) __obj.updateDynamic("zIndex")(zIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[TextStyleAndroid]
  }
}

