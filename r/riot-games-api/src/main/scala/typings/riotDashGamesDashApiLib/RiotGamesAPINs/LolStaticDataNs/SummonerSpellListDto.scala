package typings
package riotDashGamesDashApiLib.RiotGamesAPINs.LolStaticDataNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SummonerSpellListDto extends js.Object {
  var data: js.Array[org.scalablytyped.runtime.StringDictionary[SummonerSpellDto]]
  var `type`: java.lang.String
  var version: java.lang.String
}

object SummonerSpellListDto {
  @scala.inline
  def apply(
    data: js.Array[org.scalablytyped.runtime.StringDictionary[SummonerSpellDto]],
    `type`: java.lang.String,
    version: java.lang.String
  ): SummonerSpellListDto = {
    val __obj = js.Dynamic.literal(`type` = `type`)
    __obj.updateDynamic("data")(data)
    __obj.updateDynamic("version")(version)
    __obj.asInstanceOf[SummonerSpellListDto]
  }
}

