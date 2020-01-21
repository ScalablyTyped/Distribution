package typings.storybookApi

import typings.storybookApi.addonsMod.SubAPI
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonApiState extends js.Object {
  var api: SubAPI
  var state: AnonAddons
}

object AnonApiState {
  @scala.inline
  def apply(api: SubAPI, state: AnonAddons): AnonApiState = {
    val __obj = js.Dynamic.literal(api = api.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonApiState]
  }
}

