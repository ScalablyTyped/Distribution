package typings.reactDashJss

import typings.react.reactMod.ComponentType
import typings.theming.themingMod.DefaultTheme
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object reactDashJssComponents extends reactDashJssProps {
  @scala.inline
  def JssProvider: ComponentType[JssProviderProps] = js.constructorOf[typings.reactDashJss.reactDashJssMod.JssProvider].asInstanceOf[typings.react.reactMod.ComponentType[JssProviderProps]]
  @scala.inline
  def ThemeProvider: ComponentType[ThemeProviderProps[DefaultTheme]] = js.constructorOf[typings.reactDashJss.reactDashJssMod.ThemeProvider].asInstanceOf[typings.react.reactMod.ComponentType[ThemeProviderProps[typings.theming.themingMod.DefaultTheme]]]
}

