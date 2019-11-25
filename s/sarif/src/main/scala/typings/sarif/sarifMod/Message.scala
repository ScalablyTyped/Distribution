package typings.sarif.sarifMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Message extends js.Object {
  /**
    * An array of strings to substitute into the message string.
    */
  var arguments: js.UndefOr[js.Array[String]] = js.undefined
  /**
    * The identifier for this message.
    */
  var id: js.UndefOr[String] = js.undefined
  /**
    * A Markdown message string.
    */
  var markdown: js.UndefOr[String] = js.undefined
  /**
    * Key/value pairs that provide additional information about the message.
    */
  var properties: js.UndefOr[PropertyBag] = js.undefined
  /**
    * A plain text message string.
    */
  var text: js.UndefOr[String] = js.undefined
}

object Message {
  @scala.inline
  def apply(
    arguments: js.Array[String] = null,
    id: String = null,
    markdown: String = null,
    properties: PropertyBag = null,
    text: String = null
  ): Message = {
    val __obj = js.Dynamic.literal()
    if (arguments != null) __obj.updateDynamic("arguments")(arguments.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (markdown != null) __obj.updateDynamic("markdown")(markdown.asInstanceOf[js.Any])
    if (properties != null) __obj.updateDynamic("properties")(properties.asInstanceOf[js.Any])
    if (text != null) __obj.updateDynamic("text")(text.asInstanceOf[js.Any])
    __obj.asInstanceOf[Message]
  }
}

