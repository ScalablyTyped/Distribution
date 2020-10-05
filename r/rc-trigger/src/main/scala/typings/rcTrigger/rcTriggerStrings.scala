package typings.rcTrigger

import typings.rcTrigger.interfaceMod.MotionActiveStatus
import typings.rcTrigger.interfaceMod.MotionStatus
import typings.rcTrigger.popupMod._PopupStatus
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object rcTriggerStrings {
  @js.native
  sealed trait AfterMotion extends _PopupStatus
  
  @js.native
  sealed trait afterAlign extends _PopupStatus
  
  @js.native
  sealed trait align extends _PopupStatus
  
  @js.native
  sealed trait aligned extends _PopupStatus
  
  @js.native
  sealed trait appear extends MotionStatus
  
  @js.native
  sealed trait `appear-active` extends MotionActiveStatus
  
  @js.native
  sealed trait beforeMotion extends _PopupStatus
  
  @js.native
  sealed trait enter extends MotionStatus
  
  @js.native
  sealed trait `enter-active` extends MotionActiveStatus
  
  @js.native
  sealed trait leave extends MotionStatus
  
  @js.native
  sealed trait `leave-active` extends MotionActiveStatus
  
  @js.native
  sealed trait measure extends _PopupStatus
  
  @js.native
  sealed trait motion extends _PopupStatus
  
  @js.native
  sealed trait none extends MotionStatus
  
  @js.native
  sealed trait stable extends _PopupStatus
  
  @scala.inline
  def AfterMotion: AfterMotion = "AfterMotion".asInstanceOf[AfterMotion]
  @scala.inline
  def afterAlign: afterAlign = "afterAlign".asInstanceOf[afterAlign]
  @scala.inline
  def align: align = "align".asInstanceOf[align]
  @scala.inline
  def aligned: aligned = "aligned".asInstanceOf[aligned]
  @scala.inline
  def appear: appear = "appear".asInstanceOf[appear]
  @scala.inline
  def `appear-active`: `appear-active` = "appear-active".asInstanceOf[`appear-active`]
  @scala.inline
  def beforeMotion: beforeMotion = "beforeMotion".asInstanceOf[beforeMotion]
  @scala.inline
  def enter: enter = "enter".asInstanceOf[enter]
  @scala.inline
  def `enter-active`: `enter-active` = "enter-active".asInstanceOf[`enter-active`]
  @scala.inline
  def leave: leave = "leave".asInstanceOf[leave]
  @scala.inline
  def `leave-active`: `leave-active` = "leave-active".asInstanceOf[`leave-active`]
  @scala.inline
  def measure: measure = "measure".asInstanceOf[measure]
  @scala.inline
  def motion: motion = "motion".asInstanceOf[motion]
  @scala.inline
  def none: none = "none".asInstanceOf[none]
  @scala.inline
  def stable: stable = "stable".asInstanceOf[stable]
}

