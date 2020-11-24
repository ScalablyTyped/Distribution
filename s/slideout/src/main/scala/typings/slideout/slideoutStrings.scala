package typings.slideout

import typings.slideout.mod.Events
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object slideoutStrings {
  
  @scala.inline
  def beforeclose: beforeclose = "beforeclose".asInstanceOf[beforeclose]
  
  @scala.inline
  def beforeopen: beforeopen = "beforeopen".asInstanceOf[beforeopen]
  
  @scala.inline
  def close: close = "close".asInstanceOf[close]
  
  @scala.inline
  def left: left = "left".asInstanceOf[left]
  
  @scala.inline
  def open: open = "open".asInstanceOf[open]
  
  @scala.inline
  def right: right = "right".asInstanceOf[right]
  
  @scala.inline
  def translate: translate = "translate".asInstanceOf[translate]
  
  @scala.inline
  def translateend: translateend = "translateend".asInstanceOf[translateend]
  
  @scala.inline
  def translatestart: translatestart = "translatestart".asInstanceOf[translatestart]
  
  @js.native
  sealed trait beforeclose extends Events
  
  @js.native
  sealed trait beforeopen extends Events
  
  @js.native
  sealed trait close extends Events
  
  @js.native
  sealed trait left extends js.Object
  
  @js.native
  sealed trait open extends Events
  
  @js.native
  sealed trait right extends js.Object
  
  @js.native
  sealed trait translate extends Events
  
  @js.native
  sealed trait translateend extends Events
  
  @js.native
  sealed trait translatestart extends Events
}
