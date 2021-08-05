package typings.scrollIntoViewIfNeeded

import typings.scrollIntoViewIfNeeded.typesMod.ScrollBehavior
import typings.scrollIntoViewIfNeeded.typesMod.ScrollLogicalPosition
import typings.scrollIntoViewIfNeeded.typesMod.ScrollMode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object scrollIntoViewIfNeededStrings {
  
  @js.native
  sealed trait always
    extends StObject
       with ScrollMode
  inline def always: always = "always".asInstanceOf[always]
  
  @js.native
  sealed trait auto
    extends StObject
       with ScrollBehavior
  inline def auto: auto = "auto".asInstanceOf[auto]
  
  @js.native
  sealed trait center
    extends StObject
       with ScrollLogicalPosition
  inline def center: center = "center".asInstanceOf[center]
  
  @js.native
  sealed trait end
    extends StObject
       with ScrollLogicalPosition
  inline def end: end = "end".asInstanceOf[end]
  
  @js.native
  sealed trait `if-needed`
    extends StObject
       with ScrollMode
  inline def `if-needed`: `if-needed` = "if-needed".asInstanceOf[`if-needed`]
  
  @js.native
  sealed trait nearest
    extends StObject
       with ScrollLogicalPosition
  inline def nearest: nearest = "nearest".asInstanceOf[nearest]
  
  @js.native
  sealed trait smooth
    extends StObject
       with ScrollBehavior
  inline def smooth: smooth = "smooth".asInstanceOf[smooth]
  
  @js.native
  sealed trait start
    extends StObject
       with ScrollLogicalPosition
  inline def start: start = "start".asInstanceOf[start]
}
