package typings.riotDashGamesDashApi.RiotGamesAPINs.LolStaticDataNs

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MapDataDto extends js.Object {
  var data: js.Array[StringDictionary[MapDetailsDto]]
  var `type`: String
  var version: String
}

object MapDataDto {
  @scala.inline
  def apply(data: js.Array[StringDictionary[MapDetailsDto]], `type`: String, version: String): MapDataDto = {
    val __obj = js.Dynamic.literal(data = data, version = version)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[MapDataDto]
  }
}

