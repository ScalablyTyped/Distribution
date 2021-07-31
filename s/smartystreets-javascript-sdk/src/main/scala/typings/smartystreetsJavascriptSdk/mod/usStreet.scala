package typings.smartystreetsJavascriptSdk.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object usStreet {
  
  @JSImport("smartystreets-javascript-sdk", "usStreet.Candidate")
  @js.native
  class Candidate protected () extends StObject {
    def this(responseData: js.Any) = this()
    
    var addressee: String = js.native
    
    var analysis: Analysis = js.native
    
    var candidateIndex: js.Any = js.native
    
    var components: js.Array[Componenet] = js.native
    
    var deliveryLine1: String = js.native
    
    var deliveryLine2: String = js.native
    
    var deliveryPointBarcode: String = js.native
    
    var inputIndex: js.Any = js.native
    
    var lastLine: String = js.native
    
    var metadata: Metadata = js.native
  }
  
  @JSImport("smartystreets-javascript-sdk", "usStreet.Lookup")
  @js.native
  class Lookup protected ()
    extends StObject
       with typings.smartystreetsJavascriptSdk.mod.core.Lookup {
    def this(
      street1: js.UndefOr[String],
      street2: js.UndefOr[String],
      secondary: js.UndefOr[String],
      city: js.UndefOr[String],
      state: js.UndefOr[String],
      zipCode: js.UndefOr[String],
      lastLine: js.UndefOr[String],
      addressee: js.UndefOr[String],
      urbanization: js.UndefOr[String],
      `match`: js.UndefOr[String],
      maxCandidates: js.UndefOr[String],
      inputId: js.UndefOr[String]
    ) = this()
    
    var adressee: String = js.native
    
    var city: String = js.native
    
    var inputId: String = js.native
    
    var lastLine: String = js.native
    
    var `match`: String = js.native
    
    var maxCandidates: Double = js.native
    
    var result: js.Array[Candidate] = js.native
    
    var secondary: String = js.native
    
    var state: String = js.native
    
    var street: String = js.native
    
    var street2: String = js.native
    
    var urbanization: String = js.native
    
    var zipCode: String = js.native
  }
  
  trait Analysis extends StObject {
    
    var active: String
    
    var cmra: String
    
    var dpvFootnotes: String
    
    var dpvMatchCode: String
    
    var footnotes: String
    
    var isEwsMatch: Boolean
    
    var isSuiteLinkMatch: Boolean
    
    var lacsLinkCode: js.Any
    
    var lacsLinkIndicator: js.Any
    
    var vacant: String
  }
  object Analysis {
    
    @scala.inline
    def apply(
      active: String,
      cmra: String,
      dpvFootnotes: String,
      dpvMatchCode: String,
      footnotes: String,
      isEwsMatch: Boolean,
      isSuiteLinkMatch: Boolean,
      lacsLinkCode: js.Any,
      lacsLinkIndicator: js.Any,
      vacant: String
    ): Analysis = {
      val __obj = js.Dynamic.literal(active = active.asInstanceOf[js.Any], cmra = cmra.asInstanceOf[js.Any], dpvFootnotes = dpvFootnotes.asInstanceOf[js.Any], dpvMatchCode = dpvMatchCode.asInstanceOf[js.Any], footnotes = footnotes.asInstanceOf[js.Any], isEwsMatch = isEwsMatch.asInstanceOf[js.Any], isSuiteLinkMatch = isSuiteLinkMatch.asInstanceOf[js.Any], lacsLinkCode = lacsLinkCode.asInstanceOf[js.Any], lacsLinkIndicator = lacsLinkIndicator.asInstanceOf[js.Any], vacant = vacant.asInstanceOf[js.Any])
      __obj.asInstanceOf[Analysis]
    }
    
    @scala.inline
    implicit class AnalysisMutableBuilder[Self <: Analysis] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setActive(value: String): Self = StObject.set(x, "active", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCmra(value: String): Self = StObject.set(x, "cmra", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDpvFootnotes(value: String): Self = StObject.set(x, "dpvFootnotes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDpvMatchCode(value: String): Self = StObject.set(x, "dpvMatchCode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFootnotes(value: String): Self = StObject.set(x, "footnotes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsEwsMatch(value: Boolean): Self = StObject.set(x, "isEwsMatch", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsSuiteLinkMatch(value: Boolean): Self = StObject.set(x, "isSuiteLinkMatch", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLacsLinkCode(value: js.Any): Self = StObject.set(x, "lacsLinkCode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLacsLinkIndicator(value: js.Any): Self = StObject.set(x, "lacsLinkIndicator", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVacant(value: String): Self = StObject.set(x, "vacant", value.asInstanceOf[js.Any])
    }
  }
  
  trait Componenet extends StObject {
    
    var cityName: String
    
    var defaultCityName: String
    
    var deliveryPoint: String
    
    var deliveryPointCheckDigit: String
    
    var extraSecondaryDesignator: js.Any
    
    var extraSecondaryNumber: js.Any
    
    var plus4Code: String
    
    var pmbDesignator: js.Any
    
    var pmbNumber: js.Any
    
    var primaryNumber: String
    
    var secondaryDesignator: String
    
    var secondaryNumber: String
    
    var state: String
    
    var streetName: String
    
    var streetPostdirection: String
    
    var streetPredirection: String
    
    var streetSuffix: String
    
    var urbanization: String
    
    var zipCode: String
  }
  object Componenet {
    
    @scala.inline
    def apply(
      cityName: String,
      defaultCityName: String,
      deliveryPoint: String,
      deliveryPointCheckDigit: String,
      extraSecondaryDesignator: js.Any,
      extraSecondaryNumber: js.Any,
      plus4Code: String,
      pmbDesignator: js.Any,
      pmbNumber: js.Any,
      primaryNumber: String,
      secondaryDesignator: String,
      secondaryNumber: String,
      state: String,
      streetName: String,
      streetPostdirection: String,
      streetPredirection: String,
      streetSuffix: String,
      urbanization: String,
      zipCode: String
    ): Componenet = {
      val __obj = js.Dynamic.literal(cityName = cityName.asInstanceOf[js.Any], defaultCityName = defaultCityName.asInstanceOf[js.Any], deliveryPoint = deliveryPoint.asInstanceOf[js.Any], deliveryPointCheckDigit = deliveryPointCheckDigit.asInstanceOf[js.Any], extraSecondaryDesignator = extraSecondaryDesignator.asInstanceOf[js.Any], extraSecondaryNumber = extraSecondaryNumber.asInstanceOf[js.Any], plus4Code = plus4Code.asInstanceOf[js.Any], pmbDesignator = pmbDesignator.asInstanceOf[js.Any], pmbNumber = pmbNumber.asInstanceOf[js.Any], primaryNumber = primaryNumber.asInstanceOf[js.Any], secondaryDesignator = secondaryDesignator.asInstanceOf[js.Any], secondaryNumber = secondaryNumber.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any], streetName = streetName.asInstanceOf[js.Any], streetPostdirection = streetPostdirection.asInstanceOf[js.Any], streetPredirection = streetPredirection.asInstanceOf[js.Any], streetSuffix = streetSuffix.asInstanceOf[js.Any], urbanization = urbanization.asInstanceOf[js.Any], zipCode = zipCode.asInstanceOf[js.Any])
      __obj.asInstanceOf[Componenet]
    }
    
    @scala.inline
    implicit class ComponenetMutableBuilder[Self <: Componenet] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCityName(value: String): Self = StObject.set(x, "cityName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefaultCityName(value: String): Self = StObject.set(x, "defaultCityName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDeliveryPoint(value: String): Self = StObject.set(x, "deliveryPoint", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDeliveryPointCheckDigit(value: String): Self = StObject.set(x, "deliveryPointCheckDigit", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExtraSecondaryDesignator(value: js.Any): Self = StObject.set(x, "extraSecondaryDesignator", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExtraSecondaryNumber(value: js.Any): Self = StObject.set(x, "extraSecondaryNumber", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPlus4Code(value: String): Self = StObject.set(x, "plus4Code", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPmbDesignator(value: js.Any): Self = StObject.set(x, "pmbDesignator", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPmbNumber(value: js.Any): Self = StObject.set(x, "pmbNumber", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrimaryNumber(value: String): Self = StObject.set(x, "primaryNumber", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSecondaryDesignator(value: String): Self = StObject.set(x, "secondaryDesignator", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSecondaryNumber(value: String): Self = StObject.set(x, "secondaryNumber", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setState(value: String): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStreetName(value: String): Self = StObject.set(x, "streetName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStreetPostdirection(value: String): Self = StObject.set(x, "streetPostdirection", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStreetPredirection(value: String): Self = StObject.set(x, "streetPredirection", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStreetSuffix(value: String): Self = StObject.set(x, "streetSuffix", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUrbanization(value: String): Self = StObject.set(x, "urbanization", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setZipCode(value: String): Self = StObject.set(x, "zipCode", value.asInstanceOf[js.Any])
    }
  }
  
  trait Metadata extends StObject {
    
    var buildingDefaultIndicator: js.Any
    
    var carrierRoute: String
    
    var congressionalDistrict: String
    
    var countyFips: String
    
    var countyName: String
    
    var elotSequence: String
    
    var elotSort: String
    
    var isEwsMatch: Boolean
    
    var latitude: Double
    
    var longitude: Double
    
    var obeysDst: Boolean
    
    var precision: String
    
    var rdi: String
    
    var recordType: String
    
    var timeZone: String
    
    var utcOffset: Double
    
    var zipType: String
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
    implicit class MetadataMutableBuilder[Self <: Metadata] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBuildingDefaultIndicator(value: js.Any): Self = StObject.set(x, "buildingDefaultIndicator", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCarrierRoute(value: String): Self = StObject.set(x, "carrierRoute", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCongressionalDistrict(value: String): Self = StObject.set(x, "congressionalDistrict", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCountyFips(value: String): Self = StObject.set(x, "countyFips", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCountyName(value: String): Self = StObject.set(x, "countyName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setElotSequence(value: String): Self = StObject.set(x, "elotSequence", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setElotSort(value: String): Self = StObject.set(x, "elotSort", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsEwsMatch(value: Boolean): Self = StObject.set(x, "isEwsMatch", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLatitude(value: Double): Self = StObject.set(x, "latitude", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLongitude(value: Double): Self = StObject.set(x, "longitude", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setObeysDst(value: Boolean): Self = StObject.set(x, "obeysDst", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrecision(value: String): Self = StObject.set(x, "precision", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRdi(value: String): Self = StObject.set(x, "rdi", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRecordType(value: String): Self = StObject.set(x, "recordType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTimeZone(value: String): Self = StObject.set(x, "timeZone", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUtcOffset(value: Double): Self = StObject.set(x, "utcOffset", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setZipType(value: String): Self = StObject.set(x, "zipType", value.asInstanceOf[js.Any])
    }
  }
}
