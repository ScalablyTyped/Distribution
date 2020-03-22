package typings.reactSketchapp.mod

import typings.reactSketchapp.AnonHeight
import typings.reactSketchapp.AnonWidth
import typings.reactSketchapp.reactSketchappStrings.`column-reverse`
import typings.reactSketchapp.reactSketchappStrings.`flex-end`
import typings.reactSketchapp.reactSketchappStrings.`flex-start`
import typings.reactSketchapp.reactSketchappStrings.`line-through`
import typings.reactSketchapp.reactSketchappStrings.`row-reverse`
import typings.reactSketchapp.reactSketchappStrings.`space-around`
import typings.reactSketchapp.reactSketchappStrings.`space-between`
import typings.reactSketchapp.reactSketchappStrings.absolute
import typings.reactSketchapp.reactSketchappStrings.auto
import typings.reactSketchapp.reactSketchappStrings.center
import typings.reactSketchapp.reactSketchappStrings.column
import typings.reactSketchapp.reactSketchappStrings.dashed
import typings.reactSketchapp.reactSketchappStrings.dotted
import typings.reactSketchapp.reactSketchappStrings.double
import typings.reactSketchapp.reactSketchappStrings.hidden
import typings.reactSketchapp.reactSketchappStrings.italic
import typings.reactSketchapp.reactSketchappStrings.justify
import typings.reactSketchapp.reactSketchappStrings.left
import typings.reactSketchapp.reactSketchappStrings.ltr
import typings.reactSketchapp.reactSketchappStrings.none
import typings.reactSketchapp.reactSketchappStrings.normal
import typings.reactSketchapp.reactSketchappStrings.nowrap
import typings.reactSketchapp.reactSketchappStrings.relative
import typings.reactSketchapp.reactSketchappStrings.right
import typings.reactSketchapp.reactSketchappStrings.row
import typings.reactSketchapp.reactSketchappStrings.rtl
import typings.reactSketchapp.reactSketchappStrings.scroll
import typings.reactSketchapp.reactSketchappStrings.solid
import typings.reactSketchapp.reactSketchappStrings.stretch
import typings.reactSketchapp.reactSketchappStrings.underline
import typings.reactSketchapp.reactSketchappStrings.visible
import typings.reactSketchapp.reactSketchappStrings.wrap
import typings.reactSketchapp.typesMod.Color
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TextStyle extends Style {
  var color: js.UndefOr[Color] = js.undefined
  var fontFamily: js.UndefOr[String] = js.undefined
  var fontSize: js.UndefOr[Double] = js.undefined
  var fontStyle: js.UndefOr[normal | italic] = js.undefined
  var fontWeight: js.UndefOr[String] = js.undefined
  var letterSpacing: js.UndefOr[Double] = js.undefined
  var lineHeight: js.UndefOr[Double] = js.undefined
  var textAlign: js.UndefOr[auto | left | right | center | justify] = js.undefined
  var textDecorationLine: js.UndefOr[none | underline | double | `line-through`] = js.undefined
  var textShadowColor: js.UndefOr[Color] = js.undefined
  var textShadowOffset: js.UndefOr[AnonWidth] = js.undefined
  var textShadowRadius: js.UndefOr[Double] = js.undefined
  var writingDirection: js.UndefOr[auto | ltr | rtl] = js.undefined
}

object TextStyle {
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
    color: Color = null,
    flex: Int | Double = null,
    flexBasis: Int | Double = null,
    flexDirection: row | `row-reverse` | column | `column-reverse` = null,
    flexGrow: Int | Double = null,
    flexShrink: Int | Double = null,
    flexWrap: wrap | nowrap = null,
    fontFamily: String = null,
    fontSize: Int | Double = null,
    fontStyle: normal | italic = null,
    fontWeight: String = null,
    height: Int | Double = null,
    justifyContent: `flex-start` | `flex-end` | center | `space-between` | `space-around` = null,
    left: Int | Double = null,
    letterSpacing: Int | Double = null,
    lineHeight: Int | Double = null,
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
    shadowOffset: AnonHeight = null,
    shadowOpacity: Int | Double = null,
    shadowRadius: Int | Double = null,
    textAlign: auto | left | right | center | justify = null,
    textDecorationLine: none | underline | double | `line-through` = null,
    textShadowColor: Color = null,
    textShadowOffset: AnonWidth = null,
    textShadowRadius: Int | Double = null,
    top: Int | Double = null,
    width: Int | Double = null,
    writingDirection: auto | ltr | rtl = null,
    zIndex: Int | Double = null
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
    if (fontFamily != null) __obj.updateDynamic("fontFamily")(fontFamily.asInstanceOf[js.Any])
    if (fontSize != null) __obj.updateDynamic("fontSize")(fontSize.asInstanceOf[js.Any])
    if (fontStyle != null) __obj.updateDynamic("fontStyle")(fontStyle.asInstanceOf[js.Any])
    if (fontWeight != null) __obj.updateDynamic("fontWeight")(fontWeight.asInstanceOf[js.Any])
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
    if (shadowOffset != null) __obj.updateDynamic("shadowOffset")(shadowOffset.asInstanceOf[js.Any])
    if (shadowOpacity != null) __obj.updateDynamic("shadowOpacity")(shadowOpacity.asInstanceOf[js.Any])
    if (shadowRadius != null) __obj.updateDynamic("shadowRadius")(shadowRadius.asInstanceOf[js.Any])
    if (textAlign != null) __obj.updateDynamic("textAlign")(textAlign.asInstanceOf[js.Any])
    if (textDecorationLine != null) __obj.updateDynamic("textDecorationLine")(textDecorationLine.asInstanceOf[js.Any])
    if (textShadowColor != null) __obj.updateDynamic("textShadowColor")(textShadowColor.asInstanceOf[js.Any])
    if (textShadowOffset != null) __obj.updateDynamic("textShadowOffset")(textShadowOffset.asInstanceOf[js.Any])
    if (textShadowRadius != null) __obj.updateDynamic("textShadowRadius")(textShadowRadius.asInstanceOf[js.Any])
    if (top != null) __obj.updateDynamic("top")(top.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    if (writingDirection != null) __obj.updateDynamic("writingDirection")(writingDirection.asInstanceOf[js.Any])
    if (zIndex != null) __obj.updateDynamic("zIndex")(zIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[TextStyle]
  }
}

