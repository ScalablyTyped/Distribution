package typings.searchParams.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IKeepResponse extends js.Object {
  var keptParams: js.Object
  var querystring: String
}

object IKeepResponse {
  @scala.inline
  def apply(keptParams: js.Object, querystring: String): IKeepResponse = {
    val __obj = js.Dynamic.literal(keptParams = keptParams.asInstanceOf[js.Any], querystring = querystring.asInstanceOf[js.Any])
    __obj.asInstanceOf[IKeepResponse]
  }
}

