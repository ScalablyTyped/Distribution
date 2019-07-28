package typings.sinonDashChrome

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Description extends js.Object {
  var description: js.UndefOr[String] = js.undefined
  var message: String
  var placeholders: js.UndefOr[StringDictionary[Anon_Content]] = js.undefined
}

object Anon_Description {
  @scala.inline
  def apply(message: String, description: String = null, placeholders: StringDictionary[Anon_Content] = null): Anon_Description = {
    val __obj = js.Dynamic.literal(message = message)
    if (description != null) __obj.updateDynamic("description")(description)
    if (placeholders != null) __obj.updateDynamic("placeholders")(placeholders)
    __obj.asInstanceOf[Anon_Description]
  }
}

