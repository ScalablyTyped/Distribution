package typings
package atPulumiAwsLib.ecrGetRepositoryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetRepositoryResult extends js.Object {
  /**
    * Full ARN of the repository.
    */
  val arn: java.lang.String
  /**
    * id is the provider-assigned unique ID for this managed resource.
    */
  val id: java.lang.String
  /**
    * The registry ID where the repository was created.
    */
  val registryId: java.lang.String
  /**
    * The URL of the repository (in the form `aws_account_id.dkr.ecr.region.amazonaws.com/repositoryName`).
    */
  val repositoryUrl: java.lang.String
  /**
    * A mapping of tags assigned to the resource.
    */
  val tags: org.scalablytyped.runtime.StringDictionary[js.Any]
}

object GetRepositoryResult {
  @scala.inline
  def apply(
    arn: java.lang.String,
    id: java.lang.String,
    registryId: java.lang.String,
    repositoryUrl: java.lang.String,
    tags: org.scalablytyped.runtime.StringDictionary[js.Any]
  ): GetRepositoryResult = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("arn")(arn)
    __obj.updateDynamic("id")(id)
    __obj.updateDynamic("registryId")(registryId)
    __obj.updateDynamic("repositoryUrl")(repositoryUrl)
    __obj.updateDynamic("tags")(tags)
    __obj.asInstanceOf[GetRepositoryResult]
  }
}

