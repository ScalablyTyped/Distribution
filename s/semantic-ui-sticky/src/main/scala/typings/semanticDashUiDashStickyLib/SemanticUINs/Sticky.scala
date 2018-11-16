package typings
package semanticDashUiDashStickyLib.SemanticUINs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Sticky extends js.Object {
  var settings: StickySettings = js.native
  def apply(): semanticDashUiDashStickyLib.JQuery = js.native
  def apply(behavior: semanticDashUiDashStickyLib.semanticDashUiDashStickyLibStrings.destroy): semanticDashUiDashStickyLib.JQuery = js.native
  /**
           * recalculates offsets
           */
  def apply(behavior: semanticDashUiDashStickyLib.semanticDashUiDashStickyLibStrings.refresh): semanticDashUiDashStickyLib.JQuery = js.native
  def apply(
    behavior: semanticDashUiDashStickyLib.semanticDashUiDashStickyLibStrings.setting,
    value: StickySettings
  ): semanticDashUiDashStickyLib.JQuery = js.native
  def apply(settings: StickySettings): semanticDashUiDashStickyLib.JQuery = js.native
  def apply[K /* <: java.lang.String */](behavior: semanticDashUiDashStickyLib.semanticDashUiDashStickyLibStrings.setting, name: K): js.Any = js.native
  def apply[K /* <: java.lang.String */](
    behavior: semanticDashUiDashStickyLib.semanticDashUiDashStickyLibStrings.setting,
    name: K,
    value: js.Any
  ): semanticDashUiDashStickyLib.JQuery = js.native
}

