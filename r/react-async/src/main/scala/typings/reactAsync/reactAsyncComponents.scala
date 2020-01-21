package typings.reactAsync

import typings.react.mod.ComponentType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object reactAsyncComponents extends reactAsyncProps {
  @scala.inline
  def Async[T]: ComponentType[AsyncProps[T]] = js.constructorOf[typings.reactAsync.mod.Async[T]].asInstanceOf[typings.react.mod.ComponentType[AsyncProps[T]]]
  @scala.inline
  def AsyncFulfilled[T]: ComponentType[AsyncFulfilledProps[T]] = typings.reactAsync.mod.Async.asInstanceOf[js.Dynamic].selectDynamic("Fulfilled").asInstanceOf[typings.react.mod.ComponentType[AsyncFulfilledProps[T]]]
  @scala.inline
  def AsyncInitial[T]: ComponentType[AsyncInitialProps[T]] = typings.reactAsync.mod.Async.asInstanceOf[js.Dynamic].selectDynamic("Initial").asInstanceOf[typings.react.mod.ComponentType[AsyncInitialProps[T]]]
  @scala.inline
  def AsyncLoading[T]: ComponentType[AsyncLoadingProps[T]] = typings.reactAsync.mod.Async.asInstanceOf[js.Dynamic].selectDynamic("Loading").asInstanceOf[typings.react.mod.ComponentType[AsyncLoadingProps[T]]]
  @scala.inline
  def AsyncPending[T]: ComponentType[AsyncPendingProps[T]] = typings.reactAsync.mod.Async.asInstanceOf[js.Dynamic].selectDynamic("Pending").asInstanceOf[typings.react.mod.ComponentType[AsyncPendingProps[T]]]
  @scala.inline
  def AsyncRejected[T]: ComponentType[AsyncRejectedProps[T]] = typings.reactAsync.mod.Async.asInstanceOf[js.Dynamic].selectDynamic("Rejected").asInstanceOf[typings.react.mod.ComponentType[AsyncRejectedProps[T]]]
  @scala.inline
  def AsyncResolved[T]: ComponentType[AsyncResolvedProps[T]] = typings.reactAsync.mod.Async.asInstanceOf[js.Dynamic].selectDynamic("Resolved").asInstanceOf[typings.react.mod.ComponentType[AsyncResolvedProps[T]]]
  @scala.inline
  def AsyncSettled[T]: ComponentType[AsyncSettledProps[T]] = typings.reactAsync.mod.Async.asInstanceOf[js.Dynamic].selectDynamic("Settled").asInstanceOf[typings.react.mod.ComponentType[AsyncSettledProps[T]]]
  @scala.inline
  def Fulfilled[T]: ComponentType[FulfilledProps[T]] = typings.reactAsync.mod.default.asInstanceOf[js.Dynamic].selectDynamic("Fulfilled").asInstanceOf[typings.react.mod.ComponentType[FulfilledProps[T]]]
  @scala.inline
  def IfFulfilled[T]: ComponentType[IfFulfilledProps[T]] = typings.reactAsync.mod.IfFulfilled.asInstanceOf[typings.react.mod.ComponentType[IfFulfilledProps[T]]]
  @scala.inline
  def IfInitial[T]: ComponentType[IfInitialProps[T]] = typings.reactAsync.mod.IfInitial.asInstanceOf[typings.react.mod.ComponentType[IfInitialProps[T]]]
  @scala.inline
  def IfLoading[T]: ComponentType[IfLoadingProps[T]] = typings.reactAsync.mod.IfLoading.asInstanceOf[typings.react.mod.ComponentType[IfLoadingProps[T]]]
  @scala.inline
  def IfPending[T]: ComponentType[IfPendingProps[T]] = typings.reactAsync.mod.IfPending.asInstanceOf[typings.react.mod.ComponentType[IfPendingProps[T]]]
  @scala.inline
  def IfRejected[T]: ComponentType[IfRejectedProps[T]] = typings.reactAsync.mod.IfRejected.asInstanceOf[typings.react.mod.ComponentType[IfRejectedProps[T]]]
  @scala.inline
  def IfResolved[T]: ComponentType[IfResolvedProps[T]] = typings.reactAsync.mod.IfResolved.asInstanceOf[typings.react.mod.ComponentType[IfResolvedProps[T]]]
  @scala.inline
  def IfSettled[T]: ComponentType[IfSettledProps[T]] = typings.reactAsync.mod.IfSettled.asInstanceOf[typings.react.mod.ComponentType[IfSettledProps[T]]]
  @scala.inline
  def Initial[T]: ComponentType[InitialProps[T]] = typings.reactAsync.mod.default.asInstanceOf[js.Dynamic].selectDynamic("Initial").asInstanceOf[typings.react.mod.ComponentType[InitialProps[T]]]
  @scala.inline
  def Loading[T]: ComponentType[LoadingProps[T]] = typings.reactAsync.mod.default.asInstanceOf[js.Dynamic].selectDynamic("Loading").asInstanceOf[typings.react.mod.ComponentType[LoadingProps[T]]]
  @scala.inline
  def Pending[T]: ComponentType[PendingProps[T]] = typings.reactAsync.mod.default.asInstanceOf[js.Dynamic].selectDynamic("Pending").asInstanceOf[typings.react.mod.ComponentType[PendingProps[T]]]
  @scala.inline
  def ReactAsync[T]: ComponentType[ReactAsyncProps[T]] = js.constructorOf[typings.reactAsync.mod.default[T]].asInstanceOf[typings.react.mod.ComponentType[ReactAsyncProps[T]]]
  @scala.inline
  def Rejected[T]: ComponentType[RejectedProps[T]] = typings.reactAsync.mod.default.asInstanceOf[js.Dynamic].selectDynamic("Rejected").asInstanceOf[typings.react.mod.ComponentType[RejectedProps[T]]]
  @scala.inline
  def Resolved[T]: ComponentType[ResolvedProps[T]] = typings.reactAsync.mod.default.asInstanceOf[js.Dynamic].selectDynamic("Resolved").asInstanceOf[typings.react.mod.ComponentType[ResolvedProps[T]]]
  @scala.inline
  def Settled[T]: ComponentType[SettledProps[T]] = typings.reactAsync.mod.default.asInstanceOf[js.Dynamic].selectDynamic("Settled").asInstanceOf[typings.react.mod.ComponentType[SettledProps[T]]]
}

