package typings
package protonDashNativeLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait Anon_BackgroundColor extends js.Object {
  /**
           * The background color, specified as a CSS color string.
           */
  var backgroundColor: js.UndefOr[java.lang.String] = js.undefined
  /**
           * The text color, specified as a CSS color string.
           */
  var color: js.UndefOr[java.lang.String] = js.undefined
  /**
           * The font family (only if available on the system).
           */
  var fontFamily: js.UndefOr[java.lang.String] = js.undefined
  /**
           * The font size (in pt).
           */
  var fontSize: js.UndefOr[scala.Double] = js.undefined
  /**
           * Whether an italic font should be used.
           */
  var fontStyle: js.UndefOr[
    protonDashNativeLib.protonDashNativeLibStrings.normal | protonDashNativeLib.protonDashNativeLibStrings.oblique | protonDashNativeLib.protonDashNativeLibStrings.italic
  ] = js.undefined
  /**
           * Whether a bold font should be used (and the amount).
           */
  var fontWeight: js.UndefOr[
    protonDashNativeLib.protonDashNativeLibStrings.minimum | protonDashNativeLib.protonDashNativeLibStrings.thin | protonDashNativeLib.protonDashNativeLibStrings.ultraLight | protonDashNativeLib.protonDashNativeLibStrings.light | protonDashNativeLib.protonDashNativeLibStrings.book | protonDashNativeLib.protonDashNativeLibStrings.normal | protonDashNativeLib.protonDashNativeLibStrings.medium | protonDashNativeLib.protonDashNativeLibStrings.semiBold | protonDashNativeLib.protonDashNativeLibStrings.bold | protonDashNativeLib.protonDashNativeLibStrings.ultraBold | protonDashNativeLib.protonDashNativeLibStrings.heavy | protonDashNativeLib.protonDashNativeLibStrings.ultraHeavy | protonDashNativeLib.protonDashNativeLibStrings.maximum | scala.Double
  ] = js.undefined
  /**
           * Wheter the text should be aligned to the left, center or right.
           *
           * **Works only on a top level text component, not it's children!**
           */
  var textAlign: js.UndefOr[
    protonDashNativeLib.protonDashNativeLibStrings.left | protonDashNativeLib.protonDashNativeLibStrings.center | protonDashNativeLib.protonDashNativeLibStrings.right
  ] = js.undefined
  /**
           * How wide or narrow the characters should be.
           */
  var textStretch: js.UndefOr[
    protonDashNativeLib.protonDashNativeLibStrings.ultraCondensed | protonDashNativeLib.protonDashNativeLibStrings.extraCondensed | protonDashNativeLib.protonDashNativeLibStrings.condensed | protonDashNativeLib.protonDashNativeLibStrings.semiCondensed | protonDashNativeLib.protonDashNativeLibStrings.normal | protonDashNativeLib.protonDashNativeLibStrings.semiExpanded | protonDashNativeLib.protonDashNativeLibStrings.expanded | protonDashNativeLib.protonDashNativeLibStrings.extraExpanded | protonDashNativeLib.protonDashNativeLibStrings.ultraExpanded
  ] = js.undefined
  /**
           * The text underline style.
           */
  var textUnderline: js.UndefOr[
    protonDashNativeLib.protonDashNativeLibStrings.none | protonDashNativeLib.protonDashNativeLibStrings.single | protonDashNativeLib.protonDashNativeLibStrings.double | protonDashNativeLib.protonDashNativeLibStrings.suggestion
  ] = js.undefined
  /**
           * The text underline color.
           *
           * A color string | 'spelling' | 'grammar' | 'auxiliary'
           */
  var textUnderlineColor: js.UndefOr[
    protonDashNativeLib.protonDashNativeLibStrings.spelling | protonDashNativeLib.protonDashNativeLibStrings.grammar | protonDashNativeLib.protonDashNativeLibStrings.auxiliary | java.lang.String
  ] = js.undefined
}

