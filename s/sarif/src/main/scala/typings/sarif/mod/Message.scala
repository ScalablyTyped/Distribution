package typings.sarif.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Message extends js.Object {
  /**
    * An array of strings to substitute into the message string.
    */
  var arguments: js.UndefOr[js.Array[String]] = js.native
  /**
    * The identifier for this message.
    */
  var id: js.UndefOr[String] = js.native
  /**
    * A Markdown message string.
    */
  var markdown: js.UndefOr[String] = js.native
  /**
    * Key/value pairs that provide additional information about the message.
    */
  var properties: js.UndefOr[PropertyBag] = js.native
  /**
    * A plain text message string.
    */
  var text: js.UndefOr[String] = js.native
}

object Message {
  @scala.inline
  def apply(): Message = {
    val __obj = js.Dynamic.literal()
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
    def setArgumentsVarargs(value: String*): Self = this.set("arguments", js.Array(value :_*))
    @scala.inline
    def setArguments(value: js.Array[String]): Self = this.set("arguments", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteArguments: Self = this.set("arguments", js.undefined)
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    @scala.inline
    def setMarkdown(value: String): Self = this.set("markdown", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMarkdown: Self = this.set("markdown", js.undefined)
    @scala.inline
    def setProperties(value: PropertyBag): Self = this.set("properties", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProperties: Self = this.set("properties", js.undefined)
    @scala.inline
    def setText(value: String): Self = this.set("text", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteText: Self = this.set("text", js.undefined)
  }
  
}

