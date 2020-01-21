package typings.semanticUiSidebar.SemanticUI

import typings.semanticUiSidebar.JQuery
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
trait Sidebar_ extends js.Object {
  var settings: SidebarSettings = js.native
  def apply(): JQuery = js.native
  /**
    * Adds stylesheet to page head to trigger sidebar animations
    */
  def apply(behavior: `add body CSS`): JQuery = js.native
  /**
    * Attaches sidebar action to given selector. Default event if none specified is toggle
    */
  def apply(behavior: `attach events`, selector: String): JQuery = js.native
  def apply(behavior: `attach events`, selector: String, event: String): JQuery = js.native
  def apply(behavior: `attach events`, selector: JQuery): JQuery = js.native
  def apply(behavior: `attach events`, selector: JQuery, event: String): JQuery = js.native
  /**
    * Returns direction of current sidebar
    */
  def apply(behavior: `get direction`): String = js.native
  /**
    * Returns vendor prefixed transition end event
    */
  def apply(behavior: `get transition event`): String = js.native
  /**
    * Returns whether sidebar is hidden
    */
  def apply(behavior: `is hidden`): Boolean = js.native
  /**
    * Returns whether sidebar is visible
    */
  def apply(behavior: `is visible`): Boolean = js.native
  /**
    * Returns page content to original position
    */
  def apply(behavior: `pull page`): JQuery = js.native
  /**
    * Pushes page content to be visible alongside sidebar
    */
  def apply(behavior: `push page`): JQuery = js.native
  /**
    * Removes any inline stylesheets for sidebar animation
    */
  def apply(behavior: `remove body CSS`): JQuery = js.native
  def apply(behavior: destroy): JQuery = js.native
  /**
    * Hides sidebar
    */
  def apply(behavior: hide): JQuery = js.native
  def apply(behavior: setting, value: SidebarSettings): JQuery = js.native
  /**
    * Shows sidebar
    */
  def apply(behavior: show): JQuery = js.native
  /**
    * Toggles visibility of sidebar
    */
  def apply(behavior: toggle): JQuery = js.native
  def apply(settings: SidebarSettings): JQuery = js.native
  def apply[K /* <: String */](behavior: setting, name: K): /* import warning: importer.ImportType#apply Failed type conversion: semantic-ui-sidebar.SemanticUI.SidebarSettings._Impl[K] */ js.Any = js.native
  def apply[K /* <: String */](
    behavior: setting,
    name: K,
    value: /* import warning: importer.ImportType#apply Failed type conversion: semantic-ui-sidebar.SemanticUI.SidebarSettings._Impl[K] */ js.Any
  ): JQuery = js.native
}

