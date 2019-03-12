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
    getQueryString: () => java.lang.String,
    getVariables: () => RelayVariables,
    reject: js.Any => js.Any,
    resolve: RelayQueryRequestResolve => js.Any
  ): RelayMutationRequest = {
    val __obj = js.Dynamic.literal(getQueryString = js.Any.fromFunction0(getQueryString), getVariables = js.Any.fromFunction0(getVariables), reject = js.Any.fromFunction1(reject), resolve = js.Any.fromFunction1(resolve))
  
    __obj.asInstanceOf[RelayMutationRequest]
  }
}

