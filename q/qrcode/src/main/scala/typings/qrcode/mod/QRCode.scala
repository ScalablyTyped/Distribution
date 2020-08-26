package typings.qrcode.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait QRCode extends js.Object {
  /**
    * Error Correction Level
    */
  var errorCorrectionLevel: Double = js.native
  /**
    * Calculated Mask pattern
    */
  var maskPattern: js.Any = js.native
  /**
    * Bitmatrix class with modules data
    */
  var modules: js.Any = js.native
  /**
    * Generated segments
    */
  var segments: js.Array[QRCodeSegment] = js.native
  /**
    * Calculated QR Code version
    */
  var version: Double = js.native
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
  @scala.inline
  implicit class QRCodeOps[Self <: QRCode] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setErrorCorrectionLevel(value: Double): Self = this.set("errorCorrectionLevel", value.asInstanceOf[js.Any])
    @scala.inline
    def setMaskPattern(value: js.Any): Self = this.set("maskPattern", value.asInstanceOf[js.Any])
    @scala.inline
    def setModules(value: js.Any): Self = this.set("modules", value.asInstanceOf[js.Any])
    @scala.inline
    def setSegmentsVarargs(value: QRCodeSegment*): Self = this.set("segments", js.Array(value :_*))
    @scala.inline
    def setSegments(value: js.Array[QRCodeSegment]): Self = this.set("segments", value.asInstanceOf[js.Any])
    @scala.inline
    def setVersion(value: Double): Self = this.set("version", value.asInstanceOf[js.Any])
  }
  
}

