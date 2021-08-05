package typings.primereact

import typings.primereact.primereactStrings.error
import typings.primereact.primereactStrings.info
import typings.primereact.primereactStrings.success
import typings.primereact.primereactStrings.warn
import typings.react.mod.Component
import typings.react.mod.ReactNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object toastMod {
  
  @JSImport("primereact/components/toast/Toast", "Toast")
  @js.native
  class Toast protected ()
    extends Component[ToastProps, js.Any, js.Any] {
    def this(props: ToastProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: ToastProps, context: js.Any) = this()
    
    def clear(): Unit = js.native
    
    def show(message: js.Array[ToastMessage]): Unit = js.native
    def show(message: ToastMessage): Unit = js.native
  }
  
  trait ToastMessage extends StObject {
    
    var closable: js.UndefOr[Boolean] = js.undefined
    
    var detail: js.UndefOr[ReactNode] = js.undefined
    
    var life: js.UndefOr[Double] = js.undefined
    
    var severity: js.UndefOr[success | info | warn | error] = js.undefined
    
    var sticky: js.UndefOr[Boolean] = js.undefined
    
    var summary: js.UndefOr[ReactNode] = js.undefined
  }
  object ToastMessage {
    
    inline def apply(): ToastMessage = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ToastMessage]
    }
    
    extension [Self <: ToastMessage](x: Self) {
      
      inline def setClosable(value: Boolean): Self = StObject.set(x, "closable", value.asInstanceOf[js.Any])
      
      inline def setClosableUndefined: Self = StObject.set(x, "closable", js.undefined)
      
      inline def setDetail(value: ReactNode): Self = StObject.set(x, "detail", value.asInstanceOf[js.Any])
      
      inline def setDetailUndefined: Self = StObject.set(x, "detail", js.undefined)
      
      inline def setLife(value: Double): Self = StObject.set(x, "life", value.asInstanceOf[js.Any])
      
      inline def setLifeUndefined: Self = StObject.set(x, "life", js.undefined)
      
      inline def setSeverity(value: success | info | warn | error): Self = StObject.set(x, "severity", value.asInstanceOf[js.Any])
      
      inline def setSeverityUndefined: Self = StObject.set(x, "severity", js.undefined)
      
      inline def setSticky(value: Boolean): Self = StObject.set(x, "sticky", value.asInstanceOf[js.Any])
      
      inline def setStickyUndefined: Self = StObject.set(x, "sticky", js.undefined)
      
      inline def setSummary(value: ReactNode): Self = StObject.set(x, "summary", value.asInstanceOf[js.Any])
      
      inline def setSummaryUndefined: Self = StObject.set(x, "summary", js.undefined)
    }
  }
  
  trait ToastProps extends StObject {
    
    var baseZIndex: js.UndefOr[Double] = js.undefined
    
    var className: js.UndefOr[String] = js.undefined
    
    var id: js.UndefOr[String] = js.undefined
    
    var onClick: js.UndefOr[js.Function1[/* message */ ToastMessage, Unit]] = js.undefined
    
    var onClose: js.UndefOr[js.Function1[/* message */ ToastMessage, Unit]] = js.undefined
    
    var onRemove: js.UndefOr[js.Function1[/* message */ ToastMessage, Unit]] = js.undefined
    
    var position: js.UndefOr[String] = js.undefined
    
    var style: js.UndefOr[js.Object] = js.undefined
  }
  object ToastProps {
    
    inline def apply(): ToastProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ToastProps]
    }
    
    extension [Self <: ToastProps](x: Self) {
      
      inline def setBaseZIndex(value: Double): Self = StObject.set(x, "baseZIndex", value.asInstanceOf[js.Any])
      
      inline def setBaseZIndexUndefined: Self = StObject.set(x, "baseZIndex", js.undefined)
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      inline def setOnClick(value: /* message */ ToastMessage => Unit): Self = StObject.set(x, "onClick", js.Any.fromFunction1(value))
      
      inline def setOnClickUndefined: Self = StObject.set(x, "onClick", js.undefined)
      
      inline def setOnClose(value: /* message */ ToastMessage => Unit): Self = StObject.set(x, "onClose", js.Any.fromFunction1(value))
      
      inline def setOnCloseUndefined: Self = StObject.set(x, "onClose", js.undefined)
      
      inline def setOnRemove(value: /* message */ ToastMessage => Unit): Self = StObject.set(x, "onRemove", js.Any.fromFunction1(value))
      
      inline def setOnRemoveUndefined: Self = StObject.set(x, "onRemove", js.undefined)
      
      inline def setPosition(value: String): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
      
      inline def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
      
      inline def setStyle(value: js.Object): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    }
  }
}
