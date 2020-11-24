package typings.pulumiAws.getPrebuiltEcrImageMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetPrebuiltEcrImageResult extends js.Object {
  
  val dnsSuffix: js.UndefOr[String] = js.native
  
  /**
    * The provider-assigned unique ID for this managed resource.
    */
  val id: String = js.native
  
  val imageTag: js.UndefOr[String] = js.native
  
  val region: js.UndefOr[String] = js.native
  
  /**
    * The account ID containing the image. For example, `469771592824`.
    */
  val registryId: String = js.native
  
  /**
    * The Docker image URL. For example, `341280168497.dkr.ecr.ca-central-1.amazonaws.com/sagemaker-sparkml-serving:2.4`.
    */
  val registryPath: String = js.native
  
  val repositoryName: String = js.native
}
object GetPrebuiltEcrImageResult {
  
  @scala.inline
  def apply(id: String, registryId: String, registryPath: String, repositoryName: String): GetPrebuiltEcrImageResult = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], registryId = registryId.asInstanceOf[js.Any], registryPath = registryPath.asInstanceOf[js.Any], repositoryName = repositoryName.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetPrebuiltEcrImageResult]
  }
  
  @scala.inline
  implicit class GetPrebuiltEcrImageResultOps[Self <: GetPrebuiltEcrImageResult] (val x: Self) extends AnyVal {
    
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
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRegistryId(value: String): Self = this.set("registryId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRegistryPath(value: String): Self = this.set("registryPath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRepositoryName(value: String): Self = this.set("repositoryName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDnsSuffix(value: String): Self = this.set("dnsSuffix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDnsSuffix: Self = this.set("dnsSuffix", js.undefined)
    
    @scala.inline
    def setImageTag(value: String): Self = this.set("imageTag", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteImageTag: Self = this.set("imageTag", js.undefined)
    
    @scala.inline
    def setRegion(value: String): Self = this.set("region", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRegion: Self = this.set("region", js.undefined)
  }
}
