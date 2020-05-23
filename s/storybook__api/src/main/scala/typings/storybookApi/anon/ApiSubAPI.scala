package typings.storybookApi.anon

import typings.storybookApi.channelMod.SubAPI
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ApiSubAPI extends js.Object {
  var api: SubAPI
}

object ApiSubAPI {
  @scala.inline
  def apply(api: SubAPI): ApiSubAPI = {
    val __obj = js.Dynamic.literal(api = api.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApiSubAPI]
  }
}

