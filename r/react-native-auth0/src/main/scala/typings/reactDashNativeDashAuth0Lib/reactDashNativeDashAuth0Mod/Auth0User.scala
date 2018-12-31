package typings
package reactDashNativeDashAuth0Lib.reactDashNativeDashAuth0Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Auth0User[T] extends js.Object {
  var created_at: java.lang.String
  var email: java.lang.String
  var emailVerified: scala.Boolean
  var identities: js.Array[_]
  var last_ip: js.UndefOr[java.lang.String] = js.undefined
  var last_login: js.UndefOr[java.lang.String] = js.undefined
  var logins_count: scala.Double
  var name: java.lang.String
  var nickname: java.lang.String
  var picture: js.UndefOr[java.lang.String] = js.undefined
  var updated_at: java.lang.String
  var userId: java.lang.String
  var userMetadata: js.UndefOr[T] = js.undefined
}

