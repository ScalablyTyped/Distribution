package typings
package reactDashRelayLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_Callback extends js.Object {
  def hasMore(): scala.Boolean = js.native
  def isLoading(): scala.Boolean = js.native
  def loadMore(pageSize: scala.Double, callback: js.Function1[/* error */ js.UndefOr[stdLib.Error], scala.Unit]): js.UndefOr[relayDashRuntimeLib.relayDashRuntimeMod.Disposable | scala.Null] = js.native
  def loadMore(
    pageSize: scala.Double,
    callback: js.Function1[/* error */ js.UndefOr[stdLib.Error], scala.Unit],
    options: reactDashRelayLib.reactDashRelayMod.RefetchOptions
  ): js.UndefOr[relayDashRuntimeLib.relayDashRuntimeMod.Disposable | scala.Null] = js.native
  def refetchConnection(totalCount: scala.Double, callback: js.Function1[/* error */ js.UndefOr[stdLib.Error], scala.Unit]): js.UndefOr[relayDashRuntimeLib.relayDashRuntimeMod.Disposable | scala.Null] = js.native
  def refetchConnection(
    totalCount: scala.Double,
    callback: js.Function1[/* error */ js.UndefOr[stdLib.Error], scala.Unit],
    refetchVariables: relayDashRuntimeLib.relayDashRuntimeMod.Variables
  ): js.UndefOr[relayDashRuntimeLib.relayDashRuntimeMod.Disposable | scala.Null] = js.native
}

