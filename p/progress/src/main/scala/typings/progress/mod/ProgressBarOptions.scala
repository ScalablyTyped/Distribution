package typings.progress.mod

import typings.node.NodeJS.WritableStream
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
  var clear: js.UndefOr[Boolean] = js.undefined
  /**
    * Completion character defaulting to "=".
    */
  var complete: js.UndefOr[String] = js.undefined
  /**
    * current completed index
    */
  var curr: js.UndefOr[Double] = js.undefined
  /**
    * head character defaulting to complete character
    */
  var head: js.UndefOr[String] = js.undefined
  /**
    * Incomplete character defaulting to "-".
    */
  var incomplete: js.UndefOr[String] = js.undefined
  /**
    * minimum time between updates in milliseconds defaulting to 16
    */
  var renderThrottle: js.UndefOr[Double] = js.undefined
  /**
    * The output stream defaulting to stderr.
    */
  var stream: js.UndefOr[WritableStream] = js.undefined
  /**
    * Total number of ticks to complete.
    */
  var total: Double
  /**
    * The displayed width of the progress bar defaulting to total.
    */
  var width: js.UndefOr[Double] = js.undefined
}

object ProgressBarOptions {
  @scala.inline
  def apply(
    total: Double,
    callback: js.Function = null,
    clear: js.UndefOr[Boolean] = js.undefined,
    complete: String = null,
    curr: Int | Double = null,
    head: String = null,
    incomplete: String = null,
    renderThrottle: Int | Double = null,
    stream: WritableStream = null,
    width: Int | Double = null
  ): ProgressBarOptions = {
    val __obj = js.Dynamic.literal(total = total.asInstanceOf[js.Any])
    if (callback != null) __obj.updateDynamic("callback")(callback.asInstanceOf[js.Any])
    if (!js.isUndefined(clear)) __obj.updateDynamic("clear")(clear.asInstanceOf[js.Any])
    if (complete != null) __obj.updateDynamic("complete")(complete.asInstanceOf[js.Any])
    if (curr != null) __obj.updateDynamic("curr")(curr.asInstanceOf[js.Any])
    if (head != null) __obj.updateDynamic("head")(head.asInstanceOf[js.Any])
    if (incomplete != null) __obj.updateDynamic("incomplete")(incomplete.asInstanceOf[js.Any])
    if (renderThrottle != null) __obj.updateDynamic("renderThrottle")(renderThrottle.asInstanceOf[js.Any])
    if (stream != null) __obj.updateDynamic("stream")(stream.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProgressBarOptions]
  }
}

