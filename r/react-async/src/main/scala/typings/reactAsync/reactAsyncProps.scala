package typings.reactAsync

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait reactAsyncProps {
  @scala.inline
  def IfFulfilledProps: AnonChildren.type = AnonChildren
  type IfFulfilledProps[T /* <: js.Object */] = AnonChildren[T]
  @scala.inline
  def IfInitialProps: AnonState.type = AnonState
  type IfInitialProps[T /* <: js.Object */] = AnonState[T]
  @scala.inline
  def IfPendingProps: AnonInitial.type = AnonInitial
  type IfPendingProps[T /* <: js.Object */] = AnonInitial[T]
  @scala.inline
  def IfRejectedProps: AnonChildrenPersist.type = AnonChildrenPersist
  type IfRejectedProps[T /* <: js.Object */] = AnonChildrenPersist[T]
  @scala.inline
  def IfSettledProps: AnonPersistState.type = AnonPersistState
  type IfSettledProps[T /* <: js.Object */] = AnonPersistState[T]
}

