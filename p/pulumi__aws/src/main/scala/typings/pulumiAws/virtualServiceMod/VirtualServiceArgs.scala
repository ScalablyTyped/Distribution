package typings.pulumiAws.virtualServiceMod

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiAws.inputMod.appmesh.VirtualServiceSpec
import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait VirtualServiceArgs extends js.Object {
  /**
    * The name of the service mesh in which to create the virtual service.
    */
  val meshName: Input[String] = js.native
  /**
    * The name to use for the virtual service.
    */
  val name: js.UndefOr[Input[String]] = js.native
  /**
    * The virtual service specification to apply.
    */
  val spec: Input[VirtualServiceSpec] = js.native
  /**
    * A mapping of tags to assign to the resource.
    */
  val tags: js.UndefOr[Input[StringDictionary[_]]] = js.native
}

object VirtualServiceArgs {
  @scala.inline
  def apply(
    meshName: Input[String],
    spec: Input[VirtualServiceSpec],
    name: Input[String] = null,
    tags: Input[StringDictionary[_]] = null
  ): VirtualServiceArgs = {
    val __obj = js.Dynamic.literal(meshName = meshName.asInstanceOf[js.Any], spec = spec.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (tags != null) __obj.updateDynamic("tags")(tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[VirtualServiceArgs]
  }
}

