package typings
package sarifLib.sarifMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Message extends js.Object {
  /**
    * An array of strings to substitute into the message string.
    */
  var arguments: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  /**
    * A Markdown message string.
    */
  var markdown: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The message identifier for this message.
    */
  var messageId: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Key/value pairs that provide additional information about the message.
    */
  var properties: js.UndefOr[PropertyBag] = js.undefined
  /**
    * A plain text message string.
    */
  var text: js.UndefOr[java.lang.String] = js.undefined
}

object Message {
  @scala.inline
  def apply(
    arguments: js.Array[java.lang.String] = null,
    markdown: java.lang.String = null,
    messageId: java.lang.String = null,
    properties: PropertyBag = null,
    text: java.lang.String = null
  ): Message = {
    val __obj = js.Dynamic.literal()
    if (arguments != null) __obj.updateDynamic("arguments")(arguments)
    if (markdown != null) __obj.updateDynamic("markdown")(markdown)
    if (messageId != null) __obj.updateDynamic("messageId")(messageId)
    if (properties != null) __obj.updateDynamic("properties")(properties)
    if (text != null) __obj.updateDynamic("text")(text)
    __obj.asInstanceOf[Message]
  }
}

