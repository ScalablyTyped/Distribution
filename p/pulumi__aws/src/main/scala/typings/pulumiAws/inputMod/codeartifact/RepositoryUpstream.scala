package typings.pulumiAws.inputMod.codeartifact

import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RepositoryUpstream extends js.Object {
  
  /**
    * The name of an upstream repository.
    */
  var repositoryName: Input[String] = js.native
}
object RepositoryUpstream {
  
  @scala.inline
  def apply(repositoryName: Input[String]): RepositoryUpstream = {
    val __obj = js.Dynamic.literal(repositoryName = repositoryName.asInstanceOf[js.Any])
    __obj.asInstanceOf[RepositoryUpstream]
  }
  
  @scala.inline
  implicit class RepositoryUpstreamOps[Self <: RepositoryUpstream] (val x: Self) extends AnyVal {
    
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
    def setRepositoryName(value: Input[String]): Self = this.set("repositoryName", value.asInstanceOf[js.Any])
  }
}
