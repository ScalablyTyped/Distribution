package typings.primereact

import typings.primereact.menuItemMod.MenuItem
import typings.react.mod.Component
import typings.react.mod.SyntheticEvent
import typings.std.Element
import typings.std.Event
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object contextMenuMod {
  
  @JSImport("primereact/components/contextmenu/ContextMenu", "ContextMenu")
  @js.native
  class ContextMenu protected ()
    extends Component[ContextMenuProps, js.Any, js.Any] {
    def this(props: ContextMenuProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: ContextMenuProps, context: js.Any) = this()
    
    def hide(event: SyntheticEvent[Element, Event]): Unit = js.native
    
    def show(event: SyntheticEvent[Element, Event]): Unit = js.native
  }
  
  trait ContextMenuProps extends StObject {
    
    var appendTo: js.UndefOr[js.Any] = js.undefined
    
    var autoZIndex: js.UndefOr[Boolean] = js.undefined
    
    var baseZIndex: js.UndefOr[Double] = js.undefined
    
    var className: js.UndefOr[String] = js.undefined
    
    var global: js.UndefOr[Boolean] = js.undefined
    
    var id: js.UndefOr[String] = js.undefined
    
    var model: js.UndefOr[js.Array[MenuItem]] = js.undefined
    
    var onHide: js.UndefOr[js.Function1[/* e */ Event, Unit]] = js.undefined
    
    var onShow: js.UndefOr[js.Function1[/* e */ Event, Unit]] = js.undefined
    
    var style: js.UndefOr[js.Object] = js.undefined
  }
  object ContextMenuProps {
    
    inline def apply(): ContextMenuProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ContextMenuProps]
    }
    
    extension [Self <: ContextMenuProps](x: Self) {
      
      inline def setAppendTo(value: js.Any): Self = StObject.set(x, "appendTo", value.asInstanceOf[js.Any])
      
      inline def setAppendToUndefined: Self = StObject.set(x, "appendTo", js.undefined)
      
      inline def setAutoZIndex(value: Boolean): Self = StObject.set(x, "autoZIndex", value.asInstanceOf[js.Any])
      
      inline def setAutoZIndexUndefined: Self = StObject.set(x, "autoZIndex", js.undefined)
      
      inline def setBaseZIndex(value: Double): Self = StObject.set(x, "baseZIndex", value.asInstanceOf[js.Any])
      
      inline def setBaseZIndexUndefined: Self = StObject.set(x, "baseZIndex", js.undefined)
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setGlobal(value: Boolean): Self = StObject.set(x, "global", value.asInstanceOf[js.Any])
      
      inline def setGlobalUndefined: Self = StObject.set(x, "global", js.undefined)
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      inline def setModel(value: js.Array[MenuItem]): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
      
      inline def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
      
      inline def setModelVarargs(value: MenuItem*): Self = StObject.set(x, "model", js.Array(value :_*))
      
      inline def setOnHide(value: /* e */ Event => Unit): Self = StObject.set(x, "onHide", js.Any.fromFunction1(value))
      
      inline def setOnHideUndefined: Self = StObject.set(x, "onHide", js.undefined)
      
      inline def setOnShow(value: /* e */ Event => Unit): Self = StObject.set(x, "onShow", js.Any.fromFunction1(value))
      
      inline def setOnShowUndefined: Self = StObject.set(x, "onShow", js.undefined)
      
      inline def setStyle(value: js.Object): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    }
  }
}
