package typings.restling.restlingMod

import typings.node.httpMod.ServerResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RestlingResult extends js.Object {
  var data: js.UndefOr[js.Any] = js.undefined
  var response: js.UndefOr[ServerResponse] = js.undefined
}

object RestlingResult {
  @scala.inline
  def apply(data: js.Any = null, response: ServerResponse = null): RestlingResult = {
    val __obj = js.Dynamic.literal()
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (response != null) __obj.updateDynamic("response")(response.asInstanceOf[js.Any])
    __obj.asInstanceOf[RestlingResult]
  }
}

