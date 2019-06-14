package typings
package reactDashNativeDashSignatureDashCaptureLib.reactDashNativeDashSignatureDashCaptureMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SignatureCapture
  extends reactLib.reactMod.Component[SignatureCaptureProps, js.Object, js.Any] {
  /**
    * When called it will clear the image on the canvas
    */
  def resetImage(): scala.Unit = js.native
  /**
    * When called it will save the image and returns the base 64 encoded string on onSaveEvent() callback
    */
  def saveImage(): scala.Unit = js.native
}

