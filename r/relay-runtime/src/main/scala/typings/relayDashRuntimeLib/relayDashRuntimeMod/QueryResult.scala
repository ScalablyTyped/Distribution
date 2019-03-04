package typings
package relayDashRuntimeLib.relayDashRuntimeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait QueryResult extends js.Object {
  var error: js.UndefOr[stdLib.Error] = js.undefined
  var ref_params: js.UndefOr[org.scalablytyped.runtime.StringDictionary[js.Any]] = js.undefined
  var response: QueryPayload
}

object QueryResult {
  @scala.inline
  def apply(
    response: QueryPayload,
    error: stdLib.Error = null,
    ref_params: org.scalablytyped.runtime.StringDictionary[js.Any] = null
  ): QueryResult = {
    val __obj = js.Dynamic.literal(response = response)
    if (error != null) __obj.updateDynamic("error")(error)
    if (ref_params != null) __obj.updateDynamic("ref_params")(ref_params)
    __obj.asInstanceOf[QueryResult]
  }
}

