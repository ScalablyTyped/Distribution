package typings
package reactDashRelayLib.classicMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-relay/classic", "RelayMutationTransaction")
@js.native
class RelayMutationTransaction () extends js.Object {
  def applyOptimistic(): RelayMutationTransaction = js.native
  def commit(): RelayMutationTransaction | scala.Null = js.native
  def getError(): stdLib.Error = js.native
  def getHash(): java.lang.String = js.native
  def getID(): ClientMutationID = js.native
  def getStatus(): RelayMutationStatus = js.native
  def recommit(): scala.Unit = js.native
  def rollback(): scala.Unit = js.native
}

