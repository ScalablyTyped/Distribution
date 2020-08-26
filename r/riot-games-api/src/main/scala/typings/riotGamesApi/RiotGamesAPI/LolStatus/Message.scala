package typings.riotGamesApi.RiotGamesAPI.LolStatus

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Message extends js.Object {
  var author: String = js.native
  var content: String = js.native
  var created_at: String = js.native
  var id: Double = js.native
  var severity: String = js.native
  var translations: js.Array[Translation] = js.native
  var updated_at: String = js.native
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
  @scala.inline
  implicit class MessageOps[Self <: Message] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAuthor(value: String): Self = this.set("author", value.asInstanceOf[js.Any])
    @scala.inline
    def setContent(value: String): Self = this.set("content", value.asInstanceOf[js.Any])
    @scala.inline
    def setCreated_at(value: String): Self = this.set("created_at", value.asInstanceOf[js.Any])
    @scala.inline
    def setId(value: Double): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def setSeverity(value: String): Self = this.set("severity", value.asInstanceOf[js.Any])
    @scala.inline
    def setTranslationsVarargs(value: Translation*): Self = this.set("translations", js.Array(value :_*))
    @scala.inline
    def setTranslations(value: js.Array[Translation]): Self = this.set("translations", value.asInstanceOf[js.Any])
    @scala.inline
    def setUpdated_at(value: String): Self = this.set("updated_at", value.asInstanceOf[js.Any])
  }
  
}

