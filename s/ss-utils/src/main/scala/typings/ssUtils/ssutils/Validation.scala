package typings.ssUtils.ssutils

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Validation extends js.Object {
  var messages: StringDictionary[String]
  var overrideMessages: Boolean
  def errorFilter(errorMsg: String, errorCode: String, `type`: String): Unit
}

object Validation {
  @scala.inline
  def apply(
    errorFilter: (String, String, String) => Unit,
    messages: StringDictionary[String],
    overrideMessages: Boolean
  ): Validation = {
    val __obj = js.Dynamic.literal(errorFilter = js.Any.fromFunction3(errorFilter), messages = messages.asInstanceOf[js.Any], overrideMessages = overrideMessages.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Validation]
  }
}

