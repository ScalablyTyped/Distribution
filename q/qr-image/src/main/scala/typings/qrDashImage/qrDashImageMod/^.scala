package typings.qrDashImage.qrDashImageMod

import typings.node.Buffer
import typings.node.NodeJSNs.ReadableStream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("qr-image", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def image(text: String): ReadableStream = js.native
  def image(text: String, level: ec_level): ReadableStream = js.native
  def image(text: String, options: Options): ReadableStream = js.native
  def imageSync(text: String): Buffer = js.native
  def imageSync(text: String, level: ec_level): Buffer = js.native
  def imageSync(text: String, options: Options): String | Buffer = js.native
  @JSName("imageSync")
  def imageSync_Union(text: String): String | Buffer = js.native
  def matrix(text: String): js.Array[js.Array[_]] = js.native
  def matrix(text: String, level: ec_level): js.Array[js.Array[_]] = js.native
  def svgObject(text: String): js.Any = js.native
  def svgObject(text: String, level: ec_level): js.Any = js.native
  def svgObject(text: String, options: Options): js.Any = js.native
}

