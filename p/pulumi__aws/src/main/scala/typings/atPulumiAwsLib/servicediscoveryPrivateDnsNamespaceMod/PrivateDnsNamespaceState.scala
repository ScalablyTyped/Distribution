package typings
package atPulumiAwsLib.servicediscoveryPrivateDnsNamespaceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PrivateDnsNamespaceState extends js.Object {
  /**
    * The ARN that Amazon Route 53 assigns to the namespace when you create it.
    */
  val arn: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    * The description that you specify for the namespace when you create it.
    */
  val description: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    * The ID for the hosted zone that Amazon Route 53 creates when you create a namespace.
    */
  val hostedZone: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    * The name of the namespace.
    */
  val name: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    * The ID of VPC that you want to associate the namespace with.
    */
  val vpc: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
}

