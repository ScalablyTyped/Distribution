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
}

object GetRepositoryResult {
  @scala.inline
  def apply(
    arn: java.lang.String,
    cloneUrlHttp: java.lang.String,
    cloneUrlSsh: java.lang.String,
    id: java.lang.String,
    repositoryId: java.lang.String
  ): GetRepositoryResult = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("arn")(arn)
    __obj.updateDynamic("cloneUrlHttp")(cloneUrlHttp)
    __obj.updateDynamic("cloneUrlSsh")(cloneUrlSsh)
    __obj.updateDynamic("id")(id)
    __obj.updateDynamic("repositoryId")(repositoryId)
    __obj.asInstanceOf[GetRepositoryResult]
  }
}

