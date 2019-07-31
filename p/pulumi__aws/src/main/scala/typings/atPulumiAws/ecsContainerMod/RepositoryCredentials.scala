package typings.atPulumiAws.ecsContainerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RepositoryCredentials extends js.Object {
  var credentialsParameter: String
}

object RepositoryCredentials {
  @scala.inline
  def apply(credentialsParameter: String): RepositoryCredentials = {
    val __obj = js.Dynamic.literal(credentialsParameter = credentialsParameter)
  
    __obj.asInstanceOf[RepositoryCredentials]
  }
}

