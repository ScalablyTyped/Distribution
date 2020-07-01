package typings.shellQuote.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParseOptions extends js.Object {
  /**
    * Custom escape character, default value is `\`
    */
  var escape: js.UndefOr[String] = js.undefined
}

object ParseOptions {
  @scala.inline
  def apply(escape: String = null): ParseOptions = {
    val __obj = js.Dynamic.literal()
    if (escape != null) __obj.updateDynamic("escape")(escape.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParseOptions]
  }
}

