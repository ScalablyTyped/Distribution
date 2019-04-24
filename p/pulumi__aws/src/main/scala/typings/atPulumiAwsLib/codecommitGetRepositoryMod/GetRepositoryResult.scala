package typings
package atPulumiAwsLib.codecommitGetRepositoryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetRepositoryResult extends js.Object {
  /**
    * The ARN of the repository
    */
  val arn: java.lang.String
  /**
    * The URL to use for cloning the repository over HTTPS.
    */
  val cloneUrlHttp: java.lang.String
  /**
    * The URL to use for cloning the repository over SSH.
    */
  val cloneUrlSsh: java.lang.String
  /**
    * id is the provider-assigned unique ID for this managed resource.
    */
  val id: java.lang.String
  /**
    * The ID of the repository
    */
  val repositoryId: java.lang.String
  val repositoryName: java.lang.String
}

object GetRepositoryResult {
  @scala.inline
  def apply(
    arn: java.lang.String,
    cloneUrlHttp: java.lang.String,
    cloneUrlSsh: java.lang.String,
    id: java.lang.String,
    repositoryId: java.lang.String,
    repositoryName: java.lang.String
  ): GetRepositoryResult = {
    val __obj = js.Dynamic.literal(arn = arn, cloneUrlHttp = cloneUrlHttp, cloneUrlSsh = cloneUrlSsh, id = id, repositoryId = repositoryId, repositoryName = repositoryName)
  
    __obj.asInstanceOf[GetRepositoryResult]
  }
}

