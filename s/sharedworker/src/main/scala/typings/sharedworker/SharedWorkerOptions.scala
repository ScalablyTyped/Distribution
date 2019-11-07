package typings.sharedworker

import typings.std.RequestCredentials
import typings.std.WorkerType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SharedWorkerOptions extends js.Object {
  var credentials: js.UndefOr[RequestCredentials] = js.undefined
  var name: js.UndefOr[String] = js.undefined
  var `type`: js.UndefOr[WorkerType] = js.undefined
}

object SharedWorkerOptions {
  @scala.inline
  def apply(credentials: RequestCredentials = null, name: String = null, `type`: WorkerType = null): SharedWorkerOptions = {
    val __obj = js.Dynamic.literal()
    if (credentials != null) __obj.updateDynamic("credentials")(credentials)
    if (name != null) __obj.updateDynamic("name")(name)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[SharedWorkerOptions]
  }
}

