package typings.reactDashNativeDashGestureDashHandler

import typings.reactDashNativeDashGestureDashHandler.drawerLayoutMod.DrawerKeyboardDismissMode
import typings.reactDashNativeDashGestureDashHandler.drawerLayoutMod.DrawerLockMode
import typings.reactDashNativeDashGestureDashHandler.drawerLayoutMod.DrawerPosition
import typings.reactDashNativeDashGestureDashHandler.drawerLayoutMod.DrawerState
import typings.reactDashNativeDashGestureDashHandler.drawerLayoutMod.DrawerType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object reactDashNativeDashGestureDashHandlerStrings {
  @js.native
  sealed trait Dragging extends DrawerState
  
  @js.native
  sealed trait Idle extends DrawerState
  
  @js.native
  sealed trait Settling extends DrawerState
  
  @js.native
  sealed trait back extends DrawerType
  
  @js.native
  sealed trait front extends DrawerType
  
  @js.native
  sealed trait left extends DrawerPosition
  
  @js.native
  sealed trait `locked-closed` extends DrawerLockMode
  
  @js.native
  sealed trait `locked-open` extends DrawerLockMode
  
  @js.native
  sealed trait none extends DrawerKeyboardDismissMode
  
  @js.native
  sealed trait `on-drag` extends DrawerKeyboardDismissMode
  
  @js.native
  sealed trait right extends DrawerPosition
  
  @js.native
  sealed trait slide extends DrawerType
  
  @js.native
  sealed trait unlocked extends DrawerLockMode
  
  @scala.inline
  def Dragging: Dragging = "Dragging".asInstanceOf[Dragging]
  @scala.inline
  def Idle: Idle = "Idle".asInstanceOf[Idle]
  @scala.inline
  def Settling: Settling = "Settling".asInstanceOf[Settling]
  @scala.inline
  def back: back = "back".asInstanceOf[back]
  @scala.inline
  def front: front = "front".asInstanceOf[front]
  @scala.inline
  def left: left = "left".asInstanceOf[left]
  @scala.inline
  def `locked-closed`: `locked-closed` = "locked-closed".asInstanceOf[`locked-closed`]
  @scala.inline
  def `locked-open`: `locked-open` = "locked-open".asInstanceOf[`locked-open`]
  @scala.inline
  def none: none = "none".asInstanceOf[none]
  @scala.inline
  def `on-drag`: `on-drag` = "on-drag".asInstanceOf[`on-drag`]
  @scala.inline
  def right: right = "right".asInstanceOf[right]
  @scala.inline
  def slide: slide = "slide".asInstanceOf[slide]
  @scala.inline
  def unlocked: unlocked = "unlocked".asInstanceOf[unlocked]
}

