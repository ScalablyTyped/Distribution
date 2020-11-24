package typings.pulumiAws.outputMod.sagemaker

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CodeRepositoryGitConfig extends js.Object {
  
  var branch: js.UndefOr[String] = js.native
  
  var repositoryUrl: String = js.native
  
  var secretArn: js.UndefOr[String] = js.native
}
object CodeRepositoryGitConfig {
  
  @scala.inline
  def apply(repositoryUrl: String): CodeRepositoryGitConfig = {
    val __obj = js.Dynamic.literal(repositoryUrl = repositoryUrl.asInstanceOf[js.Any])
    __obj.asInstanceOf[CodeRepositoryGitConfig]
  }
  
  @scala.inline
  implicit class CodeRepositoryGitConfigOps[Self <: CodeRepositoryGitConfig] (val x: Self) extends AnyVal {
    
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
    def setRepositoryUrl(value: String): Self = this.set("repositoryUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBranch(value: String): Self = this.set("branch", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBranch: Self = this.set("branch", js.undefined)
    
    @scala.inline
    def setSecretArn(value: String): Self = this.set("secretArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSecretArn: Self = this.set("secretArn", js.undefined)
  }
}
