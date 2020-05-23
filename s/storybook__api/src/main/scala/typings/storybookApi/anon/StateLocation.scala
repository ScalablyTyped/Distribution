package typings.storybookApi.anon

import typings.storybookApi.urlMod.SubAPI
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StateLocation extends js.Object {
  var api: SubAPI
  var state: Location
}

object StateLocation {
  @scala.inline
  def apply(api: SubAPI, state: Location): StateLocation = {
    val __obj = js.Dynamic.literal(api = api.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any])
    __obj.asInstanceOf[StateLocation]
  }
}

