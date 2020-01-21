package typings.protonNative

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonDescription extends js.Object {
  var description: js.UndefOr[String] = js.undefined
  var title: String
}

object AnonDescription {
  @scala.inline
  def apply(title: String, description: String = null): AnonDescription = {
    val __obj = js.Dynamic.literal(title = title.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonDescription]
  }
}

