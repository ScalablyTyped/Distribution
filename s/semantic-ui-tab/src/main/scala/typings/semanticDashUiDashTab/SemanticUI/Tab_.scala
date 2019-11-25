package typings.semanticDashUiDashTab.SemanticUI

import typings.semanticDashUiDashTab.JQuery
import typings.semanticDashUiDashTab.semanticDashUiDashTabNumbers.`false`
import typings.semanticDashUiDashTab.semanticDashUiDashTabStrings.`cache add`
import typings.semanticDashUiDashTab.semanticDashUiDashTabStrings.`cache read`
import typings.semanticDashUiDashTab.semanticDashUiDashTabStrings.`cache remove`
import typings.semanticDashUiDashTab.semanticDashUiDashTabStrings.`change tab`
import typings.semanticDashUiDashTab.semanticDashUiDashTabStrings.`get path`
import typings.semanticDashUiDashTab.semanticDashUiDashTabStrings.`is tab`
import typings.semanticDashUiDashTab.semanticDashUiDashTabStrings.`set state`
import typings.semanticDashUiDashTab.semanticDashUiDashTabStrings.destroy
import typings.semanticDashUiDashTab.semanticDashUiDashTabStrings.setting
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSName("Tab")
@js.native
trait Tab_ extends js.Object {
  var settings: TabSettings = js.native
  def apply(): JQuery = js.native
  /**
    * Sets cached HTML for path
    */
  def apply(behavior: `cache add`, path: String, html: String): JQuery = js.native
  /**
    * Returns cached HTML for path
    */
  def apply(behavior: `cache read`, path: String): String | `false` = js.native
  /**
    * Removes cached HTML for path
    */
  def apply(behavior: `cache remove`, path: String): JQuery = js.native
  // Documentation says this exists but it does not.
  // /**
  //  * Attaches tab action to given selector. Default event if none specified is toggle
  //  */
  // (behavior: 'attach events', selector: Selector, event?: string): JQuery;
  /**
    * Changes tab to path
    */
  def apply(behavior: `change tab`, path: String): JQuery = js.native
  /**
    * Returns current path
    */
  def apply(behavior: `get path`): String = js.native
  /**
    * Returns whether tab exists
    */
  def apply(behavior: `is tab`): Boolean = js.native
  /**
    * Sets current path to state
    */
  def apply(behavior: `set state`, path: String): JQuery = js.native
  def apply(behavior: destroy): JQuery = js.native
  def apply(behavior: setting, value: TabSettings): JQuery = js.native
  def apply(settings: TabSettings): JQuery = js.native
  def apply[K /* <: String */](behavior: setting, name: K): /* import warning: importer.ImportType#apply Failed type conversion: semantic-ui-tab.SemanticUI.TabSettings._Impl[K] */ js.Any = js.native
  def apply[K /* <: String */](
    behavior: setting,
    name: K,
    value: /* import warning: importer.ImportType#apply Failed type conversion: semantic-ui-tab.SemanticUI.TabSettings._Impl[K] */ js.Any
  ): JQuery = js.native
}

