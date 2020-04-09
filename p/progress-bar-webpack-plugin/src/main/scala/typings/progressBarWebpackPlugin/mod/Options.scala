package typings.progressBarWebpackPlugin.mod

import typings.node.NodeJS.WritableStream
import typings.progress.mod.ProgressBarOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends ProgressBarOptions {
  /**
    * optional function to call when the progress bar completes
    */
  @JSName("callback")
  var callback_Options: js.UndefOr[js.Function0[Unit]] = js.undefined
  /**
    * function to display a custom summary
    * (passed build time)
    */
  var customSummary: js.UndefOr[js.Function1[/* summary */ String, Unit]] = js.undefined
  /**
    * the format of the progress bar
    * @default ':bar'
    */
  var format: js.UndefOr[String] = js.undefined
  /**
    * option to show summary of time taken
    * @default true
    */
  var summary: js.UndefOr[Boolean] = js.undefined
  /**
    * custom summary message if summary option is false
    */
  var summaryContent: js.UndefOr[Boolean] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    total: Double,
    callback: () => Unit = null,
    clear: js.UndefOr[Boolean] = js.undefined,
    complete: String = null,
    curr: Int | Double = null,
    customSummary: /* summary */ String => Unit = null,
    format: String = null,
    head: String = null,
    incomplete: String = null,
    renderThrottle: Int | Double = null,
    stream: WritableStream = null,
    summary: js.UndefOr[Boolean] = js.undefined,
    summaryContent: js.UndefOr[Boolean] = js.undefined,
    width: Int | Double = null
  ): Options = {
    val __obj = js.Dynamic.literal(total = total.asInstanceOf[js.Any])
    if (callback != null) __obj.updateDynamic("callback")(js.Any.fromFunction0(callback))
    if (!js.isUndefined(clear)) __obj.updateDynamic("clear")(clear.asInstanceOf[js.Any])
    if (complete != null) __obj.updateDynamic("complete")(complete.asInstanceOf[js.Any])
    if (curr != null) __obj.updateDynamic("curr")(curr.asInstanceOf[js.Any])
    if (customSummary != null) __obj.updateDynamic("customSummary")(js.Any.fromFunction1(customSummary))
    if (format != null) __obj.updateDynamic("format")(format.asInstanceOf[js.Any])
    if (head != null) __obj.updateDynamic("head")(head.asInstanceOf[js.Any])
    if (incomplete != null) __obj.updateDynamic("incomplete")(incomplete.asInstanceOf[js.Any])
    if (renderThrottle != null) __obj.updateDynamic("renderThrottle")(renderThrottle.asInstanceOf[js.Any])
    if (stream != null) __obj.updateDynamic("stream")(stream.asInstanceOf[js.Any])
    if (!js.isUndefined(summary)) __obj.updateDynamic("summary")(summary.asInstanceOf[js.Any])
    if (!js.isUndefined(summaryContent)) __obj.updateDynamic("summaryContent")(summaryContent.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

