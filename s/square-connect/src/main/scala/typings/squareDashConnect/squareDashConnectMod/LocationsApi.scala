package typings.squareDashConnect.squareDashConnectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("square-connect", "LocationsApi")
@js.native
class LocationsApi () extends js.Object {
  /**
    * Provides the details for all of a business's locations.
    * Most other Connect API endpoints have a required `location_id` path parameter. The `id` field of the
    * [`Location`](#type-location) objects returned by this endpoint correspond to that `location_id` parameter.
    */
  def listLocations(): js.Promise[ListLocationsResponse] = js.native
}

