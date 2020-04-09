package typings.reactAsync.mod

import typings.react.mod._Global_.JSX.Element
import typings.reactAsync.AnonPersist
import typings.reactAsync.AnonState
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Renders only when no promise has started or completed yet.
  *
  * @prop {Function|Node} children Function (passing state) or React node
  * @prop {Object} state React Async state object
  * @prop {boolean} persist Show until we have data, even while pending (loading) or when an error occurred
  */
@JSImport("react-async", "IfInitial")
@js.native
object IfInitial extends js.Object {
  var propTypes: AnonPersist = js.native
  def apply[T /* <: js.Object */](hasChildrenPersistState: AnonState[T]): Element = js.native
}

