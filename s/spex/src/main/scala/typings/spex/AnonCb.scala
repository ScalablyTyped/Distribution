package typings.spex

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonCb extends js.Object {
  var cb: js.UndefOr[
    js.Function4[/* index */ Double, /* success */ Boolean, /* result */ js.Any, /* delay */ Double, _]
  ] = js.undefined
}

object AnonCb {
  @scala.inline
  def apply(
    cb: (/* index */ Double, /* success */ Boolean, /* result */ js.Any, /* delay */ Double) => _ = null
  ): AnonCb = {
    val __obj = js.Dynamic.literal()
    if (cb != null) __obj.updateDynamic("cb")(js.Any.fromFunction4(cb))
    __obj.asInstanceOf[AnonCb]
  }
}

