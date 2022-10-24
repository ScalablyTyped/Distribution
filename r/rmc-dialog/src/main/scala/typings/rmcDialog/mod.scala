package typings.rmcDialog

import typings.react.mod.Component
import typings.react.mod.global.JSX.Element
import typings.rmcDialog.anon.OnClose
import typings.rmcDialog.anon.Visible
import typings.rmcDialog.libIdialogproptypesMod.IDialogPropTypes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("rmc-dialog", JSImport.Default)
  @js.native
  open class default () extends DialogWrap
  /* static members */
  object default {
    
    @JSImport("rmc-dialog", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("rmc-dialog", "default.defaultProps")
    @js.native
    def defaultProps: OnClose = js.native
    inline def defaultProps_=(x: OnClose): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  }
  
  @js.native
  trait DialogWrap extends Component[IDialogPropTypes, Any, Any] {
    
    var _component: Any = js.native
    
    @JSName("componentDidMount")
    def componentDidMount_MDialogWrap(): Unit = js.native
    
    @JSName("componentDidUpdate")
    def componentDidUpdate_MDialogWrap(): Unit = js.native
    
    @JSName("componentWillUnmount")
    def componentWillUnmount_MDialogWrap(): Unit = js.native
    
    var container: Any = js.native
    
    def getComponent(visible: Any): Element = js.native
    
    def getContainer(): Any = js.native
    
    def removeContainer(): Unit = js.native
    
    def renderDialog(visible: Any): Unit = js.native
    
    def saveRef(node: Any): Unit = js.native
    
    @JSName("shouldComponentUpdate")
    def shouldComponentUpdate_MDialogWrap(param0: Visible): Boolean = js.native
  }
}
