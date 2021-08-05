package typings.reactSelect

import org.scalablytyped.runtime.StringDictionary
import typings.react.mod.CSSProperties
import typings.reactSelect.componentsPlaceholderMod.PlaceholderProps
import typings.reactSelect.controlMod.ControlProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object stylesMod {
  
  @JSImport("react-select/src/styles", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("react-select/src/styles", "defaultStyles")
  @js.native
  val defaultStyles: Styles = js.native
  
  inline def mergeStyles(source: StylesConfig, target: StylesConfig): StylesConfig = (^.asInstanceOf[js.Dynamic].applyDynamic("mergeStyles")(source.asInstanceOf[js.Any], target.asInstanceOf[js.Any])).asInstanceOf[StylesConfig]
  
  type GetStyles = js.Function2[/* a */ String, /* b */ Props, CSSProperties]
  
  type Props = StringDictionary[js.Any]
  
  trait Styles extends StObject {
    
    var clearIndicator: js.UndefOr[StylesConfigFunction[js.Any]] = js.undefined
    
    var container: js.UndefOr[StylesConfigFunction[js.Any]] = js.undefined
    
    var control: js.UndefOr[StylesConfigFunction[ControlProps[js.Object]]] = js.undefined
    
    var dropdownIndicator: js.UndefOr[StylesConfigFunction[js.Any]] = js.undefined
    
    var group: js.UndefOr[StylesConfigFunction[js.Any]] = js.undefined
    
    var groupHeading: js.UndefOr[StylesConfigFunction[js.Any]] = js.undefined
    
    var indicatorSeparator: js.UndefOr[StylesConfigFunction[js.Any]] = js.undefined
    
    var indicatorsContainer: js.UndefOr[StylesConfigFunction[js.Any]] = js.undefined
    
    var input: js.UndefOr[StylesConfigFunction[js.Any]] = js.undefined
    
    var loadingIndicator: js.UndefOr[StylesConfigFunction[js.Any]] = js.undefined
    
    // TODO loadingMessageCSS?: StylesConfigFunction;
    var loadingMessage: js.UndefOr[StylesConfigFunction[js.Any]] = js.undefined
    
    var menu: js.UndefOr[StylesConfigFunction[js.Any]] = js.undefined
    
    var menuList: js.UndefOr[StylesConfigFunction[js.Any]] = js.undefined
    
    var menuPortal: js.UndefOr[StylesConfigFunction[js.Any]] = js.undefined
    
    var multiValue: js.UndefOr[StylesConfigFunction[js.Any]] = js.undefined
    
    var multiValueLabel: js.UndefOr[StylesConfigFunction[js.Any]] = js.undefined
    
    var multiValueRemove: js.UndefOr[StylesConfigFunction[js.Any]] = js.undefined
    
    // TODO noOptionsMessageCSS?: StylesConfigFunction;
    var noOptionsMessage: js.UndefOr[StylesConfigFunction[js.Any]] = js.undefined
    
    var option: js.UndefOr[StylesConfigFunction[js.Any]] = js.undefined
    
    var placeholder: js.UndefOr[StylesConfigFunction[PlaceholderProps[js.Object]]] = js.undefined
    
    var singleValue: js.UndefOr[StylesConfigFunction[js.Any]] = js.undefined
    
    var valueContainer: js.UndefOr[StylesConfigFunction[js.Any]] = js.undefined
  }
  object Styles {
    
    inline def apply(): Styles = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Styles]
    }
    
    extension [Self <: Styles](x: Self) {
      
      inline def setClearIndicator(value: (/* base */ CSSProperties, js.Any) => CSSProperties): Self = StObject.set(x, "clearIndicator", js.Any.fromFunction2(value))
      
      inline def setClearIndicatorUndefined: Self = StObject.set(x, "clearIndicator", js.undefined)
      
      inline def setContainer(value: (/* base */ CSSProperties, js.Any) => CSSProperties): Self = StObject.set(x, "container", js.Any.fromFunction2(value))
      
      inline def setContainerUndefined: Self = StObject.set(x, "container", js.undefined)
      
      inline def setControl(value: (/* base */ CSSProperties, ControlProps[js.Object]) => CSSProperties): Self = StObject.set(x, "control", js.Any.fromFunction2(value))
      
      inline def setControlUndefined: Self = StObject.set(x, "control", js.undefined)
      
      inline def setDropdownIndicator(value: (/* base */ CSSProperties, js.Any) => CSSProperties): Self = StObject.set(x, "dropdownIndicator", js.Any.fromFunction2(value))
      
      inline def setDropdownIndicatorUndefined: Self = StObject.set(x, "dropdownIndicator", js.undefined)
      
      inline def setGroup(value: (/* base */ CSSProperties, js.Any) => CSSProperties): Self = StObject.set(x, "group", js.Any.fromFunction2(value))
      
      inline def setGroupHeading(value: (/* base */ CSSProperties, js.Any) => CSSProperties): Self = StObject.set(x, "groupHeading", js.Any.fromFunction2(value))
      
      inline def setGroupHeadingUndefined: Self = StObject.set(x, "groupHeading", js.undefined)
      
      inline def setGroupUndefined: Self = StObject.set(x, "group", js.undefined)
      
      inline def setIndicatorSeparator(value: (/* base */ CSSProperties, js.Any) => CSSProperties): Self = StObject.set(x, "indicatorSeparator", js.Any.fromFunction2(value))
      
      inline def setIndicatorSeparatorUndefined: Self = StObject.set(x, "indicatorSeparator", js.undefined)
      
      inline def setIndicatorsContainer(value: (/* base */ CSSProperties, js.Any) => CSSProperties): Self = StObject.set(x, "indicatorsContainer", js.Any.fromFunction2(value))
      
      inline def setIndicatorsContainerUndefined: Self = StObject.set(x, "indicatorsContainer", js.undefined)
      
      inline def setInput(value: (/* base */ CSSProperties, js.Any) => CSSProperties): Self = StObject.set(x, "input", js.Any.fromFunction2(value))
      
      inline def setInputUndefined: Self = StObject.set(x, "input", js.undefined)
      
      inline def setLoadingIndicator(value: (/* base */ CSSProperties, js.Any) => CSSProperties): Self = StObject.set(x, "loadingIndicator", js.Any.fromFunction2(value))
      
      inline def setLoadingIndicatorUndefined: Self = StObject.set(x, "loadingIndicator", js.undefined)
      
      inline def setLoadingMessage(value: (/* base */ CSSProperties, js.Any) => CSSProperties): Self = StObject.set(x, "loadingMessage", js.Any.fromFunction2(value))
      
      inline def setLoadingMessageUndefined: Self = StObject.set(x, "loadingMessage", js.undefined)
      
      inline def setMenu(value: (/* base */ CSSProperties, js.Any) => CSSProperties): Self = StObject.set(x, "menu", js.Any.fromFunction2(value))
      
      inline def setMenuList(value: (/* base */ CSSProperties, js.Any) => CSSProperties): Self = StObject.set(x, "menuList", js.Any.fromFunction2(value))
      
      inline def setMenuListUndefined: Self = StObject.set(x, "menuList", js.undefined)
      
      inline def setMenuPortal(value: (/* base */ CSSProperties, js.Any) => CSSProperties): Self = StObject.set(x, "menuPortal", js.Any.fromFunction2(value))
      
      inline def setMenuPortalUndefined: Self = StObject.set(x, "menuPortal", js.undefined)
      
      inline def setMenuUndefined: Self = StObject.set(x, "menu", js.undefined)
      
      inline def setMultiValue(value: (/* base */ CSSProperties, js.Any) => CSSProperties): Self = StObject.set(x, "multiValue", js.Any.fromFunction2(value))
      
      inline def setMultiValueLabel(value: (/* base */ CSSProperties, js.Any) => CSSProperties): Self = StObject.set(x, "multiValueLabel", js.Any.fromFunction2(value))
      
      inline def setMultiValueLabelUndefined: Self = StObject.set(x, "multiValueLabel", js.undefined)
      
      inline def setMultiValueRemove(value: (/* base */ CSSProperties, js.Any) => CSSProperties): Self = StObject.set(x, "multiValueRemove", js.Any.fromFunction2(value))
      
      inline def setMultiValueRemoveUndefined: Self = StObject.set(x, "multiValueRemove", js.undefined)
      
      inline def setMultiValueUndefined: Self = StObject.set(x, "multiValue", js.undefined)
      
      inline def setNoOptionsMessage(value: (/* base */ CSSProperties, js.Any) => CSSProperties): Self = StObject.set(x, "noOptionsMessage", js.Any.fromFunction2(value))
      
      inline def setNoOptionsMessageUndefined: Self = StObject.set(x, "noOptionsMessage", js.undefined)
      
      inline def setOption(value: (/* base */ CSSProperties, js.Any) => CSSProperties): Self = StObject.set(x, "option", js.Any.fromFunction2(value))
      
      inline def setOptionUndefined: Self = StObject.set(x, "option", js.undefined)
      
      inline def setPlaceholder(value: (/* base */ CSSProperties, PlaceholderProps[js.Object]) => CSSProperties): Self = StObject.set(x, "placeholder", js.Any.fromFunction2(value))
      
      inline def setPlaceholderUndefined: Self = StObject.set(x, "placeholder", js.undefined)
      
      inline def setSingleValue(value: (/* base */ CSSProperties, js.Any) => CSSProperties): Self = StObject.set(x, "singleValue", js.Any.fromFunction2(value))
      
      inline def setSingleValueUndefined: Self = StObject.set(x, "singleValue", js.undefined)
      
      inline def setValueContainer(value: (/* base */ CSSProperties, js.Any) => CSSProperties): Self = StObject.set(x, "valueContainer", js.Any.fromFunction2(value))
      
      inline def setValueContainerUndefined: Self = StObject.set(x, "valueContainer", js.undefined)
    }
  }
  
  /* Inlined std.Partial<react-select.react-select/src/styles.Styles> */
  trait StylesConfig extends StObject {
    
    var clearIndicator: js.UndefOr[StylesConfigFunction[js.Any]] = js.undefined
    
    var container: js.UndefOr[StylesConfigFunction[js.Any]] = js.undefined
    
    var control: js.UndefOr[StylesConfigFunction[ControlProps[js.Object]]] = js.undefined
    
    var dropdownIndicator: js.UndefOr[StylesConfigFunction[js.Any]] = js.undefined
    
    var group: js.UndefOr[StylesConfigFunction[js.Any]] = js.undefined
    
    var groupHeading: js.UndefOr[StylesConfigFunction[js.Any]] = js.undefined
    
    var indicatorSeparator: js.UndefOr[StylesConfigFunction[js.Any]] = js.undefined
    
    var indicatorsContainer: js.UndefOr[StylesConfigFunction[js.Any]] = js.undefined
    
    var input: js.UndefOr[StylesConfigFunction[js.Any]] = js.undefined
    
    var loadingIndicator: js.UndefOr[StylesConfigFunction[js.Any]] = js.undefined
    
    var loadingMessage: js.UndefOr[StylesConfigFunction[js.Any]] = js.undefined
    
    var menu: js.UndefOr[StylesConfigFunction[js.Any]] = js.undefined
    
    var menuList: js.UndefOr[StylesConfigFunction[js.Any]] = js.undefined
    
    var menuPortal: js.UndefOr[StylesConfigFunction[js.Any]] = js.undefined
    
    var multiValue: js.UndefOr[StylesConfigFunction[js.Any]] = js.undefined
    
    var multiValueLabel: js.UndefOr[StylesConfigFunction[js.Any]] = js.undefined
    
    var multiValueRemove: js.UndefOr[StylesConfigFunction[js.Any]] = js.undefined
    
    var noOptionsMessage: js.UndefOr[StylesConfigFunction[js.Any]] = js.undefined
    
    var option: js.UndefOr[StylesConfigFunction[js.Any]] = js.undefined
    
    var placeholder: js.UndefOr[StylesConfigFunction[PlaceholderProps[js.Object]]] = js.undefined
    
    var singleValue: js.UndefOr[StylesConfigFunction[js.Any]] = js.undefined
    
    var valueContainer: js.UndefOr[StylesConfigFunction[js.Any]] = js.undefined
  }
  object StylesConfig {
    
    inline def apply(): StylesConfig = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[StylesConfig]
    }
    
    extension [Self <: StylesConfig](x: Self) {
      
      inline def setClearIndicator(value: (/* base */ CSSProperties, js.Any) => CSSProperties): Self = StObject.set(x, "clearIndicator", js.Any.fromFunction2(value))
      
      inline def setClearIndicatorUndefined: Self = StObject.set(x, "clearIndicator", js.undefined)
      
      inline def setContainer(value: (/* base */ CSSProperties, js.Any) => CSSProperties): Self = StObject.set(x, "container", js.Any.fromFunction2(value))
      
      inline def setContainerUndefined: Self = StObject.set(x, "container", js.undefined)
      
      inline def setControl(value: (/* base */ CSSProperties, ControlProps[js.Object]) => CSSProperties): Self = StObject.set(x, "control", js.Any.fromFunction2(value))
      
      inline def setControlUndefined: Self = StObject.set(x, "control", js.undefined)
      
      inline def setDropdownIndicator(value: (/* base */ CSSProperties, js.Any) => CSSProperties): Self = StObject.set(x, "dropdownIndicator", js.Any.fromFunction2(value))
      
      inline def setDropdownIndicatorUndefined: Self = StObject.set(x, "dropdownIndicator", js.undefined)
      
      inline def setGroup(value: (/* base */ CSSProperties, js.Any) => CSSProperties): Self = StObject.set(x, "group", js.Any.fromFunction2(value))
      
      inline def setGroupHeading(value: (/* base */ CSSProperties, js.Any) => CSSProperties): Self = StObject.set(x, "groupHeading", js.Any.fromFunction2(value))
      
      inline def setGroupHeadingUndefined: Self = StObject.set(x, "groupHeading", js.undefined)
      
      inline def setGroupUndefined: Self = StObject.set(x, "group", js.undefined)
      
      inline def setIndicatorSeparator(value: (/* base */ CSSProperties, js.Any) => CSSProperties): Self = StObject.set(x, "indicatorSeparator", js.Any.fromFunction2(value))
      
      inline def setIndicatorSeparatorUndefined: Self = StObject.set(x, "indicatorSeparator", js.undefined)
      
      inline def setIndicatorsContainer(value: (/* base */ CSSProperties, js.Any) => CSSProperties): Self = StObject.set(x, "indicatorsContainer", js.Any.fromFunction2(value))
      
      inline def setIndicatorsContainerUndefined: Self = StObject.set(x, "indicatorsContainer", js.undefined)
      
      inline def setInput(value: (/* base */ CSSProperties, js.Any) => CSSProperties): Self = StObject.set(x, "input", js.Any.fromFunction2(value))
      
      inline def setInputUndefined: Self = StObject.set(x, "input", js.undefined)
      
      inline def setLoadingIndicator(value: (/* base */ CSSProperties, js.Any) => CSSProperties): Self = StObject.set(x, "loadingIndicator", js.Any.fromFunction2(value))
      
      inline def setLoadingIndicatorUndefined: Self = StObject.set(x, "loadingIndicator", js.undefined)
      
      inline def setLoadingMessage(value: (/* base */ CSSProperties, js.Any) => CSSProperties): Self = StObject.set(x, "loadingMessage", js.Any.fromFunction2(value))
      
      inline def setLoadingMessageUndefined: Self = StObject.set(x, "loadingMessage", js.undefined)
      
      inline def setMenu(value: (/* base */ CSSProperties, js.Any) => CSSProperties): Self = StObject.set(x, "menu", js.Any.fromFunction2(value))
      
      inline def setMenuList(value: (/* base */ CSSProperties, js.Any) => CSSProperties): Self = StObject.set(x, "menuList", js.Any.fromFunction2(value))
      
      inline def setMenuListUndefined: Self = StObject.set(x, "menuList", js.undefined)
      
      inline def setMenuPortal(value: (/* base */ CSSProperties, js.Any) => CSSProperties): Self = StObject.set(x, "menuPortal", js.Any.fromFunction2(value))
      
      inline def setMenuPortalUndefined: Self = StObject.set(x, "menuPortal", js.undefined)
      
      inline def setMenuUndefined: Self = StObject.set(x, "menu", js.undefined)
      
      inline def setMultiValue(value: (/* base */ CSSProperties, js.Any) => CSSProperties): Self = StObject.set(x, "multiValue", js.Any.fromFunction2(value))
      
      inline def setMultiValueLabel(value: (/* base */ CSSProperties, js.Any) => CSSProperties): Self = StObject.set(x, "multiValueLabel", js.Any.fromFunction2(value))
      
      inline def setMultiValueLabelUndefined: Self = StObject.set(x, "multiValueLabel", js.undefined)
      
      inline def setMultiValueRemove(value: (/* base */ CSSProperties, js.Any) => CSSProperties): Self = StObject.set(x, "multiValueRemove", js.Any.fromFunction2(value))
      
      inline def setMultiValueRemoveUndefined: Self = StObject.set(x, "multiValueRemove", js.undefined)
      
      inline def setMultiValueUndefined: Self = StObject.set(x, "multiValue", js.undefined)
      
      inline def setNoOptionsMessage(value: (/* base */ CSSProperties, js.Any) => CSSProperties): Self = StObject.set(x, "noOptionsMessage", js.Any.fromFunction2(value))
      
      inline def setNoOptionsMessageUndefined: Self = StObject.set(x, "noOptionsMessage", js.undefined)
      
      inline def setOption(value: (/* base */ CSSProperties, js.Any) => CSSProperties): Self = StObject.set(x, "option", js.Any.fromFunction2(value))
      
      inline def setOptionUndefined: Self = StObject.set(x, "option", js.undefined)
      
      inline def setPlaceholder(value: (/* base */ CSSProperties, PlaceholderProps[js.Object]) => CSSProperties): Self = StObject.set(x, "placeholder", js.Any.fromFunction2(value))
      
      inline def setPlaceholderUndefined: Self = StObject.set(x, "placeholder", js.undefined)
      
      inline def setSingleValue(value: (/* base */ CSSProperties, js.Any) => CSSProperties): Self = StObject.set(x, "singleValue", js.Any.fromFunction2(value))
      
      inline def setSingleValueUndefined: Self = StObject.set(x, "singleValue", js.undefined)
      
      inline def setValueContainer(value: (/* base */ CSSProperties, js.Any) => CSSProperties): Self = StObject.set(x, "valueContainer", js.Any.fromFunction2(value))
      
      inline def setValueContainerUndefined: Self = StObject.set(x, "valueContainer", js.undefined)
    }
  }
  
  type StylesConfigFunction[Props] = js.Function2[/* base */ CSSProperties, /* props */ Props, CSSProperties]
}
