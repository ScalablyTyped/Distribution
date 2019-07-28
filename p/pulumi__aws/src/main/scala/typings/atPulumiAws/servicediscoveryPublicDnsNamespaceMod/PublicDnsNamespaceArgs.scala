package typings.atPulumiAws.servicediscoveryPublicDnsNamespaceMod

import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PublicDnsNamespaceArgs extends js.Object {
  /**
    * The description that you specify for the namespace when you create it.
    */
  val description: js.UndefOr[Input[String]] = js.undefined
  /**
    * The name of the namespace.
    */
  val name: js.UndefOr[Input[String]] = js.undefined
}

object PublicDnsNamespaceArgs {
  @scala.inline
  def apply(description: Input[String] = null, name: Input[String] = null): PublicDnsNamespaceArgs = {
    val __obj = js.Dynamic.literal()
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    __obj.asInstanceOf[PublicDnsNamespaceArgs]
  }
}

