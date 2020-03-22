package typings.serializeError.mod

import org.scalablytyped.runtime.StringDictionary
import typings.typeFest.basicMod.JsonValue
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined {  name ? :string,   stack ? :string,   message ? :string,   code ? :string} & type-fest.type-fest.JsonObject */
trait ErrorObject extends /* key */ StringDictionary[JsonValue] {
  var code: js.UndefOr[String] = js.undefined
  var message: js.UndefOr[String] = js.undefined
  var name: js.UndefOr[String] = js.undefined
  var stack: js.UndefOr[String] = js.undefined
}

object ErrorObject {
  @scala.inline
  def apply(
    StringDictionary: /* key */ StringDictionary[JsonValue] = null,
    code: String = null,
    message: String = null,
    name: String = null,
    stack: String = null
  ): ErrorObject = {
    val __obj = js.Dynamic.literal()
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (code != null) __obj.updateDynamic("code")(code.asInstanceOf[js.Any])
    if (message != null) __obj.updateDynamic("message")(message.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (stack != null) __obj.updateDynamic("stack")(stack.asInstanceOf[js.Any])
    __obj.asInstanceOf[ErrorObject]
  }
}

