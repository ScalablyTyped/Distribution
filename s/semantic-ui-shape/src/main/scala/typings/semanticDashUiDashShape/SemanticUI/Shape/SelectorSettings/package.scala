package typings.semanticDashUiDashShape.SemanticUI.Shape

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object SelectorSettings {
  import typings.semanticDashUiDashShape.semanticDashUiDashShapeStrings.side
  import typings.semanticDashUiDashShape.semanticDashUiDashShapeStrings.sides
  import typings.std.Partial
  import typings.std.Pick

  type Param = (Pick[_Impl, sides | side]) with (Partial[Pick[_Impl, sides | side]])
}
