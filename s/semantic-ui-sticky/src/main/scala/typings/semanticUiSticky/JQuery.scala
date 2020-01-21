package typings.semanticUiSticky

import typings.semanticUiSticky.SemanticUI.Sticky
import typings.semanticUiSticky.SemanticUI.StickySettings
import typings.semanticUiSticky.semanticUiStickyStrings.destroy
import typings.semanticUiSticky.semanticUiStickyStrings.refresh
import typings.semanticUiSticky.semanticUiStickyStrings.setting
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
  def sticky_setting[K /* <: String */](behavior: setting, name: K): /* import warning: importer.ImportType#apply Failed type conversion: semantic-ui-sticky.SemanticUI.StickySettings._Impl[K] */ js.Any = js.native
  @JSName("sticky")
  def sticky_setting[K /* <: String */](
    behavior: setting,
    name: K,
    value: /* import warning: importer.ImportType#apply Failed type conversion: semantic-ui-sticky.SemanticUI.StickySettings._Impl[K] */ js.Any
  ): JQuery = js.native
}

