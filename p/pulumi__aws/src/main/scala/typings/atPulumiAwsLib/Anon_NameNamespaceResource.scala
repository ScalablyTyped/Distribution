package typings
package atPulumiAwsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_NameNamespaceResource extends js.Object {
  var name: atPulumiPulumiLib.outputMod.Input[java.lang.String]
  var namespace: atPulumiPulumiLib.outputMod.Input[java.lang.String]
  var resource: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  var value: atPulumiPulumiLib.outputMod.Input[java.lang.String]
}

object Anon_NameNamespaceResource {
  @scala.inline
  def apply(
    name: atPulumiPulumiLib.outputMod.Input[java.lang.String],
    namespace: atPulumiPulumiLib.outputMod.Input[java.lang.String],
    value: atPulumiPulumiLib.outputMod.Input[java.lang.String],
    resource: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null
  ): Anon_NameNamespaceResource = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], namespace = namespace.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    if (resource != null) __obj.updateDynamic("resource")(resource.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_NameNamespaceResource]
  }
}

