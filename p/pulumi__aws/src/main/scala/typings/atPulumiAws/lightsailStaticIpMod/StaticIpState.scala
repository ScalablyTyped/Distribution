package typings.atPulumiAws.lightsailStaticIpMod

import typings.atPulumiPulumi.outputMod.Input
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
  def apply(
    arn: Input[String] = null,
    ipAddress: Input[String] = null,
    name: Input[String] = null,
    supportCode: Input[String] = null
  ): StaticIpState = {
    val __obj = js.Dynamic.literal()
    if (arn != null) __obj.updateDynamic("arn")(arn.asInstanceOf[js.Any])
    if (ipAddress != null) __obj.updateDynamic("ipAddress")(ipAddress.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (supportCode != null) __obj.updateDynamic("supportCode")(supportCode.asInstanceOf[js.Any])
    __obj.asInstanceOf[StaticIpState]
  }
}

