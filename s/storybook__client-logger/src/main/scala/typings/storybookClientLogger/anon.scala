package typings.storybookClientLogger

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Debug extends StObject {
    
    def debug(message: js.Any, rest: js.Any*): Unit
    
    def error(message: js.Any, rest: js.Any*): Unit
    
    def info(message: js.Any, rest: js.Any*): Unit
    
    def log(message: js.Any, rest: js.Any*): Unit
    
    def trace(message: js.Any, rest: js.Any*): Unit
    
    def warn(message: js.Any, rest: js.Any*): Unit
  }
  object Debug {
    
    @scala.inline
    def apply(
      debug: (js.Any, /* repeated */ js.Any) => Unit,
      error: (js.Any, /* repeated */ js.Any) => Unit,
      info: (js.Any, /* repeated */ js.Any) => Unit,
      log: (js.Any, /* repeated */ js.Any) => Unit,
      trace: (js.Any, /* repeated */ js.Any) => Unit,
      warn: (js.Any, /* repeated */ js.Any) => Unit
    ): Debug = {
      val __obj = js.Dynamic.literal(debug = js.Any.fromFunction2(debug), error = js.Any.fromFunction2(error), info = js.Any.fromFunction2(info), log = js.Any.fromFunction2(log), trace = js.Any.fromFunction2(trace), warn = js.Any.fromFunction2(warn))
      __obj.asInstanceOf[Debug]
    }
    
    @scala.inline
    implicit class DebugMutableBuilder[Self <: Debug] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDebug(value: (js.Any, /* repeated */ js.Any) => Unit): Self = StObject.set(x, "debug", js.Any.fromFunction2(value))
      
      @scala.inline
      def setError(value: (js.Any, /* repeated */ js.Any) => Unit): Self = StObject.set(x, "error", js.Any.fromFunction2(value))
      
      @scala.inline
      def setInfo(value: (js.Any, /* repeated */ js.Any) => Unit): Self = StObject.set(x, "info", js.Any.fromFunction2(value))
      
      @scala.inline
      def setLog(value: (js.Any, /* repeated */ js.Any) => Unit): Self = StObject.set(x, "log", js.Any.fromFunction2(value))
      
      @scala.inline
      def setTrace(value: (js.Any, /* repeated */ js.Any) => Unit): Self = StObject.set(x, "trace", js.Any.fromFunction2(value))
      
      @scala.inline
      def setWarn(value: (js.Any, /* repeated */ js.Any) => Unit): Self = StObject.set(x, "warn", js.Any.fromFunction2(value))
    }
  }
}
