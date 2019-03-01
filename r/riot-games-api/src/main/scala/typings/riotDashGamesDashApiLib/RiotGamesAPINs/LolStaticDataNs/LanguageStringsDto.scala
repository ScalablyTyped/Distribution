package typings
package riotDashGamesDashApiLib.RiotGamesAPINs.LolStaticDataNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LanguageStringsDto extends js.Object {
  var data: js.Array[org.scalablytyped.runtime.StringDictionary[java.lang.String]]
  var `type`: java.lang.String
  var version: java.lang.String
}

object LanguageStringsDto {
  @scala.inline
  def apply(
    data: js.Array[org.scalablytyped.runtime.StringDictionary[java.lang.String]],
    `type`: java.lang.String,
    version: java.lang.String
  ): LanguageStringsDto = {
    val __obj = js.Dynamic.literal(`type` = `type`)
    __obj.updateDynamic("data")(data)
    __obj.updateDynamic("version")(version)
    __obj.asInstanceOf[LanguageStringsDto]
  }
}

