package typings
package semanticDashUiDashTabLib.SemanticUINs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Tab extends js.Object {
  var settings: TabSettings = js.native
  def apply(): semanticDashUiDashTabLib.JQuery = js.native
  /**
    * Sets cached HTML for path
    */
  def apply(
    behavior: semanticDashUiDashTabLib.semanticDashUiDashTabLibStrings.`cache add`,
    path: java.lang.String,
    html: java.lang.String
  ): semanticDashUiDashTabLib.JQuery = js.native
  /**
    * Returns cached HTML for path
    */
  def apply(
    behavior: semanticDashUiDashTabLib.semanticDashUiDashTabLibStrings.`cache read`,
    path: java.lang.String
  ): java.lang.String | semanticDashUiDashTabLib.semanticDashUiDashTabLibNumbers.`false` = js.native
  /**
    * Removes cached HTML for path
    */
  def apply(
    behavior: semanticDashUiDashTabLib.semanticDashUiDashTabLibStrings.`cache remove`,
    path: java.lang.String
  ): semanticDashUiDashTabLib.JQuery = js.native
  // Documentation says this exists but it does not.
  // /**
  //  * Attaches tab action to given selector. Default event if none specified is toggle
  //  */
  // (behavior: 'attach events', selector: Selector, event?: string): JQuery;
  /**
    * Changes tab to path
    */
  def apply(
    behavior: semanticDashUiDashTabLib.semanticDashUiDashTabLibStrings.`change tab`,
    path: java.lang.String
  ): semanticDashUiDashTabLib.JQuery = js.native
  /**
    * Returns current path
    */
  def apply(behavior: semanticDashUiDashTabLib.semanticDashUiDashTabLibStrings.`get path`): java.lang.String = js.native
  /**
    * Returns whether tab exists
    */
  def apply(behavior: semanticDashUiDashTabLib.semanticDashUiDashTabLibStrings.`is tab`): scala.Boolean = js.native
  /**
    * Sets current path to state
    */
  def apply(
    behavior: semanticDashUiDashTabLib.semanticDashUiDashTabLibStrings.`set state`,
    path: java.lang.String
  ): semanticDashUiDashTabLib.JQuery = js.native
  def apply(behavior: semanticDashUiDashTabLib.semanticDashUiDashTabLibStrings.destroy): semanticDashUiDashTabLib.JQuery = js.native
  def apply(behavior: semanticDashUiDashTabLib.semanticDashUiDashTabLibStrings.setting, value: TabSettings): semanticDashUiDashTabLib.JQuery = js.native
  def apply(settings: TabSettings): semanticDashUiDashTabLib.JQuery = js.native
  def apply[K /* <: java.lang.String */](behavior: semanticDashUiDashTabLib.semanticDashUiDashTabLibStrings.setting, name: K): /* import warning: ImportType.apply Failed type conversion: semantic-ui-tab.SemanticUI.TabSettings._Impl[K] */ js.Any = js.native
  def apply[K /* <: java.lang.String */](
    behavior: semanticDashUiDashTabLib.semanticDashUiDashTabLibStrings.setting,
    name: K,
    value: /* import warning: ImportType.apply Failed type conversion: semantic-ui-tab.SemanticUI.TabSettings._Impl[K] */ js.Any
  ): semanticDashUiDashTabLib.JQuery = js.native
}

