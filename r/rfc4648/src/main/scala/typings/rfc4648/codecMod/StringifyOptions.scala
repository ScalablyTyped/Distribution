package typings.rfc4648.codecMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StringifyOptions extends js.Object {
  var pad: js.UndefOr[Boolean] = js.undefined
}

object StringifyOptions {
  @scala.inline
  def apply(pad: js.UndefOr[Boolean] = js.undefined): StringifyOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(pad)) __obj.updateDynamic("pad")(pad.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[StringifyOptions]
  }
}

