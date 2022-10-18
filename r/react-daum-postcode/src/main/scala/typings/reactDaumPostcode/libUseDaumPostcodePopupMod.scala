package typings.reactDaumPostcode

import typings.reactDaumPostcode.libLoadPostcodeMod.Address
import typings.reactDaumPostcode.libLoadPostcodeMod.Search
import typings.reactDaumPostcode.libLoadPostcodeMod.Size
import typings.reactDaumPostcode.libLoadPostcodeMod.State
import typings.reactDaumPostcode.libLoadPostcodeMod.Theme
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libUseDaumPostcodePopupMod {
  
  @JSImport("react-daum-postcode/lib/useDaumPostcodePopup", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(): js.Function1[/* options */ js.UndefOr[DaumPostcodePopupParams], js.Promise[Unit]] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")().asInstanceOf[js.Function1[/* options */ js.UndefOr[DaumPostcodePopupParams], js.Promise[Unit]]]
  inline def default(scriptUrl: String): js.Function1[/* options */ js.UndefOr[DaumPostcodePopupParams], js.Promise[Unit]] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(scriptUrl.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* options */ js.UndefOr[DaumPostcodePopupParams], js.Promise[Unit]]]
  
  /* Inlined std.Omit<react-daum-postcode.react-daum-postcode/lib/loadPostcode.PostcodeOptions, 'oncomplete' | 'onresize' | 'onclose' | 'onsearch'> & std.Omit<react-daum-postcode.react-daum-postcode/lib/loadPostcode.OpenOptions, 'q'> & {  onComplete :react-daum-postcode.react-daum-postcode/lib/loadPostcode.PostcodeOptions['oncomplete'] | undefined,   onResize :react-daum-postcode.react-daum-postcode/lib/loadPostcode.PostcodeOptions['onresize'] | undefined,   onClose :react-daum-postcode.react-daum-postcode/lib/loadPostcode.PostcodeOptions['onclose'] | undefined,   onSearch :react-daum-postcode.react-daum-postcode/lib/loadPostcode.PostcodeOptions['onsearch'] | undefined,   onError :(error : std.Error): void | undefined,   defaultQuery :string | undefined} */
  trait DaumPostcodePopupParams extends StObject {
    
    var alwaysShowEngAddr: js.UndefOr[Boolean] = js.undefined
    
    var animation: js.UndefOr[Boolean] = js.undefined
    
    var autoClose: js.UndefOr[Boolean] = js.undefined
    
    var autoMapping: js.UndefOr[Boolean] = js.undefined
    
    var autoMappingJibun: js.UndefOr[Boolean] = js.undefined
    
    var autoMappingRoad: js.UndefOr[Boolean] = js.undefined
    
    var defaultQuery: js.UndefOr[String] = js.undefined
    
    var focusContent: js.UndefOr[Boolean] = js.undefined
    
    var focusInput: js.UndefOr[Boolean] = js.undefined
    
    var height: js.UndefOr[String | Double] = js.undefined
    
    var hideEngBtn: js.UndefOr[Boolean] = js.undefined
    
    var hideMapBtn: js.UndefOr[Boolean] = js.undefined
    
    var left: js.UndefOr[Double | String] = js.undefined
    
    var maxSuggestItems: js.UndefOr[Double] = js.undefined
    
    var onClose: js.UndefOr[js.Function1[/* state */ State, Unit]] = js.undefined
    
    var onComplete: js.UndefOr[js.Function1[/* address */ Address, Unit]] = js.undefined
    
    var onError: js.UndefOr[js.Function1[/* error */ js.Error, Unit]] = js.undefined
    
    var onResize: js.UndefOr[js.Function1[/* size */ Size, Unit]] = js.undefined
    
    var onSearch: js.UndefOr[js.Function1[/* search */ Search, Unit]] = js.undefined
    
    var pleaseReadGuide: js.UndefOr[Double] = js.undefined
    
    var pleaseReadGuideTimer: js.UndefOr[Double] = js.undefined
    
    var popupKey: js.UndefOr[String] = js.undefined
    
    var popupTitle: js.UndefOr[String] = js.undefined
    
    var shorthand: js.UndefOr[Boolean] = js.undefined
    
    var showMoreHName: js.UndefOr[Boolean] = js.undefined
    
    var submitMode: js.UndefOr[Boolean] = js.undefined
    
    var theme: js.UndefOr[Theme] = js.undefined
    
    var top: js.UndefOr[Double | String] = js.undefined
    
    var useBannerLink: js.UndefOr[Boolean] = js.undefined
    
    var useSuggest: js.UndefOr[Boolean] = js.undefined
    
    var width: js.UndefOr[String | Double] = js.undefined
  }
  object DaumPostcodePopupParams {
    
    inline def apply(): DaumPostcodePopupParams = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DaumPostcodePopupParams]
    }
    
    extension [Self <: DaumPostcodePopupParams](x: Self) {
      
      inline def setAlwaysShowEngAddr(value: Boolean): Self = StObject.set(x, "alwaysShowEngAddr", value.asInstanceOf[js.Any])
      
      inline def setAlwaysShowEngAddrUndefined: Self = StObject.set(x, "alwaysShowEngAddr", js.undefined)
      
      inline def setAnimation(value: Boolean): Self = StObject.set(x, "animation", value.asInstanceOf[js.Any])
      
      inline def setAnimationUndefined: Self = StObject.set(x, "animation", js.undefined)
      
      inline def setAutoClose(value: Boolean): Self = StObject.set(x, "autoClose", value.asInstanceOf[js.Any])
      
      inline def setAutoCloseUndefined: Self = StObject.set(x, "autoClose", js.undefined)
      
      inline def setAutoMapping(value: Boolean): Self = StObject.set(x, "autoMapping", value.asInstanceOf[js.Any])
      
      inline def setAutoMappingJibun(value: Boolean): Self = StObject.set(x, "autoMappingJibun", value.asInstanceOf[js.Any])
      
      inline def setAutoMappingJibunUndefined: Self = StObject.set(x, "autoMappingJibun", js.undefined)
      
      inline def setAutoMappingRoad(value: Boolean): Self = StObject.set(x, "autoMappingRoad", value.asInstanceOf[js.Any])
      
      inline def setAutoMappingRoadUndefined: Self = StObject.set(x, "autoMappingRoad", js.undefined)
      
      inline def setAutoMappingUndefined: Self = StObject.set(x, "autoMapping", js.undefined)
      
      inline def setDefaultQuery(value: String): Self = StObject.set(x, "defaultQuery", value.asInstanceOf[js.Any])
      
      inline def setDefaultQueryUndefined: Self = StObject.set(x, "defaultQuery", js.undefined)
      
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
      
      inline def setLeft(value: Double | String): Self = StObject.set(x, "left", value.asInstanceOf[js.Any])
      
      inline def setLeftUndefined: Self = StObject.set(x, "left", js.undefined)
      
      inline def setMaxSuggestItems(value: Double): Self = StObject.set(x, "maxSuggestItems", value.asInstanceOf[js.Any])
      
      inline def setMaxSuggestItemsUndefined: Self = StObject.set(x, "maxSuggestItems", js.undefined)
      
      inline def setOnClose(value: /* state */ State => Unit): Self = StObject.set(x, "onClose", js.Any.fromFunction1(value))
      
      inline def setOnCloseUndefined: Self = StObject.set(x, "onClose", js.undefined)
      
      inline def setOnComplete(value: /* address */ Address => Unit): Self = StObject.set(x, "onComplete", js.Any.fromFunction1(value))
      
      inline def setOnCompleteUndefined: Self = StObject.set(x, "onComplete", js.undefined)
      
      inline def setOnError(value: /* error */ js.Error => Unit): Self = StObject.set(x, "onError", js.Any.fromFunction1(value))
      
      inline def setOnErrorUndefined: Self = StObject.set(x, "onError", js.undefined)
      
      inline def setOnResize(value: /* size */ Size => Unit): Self = StObject.set(x, "onResize", js.Any.fromFunction1(value))
      
      inline def setOnResizeUndefined: Self = StObject.set(x, "onResize", js.undefined)
      
      inline def setOnSearch(value: /* search */ Search => Unit): Self = StObject.set(x, "onSearch", js.Any.fromFunction1(value))
      
      inline def setOnSearchUndefined: Self = StObject.set(x, "onSearch", js.undefined)
      
      inline def setPleaseReadGuide(value: Double): Self = StObject.set(x, "pleaseReadGuide", value.asInstanceOf[js.Any])
      
      inline def setPleaseReadGuideTimer(value: Double): Self = StObject.set(x, "pleaseReadGuideTimer", value.asInstanceOf[js.Any])
      
      inline def setPleaseReadGuideTimerUndefined: Self = StObject.set(x, "pleaseReadGuideTimer", js.undefined)
      
      inline def setPleaseReadGuideUndefined: Self = StObject.set(x, "pleaseReadGuide", js.undefined)
      
      inline def setPopupKey(value: String): Self = StObject.set(x, "popupKey", value.asInstanceOf[js.Any])
      
      inline def setPopupKeyUndefined: Self = StObject.set(x, "popupKey", js.undefined)
      
      inline def setPopupTitle(value: String): Self = StObject.set(x, "popupTitle", value.asInstanceOf[js.Any])
      
      inline def setPopupTitleUndefined: Self = StObject.set(x, "popupTitle", js.undefined)
      
      inline def setShorthand(value: Boolean): Self = StObject.set(x, "shorthand", value.asInstanceOf[js.Any])
      
      inline def setShorthandUndefined: Self = StObject.set(x, "shorthand", js.undefined)
      
      inline def setShowMoreHName(value: Boolean): Self = StObject.set(x, "showMoreHName", value.asInstanceOf[js.Any])
      
      inline def setShowMoreHNameUndefined: Self = StObject.set(x, "showMoreHName", js.undefined)
      
      inline def setSubmitMode(value: Boolean): Self = StObject.set(x, "submitMode", value.asInstanceOf[js.Any])
      
      inline def setSubmitModeUndefined: Self = StObject.set(x, "submitMode", js.undefined)
      
      inline def setTheme(value: Theme): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
      
      inline def setThemeUndefined: Self = StObject.set(x, "theme", js.undefined)
      
      inline def setTop(value: Double | String): Self = StObject.set(x, "top", value.asInstanceOf[js.Any])
      
      inline def setTopUndefined: Self = StObject.set(x, "top", js.undefined)
      
      inline def setUseBannerLink(value: Boolean): Self = StObject.set(x, "useBannerLink", value.asInstanceOf[js.Any])
      
      inline def setUseBannerLinkUndefined: Self = StObject.set(x, "useBannerLink", js.undefined)
      
      inline def setUseSuggest(value: Boolean): Self = StObject.set(x, "useSuggest", value.asInstanceOf[js.Any])
      
      inline def setUseSuggestUndefined: Self = StObject.set(x, "useSuggest", js.undefined)
      
      inline def setWidth(value: String | Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    }
  }
}
