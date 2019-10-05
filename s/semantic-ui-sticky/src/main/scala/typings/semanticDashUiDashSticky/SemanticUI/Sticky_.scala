package typings.semanticDashUiDashSticky.SemanticUI

import typings.semanticDashUiDashSticky.JQuery
import typings.semanticDashUiDashSticky.semanticDashUiDashStickyStrings.destroy
import typings.semanticDashUiDashSticky.semanticDashUiDashStickyStrings.refresh
import typings.semanticDashUiDashSticky.semanticDashUiDashStickyStrings.setting
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSName("Sticky")
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
  def apply[K /* <: String */](behavior: setting, name: K): /* import warning: ImportType.apply Failed type conversion: semantic-ui-sticky.SemanticUI.StickySettings._Impl[K] */ js.Any = js.native
  def apply[K /* <: String */](
    behavior: setting,
    name: K,
    value: /* import warning: ImportType.apply Failed type conversion: semantic-ui-sticky.SemanticUI.StickySettings._Impl[K] */ js.Any
  ): JQuery = js.native
}

