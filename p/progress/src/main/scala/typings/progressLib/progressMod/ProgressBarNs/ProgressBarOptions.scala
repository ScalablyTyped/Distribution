package typings
package progressLib.progressMod.ProgressBarNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * These are keys in the options object you can pass to the progress bar along with total as seen in the example above.
  */
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

object ProgressBarOptions {
  @scala.inline
  def apply(
    total: scala.Double,
    callback: js.Function = null,
    clear: js.UndefOr[scala.Boolean] = js.undefined,
    complete: java.lang.String = null,
    curr: scala.Int | scala.Double = null,
    head: java.lang.String = null,
    incomplete: java.lang.String = null,
    renderThrottle: scala.Int | scala.Double = null,
    stream: nodeLib.NodeJSNs.WritableStream = null,
    width: scala.Int | scala.Double = null
  ): ProgressBarOptions = {
    val __obj = js.Dynamic.literal(total = total)
    if (callback != null) __obj.updateDynamic("callback")(callback)
    if (!js.isUndefined(clear)) __obj.updateDynamic("clear")(clear)
    if (complete != null) __obj.updateDynamic("complete")(complete)
    if (curr != null) __obj.updateDynamic("curr")(curr.asInstanceOf[js.Any])
    if (head != null) __obj.updateDynamic("head")(head)
    if (incomplete != null) __obj.updateDynamic("incomplete")(incomplete)
    if (renderThrottle != null) __obj.updateDynamic("renderThrottle")(renderThrottle.asInstanceOf[js.Any])
    if (stream != null) __obj.updateDynamic("stream")(stream)
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProgressBarOptions]
  }
}

