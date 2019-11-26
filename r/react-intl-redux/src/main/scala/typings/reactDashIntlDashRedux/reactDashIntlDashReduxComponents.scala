package typings.reactDashIntlDashRedux

import typings.react.reactMod.ComponentType
import typings.redux.reduxMod.Action
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object reactDashIntlDashReduxComponents extends reactDashIntlDashReduxProps {
  @scala.inline
  def IntlProvider: ComponentType[IntlProviderProps] = js.constructorOf[typings.reactDashIntlDashRedux.reactDashIntlDashReduxMod.IntlProvider].asInstanceOf[typings.react.reactMod.ComponentType[IntlProviderProps]]
  @scala.inline
  def Provider: ComponentType[ProviderProps[Action[js.Any]]] = js.constructorOf[typings.reactDashIntlDashRedux.reactDashIntlDashReduxMod.Provider[typings.redux.reduxMod.Action[_]]].asInstanceOf[typings.react.reactMod.ComponentType[ProviderProps[typings.redux.reduxMod.Action[js.Any]]]]
}

