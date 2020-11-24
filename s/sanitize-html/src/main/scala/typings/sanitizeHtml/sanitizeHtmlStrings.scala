package typings.sanitizeHtml

import typings.sanitizeHtml.mod.DisallowedTagsModes
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sanitizeHtmlStrings {
  
  @scala.inline
  def discard: discard = "discard".asInstanceOf[discard]
  
  @scala.inline
  def escape: escape = "escape".asInstanceOf[escape]
  
  @scala.inline
  def recursiveEscape: recursiveEscape = "recursiveEscape".asInstanceOf[recursiveEscape]
  
  @js.native
  sealed trait discard extends DisallowedTagsModes
  
  @js.native
  sealed trait escape extends DisallowedTagsModes
  
  @js.native
  sealed trait recursiveEscape extends DisallowedTagsModes
}
