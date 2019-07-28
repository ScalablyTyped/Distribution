package typings.atPulumiAws.appmeshVirtualServiceMod

import org.scalablytyped.runtime.StringDictionary
import typings.atPulumiAws.Anon_ProviderAnonVirtualNodeVirtualRouterAnonVirtualNodeNameInput
import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VirtualServiceArgs extends js.Object {
  /**
    * The name of the service mesh in which to create the virtual service.
    */
  val meshName: Input[String]
  /**
    * The name to use for the virtual service.
    */
  val name: js.UndefOr[Input[String]] = js.undefined
  /**
    * The virtual service specification to apply.
    */
  val spec: Input[Anon_ProviderAnonVirtualNodeVirtualRouterAnonVirtualNodeNameInput]
  /**
    * A mapping of tags to assign to the resource.
    */
  val tags: js.UndefOr[Input[StringDictionary[_]]] = js.undefined
}

object VirtualServiceArgs {
  @scala.inline
  def apply(
    meshName: Input[String],
    spec: Input[Anon_ProviderAnonVirtualNodeVirtualRouterAnonVirtualNodeNameInput],
    name: Input[String] = null,
    tags: Input[StringDictionary[_]] = null
  ): VirtualServiceArgs = {
    val __obj = js.Dynamic.literal(meshName = meshName.asInstanceOf[js.Any], spec = spec.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (tags != null) __obj.updateDynamic("tags")(tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[VirtualServiceArgs]
  }
}

