package typings.sentryTypes

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object stackframeMod {
  
  @js.native
  trait StackFrame extends StObject {
    
    var abs_path: js.UndefOr[String] = js.native
    
    var colno: js.UndefOr[Double] = js.native
    
    var context_line: js.UndefOr[String] = js.native
    
    var filename: js.UndefOr[String] = js.native
    
    var function: js.UndefOr[String] = js.native
    
    var in_app: js.UndefOr[Boolean] = js.native
    
    var lineno: js.UndefOr[Double] = js.native
    
    var module: js.UndefOr[String] = js.native
    
    var platform: js.UndefOr[String] = js.native
    
    var post_context: js.UndefOr[js.Array[String]] = js.native
    
    var pre_context: js.UndefOr[js.Array[String]] = js.native
    
    var vars: js.UndefOr[StringDictionary[js.Any]] = js.native
  }
  object StackFrame {
    
    @scala.inline
    def apply(): StackFrame = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[StackFrame]
    }
    
    @scala.inline
    implicit class StackFrameMutableBuilder[Self <: StackFrame] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAbs_path(value: String): Self = StObject.set(x, "abs_path", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAbs_pathUndefined: Self = StObject.set(x, "abs_path", js.undefined)
      
      @scala.inline
      def setColno(value: Double): Self = StObject.set(x, "colno", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColnoUndefined: Self = StObject.set(x, "colno", js.undefined)
      
      @scala.inline
      def setContext_line(value: String): Self = StObject.set(x, "context_line", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContext_lineUndefined: Self = StObject.set(x, "context_line", js.undefined)
      
      @scala.inline
      def setFilename(value: String): Self = StObject.set(x, "filename", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFilenameUndefined: Self = StObject.set(x, "filename", js.undefined)
      
      @scala.inline
      def setFunction(value: String): Self = StObject.set(x, "function", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFunctionUndefined: Self = StObject.set(x, "function", js.undefined)
      
      @scala.inline
      def setIn_app(value: Boolean): Self = StObject.set(x, "in_app", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIn_appUndefined: Self = StObject.set(x, "in_app", js.undefined)
      
      @scala.inline
      def setLineno(value: Double): Self = StObject.set(x, "lineno", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLinenoUndefined: Self = StObject.set(x, "lineno", js.undefined)
      
      @scala.inline
      def setModule(value: String): Self = StObject.set(x, "module", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setModuleUndefined: Self = StObject.set(x, "module", js.undefined)
      
      @scala.inline
      def setPlatform(value: String): Self = StObject.set(x, "platform", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPlatformUndefined: Self = StObject.set(x, "platform", js.undefined)
      
      @scala.inline
      def setPost_context(value: js.Array[String]): Self = StObject.set(x, "post_context", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPost_contextUndefined: Self = StObject.set(x, "post_context", js.undefined)
      
      @scala.inline
      def setPost_contextVarargs(value: String*): Self = StObject.set(x, "post_context", js.Array(value :_*))
      
      @scala.inline
      def setPre_context(value: js.Array[String]): Self = StObject.set(x, "pre_context", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPre_contextUndefined: Self = StObject.set(x, "pre_context", js.undefined)
      
      @scala.inline
      def setPre_contextVarargs(value: String*): Self = StObject.set(x, "pre_context", js.Array(value :_*))
      
      @scala.inline
      def setVars(value: StringDictionary[js.Any]): Self = StObject.set(x, "vars", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVarsUndefined: Self = StObject.set(x, "vars", js.undefined)
    }
  }
}
