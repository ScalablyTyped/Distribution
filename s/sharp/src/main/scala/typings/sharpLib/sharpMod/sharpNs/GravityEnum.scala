package typings
package sharpLib.sharpMod.sharpNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GravityEnum extends js.Object {
  var center: scala.Double
  var centre: scala.Double
  var east: scala.Double
  var north: scala.Double
  var northeast: scala.Double
  var northwest: scala.Double
  var south: scala.Double
  var southeast: scala.Double
  var southwest: scala.Double
  var west: scala.Double
}

object GravityEnum {
  @scala.inline
  def apply(
    center: scala.Double,
    centre: scala.Double,
    east: scala.Double,
    north: scala.Double,
    northeast: scala.Double,
    northwest: scala.Double,
    south: scala.Double,
    southeast: scala.Double,
    southwest: scala.Double,
    west: scala.Double
  ): GravityEnum = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("center")(center)
    __obj.updateDynamic("centre")(centre)
    __obj.updateDynamic("east")(east)
    __obj.updateDynamic("north")(north)
    __obj.updateDynamic("northeast")(northeast)
    __obj.updateDynamic("northwest")(northwest)
    __obj.updateDynamic("south")(south)
    __obj.updateDynamic("southeast")(southeast)
    __obj.updateDynamic("southwest")(southwest)
    __obj.updateDynamic("west")(west)
    __obj.asInstanceOf[GravityEnum]
  }
}

