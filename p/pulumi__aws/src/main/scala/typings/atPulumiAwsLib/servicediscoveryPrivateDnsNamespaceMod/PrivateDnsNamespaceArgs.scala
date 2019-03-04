package typings
package atPulumiAwsLib.servicediscoveryPrivateDnsNamespaceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PrivateDnsNamespaceArgs extends js.Object {
  /**
    * The description that you specify for the namespace when you create it.
    */
  val description: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    * The name of the namespace.
    */
  val name: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    * The ID of VPC that you want to associate the namespace with.
    */
  val vpc: atPulumiPulumiLib.outputMod.Input[java.lang.String]
}

object PrivateDnsNamespaceArgs {
  @scala.inline
  def apply(
    vpc: atPulumiPulumiLib.outputMod.Input[java.lang.String],
    description: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null,
    name: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null
  ): PrivateDnsNamespaceArgs = {
    val __obj = js.Dynamic.literal(vpc = vpc.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    __obj.asInstanceOf[PrivateDnsNamespaceArgs]
  }
}

