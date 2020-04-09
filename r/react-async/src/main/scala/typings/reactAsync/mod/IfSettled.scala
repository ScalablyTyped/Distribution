package typings.reactAsync.mod

import typings.react.mod._Global_.JSX.Element
import typings.reactAsync.AnonPersist
import typings.reactAsync.AnonPersistState
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
  var propTypes: AnonPersist = js.native
  def apply[T /* <: js.Object */](hasChildrenPersistState: AnonPersistState[T]): Element = js.native
}

