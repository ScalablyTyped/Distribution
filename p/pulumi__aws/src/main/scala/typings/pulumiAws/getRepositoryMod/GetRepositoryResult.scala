package typings.pulumiAws.getRepositoryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetRepositoryResult extends js.Object {
  /**
    * The ARN of the repository
    */
  val arn: String = js.native
  /**
    * The URL to use for cloning the repository over HTTPS.
    */
  val cloneUrlHttp: String = js.native
  /**
    * The URL to use for cloning the repository over SSH.
    */
  val cloneUrlSsh: String = js.native
  /**
    * id is the provider-assigned unique ID for this managed resource.
    */
  val id: String = js.native
  /**
    * The ID of the repository
    */
  val repositoryId: String = js.native
  val repositoryName: String = js.native
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
    val __obj = js.Dynamic.literal(arn = arn.asInstanceOf[js.Any], cloneUrlHttp = cloneUrlHttp.asInstanceOf[js.Any], cloneUrlSsh = cloneUrlSsh.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], repositoryId = repositoryId.asInstanceOf[js.Any], repositoryName = repositoryName.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[GetRepositoryResult]
  }
}

