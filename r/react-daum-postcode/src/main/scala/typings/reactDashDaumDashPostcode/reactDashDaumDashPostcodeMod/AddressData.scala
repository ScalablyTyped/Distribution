package typings.reactDashDaumDashPostcode.reactDashDaumDashPostcodeMod

import typings.reactDashDaumDashPostcode.reactDashDaumDashPostcodeStrings.E
import typings.reactDashDaumDashPostcode.reactDashDaumDashPostcodeStrings.J
import typings.reactDashDaumDashPostcode.reactDashDaumDashPostcodeStrings.K
import typings.reactDashDaumDashPostcode.reactDashDaumDashPostcodeStrings.N
import typings.reactDashDaumDashPostcode.reactDashDaumDashPostcodeStrings.R
import typings.reactDashDaumDashPostcode.reactDashDaumDashPostcodeStrings.Y
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AddressData extends js.Object {
  var address: String
  var addressEnglish: String
  var addressType: R | J
  var apartment: Y | N
  var autoJibunAddress: String
  var autoJibunAddressEnglish: String
  var autoRoadAddress: String
  var autoRoadAddressEnglish: String
  var bcode: String
  var bname: String
  var bname1: String
  var bname2: String
  var buildingCode: String
  var buildingName: String
  var hname: String
  var jibunAddress: String
  var jibunAddressEnglish: String
  var noSelected: Y | N
  var postcode: String
  var postcode1: String
  var postcode2: String
  var postcodeSeq: String
  var query: String
  var roadAddress: String
  var roadname: String
  var roadnameCode: String
  var sido: String
  var sigungu: String
  var sigunguCode: String
  var userLanguageType: K | E
  var userSelectedType: R | J
  var zonecode: String
}

object AddressData {
  @scala.inline
  def apply(
    address: String,
    addressEnglish: String,
    addressType: R | J,
    apartment: Y | N,
    autoJibunAddress: String,
    autoJibunAddressEnglish: String,
    autoRoadAddress: String,
    autoRoadAddressEnglish: String,
    bcode: String,
    bname: String,
    bname1: String,
    bname2: String,
    buildingCode: String,
    buildingName: String,
    hname: String,
    jibunAddress: String,
    jibunAddressEnglish: String,
    noSelected: Y | N,
    postcode: String,
    postcode1: String,
    postcode2: String,
    postcodeSeq: String,
    query: String,
    roadAddress: String,
    roadname: String,
    roadnameCode: String,
    sido: String,
    sigungu: String,
    sigunguCode: String,
    userLanguageType: K | E,
    userSelectedType: R | J,
    zonecode: String
  ): AddressData = {
    val __obj = js.Dynamic.literal(address = address, addressEnglish = addressEnglish, addressType = addressType.asInstanceOf[js.Any], apartment = apartment.asInstanceOf[js.Any], autoJibunAddress = autoJibunAddress, autoJibunAddressEnglish = autoJibunAddressEnglish, autoRoadAddress = autoRoadAddress, autoRoadAddressEnglish = autoRoadAddressEnglish, bcode = bcode, bname = bname, bname1 = bname1, bname2 = bname2, buildingCode = buildingCode, buildingName = buildingName, hname = hname, jibunAddress = jibunAddress, jibunAddressEnglish = jibunAddressEnglish, noSelected = noSelected.asInstanceOf[js.Any], postcode = postcode, postcode1 = postcode1, postcode2 = postcode2, postcodeSeq = postcodeSeq, query = query, roadAddress = roadAddress, roadname = roadname, roadnameCode = roadnameCode, sido = sido, sigungu = sigungu, sigunguCode = sigunguCode, userLanguageType = userLanguageType.asInstanceOf[js.Any], userSelectedType = userSelectedType.asInstanceOf[js.Any], zonecode = zonecode)
  
    __obj.asInstanceOf[AddressData]
  }
}

