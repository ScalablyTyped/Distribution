package typings.reactAsync.mod

import typings.react.mod.global.JSX.Element
import typings.reactAsync.anon.ChildrenPersist
import typings.reactAsync.anon.Persist
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Renders only when promise is rejected.
  *
  * @prop {Function|Node} children Function (passing error and state) or React node
  * @prop {Object} state React Async state object
  * @prop {boolean} persist Show old error while pending (promise is loading)
  */
@JSImport("react-async", "IfRejected")
@js.native
object IfRejected extends js.Object {
  
  def apply[T /* <: js.Object */](hasChildrenPersistState: ChildrenPersist[T]): Element = js.native
  
  var propTypes: Persist = js.native
}
