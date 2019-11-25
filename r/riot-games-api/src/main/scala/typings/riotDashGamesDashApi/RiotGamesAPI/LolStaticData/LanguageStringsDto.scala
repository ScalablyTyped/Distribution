package typings.riotDashGamesDashApi.RiotGamesAPI.LolStaticData

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LanguageStringsDto extends js.Object {
  var data: js.Array[StringDictionary[String]]
  var `type`: String
  var version: String
}

object LanguageStringsDto {
  @scala.inline
  def apply(data: js.Array[StringDictionary[String]], `type`: String, version: String): LanguageStringsDto = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[LanguageStringsDto]
  }
}

