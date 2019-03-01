package typings
package rethinkdbLib.rethinkdbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CircleOptions extends DistanceOptions {
  /**
    * If `true` (the default) the circle is filled, creating a polygon; if `false` the circle is unfilled (creating a line).
    */
  var fill: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * The number of vertices in the polygon or line. Defaults to 32.
    */
  var numVertices: js.UndefOr[scala.Double] = js.undefined
}

object CircleOptions {
  @scala.inline
  def apply(
    fill: js.UndefOr[scala.Boolean] = js.undefined,
    geoSystem: rethinkdbLib.rethinkdbLibStrings.WGS84 | rethinkdbLib.rethinkdbLibStrings.unit_sphere = null,
    numVertices: scala.Int | scala.Double = null,
    unit: rethinkdbLib.rethinkdbLibStrings.m | rethinkdbLib.rethinkdbLibStrings.km | rethinkdbLib.rethinkdbLibStrings.mi | rethinkdbLib.rethinkdbLibStrings.nm | rethinkdbLib.rethinkdbLibStrings.ft = null
  ): CircleOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(fill)) __obj.updateDynamic("fill")(fill)
    if (geoSystem != null) __obj.updateDynamic("geoSystem")(geoSystem.asInstanceOf[js.Any])
    if (numVertices != null) __obj.updateDynamic("numVertices")(numVertices.asInstanceOf[js.Any])
    if (unit != null) __obj.updateDynamic("unit")(unit.asInstanceOf[js.Any])
    __obj.asInstanceOf[CircleOptions]
  }
}

