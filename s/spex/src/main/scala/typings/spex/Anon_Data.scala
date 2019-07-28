package typings.spex

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Data extends js.Object {
  var dest: js.UndefOr[js.Function3[/* index */ Double, /* data */ js.Any, /* delay */ Double, _]] = js.undefined
  var limit: js.UndefOr[Double] = js.undefined
}

object Anon_Data {
  @scala.inline
  def apply(
    dest: (/* index */ Double, /* data */ js.Any, /* delay */ Double) => _ = null,
    limit: Int | Double = null
  ): Anon_Data = {
    val __obj = js.Dynamic.literal()
    if (dest != null) __obj.updateDynamic("dest")(js.Any.fromFunction3(dest))
    if (limit != null) __obj.updateDynamic("limit")(limit.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Data]
  }
}

