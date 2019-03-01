package typings
package spexLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Data extends js.Object {
  var dest: js.UndefOr[
    js.Function3[/* index */ scala.Double, /* data */ js.Any, /* delay */ scala.Double, _]
  ] = js.undefined
  var limit: js.UndefOr[scala.Double] = js.undefined
}

object Anon_Data {
  @scala.inline
  def apply(
    dest: js.Function3[/* index */ scala.Double, /* data */ js.Any, /* delay */ scala.Double, _] = null,
    limit: scala.Int | scala.Double = null
  ): Anon_Data = {
    val __obj = js.Dynamic.literal()
    if (dest != null) __obj.updateDynamic("dest")(dest)
    if (limit != null) __obj.updateDynamic("limit")(limit.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Data]
  }
}

