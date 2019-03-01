package typings
package reactDashSketchappLib.reactDashSketchappMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TextStyle extends Style {
  var color: js.UndefOr[Color] = js.undefined
  var fontFamily: js.UndefOr[java.lang.String] = js.undefined
  var fontSize: js.UndefOr[scala.Double] = js.undefined
  var fontStyle: js.UndefOr[
    reactDashSketchappLib.reactDashSketchappLibStrings.normal | reactDashSketchappLib.reactDashSketchappLibStrings.italic
  ] = js.undefined
  var fontWeight: js.UndefOr[java.lang.String] = js.undefined
  var letterSpacing: js.UndefOr[scala.Double] = js.undefined
  var lineHeight: js.UndefOr[scala.Double] = js.undefined
  var textAlign: js.UndefOr[
    reactDashSketchappLib.reactDashSketchappLibStrings.auto | reactDashSketchappLib.reactDashSketchappLibStrings.left | reactDashSketchappLib.reactDashSketchappLibStrings.right | reactDashSketchappLib.reactDashSketchappLibStrings.center | reactDashSketchappLib.reactDashSketchappLibStrings.justify
  ] = js.undefined
  var textDecorationLine: js.UndefOr[
    reactDashSketchappLib.reactDashSketchappLibStrings.none | reactDashSketchappLib.reactDashSketchappLibStrings.underline | reactDashSketchappLib.reactDashSketchappLibStrings.double | reactDashSketchappLib.reactDashSketchappLibStrings.`line-through`
  ] = js.undefined
  var textShadowColor: js.UndefOr[Color] = js.undefined
  var textShadowOffset: js.UndefOr[reactDashSketchappLib.Anon_HeightWidth] = js.undefined
  var textShadowRadius: js.UndefOr[scala.Double] = js.undefined
  var writingDirection: js.UndefOr[
    reactDashSketchappLib.reactDashSketchappLibStrings.auto | reactDashSketchappLib.reactDashSketchappLibStrings.ltr | reactDashSketchappLib.reactDashSketchappLibStrings.rtl
  ] = js.undefined
}

