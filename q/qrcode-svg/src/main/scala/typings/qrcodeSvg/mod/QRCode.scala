package typings.qrcodeSvg.mod

import typings.qrcodeSvg.anon.Container
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait QRCode extends js.Object {
  /** The options that were used to create this QRCode. */
  var options: Options = js.native
  /** The raw model of this QRCode. */
  var qrcode: Model = js.native
  /**
    * Writes this QRCode to a file. Requires `fs`.
    * @param  file The filename to write to
    * @param  callback The callback that will be called, possibly with an error, when done.
    */
  def save(file: String, callback: js.Function1[/* error */ js.UndefOr[Error], Unit]): Unit = js.native
  /**
    * Generates an SVG image of this QRCode
    * @param  opt Set the container. Defaults to `{ container: "svg" }`.
    * @return The svg string.
    */
  def svg(): String = js.native
  def svg(opt: Container): String = js.native
}

