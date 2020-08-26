package typings.pulumiAws.worklinkFleetMod

import typings.pulumiAws.inputMod.worklink.FleetIdentityProvider
import typings.pulumiAws.inputMod.worklink.FleetNetwork
import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FleetState extends js.Object {
  /**
    * The ARN of the created WorkLink Fleet.
    */
  val arn: js.UndefOr[Input[String]] = js.native
  /**
    * The ARN of the Amazon Kinesis data stream that receives the audit events.
    */
  val auditStreamArn: js.UndefOr[Input[String]] = js.native
  /**
    * The identifier used by users to sign in to the Amazon WorkLink app.
    */
  val companyCode: js.UndefOr[Input[String]] = js.native
  /**
    * The time that the fleet was created.
    */
  val createdTime: js.UndefOr[Input[String]] = js.native
  /**
    * The certificate chain, including intermediate certificates and the root certificate authority certificate used to issue device certificates.
    */
  val deviceCaCertificate: js.UndefOr[Input[String]] = js.native
  /**
    * The name of the fleet.
    */
  val displayName: js.UndefOr[Input[String]] = js.native
  /**
    * Provide this to allow manage the identity provider configuration for the fleet. Fields documented below.
    */
  val identityProvider: js.UndefOr[Input[FleetIdentityProvider]] = js.native
  /**
    * The time that the fleet was last updated.
    */
  val lastUpdatedTime: js.UndefOr[Input[String]] = js.native
  /**
    * A region-unique name for the AMI.
    */
  val name: js.UndefOr[Input[String]] = js.native
  /**
    * Provide this to allow manage the company network configuration for the fleet. Fields documented below.
    */
  val network: js.UndefOr[Input[FleetNetwork]] = js.native
  /**
    * The option to optimize for better performance by routing traffic through the closest AWS Region to users, which may be outside of your home Region. Defaults to `true`.
    */
  val optimizeForEndUserLocation: js.UndefOr[Input[Boolean]] = js.native
}

object FleetState {
  @scala.inline
  def apply(): FleetState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FleetState]
  }
  @scala.inline
  implicit class FleetStateOps[Self <: FleetState] (val x: Self) extends AnyVal {
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
    def setAuditStreamArn(value: Input[String]): Self = this.set("auditStreamArn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAuditStreamArn: Self = this.set("auditStreamArn", js.undefined)
    @scala.inline
    def setCompanyCode(value: Input[String]): Self = this.set("companyCode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCompanyCode: Self = this.set("companyCode", js.undefined)
    @scala.inline
    def setCreatedTime(value: Input[String]): Self = this.set("createdTime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCreatedTime: Self = this.set("createdTime", js.undefined)
    @scala.inline
    def setDeviceCaCertificate(value: Input[String]): Self = this.set("deviceCaCertificate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDeviceCaCertificate: Self = this.set("deviceCaCertificate", js.undefined)
    @scala.inline
    def setDisplayName(value: Input[String]): Self = this.set("displayName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDisplayName: Self = this.set("displayName", js.undefined)
    @scala.inline
    def setIdentityProvider(value: Input[FleetIdentityProvider]): Self = this.set("identityProvider", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIdentityProvider: Self = this.set("identityProvider", js.undefined)
    @scala.inline
    def setLastUpdatedTime(value: Input[String]): Self = this.set("lastUpdatedTime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLastUpdatedTime: Self = this.set("lastUpdatedTime", js.undefined)
    @scala.inline
    def setName(value: Input[String]): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    @scala.inline
    def setNetwork(value: Input[FleetNetwork]): Self = this.set("network", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNetwork: Self = this.set("network", js.undefined)
    @scala.inline
    def setOptimizeForEndUserLocation(value: Input[Boolean]): Self = this.set("optimizeForEndUserLocation", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOptimizeForEndUserLocation: Self = this.set("optimizeForEndUserLocation", js.undefined)
  }
  
}

