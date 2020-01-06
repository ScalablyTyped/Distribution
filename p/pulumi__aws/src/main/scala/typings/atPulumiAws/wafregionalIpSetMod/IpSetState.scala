package typings.atPulumiAws.wafregionalIpSetMod

import typings.atPulumiAws.typesInputMod.wafregional.IpSetIpSetDescriptor
import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IpSetState extends js.Object {
  /**
    * The ARN of the WAF IPSet.
    */
  val arn: js.UndefOr[Input[String]] = js.native
  /**
    * One or more pairs specifying the IP address type (IPV4 or IPV6) and the IP address range (in CIDR notation) from which web requests originate.
    */
  val ipSetDescriptors: js.UndefOr[Input[js.Array[Input[IpSetIpSetDescriptor]]]] = js.native
  /**
    * The name or description of the IPSet.
    */
  val name: js.UndefOr[Input[String]] = js.native
}

object IpSetState {
  @scala.inline
  def apply(
    arn: Input[String] = null,
    ipSetDescriptors: Input[js.Array[Input[IpSetIpSetDescriptor]]] = null,
    name: Input[String] = null
  ): IpSetState = {
    val __obj = js.Dynamic.literal()
    if (arn != null) __obj.updateDynamic("arn")(arn.asInstanceOf[js.Any])
    if (ipSetDescriptors != null) __obj.updateDynamic("ipSetDescriptors")(ipSetDescriptors.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    __obj.asInstanceOf[IpSetState]
  }
}

