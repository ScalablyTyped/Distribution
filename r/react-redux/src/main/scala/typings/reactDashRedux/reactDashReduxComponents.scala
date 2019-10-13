package typings.reactDashRedux

import typings.react.reactMod.ComponentType
import typings.redux.reduxMod.Action
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object reactDashReduxComponents extends reactDashReduxProps {
  @scala.inline
  def Provider[A /* <: Action[_] */]: ComponentType[ProviderProps[A]] = js.constructorOf[typings.reactDashRedux.reactDashReduxMod.Provider[A]].asInstanceOf[typings.react.reactMod.ComponentType[ProviderProps[A]]]
}

