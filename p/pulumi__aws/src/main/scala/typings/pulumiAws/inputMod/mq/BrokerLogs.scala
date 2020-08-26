package typings.pulumiAws.inputMod.mq

import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BrokerLogs extends js.Object {
  /**
    * Enables audit logging. User management action made using JMX or the ActiveMQ Web Console is logged. Defaults to `false`.
    */
  var audit: js.UndefOr[Input[Boolean]] = js.native
  /**
    * Enables general logging via CloudWatch. Defaults to `false`.
    */
  var general: js.UndefOr[Input[Boolean]] = js.native
}

object BrokerLogs {
  @scala.inline
  def apply(): BrokerLogs = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BrokerLogs]
  }
  @scala.inline
  implicit class BrokerLogsOps[Self <: BrokerLogs] (val x: Self) extends AnyVal {
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
    def setAudit(value: Input[Boolean]): Self = this.set("audit", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAudit: Self = this.set("audit", js.undefined)
    @scala.inline
    def setGeneral(value: Input[Boolean]): Self = this.set("general", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGeneral: Self = this.set("general", js.undefined)
  }
  
}

