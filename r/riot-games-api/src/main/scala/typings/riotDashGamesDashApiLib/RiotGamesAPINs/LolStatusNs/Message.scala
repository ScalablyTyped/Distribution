package typings
package riotDashGamesDashApiLib.RiotGamesAPINs.LolStatusNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Message extends js.Object {
  var author: java.lang.String
  var content: java.lang.String
  var created_at: java.lang.String
  var id: scala.Double
  var severity: java.lang.String
  var translations: js.Array[Translation]
  var updated_at: java.lang.String
}

object Message {
  @scala.inline
  def apply(
    author: java.lang.String,
    content: java.lang.String,
    created_at: java.lang.String,
    id: scala.Double,
    severity: java.lang.String,
    translations: js.Array[Translation],
    updated_at: java.lang.String
  ): Message = {
    val __obj = js.Dynamic.literal(author = author, content = content, created_at = created_at, id = id, severity = severity, translations = translations, updated_at = updated_at)
  
    __obj.asInstanceOf[Message]
  }
}

