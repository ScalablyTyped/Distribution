package typings.reactSelect.anon

import typings.reactSelect.distDeclarationsSrcFiltersMod.FilterOptionOption
import typings.reactSelect.distDeclarationsSrcTypesMod.GroupBase
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Arialive extends StObject {
  
  var `aria-live`: String
  
  var backspaceRemovesValue: Boolean
  
  var blurInputOnSelect: Boolean
  
  var captureMenuScroll: Boolean
  
  var closeMenuOnScroll: Boolean
  
  var closeMenuOnSelect: Boolean
  
  var controlShouldRenderValue: Boolean
  
  var escapeClearsValue: Boolean
  
  def filterOption(option: FilterOptionOption[Any], rawInput: String): Boolean
  
  def formatGroupLabel[Option_1, Group_1 /* <: GroupBase[Option_1] */](group: Group_1): String
  
  def getOptionLabel[Option_2](option: Option_2): String
  
  def getOptionValue[Option_3](option: Option_3): String
  
  var isDisabled: Boolean
  
  var isLoading: Boolean
  
  var isMulti: Boolean
  
  def isOptionDisabled[Option_4](option: Option_4): Boolean
  
  var isRtl: Boolean
  
  var isSearchable: Boolean
  
  def loadingMessage(): String
  
  var maxMenuHeight: Double
  
  var menuIsOpen: Boolean
  
  var menuPlacement: String
  
  var menuPosition: String
  
  var menuShouldBlockScroll: Boolean
  
  var menuShouldScrollIntoView: Boolean
  
  var minMenuHeight: Double
  
  def noOptionsMessage(): String
  
  var openMenuOnClick: Boolean
  
  var openMenuOnFocus: Boolean
  
  var options: js.Array[scala.Nothing]
  
  var pageSize: Double
  
  var placeholder: String
  
  def screenReaderStatus(hasCount: Count): String
  
  var tabIndex: Double
  
  var tabSelectsValue: Boolean
}
object Arialive {
  
