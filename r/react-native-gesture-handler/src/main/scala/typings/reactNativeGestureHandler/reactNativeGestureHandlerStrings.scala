package typings.reactNativeGestureHandler

import typings.reactNativeGestureHandler.drawerLayoutMod.DrawerKeyboardDismissMode
import typings.reactNativeGestureHandler.drawerLayoutMod.DrawerLockMode
import typings.reactNativeGestureHandler.drawerLayoutMod.DrawerPosition
import typings.reactNativeGestureHandler.drawerLayoutMod.DrawerState
import typings.reactNativeGestureHandler.drawerLayoutMod.DrawerType
import typings.reactNativeGestureHandler.swipeableMod.SwipeableExcludes
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object reactNativeGestureHandlerStrings {
  @js.native
  sealed trait Dragging extends DrawerState
  
  @js.native
  sealed trait Idle extends DrawerState
  
  @js.native
  sealed trait Settling extends DrawerState
  
  @js.native
  sealed trait activeOffsetX extends SwipeableExcludes
  
  @js.native
  sealed trait activeOffsetY extends SwipeableExcludes
  
  @js.native
  sealed trait avgTouches extends SwipeableExcludes
  
  @js.native
  sealed trait back extends DrawerType
  
  @js.native
  sealed trait enabled extends SwipeableExcludes
  
  @js.native
  sealed trait failOffsetX extends SwipeableExcludes
  
  @js.native
  sealed trait failOffsetY extends SwipeableExcludes
  
  @js.native
  sealed trait front extends DrawerType
  
  @js.native
  sealed trait hitSlop extends SwipeableExcludes
  
  @js.native
  sealed trait id extends SwipeableExcludes
  
  @js.native
  sealed trait left extends DrawerPosition
  
  @js.native
  sealed trait `locked-closed` extends DrawerLockMode
  
  @js.native
  sealed trait `locked-open` extends DrawerLockMode
  
  @js.native
  sealed trait maxDeltaX extends SwipeableExcludes
  
  @js.native
  sealed trait maxDeltaY extends SwipeableExcludes
  
  @js.native
  sealed trait maxPointers extends SwipeableExcludes
  
  @js.native
  sealed trait minDeltaX extends SwipeableExcludes
  
  @js.native
  sealed trait minDeltaY extends SwipeableExcludes
  
  @js.native
  sealed trait minDist extends SwipeableExcludes
  
  @js.native
  sealed trait minOffsetX extends SwipeableExcludes
  
  @js.native
  sealed trait minOffsetY extends SwipeableExcludes
  
  @js.native
  sealed trait minPointers extends SwipeableExcludes
  
  @js.native
  sealed trait minVelocity extends SwipeableExcludes
  
  @js.native
  sealed trait minVelocityX extends SwipeableExcludes
  
  @js.native
  sealed trait minVelocityY extends SwipeableExcludes
  
  @js.native
  sealed trait none extends DrawerKeyboardDismissMode
  
  @js.native
  sealed trait `on-drag` extends DrawerKeyboardDismissMode
  
  @js.native
  sealed trait right extends DrawerPosition
  
  @js.native
  sealed trait shouldCancelWhenOutside extends SwipeableExcludes
  
  @js.native
  sealed trait simultaneousHandlers extends SwipeableExcludes
  
  @js.native
  sealed trait slide extends DrawerType
  
  @js.native
  sealed trait unlocked extends DrawerLockMode
  
  @js.native
  sealed trait waitFor extends SwipeableExcludes
  
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
  def enabled: enabled = "enabled".asInstanceOf[enabled]
  @scala.inline
  def failOffsetX: failOffsetX = "failOffsetX".asInstanceOf[failOffsetX]
  @scala.inline
  def failOffsetY: failOffsetY = "failOffsetY".asInstanceOf[failOffsetY]
  @scala.inline
  def front: front = "front".asInstanceOf[front]
  @scala.inline
  def hitSlop: hitSlop = "hitSlop".asInstanceOf[hitSlop]
  @scala.inline
  def id: id = "id".asInstanceOf[id]
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
  def right: right = "right".asInstanceOf[right]
  @scala.inline
  def shouldCancelWhenOutside: shouldCancelWhenOutside = "shouldCancelWhenOutside".asInstanceOf[shouldCancelWhenOutside]
  @scala.inline
  def simultaneousHandlers: simultaneousHandlers = "simultaneousHandlers".asInstanceOf[simultaneousHandlers]
  @scala.inline
  def slide: slide = "slide".asInstanceOf[slide]
  @scala.inline
  def unlocked: unlocked = "unlocked".asInstanceOf[unlocked]
  @scala.inline
  def waitFor: waitFor = "waitFor".asInstanceOf[waitFor]
}

