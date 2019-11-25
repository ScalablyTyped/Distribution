package typings.riotDashGamesDashApi.RiotGamesAPI.LolStaticData

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SpellVarsDto extends js.Object {
  var coeff: js.Array[Double]
  var dyn: String
  var key: String
  var link: String
  var ranksWith: String
}

object SpellVarsDto {
  @scala.inline
  def apply(coeff: js.Array[Double], dyn: String, key: String, link: String, ranksWith: String): SpellVarsDto = {
    val __obj = js.Dynamic.literal(coeff = coeff.asInstanceOf[js.Any], dyn = dyn.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], link = link.asInstanceOf[js.Any], ranksWith = ranksWith.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[SpellVarsDto]
  }
}

