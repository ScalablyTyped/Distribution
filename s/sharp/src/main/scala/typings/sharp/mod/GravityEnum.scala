package typings.sharp.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GravityEnum extends js.Object {
  var center: Double
  var centre: Double
  var east: Double
  var north: Double
  var northeast: Double
  var northwest: Double
  var south: Double
  var southeast: Double
  var southwest: Double
  var west: Double
}

object GravityEnum {
  @scala.inline
  def apply(
    center: Double,
    centre: Double,
    east: Double,
    north: Double,
    northeast: Double,
    northwest: Double,
    south: Double,
    southeast: Double,
    southwest: Double,
    west: Double
  ): GravityEnum = {
    val __obj = js.Dynamic.literal(center = center.asInstanceOf[js.Any], centre = centre.asInstanceOf[js.Any], east = east.asInstanceOf[js.Any], north = north.asInstanceOf[js.Any], northeast = northeast.asInstanceOf[js.Any], northwest = northwest.asInstanceOf[js.Any], south = south.asInstanceOf[js.Any], southeast = southeast.asInstanceOf[js.Any], southwest = southwest.asInstanceOf[js.Any], west = west.asInstanceOf[js.Any])
    __obj.asInstanceOf[GravityEnum]
  }
}

