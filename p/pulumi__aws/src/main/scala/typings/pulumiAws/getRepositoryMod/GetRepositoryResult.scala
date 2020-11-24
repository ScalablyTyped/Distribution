package typings.pulumiAws.getRepositoryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetRepositoryResult extends js.Object {
  
  /**
    * The ARN of the repository
    */
  val arn: String = js.native
  
  /**
    * The URL to use for cloning the repository over HTTPS.
    */
  val cloneUrlHttp: String = js.native
  
  /**
    * The URL to use for cloning the repository over SSH.
    */
  val cloneUrlSsh: String = js.native
  
  /**
    * The provider-assigned unique ID for this managed resource.
    */
  val id: String = js.native
  
  /**
    * The ID of the repository
    */
  val repositoryId: String = js.native
  
  val repositoryName: String = js.native
}
object GetRepositoryResult {
  
  @scala.inline
  def apply(
    arn: String,
    cloneUrlHttp: String,
    cloneUrlSsh: String,
    id: String,
    repositoryId: String,
    repositoryName: String
  ): GetRepositoryResult = {
    val __obj = js.Dynamic.literal(arn = arn.asInstanceOf[js.Any], cloneUrlHttp = cloneUrlHttp.asInstanceOf[js.Any], cloneUrlSsh = cloneUrlSsh.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], repositoryId = repositoryId.asInstanceOf[js.Any], repositoryName = repositoryName.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetRepositoryResult]
  }
  
  @scala.inline
  implicit class GetRepositoryResultOps[Self <: GetRepositoryResult] (val x: Self) extends AnyVal {
    
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
    def setArn(value: String): Self = this.set("arn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCloneUrlHttp(value: String): Self = this.set("cloneUrlHttp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCloneUrlSsh(value: String): Self = this.set("cloneUrlSsh", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRepositoryId(value: String): Self = this.set("repositoryId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRepositoryName(value: String): Self = this.set("repositoryName", value.asInstanceOf[js.Any])
  }
}
