package typings.rmcTrigger

import typings.react.mod.Component
import typings.react.mod.global.JSX.Element
import typings.rmcTrigger.anon.AfterPopupVisibleChange
import typings.rmcTrigger.propsTypeMod.ITriggerProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object triggerMod {
  
  @JSImport("rmc-trigger/lib/Trigger", JSImport.Default)
  @js.native
  class default () extends Trigger
  /* static members */
  object default {
    
    @JSImport("rmc-trigger/lib/Trigger", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("rmc-trigger/lib/Trigger", "default.defaultProps")
    @js.native
    def defaultProps: AfterPopupVisibleChange = js.native
    @scala.inline
    def defaultProps_=(x: AfterPopupVisibleChange): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  }
  
  @js.native
  trait IProptypes extends StObject {
    
    def onClose(): Unit = js.native
    
    def onTargetClick(): Unit = js.native
    
    var visible: Boolean = js.native
  }
  object IProptypes {
    
    @scala.inline
    def apply(onClose: () => Unit, onTargetClick: () => Unit, visible: Boolean): IProptypes = {
      val __obj = js.Dynamic.literal(onClose = js.Any.fromFunction0(onClose), onTargetClick = js.Any.fromFunction0(onTargetClick), visible = visible.asInstanceOf[js.Any])
      __obj.asInstanceOf[IProptypes]
    }
    
    @scala.inline
    implicit class IProptypesMutableBuilder[Self <: IProptypes] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setOnClose(value: () => Unit): Self = StObject.set(x, "onClose", js.Any.fromFunction0(value))
      
      @scala.inline
      def setOnTargetClick(value: () => Unit): Self = StObject.set(x, "onTargetClick", js.Any.fromFunction0(value))
      
      @scala.inline
      def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Trigger
    extends Component[ITriggerProps with IProptypes, js.Any, js.Any] {
    
    var _component: js.Any = js.native
    
    var _container: js.Any = js.native
    
    def clearOutsideHandler(): Unit = js.native
    
    def close(): Unit = js.native
    
    @JSName("componentDidMount")
    def componentDidMount_MTrigger(): Unit = js.native
    
    @JSName("componentDidUpdate")
    def componentDidUpdate_MTrigger(): Unit = js.native
    
    @JSName("componentWillUnmount")
    def componentWillUnmount_MTrigger(): Unit = js.native
    
    def getComponent(visible: js.Any): Element = js.native
    
    def getContainer(): js.Any = js.native
    
    def getPopupAlign(): js.Any = js.native
    
    def getPopupClassNameFromAlign(align: js.Any): String = js.native
    
    def getPopupDomNode(): js.Any = js.native
    
    def getRootDomNode(): typings.std.Element = js.native
    
    def onAnimateLeave(): Unit = js.native
    
    def onDocumentClick(event: js.Any): Unit = js.native
    
    var popupRef: js.Any = js.native
    
    def removeContainer(): Unit = js.native
    
    def renderDialog(visible: js.Any): Unit = js.native
    
    def saveRef(el: js.Any, visible: js.Any): Unit = js.native
    
    var touchOutsideHandler: js.Any = js.native
  }
}
