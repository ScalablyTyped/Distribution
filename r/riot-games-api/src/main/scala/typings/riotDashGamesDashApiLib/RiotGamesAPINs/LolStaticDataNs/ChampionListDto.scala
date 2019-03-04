package typings
package riotDashGamesDashApiLib.RiotGamesAPINs.LolStaticDataNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChampionListDto extends js.Object {
  var data: org.scalablytyped.runtime.StringDictionary[ChampionDto]
  var format: java.lang.String
  var keys: org.scalablytyped.runtime.StringDictionary[java.lang.String]
  var `type`: java.lang.String
  var version: java.lang.String
}

object ChampionListDto {
  @scala.inline
  def apply(
    data: org.scalablytyped.runtime.StringDictionary[ChampionDto],
    format: java.lang.String,
    keys: org.scalablytyped.runtime.StringDictionary[java.lang.String],
    `type`: java.lang.String,
    version: java.lang.String
  ): ChampionListDto = {
    val __obj = js.Dynamic.literal(data = data, format = format, keys = keys, version = version)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[ChampionListDto]
  }
}

