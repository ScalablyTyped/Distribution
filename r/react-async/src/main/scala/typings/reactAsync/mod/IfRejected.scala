package typings.reactAsync.mod

import typings.react.mod.global.JSX.Element
import typings.reactAsync.anon.ChildrenPersist
import typings.reactAsync.anon.Persist
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Renders only when promise is rejected.
  *
  * @prop {Function|Node} children Function (passing error and state) or React node
  * @prop {Object} state React Async state object
  * @prop {boolean} persist Show old error while pending (promise is loading)
  */
object IfRejected {
  
  @scala.inline
  def apply[T /* <: js.Object */](hasChildrenPersistState: ChildrenPersist[T]): Element = ^.asInstanceOf[js.Dynamic].apply(hasChildrenPersistState.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  @JSImport("react-async", "IfRejected")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("react-async", "IfRejected.propTypes")
  @js.native
  def propTypes: Persist = js.native
  @scala.inline
  def propTypes_=(x: Persist): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("propTypes")(x.asInstanceOf[js.Any])
}
