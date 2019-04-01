package typings
package atSindresorhusDfLib.atSindresorhusDfMod.dfNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SpaceInfo extends js.Object {
  /**
  		 * Available size in bytes.
  		 */
  val available: scala.Double
  /**
  		 * Capacity as a float from `0` to `1`.
  		 */
  val capacity: scala.Double
  /**
  		 * Name of the filesystem.
  		 */
  val filesystem: java.lang.String
  /**
  		 * Disk mount location.
  		 */
  val mountpoint: java.lang.String
  /**
  		 * Total size in bytes.
  		 */
  val size: scala.Double
  /**
  		 * Used size in bytes.
  		 */
  val used: scala.Double
}

object SpaceInfo {
  @scala.inline
  def apply(
    available: scala.Double,
    capacity: scala.Double,
    filesystem: java.lang.String,
    mountpoint: java.lang.String,
    size: scala.Double,
    used: scala.Double
  ): SpaceInfo = {
    val __obj = js.Dynamic.literal(available = available, capacity = capacity, filesystem = filesystem, mountpoint = mountpoint, size = size, used = used)
  
    __obj.asInstanceOf[SpaceInfo]
  }
}

