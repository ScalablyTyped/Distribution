package typings.reactCollapsed

import typings.reactCollapsed.typesMod.ButtonType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object reactCollapsedStrings {
  
  @js.native
  sealed trait button
    extends StObject
       with ButtonType
  inline def button: button = "button".asInstanceOf[button]
  
  @js.native
  sealed trait reset
    extends StObject
       with ButtonType
  inline def reset: reset = "reset".asInstanceOf[reset]
  
  @js.native
  sealed trait submit
    extends StObject
       with ButtonType
  inline def submit: submit = "submit".asInstanceOf[submit]
}
