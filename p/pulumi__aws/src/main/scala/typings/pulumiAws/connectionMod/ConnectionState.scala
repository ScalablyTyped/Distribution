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
    * The bandwidth of the connection. Valid values for dedicated connections: 1Gbps, 10Gbps. Valid values for hosted connections: 50Mbps, 100Mbps, 200Mbps, 300Mbps, 400Mbps, 500Mbps, 1Gbps, 2Gbps, 5Gbps and 10Gbps. Case sensitive.
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
    * A map of tags to assign to the resource.
    */
  val tags: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.native
}

object ConnectionState {
  @scala.inline
  def apply(): ConnectionState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConnectionState]
  }
  @scala.inline
  implicit class ConnectionStateOps[Self <: ConnectionState] (val x: Self) extends AnyVal {
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
    def setAwsDevice(value: Input[String]): Self = this.set("awsDevice", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAwsDevice: Self = this.set("awsDevice", js.undefined)
    @scala.inline
    def setBandwidth(value: Input[String]): Self = this.set("bandwidth", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBandwidth: Self = this.set("bandwidth", js.undefined)
    @scala.inline
    def setHasLogicalRedundancy(value: Input[String]): Self = this.set("hasLogicalRedundancy", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHasLogicalRedundancy: Self = this.set("hasLogicalRedundancy", js.undefined)
    @scala.inline
    def setJumboFrameCapable(value: Input[Boolean]): Self = this.set("jumboFrameCapable", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteJumboFrameCapable: Self = this.set("jumboFrameCapable", js.undefined)
    @scala.inline
    def setLocation(value: Input[String]): Self = this.set("location", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLocation: Self = this.set("location", js.undefined)
    @scala.inline
    def setName(value: Input[String]): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    @scala.inline
    def setTags(value: Input[StringDictionary[Input[String]]]): Self = this.set("tags", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTags: Self = this.set("tags", js.undefined)
  }
  
}

