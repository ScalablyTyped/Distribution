package typings.semanticDashUiDashNag

import typings.semanticDashUiDashNag.SemanticUI.Nag
import typings.semanticDashUiDashNag.SemanticUI.NagSettings
import typings.semanticDashUiDashNag.semanticDashUiDashNagStrings.clear
import typings.semanticDashUiDashNag.semanticDashUiDashNagStrings.destroy
import typings.semanticDashUiDashNag.semanticDashUiDashNagStrings.hide
import typings.semanticDashUiDashNag.semanticDashUiDashNagStrings.setting
import typings.semanticDashUiDashNag.semanticDashUiDashNagStrings.show
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait JQuery extends js.Object {
  @JSName("nag")
  var nag_Original: Nag = js.native
  def nag(): JQuery = js.native
  def nag(settings: NagSettings): JQuery = js.native
  /**
    * Clears cookie so nag shows again
    */
  @JSName("nag")
  def nag_clear(behavior: clear): JQuery = js.native
  @JSName("nag")
  def nag_destroy(behavior: destroy): JQuery = js.native
  @JSName("nag")
  def nag_hide(behavior: hide): JQuery = js.native
  @JSName("nag")
  def nag_setting(behavior: setting, value: NagSettings): JQuery = js.native
  @JSName("nag")
  def nag_setting[K /* <: String */](behavior: setting, name: K): /* import warning: importer.ImportType#apply Failed type conversion: semantic-ui-nag.SemanticUI.NagSettings._Impl[K] */ js.Any = js.native
  @JSName("nag")
  def nag_setting[K /* <: String */](
    behavior: setting,
    name: K,
    value: /* import warning: importer.ImportType#apply Failed type conversion: semantic-ui-nag.SemanticUI.NagSettings._Impl[K] */ js.Any
  ): JQuery = js.native
  @JSName("nag")
  def nag_show(behavior: show): JQuery = js.native
}

