package typings.riotGamesApi.RiotGamesAPI.LolStaticData

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChampionListDto extends js.Object {
  var data: StringDictionary[ChampionDto]
  var format: String
  var keys: StringDictionary[String]
  var `type`: String
  var version: String
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
}

