package typings.reactAsync.mod

import typings.react.mod._Global_.JSX.Element
import typings.reactAsync.AnonChildren
import typings.reactAsync.AnonPersist
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Renders only when promise is resolved.
  *
  * @prop {Function|Node} children Function (passing data and state) or React node
  * @prop {Object} state React Async state object
  * @prop {boolean} persist Show old data while pending (promise is loading)
  */
@JSImport("react-async", "IfFulfilled")
@js.native
object IfFulfilled extends js.Object {
  var propTypes: AnonPersist = js.native
  def apply[T /* <: js.Object */](hasChildrenPersistState: AnonChildren[T]): Element = js.native
}

