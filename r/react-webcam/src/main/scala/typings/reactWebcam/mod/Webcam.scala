package typings.reactWebcam.mod

import typings.react.mod.Component
import typings.std.HTMLCanvasElement
import typings.std.HTMLVideoElement
import typings.std.MediaStream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Webcam
  extends Component[WebcamProps, WebcamState, js.Any] {
  var canvas: js.Any = js.native
  var ctx: js.Any = js.native
  var handleUserMedia: js.Any = js.native
  var requestUserMedia: js.Any = js.native
  var stream: MediaStream | Null = js.native
  var video: HTMLVideoElement | Null = js.native
  @JSName("componentDidMount")
  def componentDidMount_MWebcam(): Unit = js.native
  @JSName("componentDidUpdate")
  def componentDidUpdate_MWebcam(nextProps: js.Any): Unit = js.native
  @JSName("componentWillUnmount")
  def componentWillUnmount_MWebcam(): Unit = js.native
  def getCanvas(): HTMLCanvasElement | Null = js.native
  def getScreenshot(): String | Null = js.native
}

