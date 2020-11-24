package typings.pulumiAws.inputMod.codeartifact

import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RepositoryExternalConnections extends js.Object {
  
  /**
    * The name of the external connection associated with a repository.
    */
  var externalConnectionName: Input[String] = js.native
  
  var packageFormat: js.UndefOr[Input[String]] = js.native
  
  var status: js.UndefOr[Input[String]] = js.native
}
object RepositoryExternalConnections {
  
  @scala.inline
  def apply(externalConnectionName: Input[String]): RepositoryExternalConnections = {
    val __obj = js.Dynamic.literal(externalConnectionName = externalConnectionName.asInstanceOf[js.Any])
    __obj.asInstanceOf[RepositoryExternalConnections]
  }
  
  @scala.inline
  implicit class RepositoryExternalConnectionsOps[Self <: RepositoryExternalConnections] (val x: Self) extends AnyVal {
    
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
    def setExternalConnectionName(value: Input[String]): Self = this.set("externalConnectionName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPackageFormat(value: Input[String]): Self = this.set("packageFormat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePackageFormat: Self = this.set("packageFormat", js.undefined)
    
    @scala.inline
    def setStatus(value: Input[String]): Self = this.set("status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStatus: Self = this.set("status", js.undefined)
  }
}
