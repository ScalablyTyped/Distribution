package typings
package standardDashErrorLib.standardDashErrorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StandardError
  extends stdLib.Error
     with /* key */ org.scalablytyped.runtime.StringDictionary[js.Any]

object StandardError {
  @scala.inline
  def apply(
    message: java.lang.String,
    name: java.lang.String,
    StringDictionary: /* key */ org.scalablytyped.runtime.StringDictionary[js.Any] = null,
    stack: java.lang.String = null
  ): StandardError = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("message")(message)
    __obj.updateDynamic("name")(name)
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (stack != null) __obj.updateDynamic("stack")(stack)
    __obj.asInstanceOf[StandardError]
  }
}

