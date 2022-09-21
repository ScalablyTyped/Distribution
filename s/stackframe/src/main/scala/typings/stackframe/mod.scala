package typings.stackframe

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("stackframe", JSImport.Namespace)
  @js.native
  open class ^ protected ()
    extends StObject
       with StackFrame {
    def this(obj: StackFrameOptions) = this()
    
    /* CompleteClass */
    override def getArgs(): js.UndefOr[js.Array[Any]] = js.native
    
    /* CompleteClass */
    override def getColumnNumber(): js.UndefOr[Double] = js.native
    
    /* CompleteClass */
    override def getEvalOrigin(): js.UndefOr[StackFrame] = js.native
    
    /* CompleteClass */
    override def getFileName(): js.UndefOr[String] = js.native
    
    /* CompleteClass */
    override def getFunctionName(): js.UndefOr[String] = js.native
    
    /* CompleteClass */
    override def getIsConstructor(): js.UndefOr[Boolean] = js.native
    
    /* CompleteClass */
    override def getIsEval(): js.UndefOr[Boolean] = js.native
    
    /* CompleteClass */
    override def getIsNative(): js.UndefOr[Boolean] = js.native
    
    /* CompleteClass */
    override def getIsToplevel(): js.UndefOr[Boolean] = js.native
    
    /* CompleteClass */
    override def getLineNumber(): js.UndefOr[Double] = js.native
    
    /* CompleteClass */
    override def getSource(): js.UndefOr[String] = js.native
    
    /* CompleteClass */
    override def setArgs(args: js.Array[Any]): Unit = js.native
    
    /* CompleteClass */
    override def setColumnNumber(columnNumber: Double): Unit = js.native
    
    /* CompleteClass */
    override def setEvalOrigin(stackframe: StackFrame): Unit = js.native
    
    /* CompleteClass */
    override def setFileName(fileName: String): Unit = js.native
    
    /* CompleteClass */
    override def setFunctionName(functionName: String): Unit = js.native
    
    /* CompleteClass */
    override def setIsConstructor(isConstructor: Boolean): Unit = js.native
    
    /* CompleteClass */
    override def setIsEval(isEval: Boolean): Unit = js.native
    
    /* CompleteClass */
    override def setIsNative(isNative: Boolean): Unit = js.native
    
    /* CompleteClass */
    override def setIsToplevel(isToplevel: Boolean): Unit = js.native
    
    /* CompleteClass */
    override def setLineNumber(lineNumber: Double): Unit = js.native
    
    /* CompleteClass */
    override def setSource(source: String): Unit = js.native
  }
  
  trait StackFrame extends StObject {
    
    var args: js.UndefOr[js.Array[Any]] = js.undefined
    
    var columnNumber: js.UndefOr[Double] = js.undefined
    
    var evalOrigin: js.UndefOr[StackFrame] = js.undefined
    
    var fileName: js.UndefOr[String] = js.undefined
    
    var functionName: js.UndefOr[String] = js.undefined
    
    def getArgs(): js.UndefOr[js.Array[Any]]
    
    def getColumnNumber(): js.UndefOr[Double]
    
    def getEvalOrigin(): js.UndefOr[StackFrame]
    
    def getFileName(): js.UndefOr[String]
    
    def getFunctionName(): js.UndefOr[String]
    
    def getIsConstructor(): js.UndefOr[Boolean]
    
    def getIsEval(): js.UndefOr[Boolean]
    
    def getIsNative(): js.UndefOr[Boolean]
    
    def getIsToplevel(): js.UndefOr[Boolean]
    
    def getLineNumber(): js.UndefOr[Double]
    
    def getSource(): js.UndefOr[String]
    
    var isConstructor: js.UndefOr[Boolean] = js.undefined
    
    var isEval: js.UndefOr[Boolean] = js.undefined
    
    var isNative: js.UndefOr[Boolean] = js.undefined
    
    var isToplevel: js.UndefOr[Boolean] = js.undefined
    
    var lineNumber: js.UndefOr[Double] = js.undefined
    
    def setArgs(args: js.Array[Any]): Unit
    
    def setColumnNumber(columnNumber: Double): Unit
    
    def setEvalOrigin(stackframe: StackFrame): Unit
    
    def setFileName(fileName: String): Unit
    
    def setFunctionName(functionName: String): Unit
    
    def setIsConstructor(isConstructor: Boolean): Unit
    
    def setIsEval(isEval: Boolean): Unit
    
    def setIsNative(isNative: Boolean): Unit
    
    def setIsToplevel(isToplevel: Boolean): Unit
    
    def setLineNumber(lineNumber: Double): Unit
    
    def setSource(source: String): Unit
    
    var source: js.UndefOr[String] = js.undefined
  }
  object StackFrame {
    
    inline def apply(
      getArgs: () => js.UndefOr[js.Array[Any]],
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
      setArgs: js.Array[Any] => Unit,
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
    
    extension [Self <: StackFrame](x: Self) {
      
      inline def setArgs(value: js.Array[Any]): Self = StObject.set(x, "args", value.asInstanceOf[js.Any])
      
      inline def setArgsUndefined: Self = StObject.set(x, "args", js.undefined)
      
      inline def setArgsVarargs(value: Any*): Self = StObject.set(x, "args", js.Array(value*))
      
      inline def setColumnNumber(value: Double): Self = StObject.set(x, "columnNumber", value.asInstanceOf[js.Any])
      
      inline def setColumnNumberUndefined: Self = StObject.set(x, "columnNumber", js.undefined)
      
      inline def setEvalOrigin(value: StackFrame): Self = StObject.set(x, "evalOrigin", value.asInstanceOf[js.Any])
      
      inline def setEvalOriginUndefined: Self = StObject.set(x, "evalOrigin", js.undefined)
      
      inline def setFileName(value: String): Self = StObject.set(x, "fileName", value.asInstanceOf[js.Any])
      
      inline def setFileNameUndefined: Self = StObject.set(x, "fileName", js.undefined)
      
      inline def setFunctionName(value: String): Self = StObject.set(x, "functionName", value.asInstanceOf[js.Any])
      
      inline def setFunctionNameUndefined: Self = StObject.set(x, "functionName", js.undefined)
      
      inline def setGetArgs(value: () => js.UndefOr[js.Array[Any]]): Self = StObject.set(x, "getArgs", js.Any.fromFunction0(value))
      
      inline def setGetColumnNumber(value: () => js.UndefOr[Double]): Self = StObject.set(x, "getColumnNumber", js.Any.fromFunction0(value))
      
      inline def setGetEvalOrigin(value: () => js.UndefOr[StackFrame]): Self = StObject.set(x, "getEvalOrigin", js.Any.fromFunction0(value))
      
      inline def setGetFileName(value: () => js.UndefOr[String]): Self = StObject.set(x, "getFileName", js.Any.fromFunction0(value))
      
      inline def setGetFunctionName(value: () => js.UndefOr[String]): Self = StObject.set(x, "getFunctionName", js.Any.fromFunction0(value))
      
      inline def setGetIsConstructor(value: () => js.UndefOr[Boolean]): Self = StObject.set(x, "getIsConstructor", js.Any.fromFunction0(value))
      
      inline def setGetIsEval(value: () => js.UndefOr[Boolean]): Self = StObject.set(x, "getIsEval", js.Any.fromFunction0(value))
      
      inline def setGetIsNative(value: () => js.UndefOr[Boolean]): Self = StObject.set(x, "getIsNative", js.Any.fromFunction0(value))
      
      inline def setGetIsToplevel(value: () => js.UndefOr[Boolean]): Self = StObject.set(x, "getIsToplevel", js.Any.fromFunction0(value))
      
      inline def setGetLineNumber(value: () => js.UndefOr[Double]): Self = StObject.set(x, "getLineNumber", js.Any.fromFunction0(value))
      
      inline def setGetSource(value: () => js.UndefOr[String]): Self = StObject.set(x, "getSource", js.Any.fromFunction0(value))
      
      inline def setIsConstructor(value: Boolean): Self = StObject.set(x, "isConstructor", value.asInstanceOf[js.Any])
      
      inline def setIsConstructorUndefined: Self = StObject.set(x, "isConstructor", js.undefined)
      
      inline def setIsEval(value: Boolean): Self = StObject.set(x, "isEval", value.asInstanceOf[js.Any])
      
      inline def setIsEvalUndefined: Self = StObject.set(x, "isEval", js.undefined)
      
      inline def setIsNative(value: Boolean): Self = StObject.set(x, "isNative", value.asInstanceOf[js.Any])
      
      inline def setIsNativeUndefined: Self = StObject.set(x, "isNative", js.undefined)
      
      inline def setIsToplevel(value: Boolean): Self = StObject.set(x, "isToplevel", value.asInstanceOf[js.Any])
      
      inline def setIsToplevelUndefined: Self = StObject.set(x, "isToplevel", js.undefined)
      
      inline def setLineNumber(value: Double): Self = StObject.set(x, "lineNumber", value.asInstanceOf[js.Any])
      
      inline def setLineNumberUndefined: Self = StObject.set(x, "lineNumber", js.undefined)
      
      inline def setSetArgs(value: js.Array[Any] => Unit): Self = StObject.set(x, "setArgs", js.Any.fromFunction1(value))
      
      inline def setSetColumnNumber(value: Double => Unit): Self = StObject.set(x, "setColumnNumber", js.Any.fromFunction1(value))
      
      inline def setSetEvalOrigin(value: StackFrame => Unit): Self = StObject.set(x, "setEvalOrigin", js.Any.fromFunction1(value))
      
      inline def setSetFileName(value: String => Unit): Self = StObject.set(x, "setFileName", js.Any.fromFunction1(value))
      
      inline def setSetFunctionName(value: String => Unit): Self = StObject.set(x, "setFunctionName", js.Any.fromFunction1(value))
      
      inline def setSetIsConstructor(value: Boolean => Unit): Self = StObject.set(x, "setIsConstructor", js.Any.fromFunction1(value))
      
      inline def setSetIsEval(value: Boolean => Unit): Self = StObject.set(x, "setIsEval", js.Any.fromFunction1(value))
      
      inline def setSetIsNative(value: Boolean => Unit): Self = StObject.set(x, "setIsNative", js.Any.fromFunction1(value))
      
      inline def setSetIsToplevel(value: Boolean => Unit): Self = StObject.set(x, "setIsToplevel", js.Any.fromFunction1(value))
      
      inline def setSetLineNumber(value: Double => Unit): Self = StObject.set(x, "setLineNumber", js.Any.fromFunction1(value))
      
      inline def setSetSource(value: String => Unit): Self = StObject.set(x, "setSource", js.Any.fromFunction1(value))
      
      inline def setSource(value: String): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
      
      inline def setSourceUndefined: Self = StObject.set(x, "source", js.undefined)
    }
  }
  
  trait StackFrameOptions extends StObject {
    
    var args: js.UndefOr[js.Array[Any]] = js.undefined
    
    var columnNumber: js.UndefOr[Double] = js.undefined
    
    var evalOrigin: js.UndefOr[StackFrame] = js.undefined
    
    var fileName: js.UndefOr[String] = js.undefined
    
    var functionName: js.UndefOr[String] = js.undefined
    
    var isConstructor: js.UndefOr[Boolean] = js.undefined
    
    var isEval: js.UndefOr[Boolean] = js.undefined
    
    var isNative: js.UndefOr[Boolean] = js.undefined
    
    var isToplevel: js.UndefOr[Boolean] = js.undefined
    
    var lineNumber: js.UndefOr[Double] = js.undefined
    
    var source: js.UndefOr[String] = js.undefined
  }
  object StackFrameOptions {
    
    inline def apply(): StackFrameOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[StackFrameOptions]
    }
    
    extension [Self <: StackFrameOptions](x: Self) {
      
      inline def setArgs(value: js.Array[Any]): Self = StObject.set(x, "args", value.asInstanceOf[js.Any])
      
      inline def setArgsUndefined: Self = StObject.set(x, "args", js.undefined)
      
      inline def setArgsVarargs(value: Any*): Self = StObject.set(x, "args", js.Array(value*))
      
      inline def setColumnNumber(value: Double): Self = StObject.set(x, "columnNumber", value.asInstanceOf[js.Any])
      
      inline def setColumnNumberUndefined: Self = StObject.set(x, "columnNumber", js.undefined)
      
      inline def setEvalOrigin(value: StackFrame): Self = StObject.set(x, "evalOrigin", value.asInstanceOf[js.Any])
      
      inline def setEvalOriginUndefined: Self = StObject.set(x, "evalOrigin", js.undefined)
      
      inline def setFileName(value: String): Self = StObject.set(x, "fileName", value.asInstanceOf[js.Any])
      
      inline def setFileNameUndefined: Self = StObject.set(x, "fileName", js.undefined)
      
      inline def setFunctionName(value: String): Self = StObject.set(x, "functionName", value.asInstanceOf[js.Any])
      
      inline def setFunctionNameUndefined: Self = StObject.set(x, "functionName", js.undefined)
      
      inline def setIsConstructor(value: Boolean): Self = StObject.set(x, "isConstructor", value.asInstanceOf[js.Any])
      
      inline def setIsConstructorUndefined: Self = StObject.set(x, "isConstructor", js.undefined)
      
      inline def setIsEval(value: Boolean): Self = StObject.set(x, "isEval", value.asInstanceOf[js.Any])
      
      inline def setIsEvalUndefined: Self = StObject.set(x, "isEval", js.undefined)
      
      inline def setIsNative(value: Boolean): Self = StObject.set(x, "isNative", value.asInstanceOf[js.Any])
      
      inline def setIsNativeUndefined: Self = StObject.set(x, "isNative", js.undefined)
      
      inline def setIsToplevel(value: Boolean): Self = StObject.set(x, "isToplevel", value.asInstanceOf[js.Any])
      
      inline def setIsToplevelUndefined: Self = StObject.set(x, "isToplevel", js.undefined)
      
      inline def setLineNumber(value: Double): Self = StObject.set(x, "lineNumber", value.asInstanceOf[js.Any])
      
      inline def setLineNumberUndefined: Self = StObject.set(x, "lineNumber", js.undefined)
      
      inline def setSource(value: String): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
      
      inline def setSourceUndefined: Self = StObject.set(x, "source", js.undefined)
    }
  }
}
