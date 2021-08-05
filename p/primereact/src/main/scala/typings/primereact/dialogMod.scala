package typings.primereact

import typings.primereact.anon.Maximized
import typings.react.mod.Component
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object dialogMod {
  
  @JSImport("primereact/components/dialog/Dialog", "Dialog")
  @js.native
  class Dialog protected ()
    extends Component[DialogProps, js.Any, js.Any] {
    def this(props: DialogProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: DialogProps, context: js.Any) = this()
  }
  
  trait DialogProps extends StObject {
    
    var appendTo: js.UndefOr[HTMLElement] = js.undefined
    
    var ariaCloseIconLabel: js.UndefOr[String] = js.undefined
    
    var baseZIndex: js.UndefOr[Double] = js.undefined
    
    var blockScroll: js.UndefOr[Boolean] = js.undefined
    
    var className: js.UndefOr[String] = js.undefined
    
    var closable: js.UndefOr[Boolean] = js.undefined
    
    var closeOnEscape: js.UndefOr[Boolean] = js.undefined
    
    var contentClassName: js.UndefOr[String] = js.undefined
    
    var contentStyle: js.UndefOr[js.Object] = js.undefined
    
    var dismissableMask: js.UndefOr[Boolean] = js.undefined
    
    var focusOnShow: js.UndefOr[Boolean] = js.undefined
    
    var footer: js.UndefOr[js.Any] = js.undefined
    
    var header: js.UndefOr[js.Any] = js.undefined
    
    var icons: js.UndefOr[js.Function1[/* props */ js.Object, js.Any]] = js.undefined
    
    var id: js.UndefOr[String] = js.undefined
    
    var maskClassName: js.UndefOr[String] = js.undefined
    
    var maximizable: js.UndefOr[Boolean] = js.undefined
    
    var maximized: js.UndefOr[Boolean] = js.undefined
    
    var modal: js.UndefOr[Boolean] = js.undefined
    
    def onHide(): Unit
    
    var onMaximize: js.UndefOr[js.Function1[/* e */ Maximized, Unit]] = js.undefined
    
    var onShow: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var position: js.UndefOr[String] = js.undefined
    
    var rtl: js.UndefOr[Boolean] = js.undefined
    
    var showHeader: js.UndefOr[Boolean] = js.undefined
    
    var style: js.UndefOr[js.Object] = js.undefined
    
    var visible: js.UndefOr[Boolean] = js.undefined
  }
  object DialogProps {
    
    inline def apply(onHide: () => Unit): DialogProps = {
      val __obj = js.Dynamic.literal(onHide = js.Any.fromFunction0(onHide))
      __obj.asInstanceOf[DialogProps]
    }
    
    extension [Self <: DialogProps](x: Self) {
      
      inline def setAppendTo(value: HTMLElement): Self = StObject.set(x, "appendTo", value.asInstanceOf[js.Any])
      
      inline def setAppendToUndefined: Self = StObject.set(x, "appendTo", js.undefined)
      
      inline def setAriaCloseIconLabel(value: String): Self = StObject.set(x, "ariaCloseIconLabel", value.asInstanceOf[js.Any])
      
      inline def setAriaCloseIconLabelUndefined: Self = StObject.set(x, "ariaCloseIconLabel", js.undefined)
      
      inline def setBaseZIndex(value: Double): Self = StObject.set(x, "baseZIndex", value.asInstanceOf[js.Any])
      
      inline def setBaseZIndexUndefined: Self = StObject.set(x, "baseZIndex", js.undefined)
      
      inline def setBlockScroll(value: Boolean): Self = StObject.set(x, "blockScroll", value.asInstanceOf[js.Any])
      
      inline def setBlockScrollUndefined: Self = StObject.set(x, "blockScroll", js.undefined)
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setClosable(value: Boolean): Self = StObject.set(x, "closable", value.asInstanceOf[js.Any])
      
      inline def setClosableUndefined: Self = StObject.set(x, "closable", js.undefined)
      
      inline def setCloseOnEscape(value: Boolean): Self = StObject.set(x, "closeOnEscape", value.asInstanceOf[js.Any])
      
      inline def setCloseOnEscapeUndefined: Self = StObject.set(x, "closeOnEscape", js.undefined)
      
      inline def setContentClassName(value: String): Self = StObject.set(x, "contentClassName", value.asInstanceOf[js.Any])
      
      inline def setContentClassNameUndefined: Self = StObject.set(x, "contentClassName", js.undefined)
      
      inline def setContentStyle(value: js.Object): Self = StObject.set(x, "contentStyle", value.asInstanceOf[js.Any])
      
      inline def setContentStyleUndefined: Self = StObject.set(x, "contentStyle", js.undefined)
      
      inline def setDismissableMask(value: Boolean): Self = StObject.set(x, "dismissableMask", value.asInstanceOf[js.Any])
      
      inline def setDismissableMaskUndefined: Self = StObject.set(x, "dismissableMask", js.undefined)
      
      inline def setFocusOnShow(value: Boolean): Self = StObject.set(x, "focusOnShow", value.asInstanceOf[js.Any])
      
      inline def setFocusOnShowUndefined: Self = StObject.set(x, "focusOnShow", js.undefined)
      
      inline def setFooter(value: js.Any): Self = StObject.set(x, "footer", value.asInstanceOf[js.Any])
      
      inline def setFooterUndefined: Self = StObject.set(x, "footer", js.undefined)
      
      inline def setHeader(value: js.Any): Self = StObject.set(x, "header", value.asInstanceOf[js.Any])
      
      inline def setHeaderUndefined: Self = StObject.set(x, "header", js.undefined)
      
      inline def setIcons(value: /* props */ js.Object => js.Any): Self = StObject.set(x, "icons", js.Any.fromFunction1(value))
      
      inline def setIconsUndefined: Self = StObject.set(x, "icons", js.undefined)
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      inline def setMaskClassName(value: String): Self = StObject.set(x, "maskClassName", value.asInstanceOf[js.Any])
      
      inline def setMaskClassNameUndefined: Self = StObject.set(x, "maskClassName", js.undefined)
      
      inline def setMaximizable(value: Boolean): Self = StObject.set(x, "maximizable", value.asInstanceOf[js.Any])
      
      inline def setMaximizableUndefined: Self = StObject.set(x, "maximizable", js.undefined)
      
      inline def setMaximized(value: Boolean): Self = StObject.set(x, "maximized", value.asInstanceOf[js.Any])
      
      inline def setMaximizedUndefined: Self = StObject.set(x, "maximized", js.undefined)
      
      inline def setModal(value: Boolean): Self = StObject.set(x, "modal", value.asInstanceOf[js.Any])
      
      inline def setModalUndefined: Self = StObject.set(x, "modal", js.undefined)
      
      inline def setOnHide(value: () => Unit): Self = StObject.set(x, "onHide", js.Any.fromFunction0(value))
      
      inline def setOnMaximize(value: /* e */ Maximized => Unit): Self = StObject.set(x, "onMaximize", js.Any.fromFunction1(value))
      
      inline def setOnMaximizeUndefined: Self = StObject.set(x, "onMaximize", js.undefined)
      
      inline def setOnShow(value: () => Unit): Self = StObject.set(x, "onShow", js.Any.fromFunction0(value))
      
      inline def setOnShowUndefined: Self = StObject.set(x, "onShow", js.undefined)
      
      inline def setPosition(value: String): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
      
      inline def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
      
      inline def setRtl(value: Boolean): Self = StObject.set(x, "rtl", value.asInstanceOf[js.Any])
      
      inline def setRtlUndefined: Self = StObject.set(x, "rtl", js.undefined)
      
      inline def setShowHeader(value: Boolean): Self = StObject.set(x, "showHeader", value.asInstanceOf[js.Any])
      
      inline def setShowHeaderUndefined: Self = StObject.set(x, "showHeader", js.undefined)
      
      inline def setStyle(value: js.Object): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      inline def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
      
      inline def setVisibleUndefined: Self = StObject.set(x, "visible", js.undefined)
    }
  }
}
