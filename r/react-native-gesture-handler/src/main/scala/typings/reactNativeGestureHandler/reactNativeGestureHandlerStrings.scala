package typings.reactNativeGestureHandler

import typings.reactNativeGestureHandler.drawerLayoutMod.DrawerKeyboardDismissMode
import typings.reactNativeGestureHandler.drawerLayoutMod.DrawerLockMode
import typings.reactNativeGestureHandler.drawerLayoutMod.DrawerPosition
import typings.reactNativeGestureHandler.drawerLayoutMod.DrawerState
import typings.reactNativeGestureHandler.drawerLayoutMod.DrawerType
import typings.reactNativeGestureHandler.swipeableMod.SwipeableExcludes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object reactNativeGestureHandlerStrings {
  
  @js.native
  sealed trait Dragging
    extends StObject
       with DrawerState
  inline def Dragging: Dragging = "Dragging".asInstanceOf[Dragging]
  
  @js.native
  sealed trait Idle
    extends StObject
       with DrawerState
  inline def Idle: Idle = "Idle".asInstanceOf[Idle]
  
  @js.native
  sealed trait Settling
    extends StObject
       with DrawerState
  inline def Settling: Settling = "Settling".asInstanceOf[Settling]
  
  @js.native
  sealed trait activeOffsetX
    extends StObject
       with SwipeableExcludes
  inline def activeOffsetX: activeOffsetX = "activeOffsetX".asInstanceOf[activeOffsetX]
  
  @js.native
  sealed trait activeOffsetY
    extends StObject
       with SwipeableExcludes
  inline def activeOffsetY: activeOffsetY = "activeOffsetY".asInstanceOf[activeOffsetY]
  
  @js.native
  sealed trait avgTouches
    extends StObject
       with SwipeableExcludes
  inline def avgTouches: avgTouches = "avgTouches".asInstanceOf[avgTouches]
  
  @js.native
  sealed trait back
    extends StObject
       with DrawerType
  inline def back: back = "back".asInstanceOf[back]
  
  @js.native
  sealed trait enabled
    extends StObject
       with SwipeableExcludes
  inline def enabled: enabled = "enabled".asInstanceOf[enabled]
  
  @js.native
  sealed trait failOffsetX
    extends StObject
       with SwipeableExcludes
  inline def failOffsetX: failOffsetX = "failOffsetX".asInstanceOf[failOffsetX]
  
  @js.native
  sealed trait failOffsetY
    extends StObject
       with SwipeableExcludes
  inline def failOffsetY: failOffsetY = "failOffsetY".asInstanceOf[failOffsetY]
  
  @js.native
  sealed trait front
    extends StObject
       with DrawerType
  inline def front: front = "front".asInstanceOf[front]
  
  @js.native
  sealed trait hitSlop
    extends StObject
       with SwipeableExcludes
  inline def hitSlop: hitSlop = "hitSlop".asInstanceOf[hitSlop]
  
  @js.native
  sealed trait id
    extends StObject
       with SwipeableExcludes
  inline def id: id = "id".asInstanceOf[id]
  
  @js.native
  sealed trait left
    extends StObject
       with DrawerPosition
  inline def left: left = "left".asInstanceOf[left]
  
  @js.native
  sealed trait `locked-closed`
    extends StObject
       with DrawerLockMode
  inline def `locked-closed`: `locked-closed` = "locked-closed".asInstanceOf[`locked-closed`]
  
  @js.native
  sealed trait `locked-open`
    extends StObject
       with DrawerLockMode
  inline def `locked-open`: `locked-open` = "locked-open".asInstanceOf[`locked-open`]
  
  @js.native
  sealed trait maxDeltaX
    extends StObject
       with SwipeableExcludes
  inline def maxDeltaX: maxDeltaX = "maxDeltaX".asInstanceOf[maxDeltaX]
  
  @js.native
  sealed trait maxDeltaY
    extends StObject
       with SwipeableExcludes
  inline def maxDeltaY: maxDeltaY = "maxDeltaY".asInstanceOf[maxDeltaY]
  
  @js.native
  sealed trait maxPointers
    extends StObject
       with SwipeableExcludes
  inline def maxPointers: maxPointers = "maxPointers".asInstanceOf[maxPointers]
  
  @js.native
  sealed trait minDeltaX
    extends StObject
       with SwipeableExcludes
  inline def minDeltaX: minDeltaX = "minDeltaX".asInstanceOf[minDeltaX]
  
  @js.native
  sealed trait minDeltaY
    extends StObject
       with SwipeableExcludes
  inline def minDeltaY: minDeltaY = "minDeltaY".asInstanceOf[minDeltaY]
  
  @js.native
  sealed trait minDist
    extends StObject
       with SwipeableExcludes
  inline def minDist: minDist = "minDist".asInstanceOf[minDist]
  
  @js.native
  sealed trait minOffsetX
    extends StObject
       with SwipeableExcludes
  inline def minOffsetX: minOffsetX = "minOffsetX".asInstanceOf[minOffsetX]
  
  @js.native
  sealed trait minOffsetY
    extends StObject
       with SwipeableExcludes
  inline def minOffsetY: minOffsetY = "minOffsetY".asInstanceOf[minOffsetY]
  
  @js.native
  sealed trait minPointers
    extends StObject
       with SwipeableExcludes
  inline def minPointers: minPointers = "minPointers".asInstanceOf[minPointers]
  
  @js.native
  sealed trait minVelocity
    extends StObject
       with SwipeableExcludes
  inline def minVelocity: minVelocity = "minVelocity".asInstanceOf[minVelocity]
  
  @js.native
  sealed trait minVelocityX
    extends StObject
       with SwipeableExcludes
  inline def minVelocityX: minVelocityX = "minVelocityX".asInstanceOf[minVelocityX]
  
  @js.native
  sealed trait minVelocityY
    extends StObject
       with SwipeableExcludes
  inline def minVelocityY: minVelocityY = "minVelocityY".asInstanceOf[minVelocityY]
  
  @js.native
  sealed trait none
    extends StObject
       with DrawerKeyboardDismissMode
  inline def none: none = "none".asInstanceOf[none]
  
  @js.native
  sealed trait `on-drag`
    extends StObject
       with DrawerKeyboardDismissMode
  inline def `on-drag`: `on-drag` = "on-drag".asInstanceOf[`on-drag`]
  
  @js.native
  sealed trait right
    extends StObject
       with DrawerPosition
  inline def right: right = "right".asInstanceOf[right]
  
  @js.native
  sealed trait shouldCancelWhenOutside
    extends StObject
       with SwipeableExcludes
  inline def shouldCancelWhenOutside: shouldCancelWhenOutside = "shouldCancelWhenOutside".asInstanceOf[shouldCancelWhenOutside]
  
  @js.native
  sealed trait simultaneousHandlers
    extends StObject
       with SwipeableExcludes
  inline def simultaneousHandlers: simultaneousHandlers = "simultaneousHandlers".asInstanceOf[simultaneousHandlers]
  
  @js.native
  sealed trait slide
    extends StObject
       with DrawerType
  inline def slide: slide = "slide".asInstanceOf[slide]
  
  @js.native
  sealed trait unlocked
    extends StObject
       with DrawerLockMode
  inline def unlocked: unlocked = "unlocked".asInstanceOf[unlocked]
  
  @js.native
  sealed trait waitFor
    extends StObject
       with SwipeableExcludes
  inline def waitFor: waitFor = "waitFor".asInstanceOf[waitFor]
}
