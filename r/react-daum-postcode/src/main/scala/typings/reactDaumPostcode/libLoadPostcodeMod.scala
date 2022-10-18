package typings.reactDaumPostcode

import org.scalablytyped.runtime.Instantiable1
import typings.reactDaumPostcode.reactDaumPostcodeStrings.E
import typings.reactDaumPostcode.reactDaumPostcodeStrings.J
import typings.reactDaumPostcode.reactDaumPostcodeStrings.K
import typings.reactDaumPostcode.reactDaumPostcodeStrings.N
import typings.reactDaumPostcode.reactDaumPostcodeStrings.R
import typings.reactDaumPostcode.reactDaumPostcodeStrings.Y
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libLoadPostcodeMod {
  
  @JSImport("react-daum-postcode/lib/loadPostcode", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(): js.Promise[PostcodeConstructor] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")().asInstanceOf[js.Promise[PostcodeConstructor]]
  inline def default(url: String): js.Promise[PostcodeConstructor] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(url.asInstanceOf[js.Any]).asInstanceOf[js.Promise[PostcodeConstructor]]
  
  @JSImport("react-daum-postcode/lib/loadPostcode", "postcodeScriptUrl")
  @js.native
  val postcodeScriptUrl: /* "https://t1.daumcdn.net/mapjsapi/bundle/postcode/prod/postcode.v2.js" */ String = js.native
  
  trait Address extends StObject {
    
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
    
    var bname1English: String
    
    var bname2: String
    
    var bname2English: String
    
    var bnameEnglish: String
    
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
    
    var roadnameEnglish: String
    
    var sido: String
    
    var sidoEnglish: String
    
    var sigungu: String
    
    var sigunguCode: String
    
    var sigunguEnglish: String
    
    var userLanguageType: K | E
    
    var userSelectedType: R | J
    
    var zonecode: String
  }
  object Address {
    
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
      bname1English: String,
      bname2: String,
      bname2English: String,
      bnameEnglish: String,
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
      roadnameEnglish: String,
      sido: String,
      sidoEnglish: String,
      sigungu: String,
      sigunguCode: String,
      sigunguEnglish: String,
      userLanguageType: K | E,
      userSelectedType: R | J,
      zonecode: String
    ): Address = {
      val __obj = js.Dynamic.literal(address = address.asInstanceOf[js.Any], addressEnglish = addressEnglish.asInstanceOf[js.Any], addressType = addressType.asInstanceOf[js.Any], apartment = apartment.asInstanceOf[js.Any], autoJibunAddress = autoJibunAddress.asInstanceOf[js.Any], autoJibunAddressEnglish = autoJibunAddressEnglish.asInstanceOf[js.Any], autoRoadAddress = autoRoadAddress.asInstanceOf[js.Any], autoRoadAddressEnglish = autoRoadAddressEnglish.asInstanceOf[js.Any], bcode = bcode.asInstanceOf[js.Any], bname = bname.asInstanceOf[js.Any], bname1 = bname1.asInstanceOf[js.Any], bname1English = bname1English.asInstanceOf[js.Any], bname2 = bname2.asInstanceOf[js.Any], bname2English = bname2English.asInstanceOf[js.Any], bnameEnglish = bnameEnglish.asInstanceOf[js.Any], buildingCode = buildingCode.asInstanceOf[js.Any], buildingName = buildingName.asInstanceOf[js.Any], hname = hname.asInstanceOf[js.Any], jibunAddress = jibunAddress.asInstanceOf[js.Any], jibunAddressEnglish = jibunAddressEnglish.asInstanceOf[js.Any], noSelected = noSelected.asInstanceOf[js.Any], query = query.asInstanceOf[js.Any], roadAddress = roadAddress.asInstanceOf[js.Any], roadAddressEnglish = roadAddressEnglish.asInstanceOf[js.Any], roadname = roadname.asInstanceOf[js.Any], roadnameCode = roadnameCode.asInstanceOf[js.Any], roadnameEnglish = roadnameEnglish.asInstanceOf[js.Any], sido = sido.asInstanceOf[js.Any], sidoEnglish = sidoEnglish.asInstanceOf[js.Any], sigungu = sigungu.asInstanceOf[js.Any], sigunguCode = sigunguCode.asInstanceOf[js.Any], sigunguEnglish = sigunguEnglish.asInstanceOf[js.Any], userLanguageType = userLanguageType.asInstanceOf[js.Any], userSelectedType = userSelectedType.asInstanceOf[js.Any], zonecode = zonecode.asInstanceOf[js.Any])
      __obj.asInstanceOf[Address]
    }
    
    extension [Self <: Address](x: Self) {
      
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
      
      inline def setBname1English(value: String): Self = StObject.set(x, "bname1English", value.asInstanceOf[js.Any])
      
      inline def setBname2(value: String): Self = StObject.set(x, "bname2", value.asInstanceOf[js.Any])
      
      inline def setBname2English(value: String): Self = StObject.set(x, "bname2English", value.asInstanceOf[js.Any])
      
      inline def setBnameEnglish(value: String): Self = StObject.set(x, "bnameEnglish", value.asInstanceOf[js.Any])
      
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
      
      inline def setRoadnameEnglish(value: String): Self = StObject.set(x, "roadnameEnglish", value.asInstanceOf[js.Any])
      
      inline def setSido(value: String): Self = StObject.set(x, "sido", value.asInstanceOf[js.Any])
      
      inline def setSidoEnglish(value: String): Self = StObject.set(x, "sidoEnglish", value.asInstanceOf[js.Any])
      
      inline def setSigungu(value: String): Self = StObject.set(x, "sigungu", value.asInstanceOf[js.Any])
      
      inline def setSigunguCode(value: String): Self = StObject.set(x, "sigunguCode", value.asInstanceOf[js.Any])
      
      inline def setSigunguEnglish(value: String): Self = StObject.set(x, "sigunguEnglish", value.asInstanceOf[js.Any])
      
      inline def setUserLanguageType(value: K | E): Self = StObject.set(x, "userLanguageType", value.asInstanceOf[js.Any])
      
      inline def setUserSelectedType(value: R | J): Self = StObject.set(x, "userSelectedType", value.asInstanceOf[js.Any])
      
      inline def setZonecode(value: String): Self = StObject.set(x, "zonecode", value.asInstanceOf[js.Any])
    }
  }
  
  trait EmbedOptions extends StObject {
    
    var autoClose: js.UndefOr[Boolean] = js.undefined
    
    var q: js.UndefOr[String] = js.undefined
  }
  object EmbedOptions {
    
    inline def apply(): EmbedOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[EmbedOptions]
    }
    
    extension [Self <: EmbedOptions](x: Self) {
      
      inline def setAutoClose(value: Boolean): Self = StObject.set(x, "autoClose", value.asInstanceOf[js.Any])
      
      inline def setAutoCloseUndefined: Self = StObject.set(x, "autoClose", js.undefined)
      
      inline def setQ(value: String): Self = StObject.set(x, "q", value.asInstanceOf[js.Any])
      
      inline def setQUndefined: Self = StObject.set(x, "q", js.undefined)
    }
  }
  
  trait OpenOptions extends StObject {
    
    var autoClose: js.UndefOr[Boolean] = js.undefined
    
    var left: js.UndefOr[Double | String] = js.undefined
    
    var popupKey: js.UndefOr[String] = js.undefined
    
    var popupTitle: js.UndefOr[String] = js.undefined
    
    var q: js.UndefOr[String] = js.undefined
    
    var top: js.UndefOr[Double | String] = js.undefined
  }
  object OpenOptions {
    
    inline def apply(): OpenOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[OpenOptions]
    }
    
    extension [Self <: OpenOptions](x: Self) {
      
      inline def setAutoClose(value: Boolean): Self = StObject.set(x, "autoClose", value.asInstanceOf[js.Any])
      
      inline def setAutoCloseUndefined: Self = StObject.set(x, "autoClose", js.undefined)
      
      inline def setLeft(value: Double | String): Self = StObject.set(x, "left", value.asInstanceOf[js.Any])
      
      inline def setLeftUndefined: Self = StObject.set(x, "left", js.undefined)
      
      inline def setPopupKey(value: String): Self = StObject.set(x, "popupKey", value.asInstanceOf[js.Any])
      
      inline def setPopupKeyUndefined: Self = StObject.set(x, "popupKey", js.undefined)
      
      inline def setPopupTitle(value: String): Self = StObject.set(x, "popupTitle", value.asInstanceOf[js.Any])
      
      inline def setPopupTitleUndefined: Self = StObject.set(x, "popupTitle", js.undefined)
      
      inline def setQ(value: String): Self = StObject.set(x, "q", value.asInstanceOf[js.Any])
      
      inline def setQUndefined: Self = StObject.set(x, "q", js.undefined)
      
      inline def setTop(value: Double | String): Self = StObject.set(x, "top", value.asInstanceOf[js.Any])
      
      inline def setTopUndefined: Self = StObject.set(x, "top", js.undefined)
    }
  }
  
  @js.native
  trait Postcode extends StObject {
    
    def embed(element: HTMLElement): Unit = js.native
    def embed(element: HTMLElement, embedOptions: EmbedOptions): Unit = js.native
    
    def open(): Unit = js.native
    def open(openOptions: OpenOptions): Unit = js.native
  }
  
  @js.native
  trait PostcodeConstructor
    extends StObject
       with Instantiable1[/* postcodeOptions */ PostcodeOptions, Postcode]
  
  trait PostcodeOptions extends StObject {
    
    var alwaysShowEngAddr: js.UndefOr[Boolean] = js.undefined
    
    var animation: js.UndefOr[Boolean] = js.undefined
    
    var autoMapping: js.UndefOr[Boolean] = js.undefined
    
    var autoMappingJibun: js.UndefOr[Boolean] = js.undefined
    
    var autoMappingRoad: js.UndefOr[Boolean] = js.undefined
    
    var focusContent: js.UndefOr[Boolean] = js.undefined
    
    var focusInput: js.UndefOr[Boolean] = js.undefined
    
    var height: js.UndefOr[String | Double] = js.undefined
    
    var hideEngBtn: js.UndefOr[Boolean] = js.undefined
    
    var hideMapBtn: js.UndefOr[Boolean] = js.undefined
    
    var maxSuggestItems: js.UndefOr[Double] = js.undefined
    
    var onclose: js.UndefOr[js.Function1[/* state */ State, Unit]] = js.undefined
    
    var oncomplete: js.UndefOr[js.Function1[/* address */ Address, Unit]] = js.undefined
    
    var onresize: js.UndefOr[js.Function1[/* size */ Size, Unit]] = js.undefined
    
    var onsearch: js.UndefOr[js.Function1[/* search */ Search, Unit]] = js.undefined
    
    var pleaseReadGuide: js.UndefOr[Double] = js.undefined
    
    var pleaseReadGuideTimer: js.UndefOr[Double] = js.undefined
    
    var shorthand: js.UndefOr[Boolean] = js.undefined
    
    var showMoreHName: js.UndefOr[Boolean] = js.undefined
    
    var submitMode: js.UndefOr[Boolean] = js.undefined
    
    var theme: js.UndefOr[Theme] = js.undefined
    
    var useBannerLink: js.UndefOr[Boolean] = js.undefined
    
    var useSuggest: js.UndefOr[Boolean] = js.undefined
    
    var width: js.UndefOr[String | Double] = js.undefined
  }
  object PostcodeOptions {
    
    inline def apply(): PostcodeOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PostcodeOptions]
    }
    
    extension [Self <: PostcodeOptions](x: Self) {
      
      inline def setAlwaysShowEngAddr(value: Boolean): Self = StObject.set(x, "alwaysShowEngAddr", value.asInstanceOf[js.Any])
      
      inline def setAlwaysShowEngAddrUndefined: Self = StObject.set(x, "alwaysShowEngAddr", js.undefined)
      
      inline def setAnimation(value: Boolean): Self = StObject.set(x, "animation", value.asInstanceOf[js.Any])
      
      inline def setAnimationUndefined: Self = StObject.set(x, "animation", js.undefined)
      
      inline def setAutoMapping(value: Boolean): Self = StObject.set(x, "autoMapping", value.asInstanceOf[js.Any])
      
      inline def setAutoMappingJibun(value: Boolean): Self = StObject.set(x, "autoMappingJibun", value.asInstanceOf[js.Any])
      
      inline def setAutoMappingJibunUndefined: Self = StObject.set(x, "autoMappingJibun", js.undefined)
      
      inline def setAutoMappingRoad(value: Boolean): Self = StObject.set(x, "autoMappingRoad", value.asInstanceOf[js.Any])
      
      inline def setAutoMappingRoadUndefined: Self = StObject.set(x, "autoMappingRoad", js.undefined)
      
      inline def setAutoMappingUndefined: Self = StObject.set(x, "autoMapping", js.undefined)
      
      inline def setFocusContent(value: Boolean): Self = StObject.set(x, "focusContent", value.asInstanceOf[js.Any])
      
      inline def setFocusContentUndefined: Self = StObject.set(x, "focusContent", js.undefined)
      
      inline def setFocusInput(value: Boolean): Self = StObject.set(x, "focusInput", value.asInstanceOf[js.Any])
      
      inline def setFocusInputUndefined: Self = StObject.set(x, "focusInput", js.undefined)
      
      inline def setHeight(value: String | Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
      
      inline def setHideEngBtn(value: Boolean): Self = StObject.set(x, "hideEngBtn", value.asInstanceOf[js.Any])
      
      inline def setHideEngBtnUndefined: Self = StObject.set(x, "hideEngBtn", js.undefined)
      
      inline def setHideMapBtn(value: Boolean): Self = StObject.set(x, "hideMapBtn", value.asInstanceOf[js.Any])
      
      inline def setHideMapBtnUndefined: Self = StObject.set(x, "hideMapBtn", js.undefined)
      
      inline def setMaxSuggestItems(value: Double): Self = StObject.set(x, "maxSuggestItems", value.asInstanceOf[js.Any])
      
      inline def setMaxSuggestItemsUndefined: Self = StObject.set(x, "maxSuggestItems", js.undefined)
      
      inline def setOnclose(value: /* state */ State => Unit): Self = StObject.set(x, "onclose", js.Any.fromFunction1(value))
      
      inline def setOncloseUndefined: Self = StObject.set(x, "onclose", js.undefined)
      
      inline def setOncomplete(value: /* address */ Address => Unit): Self = StObject.set(x, "oncomplete", js.Any.fromFunction1(value))
      
      inline def setOncompleteUndefined: Self = StObject.set(x, "oncomplete", js.undefined)
      
      inline def setOnresize(value: /* size */ Size => Unit): Self = StObject.set(x, "onresize", js.Any.fromFunction1(value))
      
      inline def setOnresizeUndefined: Self = StObject.set(x, "onresize", js.undefined)
      
      inline def setOnsearch(value: /* search */ Search => Unit): Self = StObject.set(x, "onsearch", js.Any.fromFunction1(value))
      
      inline def setOnsearchUndefined: Self = StObject.set(x, "onsearch", js.undefined)
      
      inline def setPleaseReadGuide(value: Double): Self = StObject.set(x, "pleaseReadGuide", value.asInstanceOf[js.Any])
      
      inline def setPleaseReadGuideTimer(value: Double): Self = StObject.set(x, "pleaseReadGuideTimer", value.asInstanceOf[js.Any])
      
      inline def setPleaseReadGuideTimerUndefined: Self = StObject.set(x, "pleaseReadGuideTimer", js.undefined)
      
      inline def setPleaseReadGuideUndefined: Self = StObject.set(x, "pleaseReadGuide", js.undefined)
      
      inline def setShorthand(value: Boolean): Self = StObject.set(x, "shorthand", value.asInstanceOf[js.Any])
      
      inline def setShorthandUndefined: Self = StObject.set(x, "shorthand", js.undefined)
      
      inline def setShowMoreHName(value: Boolean): Self = StObject.set(x, "showMoreHName", value.asInstanceOf[js.Any])
      
      inline def setShowMoreHNameUndefined: Self = StObject.set(x, "showMoreHName", js.undefined)
      
      inline def setSubmitMode(value: Boolean): Self = StObject.set(x, "submitMode", value.asInstanceOf[js.Any])
      
      inline def setSubmitModeUndefined: Self = StObject.set(x, "submitMode", js.undefined)
      
      inline def setTheme(value: Theme): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
      
      inline def setThemeUndefined: Self = StObject.set(x, "theme", js.undefined)
      
      inline def setUseBannerLink(value: Boolean): Self = StObject.set(x, "useBannerLink", value.asInstanceOf[js.Any])
      
      inline def setUseBannerLinkUndefined: Self = StObject.set(x, "useBannerLink", js.undefined)
      
      inline def setUseSuggest(value: Boolean): Self = StObject.set(x, "useSuggest", value.asInstanceOf[js.Any])
      
      inline def setUseSuggestUndefined: Self = StObject.set(x, "useSuggest", js.undefined)
      
      inline def setWidth(value: String | Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    }
  }
  
  trait Search extends StObject {
    
    var count: Double
    
    var q: String
  }
  object Search {
    
    inline def apply(count: Double, q: String): Search = {
      val __obj = js.Dynamic.literal(count = count.asInstanceOf[js.Any], q = q.asInstanceOf[js.Any])
      __obj.asInstanceOf[Search]
    }
    
    extension [Self <: Search](x: Self) {
      
      inline def setCount(value: Double): Self = StObject.set(x, "count", value.asInstanceOf[js.Any])
      
      inline def setQ(value: String): Self = StObject.set(x, "q", value.asInstanceOf[js.Any])
    }
  }
  
  trait Size extends StObject {
    
    var height: Double
    
    var width: Double
  }
  object Size {
    
    inline def apply(height: Double, width: Double): Size = {
      val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
      __obj.asInstanceOf[Size]
    }
    
    extension [Self <: Size](x: Self) {
      
      inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.reactDaumPostcode.reactDaumPostcodeStrings.FORCE_CLOSE
    - typings.reactDaumPostcode.reactDaumPostcodeStrings.COMPLETE_CLOSE
  */
  trait State extends StObject
  object State {
    
    inline def COMPLETE_CLOSE: typings.reactDaumPostcode.reactDaumPostcodeStrings.COMPLETE_CLOSE = "COMPLETE_CLOSE".asInstanceOf[typings.reactDaumPostcode.reactDaumPostcodeStrings.COMPLETE_CLOSE]
    
    inline def FORCE_CLOSE: typings.reactDaumPostcode.reactDaumPostcodeStrings.FORCE_CLOSE = "FORCE_CLOSE".asInstanceOf[typings.reactDaumPostcode.reactDaumPostcodeStrings.FORCE_CLOSE]
  }
  
  trait Theme extends StObject {
    
    var bgColor: js.UndefOr[String] = js.undefined
    
    var contentBgColor: js.UndefOr[String] = js.undefined
    
    var emphTextColor: js.UndefOr[String] = js.undefined
    
    var outlineColor: js.UndefOr[String] = js.undefined
    
    var pageBgColor: js.UndefOr[String] = js.undefined
    
    var postcodeTextColor: js.UndefOr[String] = js.undefined
    
    var queryTextColor: js.UndefOr[String] = js.undefined
    
    var searchBgColor: js.UndefOr[String] = js.undefined
    
    var textColor: js.UndefOr[String] = js.undefined
  }
  object Theme {
    
    inline def apply(): Theme = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Theme]
    }
    
    extension [Self <: Theme](x: Self) {
      
      inline def setBgColor(value: String): Self = StObject.set(x, "bgColor", value.asInstanceOf[js.Any])
      
      inline def setBgColorUndefined: Self = StObject.set(x, "bgColor", js.undefined)
      
      inline def setContentBgColor(value: String): Self = StObject.set(x, "contentBgColor", value.asInstanceOf[js.Any])
      
      inline def setContentBgColorUndefined: Self = StObject.set(x, "contentBgColor", js.undefined)
      
      inline def setEmphTextColor(value: String): Self = StObject.set(x, "emphTextColor", value.asInstanceOf[js.Any])
      
      inline def setEmphTextColorUndefined: Self = StObject.set(x, "emphTextColor", js.undefined)
      
      inline def setOutlineColor(value: String): Self = StObject.set(x, "outlineColor", value.asInstanceOf[js.Any])
      
      inline def setOutlineColorUndefined: Self = StObject.set(x, "outlineColor", js.undefined)
      
      inline def setPageBgColor(value: String): Self = StObject.set(x, "pageBgColor", value.asInstanceOf[js.Any])
      
      inline def setPageBgColorUndefined: Self = StObject.set(x, "pageBgColor", js.undefined)
      
      inline def setPostcodeTextColor(value: String): Self = StObject.set(x, "postcodeTextColor", value.asInstanceOf[js.Any])
      
      inline def setPostcodeTextColorUndefined: Self = StObject.set(x, "postcodeTextColor", js.undefined)
      
      inline def setQueryTextColor(value: String): Self = StObject.set(x, "queryTextColor", value.asInstanceOf[js.Any])
      
      inline def setQueryTextColorUndefined: Self = StObject.set(x, "queryTextColor", js.undefined)
      
      inline def setSearchBgColor(value: String): Self = StObject.set(x, "searchBgColor", value.asInstanceOf[js.Any])
      
      inline def setSearchBgColorUndefined: Self = StObject.set(x, "searchBgColor", js.undefined)
      
      inline def setTextColor(value: String): Self = StObject.set(x, "textColor", value.asInstanceOf[js.Any])
      
      inline def setTextColorUndefined: Self = StObject.set(x, "textColor", js.undefined)
    }
  }
  
  object global {
    
    trait Window extends StObject {
      
      var daum: js.UndefOr[typings.reactDaumPostcode.anon.Postcode] = js.undefined
    }
    object Window {
      
      inline def apply(): Window = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[Window]
      }
      
      extension [Self <: Window](x: Self) {
        
        inline def setDaum(value: typings.reactDaumPostcode.anon.Postcode): Self = StObject.set(x, "daum", value.asInstanceOf[js.Any])
        
        inline def setDaumUndefined: Self = StObject.set(x, "daum", js.undefined)
      }
    }
  }
}
