package typings.scrollmagic

import typings.scrollmagic.mod.EventType
import typings.scrollmagic.mod.InfoOption
import typings.scrollmagic.mod.SceneState
import typings.scrollmagic.mod.ScrollDirection
import typings.scrollmagic.mod._TriggerHook
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object scrollmagicStrings {
  
  @js.native
  sealed trait AFTER
    extends StObject
       with SceneState
  inline def AFTER: AFTER = "AFTER".asInstanceOf[AFTER]
  
  @js.native
  sealed trait BEFORE
    extends StObject
       with SceneState
  inline def BEFORE: BEFORE = "BEFORE".asInstanceOf[BEFORE]
  
  @js.native
  sealed trait DURING
    extends StObject
       with SceneState
  inline def DURING: DURING = "DURING".asInstanceOf[DURING]
  
  @js.native
  sealed trait FORWARD
    extends StObject
       with ScrollDirection
  inline def FORWARD: FORWARD = "FORWARD".asInstanceOf[FORWARD]
  
  @js.native
  sealed trait PAUSED
    extends StObject
       with ScrollDirection
  inline def PAUSED: PAUSED = "PAUSED".asInstanceOf[PAUSED]
  
  @js.native
  sealed trait REVERSE
    extends StObject
       with ScrollDirection
  inline def REVERSE: REVERSE = "REVERSE".asInstanceOf[REVERSE]
  
  @js.native
  sealed trait add
    extends StObject
       with EventType
  inline def add: add = "add".asInstanceOf[add]
  
  @js.native
  sealed trait change
    extends StObject
       with EventType
  inline def change: change = "change".asInstanceOf[change]
  
  @js.native
  sealed trait container
    extends StObject
       with InfoOption
  inline def container: container = "container".asInstanceOf[container]
  
  @js.native
  sealed trait destroy
    extends StObject
       with EventType
  inline def destroy: destroy = "destroy".asInstanceOf[destroy]
  
  @js.native
  sealed trait end
    extends StObject
       with EventType
  inline def end: end = "end".asInstanceOf[end]
  
  @js.native
  sealed trait enter
    extends StObject
       with EventType
  inline def enter: enter = "enter".asInstanceOf[enter]
  
  @js.native
  sealed trait isDocument
    extends StObject
       with InfoOption
  inline def isDocument: isDocument = "isDocument".asInstanceOf[isDocument]
  
  @js.native
  sealed trait leave
    extends StObject
       with EventType
  inline def leave: leave = "leave".asInstanceOf[leave]
  
  @js.native
  sealed trait onCenter
    extends StObject
       with _TriggerHook
  inline def onCenter: onCenter = "onCenter".asInstanceOf[onCenter]
  
  @js.native
  sealed trait onEnter
    extends StObject
       with _TriggerHook
  inline def onEnter: onEnter = "onEnter".asInstanceOf[onEnter]
  
  @js.native
  sealed trait onLeave
    extends StObject
       with _TriggerHook
  inline def onLeave: onLeave = "onLeave".asInstanceOf[onLeave]
  
  @js.native
  sealed trait progress
    extends StObject
       with EventType
  inline def progress: progress = "progress".asInstanceOf[progress]
  
  @js.native
  sealed trait remove
    extends StObject
       with EventType
  inline def remove: remove = "remove".asInstanceOf[remove]
  
  @js.native
  sealed trait scrollDirection
    extends StObject
       with InfoOption
  inline def scrollDirection: scrollDirection = "scrollDirection".asInstanceOf[scrollDirection]
  
  @js.native
  sealed trait scrollPos
    extends StObject
       with InfoOption
  inline def scrollPos: scrollPos = "scrollPos".asInstanceOf[scrollPos]
  
  @js.native
  sealed trait shift
    extends StObject
       with EventType
  inline def shift: shift = "shift".asInstanceOf[shift]
  
  @js.native
  sealed trait size
    extends StObject
       with InfoOption
  inline def size: size = "size".asInstanceOf[size]
  
  @js.native
  sealed trait start
    extends StObject
       with EventType
  inline def start: start = "start".asInstanceOf[start]
  
  @js.native
  sealed trait update
    extends StObject
       with EventType
  inline def update: update = "update".asInstanceOf[update]
  
  @js.native
  sealed trait vertical
    extends StObject
       with InfoOption
  inline def vertical: vertical = "vertical".asInstanceOf[vertical]
}
