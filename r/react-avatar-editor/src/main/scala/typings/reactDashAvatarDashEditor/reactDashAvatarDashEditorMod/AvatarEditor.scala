package typings.reactDashAvatarDashEditor.reactDashAvatarDashEditorMod

import typings.react.reactMod.Component
import typings.std.HTMLCanvasElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AvatarEditor
  extends Component[AvatarEditorProps, js.Any, js.Any] {
  def getCroppingRect(): CroppedRect = js.native
  def getImage(): HTMLCanvasElement = js.native
  def getImageScaledToCanvas(): HTMLCanvasElement = js.native
}

