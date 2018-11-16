package typings
package quillLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object quillLibStrings {
  @js.native
  sealed trait api extends js.Object
  
  @js.native
  sealed trait `editor-change` extends js.Object
  
  @js.native
  sealed trait `selection-change` extends js.Object
  
  @js.native
  sealed trait silent extends js.Object
  
  @js.native
  sealed trait `text-change` extends js.Object
  
  @js.native
  sealed trait user extends js.Object
  
  def api: api = "api".asInstanceOf[api]
  def `editor-change`: `editor-change` = "editor-change".asInstanceOf[`editor-change`]
  def `selection-change`: `selection-change` = "selection-change".asInstanceOf[`selection-change`]
  def silent: silent = "silent".asInstanceOf[silent]
  def `text-change`: `text-change` = "text-change".asInstanceOf[`text-change`]
  def user: user = "user".asInstanceOf[user]
}

