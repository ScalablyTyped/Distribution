package typings
package atPulumiAwsLib.codecommitGetRepositoryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetRepositoryArgs extends js.Object {
  /**
    * The name for the repository. This needs to be less than 100 characters.
    */
  val repositoryName: java.lang.String
}

object GetRepositoryArgs {
  @scala.inline
  def apply(repositoryName: java.lang.String): GetRepositoryArgs = {
    val __obj = js.Dynamic.literal(repositoryName = repositoryName)
  
    __obj.asInstanceOf[GetRepositoryArgs]
  }
}

