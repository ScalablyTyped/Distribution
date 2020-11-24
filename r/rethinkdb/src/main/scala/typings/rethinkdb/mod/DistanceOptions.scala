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
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DistanceOptions extends js.Object {
  
  /**
    * The reference ellipsoid to use for geographic coordinates. Possible values are `WGS84` (the default), a common standard for Earth’s geometry, or `unit_sphere`, a perfect sphere of 1 meter radius.
    */
  var geoSystem: js.UndefOr[WGS84 | unit_sphere] = js.native
  
  /**
    * Unit for the distance. Possible values are `m` (meter, the default), `km` (kilometer), `mi` (international mile), `nm` (nautical mile), `ft` (international foot).
    */
  var unit: js.UndefOr[m | km | mi | nm | ft] = js.native
}
object DistanceOptions {
  
  @scala.inline
  def apply(): DistanceOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DistanceOptions]
  }
  
  @scala.inline
  implicit class DistanceOptionsOps[Self <: DistanceOptions] (val x: Self) extends AnyVal {
    
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
    def setGeoSystem(value: WGS84 | unit_sphere): Self = this.set("geoSystem", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGeoSystem: Self = this.set("geoSystem", js.undefined)
    
    @scala.inline
    def setUnit(value: m | km | mi | nm | ft): Self = this.set("unit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUnit: Self = this.set("unit", js.undefined)
  }
}
