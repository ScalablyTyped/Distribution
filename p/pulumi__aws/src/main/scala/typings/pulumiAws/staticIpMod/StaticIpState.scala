package typings.pulumiAws.staticIpMod

import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StaticIpState extends js.Object {
  /**
    * The ARN of the Lightsail static IP
    */
  val arn: js.UndefOr[Input[String]] = js.native
  /**
    * The allocated static IP address
    */
  val ipAddress: js.UndefOr[Input[String]] = js.native
  /**
    * The name for the allocated static IP
    */
  val name: js.UndefOr[Input[String]] = js.native
  /**
    * The support code.
    */
  val supportCode: js.UndefOr[Input[String]] = js.native
}

object StaticIpState {
  @scala.inline
  def apply(): StaticIpState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StaticIpState]
  }
  @scala.inline
  implicit class StaticIpStateOps[Self <: StaticIpState] (val x: Self) extends AnyVal {
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
    def setArn(value: Input[String]): Self = this.set("arn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteArn: Self = this.set("arn", js.undefined)
    @scala.inline
    def setIpAddress(value: Input[String]): Self = this.set("ipAddress", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIpAddress: Self = this.set("ipAddress", js.undefined)
    @scala.inline
    def setName(value: Input[String]): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    @scala.inline
    def setSupportCode(value: Input[String]): Self = this.set("supportCode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSupportCode: Self = this.set("supportCode", js.undefined)
  }
  
}

