package typings
package reactDashAvatarDashEditorLib.reactDashAvatarDashEditorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AvatarEditor
  extends reactLib.reactMod.Component[AvatarEditorProps, js.Any, js.Any] {
  def getCroppingRect(): CroppedRect = js.native
  def getImage(): stdLib.HTMLCanvasElement = js.native
  def getImageScaledToCanvas(): stdLib.HTMLCanvasElement = js.native
}

