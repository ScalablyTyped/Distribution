package typings.primereact

import typings.react.mod.Component
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
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
  
  trait SidebarProps extends StObject {
    
    var ariaCloseLabel: js.UndefOr[String] = js.undefined
    
    var baseZIndex: js.UndefOr[Double] = js.undefined
    
    var blockScroll: js.UndefOr[Boolean] = js.undefined
    
    var className: js.UndefOr[String] = js.undefined
    
    var closeOnEscape: js.UndefOr[Boolean] = js.undefined
    
    var dismissable: js.UndefOr[Boolean] = js.undefined
    
    var fullScreen: js.UndefOr[Boolean] = js.undefined
    
    var icons: js.UndefOr[js.Function1[/* props */ js.Object, js.Any]] = js.undefined
    
    var id: js.UndefOr[String] = js.undefined
    
    var modal: js.UndefOr[Boolean] = js.undefined
    
    def onHide(): Unit
    
    var onShow: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var position: js.UndefOr[String] = js.undefined
    
    var showCloseIcon: js.UndefOr[Boolean] = js.undefined
    
    var style: js.UndefOr[js.Object] = js.undefined
    
    var visible: js.UndefOr[Boolean] = js.undefined
  }
  object SidebarProps {
    
    inline def apply(onHide: () => Unit): SidebarProps = {
      val __obj = js.Dynamic.literal(onHide = js.Any.fromFunction0(onHide))
      __obj.asInstanceOf[SidebarProps]
    }
    
    extension [Self <: SidebarProps](x: Self) {
      
      inline def setAriaCloseLabel(value: String): Self = StObject.set(x, "ariaCloseLabel", value.asInstanceOf[js.Any])
      
      inline def setAriaCloseLabelUndefined: Self = StObject.set(x, "ariaCloseLabel", js.undefined)
      
      inline def setBaseZIndex(value: Double): Self = StObject.set(x, "baseZIndex", value.asInstanceOf[js.Any])
      
      inline def setBaseZIndexUndefined: Self = StObject.set(x, "baseZIndex", js.undefined)
      
      inline def setBlockScroll(value: Boolean): Self = StObject.set(x, "blockScroll", value.asInstanceOf[js.Any])
      
      inline def setBlockScrollUndefined: Self = StObject.set(x, "blockScroll", js.undefined)
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setCloseOnEscape(value: Boolean): Self = StObject.set(x, "closeOnEscape", value.asInstanceOf[js.Any])
      
      inline def setCloseOnEscapeUndefined: Self = StObject.set(x, "closeOnEscape", js.undefined)
      
      inline def setDismissable(value: Boolean): Self = StObject.set(x, "dismissable", value.asInstanceOf[js.Any])
      
      inline def setDismissableUndefined: Self = StObject.set(x, "dismissable", js.undefined)
      
      inline def setFullScreen(value: Boolean): Self = StObject.set(x, "fullScreen", value.asInstanceOf[js.Any])
      
      inline def setFullScreenUndefined: Self = StObject.set(x, "fullScreen", js.undefined)
      
      inline def setIcons(value: /* props */ js.Object => js.Any): Self = StObject.set(x, "icons", js.Any.fromFunction1(value))
      
      inline def setIconsUndefined: Self = StObject.set(x, "icons", js.undefined)
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      inline def setModal(value: Boolean): Self = StObject.set(x, "modal", value.asInstanceOf[js.Any])
      
      inline def setModalUndefined: Self = StObject.set(x, "modal", js.undefined)
      
      inline def setOnHide(value: () => Unit): Self = StObject.set(x, "onHide", js.Any.fromFunction0(value))
      
      inline def setOnShow(value: () => Unit): Self = StObject.set(x, "onShow", js.Any.fromFunction0(value))
      
      inline def setOnShowUndefined: Self = StObject.set(x, "onShow", js.undefined)
      
      inline def setPosition(value: String): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
      
      inline def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
      
      inline def setShowCloseIcon(value: Boolean): Self = StObject.set(x, "showCloseIcon", value.asInstanceOf[js.Any])
      
      inline def setShowCloseIconUndefined: Self = StObject.set(x, "showCloseIcon", js.undefined)
      
      inline def setStyle(value: js.Object): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      inline def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
      
      inline def setVisibleUndefined: Self = StObject.set(x, "visible", js.undefined)
    }
  }
}
