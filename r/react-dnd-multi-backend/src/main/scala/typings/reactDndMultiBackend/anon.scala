package typings.reactDndMultiBackend

import typings.reactDndMultiBackend.mod.Backends
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Context extends StObject {
    
    var context: js.UndefOr[js.Any] = js.undefined
    
    var debugMode: js.UndefOr[Boolean] = js.undefined
    
    var options: Backends
  }
  object Context {
    
    @scala.inline
    def apply(options: Backends): Context = {
      val __obj = js.Dynamic.literal(options = options.asInstanceOf[js.Any])
      __obj.asInstanceOf[Context]
    }
    
    @scala.inline
    implicit class ContextMutableBuilder[Self <: Context] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setContext(value: js.Any): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContextUndefined: Self = StObject.set(x, "context", js.undefined)
      
      @scala.inline
      def setDebugMode(value: Boolean): Self = StObject.set(x, "debugMode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDebugModeUndefined: Self = StObject.set(x, "debugMode", js.undefined)
      
      @scala.inline
      def setOptions(value: Backends): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    }
  }
}
