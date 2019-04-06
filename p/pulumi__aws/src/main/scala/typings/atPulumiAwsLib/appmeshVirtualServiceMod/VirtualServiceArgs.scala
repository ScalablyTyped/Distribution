package typings
package atPulumiAwsLib.appmeshVirtualServiceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VirtualServiceArgs extends js.Object {
  /**
    * The name of the service mesh in which to create the virtual service.
    */
  val meshName: atPulumiPulumiLib.outputMod.Input[java.lang.String]
  /**
    * The name to use for the virtual service.
    */
  val name: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    * The virtual service specification to apply.
    */
  val spec: atPulumiPulumiLib.outputMod.Input[atPulumiAwsLib.Anon_ProviderAnonVirtualNodeVirtualRouterAnonVirtualNodeNameInput]
}

object VirtualServiceArgs {
  @scala.inline
  def apply(
    meshName: atPulumiPulumiLib.outputMod.Input[java.lang.String],
    spec: atPulumiPulumiLib.outputMod.Input[atPulumiAwsLib.Anon_ProviderAnonVirtualNodeVirtualRouterAnonVirtualNodeNameInput],
    name: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null
  ): VirtualServiceArgs = {
    val __obj = js.Dynamic.literal(meshName = meshName.asInstanceOf[js.Any], spec = spec.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    __obj.asInstanceOf[VirtualServiceArgs]
  }
}

