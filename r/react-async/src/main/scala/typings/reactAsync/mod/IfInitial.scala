package typings.reactAsync.mod

import typings.react.mod.global.JSX.Element
import typings.reactAsync.anon.Persist
import typings.reactAsync.anon.State
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Renders only when no promise has started or completed yet.
  *
  * @prop {Function|Node} children Function (passing state) or React node
  * @prop {Object} state React Async state object
  * @prop {boolean} persist Show until we have data, even while pending (loading) or when an error occurred
  */
object IfInitial {
  
  @scala.inline
  def apply[T /* <: js.Object */](hasChildrenPersistState: State[T]): Element = ^.asInstanceOf[js.Dynamic].apply(hasChildrenPersistState.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  @JSImport("react-async", "IfInitial")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("react-async", "IfInitial.propTypes")
  @js.native
  def propTypes: Persist = js.native
  @scala.inline
  def propTypes_=(x: Persist): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("propTypes")(x.asInstanceOf[js.Any])
}
