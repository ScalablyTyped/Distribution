package typings
package reactDashRelayLib.classicMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RelayProp[V] extends js.Object {
  val pendingVariables: js.UndefOr[V] = js.native
  val route: reactDashRelayLib.Anon_Name = js.native
   // incomplete, also has params and queries
  val variables: V = js.native
  def commitUpdate(mutation: Mutation[_, _]): js.Any = js.native
  def commitUpdate(mutation: Mutation[_, _], callbacks: StoreUpdateCallbacks[_]): js.Any = js.native
  def forceFetch(variables: V): scala.Unit = js.native
  def forceFetch(variables: V, onReadyStateChange: OnReadyStateChange): scala.Unit = js.native
  def getPendingTransactions(record: js.Any): js.Array[RelayMutationTransaction] = js.native
  def hasOptimisticUpdate(record: js.Any): scala.Boolean = js.native
  def setVariables(variables: V): scala.Unit = js.native
  def setVariables(variables: V, onReadyStateChange: OnReadyStateChange): scala.Unit = js.native
}

