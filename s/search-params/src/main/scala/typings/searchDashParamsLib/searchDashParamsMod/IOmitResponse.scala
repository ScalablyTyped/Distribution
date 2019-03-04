package typings
package searchDashParamsLib.searchDashParamsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IOmitResponse extends js.Object {
  var querystring: java.lang.String
  var removedParams: js.Object
}

object IOmitResponse {
  @scala.inline
  def apply(querystring: java.lang.String, removedParams: js.Object): IOmitResponse = {
    val __obj = js.Dynamic.literal(querystring = querystring, removedParams = removedParams)
  
    __obj.asInstanceOf[IOmitResponse]
  }
}

