package typings.semanticUiSticky.SemanticUI

import typings.semanticUiSticky.JQuery
import typings.semanticUiSticky.semanticUiStickyStrings.destroy
import typings.semanticUiSticky.semanticUiStickyStrings.refresh
import typings.semanticUiSticky.semanticUiStickyStrings.setting
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Sticky_ extends js.Object {
  var settings: StickySettings = js.native
  def apply(): JQuery = js.native
  def apply(behavior: destroy): JQuery = js.native
  /**
    * recalculates offsets
    */
  def apply(behavior: refresh): JQuery = js.native
  def apply(behavior: setting, value: StickySettings): JQuery = js.native
  def apply(settings: StickySettings): JQuery = js.native
  def apply[K /* <: String */](behavior: setting, name: K): /* import warning: importer.ImportType#apply Failed type conversion: semantic-ui-sticky.SemanticUI.StickySettings._Impl[K] */ js.Any = js.native
  def apply[K /* <: String */](
    behavior: setting,
    name: K,
    value: /* import warning: importer.ImportType#apply Failed type conversion: semantic-ui-sticky.SemanticUI.StickySettings._Impl[K] */ js.Any
  ): JQuery = js.native
}

