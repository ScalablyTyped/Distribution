package typings
package riotDashGamesDashApiLib.RiotGamesAPINs.LolStaticDataNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RuneListDto extends js.Object {
  var basic: BasicDataDto
  var data: js.Array[org.scalablytyped.runtime.StringDictionary[RuneDto]]
  var `type`: java.lang.String
  var version: java.lang.String
}

object RuneListDto {
  @scala.inline
  def apply(
    basic: BasicDataDto,
    data: js.Array[org.scalablytyped.runtime.StringDictionary[RuneDto]],
    `type`: java.lang.String,
    version: java.lang.String
  ): RuneListDto = {
    val __obj = js.Dynamic.literal(`type` = `type`)
    __obj.updateDynamic("basic")(basic)
    __obj.updateDynamic("data")(data)
    __obj.updateDynamic("version")(version)
    __obj.asInstanceOf[RuneListDto]
  }
}

