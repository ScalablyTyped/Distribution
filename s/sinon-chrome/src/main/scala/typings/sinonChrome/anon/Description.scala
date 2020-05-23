package typings.sinonChrome.anon

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Description extends js.Object {
  var description: js.UndefOr[String] = js.undefined
  var message: String
  var placeholders: js.UndefOr[StringDictionary[Content]] = js.undefined
}

object Description {
  @scala.inline
  def apply(message: String, description: String = null, placeholders: StringDictionary[Content] = null): Description = {
    val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (placeholders != null) __obj.updateDynamic("placeholders")(placeholders.asInstanceOf[js.Any])
    __obj.asInstanceOf[Description]
  }
}

