package typings.pulumiAws.vpcEndpointMod

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait VpcEndpointArgs extends js.Object {
  /**
    * Accept the VPC endpoint (the VPC endpoint and service need to be in the same AWS account).
    */
  val autoAccept: js.UndefOr[Input[Boolean]] = js.native
  val policy: js.UndefOr[Input[String]] = js.native
  /**
    * Whether or not to associate a private hosted zone with the specified VPC. Applicable for endpoints of type `Interface`.
    * Defaults to `false`.
    */
  val privateDnsEnabled: js.UndefOr[Input[Boolean]] = js.native
  /**
    * One or more route table IDs. Applicable for endpoints of type `Gateway`.
    */
  val routeTableIds: js.UndefOr[Input[js.Array[Input[String]]]] = js.native
  /**
    * The ID of one or more security groups to associate with the network interface. Required for endpoints of type `Interface`.
    */
  val securityGroupIds: js.UndefOr[Input[js.Array[Input[String]]]] = js.native
  /**
    * The service name, in the form `com.amazonaws.region.service` for AWS services.
    */
  val serviceName: Input[String] = js.native
  /**
    * The ID of one or more subnets in which to create a network interface for the endpoint. Applicable for endpoints of type `Interface`.
    */
  val subnetIds: js.UndefOr[Input[js.Array[Input[String]]]] = js.native
  /**
    * A mapping of tags to assign to the resource.
    */
  val tags: js.UndefOr[Input[StringDictionary[_]]] = js.native
  /**
    * The VPC endpoint type, `Gateway` or `Interface`. Defaults to `Gateway`.
    */
  val vpcEndpointType: js.UndefOr[Input[String]] = js.native
  /**
    * The ID of the VPC in which the endpoint will be used.
    */
  val vpcId: Input[String] = js.native
}

object VpcEndpointArgs {
  @scala.inline
  def apply(
    serviceName: Input[String],
    vpcId: Input[String],
    autoAccept: Input[Boolean] = null,
    policy: Input[String] = null,
    privateDnsEnabled: Input[Boolean] = null,
    routeTableIds: Input[js.Array[Input[String]]] = null,
    securityGroupIds: Input[js.Array[Input[String]]] = null,
    subnetIds: Input[js.Array[Input[String]]] = null,
    tags: Input[StringDictionary[_]] = null,
    vpcEndpointType: Input[String] = null
  ): VpcEndpointArgs = {
    val __obj = js.Dynamic.literal(serviceName = serviceName.asInstanceOf[js.Any], vpcId = vpcId.asInstanceOf[js.Any])
    if (autoAccept != null) __obj.updateDynamic("autoAccept")(autoAccept.asInstanceOf[js.Any])
    if (policy != null) __obj.updateDynamic("policy")(policy.asInstanceOf[js.Any])
    if (privateDnsEnabled != null) __obj.updateDynamic("privateDnsEnabled")(privateDnsEnabled.asInstanceOf[js.Any])
    if (routeTableIds != null) __obj.updateDynamic("routeTableIds")(routeTableIds.asInstanceOf[js.Any])
    if (securityGroupIds != null) __obj.updateDynamic("securityGroupIds")(securityGroupIds.asInstanceOf[js.Any])
    if (subnetIds != null) __obj.updateDynamic("subnetIds")(subnetIds.asInstanceOf[js.Any])
    if (tags != null) __obj.updateDynamic("tags")(tags.asInstanceOf[js.Any])
    if (vpcEndpointType != null) __obj.updateDynamic("vpcEndpointType")(vpcEndpointType.asInstanceOf[js.Any])
    __obj.asInstanceOf[VpcEndpointArgs]
  }
}

