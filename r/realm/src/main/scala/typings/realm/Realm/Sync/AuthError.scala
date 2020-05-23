package typings.realm.Realm.Sync

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * AuthError
  * @see { @link https://realm.io/docs/javascript/latest/api/Realm.Sync.AuthError.html }
  */
trait AuthError extends js.Object {
  val code: Double
  val `type`: String
}

object AuthError {
  @scala.inline
  def apply(code: Double, `type`: String): AuthError = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AuthError]
  }
}

