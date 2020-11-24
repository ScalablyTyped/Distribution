package typings.reactRelay.mod

import typings.relayRuntime.relayRuntimeTypesMod.Disposable
import typings.relayRuntime.relayRuntimeTypesMod.Variables
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RelayPaginationProp extends js.Object {
  
  val environment: typings.relayRuntime.mod.Environment = js.native
  
  def hasMore(): Boolean = js.native
  
  def isLoading(): Boolean = js.native
  
  def loadMore(pageSize: Double): js.UndefOr[Disposable | Null] = js.native
  def loadMore(pageSize: Double, observerOrCallback: js.UndefOr[ObserverOrCallback], options: RefetchOptions): js.UndefOr[Disposable | Null] = js.native
  def loadMore(pageSize: Double, observerOrCallback: Null, options: RefetchOptions): js.UndefOr[Disposable | Null] = js.native
  def loadMore(pageSize: Double, observerOrCallback: ObserverOrCallback): js.UndefOr[Disposable | Null] = js.native
  
  var refetch: js.UndefOr[scala.Nothing] = js.native
  
  def refetchConnection(totalCount: Double): js.UndefOr[Disposable | Null] = js.native
  def refetchConnection(
    totalCount: Double,
    observerOrCallback: js.UndefOr[ObserverOrCallback],
    refetchVariables: Variables
  ): js.UndefOr[Disposable | Null] = js.native
  def refetchConnection(totalCount: Double, observerOrCallback: Null, refetchVariables: Variables): js.UndefOr[Disposable | Null] = js.native
  def refetchConnection(totalCount: Double, observerOrCallback: ObserverOrCallback): js.UndefOr[Disposable | Null] = js.native
}
