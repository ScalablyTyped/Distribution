package typings.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WorkletOptions extends js.Object {
  var credentials: js.UndefOr[RequestCredentials] = js.undefined
}

object WorkletOptions {
  @scala.inline
  def apply(credentials: RequestCredentials = null): WorkletOptions = {
    val __obj = js.Dynamic.literal()
    if (credentials != null) __obj.updateDynamic("credentials")(credentials.asInstanceOf[js.Any])
    __obj.asInstanceOf[WorkletOptions]
  }
}

