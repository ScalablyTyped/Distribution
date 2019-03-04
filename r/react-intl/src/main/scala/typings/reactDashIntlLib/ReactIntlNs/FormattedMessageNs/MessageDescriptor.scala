package typings
package reactDashIntlLib.ReactIntlNs.FormattedMessageNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MessageDescriptor extends js.Object {
  var defaultMessage: js.UndefOr[java.lang.String] = js.undefined
  var description: js.UndefOr[java.lang.String] = js.undefined
  var id: java.lang.String
}

object MessageDescriptor {
  @scala.inline
  def apply(
    id: java.lang.String,
    defaultMessage: java.lang.String = null,
    description: java.lang.String = null
  ): MessageDescriptor = {
    val __obj = js.Dynamic.literal(id = id)
    if (defaultMessage != null) __obj.updateDynamic("defaultMessage")(defaultMessage)
    if (description != null) __obj.updateDynamic("description")(description)
    __obj.asInstanceOf[MessageDescriptor]
  }
}

