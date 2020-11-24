package typings.scrollmagic

import typings.scrollmagic.mod.EventType
import typings.scrollmagic.mod.InfoOption
import typings.scrollmagic.mod.SceneState
import typings.scrollmagic.mod.ScrollDirection
import typings.scrollmagic.mod._TriggerHook
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object scrollmagicStrings {
  
  @scala.inline
  def AFTER: AFTER = "AFTER".asInstanceOf[AFTER]
  
  @scala.inline
  def BEFORE: BEFORE = "BEFORE".asInstanceOf[BEFORE]
  
  @scala.inline
  def DURING: DURING = "DURING".asInstanceOf[DURING]
  
  @scala.inline
  def FORWARD: FORWARD = "FORWARD".asInstanceOf[FORWARD]
  
  @scala.inline
  def PAUSED: PAUSED = "PAUSED".asInstanceOf[PAUSED]
  
  @scala.inline
  def REVERSE: REVERSE = "REVERSE".asInstanceOf[REVERSE]
  
  @scala.inline
  def add: add = "add".asInstanceOf[add]
  
  @scala.inline
  def change: change = "change".asInstanceOf[change]
  
  @scala.inline
  def container: container = "container".asInstanceOf[container]
  
  @scala.inline
  def destroy: destroy = "destroy".asInstanceOf[destroy]
  
  @scala.inline
  def end: end = "end".asInstanceOf[end]
  
  @scala.inline
  def enter: enter = "enter".asInstanceOf[enter]
  
  @scala.inline
  def isDocument: isDocument = "isDocument".asInstanceOf[isDocument]
  
  @scala.inline
  def leave: leave = "leave".asInstanceOf[leave]
  
  @scala.inline
  def onCenter: onCenter = "onCenter".asInstanceOf[onCenter]
  
  @scala.inline
  def onEnter: onEnter = "onEnter".asInstanceOf[onEnter]
  
  @scala.inline
  def onLeave: onLeave = "onLeave".asInstanceOf[onLeave]
  
  @scala.inline
  def progress: progress = "progress".asInstanceOf[progress]
  
  @scala.inline
  def remove: remove = "remove".asInstanceOf[remove]
  
  @scala.inline
  def scrollDirection: scrollDirection = "scrollDirection".asInstanceOf[scrollDirection]
  
  @scala.inline
  def scrollPos: scrollPos = "scrollPos".asInstanceOf[scrollPos]
  
  @scala.inline
  def shift: shift = "shift".asInstanceOf[shift]
  
  @scala.inline
  def size: size = "size".asInstanceOf[size]
  
  @scala.inline
  def start: start = "start".asInstanceOf[start]
  
  @scala.inline
  def update: update = "update".asInstanceOf[update]
  
  @scala.inline
  def vertical: vertical = "vertical".asInstanceOf[vertical]
  
  @js.native
  sealed trait AFTER extends SceneState
  
  @js.native
  sealed trait BEFORE extends SceneState
  
  @js.native
  sealed trait DURING extends SceneState
  
  @js.native
  sealed trait FORWARD extends ScrollDirection
  
  @js.native
  sealed trait PAUSED extends ScrollDirection
  
  @js.native
  sealed trait REVERSE extends ScrollDirection
  
  @js.native
  sealed trait add extends EventType
  
  @js.native
  sealed trait change extends EventType
  
  @js.native
  sealed trait container extends InfoOption
  
  @js.native
  sealed trait destroy extends EventType
  
  @js.native
  sealed trait end extends EventType
  
  @js.native
  sealed trait enter extends EventType
  
  @js.native
  sealed trait isDocument extends InfoOption
  
  @js.native
  sealed trait leave extends EventType
  
  @js.native
  sealed trait onCenter extends _TriggerHook
  
  @js.native
  sealed trait onEnter extends _TriggerHook
  
  @js.native
  sealed trait onLeave extends _TriggerHook
  
  @js.native
  sealed trait progress extends EventType
  
  @js.native
  sealed trait remove extends EventType
  
  @js.native
  sealed trait scrollDirection extends InfoOption
  
  @js.native
  sealed trait scrollPos extends InfoOption
  
  @js.native
  sealed trait shift extends EventType
  
  @js.native
  sealed trait size extends InfoOption
  
  @js.native
  sealed trait start extends EventType
  
  @js.native
  sealed trait update extends EventType
  
  @js.native
  sealed trait vertical extends InfoOption
}
