package typings.simplSchema.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SimpleSchemaValidationError extends /* key */ StringDictionary[Double | String] {
  var `type`: String
}

object SimpleSchemaValidationError {
  @scala.inline
  def apply(`type`: String, StringDictionary: /* key */ StringDictionary[Double | String] = null): SimpleSchemaValidationError = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[SimpleSchemaValidationError]
  }
}

