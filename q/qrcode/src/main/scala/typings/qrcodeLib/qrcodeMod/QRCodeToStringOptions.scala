package typings
package qrcodeLib.qrcodeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait QRCodeToStringOptions extends QRCodeRenderersOptions {
  /**
       * Output format.
       * Default: utf8
       */
  var `type`: js.UndefOr[
    qrcodeLib.qrcodeLibStrings.utf8 | qrcodeLib.qrcodeLibStrings.svg | qrcodeLib.qrcodeLibStrings.terminal
  ] = js.undefined
}

