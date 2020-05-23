package typings.request.mod

import typings.request.anon.Body
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Multipart extends js.Object {
  var chunked: js.UndefOr[Boolean] = js.undefined
  var data: js.UndefOr[js.Array[Body]] = js.undefined
}

object Multipart {
  @scala.inline
  def apply(chunked: js.UndefOr[Boolean] = js.undefined, data: js.Array[Body] = null): Multipart = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(chunked)) __obj.updateDynamic("chunked")(chunked.get.asInstanceOf[js.Any])
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    __obj.asInstanceOf[Multipart]
  }
}

