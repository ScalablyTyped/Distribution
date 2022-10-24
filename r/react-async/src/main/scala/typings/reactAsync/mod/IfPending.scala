package typings.reactAsync.mod

import typings.react.mod.global.JSX.Element
import typings.reactAsync.anon.ChildrenInitial
import typings.reactAsync.anon.Initial
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Renders only while pending (promise is loading).
  *
  * @prop {Function|Node} children Function (passing state) or React node
  * @prop {Object} state React Async state object
  * @prop {boolean} initial Show only on initial load (data is undefined)
  */
object IfPending {
  
  inline def apply[T /* <: js.Object */](param0: Initial[T]): Element = ^.asInstanceOf[js.Dynamic].apply(param0.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  @JSImport("react-async", "IfPending")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("react-async", "IfPending.propTypes")
  @js.native
  def propTypes: ChildrenInitial = js.native
  inline def propTypes_=(x: ChildrenInitial): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("propTypes")(x.asInstanceOf[js.Any])
}
