package typings.primereact

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object terminalserviceMod {
  
  @JSImport("primereact/terminalservice/terminalservice", "TerminalService")
  @js.native
  val TerminalService: TerminalServiceOptions = js.native
  
  /* Rewritten from type alias, can be one of: 
    - typings.primereact.primereactStrings.command
    - typings.primereact.primereactStrings.response
    - typings.primereact.primereactStrings.clear
  */
  trait TerminalServiceActionType extends StObject
  object TerminalServiceActionType {
    
    inline def clear: typings.primereact.primereactStrings.clear = "clear".asInstanceOf[typings.primereact.primereactStrings.clear]
    
    inline def command: typings.primereact.primereactStrings.command = "command".asInstanceOf[typings.primereact.primereactStrings.command]
    
    inline def response: typings.primereact.primereactStrings.response = "response".asInstanceOf[typings.primereact.primereactStrings.response]
  }
  
  @js.native
  trait TerminalServiceOptions extends StObject {
    
    def emit(action: TerminalServiceActionType): Unit = js.native
    def emit(action: TerminalServiceActionType, params: Any): Unit = js.native
    
    def off(action: TerminalServiceActionType, fn: Any): Unit = js.native
    
    def on(action: TerminalServiceActionType, fn: Any): Unit = js.native
  }
}
