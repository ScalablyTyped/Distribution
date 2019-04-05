package typings
package qrcodeDashSvgLib.qrcodeDashSvgMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait QRCode extends js.Object {
  /** The options that were used to create this QRCode. */
  var options: qrcodeDashSvgLib.qrcodeDashSvgMod.QRCodeNs.Options = js.native
  /** The raw model of this QRCode. */
  var qrcode: qrcodeDashSvgLib.qrcodeDashSvgMod.QRCodeNs.Model = js.native
  /**
    * Writes this QRCode to a file. Requires `fs`.
    * @param  file The filename to write to
    * @param  callback The callback that will be called, possibly with an error, when done.
    */
  def save(file: java.lang.String, callback: js.Function1[/* error */ js.UndefOr[stdLib.Error], scala.Unit]): scala.Unit = js.native
  /**
    * Generates an SVG image of this QRCode
    * @param  opt Set the container. Defaults to `{ container: "svg" }`.
    * @return The svg string.
    */
  def svg(): java.lang.String = js.native
  def svg(opt: qrcodeDashSvgLib.Anon_Container): java.lang.String = js.native
}

