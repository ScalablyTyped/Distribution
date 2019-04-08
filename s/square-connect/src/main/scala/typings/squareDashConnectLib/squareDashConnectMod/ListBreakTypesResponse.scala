package typings
package squareDashConnectLib.squareDashConnectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("square-connect", "ListBreakTypesResponse")
@js.native
class ListBreakTypesResponse () extends js.Object {
  /**
    *  A page of `BreakType` results.
    */
  var break_types: js.UndefOr[js.Array[BreakType]] = js.native
  /**
    * Value supplied in the subsequent request to fetch the next next page of Break Type results.
    */
  var cursor: js.UndefOr[java.lang.String] = js.native
  /**
    * Any errors that occurred during the request.
    */
  var errors: js.UndefOr[js.Array[stdLib.Error]] = js.native
}

