package typings.semanticDashUiDashSticky

import typings.semanticDashUiDashSticky.SemanticUI.Sticky
import typings.semanticDashUiDashSticky.SemanticUI.StickySettings
import typings.semanticDashUiDashSticky.semanticDashUiDashStickyStrings.destroy
import typings.semanticDashUiDashSticky.semanticDashUiDashStickyStrings.refresh
import typings.semanticDashUiDashSticky.semanticDashUiDashStickyStrings.setting
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait JQuery extends js.Object {
  @JSName("sticky")
  var sticky_Original: Sticky = js.native
  def sticky(): JQuery = js.native
  def sticky(settings: StickySettings): JQuery = js.native
  @JSName("sticky")
  def sticky_destroy(behavior: destroy): JQuery = js.native
  /**
    * recalculates offsets
    */
  @JSName("sticky")
  def sticky_refresh(behavior: refresh): JQuery = js.native
  @JSName("sticky")
  def sticky_setting(behavior: setting, value: StickySettings): JQuery = js.native
  @JSName("sticky")
  def sticky_setting[K /* <: String */](behavior: setting, name: K): /* import warning: ImportType.apply Failed type conversion: semantic-ui-sticky.SemanticUI.StickySettings._Impl[K] */ js.Any = js.native
  @JSName("sticky")
  def sticky_setting[K /* <: String */](
    behavior: setting,
    name: K,
    value: /* import warning: ImportType.apply Failed type conversion: semantic-ui-sticky.SemanticUI.StickySettings._Impl[K] */ js.Any
  ): JQuery = js.native
}

