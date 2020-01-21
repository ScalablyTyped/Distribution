package typings.sipJs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonScheme extends js.Object {
  var scheme: js.UndefOr[String] = js.undefined
  var sipUri: js.UndefOr[String] = js.undefined
}

object AnonScheme {
  @scala.inline
  def apply(scheme: String = null, sipUri: String = null): AnonScheme = {
    val __obj = js.Dynamic.literal()
    if (scheme != null) __obj.updateDynamic("scheme")(scheme.asInstanceOf[js.Any])
    if (sipUri != null) __obj.updateDynamic("sipUri")(sipUri.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonScheme]
  }
}

