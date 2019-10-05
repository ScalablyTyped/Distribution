package typings.riotDashGamesDashApi.RiotGamesAPI.LolStaticData

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RuneListDto extends js.Object {
  var basic: BasicDataDto
  var data: js.Array[StringDictionary[RuneDto]]
  var `type`: String
  var version: String
}

object RuneListDto {
  @scala.inline
  def apply(basic: BasicDataDto, data: js.Array[StringDictionary[RuneDto]], `type`: String, version: String): RuneListDto = {
    val __obj = js.Dynamic.literal(basic = basic, data = data, version = version)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[RuneListDto]
  }
}

