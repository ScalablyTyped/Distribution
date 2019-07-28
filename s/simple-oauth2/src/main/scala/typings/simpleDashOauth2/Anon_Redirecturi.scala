package typings.simpleDashOauth2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Redirecturi extends js.Object {
  /** A string that represents the registered application URI where the user is redirected after authentication */
  var redirect_uri: js.UndefOr[String] = js.undefined
  /** A string or array of strings that represents the application privileges */
  var scope: js.UndefOr[String | js.Array[String]] = js.undefined
  /** A string that represents an option opaque value used by the client to main the state between the request and the callback */
  var state: js.UndefOr[String] = js.undefined
}

object Anon_Redirecturi {
  @scala.inline
  def apply(redirect_uri: String = null, scope: String | js.Array[String] = null, state: String = null): Anon_Redirecturi = {
    val __obj = js.Dynamic.literal()
    if (redirect_uri != null) __obj.updateDynamic("redirect_uri")(redirect_uri)
    if (scope != null) __obj.updateDynamic("scope")(scope.asInstanceOf[js.Any])
    if (state != null) __obj.updateDynamic("state")(state)
    __obj.asInstanceOf[Anon_Redirecturi]
  }
}

