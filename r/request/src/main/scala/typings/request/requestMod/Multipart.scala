package typings.request.requestMod

import typings.request.Anon_Body
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Multipart extends js.Object {
  var chunked: js.UndefOr[Boolean] = js.undefined
  var data: js.UndefOr[js.Array[Anon_Body]] = js.undefined
}

object Multipart {
  @scala.inline
  def apply(chunked: js.UndefOr[Boolean] = js.undefined, data: js.Array[Anon_Body] = null): Multipart = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(chunked)) __obj.updateDynamic("chunked")(chunked.asInstanceOf[js.Any])
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    __obj.asInstanceOf[Multipart]
  }
}

