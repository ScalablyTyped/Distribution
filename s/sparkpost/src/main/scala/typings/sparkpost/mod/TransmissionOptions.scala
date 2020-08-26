package typings.sparkpost.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TransmissionOptions extends js.Object {
  /** Whether click tracking is enabled for this transmission */
  var click_tracking: js.UndefOr[Boolean] = js.native
  /** Whether or not to perform CSS inlining in HTML content */
  var inline_css: js.UndefOr[Boolean] = js.native
  /** The ID of a dedicated IP pool associated with your account ( Note: SparkPost only ). */
  var ip_pool: js.UndefOr[String] = js.native
  /** Whether open tracking is enabled for this transmission */
  var open_tracking: js.UndefOr[Boolean] = js.native
  /** Whether or not to use the sandbox sending domain */
  var sandbox: js.UndefOr[Boolean] = js.native
  /** SparkPost Enterprise API only: Whether or not to ignore customer suppression rules, for this transmission only. Only applicable if your configuration supports this parameter. */
  var skip_suppression: js.UndefOr[Boolean] = js.native
  /** Delay generation of messages until this datetime. */
  var start_time: js.UndefOr[String] = js.native
  /** Whether message is transactional or non-transactional for unsubscribe and suppression purposes */
  var transactional: js.UndefOr[Boolean] = js.native
}

object TransmissionOptions {
  @scala.inline
  def apply(): TransmissionOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TransmissionOptions]
  }
  @scala.inline
  implicit class TransmissionOptionsOps[Self <: TransmissionOptions] (val x: Self) extends AnyVal {
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
    def setClick_tracking(value: Boolean): Self = this.set("click_tracking", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClick_tracking: Self = this.set("click_tracking", js.undefined)
    @scala.inline
    def setInline_css(value: Boolean): Self = this.set("inline_css", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInline_css: Self = this.set("inline_css", js.undefined)
    @scala.inline
    def setIp_pool(value: String): Self = this.set("ip_pool", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIp_pool: Self = this.set("ip_pool", js.undefined)
    @scala.inline
    def setOpen_tracking(value: Boolean): Self = this.set("open_tracking", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOpen_tracking: Self = this.set("open_tracking", js.undefined)
    @scala.inline
    def setSandbox(value: Boolean): Self = this.set("sandbox", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSandbox: Self = this.set("sandbox", js.undefined)
    @scala.inline
    def setSkip_suppression(value: Boolean): Self = this.set("skip_suppression", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSkip_suppression: Self = this.set("skip_suppression", js.undefined)
    @scala.inline
    def setStart_time(value: String): Self = this.set("start_time", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStart_time: Self = this.set("start_time", js.undefined)
    @scala.inline
    def setTransactional(value: Boolean): Self = this.set("transactional", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTransactional: Self = this.set("transactional", js.undefined)
  }
  
}

