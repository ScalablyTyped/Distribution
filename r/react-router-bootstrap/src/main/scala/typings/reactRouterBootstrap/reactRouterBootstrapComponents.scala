package typings.reactRouterBootstrap

import typings.history.mod.LocationState
import typings.react.mod.ComponentType
import typings.reactRouterBootstrap.indexLinkContainerMod.default
import typings.reactRouterBootstrap.linkContainerMod.defaultCls
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object reactRouterBootstrapComponents extends reactRouterBootstrapProps {
  @scala.inline
  def Default: ComponentType[DefaultProps[LocationState]] = js.constructorOf[defaultCls].asInstanceOf[ComponentType[DefaultProps[LocationState]]]
  @scala.inline
  def IndexLinkContainer: ComponentType[IndexLinkContainerProps[LocationState]] = default.asInstanceOf[ComponentType[IndexLinkContainerProps[LocationState]]]
  @scala.inline
  def LinkContainer: ComponentType[LinkContainerProps[LocationState]] = typings.reactRouterBootstrap.linkContainerMod.default.asInstanceOf[ComponentType[LinkContainerProps[LocationState]]]
}

