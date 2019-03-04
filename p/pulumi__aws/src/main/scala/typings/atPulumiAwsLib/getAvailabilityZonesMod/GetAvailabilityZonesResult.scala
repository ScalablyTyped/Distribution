package typings
package atPulumiAwsLib.getAvailabilityZonesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetAvailabilityZonesResult extends js.Object {
  /**
    * id is the provider-assigned unique ID for this managed resource.
    */
  val id: java.lang.String
  /**
    * A list of the Availability Zone names available to the account.
    */
  val names: js.Array[java.lang.String]
  /**
    * A list of the Availability Zone IDs available to the account.
    */
  val zoneIds: js.Array[java.lang.String]
}

object GetAvailabilityZonesResult {
  @scala.inline
  def apply(id: java.lang.String, names: js.Array[java.lang.String], zoneIds: js.Array[java.lang.String]): GetAvailabilityZonesResult = {
    val __obj = js.Dynamic.literal(id = id, names = names, zoneIds = zoneIds)
  
    __obj.asInstanceOf[GetAvailabilityZonesResult]
  }
}

