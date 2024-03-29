package typings.stackTrace

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("stack-trace", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def get(): js.Array[StackFrame] = ^.asInstanceOf[js.Dynamic].applyDynamic("get")().asInstanceOf[js.Array[StackFrame]]
  inline def get(belowFn: js.Function0[Unit]): js.Array[StackFrame] = ^.asInstanceOf[js.Dynamic].applyDynamic("get")(belowFn.asInstanceOf[js.Any]).asInstanceOf[js.Array[StackFrame]]
  
  inline def parse(err: js.Error): js.Array[StackFrame] = ^.asInstanceOf[js.Dynamic].applyDynamic("parse")(err.asInstanceOf[js.Any]).asInstanceOf[js.Array[StackFrame]]
  
  trait StackFrame extends StObject {
    
    def getColumnNumber(): Double
    
    def getFileName(): String
    
    def getFunctionName(): String
    
    def getLineNumber(): Double
    
    def getMethodName(): String
    
    def getTypeName(): String
    
    def isConstructor(): Boolean
    
    def isNative(): Boolean
  }
  object StackFrame {
    
    inline def apply(
      getColumnNumber: () => Double,
      getFileName: () => String,
      getFunctionName: () => String,
      getLineNumber: () => Double,
      getMethodName: () => String,
      getTypeName: () => String,
      isConstructor: () => Boolean,
      isNative: () => Boolean
    ): StackFrame = {
      val __obj = js.Dynamic.literal(getColumnNumber = js.Any.fromFunction0(getColumnNumber), getFileName = js.Any.fromFunction0(getFileName), getFunctionName = js.Any.fromFunction0(getFunctionName), getLineNumber = js.Any.fromFunction0(getLineNumber), getMethodName = js.Any.fromFunction0(getMethodName), getTypeName = js.Any.fromFunction0(getTypeName), isConstructor = js.Any.fromFunction0(isConstructor), isNative = js.Any.fromFunction0(isNative))
      __obj.asInstanceOf[StackFrame]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: StackFrame] (val x: Self) extends AnyVal {
      
      inline def setGetColumnNumber(value: () => Double): Self = StObject.set(x, "getColumnNumber", js.Any.fromFunction0(value))
      
      inline def setGetFileName(value: () => String): Self = StObject.set(x, "getFileName", js.Any.fromFunction0(value))
      
      inline def setGetFunctionName(value: () => String): Self = StObject.set(x, "getFunctionName", js.Any.fromFunction0(value))
      
      inline def setGetLineNumber(value: () => Double): Self = StObject.set(x, "getLineNumber", js.Any.fromFunction0(value))
      
      inline def setGetMethodName(value: () => String): Self = StObject.set(x, "getMethodName", js.Any.fromFunction0(value))
      
      inline def setGetTypeName(value: () => String): Self = StObject.set(x, "getTypeName", js.Any.fromFunction0(value))
      
      inline def setIsConstructor(value: () => Boolean): Self = StObject.set(x, "isConstructor", js.Any.fromFunction0(value))
      
      inline def setIsNative(value: () => Boolean): Self = StObject.set(x, "isNative", js.Any.fromFunction0(value))
    }
  }
}
