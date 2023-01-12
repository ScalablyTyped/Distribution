package typings.reactModalView

import typings.react.mod.Component
import typings.react.mod.ReactNode
import typings.reactModalView.anon.Visible
import typings.std.MouseEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("react-modal-view", JSImport.Default)
  @js.native
  open class default () extends Modal
  
  @js.native
  trait Modal
    extends Component[ModalProps, js.Object, Any] {
    
    def handleBeforeComponentUpdate(props: ModalProps): Unit = js.native
    
    def handleCloseBtnClick(e: MouseEvent): Unit = js.native
    
    def handleComponentUpdate(prevProps: ModalProps, prevState: Visible): Unit = js.native
    
    def handleOverlayClick(e: MouseEvent): Unit = js.native
    
    def hide(): Unit = js.native
    
    def show(): Unit = js.native
    
    def toggleVisibility(): Unit = js.native
  }
  
  trait ModalProps extends StObject {
    
    /** Modal contents */
    var children: js.UndefOr[ReactNode] = js.undefined
    
    /** Whether or not the modal is closable */
    var closable: js.UndefOr[Boolean] = js.undefined
    
    /** Called when the modal is hidden */
    var onHide: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    /** Called when the modal is shown */
    var onShow: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    /** Whether or not the modal should be visible */
    var visible: js.UndefOr[Boolean] = js.undefined
  }
  object ModalProps {
    
    inline def apply(): ModalProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ModalProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ModalProps] (val x: Self) extends AnyVal {
      
      inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setClosable(value: Boolean): Self = StObject.set(x, "closable", value.asInstanceOf[js.Any])
      
      inline def setClosableUndefined: Self = StObject.set(x, "closable", js.undefined)
      
      inline def setOnHide(value: () => Unit): Self = StObject.set(x, "onHide", js.Any.fromFunction0(value))
      
      inline def setOnHideUndefined: Self = StObject.set(x, "onHide", js.undefined)
      
      inline def setOnShow(value: () => Unit): Self = StObject.set(x, "onShow", js.Any.fromFunction0(value))
      
      inline def setOnShowUndefined: Self = StObject.set(x, "onShow", js.undefined)
      
      inline def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
      
      inline def setVisibleUndefined: Self = StObject.set(x, "visible", js.undefined)
    }
  }
}
