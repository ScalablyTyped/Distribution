package typings.pulumiAws.outputMod.codeartifact

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RepositoryExternalConnections extends js.Object {
  
  /**
    * The name of the external connection associated with a repository.
    */
  var externalConnectionName: String = js.native
  
  var packageFormat: String = js.native
  
  var status: String = js.native
}
object RepositoryExternalConnections {
  
  @scala.inline
  def apply(externalConnectionName: String, packageFormat: String, status: String): RepositoryExternalConnections = {
    val __obj = js.Dynamic.literal(externalConnectionName = externalConnectionName.asInstanceOf[js.Any], packageFormat = packageFormat.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
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
    def setExternalConnectionName(value: String): Self = this.set("externalConnectionName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPackageFormat(value: String): Self = this.set("packageFormat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatus(value: String): Self = this.set("status", value.asInstanceOf[js.Any])
  }
}
