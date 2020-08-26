package typings.pulumiAws.linkAggregationGroupMod

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LinkAggregationGroupState extends js.Object {
  /**
    * The ARN of the LAG.
    * * `jumboFrameCapable` -Indicates whether jumbo frames (9001 MTU) are supported.
    */
  val arn: js.UndefOr[Input[String]] = js.native
  /**
    * The bandwidth of the individual physical connections bundled by the LAG. Valid values: 50Mbps, 100Mbps, 200Mbps, 300Mbps, 400Mbps, 500Mbps, 1Gbps, 2Gbps, 5Gbps and 10Gbps. Case sensitive.
    */
  val connectionsBandwidth: js.UndefOr[Input[String]] = js.native
  /**
    * A boolean that indicates all connections associated with the LAG should be deleted so that the LAG can be destroyed without error. These objects are *not* recoverable.
    */
  val forceDestroy: js.UndefOr[Input[Boolean]] = js.native
  /**
    * Indicates whether the LAG supports a secondary BGP peer in the same address family (IPv4/IPv6).
    */
  val hasLogicalRedundancy: js.UndefOr[Input[String]] = js.native
  val jumboFrameCapable: js.UndefOr[Input[Boolean]] = js.native
  /**
    * The AWS Direct Connect location in which the LAG should be allocated. See [DescribeLocations](https://docs.aws.amazon.com/directconnect/latest/APIReference/API_DescribeLocations.html) for the list of AWS Direct Connect locations. Use `locationCode`.
    */
  val location: js.UndefOr[Input[String]] = js.native
  /**
    * The name of the LAG.
    */
  val name: js.UndefOr[Input[String]] = js.native
  /**
    * A map of tags to assign to the resource.
    */
  val tags: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.native
}

object LinkAggregationGroupState {
  @scala.inline
  def apply(): LinkAggregationGroupState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LinkAggregationGroupState]
  }
  @scala.inline
  implicit class LinkAggregationGroupStateOps[Self <: LinkAggregationGroupState] (val x: Self) extends AnyVal {
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
    def setConnectionsBandwidth(value: Input[String]): Self = this.set("connectionsBandwidth", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteConnectionsBandwidth: Self = this.set("connectionsBandwidth", js.undefined)
    @scala.inline
    def setForceDestroy(value: Input[Boolean]): Self = this.set("forceDestroy", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteForceDestroy: Self = this.set("forceDestroy", js.undefined)
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

