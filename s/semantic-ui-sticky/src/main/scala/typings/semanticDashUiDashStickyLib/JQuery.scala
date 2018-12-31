package typings
package semanticDashUiDashStickyLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait JQuery extends js.Object {
  @JSName("sticky")
  var sticky_Original: semanticDashUiDashStickyLib.SemanticUINs.Sticky = js.native
  def sticky(): JQuery = js.native
  def sticky(settings: semanticDashUiDashStickyLib.SemanticUINs.StickySettings): JQuery = js.native
  @JSName("sticky")
  def sticky_destroy(behavior: semanticDashUiDashStickyLib.semanticDashUiDashStickyLibStrings.destroy): JQuery = js.native
  /**
    * recalculates offsets
    */
  @JSName("sticky")
  def sticky_refresh(behavior: semanticDashUiDashStickyLib.semanticDashUiDashStickyLibStrings.refresh): JQuery = js.native
  @JSName("sticky")
  def sticky_setting(
    behavior: semanticDashUiDashStickyLib.semanticDashUiDashStickyLibStrings.setting,
    value: semanticDashUiDashStickyLib.SemanticUINs.StickySettings
  ): JQuery = js.native
  @JSName("sticky")
  def sticky_setting[K /* <: java.lang.String */](behavior: semanticDashUiDashStickyLib.semanticDashUiDashStickyLibStrings.setting, name: K): /* import warning: ImportType.apply Failed type conversion: semantic-ui-sticky.SemanticUI.StickySettings._Impl[K] */ js.Any = js.native
  @JSName("sticky")
  def sticky_setting[K /* <: java.lang.String */](
    behavior: semanticDashUiDashStickyLib.semanticDashUiDashStickyLibStrings.setting,
    name: K,
    value: /* import warning: ImportType.apply Failed type conversion: semantic-ui-sticky.SemanticUI.StickySettings._Impl[K] */ js.Any
  ): JQuery = js.native
}

