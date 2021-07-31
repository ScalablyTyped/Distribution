package typings.primereact

import typings.primereact.menuItemMod.MenuItem
import typings.react.mod.Component
import typings.react.mod.SyntheticEvent
import typings.std.Element
import typings.std.Event
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object slideMenuMod {
  
  @JSImport("primereact/components/slidemenu/SlideMenu", "SlideMenu")
  @js.native
  class SlideMenu protected ()
    extends Component[SlideMenuProps, js.Any, js.Any] {
    def this(props: SlideMenuProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: SlideMenuProps, context: js.Any) = this()
    
    def hide(event: SyntheticEvent[Element, Event]): Unit = js.native
    
    def show(event: SyntheticEvent[Element, Event]): Unit = js.native
    
    def toggle(event: SyntheticEvent[Element, Event]): Unit = js.native
  }
  
  trait SlideMenuProps extends StObject {
    
    var appendTo: js.UndefOr[js.Any] = js.undefined
    
    var autoZIndex: js.UndefOr[Boolean] = js.undefined
    
    var backLabel: js.UndefOr[String] = js.undefined
    
    var baseZIndex: js.UndefOr[Double] = js.undefined
    
    var className: js.UndefOr[String] = js.undefined
    
    var easing: js.UndefOr[String] = js.undefined
    
    var effectDuration: js.UndefOr[Double] = js.undefined
    
    var id: js.UndefOr[String] = js.undefined
    
    var menuWidth: js.UndefOr[Double] = js.undefined
    
    var model: js.UndefOr[js.Array[MenuItem]] = js.undefined
    
    var onHide: js.UndefOr[js.Function1[/* e */ Event, Unit]] = js.undefined
    
    var onShow: js.UndefOr[js.Function1[/* e */ Event, Unit]] = js.undefined
    
    var popup: js.UndefOr[Boolean] = js.undefined
    
    var style: js.UndefOr[js.Object] = js.undefined
    
    var viewportHeight: js.UndefOr[Double] = js.undefined
  }
  object SlideMenuProps {
    
    @scala.inline
    def apply(): SlideMenuProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SlideMenuProps]
    }
    
    @scala.inline
    implicit class SlideMenuPropsMutableBuilder[Self <: SlideMenuProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAppendTo(value: js.Any): Self = StObject.set(x, "appendTo", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAppendToUndefined: Self = StObject.set(x, "appendTo", js.undefined)
      
      @scala.inline
      def setAutoZIndex(value: Boolean): Self = StObject.set(x, "autoZIndex", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAutoZIndexUndefined: Self = StObject.set(x, "autoZIndex", js.undefined)
      
      @scala.inline
      def setBackLabel(value: String): Self = StObject.set(x, "backLabel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBackLabelUndefined: Self = StObject.set(x, "backLabel", js.undefined)
      
      @scala.inline
      def setBaseZIndex(value: Double): Self = StObject.set(x, "baseZIndex", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBaseZIndexUndefined: Self = StObject.set(x, "baseZIndex", js.undefined)
      
      @scala.inline
      def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      @scala.inline
      def setEasing(value: String): Self = StObject.set(x, "easing", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEasingUndefined: Self = StObject.set(x, "easing", js.undefined)
      
      @scala.inline
      def setEffectDuration(value: Double): Self = StObject.set(x, "effectDuration", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEffectDurationUndefined: Self = StObject.set(x, "effectDuration", js.undefined)
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      @scala.inline
      def setMenuWidth(value: Double): Self = StObject.set(x, "menuWidth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMenuWidthUndefined: Self = StObject.set(x, "menuWidth", js.undefined)
      
      @scala.inline
      def setModel(value: js.Array[MenuItem]): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
      
      @scala.inline
      def setModelVarargs(value: MenuItem*): Self = StObject.set(x, "model", js.Array(value :_*))
      
      @scala.inline
      def setOnHide(value: /* e */ Event => Unit): Self = StObject.set(x, "onHide", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnHideUndefined: Self = StObject.set(x, "onHide", js.undefined)
      
      @scala.inline
      def setOnShow(value: /* e */ Event => Unit): Self = StObject.set(x, "onShow", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnShowUndefined: Self = StObject.set(x, "onShow", js.undefined)
      
      @scala.inline
      def setPopup(value: Boolean): Self = StObject.set(x, "popup", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPopupUndefined: Self = StObject.set(x, "popup", js.undefined)
      
      @scala.inline
      def setStyle(value: js.Object): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      @scala.inline
      def setViewportHeight(value: Double): Self = StObject.set(x, "viewportHeight", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setViewportHeightUndefined: Self = StObject.set(x, "viewportHeight", js.undefined)
    }
  }
}
