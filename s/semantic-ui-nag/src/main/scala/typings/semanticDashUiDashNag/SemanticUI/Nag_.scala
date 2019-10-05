package typings.semanticDashUiDashNag.SemanticUI

import typings.semanticDashUiDashNag.JQuery
import typings.semanticDashUiDashNag.semanticDashUiDashNagStrings.clear
import typings.semanticDashUiDashNag.semanticDashUiDashNagStrings.destroy
import typings.semanticDashUiDashNag.semanticDashUiDashNagStrings.hide
import typings.semanticDashUiDashNag.semanticDashUiDashNagStrings.setting
import typings.semanticDashUiDashNag.semanticDashUiDashNagStrings.show
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSName("Nag")
@js.native
trait Nag_ extends js.Object {
  var settings: NagSettings = js.native
  def apply(): JQuery = js.native
  /**
    * Clears cookie so nag shows again
    */
  def apply(behavior: clear): JQuery = js.native
  def apply(behavior: destroy): JQuery = js.native
  def apply(behavior: hide): JQuery = js.native
  def apply(behavior: setting, value: NagSettings): JQuery = js.native
  def apply(behavior: show): JQuery = js.native
  def apply(settings: NagSettings): JQuery = js.native
  def apply[K /* <: String */](behavior: setting, name: K): /* import warning: ImportType.apply Failed type conversion: semantic-ui-nag.SemanticUI.NagSettings._Impl[K] */ js.Any = js.native
  def apply[K /* <: String */](
    behavior: setting,
    name: K,
    value: /* import warning: ImportType.apply Failed type conversion: semantic-ui-nag.SemanticUI.NagSettings._Impl[K] */ js.Any
  ): JQuery = js.native
}

