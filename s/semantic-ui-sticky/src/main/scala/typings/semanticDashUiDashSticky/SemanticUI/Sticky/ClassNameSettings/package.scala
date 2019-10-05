package typings.semanticDashUiDashSticky.SemanticUI.Sticky

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object ClassNameSettings {
  import typings.semanticDashUiDashSticky.semanticDashUiDashStickyStrings.bottom
  import typings.semanticDashUiDashSticky.semanticDashUiDashStickyStrings.bound
  import typings.semanticDashUiDashSticky.semanticDashUiDashStickyStrings.fixed
  import typings.semanticDashUiDashSticky.semanticDashUiDashStickyStrings.supported
  import typings.semanticDashUiDashSticky.semanticDashUiDashStickyStrings.top
  import typings.std.Partial
  import typings.std.Pick

  type Param = (Pick[_Impl, bound | fixed | supported | top | bottom]) with (Partial[Pick[_Impl, bound | fixed | supported | top | bottom]])
}
