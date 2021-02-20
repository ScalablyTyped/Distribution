package typings.primereact

import typings.react.mod.Component
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sidebarMod {
  
  @JSImport("primereact/components/sidebar/Sidebar", "Sidebar")
  @js.native
  class Sidebar protected ()
    extends Component[SidebarProps, js.Any, js.Any] {
    def this(props: SidebarProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: SidebarProps, context: js.Any) = this()
  }
  
  @js.native
  trait SidebarProps extends StObject {
    
    var ariaCloseLabel: js.UndefOr[String] = js.native
    
    var baseZIndex: js.UndefOr[Double] = js.native
    
    var blockScroll: js.UndefOr[Boolean] = js.native
    
    var className: js.UndefOr[String] = js.native
    
    var closeOnEscape: js.UndefOr[Boolean] = js.native
    
    var dismissable: js.UndefOr[Boolean] = js.native
    
    var fullScreen: js.UndefOr[Boolean] = js.native
    
    var icons: js.UndefOr[js.Function1[/* props */ js.Object, _]] = js.native
    
    var id: js.UndefOr[String] = js.native
    
    var modal: js.UndefOr[Boolean] = js.native
    
    def onHide(): Unit = js.native
    
    var onShow: js.UndefOr[js.Function0[Unit]] = js.native
    
    var position: js.UndefOr[String] = js.native
    
    var showCloseIcon: js.UndefOr[Boolean] = js.native
    
    var style: js.UndefOr[js.Object] = js.native
    
    var visible: js.UndefOr[Boolean] = js.native
  }
  object SidebarProps {
    
    @scala.inline
    def apply(onHide: () => Unit): SidebarProps = {
      val __obj = js.Dynamic.literal(onHide = js.Any.fromFunction0(onHide))
      __obj.asInstanceOf[SidebarProps]
    }
    
    @scala.inline
    implicit class SidebarPropsMutableBuilder[Self <: SidebarProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAriaCloseLabel(value: String): Self = StObject.set(x, "ariaCloseLabel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAriaCloseLabelUndefined: Self = StObject.set(x, "ariaCloseLabel", js.undefined)
      
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
      def setCloseOnEscape(value: Boolean): Self = StObject.set(x, "closeOnEscape", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCloseOnEscapeUndefined: Self = StObject.set(x, "closeOnEscape", js.undefined)
      
      @scala.inline
      def setDismissable(value: Boolean): Self = StObject.set(x, "dismissable", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDismissableUndefined: Self = StObject.set(x, "dismissable", js.undefined)
      
      @scala.inline
      def setFullScreen(value: Boolean): Self = StObject.set(x, "fullScreen", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFullScreenUndefined: Self = StObject.set(x, "fullScreen", js.undefined)
      
      @scala.inline
      def setIcons(value: /* props */ js.Object => _): Self = StObject.set(x, "icons", js.Any.fromFunction1(value))
      
      @scala.inline
      def setIconsUndefined: Self = StObject.set(x, "icons", js.undefined)
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      @scala.inline
      def setModal(value: Boolean): Self = StObject.set(x, "modal", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setModalUndefined: Self = StObject.set(x, "modal", js.undefined)
      
      @scala.inline
      def setOnHide(value: () => Unit): Self = StObject.set(x, "onHide", js.Any.fromFunction0(value))
      
      @scala.inline
      def setOnShow(value: () => Unit): Self = StObject.set(x, "onShow", js.Any.fromFunction0(value))
      
      @scala.inline
      def setOnShowUndefined: Self = StObject.set(x, "onShow", js.undefined)
      
      @scala.inline
      def setPosition(value: String): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
      
      @scala.inline
      def setShowCloseIcon(value: Boolean): Self = StObject.set(x, "showCloseIcon", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShowCloseIconUndefined: Self = StObject.set(x, "showCloseIcon", js.undefined)
      
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
