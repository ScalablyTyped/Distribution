package typings.ssri

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonSep extends js.Object {
  var sep: js.UndefOr[String] = js.undefined
  var strict: js.UndefOr[Boolean] = js.undefined
}

object AnonSep {
  @scala.inline
  def apply(sep: String = null, strict: js.UndefOr[Boolean] = js.undefined): AnonSep = {
    val __obj = js.Dynamic.literal()
    if (sep != null) __obj.updateDynamic("sep")(sep.asInstanceOf[js.Any])
    if (!js.isUndefined(strict)) __obj.updateDynamic("strict")(strict.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonSep]
  }
}

