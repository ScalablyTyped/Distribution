package typings.scriptableIos.Contact

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EmailAddresses extends js.Object {
  var identifier: js.UndefOr[String] = js.undefined
  var label: js.UndefOr[String] = js.undefined
  var localizedLabel: js.UndefOr[String] = js.undefined
  var value: String
}

object EmailAddresses {
  @scala.inline
  def apply(value: String, identifier: String = null, label: String = null, localizedLabel: String = null): EmailAddresses = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    if (identifier != null) __obj.updateDynamic("identifier")(identifier.asInstanceOf[js.Any])
    if (label != null) __obj.updateDynamic("label")(label.asInstanceOf[js.Any])
    if (localizedLabel != null) __obj.updateDynamic("localizedLabel")(localizedLabel.asInstanceOf[js.Any])
    __obj.asInstanceOf[EmailAddresses]
  }
}

