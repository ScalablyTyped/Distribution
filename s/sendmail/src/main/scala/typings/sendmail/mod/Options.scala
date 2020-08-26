package typings.sendmail.mod

import typings.sendmail.anon.Debug
import typings.sendmail.anon.KeySelector
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Options extends js.Object {
  /** Default: localhost */
  var devHost: js.UndefOr[String] = js.native
  /** Default: False */
  var devPort: js.UndefOr[Double | Boolean] = js.native
  /** Default: False */
  var dkim: js.UndefOr[Boolean | KeySelector] = js.native
  var logger: js.UndefOr[Debug] = js.native
  var silent: js.UndefOr[Boolean] = js.native
  /** Default: -1 - extra smtp host after resolveMX */
  var smtpHost: js.UndefOr[String | Double] = js.native
  /** Default: 25 */
  var smtpPort: js.UndefOr[Double] = js.native
}

object Options {
  @scala.inline
  def apply(): Options = {
    val __obj = js.Dynamic.literal()
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
    def setDevHost(value: String): Self = this.set("devHost", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDevHost: Self = this.set("devHost", js.undefined)
    @scala.inline
    def setDevPort(value: Double | Boolean): Self = this.set("devPort", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDevPort: Self = this.set("devPort", js.undefined)
    @scala.inline
    def setDkim(value: Boolean | KeySelector): Self = this.set("dkim", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDkim: Self = this.set("dkim", js.undefined)
    @scala.inline
    def setLogger(value: Debug): Self = this.set("logger", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLogger: Self = this.set("logger", js.undefined)
    @scala.inline
    def setSilent(value: Boolean): Self = this.set("silent", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSilent: Self = this.set("silent", js.undefined)
    @scala.inline
    def setSmtpHost(value: String | Double): Self = this.set("smtpHost", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSmtpHost: Self = this.set("smtpHost", js.undefined)
    @scala.inline
    def setSmtpPort(value: Double): Self = this.set("smtpPort", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSmtpPort: Self = this.set("smtpPort", js.undefined)
  }
  
}

