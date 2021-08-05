package typings.reactDaumPostcode

import typings.react.mod.Component
import typings.react.mod.ReactElement
import typings.reactDaumPostcode.reactDaumPostcodeStrings.E
import typings.reactDaumPostcode.reactDaumPostcodeStrings.J
import typings.reactDaumPostcode.reactDaumPostcodeStrings.K
import typings.reactDaumPostcode.reactDaumPostcodeStrings.N
import typings.reactDaumPostcode.reactDaumPostcodeStrings.R
import typings.reactDaumPostcode.reactDaumPostcodeStrings.Y
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("react-daum-postcode", JSImport.Default)
  @js.native
  class default protected () extends DaumPostcode {
    def this(props: DaumPostcodeProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: DaumPostcodeProps, context: js.Any) = this()
  }
  
  @JSImport("react-daum-postcode", "DaumPostcode")
  @js.native
  class DaumPostcode protected ()
    extends Component[DaumPostcodeProps, js.Any, js.Any] {
    def this(props: DaumPostcodeProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: DaumPostcodeProps, context: js.Any) = this()
  }
  
  trait AddressData extends StObject {
    
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
    
    var query: String
    
    var roadAddress: String
    
    var roadAddressEnglish: String
    
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
    
    inline def apply(
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
    
    extension [Self <: AddressData](x: Self) {
      
      inline def setAddress(value: String): Self = StObject.set(x, "address", value.asInstanceOf[js.Any])
      
      inline def setAddressEnglish(value: String): Self = StObject.set(x, "addressEnglish", value.asInstanceOf[js.Any])
      
      inline def setAddressType(value: R | J): Self = StObject.set(x, "addressType", value.asInstanceOf[js.Any])
      
      inline def setApartment(value: Y | N): Self = StObject.set(x, "apartment", value.asInstanceOf[js.Any])
      
      inline def setAutoJibunAddress(value: String): Self = StObject.set(x, "autoJibunAddress", value.asInstanceOf[js.Any])
      
      inline def setAutoJibunAddressEnglish(value: String): Self = StObject.set(x, "autoJibunAddressEnglish", value.asInstanceOf[js.Any])
      
      inline def setAutoRoadAddress(value: String): Self = StObject.set(x, "autoRoadAddress", value.asInstanceOf[js.Any])
      
      inline def setAutoRoadAddressEnglish(value: String): Self = StObject.set(x, "autoRoadAddressEnglish", value.asInstanceOf[js.Any])
      
      inline def setBcode(value: String): Self = StObject.set(x, "bcode", value.asInstanceOf[js.Any])
      
      inline def setBname(value: String): Self = StObject.set(x, "bname", value.asInstanceOf[js.Any])
      
      inline def setBname1(value: String): Self = StObject.set(x, "bname1", value.asInstanceOf[js.Any])
      
      inline def setBname2(value: String): Self = StObject.set(x, "bname2", value.asInstanceOf[js.Any])
      
      inline def setBuildingCode(value: String): Self = StObject.set(x, "buildingCode", value.asInstanceOf[js.Any])
      
      inline def setBuildingName(value: String): Self = StObject.set(x, "buildingName", value.asInstanceOf[js.Any])
      
      inline def setHname(value: String): Self = StObject.set(x, "hname", value.asInstanceOf[js.Any])
      
      inline def setJibunAddress(value: String): Self = StObject.set(x, "jibunAddress", value.asInstanceOf[js.Any])
      
      inline def setJibunAddressEnglish(value: String): Self = StObject.set(x, "jibunAddressEnglish", value.asInstanceOf[js.Any])
      
      inline def setNoSelected(value: Y | N): Self = StObject.set(x, "noSelected", value.asInstanceOf[js.Any])
      
      inline def setQuery(value: String): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
      
      inline def setRoadAddress(value: String): Self = StObject.set(x, "roadAddress", value.asInstanceOf[js.Any])
      
      inline def setRoadAddressEnglish(value: String): Self = StObject.set(x, "roadAddressEnglish", value.asInstanceOf[js.Any])
      
      inline def setRoadname(value: String): Self = StObject.set(x, "roadname", value.asInstanceOf[js.Any])
      
      inline def setRoadnameCode(value: String): Self = StObject.set(x, "roadnameCode", value.asInstanceOf[js.Any])
      
      inline def setSido(value: String): Self = StObject.set(x, "sido", value.asInstanceOf[js.Any])
      
      inline def setSigungu(value: String): Self = StObject.set(x, "sigungu", value.asInstanceOf[js.Any])
      
      inline def setSigunguCode(value: String): Self = StObject.set(x, "sigunguCode", value.asInstanceOf[js.Any])
      
      inline def setUserLanguageType(value: K | E): Self = StObject.set(x, "userLanguageType", value.asInstanceOf[js.Any])
      
      inline def setUserSelectedType(value: R | J): Self = StObject.set(x, "userSelectedType", value.asInstanceOf[js.Any])
      
      inline def setZonecode(value: String): Self = StObject.set(x, "zonecode", value.asInstanceOf[js.Any])
    }
  }
  
  trait DaumPostcodeProps extends StObject {
    
    var alwaysShowEngAddr: js.UndefOr[Boolean] = js.undefined
    
    var animation: js.UndefOr[Boolean] = js.undefined
    
    var autoClose: js.UndefOr[Boolean] = js.undefined
    
    var autoMapping: js.UndefOr[Boolean] = js.undefined
    
    var autoResize: js.UndefOr[Boolean] = js.undefined
    
    var defaultQuery: js.UndefOr[String] = js.undefined
    
    var errorMessage: js.UndefOr[ReactElement] = js.undefined
    
    var focusContent: js.UndefOr[Boolean] = js.undefined
    
    var focusInput: js.UndefOr[Boolean] = js.undefined
    
    var height: js.UndefOr[Double | String] = js.undefined
    
    var hideEngBtn: js.UndefOr[Boolean] = js.undefined
    
    var hideMapBtn: js.UndefOr[Boolean] = js.undefined
    
    var maxSuggestItems: js.UndefOr[Double] = js.undefined
    
    def onComplete(data: AddressData): Unit
    
    var onSearch: js.UndefOr[js.Function1[/* data */ SearchData, Unit]] = js.undefined
    
    var pleaseReadGuide: js.UndefOr[Double] = js.undefined
    
    var pleaseReadGuideTimer: js.UndefOr[Double] = js.undefined
    
    var scriptUrl: js.UndefOr[String] = js.undefined
    
    var shorthand: js.UndefOr[Boolean] = js.undefined
    
    var showMoreHName: js.UndefOr[Boolean] = js.undefined
    
    var style: js.UndefOr[js.Object] = js.undefined
    
    var submitMode: js.UndefOr[Boolean] = js.undefined
    
    var theme: js.UndefOr[js.Object] = js.undefined
    
    var useSuggest: js.UndefOr[Boolean] = js.undefined
    
    var width: js.UndefOr[Double | String] = js.undefined
  }
  object DaumPostcodeProps {
    
    inline def apply(onComplete: AddressData => Unit): DaumPostcodeProps = {
      val __obj = js.Dynamic.literal(onComplete = js.Any.fromFunction1(onComplete))
      __obj.asInstanceOf[DaumPostcodeProps]
    }
    
    extension [Self <: DaumPostcodeProps](x: Self) {
      
      inline def setAlwaysShowEngAddr(value: Boolean): Self = StObject.set(x, "alwaysShowEngAddr", value.asInstanceOf[js.Any])
      
      inline def setAlwaysShowEngAddrUndefined: Self = StObject.set(x, "alwaysShowEngAddr", js.undefined)
      
      inline def setAnimation(value: Boolean): Self = StObject.set(x, "animation", value.asInstanceOf[js.Any])
      
      inline def setAnimationUndefined: Self = StObject.set(x, "animation", js.undefined)
      
      inline def setAutoClose(value: Boolean): Self = StObject.set(x, "autoClose", value.asInstanceOf[js.Any])
      
      inline def setAutoCloseUndefined: Self = StObject.set(x, "autoClose", js.undefined)
      
      inline def setAutoMapping(value: Boolean): Self = StObject.set(x, "autoMapping", value.asInstanceOf[js.Any])
      
      inline def setAutoMappingUndefined: Self = StObject.set(x, "autoMapping", js.undefined)
      
      inline def setAutoResize(value: Boolean): Self = StObject.set(x, "autoResize", value.asInstanceOf[js.Any])
      
      inline def setAutoResizeUndefined: Self = StObject.set(x, "autoResize", js.undefined)
      
      inline def setDefaultQuery(value: String): Self = StObject.set(x, "defaultQuery", value.asInstanceOf[js.Any])
      
      inline def setDefaultQueryUndefined: Self = StObject.set(x, "defaultQuery", js.undefined)
      
      inline def setErrorMessage(value: ReactElement): Self = StObject.set(x, "errorMessage", value.asInstanceOf[js.Any])
      
      inline def setErrorMessageUndefined: Self = StObject.set(x, "errorMessage", js.undefined)
      
      inline def setFocusContent(value: Boolean): Self = StObject.set(x, "focusContent", value.asInstanceOf[js.Any])
      
      inline def setFocusContentUndefined: Self = StObject.set(x, "focusContent", js.undefined)
      
      inline def setFocusInput(value: Boolean): Self = StObject.set(x, "focusInput", value.asInstanceOf[js.Any])
      
      inline def setFocusInputUndefined: Self = StObject.set(x, "focusInput", js.undefined)
      
      inline def setHeight(value: Double | String): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
      
      inline def setHideEngBtn(value: Boolean): Self = StObject.set(x, "hideEngBtn", value.asInstanceOf[js.Any])
      
      inline def setHideEngBtnUndefined: Self = StObject.set(x, "hideEngBtn", js.undefined)
      
      inline def setHideMapBtn(value: Boolean): Self = StObject.set(x, "hideMapBtn", value.asInstanceOf[js.Any])
      
      inline def setHideMapBtnUndefined: Self = StObject.set(x, "hideMapBtn", js.undefined)
      
      inline def setMaxSuggestItems(value: Double): Self = StObject.set(x, "maxSuggestItems", value.asInstanceOf[js.Any])
      
      inline def setMaxSuggestItemsUndefined: Self = StObject.set(x, "maxSuggestItems", js.undefined)
      
      inline def setOnComplete(value: AddressData => Unit): Self = StObject.set(x, "onComplete", js.Any.fromFunction1(value))
      
      inline def setOnSearch(value: /* data */ SearchData => Unit): Self = StObject.set(x, "onSearch", js.Any.fromFunction1(value))
      
      inline def setOnSearchUndefined: Self = StObject.set(x, "onSearch", js.undefined)
      
      inline def setPleaseReadGuide(value: Double): Self = StObject.set(x, "pleaseReadGuide", value.asInstanceOf[js.Any])
      
      inline def setPleaseReadGuideTimer(value: Double): Self = StObject.set(x, "pleaseReadGuideTimer", value.asInstanceOf[js.Any])
      
      inline def setPleaseReadGuideTimerUndefined: Self = StObject.set(x, "pleaseReadGuideTimer", js.undefined)
      
      inline def setPleaseReadGuideUndefined: Self = StObject.set(x, "pleaseReadGuide", js.undefined)
      
      inline def setScriptUrl(value: String): Self = StObject.set(x, "scriptUrl", value.asInstanceOf[js.Any])
      
      inline def setScriptUrlUndefined: Self = StObject.set(x, "scriptUrl", js.undefined)
      
      inline def setShorthand(value: Boolean): Self = StObject.set(x, "shorthand", value.asInstanceOf[js.Any])
      
      inline def setShorthandUndefined: Self = StObject.set(x, "shorthand", js.undefined)
      
      inline def setShowMoreHName(value: Boolean): Self = StObject.set(x, "showMoreHName", value.asInstanceOf[js.Any])
      
      inline def setShowMoreHNameUndefined: Self = StObject.set(x, "showMoreHName", js.undefined)
      
      inline def setStyle(value: js.Object): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      inline def setSubmitMode(value: Boolean): Self = StObject.set(x, "submitMode", value.asInstanceOf[js.Any])
      
      inline def setSubmitModeUndefined: Self = StObject.set(x, "submitMode", js.undefined)
      
      inline def setTheme(value: js.Object): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
      
      inline def setThemeUndefined: Self = StObject.set(x, "theme", js.undefined)
      
      inline def setUseSuggest(value: Boolean): Self = StObject.set(x, "useSuggest", value.asInstanceOf[js.Any])
      
      inline def setUseSuggestUndefined: Self = StObject.set(x, "useSuggest", js.undefined)
      
      inline def setWidth(value: Double | String): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    }
  }
  
  trait SearchData extends StObject {
    
    var count: Double
    
    var q: String
  }
  object SearchData {
    
    inline def apply(count: Double, q: String): SearchData = {
      val __obj = js.Dynamic.literal(count = count.asInstanceOf[js.Any], q = q.asInstanceOf[js.Any])
      __obj.asInstanceOf[SearchData]
    }
    
    extension [Self <: SearchData](x: Self) {
      
      inline def setCount(value: Double): Self = StObject.set(x, "count", value.asInstanceOf[js.Any])
      
      inline def setQ(value: String): Self = StObject.set(x, "q", value.asInstanceOf[js.Any])
    }
  }
}
