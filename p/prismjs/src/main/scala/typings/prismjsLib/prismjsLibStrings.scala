package typings
package prismjsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object prismjsLibStrings {
  @js.native
  sealed trait `after-highlight`
    extends prismjsLib.prismjsMod.AvailableHooks
  
  @js.native
  sealed trait `before-highlight`
    extends prismjsLib.prismjsMod.AvailableHooks
  
  @js.native
  sealed trait `before-highlightall`
    extends prismjsLib.prismjsMod.AvailableHooks
  
  @js.native
  sealed trait `before-insert`
    extends prismjsLib.prismjsMod.AvailableHooks
  
  @js.native
  sealed trait `before-sanity-check`
    extends prismjsLib.prismjsMod.AvailableHooks
  
  @js.native
  sealed trait complete
    extends prismjsLib.prismjsMod.AvailableHooks
  
  @js.native
  sealed trait wrap
    extends prismjsLib.prismjsMod.AvailableHooks
  
  @scala.inline
  def `after-highlight`: `after-highlight` = "after-highlight".asInstanceOf[`after-highlight`]
  @scala.inline
  def `before-highlight`: `before-highlight` = "before-highlight".asInstanceOf[`before-highlight`]
  @scala.inline
  def `before-highlightall`: `before-highlightall` = "before-highlightall".asInstanceOf[`before-highlightall`]
  @scala.inline
  def `before-insert`: `before-insert` = "before-insert".asInstanceOf[`before-insert`]
  @scala.inline
  def `before-sanity-check`: `before-sanity-check` = "before-sanity-check".asInstanceOf[`before-sanity-check`]
  @scala.inline
  def complete: complete = "complete".asInstanceOf[complete]
  @scala.inline
  def wrap: wrap = "wrap".asInstanceOf[wrap]
}

