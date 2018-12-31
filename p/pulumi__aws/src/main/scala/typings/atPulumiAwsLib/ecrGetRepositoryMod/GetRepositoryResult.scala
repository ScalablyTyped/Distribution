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

