package typings.riotGamesApi.RiotGamesAPI.LolStaticData

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ChampionListDto extends js.Object {
  var data: StringDictionary[ChampionDto] = js.native
  var format: String = js.native
  var keys: StringDictionary[String] = js.native
  var `type`: String = js.native
  var version: String = js.native
}

object ChampionListDto {
  @scala.inline
  def apply(
    data: StringDictionary[ChampionDto],
    format: String,
    keys: StringDictionary[String],
    `type`: String,
    version: String
  ): ChampionListDto = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], format = format.asInstanceOf[js.Any], keys = keys.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChampionListDto]
  }
  @scala.inline
  implicit class ChampionListDtoOps[Self <: ChampionListDto] (val x: Self) extends AnyVal {
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
    def setData(value: StringDictionary[ChampionDto]): Self = this.set("data", value.asInstanceOf[js.Any])
    @scala.inline
    def setFormat(value: String): Self = this.set("format", value.asInstanceOf[js.Any])
    @scala.inline
    def setKeys(value: StringDictionary[String]): Self = this.set("keys", value.asInstanceOf[js.Any])
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def setVersion(value: String): Self = this.set("version", value.asInstanceOf[js.Any])
  }
  
}

