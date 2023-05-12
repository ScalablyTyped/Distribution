package typings.primereact

import typings.primereact.primereactStrings.clear
import typings.primereact.primereactStrings.command
import typings.primereact.primereactStrings.response
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object terminalserviceTerminalserviceMod {
  
  @JSImport("primereact/terminalservice/terminalservice", "TerminalService")
  @js.native
  val TerminalService: TerminalServiceOptions = js.native
  
  @js.native
  trait TerminalServiceOptions extends StObject {
    
    /**
      * Method to emit an event for a specific action.
      * @param {'command' | 'response' | 'clear'} action - Custom listener.
      * @param {*} params - Custom listener.
      */
    def emit(action: command | response | clear): Unit = js.native
    def emit(action: command | response | clear, params: Any): Unit = js.native
    
    /**
      * Method to detach an event listener from a specific action.
      * @param {'command' | 'response' | 'clear'} action - Custom listener.
      * @param {*} fn - Custom listener.
      */
    def off(action: command | response | clear, fn: Any): Unit = js.native
    
    /**
      * Method to attach an event listener to a specific action.
      * @param {'command' | 'response' | 'clear'} action - Custom listener.
      * @param {*} fn - Custom listener.
      */
    def on(action: command | response | clear, fn: Any): Unit = js.native
  }
}
