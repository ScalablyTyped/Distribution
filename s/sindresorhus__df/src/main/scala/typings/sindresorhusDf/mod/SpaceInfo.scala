package typings.sindresorhusDf.mod

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
    val __obj = js.Dynamic.literal(available = available.asInstanceOf[js.Any], capacity = capacity.asInstanceOf[js.Any], filesystem = filesystem.asInstanceOf[js.Any], mountpoint = mountpoint.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any], used = used.asInstanceOf[js.Any])
    __obj.asInstanceOf[SpaceInfo]
  }
}

