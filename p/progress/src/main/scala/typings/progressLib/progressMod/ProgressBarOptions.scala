package typings
package progressLib.progressMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait ProgressBarOptions extends js.Object {
  /**
       * Optional function to call when the progress bar completes.
       */
  var callback: js.UndefOr[js.Function] = js.undefined
  /**
       * Option to clear the bar on completion defaulting to false.
       */
  var clear: js.UndefOr[scala.Boolean] = js.undefined
  /**
       * Completion character defaulting to "=".
       */
  var complete: js.UndefOr[java.lang.String] = js.undefined
  /**
       * current completed index
       */
  var curr: js.UndefOr[scala.Double] = js.undefined
  /**
       * head character defaulting to complete character
       */
  var head: js.UndefOr[java.lang.String] = js.undefined
  /**
       * Incomplete character defaulting to "-".
       */
  var incomplete: js.UndefOr[java.lang.String] = js.undefined
  /**
       * minimum time between updates in milliseconds defaulting to 16
       */
  var renderThrottle: js.UndefOr[scala.Double] = js.undefined
  /**
       * The output stream defaulting to stderr.
       */
  var stream: js.UndefOr[nodeLib.NodeJSNs.WritableStream] = js.undefined
  /**
       * Total number of ticks to complete.
       */
  var total: scala.Double
  /**
       * The displayed width of the progress bar defaulting to total.
       */
  var width: js.UndefOr[scala.Double] = js.undefined
}

