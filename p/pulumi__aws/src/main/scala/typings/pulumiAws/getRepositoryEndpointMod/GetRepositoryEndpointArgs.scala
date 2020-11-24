package typings.pulumiAws.getRepositoryEndpointMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetRepositoryEndpointArgs extends js.Object {
  
  /**
    * The name of the domain that contains the repository.
    */
  val domain: String = js.native
  
  /**
    * The account number of the AWS account that owns the domain.
    */
  val domainOwner: js.UndefOr[String] = js.native
  
  /**
    * Which endpoint of a repository to return. A repository has one endpoint for each package format: `npm`, `pypi`, and `maven`.
    */
  val format: String = js.native
  
  /**
    * The name of the repository.
    */
  val repository: String = js.native
}
object GetRepositoryEndpointArgs {
  
  @scala.inline
  def apply(domain: String, format: String, repository: String): GetRepositoryEndpointArgs = {
    val __obj = js.Dynamic.literal(domain = domain.asInstanceOf[js.Any], format = format.asInstanceOf[js.Any], repository = repository.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetRepositoryEndpointArgs]
  }
  
  @scala.inline
  implicit class GetRepositoryEndpointArgsOps[Self <: GetRepositoryEndpointArgs] (val x: Self) extends AnyVal {
    
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
    def setFormat(value: String): Self = this.set("format", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRepository(value: String): Self = this.set("repository", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDomainOwner(value: String): Self = this.set("domainOwner", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDomainOwner: Self = this.set("domainOwner", js.undefined)
  }
}
