package typings.rcMotion

import typings.rcMotion.diffMod.DiffStatus
import typings.rcMotion.interfaceMod.MotionStatus
import typings.rcMotion.interfaceMod.StepStatus
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object rcMotionStrings {
  
  @js.native
  sealed trait active
    extends StObject
       with StepStatus
  @scala.inline
  def active: active = "active".asInstanceOf[active]
  
  @js.native
  sealed trait add
    extends StObject
       with DiffStatus
  @scala.inline
  def add: add = "add".asInstanceOf[add]
  
  @js.native
  sealed trait appear
    extends StObject
       with MotionStatus
  @scala.inline
  def appear: appear = "appear".asInstanceOf[appear]
  
  @js.native
  sealed trait end
    extends StObject
       with StepStatus
  @scala.inline
  def end: end = "end".asInstanceOf[end]
  
  @js.native
  sealed trait enter
    extends StObject
       with MotionStatus
  @scala.inline
  def enter: enter = "enter".asInstanceOf[enter]
  
  @js.native
  sealed trait keep
    extends StObject
       with DiffStatus
  @scala.inline
  def keep: keep = "keep".asInstanceOf[keep]
  
  @js.native
  sealed trait leave
    extends StObject
       with MotionStatus
  @scala.inline
  def leave: leave = "leave".asInstanceOf[leave]
  
  @js.native
  sealed trait none
    extends StObject
       with MotionStatus
       with StepStatus
  @scala.inline
  def none: none = "none".asInstanceOf[none]
  
  @js.native
  sealed trait prepare
    extends StObject
       with StepStatus
  @scala.inline
  def prepare: prepare = "prepare".asInstanceOf[prepare]
  
  @js.native
  sealed trait remove
    extends StObject
       with DiffStatus
  @scala.inline
  def remove: remove = "remove".asInstanceOf[remove]
  
  @js.native
  sealed trait removed
    extends StObject
       with DiffStatus
  @scala.inline
  def removed: removed = "removed".asInstanceOf[removed]
  
  @js.native
  sealed trait start
    extends StObject
       with StepStatus
  @scala.inline
  def start: start = "start".asInstanceOf[start]
}
