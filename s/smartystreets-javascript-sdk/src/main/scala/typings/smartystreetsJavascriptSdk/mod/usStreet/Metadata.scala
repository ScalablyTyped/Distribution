package typings.smartystreetsJavascriptSdk.mod.usStreet

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Metadata extends js.Object {
  
  var buildingDefaultIndicator: js.Any = js.native
  
  var carrierRoute: String = js.native
  
  var congressionalDistrict: String = js.native
  
  var countyFips: String = js.native
  
  var countyName: String = js.native
  
  var elotSequence: String = js.native
  
  var elotSort: String = js.native
  
  var isEwsMatch: Boolean = js.native
  
  var latitude: Double = js.native
  
  var longitude: Double = js.native
  
  var obeysDst: Boolean = js.native
  
  var precision: String = js.native
  
  var rdi: String = js.native
  
  var recordType: String = js.native
  
  var timeZone: String = js.native
  
  var utcOffset: Double = js.native
  
  var zipType: String = js.native
}
object Metadata {
  
  @scala.inline
  def apply(
    buildingDefaultIndicator: js.Any,
    carrierRoute: String,
    congressionalDistrict: String,
    countyFips: String,
    countyName: String,
    elotSequence: String,
    elotSort: String,
    isEwsMatch: Boolean,
    latitude: Double,
    longitude: Double,
    obeysDst: Boolean,
    precision: String,
    rdi: String,
    recordType: String,
    timeZone: String,
    utcOffset: Double,
    zipType: String
  ): Metadata = {
    val __obj = js.Dynamic.literal(buildingDefaultIndicator = buildingDefaultIndicator.asInstanceOf[js.Any], carrierRoute = carrierRoute.asInstanceOf[js.Any], congressionalDistrict = congressionalDistrict.asInstanceOf[js.Any], countyFips = countyFips.asInstanceOf[js.Any], countyName = countyName.asInstanceOf[js.Any], elotSequence = elotSequence.asInstanceOf[js.Any], elotSort = elotSort.asInstanceOf[js.Any], isEwsMatch = isEwsMatch.asInstanceOf[js.Any], latitude = latitude.asInstanceOf[js.Any], longitude = longitude.asInstanceOf[js.Any], obeysDst = obeysDst.asInstanceOf[js.Any], precision = precision.asInstanceOf[js.Any], rdi = rdi.asInstanceOf[js.Any], recordType = recordType.asInstanceOf[js.Any], timeZone = timeZone.asInstanceOf[js.Any], utcOffset = utcOffset.asInstanceOf[js.Any], zipType = zipType.asInstanceOf[js.Any])
    __obj.asInstanceOf[Metadata]
  }
  
  @scala.inline
  implicit class MetadataOps[Self <: Metadata] (val x: Self) extends AnyVal {
    
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
    def setBuildingDefaultIndicator(value: js.Any): Self = this.set("buildingDefaultIndicator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCarrierRoute(value: String): Self = this.set("carrierRoute", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCongressionalDistrict(value: String): Self = this.set("congressionalDistrict", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCountyFips(value: String): Self = this.set("countyFips", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCountyName(value: String): Self = this.set("countyName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setElotSequence(value: String): Self = this.set("elotSequence", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setElotSort(value: String): Self = this.set("elotSort", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsEwsMatch(value: Boolean): Self = this.set("isEwsMatch", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLatitude(value: Double): Self = this.set("latitude", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLongitude(value: Double): Self = this.set("longitude", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setObeysDst(value: Boolean): Self = this.set("obeysDst", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrecision(value: String): Self = this.set("precision", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRdi(value: String): Self = this.set("rdi", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRecordType(value: String): Self = this.set("recordType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimeZone(value: String): Self = this.set("timeZone", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUtcOffset(value: Double): Self = this.set("utcOffset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setZipType(value: String): Self = this.set("zipType", value.asInstanceOf[js.Any])
  }
}
