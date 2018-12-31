package typings
package semanticDashUiDashSidebarLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait JQuery extends js.Object {
  @JSName("sidebar")
  var sidebar_Original: semanticDashUiDashSidebarLib.SemanticUINs.Sidebar = js.native
  def sidebar(): JQuery = js.native
  def sidebar(settings: semanticDashUiDashSidebarLib.SemanticUINs.SidebarSettings): JQuery = js.native
  /**
    * Adds stylesheet to page head to trigger sidebar animations
    */
  @JSName("sidebar")
  def `sidebar_add body CSS`(behavior: semanticDashUiDashSidebarLib.semanticDashUiDashSidebarLibStrings.`add body CSS`): JQuery = js.native
  /**
    * Attaches sidebar action to given selector. Default event if none specified is toggle
    */
  @JSName("sidebar")
  def `sidebar_attach events`(
    behavior: semanticDashUiDashSidebarLib.semanticDashUiDashSidebarLibStrings.`attach events`,
    selector: java.lang.String
  ): JQuery = js.native
  @JSName("sidebar")
  def `sidebar_attach events`(
    behavior: semanticDashUiDashSidebarLib.semanticDashUiDashSidebarLibStrings.`attach events`,
    selector: java.lang.String,
    event: java.lang.String
  ): JQuery = js.native
  @JSName("sidebar")
  def `sidebar_attach events`(
    behavior: semanticDashUiDashSidebarLib.semanticDashUiDashSidebarLibStrings.`attach events`,
    selector: JQuery
  ): JQuery = js.native
  @JSName("sidebar")
  def `sidebar_attach events`(
    behavior: semanticDashUiDashSidebarLib.semanticDashUiDashSidebarLibStrings.`attach events`,
    selector: JQuery,
    event: java.lang.String
  ): JQuery = js.native
  @JSName("sidebar")
  def sidebar_destroy(behavior: semanticDashUiDashSidebarLib.semanticDashUiDashSidebarLibStrings.destroy): JQuery = js.native
  /**
    * Returns direction of current sidebar
    */
  @JSName("sidebar")
  def `sidebar_get direction`(behavior: semanticDashUiDashSidebarLib.semanticDashUiDashSidebarLibStrings.`get direction`): java.lang.String = js.native
  /**
    * Returns vendor prefixed transition end event
    */
  @JSName("sidebar")
  def `sidebar_get transition event`(behavior: semanticDashUiDashSidebarLib.semanticDashUiDashSidebarLibStrings.`get transition event`): java.lang.String = js.native
  /**
    * Hides sidebar
    */
  @JSName("sidebar")
  def sidebar_hide(behavior: semanticDashUiDashSidebarLib.semanticDashUiDashSidebarLibStrings.hide): JQuery = js.native
  /**
    * Returns whether sidebar is hidden
    */
  @JSName("sidebar")
  def `sidebar_is hidden`(behavior: semanticDashUiDashSidebarLib.semanticDashUiDashSidebarLibStrings.`is hidden`): scala.Boolean = js.native
  /**
    * Returns whether sidebar is visible
    */
  @JSName("sidebar")
  def `sidebar_is visible`(behavior: semanticDashUiDashSidebarLib.semanticDashUiDashSidebarLibStrings.`is visible`): scala.Boolean = js.native
  /**
    * Returns page content to original position
    */
  @JSName("sidebar")
  def `sidebar_pull page`(behavior: semanticDashUiDashSidebarLib.semanticDashUiDashSidebarLibStrings.`pull page`): JQuery = js.native
  /**
    * Pushes page content to be visible alongside sidebar
    */
  @JSName("sidebar")
  def `sidebar_push page`(behavior: semanticDashUiDashSidebarLib.semanticDashUiDashSidebarLibStrings.`push page`): JQuery = js.native
  /**
    * Removes any inline stylesheets for sidebar animation
    */
  @JSName("sidebar")
  def `sidebar_remove body CSS`(behavior: semanticDashUiDashSidebarLib.semanticDashUiDashSidebarLibStrings.`remove body CSS`): JQuery = js.native
  @JSName("sidebar")
  def sidebar_setting(
    behavior: semanticDashUiDashSidebarLib.semanticDashUiDashSidebarLibStrings.setting,
    value: semanticDashUiDashSidebarLib.SemanticUINs.SidebarSettings
  ): JQuery = js.native
  @JSName("sidebar")
  def sidebar_setting[K /* <: java.lang.String */](behavior: semanticDashUiDashSidebarLib.semanticDashUiDashSidebarLibStrings.setting, name: K): /* import warning: ImportType.apply Failed type conversion: semantic-ui-sidebar.SemanticUI.SidebarSettings._Impl[K] */ js.Any = js.native
  @JSName("sidebar")
  def sidebar_setting[K /* <: java.lang.String */](
    behavior: semanticDashUiDashSidebarLib.semanticDashUiDashSidebarLibStrings.setting,
    name: K,
    value: /* import warning: ImportType.apply Failed type conversion: semantic-ui-sidebar.SemanticUI.SidebarSettings._Impl[K] */ js.Any
  ): JQuery = js.native
  /**
    * Shows sidebar
    */
  @JSName("sidebar")
  def sidebar_show(behavior: semanticDashUiDashSidebarLib.semanticDashUiDashSidebarLibStrings.show): JQuery = js.native
  /**
    * Toggles visibility of sidebar
    */
  @JSName("sidebar")
  def sidebar_toggle(behavior: semanticDashUiDashSidebarLib.semanticDashUiDashSidebarLibStrings.toggle): JQuery = js.native
}

