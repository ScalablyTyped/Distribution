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
  def apply(
    description: Input[String] = null,
    destinationCidrBlock: Input[String] = null,
    destinationPortRange: Input[TrafficMirrorFilterRuleDestinationPortRange] = null,
    protocol: Input[Double] = null,
    ruleAction: Input[String] = null,
    ruleNumber: Input[Double] = null,
    sourceCidrBlock: Input[String] = null,
    sourcePortRange: Input[TrafficMirrorFilterRuleSourcePortRange] = null,
    trafficDirection: Input[String] = null,
    trafficMirrorFilterId: Input[String] = null
  ): TrafficMirrorFilterRuleState = {
    val __obj = js.Dynamic.literal()
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (destinationCidrBlock != null) __obj.updateDynamic("destinationCidrBlock")(destinationCidrBlock.asInstanceOf[js.Any])
    if (destinationPortRange != null) __obj.updateDynamic("destinationPortRange")(destinationPortRange.asInstanceOf[js.Any])
    if (protocol != null) __obj.updateDynamic("protocol")(protocol.asInstanceOf[js.Any])
    if (ruleAction != null) __obj.updateDynamic("ruleAction")(ruleAction.asInstanceOf[js.Any])
    if (ruleNumber != null) __obj.updateDynamic("ruleNumber")(ruleNumber.asInstanceOf[js.Any])
    if (sourceCidrBlock != null) __obj.updateDynamic("sourceCidrBlock")(sourceCidrBlock.asInstanceOf[js.Any])
    if (sourcePortRange != null) __obj.updateDynamic("sourcePortRange")(sourcePortRange.asInstanceOf[js.Any])
    if (trafficDirection != null) __obj.updateDynamic("trafficDirection")(trafficDirection.asInstanceOf[js.Any])
    if (trafficMirrorFilterId != null) __obj.updateDynamic("trafficMirrorFilterId")(trafficMirrorFilterId.asInstanceOf[js.Any])
    __obj.asInstanceOf[TrafficMirrorFilterRuleState]
  }
}

