package typings.qrImage.mod

import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("qr-image", "imageSync")
@js.native
object imageSync extends js.Object {
  def apply(text: String): String | Buffer = js.native
  def apply(text: String, level: ecLevel): Buffer = js.native
  def apply(text: String, options: Options): String | Buffer = js.native
}

