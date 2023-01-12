package typings.stacktraceParser

import typings.stacktraceParser.stacktraceParserStrings.LessthansignunknownGreaterthansign
import typings.typeFest.sourceLiteralUnionMod.LiteralUnion
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("stacktrace-parser", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def parse(stackString: String): js.Array[StackFrame] = ^.asInstanceOf[js.Dynamic].applyDynamic("parse")(stackString.asInstanceOf[js.Any]).asInstanceOf[js.Array[StackFrame]]
  
  trait StackFrame extends StObject {
    
    var arguments: js.Array[String]
    
    var column: Double | Null
    
    var file: String | Null
    
    var lineNumber: Double | Null
    
    var methodName: LiteralUnion[LessthansignunknownGreaterthansign, String]
  }
  object StackFrame {
    
    inline def apply(arguments: js.Array[String], methodName: LiteralUnion[LessthansignunknownGreaterthansign, String]): StackFrame = {
      val __obj = js.Dynamic.literal(arguments = arguments.asInstanceOf[js.Any], methodName = methodName.asInstanceOf[js.Any], column = null, file = null, lineNumber = null)
      __obj.asInstanceOf[StackFrame]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: StackFrame] (val x: Self) extends AnyVal {
      
      inline def setArguments(value: js.Array[String]): Self = StObject.set(x, "arguments", value.asInstanceOf[js.Any])
      
      inline def setArgumentsVarargs(value: String*): Self = StObject.set(x, "arguments", js.Array(value*))
      
      inline def setColumn(value: Double): Self = StObject.set(x, "column", value.asInstanceOf[js.Any])
      
      inline def setColumnNull: Self = StObject.set(x, "column", null)
      
      inline def setFile(value: String): Self = StObject.set(x, "file", value.asInstanceOf[js.Any])
      
      inline def setFileNull: Self = StObject.set(x, "file", null)
      
      inline def setLineNumber(value: Double): Self = StObject.set(x, "lineNumber", value.asInstanceOf[js.Any])
      
      inline def setLineNumberNull: Self = StObject.set(x, "lineNumber", null)
      
      inline def setMethodName(value: LiteralUnion[LessthansignunknownGreaterthansign, String]): Self = StObject.set(x, "methodName", value.asInstanceOf[js.Any])
    }
  }
}
