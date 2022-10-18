package typings.reactNativeWindows

import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object reactNativeLibrariesCoreDevtoolsParseErrorStackMod {
  
  @JSImport("react-native/Libraries/Core/Devtools/parseErrorStack", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(error: ExtendedError): js.Array[StackFrame] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(error.asInstanceOf[js.Any]).asInstanceOf[js.Array[StackFrame]]
  
  trait ExtendedError
    extends StObject
       with Error {
    
    var framesToPop: js.UndefOr[Double] = js.undefined
  }
  object ExtendedError {
    
    inline def apply(message: String, name: String): ExtendedError = {
      val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[ExtendedError]
    }
    
    extension [Self <: ExtendedError](x: Self) {
      
      inline def setFramesToPop(value: Double): Self = StObject.set(x, "framesToPop", value.asInstanceOf[js.Any])
      
      inline def setFramesToPopUndefined: Self = StObject.set(x, "framesToPop", js.undefined)
    }
  }
  
  trait StackFrame extends StObject {
    
    var column: Double | Null
    
    var file: String
    
    var lineNumber: Double
    
    var methodName: String
  }
  object StackFrame {
    
    inline def apply(file: String, lineNumber: Double, methodName: String): StackFrame = {
      val __obj = js.Dynamic.literal(file = file.asInstanceOf[js.Any], lineNumber = lineNumber.asInstanceOf[js.Any], methodName = methodName.asInstanceOf[js.Any], column = null)
      __obj.asInstanceOf[StackFrame]
    }
    
    extension [Self <: StackFrame](x: Self) {
      
      inline def setColumn(value: Double): Self = StObject.set(x, "column", value.asInstanceOf[js.Any])
      
      inline def setColumnNull: Self = StObject.set(x, "column", null)
      
      inline def setFile(value: String): Self = StObject.set(x, "file", value.asInstanceOf[js.Any])
      
      inline def setLineNumber(value: Double): Self = StObject.set(x, "lineNumber", value.asInstanceOf[js.Any])
      
      inline def setMethodName(value: String): Self = StObject.set(x, "methodName", value.asInstanceOf[js.Any])
    }
  }
}
