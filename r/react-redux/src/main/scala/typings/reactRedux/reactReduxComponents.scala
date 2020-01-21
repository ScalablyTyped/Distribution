package typings.reactRedux

import typings.react.mod.ComponentType
import typings.redux.mod.Action
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object reactReduxComponents extends reactReduxProps {
  @scala.inline
  def Provider[A /* <: Action[js.Any] */]: ComponentType[ProviderProps[A]] = js.constructorOf[typings.reactRedux.mod.Provider[A]].asInstanceOf[typings.react.mod.ComponentType[ProviderProps[A]]]
}

