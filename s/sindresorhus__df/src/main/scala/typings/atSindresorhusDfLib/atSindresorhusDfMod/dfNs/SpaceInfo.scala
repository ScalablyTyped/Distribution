package typings
package atSindresorhusDfLib.atSindresorhusDfMod.dfNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SpaceInfo extends js.Object {
  var available: scala.Double
  var capacity: scala.Double
  var filesystem: java.lang.String
  var mountpoint: java.lang.String
  var size: scala.Double
  var used: scala.Double
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

