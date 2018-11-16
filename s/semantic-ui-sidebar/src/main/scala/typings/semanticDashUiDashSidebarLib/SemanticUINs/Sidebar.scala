package typings
package semanticDashUiDashSidebarLib.SemanticUINs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Sidebar extends js.Object {
  var settings: SidebarSettings = js.native
  def apply(): semanticDashUiDashSidebarLib.JQuery = js.native
  /**
           * Adds stylesheet to page head to trigger sidebar animations
           */
  def apply(behavior: semanticDashUiDashSidebarLib.semanticDashUiDashSidebarLibStrings.`add body CSS`): semanticDashUiDashSidebarLib.JQuery = js.native
  /**
           * Attaches sidebar action to given selector. Default event if none specified is toggle
           */
  def apply(
    behavior: semanticDashUiDashSidebarLib.semanticDashUiDashSidebarLibStrings.`attach events`,
    selector: java.lang.String
  ): semanticDashUiDashSidebarLib.JQuery = js.native
  /**
           * Attaches sidebar action to given selector. Default event if none specified is toggle
           */
  def apply(
    behavior: semanticDashUiDashSidebarLib.semanticDashUiDashSidebarLibStrings.`attach events`,
    selector: java.lang.String,
    event: java.lang.String
  ): semanticDashUiDashSidebarLib.JQuery = js.native
  /**
           * Attaches sidebar action to given selector. Default event if none specified is toggle
           */
  def apply(
    behavior: semanticDashUiDashSidebarLib.semanticDashUiDashSidebarLibStrings.`attach events`,
    selector: semanticDashUiDashSidebarLib.JQuery
  ): semanticDashUiDashSidebarLib.JQuery = js.native
  /**
           * Attaches sidebar action to given selector. Default event if none specified is toggle
           */
  def apply(
    behavior: semanticDashUiDashSidebarLib.semanticDashUiDashSidebarLibStrings.`attach events`,
    selector: semanticDashUiDashSidebarLib.JQuery,
    event: java.lang.String
  ): semanticDashUiDashSidebarLib.JQuery = js.native
  /**
           * Returns direction of current sidebar
           */
  def apply(behavior: semanticDashUiDashSidebarLib.semanticDashUiDashSidebarLibStrings.`get direction`): java.lang.String = js.native
  /**
           * Returns vendor prefixed transition end event
           */
  def apply(behavior: semanticDashUiDashSidebarLib.semanticDashUiDashSidebarLibStrings.`get transition event`): java.lang.String = js.native
  /**
           * Returns whether sidebar is hidden
           */
  def apply(behavior: semanticDashUiDashSidebarLib.semanticDashUiDashSidebarLibStrings.`is hidden`): scala.Boolean = js.native
  /**
           * Returns whether sidebar is visible
           */
  def apply(behavior: semanticDashUiDashSidebarLib.semanticDashUiDashSidebarLibStrings.`is visible`): scala.Boolean = js.native
  /**
           * Returns page content to original position
           */
  def apply(behavior: semanticDashUiDashSidebarLib.semanticDashUiDashSidebarLibStrings.`pull page`): semanticDashUiDashSidebarLib.JQuery = js.native
  /**
           * Pushes page content to be visible alongside sidebar
           */
  def apply(behavior: semanticDashUiDashSidebarLib.semanticDashUiDashSidebarLibStrings.`push page`): semanticDashUiDashSidebarLib.JQuery = js.native
  /**
           * Removes any inline stylesheets for sidebar animation
           */
  def apply(behavior: semanticDashUiDashSidebarLib.semanticDashUiDashSidebarLibStrings.`remove body CSS`): semanticDashUiDashSidebarLib.JQuery = js.native
  def apply(behavior: semanticDashUiDashSidebarLib.semanticDashUiDashSidebarLibStrings.destroy): semanticDashUiDashSidebarLib.JQuery = js.native
  /**
           * Hides sidebar
           */
  def apply(behavior: semanticDashUiDashSidebarLib.semanticDashUiDashSidebarLibStrings.hide): semanticDashUiDashSidebarLib.JQuery = js.native
  def apply(
    behavior: semanticDashUiDashSidebarLib.semanticDashUiDashSidebarLibStrings.setting,
    value: SidebarSettings
  ): semanticDashUiDashSidebarLib.JQuery = js.native
  /**
           * Shows sidebar
           */
  def apply(behavior: semanticDashUiDashSidebarLib.semanticDashUiDashSidebarLibStrings.show): semanticDashUiDashSidebarLib.JQuery = js.native
  /**
           * Toggles visibility of sidebar
           */
  def apply(behavior: semanticDashUiDashSidebarLib.semanticDashUiDashSidebarLibStrings.toggle): semanticDashUiDashSidebarLib.JQuery = js.native
  def apply(settings: SidebarSettings): semanticDashUiDashSidebarLib.JQuery = js.native
  def apply[K /* <: java.lang.String */](behavior: semanticDashUiDashSidebarLib.semanticDashUiDashSidebarLibStrings.setting, name: K): js.Any = js.native
  def apply[K /* <: java.lang.String */](
    behavior: semanticDashUiDashSidebarLib.semanticDashUiDashSidebarLibStrings.setting,
    name: K,
    value: js.Any
  ): semanticDashUiDashSidebarLib.JQuery = js.native
}

