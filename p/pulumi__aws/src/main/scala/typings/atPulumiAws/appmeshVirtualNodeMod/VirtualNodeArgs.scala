package typings.atPulumiAws.appmeshVirtualNodeMod

import org.scalablytyped.runtime.StringDictionary
import typings.atPulumiAws.typesInputMod.appmeshNs.VirtualNodeSpec
import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VirtualNodeArgs extends js.Object {
  /**
    * The name of the service mesh in which to create the virtual node.
    */
  val meshName: Input[String]
  /**
    * The name to use for the virtual node.
    */
  val name: js.UndefOr[Input[String]] = js.undefined
  /**
    * The virtual node specification to apply.
    */
  val spec: Input[VirtualNodeSpec]
  /**
    * A mapping of tags to assign to the resource.
    */
  val tags: js.UndefOr[Input[StringDictionary[_]]] = js.undefined
}

object VirtualNodeArgs {
  @scala.inline
  def apply(
    meshName: Input[String],
    spec: Input[VirtualNodeSpec],
    name: Input[String] = null,
    tags: Input[StringDictionary[_]] = null
  ): VirtualNodeArgs = {
    val __obj = js.Dynamic.literal(meshName = meshName.asInstanceOf[js.Any], spec = spec.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (tags != null) __obj.updateDynamic("tags")(tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[VirtualNodeArgs]
  }
}

