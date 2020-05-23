package typings.storybookApi.anon

import typings.storybookApi.mod.API
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Api extends js.Object {
  var api: API
  var state: typings.storybookApi.mod.State
}

object Api {
  @scala.inline
  def apply(api: API, state: typings.storybookApi.mod.State): Api = {
    val __obj = js.Dynamic.literal(api = api.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any])
    __obj.asInstanceOf[Api]
  }
}

