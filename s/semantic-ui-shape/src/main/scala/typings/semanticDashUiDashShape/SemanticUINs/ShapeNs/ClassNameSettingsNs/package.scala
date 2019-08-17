package typings.semanticDashUiDashShape.SemanticUINs.ShapeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object ClassNameSettingsNs {
  import typings.semanticDashUiDashShape.semanticDashUiDashShapeStrings.active
  import typings.semanticDashUiDashShape.semanticDashUiDashShapeStrings.animating
  import typings.semanticDashUiDashShape.semanticDashUiDashShapeStrings.hidden
  import typings.semanticDashUiDashShape.semanticDashUiDashShapeStrings.loading
  import typings.std.Partial
  import typings.std.Pick

  type Param = (Pick[_Impl, animating | hidden | loading | active]) with (Partial[Pick[_Impl, animating | hidden | loading | active]])
}
