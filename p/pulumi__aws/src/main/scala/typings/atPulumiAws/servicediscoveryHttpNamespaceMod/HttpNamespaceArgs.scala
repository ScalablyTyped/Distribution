package typings.atPulumiAws.servicediscoveryHttpNamespaceMod

import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HttpNamespaceArgs extends js.Object {
  /**
    * The description that you specify for the namespace when you create it.
    */
  val description: js.UndefOr[Input[String]] = js.native
  /**
    * The name of the http namespace.
    */
  val name: js.UndefOr[Input[String]] = js.native
}

object HttpNamespaceArgs {
  @scala.inline
  def apply(description: Input[String] = null, name: Input[String] = null): HttpNamespaceArgs = {
    val __obj = js.Dynamic.literal()
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    __obj.asInstanceOf[HttpNamespaceArgs]
  }
}

