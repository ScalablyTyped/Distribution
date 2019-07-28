package typings.atPulumiAws

import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_NameNamespaceResource extends js.Object {
  var name: Input[String]
  var namespace: Input[String]
  var resource: js.UndefOr[Input[String]] = js.undefined
  var value: Input[String]
}

object Anon_NameNamespaceResource {
  @scala.inline
  def apply(
    name: Input[String],
    namespace: Input[String],
    value: Input[String],
    resource: Input[String] = null
  ): Anon_NameNamespaceResource = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], namespace = namespace.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    if (resource != null) __obj.updateDynamic("resource")(resource.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_NameNamespaceResource]
  }
}

