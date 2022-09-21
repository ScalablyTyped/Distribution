package typings.reactToastr

import typings.react.mod.Component
import typings.react.mod.ReactNode
import typings.reactToastr.anon.ClassName
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("react-toastr", "ToastContainer")
  @js.native
  open class ToastContainer protected ()
    extends Component[ClassName, js.Object, Any] {
    def this(props: ClassName) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: ClassName, context: Any) = this()
    
    def clear(): Unit = js.native
    
    def error(message: ReactNode, title: ReactNode): Unit = js.native
    def error(message: ReactNode, title: ReactNode, optionsOverride: js.Object): Unit = js.native
    
    def info(message: ReactNode, title: ReactNode): Unit = js.native
    def info(message: ReactNode, title: ReactNode, optionsOverride: js.Object): Unit = js.native
    
    def success(message: ReactNode, title: ReactNode): Unit = js.native
    def success(message: ReactNode, title: ReactNode, optionsOverride: js.Object): Unit = js.native
    
    def warning(message: ReactNode, title: ReactNode): Unit = js.native
    def warning(message: ReactNode, title: ReactNode, optionsOverride: js.Object): Unit = js.native
  }
  
  @JSImport("react-toastr", "ToastMessageAnimated")
  @js.native
  val ToastMessageAnimated: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 116 */ Any = js.native
  
  @JSImport("react-toastr", "ToastMessagejQuery")
  @js.native
  val ToastMessagejQuery: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 116 */ Any = js.native
}
