package typings.reactDataGrid

import typings.react.mod.Component
import typings.reactDataGrid.AdazzleReactDataGridPlugins.AutoCompleteEditorProps
import typings.reactDataGrid.AdazzleReactDataGridPlugins.AutoCompleteTokensEditorProps
import typings.reactDataGrid.AdazzleReactDataGridPlugins.DropDownEditorProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
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
      def apply(value: String): js.UndefOr[typings.reactDataGrid.AdazzleReactDataGrid.SCROLL_DIRECTION with String] = js.native
      
      /* "downwards" */ val DOWN: typings.reactDataGrid.AdazzleReactDataGrid.SCROLL_DIRECTION.DOWN with String = js.native
      
      /* "left" */ val LEFT: typings.reactDataGrid.AdazzleReactDataGrid.SCROLL_DIRECTION.LEFT with String = js.native
      
      /* "none" */ val NONE: typings.reactDataGrid.AdazzleReactDataGrid.SCROLL_DIRECTION.NONE with String = js.native
      
      /* "right" */ val RIGHT: typings.reactDataGrid.AdazzleReactDataGrid.SCROLL_DIRECTION.RIGHT with String = js.native
      
      /* "upwards" */ val UP: typings.reactDataGrid.AdazzleReactDataGrid.SCROLL_DIRECTION.UP with String = js.native
    }
  }
  
  object AdazzleReactDataGridPlugins {
    
    object Data {
      
      object Selectors {
        
        @JSGlobal("AdazzleReactDataGridPlugins.Data.Selectors.getRows")
        @js.native
        def getRows(state: js.Object): js.Array[js.Object] = js.native
        
        @JSGlobal("AdazzleReactDataGridPlugins.Data.Selectors.getSelectedRowsByKey")
        @js.native
        def getSelectedRowsByKey(state: js.Object): js.Array[js.Object] = js.native
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
      
      @JSGlobal("AdazzleReactDataGridPlugins.Menu.ContextMenu")
      @js.native
      class ContextMenu ()
        extends Component[js.Any, js.Object, js.Any]
      
      @JSGlobal("AdazzleReactDataGridPlugins.Menu.ContextMenuLayer")
      @js.native
      def ContextMenuLayer(identifier: js.Any): js.Function1[/* Component */ js.Any, _] = js.native
      @JSGlobal("AdazzleReactDataGridPlugins.Menu.ContextMenuLayer")
      @js.native
      def ContextMenuLayer(identifier: js.Any, configure: js.Function1[/* props */ js.Any, _]): js.Function1[/* Component */ js.Any, _] = js.native
      
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
      
      @JSGlobal("AdazzleReactDataGridPlugins.Menu.connect")
      @js.native
      def connect(Menu: js.Any): js.Any = js.native
      
      object monitor {
        
        @JSGlobal("AdazzleReactDataGridPlugins.Menu.monitor.getItem")
        @js.native
        def getItem(): js.Any = js.native
        
        @JSGlobal("AdazzleReactDataGridPlugins.Menu.monitor.getPosition")
        @js.native
        def getPosition(): js.Any = js.native
        
        @JSGlobal("AdazzleReactDataGridPlugins.Menu.monitor.hideMenu")
        @js.native
        def hideMenu(): Unit = js.native
      }
    }
    
    @JSGlobal("AdazzleReactDataGridPlugins.Toolbar")
    @js.native
    class Toolbar ()
      extends Component[js.Any, js.Object, js.Any]
  }
}
