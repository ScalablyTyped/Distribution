package typings.squareConnect.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("square-connect", "CreateLocationRequest")
@js.native
class CreateLocationRequest () extends js.Object {
  /**
    * The initial values of the location being created. The `name` field is required. All other fields are optional.
    * Unspecified fields will be set to default values using existing location data.
    */
  var location: js.UndefOr[Location] = js.native
}

