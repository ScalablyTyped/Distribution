package typings.riotGamesApi.RiotGamesAPI.LolStaticData

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SummonerSpellListDto extends js.Object {
  var data: js.Array[StringDictionary[SummonerSpellDto]] = js.native
  var `type`: String = js.native
  var version: String = js.native
}

object SummonerSpellListDto {
  @scala.inline
  def apply(data: js.Array[StringDictionary[SummonerSpellDto]], `type`: String, version: String): SummonerSpellListDto = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[SummonerSpellListDto]
  }
  @scala.inline
  implicit class SummonerSpellListDtoOps[Self <: SummonerSpellListDto] (val x: Self) extends AnyVal {
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
    def setDataVarargs(value: StringDictionary[SummonerSpellDto]*): Self = this.set("data", js.Array(value :_*))
    @scala.inline
    def setData(value: js.Array[StringDictionary[SummonerSpellDto]]): Self = this.set("data", value.asInstanceOf[js.Any])
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def setVersion(value: String): Self = this.set("version", value.asInstanceOf[js.Any])
  }
  
}

