package typings.smartystreetsJavascriptSdk.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object usStreet {
  
  /**
    * A match candidate
    *
    * https://smartystreets.com/docs/cloud/us-street-api#root
    */
  @JSImport("smartystreets-javascript-sdk", "usStreet.Candidate")
  @js.native
  open class Candidate protected () extends StObject {
    def this(responseData: Any) = this()
    
    /**
      * The name of the person or company at this address. This value is taken directly from the addressee input field. Very rarely, this field might be filled automatically based on the USPS
      * address record.
      */
    var addressee: String = js.native
    
    /** @see Analysis */
    var analysis: Analysis = js.native
    
    /** An input address can match multiple valid addresses. This ties the candidates to the input index. */
    var candidateIndex: Double = js.native
    
    /** @see Component */
    var components: Component = js.native
    
    /**
      * Contains the first delivery line (usually the street address). This can include any of the following:
      * - urbanization (Puerto Rico only)
      * - primary number
      * - street predirection
      * - street name
      * - street suffix
      * - street postdirection
      * - secondary designator
      * - secondary number
      * - extra secondary designator
      * - extra secondary number
      * - PMB designator
      * - PMB number
      */
    var deliveryLine1: String = js.native
    
    /** The second delivery line (if needed). It is common for this field to remain empty, but it may contain a private mailbox number. */
    var deliveryLine2: String = js.native
    
    /** 12-digit POSTNET™ barcode; consists of 5-digit ZIP Code, 4-digit add-on code, 2-digit delivery point, and 1-digit check digit. */
    var deliveryPointBarcode: String = js.native
    
    /** The order in which this address was submitted with the others (0 if alone) */
    var inputIndex: Double = js.native
    
    /** City, state, and ZIP Code combined */
    var lastLine: String = js.native
    
    /** @see Metadata */
    var metadata: Metadata = js.native
  }
  
  @JSImport("smartystreets-javascript-sdk", "usStreet.Lookup")
  @js.native
  open class Lookup protected () extends StObject {
    def this(
      /**
      * The street line of the address, or the entire address ("freeform" input).
      *
      * Freeform input can be up to 100 characters but only the first 50 will be considered for the street portion of the address. Freeform inputs should NOT include any form of country
      * information (like "USA").
      */
    street1: js.UndefOr[String],
      /**
      * Any extra address information
      * @example Leave it on the front porch.
      */
    street2: js.UndefOr[String],
      /**
      * Apartment, suite, or office number
      * @example "Apt 52" or simply "52"; not "Apt52"
      */
    secondary: js.UndefOr[String],
      /** The city name */
    city: js.UndefOr[String],
      /** The state name or abbreviation */
    state: js.UndefOr[String],
      /** The ZIP Code */
    zipCode: js.UndefOr[String],
      /** City, state, and ZIP Code combined */
    lastLine: js.UndefOr[String],
      /** The name of the person or company at this address */
    addressee: js.UndefOr[String],
      /** The neighborhood (only Puerto Rican addresses) */
    urbanization: js.UndefOr[String],
      /**
      * The match output strategy to be employed for this lookup. Valid values are:
      * - strict  The API will return detailed output only if a valid match is found. Otherwise the API response will be an empty array.
      * - invalid  The API will return detailed output for both valid and invalid addresses. To find out if the address is valid, check the [dpv_match_code](
      * https://smartystreets.com/docs/cloud/us-street-api#dpvmatchcode). Values of Y, S, or D indicate a valid address.
      *
      * Notes:
      *
      * 1. The invalid setting is not compatible with freeform address input. For all addresses submitted freeform, the API will automatically employ a strict match output strategy.
      * 2. When submitting addresses in components, setting match to invalid will prevent the API from finding valid matches for ambiguous address input.
      * @default strict
      */
    `match`: js.UndefOr[String],
      /**
      * The maximum number of addresses returned when the input is ambiguous
      * @default 1
      */
    maxCandidates: js.UndefOr[String],
      /** A unique identifier for this address used in your application; this field will be copied into the output. */
    inputId: js.UndefOr[String]
    ) = this()
    
    /** The name of the person or company at this address */
    var addressee: String = js.native
    
    /** The city name */
    var city: String = js.native
    
    /** A unique identifier for this address used in your application; this field will be copied into the output. */
    var inputId: String = js.native
    
    /** City, state, and ZIP Code combined */
    var lastLine: String = js.native
    
    /**
      * The match output strategy to be employed for this lookup. Valid values are:
      * - strict  The API will return detailed output only if a valid match is found. Otherwise the API response will be an empty array.
      * - invalid  The API will return detailed output for both valid and invalid addresses. To find out if the address is valid, check the [dpv_match_code](
      * https://smartystreets.com/docs/cloud/us-street-api#dpvmatchcode). Values of Y, S, or D indicate a valid address.
      *
      * Notes:
      *
      * 1. The invalid setting is not compatible with freeform address input. For all addresses submitted freeform, the API will automatically employ a strict match output strategy.
      * 2. When submitting addresses in components, setting match to invalid will prevent the API from finding valid matches for ambiguous address input.
      * @default strict
      */
    var `match`: String = js.native
    
    /**
      * The maximum number of addresses returned when the input is ambiguous
      * @default 1
      */
    var maxCandidates: Double = js.native
    
    var result: js.Array[Candidate] = js.native
    
    /**
      * Apartment, suite, or office number
      * @example "Apt 52" or simply "52"; not "Apt52"
      */
    var secondary: String = js.native
    
    /** The state name or abbreviation */
    var state: String = js.native
    
    /**
      * The street line of the address, or the entire address ("freeform" input).
      *
      * Freeform input can be up to 100 characters but only the first 50 will be considered for the street portion of the address. Freeform inputs should NOT include any form of
      * country information (like "USA").
      */
    var street: String = js.native
    
    /**
      * Any extra address information
      * @example Leave it on the front porch.
      */
    var street2: String = js.native
    
    /** The neighborhood (only Puerto Rican addresses) */
    var urbanization: String = js.native
    
    /** The ZIP Code */
    var zipCode: String = js.native
  }
  
  /**
    * Analysis
    *
    * https://smartystreets.com/docs/cloud/us-street-api#analysis
    */
  trait Analysis extends StObject {
    
    /**
      * Indicates whether the address is active or not, based on USPS data. Note that the USPS is often months behind in updating this data point, so use with caution. Some users may prefer not to
      * base any decisions on the active status of an address. More info [here](https://smartystreets.com/articles/what-is-an-inactive-no-stat-address).
      * - **Y** — Address is active.
      * - **N** — Address is inactive.
      * - **[blank]** — Active status is not known by the USPS.
      */
    var active: String
    
    /**
      * Indicates whether the address is associated with a Commercial Mail Receiving Agency (CMRA), also known as a private mailbox (PMB) operator. A CMRA is a business through which USPS mail may
      * be sent or received, for example the UPS Store and Mailboxes Etc.
      * - **Y** — Address is associated with a valid CMRA.
      * - **N** — Address is not associated with a valid CMRA.
      * - **[blank]** — Address was not submitted for CMRA verification.
      */
    var cmra: String
    
    /**
      * Information related to the delivery point validation of this address. All these footnotes have a length of 2 characters, and there may be up to 14 footnotes.
      * - **AA** — Street name, city, state, and ZIP are all valid. (e.g., [2335 S State St Ste 300 Provo UT](
      * https://smartystreets.com/products/single-address?street=%202335%20S%20State%20St%20Ste%20300&street2=&city=Provo&state=Ut&zipcode=&address-type=us-street-components))
      * - **A1** — Address is invalid. (e.g., [3214 N University Ave New York NY](
      * https://smartystreets.com/products/single-address?street=3214%20N%20university%20Ave&street2=&city=new%20york%20&state=ny&zipcode=&address-type=us-street-components))
      * - BB** — Entire address is valid. (e.g., [2335 S State St Ste 300 Provo UT](
      * https://smartystreets.com/products/single-address?street=%202335%20S%20State%20St%20Ste%20300&street2=&city=Provo&state=Ut&zipcode=&address-type=us-street-components))
      * - **CC** — The submitted secondary information (apartment, suite, etc.) was not recognized. (e.g., [2335 S State St Ste 500 Provo UT](
      * https://smartystreets.com/products/single-address?street=%202335%20S%20State%20St%20Ste%20500&street2=&city=Provo&state=Ut&zipcode=&address-type=us-street-components))
      * - **F1** — Military or diplomatic address (e.g., [Unit 2050 Box 4190 APO AP 96278](
      * https://smartystreets.com/products/single-address?street=Unit%202050%20Box%204190%20&street2=&city=APO&state=AP&zipcode=96278&address-type=us-street-components))
      * - **G1** — General delivery address (e.g., [General Delivery Provo UT 84601](
      * https://smartystreets.com/products/single-address?street=General%20Delivery&street2=&city=Provo&state=UT&zipcode=84601&address-type=us-street-components))
      * - **M1** — Primary number (e.g., house number) is missing. (e.g., [N University Ave Provo UT](
      * https://smartystreets.com/products/single-address?street=N%20University%20ave&street2=&city=Provo&state=UT&zipcode=&address-type=us-street-components))
      * - **M3** — Primary number (e.g., house number) is invalid. (e.g., [16 N University Ave Provo UT](
      * https://smartystreets.com/products/single-address?street=16%20N%20University%20Ave%20&street2=&city=Provo&state=UT&zipcode=&address-type=us-street-components))
      * - **N1** — Address is missing secondary information (apartment, suite, etc.). (e.g., [2335 S State St Provo UT](
      * https://smartystreets.com/products/single-address?street=2335%20S%20State%20St&street2=&city=Provo&state=UT&zipcode=&address-type=us-street-components))
      * - **PB** — PO Box street style address. (e.g., [555 S B B King Blvd Unit 1 Memphis TN 38103](
      * https://smartystreets.com/products/single-address?street=555%20S%20B%20B%20King%20Blvd%20unit%201&street2=&city=Memphis&state=TN&zipcode=&address-type=us-street-components))
      * - **P1** — PO, RR, or HC box number is missing. (e.g., [Dept 126 Denver CO 802910126](
      * https://smartystreets.com/products/single-address?street=Dept%20126&street2=&city=Denver&state=CO&zipcode=802910126&address-type=us-street-components))
      * - **P3** — PO, RR, or HC box number is invalid. (e.g., [PO BOX 60780 FAIRBANKS AK 99706](
      * https://smartystreets.com/products/single-address?street=PO%20BOX%2060780&street2=&city=FAIRBANKS&state=AK%20&zipcode=99706&address-type=us-street-components))
      * - **RR** — Confirmed address with private mailbox (PMB) info. (e.g., [3214 N University Ave #409 Provo UT](
      * https://smartystreets.com/products/single-address?street=3214%20n%20university%20ave%20%23409&street2=&city=Provo&state=UT&zipcode=&address-type=us-street-components))
      * - **R1** — Confirmed address without private mailbox (PMB) info. (e.g., [3214 N University Ave Provo UT](
      * https://smartystreets.com/products/single-address?street=3214%20N%20university%20ave&street2=&city=provo&state=ut&zipcode=&address-type=us-street-components))
      * - **R7** — Confirmed as a valid address that doesn't currently receive US Postal Service street delivery. (e.g., [6D Cruz Bay St John VI 00830](
      * https://smartystreets.com/products/single-address?street=6D%20Cruz%20Bay%20&street2=&city=St%20John&state=VI&zipcode=00830&address-type=us-street-components))
      * - **U1** — Address has a ["unique" ZIP Code](https://smartystreets.com/articles/unique-zip-codes). (e.g., [100 North Happy Street 12345](
      * https://smartystreets.com/products/single-address?street=100%20North%20Happy%20St&street2=&city=&state=&zipcode=12345&address-type=us-street-components))
      *
      * Here are some common combinations:
      * - AABB - ZIP, state, city, street name, and primary number match.
      * - AAM1 - ZIP, state, city, and street name match, but the primary number is missing.
      * - AAM3 - ZIP, state, city, and street name match, but the primary number is invalid.
      * - AAN1 - ZIP, state, city, street name, and primary number match, but there is secondary information such as apartment or suite that would be helpful.
      * - AABBR1 - ZIP, state, city, street name, and primary number match. Address confirmed without private mailbox (PMB) info.
      */
    var dpvFootnotes: String
    
    /**
      * Status of the Delivery Point Validation (DPV). This lets you know if the USPS delivers mail to the address.
      * - **Y** — Confirmed; entire address is present in the USPS data. To be certain the address is actually deliverable, verify that the dpv_vacant field has a value of N. You may also want to
      * verify that the active field has a value of Y. However, the USPS is often months behind in updating this data point, so use with caution. Some users may prefer not to base any decisions on
      * the active status of an address. More info here. (e.g., 1600 Amphitheatre Pkwy Mountain View, CA)
      * - **N** — Not confirmed; address is not present in the USPS data.
      * - **S** — Confirmed by ignoring secondary info; the main address is present in the USPS data, but the submitted secondary information (apartment, suite, etc.) was not recognized. (e.g., 62
      * Ea Darden Dr Apt 298 Anniston, AL)
      * - **D** — Confirmed but missing secondary info; the main address is present in the USPS data, but it is missing secondary information (apartment, suite, etc.). (e.g., 122 Mast Rd Lee, NH)
      * - **[blank or null]** — The address is not present in the USPS database.
      */
    var dpvMatchCode: js.UndefOr[String] = js.undefined
    
    /**
      * Indicates which changes were made to the input address. Footnotes are delimited by a # character. See the [footnotes](https://smartystreets.com/docs/cloud/us-street-api#footnotes) table
      * below for details.
      */
    var footnotes: String
    
    /**
      * @deprecated
      */
    var isEwsMatch: Boolean
    
    /**
      * Indicates a match (or not) to the USPS SuiteLink data. SuiteLink attempts to provide secondary information such as "suite" or "apartment" whenever there is a match based on address and
      * company name.
      * - **true** — There was a SuiteLink match and the result is provided.
      * - **false** — There was no SuiteLink match.
      */
    var isSuiteLinkMatch: Boolean
    
    /**
      *  The reason for the LACSLink indication that was given (below)
      * - **A** — Match: Address provided. LACSLink record match was found, and a converted address was provided.
      * - **00** — No Match. No converted address. No soup for you!
      * - **09** — Match: No new address. LACSLink matched an input address to an old address which is a "high-rise default" address; no new address was provided.
      * - **14** — Match: No conversion. Found a LACSLink record, but couldn't convert the data to a deliverable address.
      * - **92** — Match: Dropped secondary number. LACSLink record was matched after dropping the secondary number from input.
      * - **[blank]** — No LACSLink lookup attempted.
      */
    var lacsLinkCode: String
    
    /**
      * Indicates whether there is an address match in the LACSLink database.
      * - **Y** — LACS record match; a new address could be furnished because the input record matched a record in the master file.
      * - **S** — LACS record - secondary number dropped; the record is a ZIP+4 street level or high-rise match. The input record matched a master file record, but the input address had a
      * secondary number and the master file record did not.
      * - **N** — No match; a new address could not be furnished; the input record could not be matched to a record in the master file.
      * - **F** — False positive; a false positive record was detected.
      * - **[blank]** — No LACSLink lookup attempted.
      */
    var lacsLinkIndicator: Any
    
    /**
      * Indicates that a delivery point was active in the past but is currently vacant (in most cases, unoccupied over 90 days) and is not receiving deliveries. This status is often obtained when
      * mail receptacles aren't being emptied and are filling up, so mail is held at the post office for a certain number of days before the delivery point is marked vacant.
      * - **Y**— Address is vacant.
      * - **N** — Address is not vacant.
      * - **[blank]** — Address was not submitted for vacancy verification.
      */
    var vacant: String
  }
  object Analysis {
    
    inline def apply(
      active: String,
      cmra: String,
      dpvFootnotes: String,
      footnotes: String,
      isEwsMatch: Boolean,
      isSuiteLinkMatch: Boolean,
      lacsLinkCode: String,
      lacsLinkIndicator: Any,
      vacant: String
    ): Analysis = {
      val __obj = js.Dynamic.literal(active = active.asInstanceOf[js.Any], cmra = cmra.asInstanceOf[js.Any], dpvFootnotes = dpvFootnotes.asInstanceOf[js.Any], footnotes = footnotes.asInstanceOf[js.Any], isEwsMatch = isEwsMatch.asInstanceOf[js.Any], isSuiteLinkMatch = isSuiteLinkMatch.asInstanceOf[js.Any], lacsLinkCode = lacsLinkCode.asInstanceOf[js.Any], lacsLinkIndicator = lacsLinkIndicator.asInstanceOf[js.Any], vacant = vacant.asInstanceOf[js.Any])
      __obj.asInstanceOf[Analysis]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Analysis] (val x: Self) extends AnyVal {
      
      inline def setActive(value: String): Self = StObject.set(x, "active", value.asInstanceOf[js.Any])
      
      inline def setCmra(value: String): Self = StObject.set(x, "cmra", value.asInstanceOf[js.Any])
      
      inline def setDpvFootnotes(value: String): Self = StObject.set(x, "dpvFootnotes", value.asInstanceOf[js.Any])
      
      inline def setDpvMatchCode(value: String): Self = StObject.set(x, "dpvMatchCode", value.asInstanceOf[js.Any])
      
      inline def setDpvMatchCodeUndefined: Self = StObject.set(x, "dpvMatchCode", js.undefined)
      
      inline def setFootnotes(value: String): Self = StObject.set(x, "footnotes", value.asInstanceOf[js.Any])
      
      inline def setIsEwsMatch(value: Boolean): Self = StObject.set(x, "isEwsMatch", value.asInstanceOf[js.Any])
      
      inline def setIsSuiteLinkMatch(value: Boolean): Self = StObject.set(x, "isSuiteLinkMatch", value.asInstanceOf[js.Any])
      
      inline def setLacsLinkCode(value: String): Self = StObject.set(x, "lacsLinkCode", value.asInstanceOf[js.Any])
      
      inline def setLacsLinkIndicator(value: Any): Self = StObject.set(x, "lacsLinkIndicator", value.asInstanceOf[js.Any])
      
      inline def setVacant(value: String): Self = StObject.set(x, "vacant", value.asInstanceOf[js.Any])
    }
  }
  
  /**
    * Component
    *
    * https://smartystreets.com/docs/cloud/us-street-api#components
    */
  trait Component extends StObject {
    
    /** The USPS-preferred city name for this particular address, or an acceptable alternate if provided by the user */
    var cityName: String
    
    /** The default city name for this 5-digit ZIP Code */
    var defaultCityName: String
    
    /**
      * The last two digits of the house/box number, unless an "H" record is matched, in which case this is the secondary unit number representing the delivery point information to form the
      * delivery point barcode (DPBC).
      */
    var deliveryPoint: String
    
    /** Correction character, or check digit, for the 11-digit barcode */
    var deliveryPointCheckDigit: String
    
    /**
      * Description of the location type within a campus
      * @example Bldg, Unit, Lot, etc.)
      */
    var extraSecondaryDesignator: String
    
    /**
      * Descriptive information about the location of a building within a campus
      * @example E-5 in "5619 Loop 1604, Bldg E-5, Ste. 101 San Antonio TX"
      */
    var extraSecondaryNumber: String
    
    /** The 4-digit add-on code (more specific than 5-digit ZIP) */
    var plus4Code: String
    
    /** The private mailbox unit designator, assigned by a CMRA */
    var pmbDesignator: Any
    
    /** The private mailbox number, assigned by a CMRA */
    var pmbNumber: Any
    
    /** The house, PO Box, or building number */
    var primaryNumber: String
    
    /** Describes location within a complex/building (Ste, Apt, etc.) */
    var secondaryDesignator: String
    
    /** Apartment or suite number, if any */
    var secondaryNumber: String
    
    /** The two-letter state abbreviation */
    var state: String
    
    /** The name of the street */
    var streetName: String
    
    /** Directional information after a street name (N, SW, etc.) */
    var streetPostdirection: String
    
    /** Directional information before a street name (N, SW, etc.) */
    var streetPredirection: String
    
    /** Abbreviated value describing the street (St, Ave, Blvd, etc.) */
    var streetSuffix: String
    
    /** The neighborhood, or city subdivision; used with Puerto Rican addresses */
    var urbanization: String
    
    /** The [5-digit ZIP Code](https://smartystreets.com/docs/zip-codes-101) */
    var zipCode: String
  }
  object Component {
    
    inline def apply(
      cityName: String,
      defaultCityName: String,
      deliveryPoint: String,
      deliveryPointCheckDigit: String,
      extraSecondaryDesignator: String,
      extraSecondaryNumber: String,
      plus4Code: String,
      pmbDesignator: Any,
      pmbNumber: Any,
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
    ): Component = {
      val __obj = js.Dynamic.literal(cityName = cityName.asInstanceOf[js.Any], defaultCityName = defaultCityName.asInstanceOf[js.Any], deliveryPoint = deliveryPoint.asInstanceOf[js.Any], deliveryPointCheckDigit = deliveryPointCheckDigit.asInstanceOf[js.Any], extraSecondaryDesignator = extraSecondaryDesignator.asInstanceOf[js.Any], extraSecondaryNumber = extraSecondaryNumber.asInstanceOf[js.Any], plus4Code = plus4Code.asInstanceOf[js.Any], pmbDesignator = pmbDesignator.asInstanceOf[js.Any], pmbNumber = pmbNumber.asInstanceOf[js.Any], primaryNumber = primaryNumber.asInstanceOf[js.Any], secondaryDesignator = secondaryDesignator.asInstanceOf[js.Any], secondaryNumber = secondaryNumber.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any], streetName = streetName.asInstanceOf[js.Any], streetPostdirection = streetPostdirection.asInstanceOf[js.Any], streetPredirection = streetPredirection.asInstanceOf[js.Any], streetSuffix = streetSuffix.asInstanceOf[js.Any], urbanization = urbanization.asInstanceOf[js.Any], zipCode = zipCode.asInstanceOf[js.Any])
      __obj.asInstanceOf[Component]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Component] (val x: Self) extends AnyVal {
      
      inline def setCityName(value: String): Self = StObject.set(x, "cityName", value.asInstanceOf[js.Any])
      
      inline def setDefaultCityName(value: String): Self = StObject.set(x, "defaultCityName", value.asInstanceOf[js.Any])
      
      inline def setDeliveryPoint(value: String): Self = StObject.set(x, "deliveryPoint", value.asInstanceOf[js.Any])
      
      inline def setDeliveryPointCheckDigit(value: String): Self = StObject.set(x, "deliveryPointCheckDigit", value.asInstanceOf[js.Any])
      
      inline def setExtraSecondaryDesignator(value: String): Self = StObject.set(x, "extraSecondaryDesignator", value.asInstanceOf[js.Any])
      
      inline def setExtraSecondaryNumber(value: String): Self = StObject.set(x, "extraSecondaryNumber", value.asInstanceOf[js.Any])
      
      inline def setPlus4Code(value: String): Self = StObject.set(x, "plus4Code", value.asInstanceOf[js.Any])
      
      inline def setPmbDesignator(value: Any): Self = StObject.set(x, "pmbDesignator", value.asInstanceOf[js.Any])
      
      inline def setPmbNumber(value: Any): Self = StObject.set(x, "pmbNumber", value.asInstanceOf[js.Any])
      
      inline def setPrimaryNumber(value: String): Self = StObject.set(x, "primaryNumber", value.asInstanceOf[js.Any])
      
      inline def setSecondaryDesignator(value: String): Self = StObject.set(x, "secondaryDesignator", value.asInstanceOf[js.Any])
      
      inline def setSecondaryNumber(value: String): Self = StObject.set(x, "secondaryNumber", value.asInstanceOf[js.Any])
      
      inline def setState(value: String): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
      
      inline def setStreetName(value: String): Self = StObject.set(x, "streetName", value.asInstanceOf[js.Any])
      
      inline def setStreetPostdirection(value: String): Self = StObject.set(x, "streetPostdirection", value.asInstanceOf[js.Any])
      
      inline def setStreetPredirection(value: String): Self = StObject.set(x, "streetPredirection", value.asInstanceOf[js.Any])
      
      inline def setStreetSuffix(value: String): Self = StObject.set(x, "streetSuffix", value.asInstanceOf[js.Any])
      
      inline def setUrbanization(value: String): Self = StObject.set(x, "urbanization", value.asInstanceOf[js.Any])
      
      inline def setZipCode(value: String): Self = StObject.set(x, "zipCode", value.asInstanceOf[js.Any])
    }
  }
  
  /**
    * Metadata
    *
    * https://smartystreets.com/docs/cloud/us-street-api#metadata
    */
  trait Metadata extends StObject {
    
    /**
      * Indicates whether the address is the "default" address for a building; for example, the main lobby
      * - **Y** — Yes
      * - **N** — No
      */
    var buildingDefaultIndicator: Boolean
    
    /**
      * The postal carrier route for the address. Consists of a one-letter prefix followed by a three-digit route designator. (e.g., C007, R123)
      * - **C** — Carrier Route (commonly termed "City Route")
      * - **R** — Rural Route
      * - **H** — Highway Contract Route
      * - **B** — Post Office Box Section
      * - **G** — General Delivery Unit
      *
      * Routes C770 through C779 pertain to [PO Box Street Addresses](https://smartystreets.com/articles/is-there-any-preference-between-po-box-and-street-address#pbsa).
      */
    var carrierRoute: String
    
    /**
      * The congressional district to which the address belongs. Output will be two digits from 01 - 53 or "AL." "AL" means that the entire state (or territory) is covered by a single
      * congressional district. These include Alaska, Delaware, Montana, North Dakota, South Dakota, Vermont, Wyoming, Washington DC, Virgin Islands, and other territories.
      */
    var congressionalDistrict: String
    
    /**
      * The [5-digit county FIPS (Federal Information Processing Standards) code](https://smartystreets.com/articles/county-fips-codes). It is a combination of a [2-digit state FIPS code](
      * https://bit.ly/3pYZfbr) and a [3-digit county code](https://smartystreets.com/articles/county-fips-codes#how-to-read-a-county-fips-code) assigned by the NIST (National Institute of
      * Standards and Technology).
      */
    var countyFips: String
    
    /** The name of the [county in which the address is located](https://smartystreets.com/articles/county-by-zip-code) */
    var countyName: String
    
    /** [eLOT](https://postalpro.usps.com/address-quality/elot) (Enhanced Line of Travel) 4-digit sequence number */
    var elotSequence: String
    
    /**
      * eLOT (Enhanced Line of Travel) product was developed to give mailers the ability to sort their mailings by line of travel sequence.
      * - **A** - Ascending
      * - **D** - Descending
      * - **[blank]** - Address not submitted for eLOT
      */
    var elotSort: String
    
    /**
      * Early warning system flag; a positive result indicates the street of the address is not yet ready for mail delivery and that the address will soon be added to the master ZIP+4 file in the
      * coming weeks or months. This commonly occurs for new streets or streets undergoing a name change.
      * - **true** — The address was flagged by EWS, preventing a ZIP+4 match.
      * - **[blank]** — Address was not flagged by EWS.
      */
    var isEwsMatch: js.UndefOr[Boolean] = js.undefined
    
    /**
      * The horizontal component used for geographic positioning. It is the angle between 0° (the equator) and ±90° (north or south) at the poles. It is the first value in an ordered pair of
      * (latitude, longitude). A negative number denotes a location below the equator; a positive number is above the equator. Combining lat/long values enables you to pinpoint addresses on a map.
      */
    var latitude: Double
    
    /**
      * The vertical component used for geographic positioning. It is the angle between 0° (the Prime Meridian) and ±180° (westward or eastward). It is the second number in an ordered pair of
      * (latitude, longitude). A negative number indicates a location west of Greenwich, England; a positive number east. Combining lat/long values enables you to pinpoint addresses on a map.
      */
    var longitude: Double
    
    /**
      * Indicates if the time zone "obeys," or, in other words, adjusts their clocks forward and back with the seasons. This information is particularly useful to determine time in other time
      * zones with areas that may or may not use daylight saving time - for example, Arizona, Hawaii, and, of all places, Indiana.
      * - **true** — Time zone observes daylight saving time.
      *
      * If dst is absent from the response, then time zone does not observe daylight saving time.
      */
    var obeysDst: Boolean
    
    /**
      * Indicates the precision of the latitude and longitude values.
      * - **Unknown** — Coordinates not known. Reasons could include: address is invalid, military address (APO or FPO), lat/lon coordinates not available.
      * - **Zip5** — Accurate to a 5-digit ZIP Code level (least precise)
      * - **Zip6** — Accurate to a 6-digit ZIP Code level
      * - **Zip7** — Accurate to a 7-digit ZIP Code level
      * - **Zip8** — Accurate to an 8-digit ZIP Code level
      * - **Zip9** — Accurate to a 9-digit ZIP Code level (most precise with the basic subscription)
      * - **Parcel** — Accurate to the centroid of a property parcel. Requires the US Rooftop Geocoding subscription.
      * - **Rooftop** — Accurate to the rooftop of a structure for this address. Requires the US Rooftop Geocoding subscription.
      *
      * Note: Concerning addresses for which the ZIP9 precision is not available, the ZIP# precision is interpolated based on neighboring addresses. Thus, ZIP7 is an average of all the lat/long
      * coordinates of nearby ZIP Codes that share those first 7 digits.
      */
    var precision: String
    
    /**
      * Residential Delivery Indicator (residential or commercial)
      * - **Residential** — The address is a residential address.
      * - **Commercial** — The address is a commercial address.
      * - **[blank]** — This happens when the address is invalid or we don't have enough information to ascertain RDI status. The [Bulk Address Validation Tool](
      * https://smartystreets.com/docs/plugins/smartylist) translates a [blank] RDI value to "Unknown."
      *
      * Note: For some reason, known only to the US Postal Service, PO Boxes are always marked as "Residential."
      */
    var rdi: js.UndefOr[String] = js.undefined
    
    /**
      * Indicates the type of record that was matched. Only given if a DPV match is made.
      * - **F** - Firm; the finest level of match available for an address. (e.g., [Julie Julia 11300 Center Ave Gilroy CA 95020-9257](https://bit.ly/36OLtAj))
      * - **G** - General Delivery; for mail to be held at local post offices. (e.g., [General Delivery Provo UT 84601](
      * https://smartystreets.com/products/single-address?street=General%20Delivery&street2=&city=provo&state=Ut&zipcode=&address-type=us-street-components))
      * - **H** — High-rise; address contains apartment or building sub-units. (e.g., [1600 Pennsylvania Ave SE Washington DC 20003-3228](
      * https://smartystreets.com/products/single-address?street=1600%20Pennsylvania%20ave%20SE&street2=&city=washington&state=DC&zipcode=20003-3228&address-type=us-street-components))
      * - **P** — Post Office box (e.g., [PO Box 4735 Tulsa OK 74159-0735](
      * https://smartystreets.com/products/single-address?street=PO%20Box%204735&street2=&city=Tulsa&state=OK&zipcode=74159-0735&address-type=us-street-components))
      * - **R** — Rural Route or Highway Contract; may have box number ranges. (e.g., [RR 2 Box 4560 Anasco PR 00610-9393](
      * https://smartystreets.com/products/single-address?street=RR%202%20box%204560&street2=&city=Anasco&state=PR&zipcode=00610-9393&address-type=us-street-components))
      * - **S** — Street; address contains a valid primary number range. (e.g., [16990 Monterey Rd Lake Elsinore CA 92530-7529](
      * https://smartystreets.com/products/single-address?street=16990%20MOnterey%20rd&street2=&city=lake%20elsinore&state=ca&zipcode=92530&address-type=us-street-components))
      * - **[blank]** — No record type because address did not make a valid DPV match
      */
    var recordType: String
    
    /**
      * Indicates the common name of the time zone associated with the address.
      *
      * **Valid Responses**:
      * Alaska, Atlantic, Central, Eastern, Hawaii, Mountain, None, Pacific, Samoa, UTC+9, UTC+10, UTC+11, UTC+12
      */
    var timeZone: String
    
    /**
      * Indicates the number of hours the time zone is offset from Universal Time Coordinated (UTC), the international time standard, also known as Greenwich Meridian Time (GMT).
      *
      * **Valid Responses**:
      * -11, -10, -9, -8, -7, -6, -5, -4, 0, 9, 10, 11, 12
      */
    var utcOffset: Double
    
    /**
      * Indicates the type of the ZIP Code for the address that was matched. Only given if a 5-digit match is made.
      * - **Unique** — The ZIP Code consists of a single delivery point, pertaining to a US Postal Service customer (like a large business or government agency) that routes all of its own mail
      * internally.
      * - **Military** — The ZIP Code pertains to military units and diplomatic organizations, often in foreign locations.
      * - **POBox** — The ZIP Code is a [PO Box ZIP Code](https://smartystreets.com/articles/po-box-only-zip-codes) and is assigned to a collection of Post Office Boxes.
      * - **Standard** — The ZIP Code does not pertain to any of the above categories.
      */
    var zipType: String
  }
  object Metadata {
    
    inline def apply(
      buildingDefaultIndicator: Boolean,
      carrierRoute: String,
      congressionalDistrict: String,
      countyFips: String,
      countyName: String,
      elotSequence: String,
      elotSort: String,
      latitude: Double,
      longitude: Double,
      obeysDst: Boolean,
      precision: String,
      recordType: String,
      timeZone: String,
      utcOffset: Double,
      zipType: String
    ): Metadata = {
      val __obj = js.Dynamic.literal(buildingDefaultIndicator = buildingDefaultIndicator.asInstanceOf[js.Any], carrierRoute = carrierRoute.asInstanceOf[js.Any], congressionalDistrict = congressionalDistrict.asInstanceOf[js.Any], countyFips = countyFips.asInstanceOf[js.Any], countyName = countyName.asInstanceOf[js.Any], elotSequence = elotSequence.asInstanceOf[js.Any], elotSort = elotSort.asInstanceOf[js.Any], latitude = latitude.asInstanceOf[js.Any], longitude = longitude.asInstanceOf[js.Any], obeysDst = obeysDst.asInstanceOf[js.Any], precision = precision.asInstanceOf[js.Any], recordType = recordType.asInstanceOf[js.Any], timeZone = timeZone.asInstanceOf[js.Any], utcOffset = utcOffset.asInstanceOf[js.Any], zipType = zipType.asInstanceOf[js.Any])
      __obj.asInstanceOf[Metadata]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Metadata] (val x: Self) extends AnyVal {
      
      inline def setBuildingDefaultIndicator(value: Boolean): Self = StObject.set(x, "buildingDefaultIndicator", value.asInstanceOf[js.Any])
      
      inline def setCarrierRoute(value: String): Self = StObject.set(x, "carrierRoute", value.asInstanceOf[js.Any])
      
      inline def setCongressionalDistrict(value: String): Self = StObject.set(x, "congressionalDistrict", value.asInstanceOf[js.Any])
      
      inline def setCountyFips(value: String): Self = StObject.set(x, "countyFips", value.asInstanceOf[js.Any])
      
      inline def setCountyName(value: String): Self = StObject.set(x, "countyName", value.asInstanceOf[js.Any])
      
      inline def setElotSequence(value: String): Self = StObject.set(x, "elotSequence", value.asInstanceOf[js.Any])
      
      inline def setElotSort(value: String): Self = StObject.set(x, "elotSort", value.asInstanceOf[js.Any])
      
      inline def setIsEwsMatch(value: Boolean): Self = StObject.set(x, "isEwsMatch", value.asInstanceOf[js.Any])
      
      inline def setIsEwsMatchUndefined: Self = StObject.set(x, "isEwsMatch", js.undefined)
      
      inline def setLatitude(value: Double): Self = StObject.set(x, "latitude", value.asInstanceOf[js.Any])
      
      inline def setLongitude(value: Double): Self = StObject.set(x, "longitude", value.asInstanceOf[js.Any])
      
      inline def setObeysDst(value: Boolean): Self = StObject.set(x, "obeysDst", value.asInstanceOf[js.Any])
      
      inline def setPrecision(value: String): Self = StObject.set(x, "precision", value.asInstanceOf[js.Any])
      
      inline def setRdi(value: String): Self = StObject.set(x, "rdi", value.asInstanceOf[js.Any])
      
      inline def setRdiUndefined: Self = StObject.set(x, "rdi", js.undefined)
      
      inline def setRecordType(value: String): Self = StObject.set(x, "recordType", value.asInstanceOf[js.Any])
      
      inline def setTimeZone(value: String): Self = StObject.set(x, "timeZone", value.asInstanceOf[js.Any])
      
      inline def setUtcOffset(value: Double): Self = StObject.set(x, "utcOffset", value.asInstanceOf[js.Any])
      
      inline def setZipType(value: String): Self = StObject.set(x, "zipType", value.asInstanceOf[js.Any])
    }
  }
}
