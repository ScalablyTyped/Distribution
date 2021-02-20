package typings.primereact

import typings.primereact.anon.Maximized
import typings.react.mod.Component
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
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
  
  @js.native
  trait DialogProps extends StObject {
    
    var appendTo: js.UndefOr[HTMLElement] = js.native
    
    var ariaCloseIconLabel: js.UndefOr[String] = js.native
    
    var baseZIndex: js.UndefOr[Double] = js.native
    
    var blockScroll: js.UndefOr[Boolean] = js.native
    
    var className: js.UndefOr[String] = js.native
    
    var closable: js.UndefOr[Boolean] = js.native
    
    var closeOnEscape: js.UndefOr[Boolean] = js.native
    
    var contentClassName: js.UndefOr[String] = js.native
    
    var contentStyle: js.UndefOr[js.Object] = js.native
    
    var dismissableMask: js.UndefOr[Boolean] = js.native
    
    var focusOnShow: js.UndefOr[Boolean] = js.native
    
    var footer: js.UndefOr[js.Any] = js.native
    
    var header: js.UndefOr[js.Any] = js.native
    
    var icons: js.UndefOr[js.Function1[/* props */ js.Object, _]] = js.native
    
    var id: js.UndefOr[String] = js.native
    
    var maskClassName: js.UndefOr[String] = js.native
    
    var maximizable: js.UndefOr[Boolean] = js.native
    
    var maximized: js.UndefOr[Boolean] = js.native
    
    var modal: js.UndefOr[Boolean] = js.native
    
    def onHide(): Unit = js.native
    
    var onMaximize: js.UndefOr[js.Function1[/* e */ Maximized, Unit]] = js.native
    
    var onShow: js.UndefOr[js.Function0[Unit]] = js.native
    
    var position: js.UndefOr[String] = js.native
    
    var rtl: js.UndefOr[Boolean] = js.native
    
    var showHeader: js.UndefOr[Boolean] = js.native
    
    var style: js.UndefOr[js.Object] = js.native
    
    var visible: js.UndefOr[Boolean] = js.native
  }
  object DialogProps {
    
    @scala.inline
    def apply(onHide: () => Unit): DialogProps = {
      val __obj = js.Dynamic.literal(onHide = js.Any.fromFunction0(onHide))
      __obj.asInstanceOf[DialogProps]
    }
    
    @scala.inline
    implicit class DialogPropsMutableBuilder[Self <: DialogProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAppendTo(value: HTMLElement): Self = StObject.set(x, "appendTo", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAppendToUndefined: Self = StObject.set(x, "appendTo", js.undefined)
      
      @scala.inline
      def setAriaCloseIconLabel(value: String): Self = StObject.set(x, "ariaCloseIconLabel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAriaCloseIconLabelUndefined: Self = StObject.set(x, "ariaCloseIconLabel", js.undefined)
      
      @scala.inline
      def setBaseZIndex(value: Double): Self = StObject.set(x, "baseZIndex", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBaseZIndexUndefined: Self = StObject.set(x, "baseZIndex", js.undefined)
      
      @scala.inline
      def setBlockScroll(value: Boolean): Self = StObject.set(x, "blockScroll", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBlockScrollUndefined: Self = StObject.set(x, "blockScroll", js.undefined)
      
      @scala.inline
      def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      @scala.inline
      def setClosable(value: Boolean): Self = StObject.set(x, "closable", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClosableUndefined: Self = StObject.set(x, "closable", js.undefined)
      
      @scala.inline
      def setCloseOnEscape(value: Boolean): Self = StObject.set(x, "closeOnEscape", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCloseOnEscapeUndefined: Self = StObject.set(x, "closeOnEscape", js.undefined)
      
      @scala.inline
      def setContentClassName(value: String): Self = StObject.set(x, "contentClassName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContentClassNameUndefined: Self = StObject.set(x, "contentClassName", js.undefined)
      
      @scala.inline
      def setContentStyle(value: js.Object): Self = StObject.set(x, "contentStyle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContentStyleUndefined: Self = StObject.set(x, "contentStyle", js.undefined)
      
      @scala.inline
      def setDismissableMask(value: Boolean): Self = StObject.set(x, "dismissableMask", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDismissableMaskUndefined: Self = StObject.set(x, "dismissableMask", js.undefined)
      
      @scala.inline
      def setFocusOnShow(value: Boolean): Self = StObject.set(x, "focusOnShow", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFocusOnShowUndefined: Self = StObject.set(x, "focusOnShow", js.undefined)
      
      @scala.inline
      def setFooter(value: js.Any): Self = StObject.set(x, "footer", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFooterUndefined: Self = StObject.set(x, "footer", js.undefined)
      
      @scala.inline
      def setHeader(value: js.Any): Self = StObject.set(x, "header", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeaderUndefined: Self = StObject.set(x, "header", js.undefined)
      
      @scala.inline
      def setIcons(value: /* props */ js.Object => _): Self = StObject.set(x, "icons", js.Any.fromFunction1(value))
      
      @scala.inline
      def setIconsUndefined: Self = StObject.set(x, "icons", js.undefined)
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      @scala.inline
      def setMaskClassName(value: String): Self = StObject.set(x, "maskClassName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaskClassNameUndefined: Self = StObject.set(x, "maskClassName", js.undefined)
      
      @scala.inline
      def setMaximizable(value: Boolean): Self = StObject.set(x, "maximizable", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaximizableUndefined: Self = StObject.set(x, "maximizable", js.undefined)
      
      @scala.inline
      def setMaximized(value: Boolean): Self = StObject.set(x, "maximized", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaximizedUndefined: Self = StObject.set(x, "maximized", js.undefined)
      
      @scala.inline
      def setModal(value: Boolean): Self = StObject.set(x, "modal", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setModalUndefined: Self = StObject.set(x, "modal", js.undefined)
      
      @scala.inline
      def setOnHide(value: () => Unit): Self = StObject.set(x, "onHide", js.Any.fromFunction0(value))
      
      @scala.inline
      def setOnMaximize(value: /* e */ Maximized => Unit): Self = StObject.set(x, "onMaximize", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnMaximizeUndefined: Self = StObject.set(x, "onMaximize", js.undefined)
      
      @scala.inline
      def setOnShow(value: () => Unit): Self = StObject.set(x, "onShow", js.Any.fromFunction0(value))
      
      @scala.inline
      def setOnShowUndefined: Self = StObject.set(x, "onShow", js.undefined)
      
      @scala.inline
      def setPosition(value: String): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
      
      @scala.inline
      def setRtl(value: Boolean): Self = StObject.set(x, "rtl", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRtlUndefined: Self = StObject.set(x, "rtl", js.undefined)
      
      @scala.inline
      def setShowHeader(value: Boolean): Self = StObject.set(x, "showHeader", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShowHeaderUndefined: Self = StObject.set(x, "showHeader", js.undefined)
      
      @scala.inline
      def setStyle(value: js.Object): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      @scala.inline
      def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVisibleUndefined: Self = StObject.set(x, "visible", js.undefined)
    }
  }
}
