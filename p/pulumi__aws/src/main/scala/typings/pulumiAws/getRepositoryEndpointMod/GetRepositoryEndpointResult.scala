package typings.pulumiAws.getRepositoryEndpointMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetRepositoryEndpointResult extends js.Object {
  
  val domain: String = js.native
  
  val domainOwner: String = js.native
  
  val format: String = js.native
  
  /**
    * The provider-assigned unique ID for this managed resource.
    */
  val id: String = js.native
  
  val repository: String = js.native
  
  /**
    * The URL of the returned endpoint.
    */
  val repositoryEndpoint: String = js.native
}
object GetRepositoryEndpointResult {
  
  @scala.inline
  def apply(
    domain: String,
    domainOwner: String,
    format: String,
    id: String,
    repository: String,
    repositoryEndpoint: String
  ): GetRepositoryEndpointResult = {
    val __obj = js.Dynamic.literal(domain = domain.asInstanceOf[js.Any], domainOwner = domainOwner.asInstanceOf[js.Any], format = format.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], repository = repository.asInstanceOf[js.Any], repositoryEndpoint = repositoryEndpoint.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetRepositoryEndpointResult]
  }
  
  @scala.inline
  implicit class GetRepositoryEndpointResultOps[Self <: GetRepositoryEndpointResult] (val x: Self) extends AnyVal {
    
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
    def setDomain(value: String): Self = this.set("domain", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDomainOwner(value: String): Self = this.set("domainOwner", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFormat(value: String): Self = this.set("format", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRepository(value: String): Self = this.set("repository", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRepositoryEndpoint(value: String): Self = this.set("repositoryEndpoint", value.asInstanceOf[js.Any])
  }
}
