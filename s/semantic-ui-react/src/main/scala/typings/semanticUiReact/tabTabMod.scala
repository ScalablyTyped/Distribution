package typings.semanticUiReact

import org.scalablytyped.runtime.Shortcut
import org.scalablytyped.runtime.StringDictionary
import typings.react.mod.Component
import typings.react.mod.ComponentClass
import typings.react.mod.ComponentState
import typings.react.mod.MouseEvent
import typings.react.mod.NativeMouseEvent
import typings.react.mod.StatelessComponent
import typings.semanticUiReact.anon.MenuItem
import typings.semanticUiReact.semanticUiReactStrings.left
import typings.semanticUiReact.semanticUiReactStrings.right
import typings.semanticUiReact.tabPaneMod.TabPaneProps
import typings.std.HTMLDivElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object tabTabMod extends Shortcut {
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("semantic-ui-react/dist/commonjs/modules/Tab/Tab", JSImport.Default)
  @js.native
  class default protected ()
    extends Component[TabProps, ComponentState, js.Any] {
    def this(props: TabProps) = this()
    def this(props: TabProps, context: js.Any) = this()
  }
  @JSImport("semantic-ui-react/dist/commonjs/modules/Tab/Tab", JSImport.Default)
  @js.native
  val default: TabComponent = js.native
  
  trait StrictTabProps extends StObject {
    
    /** Index of the currently active tab. */
    var activeIndex: js.UndefOr[Double | String] = js.undefined
    
    /** An element type to render as (string or function). */
    var as: js.UndefOr[js.Any] = js.undefined
    
    /** The initial activeIndex. */
    var defaultActiveIndex: js.UndefOr[Double | String] = js.undefined
    
    /** Shorthand props for the Grid. */
    var grid: js.UndefOr[js.Any] = js.undefined
    
    /** Shorthand props for the Menu. */
    var menu: js.UndefOr[js.Any] = js.undefined
    
    /** Align vertical menu */
    var menuPosition: js.UndefOr[left | right] = js.undefined
    
    /**
      * Called on tab change.
      *
      * @param {SyntheticEvent} event - React's original SyntheticEvent.
      * @param {object} data - The proposed new Tab.Pane.
      * @param {object} data.activeIndex - The new proposed activeIndex.
      * @param {object} data.panes - Props of the new proposed active pane.
      */
    var onTabChange: js.UndefOr[
        js.Function2[/* event */ MouseEvent[HTMLDivElement, NativeMouseEvent], /* data */ TabProps, Unit]
      ] = js.undefined
    
    /**
      * Array of objects describing each Menu.Item and Tab.Pane:
      * {
      *   menuItem: 'Home',
      *   render: () => <Tab.Pane>Welcome!</Tab.Pane>,
      * }
      * or
      * {
      *   menuItem: 'Home',
      *   pane: 'Welcome',
      * }
      */
    var panes: js.UndefOr[js.Array[MenuItem]] = js.undefined
    
    /** A Tab can render only active pane. */
    var renderActiveOnly: js.UndefOr[Boolean] = js.undefined
  }
  object StrictTabProps {
    
    @scala.inline
    def apply(): StrictTabProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[StrictTabProps]
    }
    
    @scala.inline
    implicit class StrictTabPropsMutableBuilder[Self <: StrictTabProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setActiveIndex(value: Double | String): Self = StObject.set(x, "activeIndex", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setActiveIndexUndefined: Self = StObject.set(x, "activeIndex", js.undefined)
      
      @scala.inline
      def setAs(value: js.Any): Self = StObject.set(x, "as", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAsUndefined: Self = StObject.set(x, "as", js.undefined)
      
      @scala.inline
      def setDefaultActiveIndex(value: Double | String): Self = StObject.set(x, "defaultActiveIndex", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefaultActiveIndexUndefined: Self = StObject.set(x, "defaultActiveIndex", js.undefined)
      
      @scala.inline
      def setGrid(value: js.Any): Self = StObject.set(x, "grid", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGridUndefined: Self = StObject.set(x, "grid", js.undefined)
      
      @scala.inline
      def setMenu(value: js.Any): Self = StObject.set(x, "menu", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMenuPosition(value: left | right): Self = StObject.set(x, "menuPosition", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMenuPositionUndefined: Self = StObject.set(x, "menuPosition", js.undefined)
      
      @scala.inline
      def setMenuUndefined: Self = StObject.set(x, "menu", js.undefined)
      
      @scala.inline
      def setOnTabChange(value: (/* event */ MouseEvent[HTMLDivElement, NativeMouseEvent], /* data */ TabProps) => Unit): Self = StObject.set(x, "onTabChange", js.Any.fromFunction2(value))
      
      @scala.inline
      def setOnTabChangeUndefined: Self = StObject.set(x, "onTabChange", js.undefined)
      
      @scala.inline
      def setPanes(value: js.Array[MenuItem]): Self = StObject.set(x, "panes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPanesUndefined: Self = StObject.set(x, "panes", js.undefined)
      
      @scala.inline
      def setPanesVarargs(value: MenuItem*): Self = StObject.set(x, "panes", js.Array(value :_*))
      
      @scala.inline
      def setRenderActiveOnly(value: Boolean): Self = StObject.set(x, "renderActiveOnly", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRenderActiveOnlyUndefined: Self = StObject.set(x, "renderActiveOnly", js.undefined)
    }
  }
  
  @js.native
  trait TabComponent
    extends StObject
       with ComponentClass[TabProps, ComponentState] {
    
    var Pane: StatelessComponent[TabPaneProps] = js.native
  }
  
  trait TabProps
    extends StObject
       with StrictTabProps
       with /* key */ StringDictionary[js.Any]
  object TabProps {
    
    @scala.inline
    def apply(): TabProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TabProps]
    }
  }
  
  type _To = TabComponent
  
  /* This means you don't have to write `default`, but can instead just say `tabTabMod.foo` */
  override def _to: TabComponent = default
}
