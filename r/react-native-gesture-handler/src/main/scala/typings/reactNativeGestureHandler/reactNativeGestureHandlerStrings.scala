package typings.reactNativeGestureHandler

import typings.reactNativeGestureHandler.drawerLayoutMod.DrawerKeyboardDismissMode
import typings.reactNativeGestureHandler.drawerLayoutMod.DrawerLockMode
import typings.reactNativeGestureHandler.drawerLayoutMod.DrawerPosition
import typings.reactNativeGestureHandler.drawerLayoutMod.DrawerState
import typings.reactNativeGestureHandler.drawerLayoutMod.DrawerType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object reactNativeGestureHandlerStrings {
  @js.native
  sealed trait Dragging extends DrawerState
  
  @js.native
  sealed trait Idle extends DrawerState
  
  @js.native
  sealed trait Settling extends DrawerState
  
  @js.native
  sealed trait activeOffsetX extends js.Object
  
  @js.native
  sealed trait activeOffsetY extends js.Object
  
  @js.native
  sealed trait avgTouches extends js.Object
  
  @js.native
  sealed trait back extends DrawerType
  
  @js.native
  sealed trait failOffsetX extends js.Object
  
  @js.native
  sealed trait failOffsetY extends js.Object
  
  @js.native
  sealed trait front extends DrawerType
  
  @js.native
  sealed trait left extends DrawerPosition
  
  @js.native
  sealed trait `locked-closed` extends DrawerLockMode
  
  @js.native
  sealed trait `locked-open` extends DrawerLockMode
  
  @js.native
  sealed trait maxDeltaX extends js.Object
  
  @js.native
  sealed trait maxDeltaY extends js.Object
  
  @js.native
  sealed trait maxPointers extends js.Object
  
  @js.native
  sealed trait minDeltaX extends js.Object
  
  @js.native
  sealed trait minDeltaY extends js.Object
  
  @js.native
  sealed trait minDist extends js.Object
  
  @js.native
  sealed trait minOffsetX extends js.Object
  
  @js.native
  sealed trait minOffsetY extends js.Object
  
  @js.native
  sealed trait minPointers extends js.Object
  
  @js.native
  sealed trait minVelocity extends js.Object
  
  @js.native
  sealed trait minVelocityX extends js.Object
  
  @js.native
  sealed trait minVelocityY extends js.Object
  
  @js.native
  sealed trait none extends DrawerKeyboardDismissMode
  
  @js.native
  sealed trait `on-drag` extends DrawerKeyboardDismissMode
  
  @js.native
  sealed trait onGestureEvent extends js.Object
  
  @js.native
  sealed trait onHandlerStateChange extends js.Object
  
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
  def activeOffsetX: activeOffsetX = "activeOffsetX".asInstanceOf[activeOffsetX]
  @scala.inline
  def activeOffsetY: activeOffsetY = "activeOffsetY".asInstanceOf[activeOffsetY]
  @scala.inline
  def avgTouches: avgTouches = "avgTouches".asInstanceOf[avgTouches]
  @scala.inline
  def back: back = "back".asInstanceOf[back]
  @scala.inline
  def failOffsetX: failOffsetX = "failOffsetX".asInstanceOf[failOffsetX]
  @scala.inline
  def failOffsetY: failOffsetY = "failOffsetY".asInstanceOf[failOffsetY]
  @scala.inline
  def front: front = "front".asInstanceOf[front]
  @scala.inline
  def left: left = "left".asInstanceOf[left]
  @scala.inline
  def `locked-closed`: `locked-closed` = "locked-closed".asInstanceOf[`locked-closed`]
  @scala.inline
  def `locked-open`: `locked-open` = "locked-open".asInstanceOf[`locked-open`]
  @scala.inline
  def maxDeltaX: maxDeltaX = "maxDeltaX".asInstanceOf[maxDeltaX]
  @scala.inline
  def maxDeltaY: maxDeltaY = "maxDeltaY".asInstanceOf[maxDeltaY]
  @scala.inline
  def maxPointers: maxPointers = "maxPointers".asInstanceOf[maxPointers]
  @scala.inline
  def minDeltaX: minDeltaX = "minDeltaX".asInstanceOf[minDeltaX]
  @scala.inline
  def minDeltaY: minDeltaY = "minDeltaY".asInstanceOf[minDeltaY]
  @scala.inline
  def minDist: minDist = "minDist".asInstanceOf[minDist]
  @scala.inline
  def minOffsetX: minOffsetX = "minOffsetX".asInstanceOf[minOffsetX]
  @scala.inline
  def minOffsetY: minOffsetY = "minOffsetY".asInstanceOf[minOffsetY]
  @scala.inline
  def minPointers: minPointers = "minPointers".asInstanceOf[minPointers]
  @scala.inline
  def minVelocity: minVelocity = "minVelocity".asInstanceOf[minVelocity]
  @scala.inline
  def minVelocityX: minVelocityX = "minVelocityX".asInstanceOf[minVelocityX]
  @scala.inline
  def minVelocityY: minVelocityY = "minVelocityY".asInstanceOf[minVelocityY]
  @scala.inline
  def none: none = "none".asInstanceOf[none]
  @scala.inline
  def `on-drag`: `on-drag` = "on-drag".asInstanceOf[`on-drag`]
  @scala.inline
  def onGestureEvent: onGestureEvent = "onGestureEvent".asInstanceOf[onGestureEvent]
  @scala.inline
  def onHandlerStateChange: onHandlerStateChange = "onHandlerStateChange".asInstanceOf[onHandlerStateChange]
  @scala.inline
  def right: right = "right".asInstanceOf[right]
  @scala.inline
  def slide: slide = "slide".asInstanceOf[slide]
  @scala.inline
  def unlocked: unlocked = "unlocked".asInstanceOf[unlocked]
}

