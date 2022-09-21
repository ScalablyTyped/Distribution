package typings.storybookClientLogger

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Debug extends StObject {
    
    def debug(message: Any, rest: Any*): Unit
    
    def error(message: Any, rest: Any*): Unit
    
    def info(message: Any, rest: Any*): Unit
    
    def log(message: Any, rest: Any*): Unit
    
    def trace(message: Any, rest: Any*): Unit
    
    def warn(message: Any, rest: Any*): Unit
  }
  object Debug {
    
    inline def apply(
      debug: (Any, /* repeated */ Any) => Unit,
      error: (Any, /* repeated */ Any) => Unit,
      info: (Any, /* repeated */ Any) => Unit,
      log: (Any, /* repeated */ Any) => Unit,
      trace: (Any, /* repeated */ Any) => Unit,
      warn: (Any, /* repeated */ Any) => Unit
    ): Debug = {
      val __obj = js.Dynamic.literal(debug = js.Any.fromFunction2(debug), error = js.Any.fromFunction2(error), info = js.Any.fromFunction2(info), log = js.Any.fromFunction2(log), trace = js.Any.fromFunction2(trace), warn = js.Any.fromFunction2(warn))
      __obj.asInstanceOf[Debug]
    }
    
    extension [Self <: Debug](x: Self) {
      
      inline def setDebug(value: (Any, /* repeated */ Any) => Unit): Self = StObject.set(x, "debug", js.Any.fromFunction2(value))
      
      inline def setError(value: (Any, /* repeated */ Any) => Unit): Self = StObject.set(x, "error", js.Any.fromFunction2(value))
      
      inline def setInfo(value: (Any, /* repeated */ Any) => Unit): Self = StObject.set(x, "info", js.Any.fromFunction2(value))
      
      inline def setLog(value: (Any, /* repeated */ Any) => Unit): Self = StObject.set(x, "log", js.Any.fromFunction2(value))
      
      inline def setTrace(value: (Any, /* repeated */ Any) => Unit): Self = StObject.set(x, "trace", js.Any.fromFunction2(value))
      
      inline def setWarn(value: (Any, /* repeated */ Any) => Unit): Self = StObject.set(x, "warn", js.Any.fromFunction2(value))
    }
  }
}
