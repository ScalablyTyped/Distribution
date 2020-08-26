package typings.shopifyPrime.optionsBaseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ProcessedOptions extends js.Object {
  /**
    * Show objects imported or processed before date (format: 2014-04-25T16:15:47-04:00).
    */
  var processed_at_max: js.UndefOr[String] = js.native
  /**
    * Show objects imported or processed after date (format: 2014-04-25T16:15:47-04:00).
    */
  var processed_at_min: js.UndefOr[String] = js.native
}

object ProcessedOptions {
  @scala.inline
  def apply(): ProcessedOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ProcessedOptions]
  }
  @scala.inline
  implicit class ProcessedOptionsOps[Self <: ProcessedOptions] (val x: Self) extends AnyVal {
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
    def setProcessed_at_max(value: String): Self = this.set("processed_at_max", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProcessed_at_max: Self = this.set("processed_at_max", js.undefined)
    @scala.inline
    def setProcessed_at_min(value: String): Self = this.set("processed_at_min", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProcessed_at_min: Self = this.set("processed_at_min", js.undefined)
  }
  
}

