package typings.reactNative

import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object parseErrorStackMod {
  
  @JSImport("react-native/Libraries/Core/Devtools/parseErrorStack", JSImport.Default)
  @js.native
  def default(error: ExtendedError): js.Array[StackFrame] = js.native
  
  @js.native
  trait ExtendedError extends Error {
    
    var framesToPop: js.UndefOr[Double] = js.native
  }
  object ExtendedError {
    
    @scala.inline
    def apply(message: String, name: String): ExtendedError = {
      val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[ExtendedError]
    }
    
    @scala.inline
    implicit class ExtendedErrorMutableBuilder[Self <: ExtendedError] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFramesToPop(value: Double): Self = StObject.set(x, "framesToPop", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFramesToPopUndefined: Self = StObject.set(x, "framesToPop", js.undefined)
    }
  }
  
  @js.native
  trait StackFrame extends StObject {
    
    var column: Double | Null = js.native
    
    var file: String = js.native
    
    var lineNumber: Double = js.native
    
    var methodName: String = js.native
  }
  object StackFrame {
    
    @scala.inline
    def apply(file: String, lineNumber: Double, methodName: String): StackFrame = {
      val __obj = js.Dynamic.literal(file = file.asInstanceOf[js.Any], lineNumber = lineNumber.asInstanceOf[js.Any], methodName = methodName.asInstanceOf[js.Any])
      __obj.asInstanceOf[StackFrame]
    }
    
    @scala.inline
    implicit class StackFrameMutableBuilder[Self <: StackFrame] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setColumn(value: Double): Self = StObject.set(x, "column", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColumnNull: Self = StObject.set(x, "column", null)
      
      @scala.inline
      def setFile(value: String): Self = StObject.set(x, "file", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLineNumber(value: Double): Self = StObject.set(x, "lineNumber", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMethodName(value: String): Self = StObject.set(x, "methodName", value.asInstanceOf[js.Any])
    }
  }
}
