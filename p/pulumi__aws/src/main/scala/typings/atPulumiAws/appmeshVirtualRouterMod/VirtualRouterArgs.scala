package typings.atPulumiAws.appmeshVirtualRouterMod

import org.scalablytyped.runtime.StringDictionary
import typings.atPulumiAws.typesInputMod.appmesh.VirtualRouterSpec
import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VirtualRouterArgs extends js.Object {
  /**
    * The name of the service mesh in which to create the virtual router.
    */
  val meshName: Input[String]
  /**
    * The name to use for the virtual router.
    */
  val name: js.UndefOr[Input[String]] = js.undefined
  /**
    * The virtual router specification to apply.
    */
  val spec: Input[VirtualRouterSpec]
  /**
    * A mapping of tags to assign to the resource.
    */
  val tags: js.UndefOr[Input[StringDictionary[_]]] = js.undefined
}

object VirtualRouterArgs {
  @scala.inline
  def apply(
    meshName: Input[String],
    spec: Input[VirtualRouterSpec],
    name: Input[String] = null,
    tags: Input[StringDictionary[_]] = null
  ): VirtualRouterArgs = {
    val __obj = js.Dynamic.literal(meshName = meshName.asInstanceOf[js.Any], spec = spec.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (tags != null) __obj.updateDynamic("tags")(tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[VirtualRouterArgs]
  }
}

