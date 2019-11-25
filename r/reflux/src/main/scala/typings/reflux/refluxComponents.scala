package typings.reflux

import typings.react.reactMod.ComponentType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object refluxComponents extends refluxProps {
  @scala.inline
  def Component[P, S]: ComponentType[P] = js.constructorOf[typings.reflux.refluxMod.Component[org.scalablytyped.runtime.Instantiable0[typings.reflux.refluxMod.Store], P, S]].asInstanceOf[typings.react.reactMod.ComponentType[P]]
  @scala.inline
  def PureComponent[P, S, SS]: ComponentType[P] = js.constructorOf[typings.reflux.refluxMod.PureComponent[org.scalablytyped.runtime.Instantiable0[typings.reflux.refluxMod.Store], P, S, SS]].asInstanceOf[typings.react.reactMod.ComponentType[P]]
}

