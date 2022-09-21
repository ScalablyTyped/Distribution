package typings.reachCombobox

import typings.reachCombobox.srcMod.State
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object reachComboboxStrings {
  
  @js.native
  sealed trait IDLE
    extends StObject
       with State
  inline def IDLE: IDLE = "IDLE".asInstanceOf[IDLE]
  
  @js.native
  sealed trait INTERACTING
    extends StObject
       with State
  inline def INTERACTING: INTERACTING = "INTERACTING".asInstanceOf[INTERACTING]
  
  @js.native
  sealed trait NAVIGATING
    extends StObject
       with State
  inline def NAVIGATING: NAVIGATING = "NAVIGATING".asInstanceOf[NAVIGATING]
  
  @js.native
  sealed trait SUGGESTING
    extends StObject
       with State
  inline def SUGGESTING: SUGGESTING = "SUGGESTING".asInstanceOf[SUGGESTING]
}
