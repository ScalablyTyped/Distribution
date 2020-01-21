package typings.reactIntlRedux

import typings.react.mod.ComponentType
import typings.redux.mod.Action
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object reactIntlReduxComponents extends reactIntlReduxProps {
  @scala.inline
  def IntlProvider: ComponentType[IntlProviderProps] = js.constructorOf[typings.reactIntlRedux.mod.IntlProvider].asInstanceOf[typings.react.mod.ComponentType[IntlProviderProps]]
  @scala.inline
  def Provider[A /* <: Action[js.Any] */]: ComponentType[ProviderProps[A]] = js.constructorOf[typings.reactIntlRedux.mod.Provider[A]].asInstanceOf[typings.react.mod.ComponentType[ProviderProps[A]]]
}

