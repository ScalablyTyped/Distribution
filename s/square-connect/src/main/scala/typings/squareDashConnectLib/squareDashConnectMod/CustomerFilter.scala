package typings
package squareDashConnectLib.squareDashConnectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("square-connect", "CustomerFilter")
@js.native
class CustomerFilter () extends js.Object {
  /**
    * A filter to select customers based on when they were created.
    */
  var created_at: js.UndefOr[TimeRange] = js.native
  /**
    * A filter to select customers based on their creation source.
    */
  var creation_source: js.UndefOr[CustomerCreationSourceFilter] = js.native
  /**
    * A filter to select customers based on when they were updated.
    */
  var updated_at: js.UndefOr[TimeRange] = js.native
}

