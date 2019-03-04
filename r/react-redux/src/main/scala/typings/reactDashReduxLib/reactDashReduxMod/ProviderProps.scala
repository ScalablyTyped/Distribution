package typings
package reactDashReduxLib.reactDashReduxMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ProviderProps[A /* <: reduxLib.reduxMod.Action[_] */] extends js.Object {
  /**
    * Optional context to be used internally in react-redux. Use React.createContext() to create a context to be used.
    * If this is used, generate own connect HOC by using connectAdvanced, supplying the same context provided to the
    * Provider. Initial value doesn't matter, as it is overwritten with the internal state of Provider.
    */
  var context: js.UndefOr[
    reactLib.reactMod.ReactNs.Context[ReactReduxContextValue[_, reduxLib.reduxMod.AnyAction]]
  ] = js.undefined
  /**
    * The single Redux store in your application.
    */
  var store: reduxLib.reduxMod.Store[_, A]
}

object ProviderProps {
  @scala.inline
  def apply[A /* <: reduxLib.reduxMod.Action[_] */](
    store: reduxLib.reduxMod.Store[_, A],
    context: reactLib.reactMod.ReactNs.Context[ReactReduxContextValue[_, reduxLib.reduxMod.AnyAction]] = null
  ): ProviderProps[A] = {
    val __obj = js.Dynamic.literal(store = store)
    if (context != null) __obj.updateDynamic("context")(context)
    __obj.asInstanceOf[ProviderProps[A]]
  }
}

