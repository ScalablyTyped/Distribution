package typings
package rethinkdbLib.rethinkdbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait DistanceOptions extends js.Object {
  /**
           * The reference ellipsoid to use for geographic coordinates. Possible values are `WGS84` (the default), a common standard for Earth’s geometry, or `unit_sphere`, a perfect sphere of 1 meter radius.
           */
  var geoSystem: js.UndefOr[
    rethinkdbLib.rethinkdbLibStrings.WGS84 | rethinkdbLib.rethinkdbLibStrings.unit_sphere
  ] = js.undefined
  /**
           * Unit for the distance. Possible values are `m` (meter, the default), `km` (kilometer), `mi` (international mile), `nm` (nautical mile), `ft` (international foot).
           */
  var unit: js.UndefOr[
    rethinkdbLib.rethinkdbLibStrings.m | rethinkdbLib.rethinkdbLibStrings.km | rethinkdbLib.rethinkdbLibStrings.mi | rethinkdbLib.rethinkdbLibStrings.nm | rethinkdbLib.rethinkdbLibStrings.ft
  ] = js.undefined
}

