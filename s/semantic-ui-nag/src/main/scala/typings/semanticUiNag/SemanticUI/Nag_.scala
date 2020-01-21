package typings.semanticUiNag.SemanticUI

import typings.semanticUiNag.JQuery
import typings.semanticUiNag.semanticUiNagStrings.clear
import typings.semanticUiNag.semanticUiNagStrings.destroy
import typings.semanticUiNag.semanticUiNagStrings.hide
import typings.semanticUiNag.semanticUiNagStrings.setting
import typings.semanticUiNag.semanticUiNagStrings.show
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
  def apply[K /* <: String */](behavior: setting, name: K): /* import warning: importer.ImportType#apply Failed type conversion: semantic-ui-nag.SemanticUI.NagSettings._Impl[K] */ js.Any = js.native
  def apply[K /* <: String */](
    behavior: setting,
    name: K,
    value: /* import warning: importer.ImportType#apply Failed type conversion: semantic-ui-nag.SemanticUI.NagSettings._Impl[K] */ js.Any
  ): JQuery = js.native
}

