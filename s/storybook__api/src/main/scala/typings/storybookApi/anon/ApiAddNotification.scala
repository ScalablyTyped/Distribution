package typings.storybookApi.anon

import typings.storybookApi.notificationsMod.SubState
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ApiAddNotification extends js.Object {
  var api: AddNotification
  var state: SubState
}

object ApiAddNotification {
  @scala.inline
  def apply(api: AddNotification, state: SubState): ApiAddNotification = {
    val __obj = js.Dynamic.literal(api = api.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApiAddNotification]
  }
}

