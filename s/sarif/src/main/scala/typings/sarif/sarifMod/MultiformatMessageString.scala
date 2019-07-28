package typings.sarif.sarifMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MultiformatMessageString extends js.Object {
  /**
    * A Markdown message string or format string.
    */
  var markdown: js.UndefOr[String] = js.undefined
  /**
    * Key/value pairs that provide additional information about the message.
    */
  var properties: js.UndefOr[PropertyBag] = js.undefined
  /**
    * A plain text message string or format string.
    */
  var text: String
}

object MultiformatMessageString {
  @scala.inline
  def apply(text: String, markdown: String = null, properties: PropertyBag = null): MultiformatMessageString = {
    val __obj = js.Dynamic.literal(text = text)
    if (markdown != null) __obj.updateDynamic("markdown")(markdown)
    if (properties != null) __obj.updateDynamic("properties")(properties)
    __obj.asInstanceOf[MultiformatMessageString]
  }
}

