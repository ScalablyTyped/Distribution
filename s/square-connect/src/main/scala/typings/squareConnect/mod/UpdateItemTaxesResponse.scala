package typings.squareConnect.mod

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("square-connect", "UpdateItemTaxesResponse")
@js.native
class UpdateItemTaxesResponse () extends js.Object {
  /**
    * Information on any errors encountered.
    */
  var errors: js.UndefOr[js.Array[Error]] = js.native
  /**
    * The database [timestamp](https://developer.squareup.com/docs/build-basics/working-with-dates) of this update
    * in RFC 3339 format, e.g., `2016-09-04T23:59:33.123Z`.
    */
  var updated_at: js.UndefOr[String] = js.native
}

