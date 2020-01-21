package typings.qrcode.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait QRCode extends js.Object {
  /**
    * Error Correction Level
    */
  var errorCorrectionLevel: Double
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
  var version: Double
}

object QRCode {
  @scala.inline
  def apply(
    errorCorrectionLevel: Double,
    maskPattern: js.Any,
    modules: js.Any,
    segments: js.Array[QRCodeSegment],
    version: Double
  ): QRCode = {
    val __obj = js.Dynamic.literal(errorCorrectionLevel = errorCorrectionLevel.asInstanceOf[js.Any], maskPattern = maskPattern.asInstanceOf[js.Any], modules = modules.asInstanceOf[js.Any], segments = segments.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[QRCode]
  }
}

