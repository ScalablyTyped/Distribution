package typings.riotDashGamesDashApi.RiotGamesAPINs.LolStaticDataNs

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
    val __obj = js.Dynamic.literal(data = data, format = format, keys = keys, version = version)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[ChampionListDto]
  }
}

