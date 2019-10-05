package typings.riotDashGamesDashApi.RiotGamesAPI.LolStatus

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Translation extends js.Object {
  var content: String
  var locale: String
  var updated_at: String
}

object Translation {
  @scala.inline
  def apply(content: String, locale: String, updated_at: String): Translation = {
    val __obj = js.Dynamic.literal(content = content, locale = locale, updated_at = updated_at)
  
    __obj.asInstanceOf[Translation]
  }
}

