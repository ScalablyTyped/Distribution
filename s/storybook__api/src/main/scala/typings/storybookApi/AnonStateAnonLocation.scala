package typings.storybookApi

import typings.storybookApi.urlMod.SubAPI
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonStateAnonLocation extends js.Object {
  var api: SubAPI
  var state: AnonLocation
}

object AnonStateAnonLocation {
  @scala.inline
  def apply(api: SubAPI, state: AnonLocation): AnonStateAnonLocation = {
    val __obj = js.Dynamic.literal(api = api.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonStateAnonLocation]
  }
}

