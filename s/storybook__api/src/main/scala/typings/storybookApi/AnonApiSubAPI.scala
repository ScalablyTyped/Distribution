package typings.storybookApi

import typings.storybookApi.channelMod.SubAPI
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonApiSubAPI extends js.Object {
  var api: SubAPI
}

object AnonApiSubAPI {
  @scala.inline
  def apply(api: SubAPI): AnonApiSubAPI = {
    val __obj = js.Dynamic.literal(api = api.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonApiSubAPI]
  }
}

