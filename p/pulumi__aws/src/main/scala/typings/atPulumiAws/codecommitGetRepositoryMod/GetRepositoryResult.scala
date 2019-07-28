package typings.atPulumiAws.codecommitGetRepositoryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetRepositoryResult extends js.Object {
  /**
    * The ARN of the repository
    */
  val arn: String
  /**
    * The URL to use for cloning the repository over HTTPS.
    */
  val cloneUrlHttp: String
  /**
    * The URL to use for cloning the repository over SSH.
    */
  val cloneUrlSsh: String
  /**
    * id is the provider-assigned unique ID for this managed resource.
    */
  val id: String
  /**
    * The ID of the repository
    */
  val repositoryId: String
  val repositoryName: String
}

object GetRepositoryResult {
  @scala.inline
  def apply(
    arn: String,
    cloneUrlHttp: String,
    cloneUrlSsh: String,
    id: String,
    repositoryId: String,
    repositoryName: String
  ): GetRepositoryResult = {
    val __obj = js.Dynamic.literal(arn = arn, cloneUrlHttp = cloneUrlHttp, cloneUrlSsh = cloneUrlSsh, id = id, repositoryId = repositoryId, repositoryName = repositoryName)
  
    __obj.asInstanceOf[GetRepositoryResult]
  }
}

