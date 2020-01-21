package typings.reactSignatureCanvas.mod

import typings.react.mod.Component
import typings.reactSignatureCanvas.FnDataUrl
import typings.reactSignatureCanvas.FnEncoderOptions
import typings.signaturePad.mod.SignaturePad.Point
import typings.std.HTMLCanvasElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReactSignatureCanvas
  extends Component[ReactSignatureCanvasProps, js.Object, js.Any] {
  var clear: js.Function0[Unit] = js.native
  var fromData: js.Function1[/* pointGroups */ js.Array[js.Array[Point]], Unit] = js.native
  var fromDataURL: FnDataUrl = js.native
  var isEmpty: js.Function0[Boolean] = js.native
  var off: js.Function0[Unit] = js.native
  var on: js.Function0[Unit] = js.native
  var toData: js.Function0[js.Array[js.Array[Point]]] = js.native
  var toDataURL: FnEncoderOptions = js.native
  def getCanvas(): HTMLCanvasElement = js.native
  def getSignaturePad(): typings.signaturePad.mod.default = js.native
  def getTrimmedCanvas(): HTMLCanvasElement = js.native
}

