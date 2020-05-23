package typings.rethinkdb.mod

import typings.rethinkdb.rethinkdbStrings.WGS84
import typings.rethinkdb.rethinkdbStrings.ft
import typings.rethinkdb.rethinkdbStrings.km
import typings.rethinkdb.rethinkdbStrings.m
import typings.rethinkdb.rethinkdbStrings.mi
import typings.rethinkdb.rethinkdbStrings.nm
import typings.rethinkdb.rethinkdbStrings.unit_sphere
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CircleOptions extends DistanceOptions {
  /**
    * If `true` (the default) the circle is filled, creating a polygon; if `false` the circle is unfilled (creating a line).
    */
  var fill: js.UndefOr[Boolean] = js.undefined
  /**
    * The number of vertices in the polygon or line. Defaults to 32.
    */
  var numVertices: js.UndefOr[Double] = js.undefined
}

object CircleOptions {
  @scala.inline
  def apply(
    fill: js.UndefOr[Boolean] = js.undefined,
    geoSystem: WGS84 | unit_sphere = null,
    numVertices: js.UndefOr[Double] = js.undefined,
    unit: m | km | mi | nm | ft = null
  ): CircleOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(fill)) __obj.updateDynamic("fill")(fill.get.asInstanceOf[js.Any])
    if (geoSystem != null) __obj.updateDynamic("geoSystem")(geoSystem.asInstanceOf[js.Any])
    if (!js.isUndefined(numVertices)) __obj.updateDynamic("numVertices")(numVertices.get.asInstanceOf[js.Any])
    if (unit != null) __obj.updateDynamic("unit")(unit.asInstanceOf[js.Any])
    __obj.asInstanceOf[CircleOptions]
  }
}

