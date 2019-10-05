package typings.riotDashGamesDashApi.RiotGamesAPI.LolStatus

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Message extends js.Object {
  var author: String
  var content: String
  var created_at: String
  var id: Double
  var severity: String
  var translations: js.Array[Translation]
  var updated_at: String
}

object Message {
  @scala.inline
  def apply(
    author: String,
    content: String,
    created_at: String,
    id: Double,
    severity: String,
    translations: js.Array[Translation],
    updated_at: String
  ): Message = {
    val __obj = js.Dynamic.literal(author = author, content = content, created_at = created_at, id = id, severity = severity, translations = translations, updated_at = updated_at)
  
    __obj.asInstanceOf[Message]
  }
}

