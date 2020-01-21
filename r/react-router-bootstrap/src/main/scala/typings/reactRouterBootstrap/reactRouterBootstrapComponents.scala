package typings.reactRouterBootstrap

import typings.history.mod.LocationState
import typings.react.mod.ComponentType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object reactRouterBootstrapComponents extends reactRouterBootstrapProps {
  @scala.inline
  def Default: ComponentType[DefaultProps[LocationState]] = js.constructorOf[typings.reactRouterBootstrap.linkContainerMod.defaultCls].asInstanceOf[typings.react.mod.ComponentType[DefaultProps[typings.history.mod.LocationState]]]
  @scala.inline
  def IndexLinkContainer: ComponentType[IndexLinkContainerProps[LocationState]] = typings.reactRouterBootstrap.indexLinkContainerMod.default.asInstanceOf[typings.react.mod.ComponentType[IndexLinkContainerProps[typings.history.mod.LocationState]]]
  @scala.inline
  def LinkContainer: ComponentType[LinkContainerProps[LocationState]] = typings.reactRouterBootstrap.linkContainerMod.default.asInstanceOf[typings.react.mod.ComponentType[LinkContainerProps[typings.history.mod.LocationState]]]
}

