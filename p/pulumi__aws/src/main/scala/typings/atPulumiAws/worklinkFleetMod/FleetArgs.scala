package typings.atPulumiAws.worklinkFleetMod

import typings.atPulumiAws.typesInputMod.worklinkNs.FleetIdentityProvider
import typings.atPulumiAws.typesInputMod.worklinkNs.FleetNetwork
import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FleetArgs extends js.Object {
  /**
    * The ARN of the Amazon Kinesis data stream that receives the audit events.
    */
  val auditStreamArn: js.UndefOr[Input[String]] = js.undefined
  /**
    * The certificate chain, including intermediate certificates and the root certificate authority certificate used to issue device certificates.
    */
  val deviceCaCertificate: js.UndefOr[Input[String]] = js.undefined
  /**
    * The name of the fleet.
    */
  val displayName: js.UndefOr[Input[String]] = js.undefined
  /**
    * Provide this to allow manage the identity provider configuration for the fleet. Fields documented below.
    */
  val identityProvider: js.UndefOr[Input[FleetIdentityProvider]] = js.undefined
  /**
    * A region-unique name for the AMI.
    */
  val name: js.UndefOr[Input[String]] = js.undefined
  /**
    * Provide this to allow manage the company network configuration for the fleet. Fields documented below.
    */
  val network: js.UndefOr[Input[FleetNetwork]] = js.undefined
  /**
    * The option to optimize for better performance by routing traffic through the closest AWS Region to users, which may be outside of your home Region. Defaults to `true`.
    */
  val optimizeForEndUserLocation: js.UndefOr[Input[Boolean]] = js.undefined
}

object FleetArgs {
  @scala.inline
  def apply(
    auditStreamArn: Input[String] = null,
    deviceCaCertificate: Input[String] = null,
    displayName: Input[String] = null,
    identityProvider: Input[FleetIdentityProvider] = null,
    name: Input[String] = null,
    network: Input[FleetNetwork] = null,
    optimizeForEndUserLocation: Input[Boolean] = null
  ): FleetArgs = {
    val __obj = js.Dynamic.literal()
    if (auditStreamArn != null) __obj.updateDynamic("auditStreamArn")(auditStreamArn.asInstanceOf[js.Any])
    if (deviceCaCertificate != null) __obj.updateDynamic("deviceCaCertificate")(deviceCaCertificate.asInstanceOf[js.Any])
    if (displayName != null) __obj.updateDynamic("displayName")(displayName.asInstanceOf[js.Any])
    if (identityProvider != null) __obj.updateDynamic("identityProvider")(identityProvider.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (network != null) __obj.updateDynamic("network")(network.asInstanceOf[js.Any])
    if (optimizeForEndUserLocation != null) __obj.updateDynamic("optimizeForEndUserLocation")(optimizeForEndUserLocation.asInstanceOf[js.Any])
    __obj.asInstanceOf[FleetArgs]
  }
}

