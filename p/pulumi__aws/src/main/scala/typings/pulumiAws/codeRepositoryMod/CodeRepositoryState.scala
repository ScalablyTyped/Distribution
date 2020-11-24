package typings.pulumiAws.codeRepositoryMod

import typings.pulumiAws.inputMod.sagemaker.CodeRepositoryGitConfig
import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CodeRepositoryState extends js.Object {
  
  val arn: js.UndefOr[Input[String]] = js.native
  
  val codeRepositoryName: js.UndefOr[Input[String]] = js.native
  
  val gitConfig: js.UndefOr[Input[CodeRepositoryGitConfig]] = js.native
}
object CodeRepositoryState {
  
  @scala.inline
  def apply(): CodeRepositoryState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CodeRepositoryState]
  }
  
  @scala.inline
  implicit class CodeRepositoryStateOps[Self <: CodeRepositoryState] (val x: Self) extends AnyVal {
    
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
    def setCodeRepositoryName(value: Input[String]): Self = this.set("codeRepositoryName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCodeRepositoryName: Self = this.set("codeRepositoryName", js.undefined)
    
    @scala.inline
    def setGitConfig(value: Input[CodeRepositoryGitConfig]): Self = this.set("gitConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGitConfig: Self = this.set("gitConfig", js.undefined)
  }
}
