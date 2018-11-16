package typings
package qrcodeLib.qrcodeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait QRCodeRenderersOptions extends QRCodeOptions {
  var color: js.UndefOr[qrcodeLib.Anon_Light] = js.undefined
  /**
       * Define how much wide the quiet zone should be.
       * Default: 4
       */
  var margin: js.UndefOr[scala.Double] = js.undefined
  /**
       * Scale factor. A value of 1 means 1px per modules (black dots).
       * Default: 4
       */
  var scale: js.UndefOr[scala.Double] = js.undefined
  /**
       * Forces a specific width for the output image.
       * If width is too small to contain the qr symbol, this option will be ignored.
       * Takes precedence over scale.
       */
  var width: js.UndefOr[scala.Double] = js.undefined
}

