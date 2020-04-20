package typings.searchParams.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IOmitResponse extends js.Object {
  var querystring: String
  var removedParams: js.Object
}

object IOmitResponse {
  @scala.inline
  def apply(querystring: String, removedParams: js.Object): IOmitResponse = {
    val __obj = js.Dynamic.literal(querystring = querystring.asInstanceOf[js.Any], removedParams = removedParams.asInstanceOf[js.Any])
    __obj.asInstanceOf[IOmitResponse]
  }
}

