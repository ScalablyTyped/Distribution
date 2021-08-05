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
    class ReactDataGrid[T] ()
      extends typings.reactDataGrid.AdazzleReactDataGrid.ReactDataGrid[T]
    object ReactDataGrid {
      
      @JSGlobal("AdazzleReactDataGrid.ReactDataGrid.Cell")
      @js.native
      class Cell ()
        extends Component[js.Any, js.Object, js.Any]
      
      @JSGlobal("AdazzleReactDataGrid.ReactDataGrid.Row")
      @js.native
      class Row ()
        extends Component[js.Any, js.Object, js.Any]
      
      object editors {
        
        @JSGlobal("AdazzleReactDataGrid.ReactDataGrid.editors.EditorBase")
        @js.native
        class EditorBase[P, S] ()
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
      class DraggableContainer ()
        extends Component[js.Any, js.Object, js.Any]
    }
    
    object Editors {
      
      @JSGlobal("AdazzleReactDataGridPlugins.Editors.AutoComplete")
      @js.native
      class AutoComplete ()
        extends Component[AutoCompleteEditorProps, js.Object, js.Any]
      
      @JSGlobal("AdazzleReactDataGridPlugins.Editors.AutoCompleteTokensEditor")
      @js.native
      class AutoCompleteTokensEditor ()
        extends Component[AutoCompleteTokensEditorProps, js.Object, js.Any]
      
      @JSGlobal("AdazzleReactDataGridPlugins.Editors.CheckboxEditor")
      @js.native
      class CheckboxEditor ()
        extends Component[js.Any, js.Object, js.Any]
      
      @JSGlobal("AdazzleReactDataGridPlugins.Editors.DropDownEditor")
      @js.native
      class DropDownEditor ()
        extends Component[DropDownEditorProps, js.Object, js.Any]
      
      @JSGlobal("AdazzleReactDataGridPlugins.Editors.SimpleTextEditor")
      @js.native
      class SimpleTextEditor ()
        extends Component[js.Any, js.Object, js.Any]
    }
    
    object Filters {
      
      @JSGlobal("AdazzleReactDataGridPlugins.Filters.AutoCompleteFilter")
      @js.native
      class AutoCompleteFilter ()
        extends Component[js.Any, js.Object, js.Any]
      
      @JSGlobal("AdazzleReactDataGridPlugins.Filters.MultiSelectFilter")
      @js.native
      class MultiSelectFilter ()
        extends Component[js.Any, js.Object, js.Any]
      
      @JSGlobal("AdazzleReactDataGridPlugins.Filters.NumericFilter")
      @js.native
      class NumericFilter ()
        extends Component[js.Any, js.Object, js.Any]
      
      @JSGlobal("AdazzleReactDataGridPlugins.Filters.SingleSelectFilter")
      @js.native
      class SingleSelectFilter ()
        extends Component[js.Any, js.Object, js.Any]
    }
    
    object Formatters {
      
      @JSGlobal("AdazzleReactDataGridPlugins.Formatters.DropDownFormatter")
      @js.native
      class DropDownFormatter ()
        extends Component[js.Any, js.Object, js.Any]
      
      @JSGlobal("AdazzleReactDataGridPlugins.Formatters.ImageFormatter")
      @js.native
      class ImageFormatter ()
        extends Component[js.Any, js.Object, js.Any]
    }
    
    object Menu {
      
      @JSGlobal("AdazzleReactDataGridPlugins.Menu")
      @js.native
      val ^ : js.Any = js.native
      
      @JSGlobal("AdazzleReactDataGridPlugins.Menu.ContextMenu")
      @js.native
      class ContextMenu ()
        extends Component[js.Any, js.Object, js.Any]
      
      inline def ContextMenuLayer(identifier: js.Any): js.Function1[/* Component */ js.Any, js.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("ContextMenuLayer")(identifier.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* Component */ js.Any, js.Any]]
      inline def ContextMenuLayer(identifier: js.Any, configure: js.Function1[/* props */ js.Any, js.Any]): js.Function1[/* Component */ js.Any, js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("ContextMenuLayer")(identifier.asInstanceOf[js.Any], configure.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* Component */ js.Any, js.Any]]
      
      @JSGlobal("AdazzleReactDataGridPlugins.Menu.MenuHeader")
      @js.native
      class MenuHeader ()
        extends Component[js.Any, js.Object, js.Any]
      
      @JSGlobal("AdazzleReactDataGridPlugins.Menu.MenuItem")
      @js.native
      class MenuItem ()
        extends Component[js.Any, js.Object, js.Any]
      
      @JSGlobal("AdazzleReactDataGridPlugins.Menu.SubMenu")
      @js.native
      class SubMenu ()
        extends Component[js.Any, js.Object, js.Any]
      
      inline def connect(Menu: js.Any): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("connect")(Menu.asInstanceOf[js.Any]).asInstanceOf[js.Any]
      
      object monitor {
        
        @JSGlobal("AdazzleReactDataGridPlugins.Menu.monitor")
        @js.native
        val ^ : js.Any = js.native
        
        inline def getItem(): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("getItem")().asInstanceOf[js.Any]
        
        inline def getPosition(): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("getPosition")().asInstanceOf[js.Any]
        
        inline def hideMenu(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("hideMenu")().asInstanceOf[Unit]
      }
    }
    
    @JSGlobal("AdazzleReactDataGridPlugins.Toolbar")
    @js.native
    class Toolbar ()
      extends Component[js.Any, js.Object, js.Any]
  }
}
