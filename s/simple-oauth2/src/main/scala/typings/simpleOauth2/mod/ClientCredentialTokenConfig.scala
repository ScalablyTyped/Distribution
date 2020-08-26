package typings.simpleOauth2.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ClientCredentialTokenConfig
  extends /**
  * Additional options will be automatically serialized as params for the token request.
  */
/* key */ StringDictionary[js.Any] {
  /** A string that represents the application privileges */
  var scope: js.UndefOr[String | js.Array[String]] = js.native
}

object ClientCredentialTokenConfig {
  @scala.inline
  def apply(): ClientCredentialTokenConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ClientCredentialTokenConfig]
  }
  @scala.inline
  implicit class ClientCredentialTokenConfigOps[Self <: ClientCredentialTokenConfig] (val x: Self) extends AnyVal {
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
    def setScopeVarargs(value: String*): Self = this.set("scope", js.Array(value :_*))
    @scala.inline
    def setScope(value: String | js.Array[String]): Self = this.set("scope", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteScope: Self = this.set("scope", js.undefined)
  }
  
}

