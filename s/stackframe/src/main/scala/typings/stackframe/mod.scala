package typings.stackframe

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("stackframe/stackframe", JSImport.Namespace)
  @js.native
  class ^ protected () extends StackFrame {
    def this(obj: StackFrameOptions) = this()
  }
  
  @js.native
  trait StackFrame extends StObject {
    
    var args: js.UndefOr[js.Array[_]] = js.native
    
    var columnNumber: js.UndefOr[Double] = js.native
    
    var evalOrigin: js.UndefOr[StackFrame] = js.native
    
    var fileName: js.UndefOr[String] = js.native
    
    var functionName: js.UndefOr[String] = js.native
    
    def getArgs(): js.UndefOr[js.Array[_]] = js.native
    
    def getColumnNumber(): js.UndefOr[Double] = js.native
    
    def getEvalOrigin(): js.UndefOr[StackFrame] = js.native
    
    def getFileName(): js.UndefOr[String] = js.native
    
    def getFunctionName(): js.UndefOr[String] = js.native
    
    def getIsConstructor(): js.UndefOr[Boolean] = js.native
    
    def getIsEval(): js.UndefOr[Boolean] = js.native
    
    def getIsNative(): js.UndefOr[Boolean] = js.native
    
    def getIsToplevel(): js.UndefOr[Boolean] = js.native
    
    def getLineNumber(): js.UndefOr[Double] = js.native
    
    def getSource(): js.UndefOr[String] = js.native
    
    var isConstructor: js.UndefOr[Boolean] = js.native
    
    var isEval: js.UndefOr[Boolean] = js.native
    
    var isNative: js.UndefOr[Boolean] = js.native
    
    var isToplevel: js.UndefOr[Boolean] = js.native
    
    var lineNumber: js.UndefOr[Double] = js.native
    
    def setArgs(args: js.Array[_]): Unit = js.native
    
    def setColumnNumber(columnNumber: Double): Unit = js.native
    
    def setEvalOrigin(stackframe: StackFrame): Unit = js.native
    
    def setFileName(fileName: String): Unit = js.native
    
    def setFunctionName(functionName: String): Unit = js.native
    
    def setIsConstructor(isConstructor: Boolean): Unit = js.native
    
    def setIsEval(isEval: Boolean): Unit = js.native
    
    def setIsNative(isNative: Boolean): Unit = js.native
    
    def setIsToplevel(isToplevel: Boolean): Unit = js.native
    
    def setLineNumber(lineNumber: Double): Unit = js.native
    
    def setSource(source: String): Unit = js.native
    
    var source: js.UndefOr[String] = js.native
  }
  object StackFrame {
    
    @scala.inline
    def apply(
      getArgs: () => js.UndefOr[js.Array[_]],
      getColumnNumber: () => js.UndefOr[Double],
      getEvalOrigin: () => js.UndefOr[StackFrame],
      getFileName: () => js.UndefOr[String],
      getFunctionName: () => js.UndefOr[String],
      getIsConstructor: () => js.UndefOr[Boolean],
      getIsEval: () => js.UndefOr[Boolean],
      getIsNative: () => js.UndefOr[Boolean],
      getIsToplevel: () => js.UndefOr[Boolean],
      getLineNumber: () => js.UndefOr[Double],
      getSource: () => js.UndefOr[String],
      setArgs: js.Array[_] => Unit,
      setColumnNumber: Double => Unit,
      setEvalOrigin: StackFrame => Unit,
      setFileName: String => Unit,
      setFunctionName: String => Unit,
      setIsConstructor: Boolean => Unit,
      setIsEval: Boolean => Unit,
      setIsNative: Boolean => Unit,
      setIsToplevel: Boolean => Unit,
      setLineNumber: Double => Unit,
      setSource: String => Unit
    ): StackFrame = {
      val __obj = js.Dynamic.literal(getArgs = js.Any.fromFunction0(getArgs), getColumnNumber = js.Any.fromFunction0(getColumnNumber), getEvalOrigin = js.Any.fromFunction0(getEvalOrigin), getFileName = js.Any.fromFunction0(getFileName), getFunctionName = js.Any.fromFunction0(getFunctionName), getIsConstructor = js.Any.fromFunction0(getIsConstructor), getIsEval = js.Any.fromFunction0(getIsEval), getIsNative = js.Any.fromFunction0(getIsNative), getIsToplevel = js.Any.fromFunction0(getIsToplevel), getLineNumber = js.Any.fromFunction0(getLineNumber), getSource = js.Any.fromFunction0(getSource), setArgs = js.Any.fromFunction1(setArgs), setColumnNumber = js.Any.fromFunction1(setColumnNumber), setEvalOrigin = js.Any.fromFunction1(setEvalOrigin), setFileName = js.Any.fromFunction1(setFileName), setFunctionName = js.Any.fromFunction1(setFunctionName), setIsConstructor = js.Any.fromFunction1(setIsConstructor), setIsEval = js.Any.fromFunction1(setIsEval), setIsNative = js.Any.fromFunction1(setIsNative), setIsToplevel = js.Any.fromFunction1(setIsToplevel), setLineNumber = js.Any.fromFunction1(setLineNumber), setSource = js.Any.fromFunction1(setSource))
      __obj.asInstanceOf[StackFrame]
    }
    
    @scala.inline
    implicit class StackFrameMutableBuilder[Self <: StackFrame] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setArgs(value: js.Array[_]): Self = StObject.set(x, "args", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setArgsUndefined: Self = StObject.set(x, "args", js.undefined)
      
      @scala.inline
      def setArgsVarargs(value: js.Any*): Self = StObject.set(x, "args", js.Array(value :_*))
      
      @scala.inline
      def setColumnNumber(value: Double): Self = StObject.set(x, "columnNumber", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColumnNumberUndefined: Self = StObject.set(x, "columnNumber", js.undefined)
      
      @scala.inline
      def setEvalOrigin(value: StackFrame): Self = StObject.set(x, "evalOrigin", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEvalOriginUndefined: Self = StObject.set(x, "evalOrigin", js.undefined)
      
      @scala.inline
      def setFileName(value: String): Self = StObject.set(x, "fileName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFileNameUndefined: Self = StObject.set(x, "fileName", js.undefined)
      
      @scala.inline
      def setFunctionName(value: String): Self = StObject.set(x, "functionName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFunctionNameUndefined: Self = StObject.set(x, "functionName", js.undefined)
      
      @scala.inline
      def setGetArgs(value: () => js.UndefOr[js.Array[_]]): Self = StObject.set(x, "getArgs", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetColumnNumber(value: () => js.UndefOr[Double]): Self = StObject.set(x, "getColumnNumber", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetEvalOrigin(value: () => js.UndefOr[StackFrame]): Self = StObject.set(x, "getEvalOrigin", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetFileName(value: () => js.UndefOr[String]): Self = StObject.set(x, "getFileName", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetFunctionName(value: () => js.UndefOr[String]): Self = StObject.set(x, "getFunctionName", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetIsConstructor(value: () => js.UndefOr[Boolean]): Self = StObject.set(x, "getIsConstructor", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetIsEval(value: () => js.UndefOr[Boolean]): Self = StObject.set(x, "getIsEval", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetIsNative(value: () => js.UndefOr[Boolean]): Self = StObject.set(x, "getIsNative", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetIsToplevel(value: () => js.UndefOr[Boolean]): Self = StObject.set(x, "getIsToplevel", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetLineNumber(value: () => js.UndefOr[Double]): Self = StObject.set(x, "getLineNumber", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetSource(value: () => js.UndefOr[String]): Self = StObject.set(x, "getSource", js.Any.fromFunction0(value))
      
      @scala.inline
      def setIsConstructor(value: Boolean): Self = StObject.set(x, "isConstructor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsConstructorUndefined: Self = StObject.set(x, "isConstructor", js.undefined)
      
      @scala.inline
      def setIsEval(value: Boolean): Self = StObject.set(x, "isEval", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsEvalUndefined: Self = StObject.set(x, "isEval", js.undefined)
      
      @scala.inline
      def setIsNative(value: Boolean): Self = StObject.set(x, "isNative", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsNativeUndefined: Self = StObject.set(x, "isNative", js.undefined)
      
      @scala.inline
      def setIsToplevel(value: Boolean): Self = StObject.set(x, "isToplevel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsToplevelUndefined: Self = StObject.set(x, "isToplevel", js.undefined)
      
      @scala.inline
      def setLineNumber(value: Double): Self = StObject.set(x, "lineNumber", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLineNumberUndefined: Self = StObject.set(x, "lineNumber", js.undefined)
      
      @scala.inline
      def setSetArgs(value: js.Array[_] => Unit): Self = StObject.set(x, "setArgs", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSetColumnNumber(value: Double => Unit): Self = StObject.set(x, "setColumnNumber", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSetEvalOrigin(value: StackFrame => Unit): Self = StObject.set(x, "setEvalOrigin", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSetFileName(value: String => Unit): Self = StObject.set(x, "setFileName", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSetFunctionName(value: String => Unit): Self = StObject.set(x, "setFunctionName", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSetIsConstructor(value: Boolean => Unit): Self = StObject.set(x, "setIsConstructor", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSetIsEval(value: Boolean => Unit): Self = StObject.set(x, "setIsEval", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSetIsNative(value: Boolean => Unit): Self = StObject.set(x, "setIsNative", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSetIsToplevel(value: Boolean => Unit): Self = StObject.set(x, "setIsToplevel", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSetLineNumber(value: Double => Unit): Self = StObject.set(x, "setLineNumber", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSetSource(value: String => Unit): Self = StObject.set(x, "setSource", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSource(value: String): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSourceUndefined: Self = StObject.set(x, "source", js.undefined)
    }
  }
  
  @js.native
  trait StackFrameOptions extends StObject {
    
    var args: js.UndefOr[js.Array[_]] = js.native
    
    var columnNumber: js.UndefOr[Double] = js.native
    
    var evalOrigin: js.UndefOr[StackFrame] = js.native
    
    var fileName: js.UndefOr[String] = js.native
    
    var functionName: js.UndefOr[String] = js.native
    
    var isConstructor: js.UndefOr[Boolean] = js.native
    
    var isEval: js.UndefOr[Boolean] = js.native
    
    var isNative: js.UndefOr[Boolean] = js.native
    
    var isToplevel: js.UndefOr[Boolean] = js.native
    
    var lineNumber: js.UndefOr[Double] = js.native
    
    var source: js.UndefOr[String] = js.native
  }
  object StackFrameOptions {
    
    @scala.inline
    def apply(): StackFrameOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[StackFrameOptions]
    }
    
    @scala.inline
    implicit class StackFrameOptionsMutableBuilder[Self <: StackFrameOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setArgs(value: js.Array[_]): Self = StObject.set(x, "args", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setArgsUndefined: Self = StObject.set(x, "args", js.undefined)
      
      @scala.inline
      def setArgsVarargs(value: js.Any*): Self = StObject.set(x, "args", js.Array(value :_*))
      
      @scala.inline
      def setColumnNumber(value: Double): Self = StObject.set(x, "columnNumber", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColumnNumberUndefined: Self = StObject.set(x, "columnNumber", js.undefined)
      
      @scala.inline
      def setEvalOrigin(value: StackFrame): Self = StObject.set(x, "evalOrigin", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEvalOriginUndefined: Self = StObject.set(x, "evalOrigin", js.undefined)
      
      @scala.inline
      def setFileName(value: String): Self = StObject.set(x, "fileName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFileNameUndefined: Self = StObject.set(x, "fileName", js.undefined)
      
      @scala.inline
      def setFunctionName(value: String): Self = StObject.set(x, "functionName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFunctionNameUndefined: Self = StObject.set(x, "functionName", js.undefined)
      
      @scala.inline
      def setIsConstructor(value: Boolean): Self = StObject.set(x, "isConstructor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsConstructorUndefined: Self = StObject.set(x, "isConstructor", js.undefined)
      
      @scala.inline
      def setIsEval(value: Boolean): Self = StObject.set(x, "isEval", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsEvalUndefined: Self = StObject.set(x, "isEval", js.undefined)
      
      @scala.inline
      def setIsNative(value: Boolean): Self = StObject.set(x, "isNative", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsNativeUndefined: Self = StObject.set(x, "isNative", js.undefined)
      
      @scala.inline
      def setIsToplevel(value: Boolean): Self = StObject.set(x, "isToplevel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsToplevelUndefined: Self = StObject.set(x, "isToplevel", js.undefined)
      
      @scala.inline
      def setLineNumber(value: Double): Self = StObject.set(x, "lineNumber", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLineNumberUndefined: Self = StObject.set(x, "lineNumber", js.undefined)
      
      @scala.inline
      def setSource(value: String): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSourceUndefined: Self = StObject.set(x, "source", js.undefined)
    }
  }
}
