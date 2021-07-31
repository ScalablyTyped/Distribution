package typings.reactJoyride.mod

import typings.reactJoyride.reactJoyrideStrings.close
import typings.reactJoyride.reactJoyrideStrings.go
import typings.reactJoyride.reactJoyrideStrings.index
import typings.reactJoyride.reactJoyrideStrings.init
import typings.reactJoyride.reactJoyrideStrings.next
import typings.reactJoyride.reactJoyrideStrings.prev
import typings.reactJoyride.reactJoyrideStrings.reset
import typings.reactJoyride.reactJoyrideStrings.restart
import typings.reactJoyride.reactJoyrideStrings.skip
import typings.reactJoyride.reactJoyrideStrings.start
import typings.reactJoyride.reactJoyrideStrings.stop
import typings.reactJoyride.reactJoyrideStrings.update
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait actions extends StObject {
  
  var CLOSE: close
  
  var GO: go
  
  var INDEX: index
  
  var INIT: init
  
  var NEXT: next
  
  var PREV: prev
  
  var RESET: reset
  
  var RESTART: restart
  
  var SKIP: skip
  
  var START: start
  
  var STOP: stop
  
  var UPDATE: update
}
object actions {
  
  @scala.inline
  def apply(): actions = {
    val __obj = js.Dynamic.literal(CLOSE = "close", GO = "go", INDEX = "index", INIT = "init", NEXT = "next", PREV = "prev", RESET = "reset", RESTART = "restart", SKIP = "skip", START = "start", STOP = "stop", UPDATE = "update")
    __obj.asInstanceOf[actions]
  }
  
  @scala.inline
  implicit class actionsMutableBuilder[Self <: actions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCLOSE(value: close): Self = StObject.set(x, "CLOSE", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGO(value: go): Self = StObject.set(x, "GO", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setINDEX(value: index): Self = StObject.set(x, "INDEX", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setINIT(value: init): Self = StObject.set(x, "INIT", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNEXT(value: next): Self = StObject.set(x, "NEXT", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPREV(value: prev): Self = StObject.set(x, "PREV", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRESET(value: reset): Self = StObject.set(x, "RESET", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRESTART(value: restart): Self = StObject.set(x, "RESTART", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSKIP(value: skip): Self = StObject.set(x, "SKIP", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSTART(value: start): Self = StObject.set(x, "START", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSTOP(value: stop): Self = StObject.set(x, "STOP", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUPDATE(value: update): Self = StObject.set(x, "UPDATE", value.asInstanceOf[js.Any])
  }
}
