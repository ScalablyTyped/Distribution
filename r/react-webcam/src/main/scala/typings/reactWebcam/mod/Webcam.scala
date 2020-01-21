package typings.reactWebcam.mod

import typings.react.mod.Component
import typings.react.mod.HTMLAttributes
import typings.std.CanvasRenderingContext2D
import typings.std.HTMLCanvasElement
import typings.std.HTMLVideoElement
import typings.std.MediaStream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Webcam
  extends Component[WebcamProps with HTMLAttributes[HTMLVideoElement], WebcamState, js.Any] {
  var canvas: HTMLCanvasElement = js.native
  var ctx: CanvasRenderingContext2D | Null = js.native
  var stream: MediaStream = js.native
  var video: HTMLVideoElement | Null = js.native
  @JSName("componentDidMount")
  def componentDidMount_MWebcam(): Unit = js.native
  @JSName("componentDidUpdate")
  def componentDidUpdate_MWebcam(nextProps: js.Any): Unit = js.native
  @JSName("componentWillUnmount")
  def componentWillUnmount_MWebcam(): Unit = js.native
  def getCanvas(): HTMLCanvasElement | Null = js.native
  def getScreenshot(): String | Null = js.native
  def handleUserMedia(err: js.Any): Unit = js.native
  def handleUserMedia(err: js.Any, stream: MediaStream): Unit = js.native
  def requestUserMedia(): Unit = js.native
}

