package typings.reactDaumPostcode.mod

import typings.reactDaumPostcode.reactDaumPostcodeStrings.E
import typings.reactDaumPostcode.reactDaumPostcodeStrings.J
import typings.reactDaumPostcode.reactDaumPostcodeStrings.K
import typings.reactDaumPostcode.reactDaumPostcodeStrings.N
import typings.reactDaumPostcode.reactDaumPostcodeStrings.R
import typings.reactDaumPostcode.reactDaumPostcodeStrings.Y
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AddressData extends js.Object {
  
  var address: String = js.native
  
  var addressEnglish: String = js.native
  
  var addressType: R | J = js.native
  
  var apartment: Y | N = js.native
  
  var autoJibunAddress: String = js.native
  
  var autoJibunAddressEnglish: String = js.native
  
  var autoRoadAddress: String = js.native
  
  var autoRoadAddressEnglish: String = js.native
  
  var bcode: String = js.native
  
  var bname: String = js.native
  
  var bname1: String = js.native
  
  var bname2: String = js.native
  
  var buildingCode: String = js.native
  
  var buildingName: String = js.native
  
  var hname: String = js.native
  
  var jibunAddress: String = js.native
  
  var jibunAddressEnglish: String = js.native
  
  var noSelected: Y | N = js.native
  
  var query: String = js.native
  
  var roadAddress: String = js.native
  
  var roadAddressEnglish: String = js.native
  
  var roadname: String = js.native
  
  var roadnameCode: String = js.native
  
  var sido: String = js.native
  
  var sigungu: String = js.native
  
  var sigunguCode: String = js.native
  
  var userLanguageType: K | E = js.native
  
  var userSelectedType: R | J = js.native
  
  var zonecode: String = js.native
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
    query: String,
    roadAddress: String,
    roadAddressEnglish: String,
    roadname: String,
    roadnameCode: String,
    sido: String,
    sigungu: String,
    sigunguCode: String,
    userLanguageType: K | E,
    userSelectedType: R | J,
    zonecode: String
  ): AddressData = {
    val __obj = js.Dynamic.literal(address = address.asInstanceOf[js.Any], addressEnglish = addressEnglish.asInstanceOf[js.Any], addressType = addressType.asInstanceOf[js.Any], apartment = apartment.asInstanceOf[js.Any], autoJibunAddress = autoJibunAddress.asInstanceOf[js.Any], autoJibunAddressEnglish = autoJibunAddressEnglish.asInstanceOf[js.Any], autoRoadAddress = autoRoadAddress.asInstanceOf[js.Any], autoRoadAddressEnglish = autoRoadAddressEnglish.asInstanceOf[js.Any], bcode = bcode.asInstanceOf[js.Any], bname = bname.asInstanceOf[js.Any], bname1 = bname1.asInstanceOf[js.Any], bname2 = bname2.asInstanceOf[js.Any], buildingCode = buildingCode.asInstanceOf[js.Any], buildingName = buildingName.asInstanceOf[js.Any], hname = hname.asInstanceOf[js.Any], jibunAddress = jibunAddress.asInstanceOf[js.Any], jibunAddressEnglish = jibunAddressEnglish.asInstanceOf[js.Any], noSelected = noSelected.asInstanceOf[js.Any], query = query.asInstanceOf[js.Any], roadAddress = roadAddress.asInstanceOf[js.Any], roadAddressEnglish = roadAddressEnglish.asInstanceOf[js.Any], roadname = roadname.asInstanceOf[js.Any], roadnameCode = roadnameCode.asInstanceOf[js.Any], sido = sido.asInstanceOf[js.Any], sigungu = sigungu.asInstanceOf[js.Any], sigunguCode = sigunguCode.asInstanceOf[js.Any], userLanguageType = userLanguageType.asInstanceOf[js.Any], userSelectedType = userSelectedType.asInstanceOf[js.Any], zonecode = zonecode.asInstanceOf[js.Any])
    __obj.asInstanceOf[AddressData]
  }
  
  @scala.inline
  implicit class AddressDataOps[Self <: AddressData] (val x: Self) extends AnyVal {
    
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
    def setAddress(value: String): Self = this.set("address", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAddressEnglish(value: String): Self = this.set("addressEnglish", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAddressType(value: R | J): Self = this.set("addressType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setApartment(value: Y | N): Self = this.set("apartment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAutoJibunAddress(value: String): Self = this.set("autoJibunAddress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAutoJibunAddressEnglish(value: String): Self = this.set("autoJibunAddressEnglish", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAutoRoadAddress(value: String): Self = this.set("autoRoadAddress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAutoRoadAddressEnglish(value: String): Self = this.set("autoRoadAddressEnglish", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBcode(value: String): Self = this.set("bcode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBname(value: String): Self = this.set("bname", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBname1(value: String): Self = this.set("bname1", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBname2(value: String): Self = this.set("bname2", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBuildingCode(value: String): Self = this.set("buildingCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBuildingName(value: String): Self = this.set("buildingName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHname(value: String): Self = this.set("hname", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setJibunAddress(value: String): Self = this.set("jibunAddress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setJibunAddressEnglish(value: String): Self = this.set("jibunAddressEnglish", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNoSelected(value: Y | N): Self = this.set("noSelected", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQuery(value: String): Self = this.set("query", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRoadAddress(value: String): Self = this.set("roadAddress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRoadAddressEnglish(value: String): Self = this.set("roadAddressEnglish", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRoadname(value: String): Self = this.set("roadname", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRoadnameCode(value: String): Self = this.set("roadnameCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSido(value: String): Self = this.set("sido", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSigungu(value: String): Self = this.set("sigungu", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSigunguCode(value: String): Self = this.set("sigunguCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserLanguageType(value: K | E): Self = this.set("userLanguageType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserSelectedType(value: R | J): Self = this.set("userSelectedType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setZonecode(value: String): Self = this.set("zonecode", value.asInstanceOf[js.Any])
  }
}
