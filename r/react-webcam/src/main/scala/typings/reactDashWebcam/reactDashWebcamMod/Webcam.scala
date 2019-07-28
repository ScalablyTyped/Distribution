package typings.reactDashWebcam.reactDashWebcamMod

import typings.react.reactMod.Component
import typings.std.Error
import typings.std.HTMLCanvasElement
import typings.std.MediaStream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Webcam
  extends Component[WebcamProps, WebcamState, js.Any] {
  def getCanvas(): HTMLCanvasElement | Null = js.native
  def getScreenshot(): String | Null = js.native
  def handleUserMedia(error: Error, stream: MediaStream): Unit = js.native
  def requestUserMedia(): Unit = js.native
}

