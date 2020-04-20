package typings.riotGamesApi.RiotGamesAPI.LolStatus

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
    val __obj = js.Dynamic.literal(author = author.asInstanceOf[js.Any], content = content.asInstanceOf[js.Any], created_at = created_at.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], severity = severity.asInstanceOf[js.Any], translations = translations.asInstanceOf[js.Any], updated_at = updated_at.asInstanceOf[js.Any])
    __obj.asInstanceOf[Message]
  }
}

