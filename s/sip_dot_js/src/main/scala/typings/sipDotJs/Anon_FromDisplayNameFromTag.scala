package typings.sipDotJs

import typings.sipDotJs.libCoreMod.URI
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_FromDisplayNameFromTag extends js.Object {
  var fromDisplayName: js.UndefOr[String] = js.undefined
  var fromTag: js.UndefOr[String] = js.undefined
  var fromUri: js.UndefOr[URI] = js.undefined
  var toDisplayName: js.UndefOr[String] = js.undefined
  var toUri: js.UndefOr[URI] = js.undefined
}

object Anon_FromDisplayNameFromTag {
  @scala.inline
  def apply(
    fromDisplayName: String = null,
    fromTag: String = null,
    fromUri: URI = null,
    toDisplayName: String = null,
    toUri: URI = null
  ): Anon_FromDisplayNameFromTag = {
    val __obj = js.Dynamic.literal()
    if (fromDisplayName != null) __obj.updateDynamic("fromDisplayName")(fromDisplayName.asInstanceOf[js.Any])
    if (fromTag != null) __obj.updateDynamic("fromTag")(fromTag.asInstanceOf[js.Any])
    if (fromUri != null) __obj.updateDynamic("fromUri")(fromUri.asInstanceOf[js.Any])
    if (toDisplayName != null) __obj.updateDynamic("toDisplayName")(toDisplayName.asInstanceOf[js.Any])
    if (toUri != null) __obj.updateDynamic("toUri")(toUri.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_FromDisplayNameFromTag]
  }
}

