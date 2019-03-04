package typings
package riotDashGamesDashApiLib.RiotGamesAPINs.LolStaticDataNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SpellVarsDto extends js.Object {
  var coeff: js.Array[scala.Double]
  var dyn: java.lang.String
  var key: java.lang.String
  var link: java.lang.String
  var ranksWith: java.lang.String
}

object SpellVarsDto {
  @scala.inline
  def apply(
    coeff: js.Array[scala.Double],
    dyn: java.lang.String,
    key: java.lang.String,
    link: java.lang.String,
    ranksWith: java.lang.String
  ): SpellVarsDto = {
    val __obj = js.Dynamic.literal(coeff = coeff, dyn = dyn, key = key, link = link, ranksWith = ranksWith)
  
    __obj.asInstanceOf[SpellVarsDto]
  }
}

