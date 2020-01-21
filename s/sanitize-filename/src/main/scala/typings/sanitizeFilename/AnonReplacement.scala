package typings.sanitizeFilename

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonReplacement extends js.Object {
  var replacement: js.UndefOr[String | (js.Function1[/* substring */ String, String])] = js.undefined
}

object AnonReplacement {
  @scala.inline
  def apply(replacement: String | (js.Function1[/* substring */ String, String]) = null): AnonReplacement = {
    val __obj = js.Dynamic.literal()
    if (replacement != null) __obj.updateDynamic("replacement")(replacement.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonReplacement]
  }
}

