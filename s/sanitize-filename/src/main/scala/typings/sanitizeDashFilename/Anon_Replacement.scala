package typings.sanitizeDashFilename

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Replacement extends js.Object {
  var replacement: js.UndefOr[String | (js.Function1[/* substring */ String, String])] = js.undefined
}

object Anon_Replacement {
  @scala.inline
  def apply(replacement: String | (js.Function1[/* substring */ String, String]) = null): Anon_Replacement = {
    val __obj = js.Dynamic.literal()
    if (replacement != null) __obj.updateDynamic("replacement")(replacement.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Replacement]
  }
}

