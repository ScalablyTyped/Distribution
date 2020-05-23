package typings.proj4.mod

import typings.proj4.proj4Booleans.`true`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ProjectionDefinition extends js.Object {
  var R_A: js.UndefOr[`true`] = js.undefined
  var a: js.UndefOr[Double] = js.undefined
  var alpha: js.UndefOr[Double] = js.undefined
  var axis: js.UndefOr[String] = js.undefined
  var b: js.UndefOr[Double] = js.undefined
  var datum: js.UndefOr[String] = js.undefined
  var datumCode: js.UndefOr[String] = js.undefined
  var datumName: js.UndefOr[String] = js.undefined
  var datum_params: js.UndefOr[String | js.Array[Double]] = js.undefined
  var ellps: js.UndefOr[String] = js.undefined
  var from_greenwich: js.UndefOr[Double] = js.undefined
  var k0: js.UndefOr[Double] = js.undefined
  var lat0: js.UndefOr[Double] = js.undefined
  var lat1: js.UndefOr[Double] = js.undefined
  var lat2: js.UndefOr[Double] = js.undefined
  var lat_ts: js.UndefOr[Double] = js.undefined
  var long0: js.UndefOr[Double] = js.undefined
  var long1: js.UndefOr[Double] = js.undefined
  var long2: js.UndefOr[Double] = js.undefined
  var longc: js.UndefOr[Double] = js.undefined
  var natGrids: js.UndefOr[String] = js.undefined
  var projName: js.UndefOr[String] = js.undefined
  var rf: js.UndefOr[Double] = js.undefined
  var title: String
  var to_meter: js.UndefOr[Double] = js.undefined
  var units: js.UndefOr[String] = js.undefined
  var utmSouth: js.UndefOr[`true`] = js.undefined
  var x0: js.UndefOr[Double] = js.undefined
  var y0: js.UndefOr[Double] = js.undefined
  var zone: js.UndefOr[Double] = js.undefined
}

object ProjectionDefinition {
  @scala.inline
  def apply(
    title: String,
    R_A: `true` = null,
    a: js.UndefOr[Double] = js.undefined,
    alpha: js.UndefOr[Double] = js.undefined,
    axis: String = null,
    b: js.UndefOr[Double] = js.undefined,
    datum: String = null,
    datumCode: String = null,
    datumName: String = null,
    datum_params: String | js.Array[Double] = null,
    ellps: String = null,
    from_greenwich: js.UndefOr[Double] = js.undefined,
    k0: js.UndefOr[Double] = js.undefined,
    lat0: js.UndefOr[Double] = js.undefined,
    lat1: js.UndefOr[Double] = js.undefined,
    lat2: js.UndefOr[Double] = js.undefined,
    lat_ts: js.UndefOr[Double] = js.undefined,
    long0: js.UndefOr[Double] = js.undefined,
    long1: js.UndefOr[Double] = js.undefined,
    long2: js.UndefOr[Double] = js.undefined,
    longc: js.UndefOr[Double] = js.undefined,
    natGrids: String = null,
    projName: String = null,
    rf: js.UndefOr[Double] = js.undefined,
    to_meter: js.UndefOr[Double] = js.undefined,
    units: String = null,
    utmSouth: `true` = null,
    x0: js.UndefOr[Double] = js.undefined,
    y0: js.UndefOr[Double] = js.undefined,
    zone: js.UndefOr[Double] = js.undefined
  ): ProjectionDefinition = {
    val __obj = js.Dynamic.literal(title = title.asInstanceOf[js.Any])
    if (R_A != null) __obj.updateDynamic("R_A")(R_A.asInstanceOf[js.Any])
    if (!js.isUndefined(a)) __obj.updateDynamic("a")(a.get.asInstanceOf[js.Any])
    if (!js.isUndefined(alpha)) __obj.updateDynamic("alpha")(alpha.get.asInstanceOf[js.Any])
    if (axis != null) __obj.updateDynamic("axis")(axis.asInstanceOf[js.Any])
    if (!js.isUndefined(b)) __obj.updateDynamic("b")(b.get.asInstanceOf[js.Any])
    if (datum != null) __obj.updateDynamic("datum")(datum.asInstanceOf[js.Any])
    if (datumCode != null) __obj.updateDynamic("datumCode")(datumCode.asInstanceOf[js.Any])
    if (datumName != null) __obj.updateDynamic("datumName")(datumName.asInstanceOf[js.Any])
    if (datum_params != null) __obj.updateDynamic("datum_params")(datum_params.asInstanceOf[js.Any])
    if (ellps != null) __obj.updateDynamic("ellps")(ellps.asInstanceOf[js.Any])
    if (!js.isUndefined(from_greenwich)) __obj.updateDynamic("from_greenwich")(from_greenwich.get.asInstanceOf[js.Any])
    if (!js.isUndefined(k0)) __obj.updateDynamic("k0")(k0.get.asInstanceOf[js.Any])
    if (!js.isUndefined(lat0)) __obj.updateDynamic("lat0")(lat0.get.asInstanceOf[js.Any])
    if (!js.isUndefined(lat1)) __obj.updateDynamic("lat1")(lat1.get.asInstanceOf[js.Any])
    if (!js.isUndefined(lat2)) __obj.updateDynamic("lat2")(lat2.get.asInstanceOf[js.Any])
    if (!js.isUndefined(lat_ts)) __obj.updateDynamic("lat_ts")(lat_ts.get.asInstanceOf[js.Any])
    if (!js.isUndefined(long0)) __obj.updateDynamic("long0")(long0.get.asInstanceOf[js.Any])
    if (!js.isUndefined(long1)) __obj.updateDynamic("long1")(long1.get.asInstanceOf[js.Any])
    if (!js.isUndefined(long2)) __obj.updateDynamic("long2")(long2.get.asInstanceOf[js.Any])
    if (!js.isUndefined(longc)) __obj.updateDynamic("longc")(longc.get.asInstanceOf[js.Any])
    if (natGrids != null) __obj.updateDynamic("natGrids")(natGrids.asInstanceOf[js.Any])
    if (projName != null) __obj.updateDynamic("projName")(projName.asInstanceOf[js.Any])
    if (!js.isUndefined(rf)) __obj.updateDynamic("rf")(rf.get.asInstanceOf[js.Any])
    if (!js.isUndefined(to_meter)) __obj.updateDynamic("to_meter")(to_meter.get.asInstanceOf[js.Any])
    if (units != null) __obj.updateDynamic("units")(units.asInstanceOf[js.Any])
    if (utmSouth != null) __obj.updateDynamic("utmSouth")(utmSouth.asInstanceOf[js.Any])
    if (!js.isUndefined(x0)) __obj.updateDynamic("x0")(x0.get.asInstanceOf[js.Any])
    if (!js.isUndefined(y0)) __obj.updateDynamic("y0")(y0.get.asInstanceOf[js.Any])
    if (!js.isUndefined(zone)) __obj.updateDynamic("zone")(zone.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProjectionDefinition]
  }
}

