package typings.pulumiAws.workspacesGetImageMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetImageResult extends js.Object {
  
  /**
    * The description of the image.
    */
  val description: String = js.native
  
  /**
    * The provider-assigned unique ID for this managed resource.
    */
  val id: String = js.native
  
  val imageId: String = js.native
  
  /**
    * The name of the image.
    */
  val name: String = js.native
  
  val operatingSystemType: String = js.native
  
  /**
    * Specifies whether the image is running on dedicated hardware. When Bring Your Own License (BYOL) is enabled, this value is set to DEDICATED. For more information, see [Bring Your Own Windows Desktop Images](https://docs.aws.amazon.com/workspaces/latest/adminguide/byol-windows-images.html).
    */
  val requiredTenancy: String = js.native
  
  /**
    * The status of the image.
    */
  val state: String = js.native
}
object GetImageResult {
  
  @scala.inline
  def apply(
    description: String,
    id: String,
    imageId: String,
    name: String,
    operatingSystemType: String,
    requiredTenancy: String,
    state: String
  ): GetImageResult = {
    val __obj = js.Dynamic.literal(description = description.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], imageId = imageId.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], operatingSystemType = operatingSystemType.asInstanceOf[js.Any], requiredTenancy = requiredTenancy.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetImageResult]
  }
  
  @scala.inline
  implicit class GetImageResultOps[Self <: GetImageResult] (val x: Self) extends AnyVal {
    
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
    def setDescription(value: String): Self = this.set("description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImageId(value: String): Self = this.set("imageId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOperatingSystemType(value: String): Self = this.set("operatingSystemType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequiredTenancy(value: String): Self = this.set("requiredTenancy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setState(value: String): Self = this.set("state", value.asInstanceOf[js.Any])
  }
}
