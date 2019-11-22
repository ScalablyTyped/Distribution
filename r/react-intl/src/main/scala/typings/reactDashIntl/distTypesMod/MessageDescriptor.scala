package typings.reactDashIntl.distTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MessageDescriptor extends js.Object {
  var defaultMessage: js.UndefOr[String] = js.undefined
  var description: js.UndefOr[String | js.Object] = js.undefined
  var id: js.UndefOr[String] = js.undefined
}

object MessageDescriptor {
  @scala.inline
  def apply(defaultMessage: String = null, description: String | js.Object = null, id: String = null): MessageDescriptor = {
    val __obj = js.Dynamic.literal()
    if (defaultMessage != null) __obj.updateDynamic("defaultMessage")(defaultMessage)
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id)
    __obj.asInstanceOf[MessageDescriptor]
  }
}

