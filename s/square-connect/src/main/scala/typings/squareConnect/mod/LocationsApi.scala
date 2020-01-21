package typings.squareConnect.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("square-connect", "LocationsApi")
@js.native
/**
  * Constructs a new LocationsApi.
  * @param apiClient Optional API client implementation to use, default to {@link module:ApiClient#instance} if unspecified.
  */
class LocationsApi () extends js.Object {
  def this(apiClient: ApiClient) = this()
  /**
    * Provides the details for all of a business's locations.
    * Most other Connect API endpoints have a required `location_id` path parameter. The `id` field of the
    * [`Location`](#type-location) objects returned by this endpoint correspond to that `location_id` parameter.
    */
  def listLocations(): js.Promise[ListLocationsResponse] = js.native
}

