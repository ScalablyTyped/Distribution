package typings.reactNativeSignatureCapture.mod

import typings.react.mod.Component
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SignatureCapture
  extends Component[SignatureCaptureProps, js.Object, js.Any] {
  /**
    * When called it will clear the image on the canvas
    */
  def resetImage(): Unit = js.native
  /**
    * When called it will save the image and returns the base 64 encoded string on onSaveEvent() callback
    */
  def saveImage(): Unit = js.native
}

