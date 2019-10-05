package typings.semanticDashUiDashShape.SemanticUI.Shape

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object ErrorSettings {
  import typings.semanticDashUiDashShape.semanticDashUiDashShapeStrings.method
  import typings.semanticDashUiDashShape.semanticDashUiDashShapeStrings.side
  import typings.std.Partial
  import typings.std.Pick

  type Param = (Pick[_Impl, side | method]) with (Partial[Pick[_Impl, side | method]])
}
