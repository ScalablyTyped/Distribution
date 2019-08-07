package typings.reactDashIntlDashRedux

import typings.reactDashIntl.distComponentsProviderMod.OptionalIntlConfig
import typings.redux.reduxMod.Action
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait reactDashIntlDashReduxProps {
  type IntlProviderProps = OptionalIntlConfig
  @scala.inline
  def ProviderProps: typings.reactDashRedux.reactDashReduxMod.ProviderProps.type = typings.reactDashRedux.reactDashReduxMod.ProviderProps
  type ProviderProps[A /* <: Action[_] */] = typings.reactDashRedux.reactDashReduxMod.ProviderProps[A]
}

