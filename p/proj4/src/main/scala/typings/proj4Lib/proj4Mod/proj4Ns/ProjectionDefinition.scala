package typings
package proj4Lib.proj4Mod.proj4Ns

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ProjectionDefinition extends js.Object {
  var R_A: js.UndefOr[proj4Lib.proj4LibNumbers.`true`] = js.undefined
  var a: js.UndefOr[scala.Double] = js.undefined
  var alpha: js.UndefOr[scala.Double] = js.undefined
  var axis: js.UndefOr[java.lang.String] = js.undefined
  var b: js.UndefOr[scala.Double] = js.undefined
  var datum: js.UndefOr[java.lang.String] = js.undefined
  var datumCode: js.UndefOr[java.lang.String] = js.undefined
  var datumName: js.UndefOr[java.lang.String] = js.undefined
  var datum_params: js.UndefOr[java.lang.String | js.Array[scala.Double]] = js.undefined
  var ellps: js.UndefOr[java.lang.String] = js.undefined
  var from_greenwich: js.UndefOr[scala.Double] = js.undefined
  var k0: js.UndefOr[scala.Double] = js.undefined
  var lat0: js.UndefOr[scala.Double] = js.undefined
  var lat1: js.UndefOr[scala.Double] = js.undefined
  var lat2: js.UndefOr[scala.Double] = js.undefined
  var lat_ts: js.UndefOr[scala.Double] = js.undefined
  var long0: js.UndefOr[scala.Double] = js.undefined
  var long1: js.UndefOr[scala.Double] = js.undefined
  var long2: js.UndefOr[scala.Double] = js.undefined
  var longc: js.UndefOr[scala.Double] = js.undefined
  var natGrids: js.UndefOr[java.lang.String] = js.undefined
  var projName: js.UndefOr[java.lang.String] = js.undefined
  var rf: js.UndefOr[scala.Double] = js.undefined
  var title: java.lang.String
  var to_meter: js.UndefOr[scala.Double] = js.undefined
  var units: js.UndefOr[java.lang.String] = js.undefined
  var utmSouth: js.UndefOr[proj4Lib.proj4LibNumbers.`true`] = js.undefined
  var x0: js.UndefOr[scala.Double] = js.undefined
  var y0: js.UndefOr[scala.Double] = js.undefined
  var zone: js.UndefOr[scala.Double] = js.undefined
}

object ProjectionDefinition {
  @scala.inline
  def apply(
    title: java.lang.String,
    R_A: proj4Lib.proj4LibNumbers.`true` = null,
    a: scala.Int | scala.Double = null,
    alpha: scala.Int | scala.Double = null,
    axis: java.lang.String = null,
    b: scala.Int | scala.Double = null,
    datum: java.lang.String = null,
    datumCode: java.lang.String = null,
    datumName: java.lang.String = null,
    datum_params: java.lang.String | js.Array[scala.Double] = null,
    ellps: java.lang.String = null,
    from_greenwich: scala.Int | scala.Double = null,
    k0: scala.Int | scala.Double = null,
    lat0: scala.Int | scala.Double = null,
    lat1: scala.Int | scala.Double = null,
    lat2: scala.Int | scala.Double = null,
    lat_ts: scala.Int | scala.Double = null,
    long0: scala.Int | scala.Double = null,
    long1: scala.Int | scala.Double = null,
    long2: scala.Int | scala.Double = null,
    longc: scala.Int | scala.Double = null,
    natGrids: java.lang.String = null,
    projName: java.lang.String = null,
    rf: scala.Int | scala.Double = null,
    to_meter: scala.Int | scala.Double = null,
    units: java.lang.String = null,
    utmSouth: proj4Lib.proj4LibNumbers.`true` = null,
    x0: scala.Int | scala.Double = null,
    y0: scala.Int | scala.Double = null,
    zone: scala.Int | scala.Double = null
  ): ProjectionDefinition = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("title")(title)
    if (R_A != null) __obj.updateDynamic("R_A")(R_A)
    if (a != null) __obj.updateDynamic("a")(a.asInstanceOf[js.Any])
    if (alpha != null) __obj.updateDynamic("alpha")(alpha.asInstanceOf[js.Any])
    if (axis != null) __obj.updateDynamic("axis")(axis)
    if (b != null) __obj.updateDynamic("b")(b.asInstanceOf[js.Any])
    if (datum != null) __obj.updateDynamic("datum")(datum)
    if (datumCode != null) __obj.updateDynamic("datumCode")(datumCode)
    if (datumName != null) __obj.updateDynamic("datumName")(datumName)
    if (datum_params != null) __obj.updateDynamic("datum_params")(datum_params.asInstanceOf[js.Any])
    if (ellps != null) __obj.updateDynamic("ellps")(ellps)
    if (from_greenwich != null) __obj.updateDynamic("from_greenwich")(from_greenwich.asInstanceOf[js.Any])
    if (k0 != null) __obj.updateDynamic("k0")(k0.asInstanceOf[js.Any])
    if (lat0 != null) __obj.updateDynamic("lat0")(lat0.asInstanceOf[js.Any])
    if (lat1 != null) __obj.updateDynamic("lat1")(lat1.asInstanceOf[js.Any])
    if (lat2 != null) __obj.updateDynamic("lat2")(lat2.asInstanceOf[js.Any])
    if (lat_ts != null) __obj.updateDynamic("lat_ts")(lat_ts.asInstanceOf[js.Any])
    if (long0 != null) __obj.updateDynamic("long0")(long0.asInstanceOf[js.Any])
    if (long1 != null) __obj.updateDynamic("long1")(long1.asInstanceOf[js.Any])
    if (long2 != null) __obj.updateDynamic("long2")(long2.asInstanceOf[js.Any])
    if (longc != null) __obj.updateDynamic("longc")(longc.asInstanceOf[js.Any])
    if (natGrids != null) __obj.updateDynamic("natGrids")(natGrids)
    if (projName != null) __obj.updateDynamic("projName")(projName)
    if (rf != null) __obj.updateDynamic("rf")(rf.asInstanceOf[js.Any])
    if (to_meter != null) __obj.updateDynamic("to_meter")(to_meter.asInstanceOf[js.Any])
    if (units != null) __obj.updateDynamic("units")(units)
    if (utmSouth != null) __obj.updateDynamic("utmSouth")(utmSouth)
    if (x0 != null) __obj.updateDynamic("x0")(x0.asInstanceOf[js.Any])
    if (y0 != null) __obj.updateDynamic("y0")(y0.asInstanceOf[js.Any])
    if (zone != null) __obj.updateDynamic("zone")(zone.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProjectionDefinition]
  }
}

