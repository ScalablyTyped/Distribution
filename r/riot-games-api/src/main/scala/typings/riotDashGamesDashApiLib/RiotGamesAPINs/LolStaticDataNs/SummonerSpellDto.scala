package typings
package riotDashGamesDashApiLib.RiotGamesAPINs.LolStaticDataNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SummonerSpellDto extends js.Object {
  var cooldown: js.Array[scala.Double]
  var cooldownBurn: java.lang.String
  var cost: js.Array[scala.Double]
  var costBurn: java.lang.String
  var costType: java.lang.String
  var description: java.lang.String
  var effect: js.Array[js.Array[scala.Double]]
  var effectBurn: js.Array[java.lang.String]
  var id: scala.Double
  var image: ImageDto
  var key: java.lang.String
  var leveltip: LevelTipDto
  var maxrank: scala.Double
  var modes: js.Array[java.lang.String]
  var name: java.lang.String
  var range: js.Array[scala.Double] | java.lang.String
  var rangeBurn: java.lang.String
  var resource: java.lang.String
  var sanitizedDescription: java.lang.String
  var sanitizedTooltip: java.lang.String
  var summonerLevel: scala.Double
  var tooltip: java.lang.String
  var vars: js.Array[SpellVarsDto]
}

