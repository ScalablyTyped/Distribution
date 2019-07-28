package typings.sharp.sharpMod

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
    val __obj = js.Dynamic.literal(center = center, centre = centre, east = east, north = north, northeast = northeast, northwest = northwest, south = south, southeast = southeast, southwest = southwest, west = west)
  
    __obj.asInstanceOf[GravityEnum]
  }
}

