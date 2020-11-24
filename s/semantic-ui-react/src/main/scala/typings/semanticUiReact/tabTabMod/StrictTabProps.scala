package typings.semanticUiReact.tabTabMod

import typings.react.mod.MouseEvent
import typings.react.mod.NativeMouseEvent
import typings.semanticUiReact.anon.MenuItem
import typings.semanticUiReact.semanticUiReactStrings.left
import typings.semanticUiReact.semanticUiReactStrings.right
import typings.std.HTMLDivElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StrictTabProps extends js.Object {
  
  /** Index of the currently active tab. */
  var activeIndex: js.UndefOr[Double | String] = js.native
  
  /** An element type to render as (string or function). */
  var as: js.UndefOr[js.Any] = js.native
  
  /** The initial activeIndex. */
  var defaultActiveIndex: js.UndefOr[Double | String] = js.native
  
  /** Shorthand props for the Grid. */
  var grid: js.UndefOr[js.Any] = js.native
  
  /** Shorthand props for the Menu. */
  var menu: js.UndefOr[js.Any] = js.native
  
  /** Align vertical menu */
  var menuPosition: js.UndefOr[left | right] = js.native
  
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
  ] = js.native
  
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
  var panes: js.UndefOr[js.Array[MenuItem]] = js.native
  
  /** A Tab can render only active pane. */
  var renderActiveOnly: js.UndefOr[Boolean] = js.native
}
object StrictTabProps {
  
  @scala.inline
  def apply(): StrictTabProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StrictTabProps]
  }
  
  @scala.inline
  implicit class StrictTabPropsOps[Self <: StrictTabProps] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setActiveIndex(value: Double | String): Self = this.set("activeIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteActiveIndex: Self = this.set("activeIndex", js.undefined)
    
    @scala.inline
    def setAs(value: js.Any): Self = this.set("as", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAs: Self = this.set("as", js.undefined)
    
    @scala.inline
    def setDefaultActiveIndex(value: Double | String): Self = this.set("defaultActiveIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDefaultActiveIndex: Self = this.set("defaultActiveIndex", js.undefined)
    
    @scala.inline
    def setGrid(value: js.Any): Self = this.set("grid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGrid: Self = this.set("grid", js.undefined)
    
    @scala.inline
    def setMenu(value: js.Any): Self = this.set("menu", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMenu: Self = this.set("menu", js.undefined)
    
    @scala.inline
    def setMenuPosition(value: left | right): Self = this.set("menuPosition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMenuPosition: Self = this.set("menuPosition", js.undefined)
    
    @scala.inline
    def setOnTabChange(value: (/* event */ MouseEvent[HTMLDivElement, NativeMouseEvent], /* data */ TabProps) => Unit): Self = this.set("onTabChange", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteOnTabChange: Self = this.set("onTabChange", js.undefined)
    
    @scala.inline
    def setPanesVarargs(value: MenuItem*): Self = this.set("panes", js.Array(value :_*))
    
    @scala.inline
    def setPanes(value: js.Array[MenuItem]): Self = this.set("panes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePanes: Self = this.set("panes", js.undefined)
    
    @scala.inline
    def setRenderActiveOnly(value: Boolean): Self = this.set("renderActiveOnly", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRenderActiveOnly: Self = this.set("renderActiveOnly", js.undefined)
  }
}
