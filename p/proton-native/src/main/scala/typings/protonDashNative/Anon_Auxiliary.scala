package typings.protonDashNative

import typings.protonDashNative.protonDashNativeStrings.auxiliary
import typings.protonDashNative.protonDashNativeStrings.bold
import typings.protonDashNative.protonDashNativeStrings.book
import typings.protonDashNative.protonDashNativeStrings.center
import typings.protonDashNative.protonDashNativeStrings.condensed
import typings.protonDashNative.protonDashNativeStrings.double
import typings.protonDashNative.protonDashNativeStrings.expanded
import typings.protonDashNative.protonDashNativeStrings.extraCondensed
import typings.protonDashNative.protonDashNativeStrings.extraExpanded
import typings.protonDashNative.protonDashNativeStrings.grammar
import typings.protonDashNative.protonDashNativeStrings.heavy
import typings.protonDashNative.protonDashNativeStrings.italic
import typings.protonDashNative.protonDashNativeStrings.left
import typings.protonDashNative.protonDashNativeStrings.light
import typings.protonDashNative.protonDashNativeStrings.maximum
import typings.protonDashNative.protonDashNativeStrings.medium
import typings.protonDashNative.protonDashNativeStrings.minimum
import typings.protonDashNative.protonDashNativeStrings.none
import typings.protonDashNative.protonDashNativeStrings.normal
import typings.protonDashNative.protonDashNativeStrings.oblique
import typings.protonDashNative.protonDashNativeStrings.right
import typings.protonDashNative.protonDashNativeStrings.semiBold
import typings.protonDashNative.protonDashNativeStrings.semiCondensed
import typings.protonDashNative.protonDashNativeStrings.semiExpanded
import typings.protonDashNative.protonDashNativeStrings.single
import typings.protonDashNative.protonDashNativeStrings.spelling
import typings.protonDashNative.protonDashNativeStrings.suggestion
import typings.protonDashNative.protonDashNativeStrings.thin
import typings.protonDashNative.protonDashNativeStrings.ultraBold
import typings.protonDashNative.protonDashNativeStrings.ultraCondensed
import typings.protonDashNative.protonDashNativeStrings.ultraExpanded
import typings.protonDashNative.protonDashNativeStrings.ultraHeavy
import typings.protonDashNative.protonDashNativeStrings.ultraLight
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Auxiliary extends js.Object {
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

object Anon_Auxiliary {
  @scala.inline
  def apply(
    backgroundColor: String = null,
    color: String = null,
    fontFamily: String = null,
    fontSize: Int | Double = null,
    fontStyle: normal | oblique | italic = null,
    fontWeight: minimum | thin | ultraLight | light | book | normal | medium | semiBold | bold | ultraBold | heavy | ultraHeavy | maximum | Double = null,
    textAlign: left | center | right = null,
    textStretch: ultraCondensed | extraCondensed | condensed | semiCondensed | normal | semiExpanded | expanded | extraExpanded | ultraExpanded = null,
    textUnderline: none | single | double | suggestion = null,
    textUnderlineColor: spelling | grammar | auxiliary | String = null
  ): Anon_Auxiliary = {
    val __obj = js.Dynamic.literal()
    if (backgroundColor != null) __obj.updateDynamic("backgroundColor")(backgroundColor)
    if (color != null) __obj.updateDynamic("color")(color)
    if (fontFamily != null) __obj.updateDynamic("fontFamily")(fontFamily)
    if (fontSize != null) __obj.updateDynamic("fontSize")(fontSize.asInstanceOf[js.Any])
    if (fontStyle != null) __obj.updateDynamic("fontStyle")(fontStyle.asInstanceOf[js.Any])
    if (fontWeight != null) __obj.updateDynamic("fontWeight")(fontWeight.asInstanceOf[js.Any])
    if (textAlign != null) __obj.updateDynamic("textAlign")(textAlign.asInstanceOf[js.Any])
    if (textStretch != null) __obj.updateDynamic("textStretch")(textStretch.asInstanceOf[js.Any])
    if (textUnderline != null) __obj.updateDynamic("textUnderline")(textUnderline.asInstanceOf[js.Any])
    if (textUnderlineColor != null) __obj.updateDynamic("textUnderlineColor")(textUnderlineColor.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Auxiliary]
  }
}

