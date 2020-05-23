package typings.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** A commonly used set of constants used for reflecting gradientUnits, patternContentUnits and other similar attributes. */
trait SVGUnitTypes extends js.Object {
  val SVG_UNIT_TYPE_OBJECTBOUNDINGBOX: Double
  val SVG_UNIT_TYPE_UNKNOWN: Double
  val SVG_UNIT_TYPE_USERSPACEONUSE: Double
}

object SVGUnitTypes {
  @scala.inline
  def apply(
    SVG_UNIT_TYPE_OBJECTBOUNDINGBOX: Double,
    SVG_UNIT_TYPE_UNKNOWN: Double,
    SVG_UNIT_TYPE_USERSPACEONUSE: Double
  ): SVGUnitTypes = {
    val __obj = js.Dynamic.literal(SVG_UNIT_TYPE_OBJECTBOUNDINGBOX = SVG_UNIT_TYPE_OBJECTBOUNDINGBOX.asInstanceOf[js.Any], SVG_UNIT_TYPE_UNKNOWN = SVG_UNIT_TYPE_UNKNOWN.asInstanceOf[js.Any], SVG_UNIT_TYPE_USERSPACEONUSE = SVG_UNIT_TYPE_USERSPACEONUSE.asInstanceOf[js.Any])
    __obj.asInstanceOf[SVGUnitTypes]
  }
}

