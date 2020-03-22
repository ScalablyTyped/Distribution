package typings.sanitizeHtml

import typings.sanitizeHtml.mod.DisallowedTagsModes
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object sanitizeHtmlStrings {
  @js.native
  sealed trait discard extends DisallowedTagsModes
  
  @js.native
  sealed trait escape extends DisallowedTagsModes
  
  @js.native
  sealed trait recursiveEscape extends DisallowedTagsModes
  
  @scala.inline
  def discard: discard = "discard".asInstanceOf[discard]
  @scala.inline
  def escape: escape = "escape".asInstanceOf[escape]
  @scala.inline
  def recursiveEscape: recursiveEscape = "recursiveEscape".asInstanceOf[recursiveEscape]
}

