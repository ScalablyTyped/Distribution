package typings.progressBarWebpackPlugin.mod

import typings.progress.mod.ProgressBarOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Options extends ProgressBarOptions {
  /**
    * optional function to call when the progress bar completes
    */
  @JSName("callback")
  var callback_Options: js.UndefOr[js.Function0[Unit]] = js.native
  /**
    * function to display a custom summary
    * (passed build time)
    */
  var customSummary: js.UndefOr[js.Function1[/* summary */ String, Unit]] = js.native
  /**
    * the format of the progress bar
    * @default ':bar'
    */
  var format: js.UndefOr[String] = js.native
  /**
    * option to show summary of time taken
    * @default true
    */
  var summary: js.UndefOr[Boolean] = js.native
  /**
    * custom summary message if summary option is false
    */
  var summaryContent: js.UndefOr[Boolean] = js.native
}

object Options {
  @scala.inline
  def apply(total: Double): Options = {
    val __obj = js.Dynamic.literal(total = total.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
  @scala.inline
  implicit class OptionsOps[Self <: Options] (val x: Self) extends AnyVal {
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
    def setCallback(value: () => Unit): Self = this.set("callback", js.Any.fromFunction0(value))
    @scala.inline
    def deleteCallback: Self = this.set("callback", js.undefined)
    @scala.inline
    def setCustomSummary(value: /* summary */ String => Unit): Self = this.set("customSummary", js.Any.fromFunction1(value))
    @scala.inline
    def deleteCustomSummary: Self = this.set("customSummary", js.undefined)
    @scala.inline
    def setFormat(value: String): Self = this.set("format", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFormat: Self = this.set("format", js.undefined)
    @scala.inline
    def setSummary(value: Boolean): Self = this.set("summary", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSummary: Self = this.set("summary", js.undefined)
    @scala.inline
    def setSummaryContent(value: Boolean): Self = this.set("summaryContent", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSummaryContent: Self = this.set("summaryContent", js.undefined)
  }
  
}

