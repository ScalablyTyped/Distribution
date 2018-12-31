package typings
package atPulumiAwsLib.getAvailabilityZoneMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetAvailabilityZoneArgs extends js.Object {
  /**
    * The full name of the availability zone to select.
    */
  val name: js.UndefOr[java.lang.String] = js.undefined
  /**
    * A specific availability zone state to require. May
    * be any of `"available"`, `"information"` or `"impaired"`.
    */
  val state: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The zone ID of the availability zone to select.
    */
  val zoneId: js.UndefOr[java.lang.String] = js.undefined
}

