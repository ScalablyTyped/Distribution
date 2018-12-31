package typings
package qrcodeLib.qrcodeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait QRCodeToDataURLOptions extends QRCodeRenderersOptions {
  var rendererOpts: js.UndefOr[qrcodeLib.Anon_Quality] = js.undefined
  /**
    * Data URI format.
    * Default: image/png
    */
  var `type`: js.UndefOr[
    qrcodeLib.qrcodeLibStrings.`image/png` | qrcodeLib.qrcodeLibStrings.`image/jpeg` | qrcodeLib.qrcodeLibStrings.`image/webp`
  ] = js.undefined
}

