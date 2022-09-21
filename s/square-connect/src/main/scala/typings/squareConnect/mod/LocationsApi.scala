package typings.squareConnect.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("square-connect", "LocationsApi")
@js.native
/**
  * Constructs a new LocationsApi.
  * @param apiClient Optional API client implementation to use, default to {@link module:ApiClient#instance} if unspecified.
  */
open class LocationsApi () extends StObject {
  def this(apiClient: ApiClient) = this()
  
  /**
    * Creates a location.
    */
  def createLocation(body: Location): js.Promise[CreateLocationResponse] = js.native
  
  /**
    * Provides the details for all of a business's locations.
    * Most other Connect API endpoints have a required `location_id` path parameter. The `id` field of the
    * [`Location`](#type-location) objects returned by this endpoint correspond to that `location_id` parameter.
    */
  def listLocations(): js.Promise[ListLocationsResponse] = js.native
  
  /**
    * Retrieves details of a location.
    */
  def retrieveLocation(locationId: String): js.Promise[RetrieveLocationResponse] = js.native
  
  /**
    * Updates a location.
    */
  def updateLocation(locationId: String, body: Location): js.Promise[UpdateLocationResponse] = js.native
}
