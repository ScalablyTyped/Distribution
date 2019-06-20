package typings
package reactDashRelayLib.reactDashRelayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RelayPaginationProp extends js.Object {
  val environment: relayDashRuntimeLib.relayDashRuntimeMod.Environment = js.native
  var refetch: js.UndefOr[scala.Nothing] = js.native
  def hasMore(): scala.Boolean = js.native
  def isLoading(): scala.Boolean = js.native
  def loadMore(pageSize: scala.Double): js.UndefOr[relayDashRuntimeLib.relayDashRuntimeMod.Disposable | scala.Null] = js.native
  def loadMore(pageSize: scala.Double, observerOrCallback: ObserverOrCallback): js.UndefOr[relayDashRuntimeLib.relayDashRuntimeMod.Disposable | scala.Null] = js.native
  def loadMore(pageSize: scala.Double, observerOrCallback: ObserverOrCallback, options: RefetchOptions): js.UndefOr[relayDashRuntimeLib.relayDashRuntimeMod.Disposable | scala.Null] = js.native
  def loadMore(pageSize: scala.Double, observerOrCallback: scala.Null, options: RefetchOptions): js.UndefOr[relayDashRuntimeLib.relayDashRuntimeMod.Disposable | scala.Null] = js.native
  def refetchConnection(totalCount: scala.Double): js.UndefOr[relayDashRuntimeLib.relayDashRuntimeMod.Disposable | scala.Null] = js.native
  def refetchConnection(totalCount: scala.Double, observerOrCallback: ObserverOrCallback): js.UndefOr[relayDashRuntimeLib.relayDashRuntimeMod.Disposable | scala.Null] = js.native
  def refetchConnection(
    totalCount: scala.Double,
    observerOrCallback: ObserverOrCallback,
    refetchVariables: relayDashRuntimeLib.relayDashRuntimeMod.Variables
  ): js.UndefOr[relayDashRuntimeLib.relayDashRuntimeMod.Disposable | scala.Null] = js.native
  def refetchConnection(
    totalCount: scala.Double,
    observerOrCallback: scala.Null,
    refetchVariables: relayDashRuntimeLib.relayDashRuntimeMod.Variables
  ): js.UndefOr[relayDashRuntimeLib.relayDashRuntimeMod.Disposable | scala.Null] = js.native
}

