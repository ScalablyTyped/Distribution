package typings
package screepsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait PolyStyle extends js.Object {
  /**
       * Fill color in any web format, default is #ffffff(white).
       */
  var fill: js.UndefOr[java.lang.String] = js.undefined
  /**
       * Either undefined (solid line), dashed, or dotted.Default is undefined.
       */
  var lineStyle: js.UndefOr[
    screepsLib.screepsLibStrings.dashed | screepsLib.screepsLibStrings.dotted | screepsLib.screepsLibStrings.solid
  ] = js.undefined
  /**
       * Opacity value, default is 0.5.
       */
  var opacity: js.UndefOr[scala.Double] = js.undefined
  /**
       * Stroke color in any web format, default is undefined (no stroke).
       */
  var stroke: js.UndefOr[java.lang.String] = js.undefined
  /**
       * Stroke line width, default is 0.1.
       */
  var strokeWidth: js.UndefOr[scala.Double] = js.undefined
}

