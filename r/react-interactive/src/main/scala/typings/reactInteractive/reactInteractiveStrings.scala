package typings.reactInteractive

import typings.reactInteractive.mod.ClickType
import typings.reactInteractive.mod.Focus
import typings.reactInteractive.mod.IState
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object reactInteractiveStrings {
  
  @js.native
  sealed trait hover extends IState
  @scala.inline
  def hover: hover = "hover".asInstanceOf[hover]
  
  @js.native
  sealed trait hoverActive extends IState
  @scala.inline
  def hoverActive: hoverActive = "hoverActive".asInstanceOf[hoverActive]
  
  @js.native
  sealed trait keyActive extends IState
  @scala.inline
  def keyActive: keyActive = "keyActive".asInstanceOf[keyActive]
  
  @js.native
  sealed trait keyClick extends ClickType
  @scala.inline
  def keyClick: keyClick = "keyClick".asInstanceOf[keyClick]
  
  @js.native
  sealed trait mouse extends Focus
  @scala.inline
  def mouse: mouse = "mouse".asInstanceOf[mouse]
  
  @js.native
  sealed trait mouseClick extends ClickType
  @scala.inline
  def mouseClick: mouseClick = "mouseClick".asInstanceOf[mouseClick]
  
  @js.native
  sealed trait normal extends IState
  @scala.inline
  def normal: normal = "normal".asInstanceOf[normal]
  
  @js.native
  sealed trait tab extends Focus
  @scala.inline
  def tab: tab = "tab".asInstanceOf[tab]
  
  @js.native
  sealed trait tapClick extends ClickType
  @scala.inline
  def tapClick: tapClick = "tapClick".asInstanceOf[tapClick]
  
  @js.native
  sealed trait touch extends Focus
  @scala.inline
  def touch: touch = "touch".asInstanceOf[touch]
  
  @js.native
  sealed trait touchActive extends IState
  @scala.inline
  def touchActive: touchActive = "touchActive".asInstanceOf[touchActive]
}
