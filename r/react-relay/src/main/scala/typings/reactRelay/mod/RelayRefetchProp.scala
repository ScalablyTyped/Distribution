package typings.reactRelay.mod

import typings.relayRuntime.relayRuntimeTypesMod.Disposable
import typings.relayRuntime.relayRuntimeTypesMod.Variables
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RelayRefetchProp extends js.Object {
  
  var environment: typings.relayRuntime.mod.Environment = js.native
  
  var hasMore: js.UndefOr[scala.Nothing] = js.native
  
  def refetch(refetchVariables: js.Function1[/* fragmentVariables */ Variables, Variables]): Disposable = js.native
  def refetch(
    refetchVariables: js.Function1[/* fragmentVariables */ Variables, Variables],
    renderVariables: js.UndefOr[scala.Nothing],
    observerOrCallback: js.UndefOr[ObserverOrCallback],
    options: RefetchOptions
  ): Disposable = js.native
  def refetch(
    refetchVariables: js.Function1[/* fragmentVariables */ Variables, Variables],
    renderVariables: js.UndefOr[scala.Nothing],
    observerOrCallback: Null,
    options: RefetchOptions
  ): Disposable = js.native
  def refetch(
    refetchVariables: js.Function1[/* fragmentVariables */ Variables, Variables],
    renderVariables: js.UndefOr[scala.Nothing],
    observerOrCallback: ObserverOrCallback
  ): Disposable = js.native
  def refetch(
    refetchVariables: js.Function1[/* fragmentVariables */ Variables, Variables],
    renderVariables: Null,
    observerOrCallback: js.UndefOr[ObserverOrCallback],
    options: RefetchOptions
  ): Disposable = js.native
  def refetch(
    refetchVariables: js.Function1[/* fragmentVariables */ Variables, Variables],
    renderVariables: Null,
    observerOrCallback: Null,
    options: RefetchOptions
  ): Disposable = js.native
  def refetch(
    refetchVariables: js.Function1[/* fragmentVariables */ Variables, Variables],
    renderVariables: Null,
    observerOrCallback: ObserverOrCallback
  ): Disposable = js.native
  def refetch(
    refetchVariables: js.Function1[/* fragmentVariables */ Variables, Variables],
    renderVariables: Variables
  ): Disposable = js.native
  def refetch(
    refetchVariables: js.Function1[/* fragmentVariables */ Variables, Variables],
    renderVariables: Variables,
    observerOrCallback: js.UndefOr[ObserverOrCallback],
    options: RefetchOptions
  ): Disposable = js.native
  def refetch(
    refetchVariables: js.Function1[/* fragmentVariables */ Variables, Variables],
    renderVariables: Variables,
    observerOrCallback: Null,
    options: RefetchOptions
  ): Disposable = js.native
  def refetch(
    refetchVariables: js.Function1[/* fragmentVariables */ Variables, Variables],
    renderVariables: Variables,
    observerOrCallback: ObserverOrCallback
  ): Disposable = js.native
  def refetch(refetchVariables: Variables): Disposable = js.native
  def refetch(
    refetchVariables: Variables,
    renderVariables: js.UndefOr[scala.Nothing],
    observerOrCallback: js.UndefOr[ObserverOrCallback],
    options: RefetchOptions
  ): Disposable = js.native
  def refetch(
    refetchVariables: Variables,
    renderVariables: js.UndefOr[scala.Nothing],
    observerOrCallback: Null,
    options: RefetchOptions
  ): Disposable = js.native
  def refetch(
    refetchVariables: Variables,
    renderVariables: js.UndefOr[scala.Nothing],
    observerOrCallback: ObserverOrCallback
  ): Disposable = js.native
  def refetch(
    refetchVariables: Variables,
    renderVariables: Null,
    observerOrCallback: js.UndefOr[ObserverOrCallback],
    options: RefetchOptions
  ): Disposable = js.native
  def refetch(
    refetchVariables: Variables,
    renderVariables: Null,
    observerOrCallback: Null,
    options: RefetchOptions
  ): Disposable = js.native
  def refetch(refetchVariables: Variables, renderVariables: Null, observerOrCallback: ObserverOrCallback): Disposable = js.native
  def refetch(refetchVariables: Variables, renderVariables: Variables): Disposable = js.native
  def refetch(
    refetchVariables: Variables,
    renderVariables: Variables,
    observerOrCallback: js.UndefOr[ObserverOrCallback],
    options: RefetchOptions
  ): Disposable = js.native
  def refetch(
    refetchVariables: Variables,
    renderVariables: Variables,
    observerOrCallback: Null,
    options: RefetchOptions
  ): Disposable = js.native
  def refetch(refetchVariables: Variables, renderVariables: Variables, observerOrCallback: ObserverOrCallback): Disposable = js.native
}
