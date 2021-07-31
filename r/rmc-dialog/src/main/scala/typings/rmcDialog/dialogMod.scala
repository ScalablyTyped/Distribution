package typings.rmcDialog

import typings.react.mod.Component
import typings.react.mod.global.JSX.Element
import typings.rmcDialog.anon.AfterClose
import typings.rmcDialog.idialogproptypesMod.IDialogPropTypes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object dialogMod {
  
  @JSImport("rmc-dialog/lib/Dialog", JSImport.Default)
  @js.native
  class default () extends Dialog
  /* static members */
  object default {
    
    @JSImport("rmc-dialog/lib/Dialog", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("rmc-dialog/lib/Dialog", "default.defaultProps")
    @js.native
    def defaultProps: AfterClose = js.native
    @scala.inline
    def defaultProps_=(x: AfterClose): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  }
  
  @js.native
  trait Dialog
    extends Component[IDialogPropTypes, js.Any, js.Any] {
    
    var bodyRef: js.Any = js.native
    
    def close(e: js.Any): Unit = js.native
    
    @JSName("componentWillUnmount")
    def componentWillUnmount_MDialog(): Unit = js.native
    
    var dialogRef: js.Any = js.native
    
    var footerRef: js.Any = js.native
    
    def getDialogElement(): Element = js.native
    
    def getMaskElement(): js.Any = js.native
    
    def getMaskStyle(): js.Any = js.native
    
    def getMaskTransitionName(): js.UndefOr[String] = js.native
    
    def getTransitionName(): js.UndefOr[String] = js.native
    
    def getWrapStyle(): js.Any = js.native
    
    def getZIndexStyle(): js.Any = js.native
    
    var headerRef: js.Any = js.native
    
    def onAnimateAppear(): Unit = js.native
    
    def onAnimateLeave(): Unit = js.native
    
    def onMaskClick(e: js.Any): Unit = js.native
    
    var wrapRef: js.Any = js.native
  }
}
