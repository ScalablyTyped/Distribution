package typings.riotDashGamesDashApi.RiotGamesAPI.LolStaticData

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MetaDataDto extends js.Object {
  var isRune: Boolean
  var tier: String
  var `type`: String
}

object MetaDataDto {
  @scala.inline
  def apply(isRune: Boolean, tier: String, `type`: String): MetaDataDto = {
    val __obj = js.Dynamic.literal(isRune = isRune, tier = tier)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[MetaDataDto]
  }
}

