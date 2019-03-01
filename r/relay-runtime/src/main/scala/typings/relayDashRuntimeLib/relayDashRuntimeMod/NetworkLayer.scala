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
    sendMutation: js.Function1[RelayMutationRequest, js.Promise[_] | scala.Null],
    sendQueries: js.Function1[js.Array[RelayQueryRequest], js.Promise[_] | scala.Null],
    supports: js.Function1[/* repeated */ java.lang.String, scala.Boolean]
  ): NetworkLayer = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("sendMutation")(sendMutation)
    __obj.updateDynamic("sendQueries")(sendQueries)
    __obj.updateDynamic("supports")(supports)
    __obj.asInstanceOf[NetworkLayer]
  }
}

