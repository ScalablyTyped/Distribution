package typings.pulumiAws.codeRepositoryMod

import typings.pulumiAws.inputMod.sagemaker.CodeRepositoryGitConfig
import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CodeRepositoryArgs extends js.Object {
  
  val codeRepositoryName: Input[String] = js.native
  
  val gitConfig: Input[CodeRepositoryGitConfig] = js.native
}
object CodeRepositoryArgs {
  
  @scala.inline
  def apply(codeRepositoryName: Input[String], gitConfig: Input[CodeRepositoryGitConfig]): CodeRepositoryArgs = {
    val __obj = js.Dynamic.literal(codeRepositoryName = codeRepositoryName.asInstanceOf[js.Any], gitConfig = gitConfig.asInstanceOf[js.Any])
    __obj.asInstanceOf[CodeRepositoryArgs]
  }
  
  @scala.inline
  implicit class CodeRepositoryArgsOps[Self <: CodeRepositoryArgs] (val x: Self) extends AnyVal {
    
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
    def setCodeRepositoryName(value: Input[String]): Self = this.set("codeRepositoryName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGitConfig(value: Input[CodeRepositoryGitConfig]): Self = this.set("gitConfig", value.asInstanceOf[js.Any])
  }
}
