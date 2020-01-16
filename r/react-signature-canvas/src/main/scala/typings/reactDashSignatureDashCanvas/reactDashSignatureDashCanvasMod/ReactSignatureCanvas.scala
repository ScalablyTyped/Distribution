package typings.reactDashSignatureDashCanvas.reactDashSignatureDashCanvasMod

import typings.react.reactMod.Component
import typings.reactDashSignatureDashCanvas.Fn_DataUrl
import typings.reactDashSignatureDashCanvas.Fn_EncoderOptions
import typings.signatureUnderscorePad.signatureUnderscorePadMod.SignaturePad.Point
import typings.std.HTMLCanvasElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReactSignatureCanvas
  extends Component[ReactSignatureCanvasProps, js.Object, js.Any] {
  var clear: js.Function0[Unit] = js.native
  var fromData: js.Function1[/* pointGroups */ js.Array[js.Array[Point]], Unit] = js.native
  var fromDataURL: Fn_DataUrl = js.native
  var isEmpty: js.Function0[Boolean] = js.native
  var off: js.Function0[Unit] = js.native
  var on: js.Function0[Unit] = js.native
  var toData: js.Function0[js.Array[js.Array[Point]]] = js.native
  var toDataURL: Fn_EncoderOptions = js.native
  def getCanvas(): HTMLCanvasElement = js.native
  def getSignaturePad(): typings.signatureUnderscorePad.signatureUnderscorePadMod.default = js.native
  def getTrimmedCanvas(): HTMLCanvasElement = js.native
}

