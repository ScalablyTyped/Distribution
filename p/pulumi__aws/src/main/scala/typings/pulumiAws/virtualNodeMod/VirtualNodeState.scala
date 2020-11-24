package typings.pulumiAws.virtualNodeMod

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiAws.inputMod.appmesh.VirtualNodeSpec
import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait VirtualNodeState extends js.Object {
  
  /**
    * The ARN of the virtual node.
    */
  val arn: js.UndefOr[Input[String]] = js.native
  
  /**
    * The creation date of the virtual node.
    */
  val createdDate: js.UndefOr[Input[String]] = js.native
  
  /**
    * The last update date of the virtual node.
    */
  val lastUpdatedDate: js.UndefOr[Input[String]] = js.native
  
  /**
    * The name of the service mesh in which to create the virtual node. Must be between 1 and 255 characters in length.
    */
  val meshName: js.UndefOr[Input[String]] = js.native
  
  /**
    * The AWS account ID of the service mesh's owner. Defaults to the account ID the [AWS provider](https://www.terraform.io/docs/providers/aws/index.html) is currently connected to.
    */
  val meshOwner: js.UndefOr[Input[String]] = js.native
  
  /**
    * The name to use for the virtual node. Must be between 1 and 255 characters in length.
    */
  val name: js.UndefOr[Input[String]] = js.native
  
  /**
    * The resource owner's AWS account ID.
    */
  val resourceOwner: js.UndefOr[Input[String]] = js.native
  
  /**
    * The virtual node specification to apply.
    */
  val spec: js.UndefOr[Input[VirtualNodeSpec]] = js.native
  
  /**
    * A map of tags to assign to the resource.
    */
  val tags: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.native
}
object VirtualNodeState {
  
  @scala.inline
  def apply(): VirtualNodeState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VirtualNodeState]
  }
  
  @scala.inline
  implicit class VirtualNodeStateOps[Self <: VirtualNodeState] (val x: Self) extends AnyVal {
    
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
    def setArn(value: Input[String]): Self = this.set("arn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteArn: Self = this.set("arn", js.undefined)
    
    @scala.inline
    def setCreatedDate(value: Input[String]): Self = this.set("createdDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCreatedDate: Self = this.set("createdDate", js.undefined)
    
    @scala.inline
    def setLastUpdatedDate(value: Input[String]): Self = this.set("lastUpdatedDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLastUpdatedDate: Self = this.set("lastUpdatedDate", js.undefined)
    
    @scala.inline
    def setMeshName(value: Input[String]): Self = this.set("meshName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMeshName: Self = this.set("meshName", js.undefined)
    
    @scala.inline
    def setMeshOwner(value: Input[String]): Self = this.set("meshOwner", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMeshOwner: Self = this.set("meshOwner", js.undefined)
    
    @scala.inline
    def setName(value: Input[String]): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setResourceOwner(value: Input[String]): Self = this.set("resourceOwner", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResourceOwner: Self = this.set("resourceOwner", js.undefined)
    
    @scala.inline
    def setSpec(value: Input[VirtualNodeSpec]): Self = this.set("spec", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSpec: Self = this.set("spec", js.undefined)
    
    @scala.inline
    def setTags(value: Input[StringDictionary[Input[String]]]): Self = this.set("tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTags: Self = this.set("tags", js.undefined)
  }
}
