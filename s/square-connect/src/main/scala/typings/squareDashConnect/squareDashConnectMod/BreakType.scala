package typings.squareDashConnect.squareDashConnectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("square-connect", "BreakType")
@js.native
class BreakType () extends js.Object {
  /**
    * A human-readable name for this type of break. Will be displayed to employees in Square products.
    */
  var break_name: String = js.native
  /**
    * A read-only timestamp in RFC 3339 format.
    */
  var created_at: js.UndefOr[String] = js.native
  /**
    * Format: RFC-3339 P[n]Y[n]M[n]DT[n]H[n]M[n]S. The expected length of this break. Precision below minutes is truncated.
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
    * The ID of the business location this type of break applies to.
    */
  var location_id: String = js.native
  /**
    * A read-only timestamp in RFC 3339 format.
    */
  var updated_at: js.UndefOr[String] = js.native
  /**
    * Used for resolving concurrency issues; request will fail if version provided does not match server version at
    * time of request. If a value is not provided, Square's servers execute a \"blind\" write; potentially  overwriting
    * another writer's data.
    */
  var version: js.UndefOr[Double] = js.native
}

