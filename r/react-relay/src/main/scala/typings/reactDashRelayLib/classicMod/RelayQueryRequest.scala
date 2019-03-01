package typings
package reactDashRelayLib.classicMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RelayQueryRequest extends js.Object {
  def getDebugName(): java.lang.String
  def getID(): java.lang.String
  def getQueryString(): java.lang.String
  def getVariables(): RelayVariables
  def reject(errors: js.Any): js.Any
  def resolve(result: RelayQueryRequestResolve): js.Any
}

object RelayQueryRequest {
  @scala.inline
  def apply(
    getDebugName: js.Function0[java.lang.String],
    getID: js.Function0[java.lang.String],
    getQueryString: js.Function0[java.lang.String],
    getVariables: js.Function0[RelayVariables],
    reject: js.Function1[js.Any, js.Any],
    resolve: js.Function1[RelayQueryRequestResolve, js.Any]
  ): RelayQueryRequest = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("getDebugName")(getDebugName)
    __obj.updateDynamic("getID")(getID)
    __obj.updateDynamic("getQueryString")(getQueryString)
    __obj.updateDynamic("getVariables")(getVariables)
    __obj.updateDynamic("reject")(reject)
    __obj.updateDynamic("resolve")(resolve)
    __obj.asInstanceOf[RelayQueryRequest]
  }
}

