package typings.pulumiAws.ecrGetRepositoryMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetRepositoryResult extends js.Object {
  /**
    * Full ARN of the repository.
    */
  val arn: String = js.native
  /**
    * The provider-assigned unique ID for this managed resource.
    */
  val id: String = js.native
  val name: String = js.native
  /**
    * The registry ID where the repository was created.
    */
  val registryId: String = js.native
  /**
    * The URL of the repository (in the form `aws_account_id.dkr.ecr.region.amazonaws.com/repositoryName`).
    */
  val repositoryUrl: String = js.native
  /**
    * A map of tags assigned to the resource.
    */
  val tags: StringDictionary[String] = js.native
}

object GetRepositoryResult {
  @scala.inline
  def apply(
    arn: String,
    id: String,
    name: String,
    registryId: String,
    repositoryUrl: String,
    tags: StringDictionary[String]
  ): GetRepositoryResult = {
    val __obj = js.Dynamic.literal(arn = arn.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], registryId = registryId.asInstanceOf[js.Any], repositoryUrl = repositoryUrl.asInstanceOf[js.Any], tags = tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetRepositoryResult]
  }
  @scala.inline
  implicit class GetRepositoryResultOps[Self <: GetRepositoryResult] (val x: Self) extends AnyVal {
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
    def setArn(value: String): Self = this.set("arn", value.asInstanceOf[js.Any])
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def setRegistryId(value: String): Self = this.set("registryId", value.asInstanceOf[js.Any])
    @scala.inline
    def setRepositoryUrl(value: String): Self = this.set("repositoryUrl", value.asInstanceOf[js.Any])
    @scala.inline
    def setTags(value: StringDictionary[String]): Self = this.set("tags", value.asInstanceOf[js.Any])
  }
  
}

