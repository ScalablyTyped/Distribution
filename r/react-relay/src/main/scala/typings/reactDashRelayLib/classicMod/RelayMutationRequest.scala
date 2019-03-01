package typings
package reactDashRelayLib.classicMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RelayMutationRequest extends js.Object {
  def getQueryString(): java.lang.String
  def getVariables(): RelayVariables
  def reject(errors: js.Any): js.Any
  def resolve(result: RelayQueryRequestResolve): js.Any
}

object RelayMutationRequest {
  @scala.inline
  def apply(
    getQueryString: js.Function0[java.lang.String],
    getVariables: js.Function0[RelayVariables],
    reject: js.Function1[js.Any, js.Any],
    resolve: js.Function1[RelayQueryRequestResolve, js.Any]
  ): RelayMutationRequest = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("getQueryString")(getQueryString)
    __obj.updateDynamic("getVariables")(getVariables)
    __obj.updateDynamic("reject")(reject)
    __obj.updateDynamic("resolve")(resolve)
    __obj.asInstanceOf[RelayMutationRequest]
  }
}

