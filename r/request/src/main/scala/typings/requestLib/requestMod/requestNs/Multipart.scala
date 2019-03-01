package typings
package requestLib.requestMod.requestNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Multipart extends js.Object {
  var chunked: js.UndefOr[scala.Boolean] = js.undefined
  var data: js.UndefOr[js.Array[requestLib.Anon_Body]] = js.undefined
}

object Multipart {
  @scala.inline
  def apply(chunked: js.UndefOr[scala.Boolean] = js.undefined, data: js.Array[requestLib.Anon_Body] = null): Multipart = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(chunked)) __obj.updateDynamic("chunked")(chunked)
    if (data != null) __obj.updateDynamic("data")(data)
    __obj.asInstanceOf[Multipart]
  }
}

