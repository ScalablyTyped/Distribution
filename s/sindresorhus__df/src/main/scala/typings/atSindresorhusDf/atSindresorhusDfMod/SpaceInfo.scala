package typings.atSindresorhusDf.atSindresorhusDfMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SpaceInfo extends js.Object {
  /**
  		 * Available size in bytes.
  		 */
  val available: Double
  /**
  		 * Capacity as a float from `0` to `1`.
  		 */
  val capacity: Double
  /**
  		 * Name of the filesystem.
  		 */
  val filesystem: String
  /**
  		 * Disk mount location.
  		 */
  val mountpoint: String
  /**
  		 * Total size in bytes.
  		 */
  val size: Double
  /**
  		 * Used size in bytes.
  		 */
  val used: Double
}

object SpaceInfo {
  @scala.inline
  def apply(
    available: Double,
    capacity: Double,
    filesystem: String,
    mountpoint: String,
    size: Double,
    used: Double
  ): SpaceInfo = {
    val __obj = js.Dynamic.literal(available = available, capacity = capacity, filesystem = filesystem, mountpoint = mountpoint, size = size, used = used)
  
    __obj.asInstanceOf[SpaceInfo]
  }
}

