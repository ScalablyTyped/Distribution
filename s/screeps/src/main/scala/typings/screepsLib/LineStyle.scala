package typings
package screepsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait LineStyle extends js.Object {
  /**
       * Line color in any web format, default is #ffffff(white).
       */
  var color: js.UndefOr[java.lang.String] = js.undefined
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
       * Line width, default is 0.1.
       */
  var width: js.UndefOr[scala.Double] = js.undefined
}

