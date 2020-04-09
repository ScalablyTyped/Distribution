package typings.recurlyRecurlyJs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonDisplayName extends js.Object {
  var displayName: js.UndefOr[String] = js.undefined
}

object AnonDisplayName {
  @scala.inline
  def apply(displayName: String = null): AnonDisplayName = {
    val __obj = js.Dynamic.literal()
    if (displayName != null) __obj.updateDynamic("displayName")(displayName.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonDisplayName]
  }
}

