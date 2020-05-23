package typings.reactAsync.mod

import typings.react.mod.global.JSX.Element
import typings.reactAsync.anon.Children
import typings.reactAsync.anon.Persist
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
  var propTypes: Persist = js.native
  def apply[T /* <: js.Object */](hasChildrenPersistState: Children[T]): Element = js.native
}

