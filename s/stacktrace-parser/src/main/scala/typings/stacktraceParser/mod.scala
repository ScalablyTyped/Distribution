package typings.stacktraceParser

import typings.stacktraceParser.stacktraceParserStrings.LessthansignunknownGreaterthansign
import typings.typeFest.literalUnionMod.LiteralUnion
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("stacktrace-parser", "parse")
  @js.native
  def parse(stackString: String): js.Array[StackFrame] = js.native
  
  @js.native
  trait StackFrame extends StObject {
    
    var arguments: js.Array[String] = js.native
    
    var column: Double | Null = js.native
    
    var file: String | Null = js.native
    
    var lineNumber: Double | Null = js.native
    
    var methodName: LiteralUnion[LessthansignunknownGreaterthansign, String] = js.native
  }
  object StackFrame {
    
    @scala.inline
    def apply(arguments: js.Array[String], methodName: LiteralUnion[LessthansignunknownGreaterthansign, String]): StackFrame = {
      val __obj = js.Dynamic.literal(arguments = arguments.asInstanceOf[js.Any], methodName = methodName.asInstanceOf[js.Any])
      __obj.asInstanceOf[StackFrame]
    }
    
    @scala.inline
    implicit class StackFrameMutableBuilder[Self <: StackFrame] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setArguments(value: js.Array[String]): Self = StObject.set(x, "arguments", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setArgumentsVarargs(value: String*): Self = StObject.set(x, "arguments", js.Array(value :_*))
      
      @scala.inline
      def setColumn(value: Double): Self = StObject.set(x, "column", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColumnNull: Self = StObject.set(x, "column", null)
      
      @scala.inline
      def setFile(value: String): Self = StObject.set(x, "file", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFileNull: Self = StObject.set(x, "file", null)
      
      @scala.inline
      def setLineNumber(value: Double): Self = StObject.set(x, "lineNumber", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLineNumberNull: Self = StObject.set(x, "lineNumber", null)
      
      @scala.inline
      def setMethodName(value: LiteralUnion[LessthansignunknownGreaterthansign, String]): Self = StObject.set(x, "methodName", value.asInstanceOf[js.Any])
    }
  }
}
