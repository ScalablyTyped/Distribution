package typings
package atPulumiAwsLib.worklinkFleetMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FleetArgs extends js.Object {
  /**
    * The ARN of the Amazon Kinesis data stream that receives the audit events.
    */
  val auditStreamArn: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
  /**
    * The certificate chain, including intermediate certificates and the root certificate authority certificate used to issue device certificates.
    */
  val deviceCaCertificate: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
  /**
    * The name of the fleet.
    */
  val displayName: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
  /**
    * Provide this to allow manage the identity provider configuration for the fleet. Fields documented below.
    */
  val identityProvider: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[atPulumiAwsLib.Anon_SamlMetadataType]] = js.undefined
  /**
    * A region-unique name for the AMI.
    */
  val name: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
  /**
    * Provide this to allow manage the company network configuration for the fleet. Fields documented below.
    */
  val network: js.UndefOr[
    atPulumiPulumiLib.resourceMod.Input[atPulumiAwsLib.Anon_SecurityGroupIdsSubnetIdsVpcIdArrayInputString]
  ] = js.undefined
  /**
    * The option to optimize for better performance by routing traffic through the closest AWS Region to users, which may be outside of your home Region. Defaults to `true`.
    */
  val optimizeForEndUserLocation: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[scala.Boolean]] = js.undefined
}

