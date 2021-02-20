package typings.scrollmagic

import typings.scrollmagic.mod.EventType
import typings.scrollmagic.mod.InfoOption
import typings.scrollmagic.mod.SceneState
import typings.scrollmagic.mod.ScrollDirection
import typings.scrollmagic.mod._TriggerHook
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object scrollmagicStrings {
  
  @js.native
  sealed trait AFTER extends SceneState
  @scala.inline
  def AFTER: AFTER = "AFTER".asInstanceOf[AFTER]
  
  @js.native
  sealed trait BEFORE extends SceneState
  @scala.inline
  def BEFORE: BEFORE = "BEFORE".asInstanceOf[BEFORE]
  
  @js.native
  sealed trait DURING extends SceneState
  @scala.inline
  def DURING: DURING = "DURING".asInstanceOf[DURING]
  
  @js.native
  sealed trait FORWARD extends ScrollDirection
  @scala.inline
  def FORWARD: FORWARD = "FORWARD".asInstanceOf[FORWARD]
  
  @js.native
  sealed trait PAUSED extends ScrollDirection
  @scala.inline
  def PAUSED: PAUSED = "PAUSED".asInstanceOf[PAUSED]
  
  @js.native
  sealed trait REVERSE extends ScrollDirection
  @scala.inline
  def REVERSE: REVERSE = "REVERSE".asInstanceOf[REVERSE]
  
  @js.native
  sealed trait add extends EventType
  @scala.inline
  def add: add = "add".asInstanceOf[add]
  
  @js.native
  sealed trait change extends EventType
  @scala.inline
  def change: change = "change".asInstanceOf[change]
  
  @js.native
  sealed trait container extends InfoOption
  @scala.inline
  def container: container = "container".asInstanceOf[container]
  
  @js.native
  sealed trait destroy extends EventType
  @scala.inline
  def destroy: destroy = "destroy".asInstanceOf[destroy]
  
  @js.native
  sealed trait end extends EventType
  @scala.inline
  def end: end = "end".asInstanceOf[end]
  
  @js.native
  sealed trait enter extends EventType
  @scala.inline
  def enter: enter = "enter".asInstanceOf[enter]
  
  @js.native
  sealed trait isDocument extends InfoOption
  @scala.inline
  def isDocument: isDocument = "isDocument".asInstanceOf[isDocument]
  
  @js.native
  sealed trait leave extends EventType
  @scala.inline
  def leave: leave = "leave".asInstanceOf[leave]
  
  @js.native
  sealed trait onCenter extends _TriggerHook
  @scala.inline
  def onCenter: onCenter = "onCenter".asInstanceOf[onCenter]
  
  @js.native
  sealed trait onEnter extends _TriggerHook
  @scala.inline
  def onEnter: onEnter = "onEnter".asInstanceOf[onEnter]
  
  @js.native
  sealed trait onLeave extends _TriggerHook
  @scala.inline
  def onLeave: onLeave = "onLeave".asInstanceOf[onLeave]
  
  @js.native
  sealed trait progress extends EventType
  @scala.inline
  def progress: progress = "progress".asInstanceOf[progress]
  
  @js.native
  sealed trait remove extends EventType
  @scala.inline
  def remove: remove = "remove".asInstanceOf[remove]
  
  @js.native
  sealed trait scrollDirection extends InfoOption
  @scala.inline
  def scrollDirection: scrollDirection = "scrollDirection".asInstanceOf[scrollDirection]
  
  @js.native
  sealed trait scrollPos extends InfoOption
  @scala.inline
  def scrollPos: scrollPos = "scrollPos".asInstanceOf[scrollPos]
  
  @js.native
  sealed trait shift extends EventType
  @scala.inline
  def shift: shift = "shift".asInstanceOf[shift]
  
  @js.native
  sealed trait size extends InfoOption
  @scala.inline
  def size: size = "size".asInstanceOf[size]
  
  @js.native
  sealed trait start extends EventType
  @scala.inline
  def start: start = "start".asInstanceOf[start]
  
  @js.native
  sealed trait update extends EventType
  @scala.inline
  def update: update = "update".asInstanceOf[update]
  
  @js.native
  sealed trait vertical extends InfoOption
  @scala.inline
  def vertical: vertical = "vertical".asInstanceOf[vertical]
}
