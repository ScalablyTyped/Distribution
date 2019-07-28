package typings.atPulumiAws.ecrGetRepositoryMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetRepositoryResult extends js.Object {
  /**
    * Full ARN of the repository.
    */
  val arn: String
  /**
    * id is the provider-assigned unique ID for this managed resource.
    */
  val id: String
  val name: String
  /**
    * The registry ID where the repository was created.
    */
  val registryId: String
  /**
    * The URL of the repository (in the form `aws_account_id.dkr.ecr.region.amazonaws.com/repositoryName`).
    */
  val repositoryUrl: String
  /**
    * A mapping of tags assigned to the resource.
    */
  val tags: StringDictionary[js.Any]
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
    val __obj = js.Dynamic.literal(arn = arn, id = id, name = name, registryId = registryId, repositoryUrl = repositoryUrl, tags = tags)
  
    __obj.asInstanceOf[GetRepositoryResult]
  }
}

