package typings.reactDataGrid

import typings.react.mod.Component
import typings.reactDataGrid.AdazzleReactDataGridPlugins.AutoCompleteEditorProps
import typings.reactDataGrid.AdazzleReactDataGridPlugins.AutoCompleteTokensEditorProps
import typings.reactDataGrid.AdazzleReactDataGridPlugins.DropDownEditorProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  object AdazzleReactDataGrid {
    
    @JSGlobal("AdazzleReactDataGrid.ReactDataGrid")
    @js.native
    open class ReactDataGrid[T] ()
      extends typings.reactDataGrid.AdazzleReactDataGrid.ReactDataGrid[T]
    object ReactDataGrid {
      
      @JSGlobal("AdazzleReactDataGrid.ReactDataGrid.Cell")
      @js.native
      open class Cell ()
        extends Component[Any, js.Object, Any]
      
      @JSGlobal("AdazzleReactDataGrid.ReactDataGrid.Row")
      @js.native
      open class Row ()
        extends Component[Any, js.Object, Any]
      
      object editors {
        
        @JSGlobal("AdazzleReactDataGrid.ReactDataGrid.editors.EditorBase")
        @js.native
        open class EditorBase[P, S] ()
          extends typings.reactDataGrid.AdazzleReactDataGrid.ReactDataGrid.editors.EditorBase[P, S]
      }
    }
    
    @JSGlobal("AdazzleReactDataGrid.SCROLL_DIRECTION")
    @js.native
    object SCROLL_DIRECTION extends StObject {
      
      @JSBracketAccess
      def apply(value: String): js.UndefOr[typings.reactDataGrid.AdazzleReactDataGrid.SCROLL_DIRECTION & String] = js.native
      
      /* "downwards" */ val DOWN: typings.reactDataGrid.AdazzleReactDataGrid.SCROLL_DIRECTION.DOWN & String = js.native
      
      /* "left" */ val LEFT: typings.reactDataGrid.AdazzleReactDataGrid.SCROLL_DIRECTION.LEFT & String = js.native
      
      /* "none" */ val NONE: typings.reactDataGrid.AdazzleReactDataGrid.SCROLL_DIRECTION.NONE & String = js.native
      
      /* "right" */ val RIGHT: typings.reactDataGrid.AdazzleReactDataGrid.SCROLL_DIRECTION.RIGHT & String = js.native
      
      /* "upwards" */ val UP: typings.reactDataGrid.AdazzleReactDataGrid.SCROLL_DIRECTION.UP & String = js.native
    }
  }
  
  object AdazzleReactDataGridPlugins {
    
    object Data {
      
      object Selectors {
        
        @JSGlobal("AdazzleReactDataGridPlugins.Data.Selectors")
        @js.native
        val ^ : js.Any = js.native
        
        inline def getRows(state: js.Object): js.Array[js.Object] = ^.asInstanceOf[js.Dynamic].applyDynamic("getRows")(state.asInstanceOf[js.Any]).asInstanceOf[js.Array[js.Object]]
        
        inline def getSelectedRowsByKey(state: js.Object): js.Array[js.Object] = ^.asInstanceOf[js.Dynamic].applyDynamic("getSelectedRowsByKey")(state.asInstanceOf[js.Any]).asInstanceOf[js.Array[js.Object]]
      }
    }
    
    object DraggableHeader {
      
      @JSGlobal("AdazzleReactDataGridPlugins.DraggableHeader.DraggableContainer")
      @js.native
      open class DraggableContainer ()
        extends Component[Any, js.Object, Any]
    }
    
    object Editors {
      
      @JSGlobal("AdazzleReactDataGridPlugins.Editors.AutoComplete")
      @js.native
      open class AutoComplete ()
        extends Component[AutoCompleteEditorProps, js.Object, Any]
      
      @JSGlobal("AdazzleReactDataGridPlugins.Editors.AutoCompleteTokensEditor")
      @js.native
      open class AutoCompleteTokensEditor ()
        extends Component[AutoCompleteTokensEditorProps, js.Object, Any]
      
      @JSGlobal("AdazzleReactDataGridPlugins.Editors.CheckboxEditor")
      @js.native
      open class CheckboxEditor ()
        extends Component[Any, js.Object, Any]
      
      @JSGlobal("AdazzleReactDataGridPlugins.Editors.DropDownEditor")
      @js.native
      open class DropDownEditor ()
        extends Component[DropDownEditorProps, js.Object, Any]
      
      @JSGlobal("AdazzleReactDataGridPlugins.Editors.SimpleTextEditor")
      @js.native
      open class SimpleTextEditor ()
        extends Component[Any, js.Object, Any]
    }
    
    object Filters {
      
      @JSGlobal("AdazzleReactDataGridPlugins.Filters.AutoCompleteFilter")
      @js.native
      open class AutoCompleteFilter ()
        extends Component[Any, js.Object, Any]
      
      @JSGlobal("AdazzleReactDataGridPlugins.Filters.MultiSelectFilter")
      @js.native
      open class MultiSelectFilter ()
        extends Component[Any, js.Object, Any]
      
      @JSGlobal("AdazzleReactDataGridPlugins.Filters.NumericFilter")
      @js.native
      open class NumericFilter ()
        extends Component[Any, js.Object, Any]
      
      @JSGlobal("AdazzleReactDataGridPlugins.Filters.SingleSelectFilter")
      @js.native
      open class SingleSelectFilter ()
        extends Component[Any, js.Object, Any]
    }
    
    object Formatters {
      
      @JSGlobal("AdazzleReactDataGridPlugins.Formatters.DropDownFormatter")
      @js.native
      open class DropDownFormatter ()
        extends Component[Any, js.Object, Any]
      
      @JSGlobal("AdazzleReactDataGridPlugins.Formatters.ImageFormatter")
      @js.native
      open class ImageFormatter ()
        extends Component[Any, js.Object, Any]
    }
    
    object Menu {
      
      @JSGlobal("AdazzleReactDataGridPlugins.Menu")
      @js.native
      val ^ : js.Any = js.native
      
      @JSGlobal("AdazzleReactDataGridPlugins.Menu.ContextMenu")
      @js.native
      open class ContextMenu ()
        extends Component[Any, js.Object, Any]
      
      inline def ContextMenuLayer(identifier: Any): js.Function1[/* Component */ Any, Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("ContextMenuLayer")(identifier.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* Component */ Any, Any]]
      inline def ContextMenuLayer(identifier: Any, configure: js.Function1[/* props */ Any, Any]): js.Function1[/* Component */ Any, Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("ContextMenuLayer")(identifier.asInstanceOf[js.Any], configure.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* Component */ Any, Any]]
      
      @JSGlobal("AdazzleReactDataGridPlugins.Menu.MenuHeader")
      @js.native
      open class MenuHeader ()
        extends Component[Any, js.Object, Any]
      
      @JSGlobal("AdazzleReactDataGridPlugins.Menu.MenuItem")
      @js.native
      open class MenuItem ()
        extends Component[Any, js.Object, Any]
      
      @JSGlobal("AdazzleReactDataGridPlugins.Menu.SubMenu")
      @js.native
      open class SubMenu ()
        extends Component[Any, js.Object, Any]
      
      inline def connect(Menu: Any): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("connect")(Menu.asInstanceOf[js.Any]).asInstanceOf[Any]
      
      object monitor {
        
        @JSGlobal("AdazzleReactDataGridPlugins.Menu.monitor")
        @js.native
        val ^ : js.Any = js.native
        
        inline def getItem(): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("getItem")().asInstanceOf[Any]
        
        inline def getPosition(): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("getPosition")().asInstanceOf[Any]
        
        inline def hideMenu(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("hideMenu")().asInstanceOf[Unit]
      }
    }
    
    @JSGlobal("AdazzleReactDataGridPlugins.Toolbar")
    @js.native
    open class Toolbar ()
      extends Component[Any, js.Object, Any]
  }
}
