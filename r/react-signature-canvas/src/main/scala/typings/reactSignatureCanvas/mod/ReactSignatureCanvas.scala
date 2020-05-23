package typings.reactSignatureCanvas.mod

import typings.react.mod.Component
import typings.reactSignatureCanvas.anon.FnCall
import typings.reactSignatureCanvas.anon.FnCallTypeEncoderOptions
import typings.signaturePad.mod.Point
import typings.signaturePad.mod.^
import typings.std.HTMLCanvasElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReactSignatureCanvas
  extends Component[ReactSignatureCanvasProps, js.Object, js.Any] {
  var clear: js.Function0[Unit] = js.native
  var fromData: js.Function1[/* pointGroups */ js.Array[js.Array[Point]], Unit] = js.native
  var fromDataURL: FnCall = js.native
  var isEmpty: js.Function0[Boolean] = js.native
  var off: js.Function0[Unit] = js.native
  var on: js.Function0[Unit] = js.native
  var toData: js.Function0[js.Array[js.Array[Point]]] = js.native
  var toDataURL: FnCallTypeEncoderOptions = js.native
  def getCanvas(): HTMLCanvasElement = js.native
  def getSignaturePad(): ^ = js.native
  def getTrimmedCanvas(): HTMLCanvasElement = js.native
}

