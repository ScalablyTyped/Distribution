package typings.reachCombobox

import typings.reachCombobox.mod.State
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
  
  @js.native
  sealed trait button extends StObject
  inline def button: button = "button".asInstanceOf[button]
  
  @js.native
  sealed trait div extends StObject
  inline def div: div = "div".asInstanceOf[div]
  
  @js.native
  sealed trait input extends StObject
  inline def input: input = "input".asInstanceOf[input]
  
  @js.native
  sealed trait li extends StObject
  inline def li: li = "li".asInstanceOf[li]
  
  @js.native
  sealed trait ul extends StObject
  inline def ul: ul = "ul".asInstanceOf[ul]
}
