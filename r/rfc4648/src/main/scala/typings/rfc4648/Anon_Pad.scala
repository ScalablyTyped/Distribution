package typings.rfc4648

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Pad extends js.Object {
  var pad: js.UndefOr[Boolean] = js.undefined
}

object Anon_Pad {
  @scala.inline
  def apply(pad: js.UndefOr[Boolean] = js.undefined): Anon_Pad = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(pad)) __obj.updateDynamic("pad")(pad)
    __obj.asInstanceOf[Anon_Pad]
  }
}

