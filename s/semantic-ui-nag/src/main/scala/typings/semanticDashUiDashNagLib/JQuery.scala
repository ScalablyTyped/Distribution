package typings
package semanticDashUiDashNagLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait JQuery extends js.Object {
  @JSName("nag")
  var nag_Original: semanticDashUiDashNagLib.SemanticUINs.Nag = js.native
  def nag(): JQuery = js.native
  def nag(settings: semanticDashUiDashNagLib.SemanticUINs.NagSettings): JQuery = js.native
  /**
    * Clears cookie so nag shows again
    */
  @JSName("nag")
  def nag_clear(behavior: semanticDashUiDashNagLib.semanticDashUiDashNagLibStrings.clear): JQuery = js.native
  @JSName("nag")
  def nag_destroy(behavior: semanticDashUiDashNagLib.semanticDashUiDashNagLibStrings.destroy): JQuery = js.native
  @JSName("nag")
  def nag_hide(behavior: semanticDashUiDashNagLib.semanticDashUiDashNagLibStrings.hide): JQuery = js.native
  @JSName("nag")
  def nag_setting(
    behavior: semanticDashUiDashNagLib.semanticDashUiDashNagLibStrings.setting,
    value: semanticDashUiDashNagLib.SemanticUINs.NagSettings
  ): JQuery = js.native
  @JSName("nag")
  def nag_setting[K /* <: java.lang.String */](behavior: semanticDashUiDashNagLib.semanticDashUiDashNagLibStrings.setting, name: K): /* import warning: ImportType.apply Failed type conversion: semantic-ui-nag.SemanticUI.NagSettings._Impl[K] */ js.Any = js.native
  @JSName("nag")
  def nag_setting[K /* <: java.lang.String */](
    behavior: semanticDashUiDashNagLib.semanticDashUiDashNagLibStrings.setting,
    name: K,
    value: /* import warning: ImportType.apply Failed type conversion: semantic-ui-nag.SemanticUI.NagSettings._Impl[K] */ js.Any
  ): JQuery = js.native
  @JSName("nag")
  def nag_show(behavior: semanticDashUiDashNagLib.semanticDashUiDashNagLibStrings.show): JQuery = js.native
}

