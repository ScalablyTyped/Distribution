package typings.slideout

import typings.slideout.mod.Events
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object slideoutStrings {
  
  @js.native
  sealed trait beforeclose extends Events
  @scala.inline
  def beforeclose: beforeclose = "beforeclose".asInstanceOf[beforeclose]
  
  @js.native
  sealed trait beforeopen extends Events
  @scala.inline
  def beforeopen: beforeopen = "beforeopen".asInstanceOf[beforeopen]
  
  @js.native
  sealed trait close extends Events
  @scala.inline
  def close: close = "close".asInstanceOf[close]
  
  @js.native
  sealed trait left extends StObject
  @scala.inline
  def left: left = "left".asInstanceOf[left]
  
  @js.native
  sealed trait open extends Events
  @scala.inline
  def open: open = "open".asInstanceOf[open]
  
  @js.native
  sealed trait right extends StObject
  @scala.inline
  def right: right = "right".asInstanceOf[right]
  
  @js.native
  sealed trait translate extends Events
  @scala.inline
  def translate: translate = "translate".asInstanceOf[translate]
  
  @js.native
  sealed trait translateend extends Events
  @scala.inline
  def translateend: translateend = "translateend".asInstanceOf[translateend]
  
  @js.native
  sealed trait translatestart extends Events
  @scala.inline
  def translatestart: translatestart = "translatestart".asInstanceOf[translatestart]
}
