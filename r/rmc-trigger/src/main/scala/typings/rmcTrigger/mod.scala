package typings.rmcTrigger

import typings.react.mod.Component
import typings.rmcTrigger.propsTypeMod.ITriggerProps
import typings.std.Document
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("rmc-trigger", JSImport.Default)
  @js.native
  class default protected () extends TriggerWrap {
    def this(props: js.Any) = this()
  }
  object default {
    
    @JSImport("rmc-trigger", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    object defaultProps {
      
      @JSImport("rmc-trigger", "default.defaultProps")
      @js.native
      val ^ : js.Any = js.native
      
      @JSImport("rmc-trigger", "default.defaultProps.afterPopupVisibleChange")
      @js.native
      def afterPopupVisibleChange: js.Function0[Unit] = js.native
      @scala.inline
      def afterPopupVisibleChange_=(x: js.Function0[Unit]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("afterPopupVisibleChange")(x.asInstanceOf[js.Any])
      
      @JSImport("rmc-trigger", "default.defaultProps.defaultPopupVisible")
      @js.native
      def defaultPopupVisible: Boolean = js.native
      @scala.inline
      def defaultPopupVisible_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultPopupVisible")(x.asInstanceOf[js.Any])
      
      @JSImport("rmc-trigger", "default.defaultProps.destroyPopupOnHide")
      @js.native
      def destroyPopupOnHide: Boolean = js.native
      @scala.inline
      def destroyPopupOnHide_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("destroyPopupOnHide")(x.asInstanceOf[js.Any])
      
      @JSImport("rmc-trigger", "default.defaultProps.getDocument")
      @js.native
      def getDocument: js.Function0[Document] = js.native
      @scala.inline
      def getDocument_=(x: js.Function0[Document]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("getDocument")(x.asInstanceOf[js.Any])
      
      @JSImport("rmc-trigger", "default.defaultProps.getPopupClassNameFromAlign")
      @js.native
      def getPopupClassNameFromAlign: js.Function0[String] = js.native
      @scala.inline
      def getPopupClassNameFromAlign_=(x: js.Function0[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("getPopupClassNameFromAlign")(x.asInstanceOf[js.Any])
      
      @JSImport("rmc-trigger", "default.defaultProps.mask")
      @js.native
      def mask: Boolean = js.native
      
      @JSImport("rmc-trigger", "default.defaultProps.maskClosable")
      @js.native
      def maskClosable: Boolean = js.native
      @scala.inline
      def maskClosable_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("maskClosable")(x.asInstanceOf[js.Any])
      
      @scala.inline
      def mask_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("mask")(x.asInstanceOf[js.Any])
      
      @JSImport("rmc-trigger", "default.defaultProps.onPopupAlign")
      @js.native
      def onPopupAlign: js.Function0[Unit] = js.native
      @scala.inline
      def onPopupAlign_=(x: js.Function0[Unit]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("onPopupAlign")(x.asInstanceOf[js.Any])
      
      @JSImport("rmc-trigger", "default.defaultProps.onPopupVisibleChange")
      @js.native
      def onPopupVisibleChange: js.Function0[Unit] = js.native
      @scala.inline
      def onPopupVisibleChange_=(x: js.Function0[Unit]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("onPopupVisibleChange")(x.asInstanceOf[js.Any])
      
      @JSImport("rmc-trigger", "default.defaultProps.popupClassName")
      @js.native
      def popupClassName: String = js.native
      @scala.inline
      def popupClassName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("popupClassName")(x.asInstanceOf[js.Any])
      
      @JSImport("rmc-trigger", "default.defaultProps.prefixCls")
      @js.native
      def prefixCls: String = js.native
      @scala.inline
      def prefixCls_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("prefixCls")(x.asInstanceOf[js.Any])
    }
    
    /* static member */
    @JSImport("rmc-trigger", "default.displayName")
    @js.native
    def displayName: String = js.native
    @scala.inline
    def displayName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("displayName")(x.asInstanceOf[js.Any])
  }
  
  @js.native
  trait TriggerWrap
    extends Component[ITriggerProps, js.Any, js.Any] {
    
    @JSName("componentWillReceiveProps")
    def componentWillReceiveProps_MTriggerWrap(nextProps: js.Any): Unit = js.native
    
    def onClose(): Unit = js.native
    
    def onTargetClick(): Unit = js.native
    
    def setPopupVisible(visible: js.Any): Unit = js.native
    
    var triggerRef: js.Any = js.native
  }
}
