package typings.riotGamesApi.RiotGamesAPI.LolStaticData

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LevelTipDto extends js.Object {
  var effect: js.Array[String] = js.native
  var label: js.Array[String] = js.native
}

object LevelTipDto {
  @scala.inline
  def apply(effect: js.Array[String], label: js.Array[String]): LevelTipDto = {
    val __obj = js.Dynamic.literal(effect = effect.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any])
    __obj.asInstanceOf[LevelTipDto]
  }
  @scala.inline
  implicit class LevelTipDtoOps[Self <: LevelTipDto] (val x: Self) extends AnyVal {
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
    def setEffectVarargs(value: String*): Self = this.set("effect", js.Array(value :_*))
    @scala.inline
    def setEffect(value: js.Array[String]): Self = this.set("effect", value.asInstanceOf[js.Any])
    @scala.inline
    def setLabelVarargs(value: String*): Self = this.set("label", js.Array(value :_*))
    @scala.inline
    def setLabel(value: js.Array[String]): Self = this.set("label", value.asInstanceOf[js.Any])
  }
  
}

