package typings
package reactDashFacebookDashLoginLib.reactDashFacebookDashLoginMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReactFacebookFailureResponse extends js.Object {
  var status: js.UndefOr[java.lang.String] = js.undefined
}

object ReactFacebookFailureResponse {
  @scala.inline
  def apply(status: java.lang.String = null): ReactFacebookFailureResponse = {
    val __obj = js.Dynamic.literal()
    if (status != null) __obj.updateDynamic("status")(status)
    __obj.asInstanceOf[ReactFacebookFailureResponse]
  }
}

