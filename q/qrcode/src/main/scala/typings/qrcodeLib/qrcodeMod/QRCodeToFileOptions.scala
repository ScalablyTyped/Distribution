package typings
package qrcodeLib.qrcodeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait QRCodeToFileOptions extends QRCodeRenderersOptions {
  var rendererOpts: js.UndefOr[qrcodeLib.Anon_DeflateLevel] = js.undefined
  /**
    * Output format.
    * Default: png
    */
  var `type`: js.UndefOr[
    qrcodeLib.qrcodeLibStrings.png | qrcodeLib.qrcodeLibStrings.svg | qrcodeLib.qrcodeLibStrings.utf8
  ] = js.undefined
}

