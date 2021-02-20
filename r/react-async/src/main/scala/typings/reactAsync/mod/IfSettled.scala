package typings.reactAsync.mod

import typings.react.mod.global.JSX.Element
import typings.reactAsync.anon.Persist
import typings.reactAsync.anon.PersistState
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Renders only when promise is fulfilled or rejected.
  *
  * @prop {Function|Node} children Function (passing state) or React node
  * @prop {Object} state React Async state object
  * @prop {boolean} persist Show old data or error while pending (promise is loading)
  */
object IfSettled {
  
  @JSImport("react-async", "IfSettled")
  @js.native
  def apply[T /* <: js.Object */](hasChildrenPersistState: PersistState[T]): Element = js.native
  @JSImport("react-async", "IfSettled")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("react-async", "IfSettled.propTypes")
  @js.native
  def propTypes: Persist = js.native
  @scala.inline
  def propTypes_=(x: Persist): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("propTypes")(x.asInstanceOf[js.Any])
}
