package typings.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WorkerOptions extends js.Object {
  var credentials: js.UndefOr[RequestCredentials] = js.undefined
  var name: js.UndefOr[java.lang.String] = js.undefined
  var `type`: js.UndefOr[WorkerType] = js.undefined
}

object WorkerOptions {
  @scala.inline
  def apply(credentials: RequestCredentials = null, name: java.lang.String = null, `type`: WorkerType = null): WorkerOptions = {
    val __obj = js.Dynamic.literal()
    if (credentials != null) __obj.updateDynamic("credentials")(credentials)
    if (name != null) __obj.updateDynamic("name")(name)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[WorkerOptions]
  }
}

