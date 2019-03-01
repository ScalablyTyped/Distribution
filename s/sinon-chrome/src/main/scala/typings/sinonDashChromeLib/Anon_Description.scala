package typings
package sinonDashChromeLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Description extends js.Object {
  var description: js.UndefOr[java.lang.String] = js.undefined
  var message: java.lang.String
  var placeholders: js.UndefOr[org.scalablytyped.runtime.StringDictionary[Anon_Content]] = js.undefined
}

object Anon_Description {
  @scala.inline
  def apply(
    message: java.lang.String,
    description: java.lang.String = null,
    placeholders: org.scalablytyped.runtime.StringDictionary[Anon_Content] = null
  ): Anon_Description = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("message")(message)
    if (description != null) __obj.updateDynamic("description")(description)
    if (placeholders != null) __obj.updateDynamic("placeholders")(placeholders)
    __obj.asInstanceOf[Anon_Description]
  }
}

