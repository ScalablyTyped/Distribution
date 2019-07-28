package typings.atPulumiAws.ec2VpcMod

import org.scalablytyped.runtime.StringDictionary
import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VpcArgs extends js.Object {
  /**
    * Requests an Amazon-provided IPv6 CIDR
    * block with a /56 prefix length for the VPC. You cannot specify the range of IP addresses, or
    * the size of the CIDR block. Default is `false`.
    */
  val assignGeneratedIpv6CidrBlock: js.UndefOr[Input[Boolean]] = js.undefined
  /**
    * The CIDR block for the VPC.
    */
  val cidrBlock: Input[String]
  /**
    * A boolean flag to enable/disable ClassicLink
    * for the VPC. Only valid in regions and accounts that support EC2 Classic.
    * See the [ClassicLink documentation][1] for more information. Defaults false.
    */
  val enableClassiclink: js.UndefOr[Input[Boolean]] = js.undefined
  /**
    * A boolean flag to enable/disable ClassicLink DNS Support for the VPC.
    * Only valid in regions and accounts that support EC2 Classic.
    */
  val enableClassiclinkDnsSupport: js.UndefOr[Input[Boolean]] = js.undefined
  /**
    * A boolean flag to enable/disable DNS hostnames in the VPC. Defaults false.
    */
  val enableDnsHostnames: js.UndefOr[Input[Boolean]] = js.undefined
  /**
    * A boolean flag to enable/disable DNS support in the VPC. Defaults true.
    */
  val enableDnsSupport: js.UndefOr[Input[Boolean]] = js.undefined
  /**
    * A tenancy option for instances launched into the VPC
    */
  val instanceTenancy: js.UndefOr[Input[String]] = js.undefined
  /**
    * A mapping of tags to assign to the resource.
    */
  val tags: js.UndefOr[Input[StringDictionary[_]]] = js.undefined
}

object VpcArgs {
  @scala.inline
  def apply(
    cidrBlock: Input[String],
    assignGeneratedIpv6CidrBlock: Input[Boolean] = null,
    enableClassiclink: Input[Boolean] = null,
    enableClassiclinkDnsSupport: Input[Boolean] = null,
    enableDnsHostnames: Input[Boolean] = null,
    enableDnsSupport: Input[Boolean] = null,
    instanceTenancy: Input[String] = null,
    tags: Input[StringDictionary[_]] = null
  ): VpcArgs = {
    val __obj = js.Dynamic.literal(cidrBlock = cidrBlock.asInstanceOf[js.Any])
    if (assignGeneratedIpv6CidrBlock != null) __obj.updateDynamic("assignGeneratedIpv6CidrBlock")(assignGeneratedIpv6CidrBlock.asInstanceOf[js.Any])
    if (enableClassiclink != null) __obj.updateDynamic("enableClassiclink")(enableClassiclink.asInstanceOf[js.Any])
    if (enableClassiclinkDnsSupport != null) __obj.updateDynamic("enableClassiclinkDnsSupport")(enableClassiclinkDnsSupport.asInstanceOf[js.Any])
    if (enableDnsHostnames != null) __obj.updateDynamic("enableDnsHostnames")(enableDnsHostnames.asInstanceOf[js.Any])
    if (enableDnsSupport != null) __obj.updateDynamic("enableDnsSupport")(enableDnsSupport.asInstanceOf[js.Any])
    if (instanceTenancy != null) __obj.updateDynamic("instanceTenancy")(instanceTenancy.asInstanceOf[js.Any])
    if (tags != null) __obj.updateDynamic("tags")(tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[VpcArgs]
  }
}

