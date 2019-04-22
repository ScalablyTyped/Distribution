package typings
package squareDashConnectLib.squareDashConnectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("square-connect", "UpdateItemTaxesResponse")
@js.native
class UpdateItemTaxesResponse () extends js.Object {
  /**
    * The set of [Error](#type-error)s encountered.
    */
  var errors: js.UndefOr[js.Array[stdLib.Error]] = js.native
  /**
    * The database [timestamp](#workingwithdates) of this update in RFC 3339 format, e.g., "2016-09-04T23:59:33.123Z".
    */
  var updated_at: js.UndefOr[java.lang.String] = js.native
}

