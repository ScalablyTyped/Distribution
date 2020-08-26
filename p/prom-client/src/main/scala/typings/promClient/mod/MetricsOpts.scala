package typings.promClient.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MetricsOpts extends js.Object {
  /**
  	 * Whether to include timestamps in the output, defaults to true
  	 */
  var timestamps: js.UndefOr[Boolean] = js.native
}

object MetricsOpts {
  @scala.inline
  def apply(): MetricsOpts = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MetricsOpts]
  }
  @scala.inline
  implicit class MetricsOptsOps[Self <: MetricsOpts] (val x: Self) extends AnyVal {
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
    def setTimestamps(value: Boolean): Self = this.set("timestamps", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTimestamps: Self = this.set("timestamps", js.undefined)
  }
  
}

