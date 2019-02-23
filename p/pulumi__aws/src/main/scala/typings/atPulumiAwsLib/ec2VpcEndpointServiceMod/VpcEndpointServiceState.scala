package typings
package atPulumiAwsLib.ec2VpcEndpointServiceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VpcEndpointServiceState extends js.Object {
  /**
    * Whether or not VPC endpoint connection requests to the service must be accepted by the service owner - `true` or `false`.
    */
  val acceptanceRequired: js.UndefOr[atPulumiPulumiLib.outputMod.Input[scala.Boolean]] = js.undefined
  /**
    * The ARNs of one or more principals allowed to discover the endpoint service.
    */
  val allowedPrincipals: js.UndefOr[
    atPulumiPulumiLib.outputMod.Input[js.Array[atPulumiPulumiLib.outputMod.Input[java.lang.String]]]
  ] = js.undefined
  /**
    * The Availability Zones in which the service is available.
    */
  val availabilityZones: js.UndefOr[
    atPulumiPulumiLib.outputMod.Input[js.Array[atPulumiPulumiLib.outputMod.Input[java.lang.String]]]
  ] = js.undefined
  /**
    * The DNS names for the service.
    */
  val baseEndpointDnsNames: js.UndefOr[
    atPulumiPulumiLib.outputMod.Input[js.Array[atPulumiPulumiLib.outputMod.Input[java.lang.String]]]
  ] = js.undefined
  /**
    * The ARNs of one or more Network Load Balancers for the endpoint service.
    */
  val networkLoadBalancerArns: js.UndefOr[
    atPulumiPulumiLib.outputMod.Input[js.Array[atPulumiPulumiLib.outputMod.Input[java.lang.String]]]
  ] = js.undefined
  /**
    * The private DNS name for the service.
    */
  val privateDnsName: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    * The service name.
    */
  val serviceName: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    * The service type, `Gateway` or `Interface`.
    */
  val serviceType: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    * The state of the VPC endpoint service.
    */
  val state: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
}

