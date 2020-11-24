package typings.rcMotion

import typings.rcMotion.diffMod.DiffStatus
import typings.rcMotion.interfaceMod.MotionStatus
import typings.rcMotion.interfaceMod.StepStatus
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object rcMotionStrings {
  
  @scala.inline
  def active: active = "active".asInstanceOf[active]
  
  @scala.inline
  def add: add = "add".asInstanceOf[add]
  
  @scala.inline
  def appear: appear = "appear".asInstanceOf[appear]
  
  @scala.inline
  def end: end = "end".asInstanceOf[end]
  
  @scala.inline
  def enter: enter = "enter".asInstanceOf[enter]
  
  @scala.inline
  def keep: keep = "keep".asInstanceOf[keep]
  
  @scala.inline
  def leave: leave = "leave".asInstanceOf[leave]
  
  @scala.inline
  def none: none = "none".asInstanceOf[none]
  
  @scala.inline
  def prepare: prepare = "prepare".asInstanceOf[prepare]
  
  @scala.inline
  def remove: remove = "remove".asInstanceOf[remove]
  
  @scala.inline
  def removed: removed = "removed".asInstanceOf[removed]
  
  @scala.inline
  def start: start = "start".asInstanceOf[start]
  
  @js.native
  sealed trait active extends StepStatus
  
  @js.native
  sealed trait add extends DiffStatus
  
  @js.native
  sealed trait appear extends MotionStatus
  
  @js.native
  sealed trait end extends StepStatus
  
  @js.native
  sealed trait enter extends MotionStatus
  
  @js.native
  sealed trait keep extends DiffStatus
  
  @js.native
  sealed trait leave extends MotionStatus
  
  @js.native
  sealed trait none
    extends MotionStatus
       with StepStatus
  
  @js.native
  sealed trait prepare extends StepStatus
  
  @js.native
  sealed trait remove extends DiffStatus
  
  @js.native
  sealed trait removed extends DiffStatus
  
  @js.native
  sealed trait start extends StepStatus
}
