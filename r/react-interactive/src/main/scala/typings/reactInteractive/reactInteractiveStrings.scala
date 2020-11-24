package typings.reactInteractive

import typings.reactInteractive.mod.ClickType
import typings.reactInteractive.mod.Focus
import typings.reactInteractive.mod.IState
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object reactInteractiveStrings {
  
  @scala.inline
  def hover: hover = "hover".asInstanceOf[hover]
  
  @scala.inline
  def hoverActive: hoverActive = "hoverActive".asInstanceOf[hoverActive]
  
  @scala.inline
  def keyActive: keyActive = "keyActive".asInstanceOf[keyActive]
  
  @scala.inline
  def keyClick: keyClick = "keyClick".asInstanceOf[keyClick]
  
  @scala.inline
  def mouse: mouse = "mouse".asInstanceOf[mouse]
  
  @scala.inline
  def mouseClick: mouseClick = "mouseClick".asInstanceOf[mouseClick]
  
  @scala.inline
  def normal: normal = "normal".asInstanceOf[normal]
  
  @scala.inline
  def tab: tab = "tab".asInstanceOf[tab]
  
  @scala.inline
  def tapClick: tapClick = "tapClick".asInstanceOf[tapClick]
  
  @scala.inline
  def touch: touch = "touch".asInstanceOf[touch]
  
  @scala.inline
  def touchActive: touchActive = "touchActive".asInstanceOf[touchActive]
  
  @js.native
  sealed trait hover extends IState
  
  @js.native
  sealed trait hoverActive extends IState
  
  @js.native
  sealed trait keyActive extends IState
  
  @js.native
  sealed trait keyClick extends ClickType
  
  @js.native
  sealed trait mouse extends Focus
  
  @js.native
  sealed trait mouseClick extends ClickType
  
  @js.native
  sealed trait normal extends IState
  
  @js.native
  sealed trait tab extends Focus
  
  @js.native
  sealed trait tapClick extends ClickType
  
  @js.native
  sealed trait touch extends Focus
  
  @js.native
  sealed trait touchActive extends IState
}
