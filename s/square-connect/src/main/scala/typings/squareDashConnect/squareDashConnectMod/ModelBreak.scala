package typings.squareDashConnect.squareDashConnectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("square-connect", "ModelBreak")
@js.native
class ModelBreak () extends js.Object {
  /**
    * The `BreakType` this `Break` was templated on.
    */
  var break_type_id: String = js.native
  /**
    * RFC 3339; follows same timezone info as `Shift`. Precision up to the minute is respected; seconds are truncated.
    * The `end_at` minute is not counted when the break length is calculated. For example, a break from `00:00` to
    * `00:11` is considered a 10 minute break (midnight to 10 minutes after midnight).
    */
  var end_at: js.UndefOr[String] = js.native
  /**
    * Format: RFC-3339 P[n]Y[n]M[n]DT[n]H[n]M[n]S. The expected length of the break.
    */
  var expected_duration: String = js.native
  /**
    * UUID for this object.
    */
  var id: js.UndefOr[String] = js.native
  /**
    * Whether this break counts towards time worked for compensation purposes.
    */
  var is_paid: Boolean = js.native
  /**
    * A human-readable name.
    */
  var name: String = js.native
  /**
    * RFC 3339; follows same timezone info as `Shift`. Precision up to the minute is respected; seconds are truncated.
    */
  var start_at: String = js.native
}

