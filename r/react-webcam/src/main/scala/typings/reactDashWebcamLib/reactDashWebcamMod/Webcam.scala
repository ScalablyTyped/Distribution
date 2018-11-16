package typings
package reactDashWebcamLib.reactDashWebcamMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Webcam
  extends reactLib.reactMod.Component[
      reactDashWebcamLib.reactDashWebcamMod.WebcamNs.WebcamProps, 
      reactDashWebcamLib.reactDashWebcamMod.WebcamNs.WebcamState, 
      js.Any
    ] {
  def getCanvas(): reactLib.HTMLCanvasElement | scala.Null = js.native
  def getScreenshot(): java.lang.String | scala.Null = js.native
  def handleUserMedia(error: stdLib.Error, stream: stdLib.MediaStream): scala.Unit = js.native
  def requestUserMedia(): scala.Unit = js.native
}

