package typings.semanticDashUiDashSticky.SemanticUINs.StickyNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object ErrorSettingsNs {
  import typings.semanticDashUiDashSticky.semanticDashUiDashStickyStrings.container
  import typings.semanticDashUiDashSticky.semanticDashUiDashStickyStrings.elementSize
  import typings.semanticDashUiDashSticky.semanticDashUiDashStickyStrings.invalidContext
  import typings.semanticDashUiDashSticky.semanticDashUiDashStickyStrings.method
  import typings.semanticDashUiDashSticky.semanticDashUiDashStickyStrings.visible
  import typings.std.Partial
  import typings.std.Pick

  type Param = (Pick[_Impl, container | visible | method | invalidContext | elementSize]) with (Partial[Pick[_Impl, container | visible | method | invalidContext | elementSize]])
}
