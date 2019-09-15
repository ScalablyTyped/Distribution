package typings.reactDashRedux.Slinky

import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.web.html.`*`.tag
import typings.react.reactMod.Context
import typings.reactDashRedux.reactDashReduxMod.ProviderProps
import typings.reactDashRedux.reactDashReduxMod.ReactReduxContextValue
import typings.redux.reduxMod.Action
import typings.redux.reduxMod.AnyAction
import typings.redux.reduxMod.Store
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Provider
  extends ExternalComponentWithAttributesWithRefType[tag.type, typings.reactDashRedux.reactDashReduxMod.Provider[js.Any]] {
  override val component: String | js.Object = js.constructorOf[typings.reactDashRedux.reactDashReduxMod.Provider[js.Any]].asInstanceOf[String | js.Object]
  def apply[A /* <: Action[_] */](store: Store[_, A], context: Context[ReactReduxContextValue[_, AnyAction]] = null): BuildingComponent[tag.type, typings.reactDashRedux.reactDashReduxMod.Provider[js.Any]] = {
    val __obj = js.Dynamic.literal(store = store)
    if (context != null) __obj.updateDynamic("context")(context)
    super.apply(__obj.asInstanceOf[Props]).asInstanceOf[slinky.core.BuildingComponent[
  slinky.web.html.`*`.tag.type, 
  typings.reactDashRedux.reactDashReduxMod.Provider[js.Any]]]
  }
  type Props = ProviderProps[js.Any]
}

