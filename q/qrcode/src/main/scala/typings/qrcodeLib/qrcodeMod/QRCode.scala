package typings
package qrcodeLib.qrcodeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait QRCode extends js.Object {
  /**
    * Error Correction Level
    */
  var errorCorrectionLevel: scala.Double
  /**
    * Calculated Mask pattern
    */
  var maskPattern: js.Any
  /**
    * Bitmatrix class with modules data
    */
  var modules: js.Any
  /**
    * Generated segments
    */
  var segments: js.Array[QRCodeSegment]
  /**
    * Calculated QR Code version
    */
  var version: scala.Double
}

object QRCode {
  @scala.inline
  def apply(
    errorCorrectionLevel: scala.Double,
    maskPattern: js.Any,
    modules: js.Any,
    segments: js.Array[QRCodeSegment],
    version: scala.Double
  ): QRCode = {
    val __obj = js.Dynamic.literal(errorCorrectionLevel = errorCorrectionLevel, maskPattern = maskPattern, modules = modules, segments = segments, version = version)
  
    __obj.asInstanceOf[QRCode]
  }
}

