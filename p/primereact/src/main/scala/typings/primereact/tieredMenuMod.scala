package typings.primereact

import typings.primereact.menuItemMod.MenuItem
import typings.react.mod.Component
import typings.react.mod.SyntheticEvent
import typings.std.Element
import typings.std.Event
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object tieredMenuMod {
  
  @JSImport("primereact/components/tieredmenu/TieredMenu", "TieredMenu")
  @js.native
  class TieredMenu protected ()
    extends Component[TieredMenuProps, js.Any, js.Any] {
    def this(props: TieredMenuProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: TieredMenuProps, context: js.Any) = this()
    
    def toggle(event: SyntheticEvent[Element, Event]): Unit = js.native
  }
  
  trait TieredMenuProps extends StObject {
    
    var appendTo: js.UndefOr[js.Any] = js.undefined
    
    var autoZIndex: js.UndefOr[Boolean] = js.undefined
    
    var bazeZIndex: js.UndefOr[Double] = js.undefined
    
    var className: js.UndefOr[String] = js.undefined
    
    var id: js.UndefOr[String] = js.undefined
    
    var model: js.UndefOr[js.Array[MenuItem]] = js.undefined
    
    var onHide: js.UndefOr[js.Function1[/* e */ Event, Unit]] = js.undefined
    
    var onShow: js.UndefOr[js.Function1[/* e */ Event, Unit]] = js.undefined
    
    var popup: js.UndefOr[Boolean] = js.undefined
    
    var style: js.UndefOr[js.Object] = js.undefined
  }
  object TieredMenuProps {
    
    @scala.inline
    def apply(): TieredMenuProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TieredMenuProps]
    }
    
    @scala.inline
    implicit class TieredMenuPropsMutableBuilder[Self <: TieredMenuProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAppendTo(value: js.Any): Self = StObject.set(x, "appendTo", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAppendToUndefined: Self = StObject.set(x, "appendTo", js.undefined)
      
      @scala.inline
      def setAutoZIndex(value: Boolean): Self = StObject.set(x, "autoZIndex", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAutoZIndexUndefined: Self = StObject.set(x, "autoZIndex", js.undefined)
      
      @scala.inline
      def setBazeZIndex(value: Double): Self = StObject.set(x, "bazeZIndex", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBazeZIndexUndefined: Self = StObject.set(x, "bazeZIndex", js.undefined)
      
      @scala.inline
      def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
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
    }
  }
}
