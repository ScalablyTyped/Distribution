package typings
package slideoutLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object slideoutLibStrings {
  @js.native
  sealed trait beforeclose
    extends slideoutLib.slideoutMod.Events
  
  @js.native
  sealed trait beforeopen
    extends slideoutLib.slideoutMod.Events
  
  @js.native
  sealed trait close
    extends slideoutLib.slideoutMod.Events
  
  @js.native
  sealed trait left extends js.Object
  
  @js.native
  sealed trait open
    extends slideoutLib.slideoutMod.Events
  
  @js.native
  sealed trait right extends js.Object
  
  @js.native
  sealed trait translate
    extends slideoutLib.slideoutMod.Events
  
  @js.native
  sealed trait translateend
    extends slideoutLib.slideoutMod.Events
  
  @js.native
  sealed trait translatestart
    extends slideoutLib.slideoutMod.Events
  
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
}

