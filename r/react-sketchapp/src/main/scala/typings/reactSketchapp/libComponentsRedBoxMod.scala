package typings.reactSketchapp

import typings.propTypes.mod.InferProps
import typings.propTypes.mod.Validator
import typings.react.mod.Component
import typings.react.mod.global.JSX.Element
import typings.reactSketchapp.anon.Error
import typings.reactSketchapp.anon.UseColumns
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libComponentsRedBoxMod {
  
  object ErrorBoxPropTypes {
    
    @JSImport("react-sketchapp/lib/components/RedBox", "ErrorBoxPropTypes")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("react-sketchapp/lib/components/RedBox", "ErrorBoxPropTypes.error")
    @js.native
    def error: Validator[String | js.Error] = js.native
    inline def error_=(x: Validator[String | js.Error]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("error")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("react-sketchapp/lib/components/RedBox", "RedBox")
  @js.native
  open class RedBox protected ()
    extends Component[Props, js.Object, Any] {
    def this(props: Props) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: Props, context: Any) = this()
    
    def renderFrames(frames: js.Array[StackFrame]): js.Array[Element] = js.native
  }
  /* static members */
  object RedBox {
    
    @JSImport("react-sketchapp/lib/components/RedBox", "RedBox")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("react-sketchapp/lib/components/RedBox", "RedBox.defaultProps")
    @js.native
    def defaultProps: UseColumns = js.native
    inline def defaultProps_=(x: UseColumns): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
    
    @JSImport("react-sketchapp/lib/components/RedBox", "RedBox.propTypes")
    @js.native
    def propTypes: Error = js.native
    inline def propTypes_=(x: Error): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("propTypes")(x.asInstanceOf[js.Any])
  }
  
  type Props = InferProps[Error]
  
  trait StackFrame extends StObject {
    
    var args: js.UndefOr[js.Array[Any]] = js.undefined
    
    var columnNumber: js.UndefOr[Double] = js.undefined
    
    var evalOrigin: js.UndefOr[StackFrame] = js.undefined
    
    var fileName: js.UndefOr[String] = js.undefined
    
    var functionName: js.UndefOr[String] = js.undefined
    
    var isConstrutor: js.UndefOr[Boolean] = js.undefined
    
    var isEval: js.UndefOr[Boolean] = js.undefined
    
    var isNative: js.UndefOr[Boolean] = js.undefined
    
    var isTopLevel: js.UndefOr[Boolean] = js.undefined
    
    var lineNumber: js.UndefOr[Double] = js.undefined
    
    var source: js.UndefOr[String] = js.undefined
  }
  object StackFrame {
    
    inline def apply(): StackFrame = {
      val __obj = js.Dynamic.literal()
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
      
      inline def setIsConstrutor(value: Boolean): Self = StObject.set(x, "isConstrutor", value.asInstanceOf[js.Any])
      
      inline def setIsConstrutorUndefined: Self = StObject.set(x, "isConstrutor", js.undefined)
      
      inline def setIsEval(value: Boolean): Self = StObject.set(x, "isEval", value.asInstanceOf[js.Any])
      
      inline def setIsEvalUndefined: Self = StObject.set(x, "isEval", js.undefined)
      
      inline def setIsNative(value: Boolean): Self = StObject.set(x, "isNative", value.asInstanceOf[js.Any])
      
      inline def setIsNativeUndefined: Self = StObject.set(x, "isNative", js.undefined)
      
      inline def setIsTopLevel(value: Boolean): Self = StObject.set(x, "isTopLevel", value.asInstanceOf[js.Any])
      
      inline def setIsTopLevelUndefined: Self = StObject.set(x, "isTopLevel", js.undefined)
      
      inline def setLineNumber(value: Double): Self = StObject.set(x, "lineNumber", value.asInstanceOf[js.Any])
      
      inline def setLineNumberUndefined: Self = StObject.set(x, "lineNumber", js.undefined)
      
      inline def setSource(value: String): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
      
      inline def setSourceUndefined: Self = StObject.set(x, "source", js.undefined)
    }
  }
}
