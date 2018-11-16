package typings
package screepsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait TextStyle extends js.Object {
  var align: js.UndefOr[
    screepsLib.screepsLibStrings.center | screepsLib.screepsLibStrings.left | screepsLib.screepsLibStrings.right
  ] = js.undefined
  /**
       * Background color in any web format, default is undefined (no background).When background is enabled, text vertical align is set to middle (default is baseline).
       */
  var backgroundColor: js.UndefOr[java.lang.String] = js.undefined
  /**
       * Background rectangle padding, default is 0.3.
       */
  var backgroundPadding: js.UndefOr[scala.Double] = js.undefined
  /**
       * Font color in any web format, default is #ffffff(white).
       */
  var color: js.UndefOr[java.lang.String] = js.undefined
  /**
       * Either a number or a string in one of the following forms:
       * 0.7 - relative size in game coordinates
       * 20px - absolute size in pixels
       * 0.7 serif
       * bold italic 1.5 Times New Roman
       */
  var font: js.UndefOr[scala.Double | java.lang.String] = js.undefined
  /**
       * Opacity value, default is 1.0.
       */
  var opacity: js.UndefOr[scala.Double] = js.undefined
  /**
       * Stroke color in any web format, default is undefined (no stroke).
       */
  var stroke: js.UndefOr[java.lang.String] = js.undefined
  /**
       * Stroke width, default is 0.15.
       */
  var strokeWidth: js.UndefOr[scala.Double] = js.undefined
}

