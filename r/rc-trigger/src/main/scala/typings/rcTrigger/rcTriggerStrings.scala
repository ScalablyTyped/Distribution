package typings.rcTrigger

import typings.rcTrigger.useVisibleStatusMod._PopupStatus
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object rcTriggerStrings {
  
  @scala.inline
  def align: align = "align".asInstanceOf[align]
  
  @scala.inline
  def aligned: aligned = "aligned".asInstanceOf[aligned]
  
  @scala.inline
  def measure: measure = "measure".asInstanceOf[measure]
  
  @scala.inline
  def motion: motion = "motion".asInstanceOf[motion]
  
  @scala.inline
  def stable: stable = "stable".asInstanceOf[stable]
  
  @js.native
  sealed trait align extends _PopupStatus
  
  @js.native
  sealed trait aligned extends _PopupStatus
  
  @js.native
  sealed trait measure extends _PopupStatus
  
  @js.native
  sealed trait motion extends _PopupStatus
  
  @js.native
  sealed trait stable extends _PopupStatus
}
