package typings
package searchDashParamsLib.searchDashParamsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IKeepResponse extends js.Object {
  var keptParams: js.Object
  var querystring: java.lang.String
}

object IKeepResponse {
  @scala.inline
  def apply(keptParams: js.Object, querystring: java.lang.String): IKeepResponse = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("keptParams")(keptParams)
    __obj.updateDynamic("querystring")(querystring)
    __obj.asInstanceOf[IKeepResponse]
  }
}

