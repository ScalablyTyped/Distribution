package typings.proj4.mod

import typings.proj4.proj4Booleans.`true`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ProjectionDefinition extends js.Object {
  
  var R_A: js.UndefOr[`true`] = js.native
  
  var a: js.UndefOr[Double] = js.native
  
  var alpha: js.UndefOr[Double] = js.native
  
  var axis: js.UndefOr[String] = js.native
  
  var b: js.UndefOr[Double] = js.native
  
  var datum: js.UndefOr[String] = js.native
  
  var datumCode: js.UndefOr[String] = js.native
  
  var datumName: js.UndefOr[String] = js.native
  
  var datum_params: js.UndefOr[String | js.Array[Double]] = js.native
  
  var ellps: js.UndefOr[String] = js.native
  
  var from_greenwich: js.UndefOr[Double] = js.native
  
  var k0: js.UndefOr[Double] = js.native
  
  var lat0: js.UndefOr[Double] = js.native
  
  var lat1: js.UndefOr[Double] = js.native
  
  var lat2: js.UndefOr[Double] = js.native
  
  var lat_ts: js.UndefOr[Double] = js.native
  
  var long0: js.UndefOr[Double] = js.native
  
  var long1: js.UndefOr[Double] = js.native
  
  var long2: js.UndefOr[Double] = js.native
  
  var longc: js.UndefOr[Double] = js.native
  
  var natGrids: js.UndefOr[String] = js.native
  
  var projName: js.UndefOr[String] = js.native
  
  var rf: js.UndefOr[Double] = js.native
  
  var title: String = js.native
  
  var to_meter: js.UndefOr[Double] = js.native
  
  var units: js.UndefOr[String] = js.native
  
  var utmSouth: js.UndefOr[`true`] = js.native
  
  var x0: js.UndefOr[Double] = js.native
  
  var y0: js.UndefOr[Double] = js.native
  
  var zone: js.UndefOr[Double] = js.native
}
object ProjectionDefinition {
  
  @scala.inline
  def apply(title: String): ProjectionDefinition = {
    val __obj = js.Dynamic.literal(title = title.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProjectionDefinition]
  }
  
  @scala.inline
  implicit class ProjectionDefinitionOps[Self <: ProjectionDefinition] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setTitle(value: String): Self = this.set("title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setR_A(value: `true`): Self = this.set("R_A", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteR_A: Self = this.set("R_A", js.undefined)
    
    @scala.inline
    def setA(value: Double): Self = this.set("a", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteA: Self = this.set("a", js.undefined)
    
    @scala.inline
    def setAlpha(value: Double): Self = this.set("alpha", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAlpha: Self = this.set("alpha", js.undefined)
    
    @scala.inline
    def setAxis(value: String): Self = this.set("axis", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAxis: Self = this.set("axis", js.undefined)
    
    @scala.inline
    def setB(value: Double): Self = this.set("b", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteB: Self = this.set("b", js.undefined)
    
    @scala.inline
    def setDatum(value: String): Self = this.set("datum", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDatum: Self = this.set("datum", js.undefined)
    
    @scala.inline
    def setDatumCode(value: String): Self = this.set("datumCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDatumCode: Self = this.set("datumCode", js.undefined)
    
    @scala.inline
    def setDatumName(value: String): Self = this.set("datumName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDatumName: Self = this.set("datumName", js.undefined)
    
    @scala.inline
    def setDatum_paramsVarargs(value: Double*): Self = this.set("datum_params", js.Array(value :_*))
    
    @scala.inline
    def setDatum_params(value: String | js.Array[Double]): Self = this.set("datum_params", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDatum_params: Self = this.set("datum_params", js.undefined)
    
    @scala.inline
    def setEllps(value: String): Self = this.set("ellps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEllps: Self = this.set("ellps", js.undefined)
    
    @scala.inline
    def setFrom_greenwich(value: Double): Self = this.set("from_greenwich", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFrom_greenwich: Self = this.set("from_greenwich", js.undefined)
    
    @scala.inline
    def setK0(value: Double): Self = this.set("k0", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteK0: Self = this.set("k0", js.undefined)
    
    @scala.inline
    def setLat0(value: Double): Self = this.set("lat0", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLat0: Self = this.set("lat0", js.undefined)
    
    @scala.inline
    def setLat1(value: Double): Self = this.set("lat1", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLat1: Self = this.set("lat1", js.undefined)
    
    @scala.inline
    def setLat2(value: Double): Self = this.set("lat2", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLat2: Self = this.set("lat2", js.undefined)
    
    @scala.inline
    def setLat_ts(value: Double): Self = this.set("lat_ts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLat_ts: Self = this.set("lat_ts", js.undefined)
    
    @scala.inline
    def setLong0(value: Double): Self = this.set("long0", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLong0: Self = this.set("long0", js.undefined)
    
    @scala.inline
    def setLong1(value: Double): Self = this.set("long1", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLong1: Self = this.set("long1", js.undefined)
    
    @scala.inline
    def setLong2(value: Double): Self = this.set("long2", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLong2: Self = this.set("long2", js.undefined)
    
    @scala.inline
    def setLongc(value: Double): Self = this.set("longc", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLongc: Self = this.set("longc", js.undefined)
    
    @scala.inline
    def setNatGrids(value: String): Self = this.set("natGrids", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNatGrids: Self = this.set("natGrids", js.undefined)
    
    @scala.inline
    def setProjName(value: String): Self = this.set("projName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProjName: Self = this.set("projName", js.undefined)
    
    @scala.inline
    def setRf(value: Double): Self = this.set("rf", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRf: Self = this.set("rf", js.undefined)
    
    @scala.inline
    def setTo_meter(value: Double): Self = this.set("to_meter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTo_meter: Self = this.set("to_meter", js.undefined)
    
    @scala.inline
    def setUnits(value: String): Self = this.set("units", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUnits: Self = this.set("units", js.undefined)
    
    @scala.inline
    def setUtmSouth(value: `true`): Self = this.set("utmSouth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUtmSouth: Self = this.set("utmSouth", js.undefined)
    
    @scala.inline
    def setX0(value: Double): Self = this.set("x0", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteX0: Self = this.set("x0", js.undefined)
    
    @scala.inline
    def setY0(value: Double): Self = this.set("y0", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteY0: Self = this.set("y0", js.undefined)
    
    @scala.inline
    def setZone(value: Double): Self = this.set("zone", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteZone: Self = this.set("zone", js.undefined)
  }
}
