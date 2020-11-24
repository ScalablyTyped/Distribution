package typings.pulumiAws.codecommitRepositoryMod

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RepositoryState extends js.Object {
  
  /**
    * The ARN of the repository
    */
  val arn: js.UndefOr[Input[String]] = js.native
  
  /**
    * The URL to use for cloning the repository over HTTPS.
    */
  val cloneUrlHttp: js.UndefOr[Input[String]] = js.native
  
  /**
    * The URL to use for cloning the repository over SSH.
    */
  val cloneUrlSsh: js.UndefOr[Input[String]] = js.native
  
  /**
    * The default branch of the repository. The branch specified here needs to exist.
    */
  val defaultBranch: js.UndefOr[Input[String]] = js.native
  
  /**
    * The description of the repository. This needs to be less than 1000 characters
    */
  val description: js.UndefOr[Input[String]] = js.native
  
  /**
    * The ID of the repository
    */
  val repositoryId: js.UndefOr[Input[String]] = js.native
  
  /**
    * The name for the repository. This needs to be less than 100 characters.
    */
  val repositoryName: js.UndefOr[Input[String]] = js.native
  
  /**
    * Key-value map of resource tags
    */
  val tags: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.native
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
    def setArn(value: Input[String]): Self = this.set("arn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteArn: Self = this.set("arn", js.undefined)
    
    @scala.inline
    def setCloneUrlHttp(value: Input[String]): Self = this.set("cloneUrlHttp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCloneUrlHttp: Self = this.set("cloneUrlHttp", js.undefined)
    
    @scala.inline
    def setCloneUrlSsh(value: Input[String]): Self = this.set("cloneUrlSsh", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCloneUrlSsh: Self = this.set("cloneUrlSsh", js.undefined)
    
    @scala.inline
    def setDefaultBranch(value: Input[String]): Self = this.set("defaultBranch", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDefaultBranch: Self = this.set("defaultBranch", js.undefined)
    
    @scala.inline
    def setDescription(value: Input[String]): Self = this.set("description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
    
    @scala.inline
    def setRepositoryId(value: Input[String]): Self = this.set("repositoryId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRepositoryId: Self = this.set("repositoryId", js.undefined)
    
    @scala.inline
    def setRepositoryName(value: Input[String]): Self = this.set("repositoryName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRepositoryName: Self = this.set("repositoryName", js.undefined)
    
    @scala.inline
    def setTags(value: Input[StringDictionary[Input[String]]]): Self = this.set("tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTags: Self = this.set("tags", js.undefined)
  }
}
