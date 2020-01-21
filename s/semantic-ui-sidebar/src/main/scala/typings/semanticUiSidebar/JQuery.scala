package typings.semanticUiSidebar

import typings.semanticUiSidebar.SemanticUI.Sidebar
import typings.semanticUiSidebar.SemanticUI.SidebarSettings
import typings.semanticUiSidebar.semanticUiSidebarStrings.`add body CSS`
import typings.semanticUiSidebar.semanticUiSidebarStrings.`attach events`
import typings.semanticUiSidebar.semanticUiSidebarStrings.`get direction`
import typings.semanticUiSidebar.semanticUiSidebarStrings.`get transition event`
import typings.semanticUiSidebar.semanticUiSidebarStrings.`is hidden`
import typings.semanticUiSidebar.semanticUiSidebarStrings.`is visible`
import typings.semanticUiSidebar.semanticUiSidebarStrings.`pull page`
import typings.semanticUiSidebar.semanticUiSidebarStrings.`push page`
import typings.semanticUiSidebar.semanticUiSidebarStrings.`remove body CSS`
import typings.semanticUiSidebar.semanticUiSidebarStrings.destroy
import typings.semanticUiSidebar.semanticUiSidebarStrings.hide
import typings.semanticUiSidebar.semanticUiSidebarStrings.setting
import typings.semanticUiSidebar.semanticUiSidebarStrings.show
import typings.semanticUiSidebar.semanticUiSidebarStrings.toggle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait JQuery extends js.Object {
  @JSName("sidebar")
  var sidebar_Original: Sidebar = js.native
  def sidebar(): JQuery = js.native
  def sidebar(settings: SidebarSettings): JQuery = js.native
  /**
    * Adds stylesheet to page head to trigger sidebar animations
    */
  @JSName("sidebar")
  def sidebar_addbodyCSS(behavior: `add body CSS`): JQuery = js.native
  /**
    * Attaches sidebar action to given selector. Default event if none specified is toggle
    */
  @JSName("sidebar")
  def sidebar_attachevents(behavior: `attach events`, selector: String): JQuery = js.native
  @JSName("sidebar")
  def sidebar_attachevents(behavior: `attach events`, selector: String, event: String): JQuery = js.native
  @JSName("sidebar")
  def sidebar_attachevents(behavior: `attach events`, selector: JQuery): JQuery = js.native
  @JSName("sidebar")
  def sidebar_attachevents(behavior: `attach events`, selector: JQuery, event: String): JQuery = js.native
  @JSName("sidebar")
  def sidebar_destroy(behavior: destroy): JQuery = js.native
  /**
    * Returns direction of current sidebar
    */
  @JSName("sidebar")
  def sidebar_getdirection(behavior: `get direction`): String = js.native
  /**
    * Returns vendor prefixed transition end event
    */
  @JSName("sidebar")
  def sidebar_gettransitionevent(behavior: `get transition event`): String = js.native
  /**
    * Hides sidebar
    */
  @JSName("sidebar")
  def sidebar_hide(behavior: hide): JQuery = js.native
  /**
    * Returns whether sidebar is hidden
    */
  @JSName("sidebar")
  def sidebar_ishidden(behavior: `is hidden`): Boolean = js.native
  /**
    * Returns whether sidebar is visible
    */
  @JSName("sidebar")
  def sidebar_isvisible(behavior: `is visible`): Boolean = js.native
  /**
    * Returns page content to original position
    */
  @JSName("sidebar")
  def sidebar_pullpage(behavior: `pull page`): JQuery = js.native
  /**
    * Pushes page content to be visible alongside sidebar
    */
  @JSName("sidebar")
  def sidebar_pushpage(behavior: `push page`): JQuery = js.native
  /**
    * Removes any inline stylesheets for sidebar animation
    */
  @JSName("sidebar")
  def sidebar_removebodyCSS(behavior: `remove body CSS`): JQuery = js.native
  @JSName("sidebar")
  def sidebar_setting(behavior: setting, value: SidebarSettings): JQuery = js.native
  @JSName("sidebar")
  def sidebar_setting[K /* <: String */](behavior: setting, name: K): /* import warning: importer.ImportType#apply Failed type conversion: semantic-ui-sidebar.SemanticUI.SidebarSettings._Impl[K] */ js.Any = js.native
  @JSName("sidebar")
  def sidebar_setting[K /* <: String */](
    behavior: setting,
    name: K,
    value: /* import warning: importer.ImportType#apply Failed type conversion: semantic-ui-sidebar.SemanticUI.SidebarSettings._Impl[K] */ js.Any
  ): JQuery = js.native
  /**
    * Shows sidebar
    */
  @JSName("sidebar")
  def sidebar_show(behavior: show): JQuery = js.native
  /**
    * Toggles visibility of sidebar
    */
  @JSName("sidebar")
  def sidebar_toggle(behavior: toggle): JQuery = js.native
}

