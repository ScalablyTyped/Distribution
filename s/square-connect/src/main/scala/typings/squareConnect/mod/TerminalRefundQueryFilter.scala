package typings.squareConnect.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("square-connect", "TerminalRefundQueryFilter")
@js.native
class TerminalRefundQueryFilter () extends StObject {
  
  /**
    * Timestamp for the beginning of the reporting period, in RFC 3339 format. Inclusive. Default: The current time minus one day.
    */
  var created_at: js.UndefOr[TimeRange] = js.native
  
  /**
    * `TerminalRefund`s associated with a specific device.
    * If no device is specified then all `TerminalRefund`s for the signed in account will be displayed.
    */
  var device_id: js.UndefOr[String] = js.native
  
  /**
    * Filtered results with the desired status of the `TerminalRefund`
    * Options: `PENDING`, `IN\\_PROGRESS`, `CANCEL\\_REQUESTED`, `CANCELED`, `COMPLETED`
    */
  var status: js.UndefOr[String] = js.native
}
