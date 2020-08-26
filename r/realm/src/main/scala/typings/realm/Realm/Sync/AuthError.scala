package typings.realm.Realm.Sync

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * AuthError
  * @see { @link https://realm.io/docs/javascript/latest/api/Realm.Sync.AuthError.html }
  */
@js.native
trait AuthError extends js.Object {
  val code: Double = js.native
  val `type`: String = js.native
}

object AuthError {
  @scala.inline
  def apply(code: Double, `type`: String): AuthError = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AuthError]
  }
  @scala.inline
  implicit class AuthErrorOps[Self <: AuthError] (val x: Self) extends AnyVal {
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
    def setCode(value: Double): Self = this.set("code", value.asInstanceOf[js.Any])
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
  }
  
}

