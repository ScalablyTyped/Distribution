package typings
package qrDashImageLib.qrDashImageMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("qr-image", JSImport.Namespace)
@js.native
object qrDashImageModMembers extends js.Object {
  def image(text: java.lang.String): nodeLib.NodeJSNs.ReadableStream = js.native
  def image(text: java.lang.String, level: ec_level): nodeLib.NodeJSNs.ReadableStream = js.native
  def image(text: java.lang.String, options: Options): nodeLib.NodeJSNs.ReadableStream = js.native
  def imageSync(text: java.lang.String): java.lang.String | nodeLib.Buffer = js.native
  def imageSync(text: java.lang.String, level: ec_level): nodeLib.Buffer = js.native
  def imageSync(text: java.lang.String, options: Options): java.lang.String | nodeLib.Buffer = js.native
  @JSName("imageSync")
  def imageSync_Buffer(text: java.lang.String): nodeLib.Buffer = js.native
  def matrix(text: java.lang.String): js.Array[js.Array[_]] = js.native
  def matrix(text: java.lang.String, level: ec_level): js.Array[js.Array[_]] = js.native
  def svgObject(text: java.lang.String): js.Any = js.native
  def svgObject(text: java.lang.String, level: ec_level): js.Any = js.native
  def svgObject(text: java.lang.String, options: Options): js.Any = js.native
}