object TextStyle {
  @scala.inline
  def apply(
    alignItems: reactDashSketchappLib.reactDashSketchappLibStrings.`flex-start` | reactDashSketchappLib.reactDashSketchappLibStrings.`flex-end` | reactDashSketchappLib.reactDashSketchappLibStrings.center | reactDashSketchappLib.reactDashSketchappLibStrings.stretch = null,
    alignSelf: reactDashSketchappLib.reactDashSketchappLibStrings.auto | reactDashSketchappLib.reactDashSketchappLibStrings.`flex-start` | reactDashSketchappLib.reactDashSketchappLibStrings.`flex-end` | reactDashSketchappLib.reactDashSketchappLibStrings.center | reactDashSketchappLib.reactDashSketchappLibStrings.stretch = null,
    aspectRatio: scala.Int | scala.Double = null,
    backfaceVisibility: reactDashSketchappLib.reactDashSketchappLibStrings.visible | reactDashSketchappLib.reactDashSketchappLibStrings.hidden = null,
    backgroundColor: Color = null,
    borderBottomColor: Color = null,
    borderBottomLeftRadius: scala.Int | scala.Double = null,
    borderBottomRightRadius: scala.Int | scala.Double = null,
    borderBottomWidth: scala.Int | scala.Double = null,
    borderColor: Color = null,
    borderLeftColor: Color = null,
    borderLeftWidth: scala.Int | scala.Double = null,
    borderRadius: scala.Int | scala.Double = null,
    borderRightColor: Color = null,
    borderRightWidth: scala.Int | scala.Double = null,
    borderStyle: reactDashSketchappLib.reactDashSketchappLibStrings.solid | reactDashSketchappLib.reactDashSketchappLibStrings.dotted | reactDashSketchappLib.reactDashSketchappLibStrings.dashed = null,
    borderTopColor: Color = null,
    borderTopLeftRadius: scala.Int | scala.Double = null,
    borderTopRightRadius: scala.Int | scala.Double = null,
    borderTopWidth: scala.Int | scala.Double = null,
    borderWidth: scala.Int | scala.Double = null,
    bottom: scala.Int | scala.Double = null,
    color: Color = null,
    flex: scala.Int | scala.Double = null,
    flexBasis: scala.Int | scala.Double = null,
    flexDirection: reactDashSketchappLib.reactDashSketchappLibStrings.row | reactDashSketchappLib.reactDashSketchappLibStrings.`row-reverse` | reactDashSketchappLib.reactDashSketchappLibStrings.column | reactDashSketchappLib.reactDashSketchappLibStrings.`column-reverse` = null,
    flexGrow: scala.Int | scala.Double = null,
    flexShrink: scala.Int | scala.Double = null,
    flexWrap: reactDashSketchappLib.reactDashSketchappLibStrings.wrap | reactDashSketchappLib.reactDashSketchappLibStrings.nowrap = null,
    fontFamily: java.lang.String = null,
    fontSize: scala.Int | scala.Double = null,
    fontStyle: reactDashSketchappLib.reactDashSketchappLibStrings.normal | reactDashSketchappLib.reactDashSketchappLibStrings.italic = null,
    fontWeight: java.lang.String = null,
    height: scala.Int | scala.Double = null,
    justifyContent: reactDashSketchappLib.reactDashSketchappLibStrings.`flex-start` | reactDashSketchappLib.reactDashSketchappLibStrings.`flex-end` | reactDashSketchappLib.reactDashSketchappLibStrings.center | reactDashSketchappLib.reactDashSketchappLibStrings.`space-between` | reactDashSketchappLib.reactDashSketchappLibStrings.`space-around` = null,
    left: scala.Int | scala.Double = null,
    letterSpacing: scala.Int | scala.Double = null,
    lineHeight: scala.Int | scala.Double = null,
    margin: scala.Int | scala.Double = null,
    marginBottom: scala.Int | scala.Double = null,
    marginHorizontal: scala.Int | scala.Double = null,
    marginLeft: scala.Int | scala.Double = null,
    marginRight: scala.Int | scala.Double = null,
    marginTop: scala.Int | scala.Double = null,
    marginVertical: scala.Int | scala.Double = null,
    maxHeight: scala.Int | scala.Double = null,
    maxWidth: scala.Int | scala.Double = null,
    minHeight: scala.Int | scala.Double = null,
    minWidth: scala.Int | scala.Double = null,
    opacity: scala.Int | scala.Double = null,
    overflow: reactDashSketchappLib.reactDashSketchappLibStrings.visible | reactDashSketchappLib.reactDashSketchappLibStrings.hidden | reactDashSketchappLib.reactDashSketchappLibStrings.scroll = null,
    padding: scala.Int | scala.Double = null,
    paddingBottom: scala.Int | scala.Double = null,
    paddingHorizontal: scala.Int | scala.Double = null,
    paddingLeft: scala.Int | scala.Double = null,
    paddingRight: scala.Int | scala.Double = null,
    paddingTop: scala.Int | scala.Double = null,
    paddingVertical: scala.Int | scala.Double = null,
    position: reactDashSketchappLib.reactDashSketchappLibStrings.absolute | reactDashSketchappLib.reactDashSketchappLibStrings.relative = null,
    right: scala.Int | scala.Double = null,
    shadowColor: Color = null,
    shadowOffset: reactDashSketchappLib.Anon_Height = null,
    shadowOpacity: scala.Int | scala.Double = null,
    shadowRadius: scala.Int | scala.Double = null,
    textAlign: reactDashSketchappLib.reactDashSketchappLibStrings.auto | reactDashSketchappLib.reactDashSketchappLibStrings.left | reactDashSketchappLib.reactDashSketchappLibStrings.right | reactDashSketchappLib.reactDashSketchappLibStrings.center | reactDashSketchappLib.reactDashSketchappLibStrings.justify = null,
    textDecorationLine: reactDashSketchappLib.reactDashSketchappLibStrings.none | reactDashSketchappLib.reactDashSketchappLibStrings.underline | reactDashSketchappLib.reactDashSketchappLibStrings.double | reactDashSketchappLib.reactDashSketchappLibStrings.`line-through` = null,
    textShadowColor: Color = null,
    textShadowOffset: reactDashSketchappLib.Anon_HeightWidth = null,
    textShadowRadius: scala.Int | scala.Double = null,
    top: scala.Int | scala.Double = null,
    width: scala.Int | scala.Double = null,
    writingDirection: reactDashSketchappLib.reactDashSketchappLibStrings.auto | reactDashSketchappLib.reactDashSketchappLibStrings.ltr | reactDashSketchappLib.reactDashSketchappLibStrings.rtl = null,
    zIndex: scala.Int | scala.Double = null
  ): TextStyle = {
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
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (flex != null) __obj.updateDynamic("flex")(flex.asInstanceOf[js.Any])
    if (flexBasis != null) __obj.updateDynamic("flexBasis")(flexBasis.asInstanceOf[js.Any])
    if (flexDirection != null) __obj.updateDynamic("flexDirection")(flexDirection.asInstanceOf[js.Any])
    if (flexGrow != null) __obj.updateDynamic("flexGrow")(flexGrow.asInstanceOf[js.Any])
    if (flexShrink != null) __obj.updateDynamic("flexShrink")(flexShrink.asInstanceOf[js.Any])
    if (flexWrap != null) __obj.updateDynamic("flexWrap")(flexWrap.asInstanceOf[js.Any])
    if (fontFamily != null) __obj.updateDynamic("fontFamily")(fontFamily)
    if (fontSize != null) __obj.updateDynamic("fontSize")(fontSize.asInstanceOf[js.Any])
    if (fontStyle != null) __obj.updateDynamic("fontStyle")(fontStyle.asInstanceOf[js.Any])
    if (fontWeight != null) __obj.updateDynamic("fontWeight")(fontWeight)
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (justifyContent != null) __obj.updateDynamic("justifyContent")(justifyContent.asInstanceOf[js.Any])
    if (left != null) __obj.updateDynamic("left")(left.asInstanceOf[js.Any])
    if (letterSpacing != null) __obj.updateDynamic("letterSpacing")(letterSpacing.asInstanceOf[js.Any])
    if (lineHeight != null) __obj.updateDynamic("lineHeight")(lineHeight.asInstanceOf[js.Any])
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
    if (textAlign != null) __obj.updateDynamic("textAlign")(textAlign.asInstanceOf[js.Any])
    if (textDecorationLine != null) __obj.updateDynamic("textDecorationLine")(textDecorationLine.asInstanceOf[js.Any])
    if (textShadowColor != null) __obj.updateDynamic("textShadowColor")(textShadowColor.asInstanceOf[js.Any])
    if (textShadowOffset != null) __obj.updateDynamic("textShadowOffset")(textShadowOffset)
    if (textShadowRadius != null) __obj.updateDynamic("textShadowRadius")(textShadowRadius.asInstanceOf[js.Any])
    if (top != null) __obj.updateDynamic("top")(top.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    if (writingDirection != null) __obj.updateDynamic("writingDirection")(writingDirection.asInstanceOf[js.Any])
    if (zIndex != null) __obj.updateDynamic("zIndex")(zIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[TextStyle]
  }
}

