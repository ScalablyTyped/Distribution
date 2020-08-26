package typings.riotGamesApi.RiotGamesAPI.LolStaticData

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GroupDto extends js.Object {
  var MaxGroupOwnable: String = js.native
  var key: String = js.native
}

object GroupDto {
  @scala.inline
  def apply(MaxGroupOwnable: String, key: String): GroupDto = {
    val __obj = js.Dynamic.literal(MaxGroupOwnable = MaxGroupOwnable.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any])
    __obj.asInstanceOf[GroupDto]
  }
  @scala.inline
  implicit class GroupDtoOps[Self <: GroupDto] (val x: Self) extends AnyVal {
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
    def setMaxGroupOwnable(value: String): Self = this.set("MaxGroupOwnable", value.asInstanceOf[js.Any])
    @scala.inline
    def setKey(value: String): Self = this.set("key", value.asInstanceOf[js.Any])
  }
  
}

