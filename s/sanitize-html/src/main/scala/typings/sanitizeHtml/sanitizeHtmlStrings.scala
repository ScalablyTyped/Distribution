package typings.sanitizeHtml

import typings.sanitizeHtml.mod.DisallowedTagsModes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sanitizeHtmlStrings {
  
  @js.native
  sealed trait discard
    extends StObject
       with DisallowedTagsModes
  inline def discard: discard = "discard".asInstanceOf[discard]
  
  @js.native
  sealed trait escape
    extends StObject
       with DisallowedTagsModes
  inline def escape: escape = "escape".asInstanceOf[escape]
  
  @js.native
  sealed trait recursiveEscape
    extends StObject
       with DisallowedTagsModes
  inline def recursiveEscape: recursiveEscape = "recursiveEscape".asInstanceOf[recursiveEscape]
}
