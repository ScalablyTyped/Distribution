package typings.progress.mod

import typings.node.NodeJS.WritableStream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * These are keys in the options object you can pass to the progress bar along with total as seen in the example above.
  */
@js.native
trait ProgressBarOptions extends js.Object {
  /**
    * Optional function to call when the progress bar completes.
    */
  var callback: js.UndefOr[js.Function] = js.native
  /**
    * Option to clear the bar on completion defaulting to false.
    */
  var clear: js.UndefOr[Boolean] = js.native
  /**
    * Completion character defaulting to "=".
    */
  var complete: js.UndefOr[String] = js.native
  /**
    * current completed index
    */
  var curr: js.UndefOr[Double] = js.native
  /**
    * head character defaulting to complete character
    */
  var head: js.UndefOr[String] = js.native
  /**
    * Incomplete character defaulting to "-".
    */
  var incomplete: js.UndefOr[String] = js.native
  /**
    * minimum time between updates in milliseconds defaulting to 16
    */
  var renderThrottle: js.UndefOr[Double] = js.native
  /**
    * The output stream defaulting to stderr.
    */
  var stream: js.UndefOr[WritableStream] = js.native
  /**
    * Total number of ticks to complete.
    */
  var total: Double = js.native
  /**
    * The displayed width of the progress bar defaulting to total.
    */
  var width: js.UndefOr[Double] = js.native
}

object ProgressBarOptions {
  @scala.inline
  def apply(total: Double): ProgressBarOptions = {
    val __obj = js.Dynamic.literal(total = total.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProgressBarOptions]
  }
  @scala.inline
  implicit class ProgressBarOptionsOps[Self <: ProgressBarOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setTotal(value: Double): Self = this.set("total", value.asInstanceOf[js.Any])
    @scala.inline
    def setCallback(value: js.Function): Self = this.set("callback", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCallback: Self = this.set("callback", js.undefined)
    @scala.inline
    def setClear(value: Boolean): Self = this.set("clear", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClear: Self = this.set("clear", js.undefined)
    @scala.inline
    def setComplete(value: String): Self = this.set("complete", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteComplete: Self = this.set("complete", js.undefined)
    @scala.inline
    def setCurr(value: Double): Self = this.set("curr", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCurr: Self = this.set("curr", js.undefined)
    @scala.inline
    def setHead(value: String): Self = this.set("head", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHead: Self = this.set("head", js.undefined)
    @scala.inline
    def setIncomplete(value: String): Self = this.set("incomplete", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIncomplete: Self = this.set("incomplete", js.undefined)
    @scala.inline
    def setRenderThrottle(value: Double): Self = this.set("renderThrottle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRenderThrottle: Self = this.set("renderThrottle", js.undefined)
    @scala.inline
    def setStream(value: WritableStream): Self = this.set("stream", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStream: Self = this.set("stream", js.undefined)
    @scala.inline
    def setWidth(value: Double): Self = this.set("width", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWidth: Self = this.set("width", js.undefined)
  }
  
}

