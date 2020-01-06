package typings.atPulumiAws.servicediscoveryPrivateDnsNamespaceMod

import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PrivateDnsNamespaceState extends js.Object {
  /**
    * The ARN that Amazon Route 53 assigns to the namespace when you create it.
    */
  val arn: js.UndefOr[Input[String]] = js.native
  /**
    * The description that you specify for the namespace when you create it.
    */
  val description: js.UndefOr[Input[String]] = js.native
  /**
    * The ID for the hosted zone that Amazon Route 53 creates when you create a namespace.
    */
  val hostedZone: js.UndefOr[Input[String]] = js.native
  /**
    * The name of the namespace.
    */
  val name: js.UndefOr[Input[String]] = js.native
  /**
    * The ID of VPC that you want to associate the namespace with.
    */
  val vpc: js.UndefOr[Input[String]] = js.native
}

object PrivateDnsNamespaceState {
  @scala.inline
  def apply(
    arn: Input[String] = null,
    description: Input[String] = null,
    hostedZone: Input[String] = null,
    name: Input[String] = null,
    vpc: Input[String] = null
  ): PrivateDnsNamespaceState = {
    val __obj = js.Dynamic.literal()
    if (arn != null) __obj.updateDynamic("arn")(arn.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (hostedZone != null) __obj.updateDynamic("hostedZone")(hostedZone.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (vpc != null) __obj.updateDynamic("vpc")(vpc.asInstanceOf[js.Any])
    __obj.asInstanceOf[PrivateDnsNamespaceState]
  }
}

