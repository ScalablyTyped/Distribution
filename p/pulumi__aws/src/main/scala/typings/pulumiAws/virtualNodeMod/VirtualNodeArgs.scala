package typings.pulumiAws.virtualNodeMod

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiAws.inputMod.appmesh.VirtualNodeSpec
import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait VirtualNodeArgs extends js.Object {
  /**
    * The name of the service mesh in which to create the virtual node.
    */
  val meshName: Input[String] = js.native
  /**
    * The name to use for the virtual node.
    */
  val name: js.UndefOr[Input[String]] = js.native
  /**
    * The virtual node specification to apply.
    */
  val spec: Input[VirtualNodeSpec] = js.native
  /**
    * A map of tags to assign to the resource.
    */
  val tags: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.native
}

object VirtualNodeArgs {
  @scala.inline
  def apply(meshName: Input[String], spec: Input[VirtualNodeSpec]): VirtualNodeArgs = {
    val __obj = js.Dynamic.literal(meshName = meshName.asInstanceOf[js.Any], spec = spec.asInstanceOf[js.Any])
    __obj.asInstanceOf[VirtualNodeArgs]
  }
  @scala.inline
  implicit class VirtualNodeArgsOps[Self <: VirtualNodeArgs] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setMeshName(value: Input[String]): Self = this.set("meshName", value.asInstanceOf[js.Any])
    @scala.inline
    def setSpec(value: Input[VirtualNodeSpec]): Self = this.set("spec", value.asInstanceOf[js.Any])
    @scala.inline
    def setName(value: Input[String]): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    @scala.inline
    def setTags(value: Input[StringDictionary[Input[String]]]): Self = this.set("tags", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTags: Self = this.set("tags", js.undefined)
  }
  
}

