package typings
package riotDashGamesDashApiLib.RiotGamesAPINs.LolStaticDataNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MetaDataDto extends js.Object {
  var isRune: scala.Boolean
  var tier: java.lang.String
  var `type`: java.lang.String
}

object MetaDataDto {
  @scala.inline
  def apply(isRune: scala.Boolean, tier: java.lang.String, `type`: java.lang.String): MetaDataDto = {
    val __obj = js.Dynamic.literal(isRune = isRune, tier = tier)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[MetaDataDto]
  }
}

