package typings.reactEmailEditor

import typings.reactEmailEditor.mod.DisplayMode
import typings.reactEmailEditor.mod.DockPosition
import typings.reactEmailEditor.mod.ThemeColor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object reactEmailEditorStrings {
  @js.native
  sealed trait dark extends ThemeColor
  
  @js.native
  sealed trait email extends DisplayMode
  
  @js.native
  sealed trait image extends js.Object
  
  @js.native
  sealed trait left extends DockPosition
  
  @js.native
  sealed trait light extends ThemeColor
  
  @js.native
  sealed trait right extends DockPosition
  
  @js.native
  sealed trait web extends DisplayMode
  
  @scala.inline
  def dark: dark = "dark".asInstanceOf[dark]
  @scala.inline
  def email: email = "email".asInstanceOf[email]
  @scala.inline
  def image: image = "image".asInstanceOf[image]
  @scala.inline
  def left: left = "left".asInstanceOf[left]
  @scala.inline
  def light: light = "light".asInstanceOf[light]
  @scala.inline
  def right: right = "right".asInstanceOf[right]
  @scala.inline
  def web: web = "web".asInstanceOf[web]
}

