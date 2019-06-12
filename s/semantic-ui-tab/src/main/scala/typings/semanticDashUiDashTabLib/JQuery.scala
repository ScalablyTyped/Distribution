package typings
package semanticDashUiDashTabLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait JQuery extends js.Object {
  @JSName("tab")
  var tab_Original: semanticDashUiDashTabLib.SemanticUINs.Tab = js.native
  def tab(): JQuery = js.native
  def tab(settings: semanticDashUiDashTabLib.SemanticUINs.TabSettings): JQuery = js.native
  /**
    * Sets cached HTML for path
    */
  @JSName("tab")
  def tab_cacheadd(
    behavior: semanticDashUiDashTabLib.semanticDashUiDashTabLibStrings.`cache add`,
    path: java.lang.String,
    html: java.lang.String
  ): JQuery = js.native
  /**
    * Returns cached HTML for path
    */
  @JSName("tab")
  def tab_cacheread(
    behavior: semanticDashUiDashTabLib.semanticDashUiDashTabLibStrings.`cache read`,
    path: java.lang.String
  ): java.lang.String | semanticDashUiDashTabLib.semanticDashUiDashTabLibNumbers.`false` = js.native
  /**
    * Removes cached HTML for path
    */
  @JSName("tab")
  def tab_cacheremove(
    behavior: semanticDashUiDashTabLib.semanticDashUiDashTabLibStrings.`cache remove`,
    path: java.lang.String
  ): JQuery = js.native
  // Documentation says this exists but it does not.
  // /**
  //  * Attaches tab action to given selector. Default event if none specified is toggle
  //  */
  // (behavior: 'attach events', selector: Selector, event?: string): JQuery;
  /**
    * Changes tab to path
    */
  @JSName("tab")
  def tab_changetab(
    behavior: semanticDashUiDashTabLib.semanticDashUiDashTabLibStrings.`change tab`,
    path: java.lang.String
  ): JQuery = js.native
  @JSName("tab")
  def tab_destroy(behavior: semanticDashUiDashTabLib.semanticDashUiDashTabLibStrings.destroy): JQuery = js.native
  /**
    * Returns current path
    */
  @JSName("tab")
  def tab_getpath(behavior: semanticDashUiDashTabLib.semanticDashUiDashTabLibStrings.`get path`): java.lang.String = js.native
  /**
    * Returns whether tab exists
    */
  @JSName("tab")
  def tab_istab(behavior: semanticDashUiDashTabLib.semanticDashUiDashTabLibStrings.`is tab`): scala.Boolean = js.native
  /**
    * Sets current path to state
    */
  @JSName("tab")
  def tab_setstate(
    behavior: semanticDashUiDashTabLib.semanticDashUiDashTabLibStrings.`set state`,
    path: java.lang.String
  ): JQuery = js.native
  @JSName("tab")
  def tab_setting(
    behavior: semanticDashUiDashTabLib.semanticDashUiDashTabLibStrings.setting,
    value: semanticDashUiDashTabLib.SemanticUINs.TabSettings
  ): JQuery = js.native
  @JSName("tab")
  def tab_setting[K /* <: java.lang.String */](behavior: semanticDashUiDashTabLib.semanticDashUiDashTabLibStrings.setting, name: K): /* import warning: ImportType.apply Failed type conversion: semantic-ui-tab.SemanticUI.TabSettings._Impl[K] */ js.Any = js.native
  @JSName("tab")
  def tab_setting[K /* <: java.lang.String */](
    behavior: semanticDashUiDashTabLib.semanticDashUiDashTabLibStrings.setting,
    name: K,
    value: /* import warning: ImportType.apply Failed type conversion: semantic-ui-tab.SemanticUI.TabSettings._Impl[K] */ js.Any
  ): JQuery = js.native
}

