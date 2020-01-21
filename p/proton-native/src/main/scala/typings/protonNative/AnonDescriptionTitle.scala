package typings.protonNative

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonDescriptionTitle extends js.Object {
  var description: String
  var title: js.UndefOr[String] = js.undefined
}

object AnonDescriptionTitle {
  @scala.inline
  def apply(description: String, title: String = null): AnonDescriptionTitle = {
    val __obj = js.Dynamic.literal(description = description.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonDescriptionTitle]
  }
}

