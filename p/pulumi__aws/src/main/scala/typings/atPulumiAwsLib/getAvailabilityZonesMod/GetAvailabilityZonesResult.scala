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

