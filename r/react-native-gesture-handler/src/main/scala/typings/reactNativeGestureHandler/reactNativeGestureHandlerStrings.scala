package typings.reactNativeGestureHandler

import typings.reactNativeGestureHandler.drawerLayoutMod.DrawerKeyboardDismissMode
import typings.reactNativeGestureHandler.drawerLayoutMod.DrawerLockMode
import typings.reactNativeGestureHandler.drawerLayoutMod.DrawerPosition
import typings.reactNativeGestureHandler.drawerLayoutMod.DrawerState
import typings.reactNativeGestureHandler.drawerLayoutMod.DrawerType
import typings.reactNativeGestureHandler.swipeableMod.SwipeableExcludes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object reactNativeGestureHandlerStrings {
  
  @js.native
  sealed trait Dragging extends DrawerState
  @scala.inline
  def Dragging: Dragging = "Dragging".asInstanceOf[Dragging]
  
  @js.native
  sealed trait Idle extends DrawerState
  @scala.inline
  def Idle: Idle = "Idle".asInstanceOf[Idle]
  
  @js.native
  sealed trait Settling extends DrawerState
  @scala.inline
  def Settling: Settling = "Settling".asInstanceOf[Settling]
  
  @js.native
  sealed trait activeOffsetX extends SwipeableExcludes
  @scala.inline
  def activeOffsetX: activeOffsetX = "activeOffsetX".asInstanceOf[activeOffsetX]
  
  @js.native
  sealed trait activeOffsetY extends SwipeableExcludes
  @scala.inline
  def activeOffsetY: activeOffsetY = "activeOffsetY".asInstanceOf[activeOffsetY]
  
  @js.native
  sealed trait avgTouches extends SwipeableExcludes
  @scala.inline
  def avgTouches: avgTouches = "avgTouches".asInstanceOf[avgTouches]
  
  @js.native
  sealed trait back extends DrawerType
  @scala.inline
  def back: back = "back".asInstanceOf[back]
  
  @js.native
  sealed trait enabled extends SwipeableExcludes
  @scala.inline
  def enabled: enabled = "enabled".asInstanceOf[enabled]
  
  @js.native
  sealed trait failOffsetX extends SwipeableExcludes
  @scala.inline
  def failOffsetX: failOffsetX = "failOffsetX".asInstanceOf[failOffsetX]
  
  @js.native
  sealed trait failOffsetY extends SwipeableExcludes
  @scala.inline
  def failOffsetY: failOffsetY = "failOffsetY".asInstanceOf[failOffsetY]
  
  @js.native
  sealed trait front extends DrawerType
  @scala.inline
  def front: front = "front".asInstanceOf[front]
  
  @js.native
  sealed trait hitSlop extends SwipeableExcludes
  @scala.inline
  def hitSlop: hitSlop = "hitSlop".asInstanceOf[hitSlop]
  
  @js.native
  sealed trait id extends SwipeableExcludes
  @scala.inline
  def id: id = "id".asInstanceOf[id]
  
  @js.native
  sealed trait left extends DrawerPosition
  @scala.inline
  def left: left = "left".asInstanceOf[left]
  
  @js.native
  sealed trait `locked-closed` extends DrawerLockMode
  @scala.inline
  def `locked-closed`: `locked-closed` = "locked-closed".asInstanceOf[`locked-closed`]
  
  @js.native
  sealed trait `locked-open` extends DrawerLockMode
  @scala.inline
  def `locked-open`: `locked-open` = "locked-open".asInstanceOf[`locked-open`]
  
  @js.native
  sealed trait maxDeltaX extends SwipeableExcludes
  @scala.inline
  def maxDeltaX: maxDeltaX = "maxDeltaX".asInstanceOf[maxDeltaX]
  
  @js.native
  sealed trait maxDeltaY extends SwipeableExcludes
  @scala.inline
  def maxDeltaY: maxDeltaY = "maxDeltaY".asInstanceOf[maxDeltaY]
  
  @js.native
  sealed trait maxPointers extends SwipeableExcludes
  @scala.inline
  def maxPointers: maxPointers = "maxPointers".asInstanceOf[maxPointers]
  
  @js.native
  sealed trait minDeltaX extends SwipeableExcludes
  @scala.inline
  def minDeltaX: minDeltaX = "minDeltaX".asInstanceOf[minDeltaX]
  
  @js.native
  sealed trait minDeltaY extends SwipeableExcludes
  @scala.inline
  def minDeltaY: minDeltaY = "minDeltaY".asInstanceOf[minDeltaY]
  
  @js.native
  sealed trait minDist extends SwipeableExcludes
  @scala.inline
  def minDist: minDist = "minDist".asInstanceOf[minDist]
  
  @js.native
  sealed trait minOffsetX extends SwipeableExcludes
  @scala.inline
  def minOffsetX: minOffsetX = "minOffsetX".asInstanceOf[minOffsetX]
  
  @js.native
  sealed trait minOffsetY extends SwipeableExcludes
  @scala.inline
  def minOffsetY: minOffsetY = "minOffsetY".asInstanceOf[minOffsetY]
  
  @js.native
  sealed trait minPointers extends SwipeableExcludes
  @scala.inline
  def minPointers: minPointers = "minPointers".asInstanceOf[minPointers]
  
  @js.native
  sealed trait minVelocity extends SwipeableExcludes
  @scala.inline
  def minVelocity: minVelocity = "minVelocity".asInstanceOf[minVelocity]
  
  @js.native
  sealed trait minVelocityX extends SwipeableExcludes
  @scala.inline
  def minVelocityX: minVelocityX = "minVelocityX".asInstanceOf[minVelocityX]
  
  @js.native
  sealed trait minVelocityY extends SwipeableExcludes
  @scala.inline
  def minVelocityY: minVelocityY = "minVelocityY".asInstanceOf[minVelocityY]
  
  @js.native
  sealed trait none extends DrawerKeyboardDismissMode
  @scala.inline
  def none: none = "none".asInstanceOf[none]
  
  @js.native
  sealed trait `on-drag` extends DrawerKeyboardDismissMode
  @scala.inline
  def `on-drag`: `on-drag` = "on-drag".asInstanceOf[`on-drag`]
  
  @js.native
  sealed trait right extends DrawerPosition
  @scala.inline
  def right: right = "right".asInstanceOf[right]
  
  @js.native
  sealed trait shouldCancelWhenOutside extends SwipeableExcludes
  @scala.inline
  def shouldCancelWhenOutside: shouldCancelWhenOutside = "shouldCancelWhenOutside".asInstanceOf[shouldCancelWhenOutside]
  
  @js.native
  sealed trait simultaneousHandlers extends SwipeableExcludes
  @scala.inline
  def simultaneousHandlers: simultaneousHandlers = "simultaneousHandlers".asInstanceOf[simultaneousHandlers]
  
  @js.native
  sealed trait slide extends DrawerType
  @scala.inline
  def slide: slide = "slide".asInstanceOf[slide]
  
  @js.native
  sealed trait unlocked extends DrawerLockMode
  @scala.inline
  def unlocked: unlocked = "unlocked".asInstanceOf[unlocked]
  
  @js.native
  sealed trait waitFor extends SwipeableExcludes
  @scala.inline
  def waitFor: waitFor = "waitFor".asInstanceOf[waitFor]
}
