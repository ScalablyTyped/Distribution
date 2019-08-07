package typings.reactDashIntlDashRedux

import typings.react.reactMod.ComponentType
import typings.reactDashIntl.distComponentsProviderMod.OptionalIntlConfig
import typings.redux.reduxMod.Action
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object reactDashIntlDashReduxComponents extends reactDashIntlDashReduxProps {
  @scala.inline
  def IntlProvider: ComponentType[OptionalIntlConfig] = js.constructorOf[typings.reactDashIntlDashRedux.reactDashIntlDashReduxMod.IntlProvider].asInstanceOf[typings.react.reactMod.ComponentType[typings.reactDashIntl.distComponentsProviderMod.OptionalIntlConfig]]
  @scala.inline
  def Provider[A /* <: Action[_] */]: ComponentType[typings.reactDashRedux.reactDashReduxMod.ProviderProps[A]] = js.constructorOf[typings.reactDashIntlDashRedux.reactDashIntlDashReduxMod.Provider[A]].asInstanceOf[typings.react.reactMod.ComponentType[typings.reactDashRedux.reactDashReduxMod.ProviderProps[A]]]
}

