package typings.protonNative.anon

import typings.protonNative.protonNativeStrings.auxiliary
import typings.protonNative.protonNativeStrings.bold
import typings.protonNative.protonNativeStrings.book
import typings.protonNative.protonNativeStrings.center
import typings.protonNative.protonNativeStrings.condensed
import typings.protonNative.protonNativeStrings.double
import typings.protonNative.protonNativeStrings.expanded
import typings.protonNative.protonNativeStrings.extraCondensed
import typings.protonNative.protonNativeStrings.extraExpanded
import typings.protonNative.protonNativeStrings.grammar
import typings.protonNative.protonNativeStrings.heavy
import typings.protonNative.protonNativeStrings.italic
import typings.protonNative.protonNativeStrings.left
import typings.protonNative.protonNativeStrings.light
import typings.protonNative.protonNativeStrings.maximum
import typings.protonNative.protonNativeStrings.medium
import typings.protonNative.protonNativeStrings.minimum
import typings.protonNative.protonNativeStrings.none
import typings.protonNative.protonNativeStrings.normal
import typings.protonNative.protonNativeStrings.oblique
import typings.protonNative.protonNativeStrings.right
import typings.protonNative.protonNativeStrings.semiBold
import typings.protonNative.protonNativeStrings.semiCondensed
import typings.protonNative.protonNativeStrings.semiExpanded
import typings.protonNative.protonNativeStrings.single
import typings.protonNative.protonNativeStrings.spelling
import typings.protonNative.protonNativeStrings.suggestion
import typings.protonNative.protonNativeStrings.thin
import typings.protonNative.protonNativeStrings.ultraBold
import typings.protonNative.protonNativeStrings.ultraCondensed
import typings.protonNative.protonNativeStrings.ultraExpanded
import typings.protonNative.protonNativeStrings.ultraHeavy
import typings.protonNative.protonNativeStrings.ultraLight
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BackgroundColor extends js.Object {
  /**
    * The background color, specified as a CSS color string.
    */
  var backgroundColor: js.UndefOr[String] = js.undefined
  /**
    * The text color, specified as a CSS color string.
    */
  var color: js.UndefOr[String] = js.undefined
  /**
    * The font family (only if available on the system).
    */
  var fontFamily: js.UndefOr[String] = js.undefined
  /**
    * The font size (in pt).
    */
  var fontSize: js.UndefOr[Double] = js.undefined
  /**
    * Whether an italic font should be used.
    */
  var fontStyle: js.UndefOr[normal | oblique | italic] = js.undefined
  /**
    * Whether a bold font should be used (and the amount).
    */
  var fontWeight: js.UndefOr[
    minimum | thin | ultraLight | light | book | normal | medium | semiBold | bold | ultraBold | heavy | ultraHeavy | maximum | Double
  ] = js.undefined
  /**
    * Wheter the text should be aligned to the left, center or right.
    *
    * **Works only on a top level text component, not it's children!**
    */
  var textAlign: js.UndefOr[left | center | right] = js.undefined
  /**
    * How wide or narrow the characters should be.
    */
  var textStretch: js.UndefOr[
    ultraCondensed | extraCondensed | condensed | semiCondensed | normal | semiExpanded | expanded | extraExpanded | ultraExpanded
  ] = js.undefined
  /**
    * The text underline style.
    */
  var textUnderline: js.UndefOr[none | single | double | suggestion] = js.undefined
  /**
    * The text underline color.
    *
    * A color string | 'spelling' | 'grammar' | 'auxiliary'
    */
  var textUnderlineColor: js.UndefOr[spelling | grammar | auxiliary | String] = js.undefined
}

object BackgroundColor {
  @scala.inline
  def apply(
    backgroundColor: String = null,
    color: String = null,
    fontFamily: String = null,
    fontSize: js.UndefOr[Double] = js.undefined,
    fontStyle: normal | oblique | italic = null,
    fontWeight: minimum | thin | ultraLight | light | book | normal | medium | semiBold | bold | ultraBold | heavy | ultraHeavy | maximum | Double = null,
    textAlign: left | center | right = null,
    textStretch: ultraCondensed | extraCondensed | condensed | semiCondensed | normal | semiExpanded | expanded | extraExpanded | ultraExpanded = null,
    textUnderline: none | single | double | suggestion = null,
    textUnderlineColor: spelling | grammar | auxiliary | String = null
  ): BackgroundColor = {
    val __obj = js.Dynamic.literal()
    if (backgroundColor != null) __obj.updateDynamic("backgroundColor")(backgroundColor.asInstanceOf[js.Any])
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (fontFamily != null) __obj.updateDynamic("fontFamily")(fontFamily.asInstanceOf[js.Any])
    if (!js.isUndefined(fontSize)) __obj.updateDynamic("fontSize")(fontSize.get.asInstanceOf[js.Any])
    if (fontStyle != null) __obj.updateDynamic("fontStyle")(fontStyle.asInstanceOf[js.Any])
    if (fontWeight != null) __obj.updateDynamic("fontWeight")(fontWeight.asInstanceOf[js.Any])
    if (textAlign != null) __obj.updateDynamic("textAlign")(textAlign.asInstanceOf[js.Any])
    if (textStretch != null) __obj.updateDynamic("textStretch")(textStretch.asInstanceOf[js.Any])
    if (textUnderline != null) __obj.updateDynamic("textUnderline")(textUnderline.asInstanceOf[js.Any])
    if (textUnderlineColor != null) __obj.updateDynamic("textUnderlineColor")(textUnderlineColor.asInstanceOf[js.Any])
    __obj.asInstanceOf[BackgroundColor]
  }
}

