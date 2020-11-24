package typings.pulumiAws.repositoryMod

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiAws.inputMod.codeartifact.RepositoryExternalConnections
import typings.pulumiAws.inputMod.codeartifact.RepositoryUpstream
import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RepositoryState extends js.Object {
  
  /**
    * The account number of the AWS account that manages the repository.
    */
  val administratorAccount: js.UndefOr[Input[String]] = js.native
  
  /**
    * The ARN of the repository.
    */
  val arn: js.UndefOr[Input[String]] = js.native
  
  /**
    * The description of the repository.
    */
  val description: js.UndefOr[Input[String]] = js.native
  
  /**
    * The domain that contains the created repository.
    */
  val domain: js.UndefOr[Input[String]] = js.native
  
  /**
    * The account number of the AWS account that owns the domain.
    */
  val domainOwner: js.UndefOr[Input[String]] = js.native
  
  /**
    * An array of external connections associated with the repository. Only one external connection can be set per repository. see External Connections.
    */
  val externalConnections: js.UndefOr[Input[RepositoryExternalConnections]] = js.native
  
  /**
    * The name of the repository to create.
    */
  val repository: js.UndefOr[Input[String]] = js.native
  
  /**
    * Key-value map of resource tags.
    */
  val tags: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.native
  
  /**
    * A list of upstream repositories to associate with the repository. The order of the upstream repositories in the list determines their priority order when AWS CodeArtifact looks for a requested package version. see Upstream
    */
  val upstreams: js.UndefOr[Input[js.Array[Input[RepositoryUpstream]]]] = js.native
}
object RepositoryState {
  
  @scala.inline
  def apply(): RepositoryState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RepositoryState]
  }
  
  @scala.inline
  implicit class RepositoryStateOps[Self <: RepositoryState] (val x: Self) extends AnyVal {
    
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
    def setAdministratorAccount(value: Input[String]): Self = this.set("administratorAccount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAdministratorAccount: Self = this.set("administratorAccount", js.undefined)
    
    @scala.inline
    def setArn(value: Input[String]): Self = this.set("arn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteArn: Self = this.set("arn", js.undefined)
    
    @scala.inline
    def setDescription(value: Input[String]): Self = this.set("description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
    
    @scala.inline
    def setDomain(value: Input[String]): Self = this.set("domain", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDomain: Self = this.set("domain", js.undefined)
    
    @scala.inline
    def setDomainOwner(value: Input[String]): Self = this.set("domainOwner", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDomainOwner: Self = this.set("domainOwner", js.undefined)
    
    @scala.inline
    def setExternalConnections(value: Input[RepositoryExternalConnections]): Self = this.set("externalConnections", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExternalConnections: Self = this.set("externalConnections", js.undefined)
    
    @scala.inline
    def setRepository(value: Input[String]): Self = this.set("repository", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRepository: Self = this.set("repository", js.undefined)
    
    @scala.inline
    def setTags(value: Input[StringDictionary[Input[String]]]): Self = this.set("tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTags: Self = this.set("tags", js.undefined)
    
    @scala.inline
    def setUpstreamsVarargs(value: Input[RepositoryUpstream]*): Self = this.set("upstreams", js.Array(value :_*))
    
    @scala.inline
    def setUpstreams(value: Input[js.Array[Input[RepositoryUpstream]]]): Self = this.set("upstreams", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUpstreams: Self = this.set("upstreams", js.undefined)
  }
}
