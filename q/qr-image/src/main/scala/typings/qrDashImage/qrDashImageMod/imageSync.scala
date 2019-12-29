package typings.qrDashImage.qrDashImageMod

import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("qr-image", "imageSync")
@js.native
object imageSync extends js.Object {
  def apply(text: String): String | Buffer = js.native
  def apply(text: String, level: ec_level): Buffer = js.native
  def apply(text: String, options: Options): String | Buffer = js.native
}

