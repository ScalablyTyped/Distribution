package typings.squareConnect.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("square-connect", "DisputeEvidenceFile")
@js.native
class DisputeEvidenceFile () extends js.Object {
  /**
    * The file name including the file extension. For example: \"receipt.tiff\".
    */
  var filename: js.UndefOr[String] = js.native
  /**
    * Dispute evidence files must one of application/pdf, image/heic, image/heif, image/jpeg, image/png, image/tiff formats.
    */
  var filetype: js.UndefOr[String] = js.native
}

