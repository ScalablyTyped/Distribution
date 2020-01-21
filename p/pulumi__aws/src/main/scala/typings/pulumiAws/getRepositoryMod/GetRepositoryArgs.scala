package typings.pulumiAws.getRepositoryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetRepositoryArgs extends js.Object {
  /**
    * The name for the repository. This needs to be less than 100 characters.
    */
  val repositoryName: String = js.native
}

object GetRepositoryArgs {
  @scala.inline
  def apply(repositoryName: String): GetRepositoryArgs = {
    val __obj = js.Dynamic.literal(repositoryName = repositoryName.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[GetRepositoryArgs]
  }
}

