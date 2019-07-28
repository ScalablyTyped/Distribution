package typings.atPulumiAws.codecommitGetRepositoryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetRepositoryArgs extends js.Object {
  /**
    * The name for the repository. This needs to be less than 100 characters.
    */
  val repositoryName: String
}

object GetRepositoryArgs {
  @scala.inline
  def apply(repositoryName: String): GetRepositoryArgs = {
    val __obj = js.Dynamic.literal(repositoryName = repositoryName)
  
    __obj.asInstanceOf[GetRepositoryArgs]
  }
}

