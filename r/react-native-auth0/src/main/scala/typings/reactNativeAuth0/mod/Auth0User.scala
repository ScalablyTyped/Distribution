package typings.reactNativeAuth0.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Auth0User[T] extends js.Object {
  var created_at: String = js.native
  var email: String = js.native
  var emailVerified: Boolean = js.native
  var identities: js.Array[_] = js.native
  var last_ip: js.UndefOr[String] = js.native
  var last_login: js.UndefOr[String] = js.native
  var logins_count: Double = js.native
  var name: String = js.native
  var nickname: String = js.native
  var picture: js.UndefOr[String] = js.native
  var updated_at: String = js.native
  var userId: String = js.native
  var userMetadata: js.UndefOr[T] = js.native
}

object Auth0User {
  @scala.inline
  def apply[T](
    created_at: String,
    email: String,
    emailVerified: Boolean,
    identities: js.Array[_],
    logins_count: Double,
    name: String,
    nickname: String,
    updated_at: String,
    userId: String
  ): Auth0User[T] = {
    val __obj = js.Dynamic.literal(created_at = created_at.asInstanceOf[js.Any], email = email.asInstanceOf[js.Any], emailVerified = emailVerified.asInstanceOf[js.Any], identities = identities.asInstanceOf[js.Any], logins_count = logins_count.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], nickname = nickname.asInstanceOf[js.Any], updated_at = updated_at.asInstanceOf[js.Any], userId = userId.asInstanceOf[js.Any])
    __obj.asInstanceOf[Auth0User[T]]
  }
  @scala.inline
  implicit class Auth0UserOps[Self <: Auth0User[_], T] (val x: Self with Auth0User[T]) extends AnyVal {
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
    def setCreated_at(value: String): Self = this.set("created_at", value.asInstanceOf[js.Any])
    @scala.inline
    def setEmail(value: String): Self = this.set("email", value.asInstanceOf[js.Any])
    @scala.inline
    def setEmailVerified(value: Boolean): Self = this.set("emailVerified", value.asInstanceOf[js.Any])
    @scala.inline
    def setIdentitiesVarargs(value: js.Any*): Self = this.set("identities", js.Array(value :_*))
    @scala.inline
    def setIdentities(value: js.Array[_]): Self = this.set("identities", value.asInstanceOf[js.Any])
    @scala.inline
    def setLogins_count(value: Double): Self = this.set("logins_count", value.asInstanceOf[js.Any])
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def setNickname(value: String): Self = this.set("nickname", value.asInstanceOf[js.Any])
    @scala.inline
    def setUpdated_at(value: String): Self = this.set("updated_at", value.asInstanceOf[js.Any])
    @scala.inline
    def setUserId(value: String): Self = this.set("userId", value.asInstanceOf[js.Any])
    @scala.inline
    def setLast_ip(value: String): Self = this.set("last_ip", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLast_ip: Self = this.set("last_ip", js.undefined)
    @scala.inline
    def setLast_login(value: String): Self = this.set("last_login", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLast_login: Self = this.set("last_login", js.undefined)
    @scala.inline
    def setPicture(value: String): Self = this.set("picture", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePicture: Self = this.set("picture", js.undefined)
    @scala.inline
    def setUserMetadata(value: T): Self = this.set("userMetadata", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUserMetadata: Self = this.set("userMetadata", js.undefined)
  }
  
}

