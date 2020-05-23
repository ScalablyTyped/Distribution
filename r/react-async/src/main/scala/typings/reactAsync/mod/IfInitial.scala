package typings.reactAsync.mod

import typings.react.mod.global.JSX.Element
import typings.reactAsync.anon.Persist
import typings.reactAsync.anon.State
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
  var propTypes: Persist = js.native
  def apply[T /* <: js.Object */](hasChildrenPersistState: State[T]): Element = js.native
}

