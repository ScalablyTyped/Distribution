package typings.reactSelect

import typings.reactSelect.anon.AriaSelection
import typings.reactSelect.anon.Arialive
import typings.reactSelect.anon.Count
import typings.reactSelect.anon.InputIsHidden
import typings.reactSelect.distDeclarationsSrcFiltersMod.FilterOptionOption
import typings.reactSelect.distDeclarationsSrcSelectMod.Props
import typings.reactSelect.distDeclarationsSrcSelectMod.State
import typings.reactSelect.distDeclarationsSrcTypesMod.GroupBase
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distDeclarationsSrcBaseMod {
  
  @JSImport("react-select/dist/declarations/src/base", JSImport.Default)
  @js.native
  open class default[Option, IsMulti /* <: Boolean */, Group /* <: GroupBase[Option] */] protected ()
    extends typings.reactSelect.distDeclarationsSrcSelectMod.default[Option, IsMulti, Group] {
    def this(props: Props[Option, IsMulti, Group]) = this()
  }
  /* static members */
  object default {
    
    @JSImport("react-select/dist/declarations/src/base", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("react-select/dist/declarations/src/base", "default.defaultProps")
    @js.native
    def defaultProps: Arialive = js.native
    inline def defaultProps_=(x: Arialive): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
    
    inline def getDerivedStateFromProps(props: Props[Any, Boolean, GroupBase[Any]], state: State[Any, Boolean, GroupBase[Any]]): AriaSelection | InputIsHidden = (^.asInstanceOf[js.Dynamic].applyDynamic("getDerivedStateFromProps")(props.asInstanceOf[js.Any], state.asInstanceOf[js.Any])).asInstanceOf[AriaSelection | InputIsHidden]
  }
  
  object defaultProps {
    
    @JSImport("react-select/dist/declarations/src/base", "defaultProps")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("react-select/dist/declarations/src/base", "defaultProps.aria-live")
    @js.native
    def ariaLive: String = js.native
    
    inline def ariaLive_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("aria-live")(x.asInstanceOf[js.Any])
    
    @JSImport("react-select/dist/declarations/src/base", "defaultProps.backspaceRemovesValue")
    @js.native
    def backspaceRemovesValue: Boolean = js.native
    inline def backspaceRemovesValue_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("backspaceRemovesValue")(x.asInstanceOf[js.Any])
    
    @JSImport("react-select/dist/declarations/src/base", "defaultProps.blurInputOnSelect")
    @js.native
    def blurInputOnSelect: Boolean = js.native
    inline def blurInputOnSelect_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("blurInputOnSelect")(x.asInstanceOf[js.Any])
    
    @JSImport("react-select/dist/declarations/src/base", "defaultProps.captureMenuScroll")
    @js.native
    def captureMenuScroll: Boolean = js.native
    inline def captureMenuScroll_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("captureMenuScroll")(x.asInstanceOf[js.Any])
    
    @JSImport("react-select/dist/declarations/src/base", "defaultProps.closeMenuOnScroll")
    @js.native
    def closeMenuOnScroll: Boolean = js.native
    inline def closeMenuOnScroll_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("closeMenuOnScroll")(x.asInstanceOf[js.Any])
    
    @JSImport("react-select/dist/declarations/src/base", "defaultProps.closeMenuOnSelect")
    @js.native
    def closeMenuOnSelect: Boolean = js.native
    inline def closeMenuOnSelect_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("closeMenuOnSelect")(x.asInstanceOf[js.Any])
    
    @JSImport("react-select/dist/declarations/src/base", "defaultProps.controlShouldRenderValue")
    @js.native
    def controlShouldRenderValue: Boolean = js.native
    inline def controlShouldRenderValue_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("controlShouldRenderValue")(x.asInstanceOf[js.Any])
    
    @JSImport("react-select/dist/declarations/src/base", "defaultProps.escapeClearsValue")
    @js.native
    def escapeClearsValue: Boolean = js.native
    inline def escapeClearsValue_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("escapeClearsValue")(x.asInstanceOf[js.Any])
    
    inline def filterOption(option: FilterOptionOption[Any], rawInput: String): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("filterOption")(option.asInstanceOf[js.Any], rawInput.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    
    inline def formatGroupLabel[Option, Group /* <: GroupBase[Option] */](group: Group): String = ^.asInstanceOf[js.Dynamic].applyDynamic("formatGroupLabel")(group.asInstanceOf[js.Any]).asInstanceOf[String]
    
    inline def getOptionLabel[Option_1](option: Option_1): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getOptionLabel")(option.asInstanceOf[js.Any]).asInstanceOf[String]
    
    inline def getOptionValue[Option_2](option: Option_2): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getOptionValue")(option.asInstanceOf[js.Any]).asInstanceOf[String]
    
    @JSImport("react-select/dist/declarations/src/base", "defaultProps.isDisabled")
    @js.native
    def isDisabled: Boolean = js.native
    inline def isDisabled_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("isDisabled")(x.asInstanceOf[js.Any])
    
    @JSImport("react-select/dist/declarations/src/base", "defaultProps.isLoading")
    @js.native
    def isLoading: Boolean = js.native
    inline def isLoading_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("isLoading")(x.asInstanceOf[js.Any])
    
    @JSImport("react-select/dist/declarations/src/base", "defaultProps.isMulti")
    @js.native
    def isMulti: Boolean = js.native
    inline def isMulti_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("isMulti")(x.asInstanceOf[js.Any])
    
    inline def isOptionDisabled[Option_3](option: Option_3): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isOptionDisabled")(option.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    
    @JSImport("react-select/dist/declarations/src/base", "defaultProps.isRtl")
    @js.native
    def isRtl: Boolean = js.native
    inline def isRtl_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("isRtl")(x.asInstanceOf[js.Any])
    
    @JSImport("react-select/dist/declarations/src/base", "defaultProps.isSearchable")
    @js.native
    def isSearchable: Boolean = js.native
    inline def isSearchable_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("isSearchable")(x.asInstanceOf[js.Any])
    
    inline def loadingMessage(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("loadingMessage")().asInstanceOf[String]
    
    @JSImport("react-select/dist/declarations/src/base", "defaultProps.maxMenuHeight")
    @js.native
    def maxMenuHeight: Double = js.native
    inline def maxMenuHeight_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("maxMenuHeight")(x.asInstanceOf[js.Any])
    
    @JSImport("react-select/dist/declarations/src/base", "defaultProps.menuIsOpen")
    @js.native
    def menuIsOpen: Boolean = js.native
    inline def menuIsOpen_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("menuIsOpen")(x.asInstanceOf[js.Any])
    
    @JSImport("react-select/dist/declarations/src/base", "defaultProps.menuPlacement")
    @js.native
    def menuPlacement: String = js.native
    inline def menuPlacement_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("menuPlacement")(x.asInstanceOf[js.Any])
    
    @JSImport("react-select/dist/declarations/src/base", "defaultProps.menuPosition")
    @js.native
    def menuPosition: String = js.native
    inline def menuPosition_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("menuPosition")(x.asInstanceOf[js.Any])
    
    @JSImport("react-select/dist/declarations/src/base", "defaultProps.menuShouldBlockScroll")
    @js.native
    def menuShouldBlockScroll: Boolean = js.native
    inline def menuShouldBlockScroll_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("menuShouldBlockScroll")(x.asInstanceOf[js.Any])
    
    @JSImport("react-select/dist/declarations/src/base", "defaultProps.menuShouldScrollIntoView")
    @js.native
    def menuShouldScrollIntoView: Boolean = js.native
    inline def menuShouldScrollIntoView_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("menuShouldScrollIntoView")(x.asInstanceOf[js.Any])
    
    @JSImport("react-select/dist/declarations/src/base", "defaultProps.minMenuHeight")
    @js.native
    def minMenuHeight: Double = js.native
    inline def minMenuHeight_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("minMenuHeight")(x.asInstanceOf[js.Any])
    
    inline def noOptionsMessage(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("noOptionsMessage")().asInstanceOf[String]
    
    @JSImport("react-select/dist/declarations/src/base", "defaultProps.openMenuOnClick")
    @js.native
    def openMenuOnClick: Boolean = js.native
    inline def openMenuOnClick_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("openMenuOnClick")(x.asInstanceOf[js.Any])
    
    @JSImport("react-select/dist/declarations/src/base", "defaultProps.openMenuOnFocus")
    @js.native
    def openMenuOnFocus: Boolean = js.native
    inline def openMenuOnFocus_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("openMenuOnFocus")(x.asInstanceOf[js.Any])
    
    @JSImport("react-select/dist/declarations/src/base", "defaultProps.options")
    @js.native
    def options: js.Array[scala.Nothing] = js.native
    inline def options_=(x: js.Array[scala.Nothing]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("options")(x.asInstanceOf[js.Any])
    
    @JSImport("react-select/dist/declarations/src/base", "defaultProps.pageSize")
    @js.native
    def pageSize: Double = js.native
    inline def pageSize_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("pageSize")(x.asInstanceOf[js.Any])
    
    @JSImport("react-select/dist/declarations/src/base", "defaultProps.placeholder")
    @js.native
    def placeholder: String = js.native
    inline def placeholder_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("placeholder")(x.asInstanceOf[js.Any])
    
    inline def screenReaderStatus(param0: Count): String = ^.asInstanceOf[js.Dynamic].applyDynamic("screenReaderStatus")(param0.asInstanceOf[js.Any]).asInstanceOf[String]
    
    @JSImport("react-select/dist/declarations/src/base", "defaultProps.tabIndex")
    @js.native
    def tabIndex: Double = js.native
    inline def tabIndex_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("tabIndex")(x.asInstanceOf[js.Any])
    
    @JSImport("react-select/dist/declarations/src/base", "defaultProps.tabSelectsValue")
    @js.native
    def tabSelectsValue: Boolean = js.native
    inline def tabSelectsValue_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("tabSelectsValue")(x.asInstanceOf[js.Any])
  }
}
