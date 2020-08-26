package typings.storybookApi.anon

import typings.storybookApi.channelMod.SubAPI
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ApiSubAPI extends js.Object {
  var api: SubAPI = js.native
}

object ApiSubAPI {
  @scala.inline
  def apply(api: SubAPI): ApiSubAPI = {
    val __obj = js.Dynamic.literal(api = api.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApiSubAPI]
  }
  @scala.inline
  implicit class ApiSubAPIOps[Self <: ApiSubAPI] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setApi(value: SubAPI): Self = this.set("api", value.asInstanceOf[js.Any])
  }
  
}