  inline def apply(
    `aria-live`: String,
    backspaceRemovesValue: Boolean,
    blurInputOnSelect: Boolean,
    captureMenuScroll: Boolean,
    closeMenuOnScroll: Boolean,
    closeMenuOnSelect: Boolean,
    controlShouldRenderValue: Boolean,
    escapeClearsValue: Boolean,
    filterOption: (FilterOptionOption[Any], String) => Boolean,
    formatGroupLabel: Any => String,
    getOptionLabel: Any => String,
    getOptionValue: Any => String,
    isDisabled: Boolean,
    isLoading: Boolean,
    isMulti: Boolean,
    isOptionDisabled: Any => Boolean,
    isRtl: Boolean,
    isSearchable: Boolean,
    loadingMessage: () => String,
    maxMenuHeight: Double,
    menuIsOpen: Boolean,
    menuPlacement: String,
    menuPosition: String,
    menuShouldBlockScroll: Boolean,
    menuShouldScrollIntoView: Boolean,
    minMenuHeight: Double,
    noOptionsMessage: () => String,
    openMenuOnClick: Boolean,
    openMenuOnFocus: Boolean,
    options: js.Array[scala.Nothing],
    pageSize: Double,
    placeholder: String,
    screenReaderStatus: Count => String,
    tabIndex: Double,
    tabSelectsValue: Boolean
  ): Arialive = {
    val __obj = js.Dynamic.literal(backspaceRemovesValue = backspaceRemovesValue.asInstanceOf[js.Any], blurInputOnSelect = blurInputOnSelect.asInstanceOf[js.Any], captureMenuScroll = captureMenuScroll.asInstanceOf[js.Any], closeMenuOnScroll = closeMenuOnScroll.asInstanceOf[js.Any], closeMenuOnSelect = closeMenuOnSelect.asInstanceOf[js.Any], controlShouldRenderValue = controlShouldRenderValue.asInstanceOf[js.Any], escapeClearsValue = escapeClearsValue.asInstanceOf[js.Any], filterOption = js.Any.fromFunction2(filterOption), formatGroupLabel = js.Any.fromFunction1(formatGroupLabel), getOptionLabel = js.Any.fromFunction1(getOptionLabel), getOptionValue = js.Any.fromFunction1(getOptionValue), isDisabled = isDisabled.asInstanceOf[js.Any], isLoading = isLoading.asInstanceOf[js.Any], isMulti = isMulti.asInstanceOf[js.Any], isOptionDisabled = js.Any.fromFunction1(isOptionDisabled), isRtl = isRtl.asInstanceOf[js.Any], isSearchable = isSearchable.asInstanceOf[js.Any], loadingMessage = js.Any.fromFunction0(loadingMessage), maxMenuHeight = maxMenuHeight.asInstanceOf[js.Any], menuIsOpen = menuIsOpen.asInstanceOf[js.Any], menuPlacement = menuPlacement.asInstanceOf[js.Any], menuPosition = menuPosition.asInstanceOf[js.Any], menuShouldBlockScroll = menuShouldBlockScroll.asInstanceOf[js.Any], menuShouldScrollIntoView = menuShouldScrollIntoView.asInstanceOf[js.Any], minMenuHeight = minMenuHeight.asInstanceOf[js.Any], noOptionsMessage = js.Any.fromFunction0(noOptionsMessage), openMenuOnClick = openMenuOnClick.asInstanceOf[js.Any], openMenuOnFocus = openMenuOnFocus.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any], pageSize = pageSize.asInstanceOf[js.Any], placeholder = placeholder.asInstanceOf[js.Any], screenReaderStatus = js.Any.fromFunction1(screenReaderStatus), tabIndex = tabIndex.asInstanceOf[js.Any], tabSelectsValue = tabSelectsValue.asInstanceOf[js.Any])
    __obj.updateDynamic("aria-live")(`aria-live`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Arialive]
  }
  
  extension [Self <: Arialive](x: Self) {
    
    inline def `setAria-live`(value: String): Self = StObject.set(x, "aria-live", value.asInstanceOf[js.Any])
    
    inline def setBackspaceRemovesValue(value: Boolean): Self = StObject.set(x, "backspaceRemovesValue", value.asInstanceOf[js.Any])
    
    inline def setBlurInputOnSelect(value: Boolean): Self = StObject.set(x, "blurInputOnSelect", value.asInstanceOf[js.Any])
    
    inline def setCaptureMenuScroll(value: Boolean): Self = StObject.set(x, "captureMenuScroll", value.asInstanceOf[js.Any])
    
    inline def setCloseMenuOnScroll(value: Boolean): Self = StObject.set(x, "closeMenuOnScroll", value.asInstanceOf[js.Any])
    
    inline def setCloseMenuOnSelect(value: Boolean): Self = StObject.set(x, "closeMenuOnSelect", value.asInstanceOf[js.Any])
    
    inline def setControlShouldRenderValue(value: Boolean): Self = StObject.set(x, "controlShouldRenderValue", value.asInstanceOf[js.Any])
    
    inline def setEscapeClearsValue(value: Boolean): Self = StObject.set(x, "escapeClearsValue", value.asInstanceOf[js.Any])
    
    inline def setFilterOption(value: (FilterOptionOption[Any], String) => Boolean): Self = StObject.set(x, "filterOption", js.Any.fromFunction2(value))
    
    inline def setFormatGroupLabel(value: Any => String): Self = StObject.set(x, "formatGroupLabel", js.Any.fromFunction1(value))
    
    inline def setGetOptionLabel(value: Any => String): Self = StObject.set(x, "getOptionLabel", js.Any.fromFunction1(value))
    
    inline def setGetOptionValue(value: Any => String): Self = StObject.set(x, "getOptionValue", js.Any.fromFunction1(value))
    
    inline def setIsDisabled(value: Boolean): Self = StObject.set(x, "isDisabled", value.asInstanceOf[js.Any])
    
    inline def setIsLoading(value: Boolean): Self = StObject.set(x, "isLoading", value.asInstanceOf[js.Any])
    
    inline def setIsMulti(value: Boolean): Self = StObject.set(x, "isMulti", value.asInstanceOf[js.Any])
    
    inline def setIsOptionDisabled(value: Any => Boolean): Self = StObject.set(x, "isOptionDisabled", js.Any.fromFunction1(value))
    
    inline def setIsRtl(value: Boolean): Self = StObject.set(x, "isRtl", value.asInstanceOf[js.Any])
    
    inline def setIsSearchable(value: Boolean): Self = StObject.set(x, "isSearchable", value.asInstanceOf[js.Any])
    
    inline def setLoadingMessage(value: () => String): Self = StObject.set(x, "loadingMessage", js.Any.fromFunction0(value))
    
    inline def setMaxMenuHeight(value: Double): Self = StObject.set(x, "maxMenuHeight", value.asInstanceOf[js.Any])
    
    inline def setMenuIsOpen(value: Boolean): Self = StObject.set(x, "menuIsOpen", value.asInstanceOf[js.Any])
    
    inline def setMenuPlacement(value: String): Self = StObject.set(x, "menuPlacement", value.asInstanceOf[js.Any])
    
    inline def setMenuPosition(value: String): Self = StObject.set(x, "menuPosition", value.asInstanceOf[js.Any])
    
    inline def setMenuShouldBlockScroll(value: Boolean): Self = StObject.set(x, "menuShouldBlockScroll", value.asInstanceOf[js.Any])
    
    inline def setMenuShouldScrollIntoView(value: Boolean): Self = StObject.set(x, "menuShouldScrollIntoView", value.asInstanceOf[js.Any])
    
    inline def setMinMenuHeight(value: Double): Self = StObject.set(x, "minMenuHeight", value.asInstanceOf[js.Any])
    
    inline def setNoOptionsMessage(value: () => String): Self = StObject.set(x, "noOptionsMessage", js.Any.fromFunction0(value))
    
    inline def setOpenMenuOnClick(value: Boolean): Self = StObject.set(x, "openMenuOnClick", value.asInstanceOf[js.Any])
    
    inline def setOpenMenuOnFocus(value: Boolean): Self = StObject.set(x, "openMenuOnFocus", value.asInstanceOf[js.Any])
    
    inline def setOptions(value: js.Array[scala.Nothing]): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    inline def setOptionsVarargs(value: scala.Nothing*): Self = StObject.set(x, "options", js.Array(value*))
    
    inline def setPageSize(value: Double): Self = StObject.set(x, "pageSize", value.asInstanceOf[js.Any])
    
    inline def setPlaceholder(value: String): Self = StObject.set(x, "placeholder", value.asInstanceOf[js.Any])
    
    inline def setScreenReaderStatus(value: Count => String): Self = StObject.set(x, "screenReaderStatus", js.Any.fromFunction1(value))
    
    inline def setTabIndex(value: Double): Self = StObject.set(x, "tabIndex", value.asInstanceOf[js.Any])
    
    inline def setTabSelectsValue(value: Boolean): Self = StObject.set(x, "tabSelectsValue", value.asInstanceOf[js.Any])
  }
}
