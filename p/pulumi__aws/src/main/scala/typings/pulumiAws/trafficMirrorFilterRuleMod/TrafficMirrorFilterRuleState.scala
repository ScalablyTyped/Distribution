package typings.pulumiAws.trafficMirrorFilterRuleMod

import typings.pulumiAws.inputMod.ec2.TrafficMirrorFilterRuleDestinationPortRange
import typings.pulumiAws.inputMod.ec2.TrafficMirrorFilterRuleSourcePortRange
import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TrafficMirrorFilterRuleState extends js.Object {
  /**
    * A description of the traffic mirror filter rule.
    */
  val description: js.UndefOr[Input[String]] = js.native
  /**
    * The destination CIDR block to assign to the Traffic Mirror rule.
    */
  val destinationCidrBlock: js.UndefOr[Input[String]] = js.native
  /**
    * The destination port range. Supported only when the protocol is set to TCP(6) or UDP(17). See Traffic mirror port range documented below
    */
  val destinationPortRange: js.UndefOr[Input[TrafficMirrorFilterRuleDestinationPortRange]] = js.native
  /**
    * The protocol number, for example 17 (UDP), to assign to the Traffic Mirror rule. For information about the protocol value, see [Protocol Numbers](https://www.iana.org/assignments/protocol-numbers/protocol-numbers.xhtml) on the Internet Assigned Numbers Authority (IANA) website.
    */
  val protocol: js.UndefOr[Input[Double]] = js.native
  /**
    * The action to take (accept | reject) on the filtered traffic. Valid values are `accept` and `reject`
    */
  val ruleAction: js.UndefOr[Input[String]] = js.native
  /**
    * The number of the Traffic Mirror rule. This number must be unique for each Traffic Mirror rule in a given direction. The rules are processed in ascending order by rule number.
    */
  val ruleNumber: js.UndefOr[Input[Double]] = js.native
  /**
    * The source CIDR block to assign to the Traffic Mirror rule.
    */
  val sourceCidrBlock: js.UndefOr[Input[String]] = js.native
  /**
    * The source port range. Supported only when the protocol is set to TCP(6) or UDP(17). See Traffic mirror port range documented below
    */
  val sourcePortRange: js.UndefOr[Input[TrafficMirrorFilterRuleSourcePortRange]] = js.native
  /**
    * The direction of traffic to be captured. Valid values are `ingress` and `egress`
    */
  val trafficDirection: js.UndefOr[Input[String]] = js.native
  /**
    * ID of the traffic mirror filter to which this rule should be added
    */
  val trafficMirrorFilterId: js.UndefOr[Input[String]] = js.native
}

object TrafficMirrorFilterRuleState {
  @scala.inline
  def apply(): TrafficMirrorFilterRuleState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TrafficMirrorFilterRuleState]
  }
  @scala.inline
  implicit class TrafficMirrorFilterRuleStateOps[Self <: TrafficMirrorFilterRuleState] (val x: Self) extends AnyVal {
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
    def setDescription(value: Input[String]): Self = this.set("description", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
    @scala.inline
    def setDestinationCidrBlock(value: Input[String]): Self = this.set("destinationCidrBlock", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDestinationCidrBlock: Self = this.set("destinationCidrBlock", js.undefined)
    @scala.inline
    def setDestinationPortRange(value: Input[TrafficMirrorFilterRuleDestinationPortRange]): Self = this.set("destinationPortRange", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDestinationPortRange: Self = this.set("destinationPortRange", js.undefined)
    @scala.inline
    def setProtocol(value: Input[Double]): Self = this.set("protocol", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProtocol: Self = this.set("protocol", js.undefined)
    @scala.inline
    def setRuleAction(value: Input[String]): Self = this.set("ruleAction", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRuleAction: Self = this.set("ruleAction", js.undefined)
    @scala.inline
    def setRuleNumber(value: Input[Double]): Self = this.set("ruleNumber", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRuleNumber: Self = this.set("ruleNumber", js.undefined)
    @scala.inline
    def setSourceCidrBlock(value: Input[String]): Self = this.set("sourceCidrBlock", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSourceCidrBlock: Self = this.set("sourceCidrBlock", js.undefined)
    @scala.inline
    def setSourcePortRange(value: Input[TrafficMirrorFilterRuleSourcePortRange]): Self = this.set("sourcePortRange", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSourcePortRange: Self = this.set("sourcePortRange", js.undefined)
    @scala.inline
    def setTrafficDirection(value: Input[String]): Self = this.set("trafficDirection", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTrafficDirection: Self = this.set("trafficDirection", js.undefined)
    @scala.inline
    def setTrafficMirrorFilterId(value: Input[String]): Self = this.set("trafficMirrorFilterId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTrafficMirrorFilterId: Self = this.set("trafficMirrorFilterId", js.undefined)
  }
  
}

