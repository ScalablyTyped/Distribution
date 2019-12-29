package typings.reactDashFloater

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Length extends js.Object {
  var length: js.UndefOr[Double] = js.undefined
  var spread: js.UndefOr[Double] = js.undefined
}

object Anon_Length {
  @scala.inline
  def apply(length: Int | Double = null, spread: Int | Double = null): Anon_Length = {
    val __obj = js.Dynamic.literal()
    if (length != null) __obj.updateDynamic("length")(length.asInstanceOf[js.Any])
    if (spread != null) __obj.updateDynamic("spread")(spread.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Length]
  }
}

