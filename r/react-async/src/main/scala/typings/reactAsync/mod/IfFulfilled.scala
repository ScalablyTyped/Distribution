package typings.reactAsync.mod

import typings.react.mod.global.JSX.Element
import typings.reactAsync.anon.Children
import typings.reactAsync.anon.Persist
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Renders only when promise is resolved.
  *
  * @prop {Function|Node} children Function (passing data and state) or React node
  * @prop {Object} state React Async state object
  * @prop {boolean} persist Show old data while pending (promise is loading)
  */
object IfFulfilled {
  
  @JSImport("react-async", "IfFulfilled")
  @js.native
  def apply[T /* <: js.Object */](hasChildrenPersistState: Children[T]): Element = js.native
  @JSImport("react-async", "IfFulfilled")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("react-async", "IfFulfilled.propTypes")
  @js.native
  def propTypes: Persist = js.native
  @scala.inline
  def propTypes_=(x: Persist): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("propTypes")(x.asInstanceOf[js.Any])
}
