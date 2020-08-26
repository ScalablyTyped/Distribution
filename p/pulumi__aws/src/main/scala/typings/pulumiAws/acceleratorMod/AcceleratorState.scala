package typings.pulumiAws.acceleratorMod

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiAws.inputMod.globalaccelerator.AcceleratorAttributes
import typings.pulumiAws.inputMod.globalaccelerator.AcceleratorIpSet
import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AcceleratorState extends js.Object {
  /**
    * The attributes of the accelerator. Fields documented below.
    */
  val attributes: js.UndefOr[Input[AcceleratorAttributes]] = js.native
  /**
    * The DNS name of the accelerator. For example, `a5d53ff5ee6bca4ce.awsglobalaccelerator.com`.
    * * `hostedZoneId` --  The Global Accelerator Route 53 zone ID that can be used to
    * route an [Alias Resource Record Set](https://docs.aws.amazon.com/Route53/latest/APIReference/API_AliasTarget.html) to the Global Accelerator. This attribute
    * is simply an alias for the zone ID `Z2BJ6XQ5FK7U4H`.
    */
  val dnsName: js.UndefOr[Input[String]] = js.native
  /**
    * Indicates whether the accelerator is enabled. The value is true or false. The default value is true.
    */
  val enabled: js.UndefOr[Input[Boolean]] = js.native
  val hostedZoneId: js.UndefOr[Input[String]] = js.native
  /**
    * The value for the address type must be `IPV4`.
    */
  val ipAddressType: js.UndefOr[Input[String]] = js.native
  /**
    * IP address set associated with the accelerator.
    */
  val ipSets: js.UndefOr[Input[js.Array[Input[AcceleratorIpSet]]]] = js.native
  /**
    * The name of the accelerator.
    */
  val name: js.UndefOr[Input[String]] = js.native
  /**
    * A map of tags to assign to the resource.
    */
  val tags: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.native
}

object AcceleratorState {
  @scala.inline
  def apply(): AcceleratorState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AcceleratorState]
  }
  @scala.inline
  implicit class AcceleratorStateOps[Self <: AcceleratorState] (val x: Self) extends AnyVal {
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
    def setAttributes(value: Input[AcceleratorAttributes]): Self = this.set("attributes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAttributes: Self = this.set("attributes", js.undefined)
    @scala.inline
    def setDnsName(value: Input[String]): Self = this.set("dnsName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDnsName: Self = this.set("dnsName", js.undefined)
    @scala.inline
    def setEnabled(value: Input[Boolean]): Self = this.set("enabled", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnabled: Self = this.set("enabled", js.undefined)
    @scala.inline
    def setHostedZoneId(value: Input[String]): Self = this.set("hostedZoneId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHostedZoneId: Self = this.set("hostedZoneId", js.undefined)
    @scala.inline
    def setIpAddressType(value: Input[String]): Self = this.set("ipAddressType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIpAddressType: Self = this.set("ipAddressType", js.undefined)
    @scala.inline
    def setIpSetsVarargs(value: Input[AcceleratorIpSet]*): Self = this.set("ipSets", js.Array(value :_*))
    @scala.inline
    def setIpSets(value: Input[js.Array[Input[AcceleratorIpSet]]]): Self = this.set("ipSets", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIpSets: Self = this.set("ipSets", js.undefined)
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

