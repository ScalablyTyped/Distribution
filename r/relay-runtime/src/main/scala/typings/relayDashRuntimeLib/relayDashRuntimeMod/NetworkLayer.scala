package typings
package relayDashRuntimeLib.relayDashRuntimeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NetworkLayer extends js.Object {
  def sendMutation(request: RelayMutationRequest): js.Promise[_] | scala.Null
  def sendQueries(requests: js.Array[RelayQueryRequest]): js.Promise[_] | scala.Null
  def supports(options: java.lang.String*): scala.Boolean
}

object NetworkLayer {
  @scala.inline
  def apply(
    sendMutation: RelayMutationRequest => js.Promise[_] | scala.Null,
    sendQueries: js.Array[RelayQueryRequest] => js.Promise[_] | scala.Null,
    supports: /* repeated */ java.lang.String => scala.Boolean
  ): NetworkLayer = {
    val __obj = js.Dynamic.literal(sendMutation = js.Any.fromFunction1(sendMutation), sendQueries = js.Any.fromFunction1(sendQueries), supports = js.Any.fromFunction1(supports))
  
    __obj.asInstanceOf[NetworkLayer]
  }
}

