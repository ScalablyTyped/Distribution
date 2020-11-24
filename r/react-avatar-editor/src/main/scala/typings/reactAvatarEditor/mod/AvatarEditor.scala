package typings.reactAvatarEditor.mod

import typings.react.mod.Component
import typings.std.HTMLCanvasElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AvatarEditor
  extends Component[AvatarEditorProps, js.Any, js.Any] {
  
  def getCroppingRect(): CroppedRect = js.native
  
  def getImage(): HTMLCanvasElement = js.native
  
  def getImageScaledToCanvas(): HTMLCanvasElement = js.native
}
