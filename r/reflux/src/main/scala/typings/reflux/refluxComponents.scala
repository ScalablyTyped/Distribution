package typings.reflux

import org.scalablytyped.runtime.Instantiable0
import typings.react.mod.ComponentType
import typings.reflux.mod.Store
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object refluxComponents extends refluxProps {
  @scala.inline
  def Component[TOfStore /* <: Instantiable0[Store] */, P, S]: ComponentType[P] = js.constructorOf[typings.reflux.mod.Component[TOfStore, P, S]].asInstanceOf[typings.react.mod.ComponentType[P]]
  @scala.inline
  def PureComponent[TOfStore /* <: Instantiable0[Store] */, P, S, SS]: ComponentType[P] = js.constructorOf[typings.reflux.mod.PureComponent[TOfStore, P, S, SS]].asInstanceOf[typings.react.mod.ComponentType[P]]
}

