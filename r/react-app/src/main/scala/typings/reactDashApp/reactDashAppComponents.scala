package typings.reactDashApp

import typings.react.reactMod.ComponentType
import typings.reactDashApp.reactDashAppMod.CreateAppObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object reactDashAppComponents extends reactDashAppProps {
  @scala.inline
  def CreateApp: ComponentType[CreateAppObject] = typings.reactDashApp.reactDashAppMod.createApp.asInstanceOf[js.Dynamic].selectDynamic("<apply>").asInstanceOf[typings.react.reactMod.ComponentType[typings.reactDashApp.reactDashAppMod.CreateAppObject]]
  @scala.inline
  def Header: ComponentType[js.Object] = js.constructorOf[typings.reactDashApp.reactDashAppMod.Header].asInstanceOf[typings.react.reactMod.ComponentType[js.Object]]
  @scala.inline
  def Layout: ComponentType[typings.reactDashApp.reactDashAppMod.LayoutProps] = js.constructorOf[typings.reactDashApp.reactDashAppMod.Layout].asInstanceOf[typings.react.reactMod.ComponentType[typings.reactDashApp.reactDashAppMod.LayoutProps]]
  @scala.inline
  def Link: ComponentType[typings.reactDashApp.reactDashAppMod.LinkProps] = js.constructorOf[typings.reactDashApp.reactDashAppMod.Link].asInstanceOf[typings.react.reactMod.ComponentType[typings.reactDashApp.reactDashAppMod.LinkProps]]
  @scala.inline
  def Navigation: ComponentType[js.Object] = js.constructorOf[typings.reactDashApp.reactDashAppMod.Navigation].asInstanceOf[typings.react.reactMod.ComponentType[js.Object]]
}

