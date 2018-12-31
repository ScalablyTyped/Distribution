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

