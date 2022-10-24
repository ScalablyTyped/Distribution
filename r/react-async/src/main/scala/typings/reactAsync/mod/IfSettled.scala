package typings.reactAsync.mod

import typings.react.mod.global.JSX.Element
import typings.reactAsync.anon.Persist
import typings.reactAsync.anon.PersistState
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Renders only when promise is fulfilled or rejected.
  *
  * @prop {Function|Node} children Function (passing state) or React node
  * @prop {Object} state React Async state object
  * @prop {boolean} persist Show old data or error while pending (promise is loading)
  */
object IfSettled {
  
  inline def apply[T /* <: js.Object */](param0: PersistState[T]): Element = ^.asInstanceOf[js.Dynamic].apply(param0.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  @JSImport("react-async", "IfSettled")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("react-async", "IfSettled.propTypes")
  @js.native
  def propTypes: Persist = js.native
  inline def propTypes_=(x: Persist): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("propTypes")(x.asInstanceOf[js.Any])
}
