package typings.protonNative

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonTitle extends js.Object {
  var description: String
  var title: js.UndefOr[String] = js.undefined
}

object AnonTitle {
  @scala.inline
  def apply(description: String, title: String = null): AnonTitle = {
    val __obj = js.Dynamic.literal(description = description.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonTitle]
  }
}

