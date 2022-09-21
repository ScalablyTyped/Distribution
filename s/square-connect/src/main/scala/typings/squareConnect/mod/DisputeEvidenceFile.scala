package typings.squareConnect.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("square-connect", "DisputeEvidenceFile")
@js.native
open class DisputeEvidenceFile () extends StObject {
  
  /**
    * The file name including the file extension. For example: \"receipt.tiff\".
    */
  var filename: js.UndefOr[String] = js.native
  
  /**
    * Dispute evidence files must one of application/pdf, image/heic, image/heif, image/jpeg, image/png, image/tiff formats.
    */
  var filetype: js.UndefOr[String] = js.native
}
