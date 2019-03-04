package typings
package atPulumiAwsLib.appmeshVirtualNodeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VirtualNodeArgs extends js.Object {
  /**
    * The name of the service mesh in which to create the virtual node.
    */
  val meshName: atPulumiPulumiLib.outputMod.Input[java.lang.String]
  /**
    * The name to use for the virtual node.
    */
  val name: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    * The virtual node specification to apply.
    */
  val spec: atPulumiPulumiLib.outputMod.Input[atPulumiAwsLib.Anon_BackendsListener]
}

object VirtualNodeArgs {
  @scala.inline
  def apply(
    meshName: atPulumiPulumiLib.outputMod.Input[java.lang.String],
    spec: atPulumiPulumiLib.outputMod.Input[atPulumiAwsLib.Anon_BackendsListener],
    name: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null
  ): VirtualNodeArgs = {
    val __obj = js.Dynamic.literal(meshName = meshName.asInstanceOf[js.Any], spec = spec.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    __obj.asInstanceOf[VirtualNodeArgs]
  }
}

