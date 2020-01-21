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
    * id is the provider-assigned unique ID for this managed resource.
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
    * A mapping of tags assigned to the resource.
    */
  val tags: StringDictionary[js.Any] = js.native
}

object GetRepositoryResult {
  @scala.inline
  def apply(
    arn: String,
    id: String,
    name: String,
    registryId: String,
    repositoryUrl: String,
    tags: StringDictionary[js.Any]
  ): GetRepositoryResult = {
    val __obj = js.Dynamic.literal(arn = arn.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], registryId = registryId.asInstanceOf[js.Any], repositoryUrl = repositoryUrl.asInstanceOf[js.Any], tags = tags.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[GetRepositoryResult]
  }
}

