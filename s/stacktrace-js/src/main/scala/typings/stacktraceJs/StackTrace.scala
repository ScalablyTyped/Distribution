package typings.stacktraceJs

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object StackTrace {
  
  type SourceCache = StringDictionary[String | js.Promise[String]]
  
  trait StackFrame extends StObject {
    
    var args: js.UndefOr[js.Array[Any]] = js.undefined
    
    var columnNumber: js.UndefOr[Double] = js.undefined
    
    var evalOrigin: js.UndefOr[StackFrame] = js.undefined
    
    var fileName: js.UndefOr[String] = js.undefined
    
    var functionName: js.UndefOr[String] = js.undefined
    
    def getArgs(): js.Array[Any]
    
    def getColumnNumber(): Double
    
    def getEvalOrigin(): StackFrame
    
    def getFileName(): String
    
    def getFunctionName(): String
    
    def getIsConstructor(): Boolean
    
    def getIsEval(): Boolean
    
    def getIsNative(): Boolean
    
    def getIsTopLevel(): Boolean
    
    def getLineNumber(): Double
    
    def getSource(): String
    
    var isConstructor: js.UndefOr[Boolean] = js.undefined
    
    var isEval: js.UndefOr[Boolean] = js.undefined
    
    var isNative: js.UndefOr[Boolean] = js.undefined
    
    var isTopLevel: js.UndefOr[Boolean] = js.undefined
    
    var lineNumber: js.UndefOr[Double] = js.undefined
    
    def setArgs(): Unit
    
    def setColumnNumber(): Unit
    
    def setEvalOrigin(): Unit
    
    def setFileName(): Unit
    
    def setFunctionName(): Unit
    
    def setIsConstructor(): Unit
    
    def setIsEval(): Unit
    
    def setIsNative(): Unit
    
    def setIsTopLevel(): Unit
    
    def setLineNumber(): Unit
    
    def setSource(): Unit
    
    var source: js.UndefOr[String] = js.undefined
  }
  object StackFrame {
    
    inline def apply(
      getArgs: () => js.Array[Any],
      getColumnNumber: () => Double,
      getEvalOrigin: () => StackFrame,
      getFileName: () => String,
      getFunctionName: () => String,
      getIsConstructor: () => Boolean,
      getIsEval: () => Boolean,
      getIsNative: () => Boolean,
      getIsTopLevel: () => Boolean,
      getLineNumber: () => Double,
      getSource: () => String,
      setArgs: () => Unit,
      setColumnNumber: () => Unit,
      setEvalOrigin: () => Unit,
      setFileName: () => Unit,
      setFunctionName: () => Unit,
      setIsConstructor: () => Unit,
      setIsEval: () => Unit,
      setIsNative: () => Unit,
      setIsTopLevel: () => Unit,
      setLineNumber: () => Unit,
      setSource: () => Unit
    ): StackFrame = {
      val __obj = js.Dynamic.literal(getArgs = js.Any.fromFunction0(getArgs), getColumnNumber = js.Any.fromFunction0(getColumnNumber), getEvalOrigin = js.Any.fromFunction0(getEvalOrigin), getFileName = js.Any.fromFunction0(getFileName), getFunctionName = js.Any.fromFunction0(getFunctionName), getIsConstructor = js.Any.fromFunction0(getIsConstructor), getIsEval = js.Any.fromFunction0(getIsEval), getIsNative = js.Any.fromFunction0(getIsNative), getIsTopLevel = js.Any.fromFunction0(getIsTopLevel), getLineNumber = js.Any.fromFunction0(getLineNumber), getSource = js.Any.fromFunction0(getSource), setArgs = js.Any.fromFunction0(setArgs), setColumnNumber = js.Any.fromFunction0(setColumnNumber), setEvalOrigin = js.Any.fromFunction0(setEvalOrigin), setFileName = js.Any.fromFunction0(setFileName), setFunctionName = js.Any.fromFunction0(setFunctionName), setIsConstructor = js.Any.fromFunction0(setIsConstructor), setIsEval = js.Any.fromFunction0(setIsEval), setIsNative = js.Any.fromFunction0(setIsNative), setIsTopLevel = js.Any.fromFunction0(setIsTopLevel), setLineNumber = js.Any.fromFunction0(setLineNumber), setSource = js.Any.fromFunction0(setSource))
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
      
      inline def setGetArgs(value: () => js.Array[Any]): Self = StObject.set(x, "getArgs", js.Any.fromFunction0(value))
      
      inline def setGetColumnNumber(value: () => Double): Self = StObject.set(x, "getColumnNumber", js.Any.fromFunction0(value))
      
      inline def setGetEvalOrigin(value: () => StackFrame): Self = StObject.set(x, "getEvalOrigin", js.Any.fromFunction0(value))
      
      inline def setGetFileName(value: () => String): Self = StObject.set(x, "getFileName", js.Any.fromFunction0(value))
      
      inline def setGetFunctionName(value: () => String): Self = StObject.set(x, "getFunctionName", js.Any.fromFunction0(value))
      
      inline def setGetIsConstructor(value: () => Boolean): Self = StObject.set(x, "getIsConstructor", js.Any.fromFunction0(value))
      
      inline def setGetIsEval(value: () => Boolean): Self = StObject.set(x, "getIsEval", js.Any.fromFunction0(value))
      
      inline def setGetIsNative(value: () => Boolean): Self = StObject.set(x, "getIsNative", js.Any.fromFunction0(value))
      
      inline def setGetIsTopLevel(value: () => Boolean): Self = StObject.set(x, "getIsTopLevel", js.Any.fromFunction0(value))
      
      inline def setGetLineNumber(value: () => Double): Self = StObject.set(x, "getLineNumber", js.Any.fromFunction0(value))
      
      inline def setGetSource(value: () => String): Self = StObject.set(x, "getSource", js.Any.fromFunction0(value))
      
      inline def setIsConstructor(value: Boolean): Self = StObject.set(x, "isConstructor", value.asInstanceOf[js.Any])
      
      inline def setIsConstructorUndefined: Self = StObject.set(x, "isConstructor", js.undefined)
      
      inline def setIsEval(value: Boolean): Self = StObject.set(x, "isEval", value.asInstanceOf[js.Any])
      
      inline def setIsEvalUndefined: Self = StObject.set(x, "isEval", js.undefined)
      
      inline def setIsNative(value: Boolean): Self = StObject.set(x, "isNative", value.asInstanceOf[js.Any])
      
      inline def setIsNativeUndefined: Self = StObject.set(x, "isNative", js.undefined)
      
      inline def setIsTopLevel(value: Boolean): Self = StObject.set(x, "isTopLevel", value.asInstanceOf[js.Any])
      
      inline def setIsTopLevelUndefined: Self = StObject.set(x, "isTopLevel", js.undefined)
      
      inline def setLineNumber(value: Double): Self = StObject.set(x, "lineNumber", value.asInstanceOf[js.Any])
      
      inline def setLineNumberUndefined: Self = StObject.set(x, "lineNumber", js.undefined)
      
      inline def setSetArgs(value: () => Unit): Self = StObject.set(x, "setArgs", js.Any.fromFunction0(value))
      
      inline def setSetColumnNumber(value: () => Unit): Self = StObject.set(x, "setColumnNumber", js.Any.fromFunction0(value))
      
      inline def setSetEvalOrigin(value: () => Unit): Self = StObject.set(x, "setEvalOrigin", js.Any.fromFunction0(value))
      
      inline def setSetFileName(value: () => Unit): Self = StObject.set(x, "setFileName", js.Any.fromFunction0(value))
      
      inline def setSetFunctionName(value: () => Unit): Self = StObject.set(x, "setFunctionName", js.Any.fromFunction0(value))
      
      inline def setSetIsConstructor(value: () => Unit): Self = StObject.set(x, "setIsConstructor", js.Any.fromFunction0(value))
      
      inline def setSetIsEval(value: () => Unit): Self = StObject.set(x, "setIsEval", js.Any.fromFunction0(value))
      
      inline def setSetIsNative(value: () => Unit): Self = StObject.set(x, "setIsNative", js.Any.fromFunction0(value))
      
      inline def setSetIsTopLevel(value: () => Unit): Self = StObject.set(x, "setIsTopLevel", js.Any.fromFunction0(value))
      
      inline def setSetLineNumber(value: () => Unit): Self = StObject.set(x, "setLineNumber", js.Any.fromFunction0(value))
      
      inline def setSetSource(value: () => Unit): Self = StObject.set(x, "setSource", js.Any.fromFunction0(value))
      
      inline def setSource(value: String): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
      
      inline def setSourceUndefined: Self = StObject.set(x, "source", js.undefined)
    }
  }
  
  trait StackTraceOptions extends StObject {
    
    var filter: js.UndefOr[js.Function1[/* stackFrame */ StackFrame, Boolean]] = js.undefined
    
    var offline: js.UndefOr[Boolean] = js.undefined
    
    var sourceCache: js.UndefOr[SourceCache] = js.undefined
  }
  object StackTraceOptions {
    
    inline def apply(): StackTraceOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[StackTraceOptions]
    }
    
    extension [Self <: StackTraceOptions](x: Self) {
      
      inline def setFilter(value: /* stackFrame */ StackFrame => Boolean): Self = StObject.set(x, "filter", js.Any.fromFunction1(value))
      
      inline def setFilterUndefined: Self = StObject.set(x, "filter", js.undefined)
      
      inline def setOffline(value: Boolean): Self = StObject.set(x, "offline", value.asInstanceOf[js.Any])
      
      inline def setOfflineUndefined: Self = StObject.set(x, "offline", js.undefined)
      
      inline def setSourceCache(value: SourceCache): Self = StObject.set(x, "sourceCache", value.asInstanceOf[js.Any])
      
      inline def setSourceCacheUndefined: Self = StObject.set(x, "sourceCache", js.undefined)
    }
  }
}
