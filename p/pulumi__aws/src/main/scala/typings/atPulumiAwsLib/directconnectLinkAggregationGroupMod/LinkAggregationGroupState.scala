package typings
package atPulumiAwsLib.directconnectLinkAggregationGroupMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LinkAggregationGroupState extends js.Object {
  /**
    * The ARN of the LAG.
    * * `jumbo_frame_capable` -Indicates whether jumbo frames (9001 MTU) are supported.
    */
  val arn: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    * The bandwidth of the individual physical connections bundled by the LAG. Available values: 1Gbps, 10Gbps. Case sensitive.
    */
  val connectionsBandwidth: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    * A boolean that indicates all connections associated with the LAG should be deleted so that the LAG can be destroyed without error. These objects are *not* recoverable.
    */
  val forceDestroy: js.UndefOr[atPulumiPulumiLib.outputMod.Input[scala.Boolean]] = js.undefined
  /**
    * Indicates whether the LAG supports a secondary BGP peer in the same address family (IPv4/IPv6).
    */
  val hasLogicalRedundancy: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  val jumboFrameCapable: js.UndefOr[atPulumiPulumiLib.outputMod.Input[scala.Boolean]] = js.undefined
  /**
    * The AWS Direct Connect location in which the LAG should be allocated. See [DescribeLocations](https://docs.aws.amazon.com/directconnect/latest/APIReference/API_DescribeLocations.html) for the list of AWS Direct Connect locations. Use `locationCode`.
    */
  val location: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    * The name of the LAG.
    */
  val name: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    * A mapping of tags to assign to the resource.
    */
  val tags: js.UndefOr[atPulumiPulumiLib.outputMod.Input[org.scalablytyped.runtime.StringDictionary[_]]] = js.undefined
}

object LinkAggregationGroupState {
  @scala.inline
  def apply(
    arn: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null,
    connectionsBandwidth: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null,
    forceDestroy: atPulumiPulumiLib.outputMod.Input[scala.Boolean] = null,
    hasLogicalRedundancy: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null,
    jumboFrameCapable: atPulumiPulumiLib.outputMod.Input[scala.Boolean] = null,
    location: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null,
    name: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null,
    tags: atPulumiPulumiLib.outputMod.Input[org.scalablytyped.runtime.StringDictionary[_]] = null
  ): LinkAggregationGroupState = {
    val __obj = js.Dynamic.literal()
    if (arn != null) __obj.updateDynamic("arn")(arn.asInstanceOf[js.Any])
    if (connectionsBandwidth != null) __obj.updateDynamic("connectionsBandwidth")(connectionsBandwidth.asInstanceOf[js.Any])
    if (forceDestroy != null) __obj.updateDynamic("forceDestroy")(forceDestroy.asInstanceOf[js.Any])
    if (hasLogicalRedundancy != null) __obj.updateDynamic("hasLogicalRedundancy")(hasLogicalRedundancy.asInstanceOf[js.Any])
    if (jumboFrameCapable != null) __obj.updateDynamic("jumboFrameCapable")(jumboFrameCapable.asInstanceOf[js.Any])
    if (location != null) __obj.updateDynamic("location")(location.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (tags != null) __obj.updateDynamic("tags")(tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[LinkAggregationGroupState]
  }
}

