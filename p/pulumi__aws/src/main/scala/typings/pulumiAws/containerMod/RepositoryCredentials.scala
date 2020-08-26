package typings.pulumiAws.containerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RepositoryCredentials extends js.Object {
  var credentialsParameter: String = js.native
}

object RepositoryCredentials {
  @scala.inline
  def apply(credentialsParameter: String): RepositoryCredentials = {
    val __obj = js.Dynamic.literal(credentialsParameter = credentialsParameter.asInstanceOf[js.Any])
    __obj.asInstanceOf[RepositoryCredentials]
  }
  @scala.inline
  implicit class RepositoryCredentialsOps[Self <: RepositoryCredentials] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setCredentialsParameter(value: String): Self = this.set("credentialsParameter", value.asInstanceOf[js.Any])
  }
  
}

