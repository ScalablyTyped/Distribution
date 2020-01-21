package typings.rcEditorCore.mod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EditorCore extends js.Object {
  var context: js.Any
  var props: js.Any
  var refs: js.Any
  var state: js.Any
  def forceUpdate(): js.Any
  def render(): js.Any
  def setState(): js.Any
}

@JSImport("rc-editor-core", "EditorCore")
@js.native
object EditorCore extends TopLevel[IEditor]

