package typings.pulumiAws.inputMod.mq

import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BrokerConfiguration extends js.Object {
  /**
    * The Configuration ID.
    */
  var id: js.UndefOr[Input[String]] = js.native
  /**
    * Revision of the Configuration.
    */
  var revision: js.UndefOr[Input[Double]] = js.native
}

object BrokerConfiguration {
  @scala.inline
  def apply(): BrokerConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BrokerConfiguration]
  }
  @scala.inline
  implicit class BrokerConfigurationOps[Self <: BrokerConfiguration] (val x: Self) extends AnyVal {
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
    def setId(value: Input[String]): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    @scala.inline
    def setRevision(value: Input[Double]): Self = this.set("revision", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRevision: Self = this.set("revision", js.undefined)
  }
  
}

