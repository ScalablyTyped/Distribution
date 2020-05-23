package typings.sipJs.anon

import typings.sipJs.coreMod.URI
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FromDisplayName extends js.Object {
  var fromDisplayName: js.UndefOr[String] = js.undefined
  var fromTag: js.UndefOr[String] = js.undefined
  var fromUri: js.UndefOr[String | URI] = js.undefined
  var toDisplayName: js.UndefOr[String] = js.undefined
  var toUri: js.UndefOr[String | URI] = js.undefined
}

object FromDisplayName {
  @scala.inline
  def apply(
    fromDisplayName: String = null,
    fromTag: String = null,
    fromUri: String | URI = null,
    toDisplayName: String = null,
    toUri: String | URI = null
  ): FromDisplayName = {
    val __obj = js.Dynamic.literal()
    if (fromDisplayName != null) __obj.updateDynamic("fromDisplayName")(fromDisplayName.asInstanceOf[js.Any])
    if (fromTag != null) __obj.updateDynamic("fromTag")(fromTag.asInstanceOf[js.Any])
    if (fromUri != null) __obj.updateDynamic("fromUri")(fromUri.asInstanceOf[js.Any])
    if (toDisplayName != null) __obj.updateDynamic("toDisplayName")(toDisplayName.asInstanceOf[js.Any])
    if (toUri != null) __obj.updateDynamic("toUri")(toUri.asInstanceOf[js.Any])
    __obj.asInstanceOf[FromDisplayName]
  }
}

