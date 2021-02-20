package typings.sanitizeHtml

import typings.sanitizeHtml.mod.DisallowedTagsModes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sanitizeHtmlStrings {
  
  @js.native
  sealed trait discard extends DisallowedTagsModes
  @scala.inline
  def discard: discard = "discard".asInstanceOf[discard]
  
  @js.native
  sealed trait escape extends DisallowedTagsModes
  @scala.inline
  def escape: escape = "escape".asInstanceOf[escape]
  
  @js.native
  sealed trait recursiveEscape extends DisallowedTagsModes
  @scala.inline
  def recursiveEscape: recursiveEscape = "recursiveEscape".asInstanceOf[recursiveEscape]
}
