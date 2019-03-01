package typings
package riotDashGamesDashApiLib.RiotGamesAPINs.LolStaticDataNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MapDataDto extends js.Object {
  var data: js.Array[org.scalablytyped.runtime.StringDictionary[MapDetailsDto]]
  var `type`: java.lang.String
  var version: java.lang.String
}

object MapDataDto {
  @scala.inline
  def apply(
    data: js.Array[org.scalablytyped.runtime.StringDictionary[MapDetailsDto]],
    `type`: java.lang.String,
    version: java.lang.String
  ): MapDataDto = {
    val __obj = js.Dynamic.literal(`type` = `type`)
    __obj.updateDynamic("data")(data)
    __obj.updateDynamic("version")(version)
    __obj.asInstanceOf[MapDataDto]
  }
}

