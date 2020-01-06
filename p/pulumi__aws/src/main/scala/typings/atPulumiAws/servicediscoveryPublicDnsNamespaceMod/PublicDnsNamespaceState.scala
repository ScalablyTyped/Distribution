package typings.atPulumiAws.servicediscoveryPublicDnsNamespaceMod

import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PublicDnsNamespaceState extends js.Object {
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
}

object PublicDnsNamespaceState {
  @scala.inline
  def apply(
    arn: Input[String] = null,
    description: Input[String] = null,
    hostedZone: Input[String] = null,
    name: Input[String] = null
  ): PublicDnsNamespaceState = {
    val __obj = js.Dynamic.literal()
    if (arn != null) __obj.updateDynamic("arn")(arn.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (hostedZone != null) __obj.updateDynamic("hostedZone")(hostedZone.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    __obj.asInstanceOf[PublicDnsNamespaceState]
  }
}

