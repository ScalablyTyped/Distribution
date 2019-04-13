package typings
package reactDashWebcamLib.reactDashWebcamMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Webcam
  extends reactLib.reactMod.Component[WebcamProps, WebcamState, js.Any] {
  def getCanvas(): stdLib.HTMLCanvasElement | scala.Null = js.native
  def getScreenshot(): java.lang.String | scala.Null = js.native
  def handleUserMedia(error: stdLib.Error, stream: stdLib.MediaStream): scala.Unit = js.native
  def requestUserMedia(): scala.Unit = js.native
}

