package typings.pulumiAws.connectionMod

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ConnectionState extends js.Object {
  /**
    * The ARN of the connection.
    */
  val arn: js.UndefOr[Input[String]] = js.native
  /**
    * The Direct Connect endpoint on which the physical connection terminates.
    */
  val awsDevice: js.UndefOr[Input[String]] = js.native
  /**
    * The bandwidth of the connection. Available values: 1Gbps, 10Gbps. Case sensitive.
    */
  val bandwidth: js.UndefOr[Input[String]] = js.native
  /**
    * Indicates whether the connection supports a secondary BGP peer in the same address family (IPv4/IPv6).
    */
  val hasLogicalRedundancy: js.UndefOr[Input[String]] = js.native
  /**
    * Boolean value representing if jumbo frames have been enabled for this connection.
    */
  val jumboFrameCapable: js.UndefOr[Input[Boolean]] = js.native
  /**
    * The AWS Direct Connect location where the connection is located. See [DescribeLocations](https://docs.aws.amazon.com/directconnect/latest/APIReference/API_DescribeLocations.html) for the list of AWS Direct Connect locations. Use `locationCode`.
    */
  val location: js.UndefOr[Input[String]] = js.native
  /**
    * The name of the connection.
    */
  val name: js.UndefOr[Input[String]] = js.native
  /**
    * A mapping of tags to assign to the resource.
    */
  val tags: js.UndefOr[Input[StringDictionary[_]]] = js.native
}

object ConnectionState {
  @scala.inline
  def apply(
    arn: Input[String] = null,
    awsDevice: Input[String] = null,
    bandwidth: Input[String] = null,
    hasLogicalRedundancy: Input[String] = null,
    jumboFrameCapable: Input[Boolean] = null,
    location: Input[String] = null,
    name: Input[String] = null,
    tags: Input[StringDictionary[_]] = null
  ): ConnectionState = {
    val __obj = js.Dynamic.literal()
    if (arn != null) __obj.updateDynamic("arn")(arn.asInstanceOf[js.Any])
    if (awsDevice != null) __obj.updateDynamic("awsDevice")(awsDevice.asInstanceOf[js.Any])
    if (bandwidth != null) __obj.updateDynamic("bandwidth")(bandwidth.asInstanceOf[js.Any])
    if (hasLogicalRedundancy != null) __obj.updateDynamic("hasLogicalRedundancy")(hasLogicalRedundancy.asInstanceOf[js.Any])
    if (jumboFrameCapable != null) __obj.updateDynamic("jumboFrameCapable")(jumboFrameCapable.asInstanceOf[js.Any])
    if (location != null) __obj.updateDynamic("location")(location.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (tags != null) __obj.updateDynamic("tags")(tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConnectionState]
  }
}

