package typings.reactDashIntl.distTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MessageDescriptor extends js.Object {
  var defaultMessage: js.UndefOr[String] = js.undefined
  var description: js.UndefOr[String | js.Object] = js.undefined
  var id: String
}

object MessageDescriptor {
  @scala.inline
  def apply(id: String, defaultMessage: String = null, description: String | js.Object = null): MessageDescriptor = {
    val __obj = js.Dynamic.literal(id = id)
    if (defaultMessage != null) __obj.updateDynamic("defaultMessage")(defaultMessage)
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    __obj.asInstanceOf[MessageDescriptor]
  }
}

