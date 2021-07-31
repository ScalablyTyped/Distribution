package typings.sentryBrowser

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object tracekitMod {
  
  @JSImport("@sentry/browser/dist/tracekit", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def computeStackTrace(ex: js.Any): StackTrace = ^.asInstanceOf[js.Dynamic].applyDynamic("computeStackTrace")(ex.asInstanceOf[js.Any]).asInstanceOf[StackTrace]
  
  trait StackFrame extends StObject {
    
    var args: js.Array[String]
    
    var column: Double | Null
    
    var func: String
    
    var line: Double | Null
    
    var url: String
  }
  object StackFrame {
    
    @scala.inline
    def apply(args: js.Array[String], func: String, url: String): StackFrame = {
      val __obj = js.Dynamic.literal(args = args.asInstanceOf[js.Any], func = func.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any], column = null, line = null)
      __obj.asInstanceOf[StackFrame]
    }
    
    @scala.inline
    implicit class StackFrameMutableBuilder[Self <: StackFrame] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setArgs(value: js.Array[String]): Self = StObject.set(x, "args", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setArgsVarargs(value: String*): Self = StObject.set(x, "args", js.Array(value :_*))
      
      @scala.inline
      def setColumn(value: Double): Self = StObject.set(x, "column", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColumnNull: Self = StObject.set(x, "column", null)
      
      @scala.inline
      def setFunc(value: String): Self = StObject.set(x, "func", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLine(value: Double): Self = StObject.set(x, "line", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLineNull: Self = StObject.set(x, "line", null)
      
      @scala.inline
      def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    }
  }
  
  trait StackTrace extends StObject {
    
    var failed: js.UndefOr[Boolean] = js.undefined
    
    var mechanism: js.UndefOr[String] = js.undefined
    
    var message: String
    
    var name: String
    
    var stack: js.Array[StackFrame]
  }
  object StackTrace {
    
    @scala.inline
    def apply(message: String, name: String, stack: js.Array[StackFrame]): StackTrace = {
      val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], stack = stack.asInstanceOf[js.Any])
      __obj.asInstanceOf[StackTrace]
    }
    
    @scala.inline
    implicit class StackTraceMutableBuilder[Self <: StackTrace] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFailed(value: Boolean): Self = StObject.set(x, "failed", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFailedUndefined: Self = StObject.set(x, "failed", js.undefined)
      
      @scala.inline
      def setMechanism(value: String): Self = StObject.set(x, "mechanism", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMechanismUndefined: Self = StObject.set(x, "mechanism", js.undefined)
      
      @scala.inline
      def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStack(value: js.Array[StackFrame]): Self = StObject.set(x, "stack", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStackVarargs(value: StackFrame*): Self = StObject.set(x, "stack", js.Array(value :_*))
    }
  }
}
