package typings.reactAsync.mod

import typings.react.mod.global.JSX.Element
import typings.reactAsync.anon.Persist
import typings.reactAsync.anon.PersistState
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Renders only when promise is fulfilled or rejected.
  *
  * @prop {Function|Node} children Function (passing state) or React node
  * @prop {Object} state React Async state object
  * @prop {boolean} persist Show old data or error while pending (promise is loading)
  */
@JSImport("react-async", "IfSettled")
@js.native
object IfSettled extends js.Object {
  var propTypes: Persist = js.native
  def apply[T /* <: js.Object */](hasChildrenPersistState: PersistState[T]): Element = js.native
}

