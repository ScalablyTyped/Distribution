package typings.spex.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Cb extends js.Object {
  var cb: js.UndefOr[
    js.Function4[/* index */ Double, /* success */ Boolean, /* result */ js.Any, /* delay */ Double, _]
  ] = js.undefined
}

object Cb {
  @scala.inline
  def apply(
    cb: (/* index */ Double, /* success */ Boolean, /* result */ js.Any, /* delay */ Double) => _ = null
  ): Cb = {
    val __obj = js.Dynamic.literal()
    if (cb != null) __obj.updateDynamic("cb")(js.Any.fromFunction4(cb))
    __obj.asInstanceOf[Cb]
  }
}

