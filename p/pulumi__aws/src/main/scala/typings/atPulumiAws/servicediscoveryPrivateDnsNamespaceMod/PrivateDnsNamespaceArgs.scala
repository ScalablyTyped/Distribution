package typings.atPulumiAws.servicediscoveryPrivateDnsNamespaceMod

import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PrivateDnsNamespaceArgs extends js.Object {
  /**
    * The description that you specify for the namespace when you create it.
    */
  val description: js.UndefOr[Input[String]] = js.undefined
  /**
    * The name of the namespace.
    */
  val name: js.UndefOr[Input[String]] = js.undefined
  /**
    * The ID of VPC that you want to associate the namespace with.
    */
  val vpc: Input[String]
}

object PrivateDnsNamespaceArgs {
  @scala.inline
  def apply(vpc: Input[String], description: Input[String] = null, name: Input[String] = null): PrivateDnsNamespaceArgs = {
    val __obj = js.Dynamic.literal(vpc = vpc.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    __obj.asInstanceOf[PrivateDnsNamespaceArgs]
  }
}

