package typings.sinonChrome

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonDescription extends js.Object {
  var description: js.UndefOr[String] = js.undefined
  var message: String
  var placeholders: js.UndefOr[StringDictionary[AnonContent]] = js.undefined
}

object AnonDescription {
  @scala.inline
  def apply(message: String, description: String = null, placeholders: StringDictionary[AnonContent] = null): AnonDescription = {
    val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (placeholders != null) __obj.updateDynamic("placeholders")(placeholders.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonDescription]
  }
}

