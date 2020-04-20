package typings.reactAsync

import typings.react.mod.ComponentType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object reactAsyncComponents extends reactAsyncProps {
  @scala.inline
  def IfFulfilled[T /* <: js.Object */]: ComponentType[IfFulfilledProps[T]] = typings.reactAsync.mod.IfFulfilled.asInstanceOf[ComponentType[IfFulfilledProps[T]]]
  @scala.inline
  def IfInitial[T /* <: js.Object */]: ComponentType[IfInitialProps[T]] = typings.reactAsync.mod.IfInitial.asInstanceOf[ComponentType[IfInitialProps[T]]]
  @scala.inline
  def IfPending[T /* <: js.Object */]: ComponentType[IfPendingProps[T]] = typings.reactAsync.mod.IfPending.asInstanceOf[ComponentType[IfPendingProps[T]]]
  @scala.inline
  def IfRejected[T /* <: js.Object */]: ComponentType[IfRejectedProps[T]] = typings.reactAsync.mod.IfRejected.asInstanceOf[ComponentType[IfRejectedProps[T]]]
  @scala.inline
  def IfSettled[T /* <: js.Object */]: ComponentType[IfSettledProps[T]] = typings.reactAsync.mod.IfSettled.asInstanceOf[ComponentType[IfSettledProps[T]]]
}

