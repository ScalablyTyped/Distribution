package typings
package quillLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object quillLibStrings {
  @js.native
  sealed trait api
    extends quillLib.quillMod.Sources
  
  @js.native
  sealed trait `editor-change` extends js.Object
  
  @js.native
  sealed trait `selection-change` extends js.Object
  
  @js.native
  sealed trait silent
    extends quillLib.quillMod.Sources
  
  @js.native
  sealed trait `text-change` extends js.Object
  
  @js.native
  sealed trait user
    extends quillLib.quillMod.Sources
  
  @scala.inline
  def api: api = "api".asInstanceOf[api]
  @scala.inline
  def `editor-change`: `editor-change` = "editor-change".asInstanceOf[`editor-change`]
  @scala.inline
  def `selection-change`: `selection-change` = "selection-change".asInstanceOf[`selection-change`]
  @scala.inline
  def silent: silent = "silent".asInstanceOf[silent]
  @scala.inline
  def `text-change`: `text-change` = "text-change".asInstanceOf[`text-change`]
  @scala.inline
  def user: user = "user".asInstanceOf[user]
}

