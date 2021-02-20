package typings.reactSelect

import org.scalablytyped.runtime.StringDictionary
import typings.react.mod.CSSProperties
import typings.reactSelect.componentsPlaceholderMod.PlaceholderProps
import typings.reactSelect.controlMod.ControlProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object stylesMod {
  
  @JSImport("react-select/src/styles", "defaultStyles")
  @js.native
  val defaultStyles: Styles = js.native
  
  @JSImport("react-select/src/styles", "mergeStyles")
  @js.native
  def mergeStyles(source: StylesConfig, target: StylesConfig): StylesConfig = js.native
  
  type GetStyles = js.Function2[/* a */ String, /* b */ Props, CSSProperties]
  
  type Props = StringDictionary[js.Any]
  
  @js.native
  trait Styles extends StObject {
    
    var clearIndicator: js.UndefOr[StylesConfigFunction[_]] = js.native
    
    var container: js.UndefOr[StylesConfigFunction[_]] = js.native
    
    var control: js.UndefOr[StylesConfigFunction[ControlProps[js.Object]]] = js.native
    
    var dropdownIndicator: js.UndefOr[StylesConfigFunction[_]] = js.native
    
    var group: js.UndefOr[StylesConfigFunction[_]] = js.native
    
    var groupHeading: js.UndefOr[StylesConfigFunction[_]] = js.native
    
    var indicatorSeparator: js.UndefOr[StylesConfigFunction[_]] = js.native
    
    var indicatorsContainer: js.UndefOr[StylesConfigFunction[_]] = js.native
    
    var input: js.UndefOr[StylesConfigFunction[_]] = js.native
    
    var loadingIndicator: js.UndefOr[StylesConfigFunction[_]] = js.native
    
    // TODO loadingMessageCSS?: StylesConfigFunction;
    var loadingMessage: js.UndefOr[StylesConfigFunction[_]] = js.native
    
    var menu: js.UndefOr[StylesConfigFunction[_]] = js.native
    
    var menuList: js.UndefOr[StylesConfigFunction[_]] = js.native
    
    var menuPortal: js.UndefOr[StylesConfigFunction[_]] = js.native
    
    var multiValue: js.UndefOr[StylesConfigFunction[_]] = js.native
    
    var multiValueLabel: js.UndefOr[StylesConfigFunction[_]] = js.native
    
    var multiValueRemove: js.UndefOr[StylesConfigFunction[_]] = js.native
    
    // TODO noOptionsMessageCSS?: StylesConfigFunction;
    var noOptionsMessage: js.UndefOr[StylesConfigFunction[_]] = js.native
    
    var option: js.UndefOr[StylesConfigFunction[_]] = js.native
    
    var placeholder: js.UndefOr[StylesConfigFunction[PlaceholderProps[js.Object]]] = js.native
    
    var singleValue: js.UndefOr[StylesConfigFunction[_]] = js.native
    
    var valueContainer: js.UndefOr[StylesConfigFunction[_]] = js.native
  }
  object Styles {
    
    @scala.inline
    def apply(): Styles = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Styles]
    }
    
    @scala.inline
    implicit class StylesMutableBuilder[Self <: Styles] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setClearIndicator(value: (/* base */ CSSProperties, _) => CSSProperties): Self = StObject.set(x, "clearIndicator", js.Any.fromFunction2(value))
      
      @scala.inline
      def setClearIndicatorUndefined: Self = StObject.set(x, "clearIndicator", js.undefined)
      
      @scala.inline
      def setContainer(value: (/* base */ CSSProperties, _) => CSSProperties): Self = StObject.set(x, "container", js.Any.fromFunction2(value))
      
      @scala.inline
      def setContainerUndefined: Self = StObject.set(x, "container", js.undefined)
      
      @scala.inline
      def setControl(value: (/* base */ CSSProperties, ControlProps[js.Object]) => CSSProperties): Self = StObject.set(x, "control", js.Any.fromFunction2(value))
      
      @scala.inline
      def setControlUndefined: Self = StObject.set(x, "control", js.undefined)
      
      @scala.inline
      def setDropdownIndicator(value: (/* base */ CSSProperties, _) => CSSProperties): Self = StObject.set(x, "dropdownIndicator", js.Any.fromFunction2(value))
      
      @scala.inline
      def setDropdownIndicatorUndefined: Self = StObject.set(x, "dropdownIndicator", js.undefined)
      
      @scala.inline
      def setGroup(value: (/* base */ CSSProperties, _) => CSSProperties): Self = StObject.set(x, "group", js.Any.fromFunction2(value))
      
      @scala.inline
      def setGroupHeading(value: (/* base */ CSSProperties, _) => CSSProperties): Self = StObject.set(x, "groupHeading", js.Any.fromFunction2(value))
      
      @scala.inline
      def setGroupHeadingUndefined: Self = StObject.set(x, "groupHeading", js.undefined)
      
      @scala.inline
      def setGroupUndefined: Self = StObject.set(x, "group", js.undefined)
      
      @scala.inline
      def setIndicatorSeparator(value: (/* base */ CSSProperties, _) => CSSProperties): Self = StObject.set(x, "indicatorSeparator", js.Any.fromFunction2(value))
      
      @scala.inline
      def setIndicatorSeparatorUndefined: Self = StObject.set(x, "indicatorSeparator", js.undefined)
      
      @scala.inline
      def setIndicatorsContainer(value: (/* base */ CSSProperties, _) => CSSProperties): Self = StObject.set(x, "indicatorsContainer", js.Any.fromFunction2(value))
      
      @scala.inline
      def setIndicatorsContainerUndefined: Self = StObject.set(x, "indicatorsContainer", js.undefined)
      
      @scala.inline
      def setInput(value: (/* base */ CSSProperties, _) => CSSProperties): Self = StObject.set(x, "input", js.Any.fromFunction2(value))
      
      @scala.inline
      def setInputUndefined: Self = StObject.set(x, "input", js.undefined)
      
      @scala.inline
      def setLoadingIndicator(value: (/* base */ CSSProperties, _) => CSSProperties): Self = StObject.set(x, "loadingIndicator", js.Any.fromFunction2(value))
      
      @scala.inline
      def setLoadingIndicatorUndefined: Self = StObject.set(x, "loadingIndicator", js.undefined)
      
      @scala.inline
      def setLoadingMessage(value: (/* base */ CSSProperties, _) => CSSProperties): Self = StObject.set(x, "loadingMessage", js.Any.fromFunction2(value))
      
      @scala.inline
      def setLoadingMessageUndefined: Self = StObject.set(x, "loadingMessage", js.undefined)
      
      @scala.inline
      def setMenu(value: (/* base */ CSSProperties, _) => CSSProperties): Self = StObject.set(x, "menu", js.Any.fromFunction2(value))
      
      @scala.inline
      def setMenuList(value: (/* base */ CSSProperties, _) => CSSProperties): Self = StObject.set(x, "menuList", js.Any.fromFunction2(value))
      
      @scala.inline
      def setMenuListUndefined: Self = StObject.set(x, "menuList", js.undefined)
      
      @scala.inline
      def setMenuPortal(value: (/* base */ CSSProperties, _) => CSSProperties): Self = StObject.set(x, "menuPortal", js.Any.fromFunction2(value))
      
      @scala.inline
      def setMenuPortalUndefined: Self = StObject.set(x, "menuPortal", js.undefined)
      
      @scala.inline
      def setMenuUndefined: Self = StObject.set(x, "menu", js.undefined)
      
      @scala.inline
      def setMultiValue(value: (/* base */ CSSProperties, _) => CSSProperties): Self = StObject.set(x, "multiValue", js.Any.fromFunction2(value))
      
      @scala.inline
      def setMultiValueLabel(value: (/* base */ CSSProperties, _) => CSSProperties): Self = StObject.set(x, "multiValueLabel", js.Any.fromFunction2(value))
      
      @scala.inline
      def setMultiValueLabelUndefined: Self = StObject.set(x, "multiValueLabel", js.undefined)
      
      @scala.inline
      def setMultiValueRemove(value: (/* base */ CSSProperties, _) => CSSProperties): Self = StObject.set(x, "multiValueRemove", js.Any.fromFunction2(value))
      
      @scala.inline
      def setMultiValueRemoveUndefined: Self = StObject.set(x, "multiValueRemove", js.undefined)
      
      @scala.inline
      def setMultiValueUndefined: Self = StObject.set(x, "multiValue", js.undefined)
      
      @scala.inline
      def setNoOptionsMessage(value: (/* base */ CSSProperties, _) => CSSProperties): Self = StObject.set(x, "noOptionsMessage", js.Any.fromFunction2(value))
      
      @scala.inline
      def setNoOptionsMessageUndefined: Self = StObject.set(x, "noOptionsMessage", js.undefined)
      
      @scala.inline
      def setOption(value: (/* base */ CSSProperties, _) => CSSProperties): Self = StObject.set(x, "option", js.Any.fromFunction2(value))
      
      @scala.inline
      def setOptionUndefined: Self = StObject.set(x, "option", js.undefined)
      
      @scala.inline
      def setPlaceholder(value: (/* base */ CSSProperties, PlaceholderProps[js.Object]) => CSSProperties): Self = StObject.set(x, "placeholder", js.Any.fromFunction2(value))
      
      @scala.inline
      def setPlaceholderUndefined: Self = StObject.set(x, "placeholder", js.undefined)
      
      @scala.inline
      def setSingleValue(value: (/* base */ CSSProperties, _) => CSSProperties): Self = StObject.set(x, "singleValue", js.Any.fromFunction2(value))
      
      @scala.inline
      def setSingleValueUndefined: Self = StObject.set(x, "singleValue", js.undefined)
      
      @scala.inline
      def setValueContainer(value: (/* base */ CSSProperties, _) => CSSProperties): Self = StObject.set(x, "valueContainer", js.Any.fromFunction2(value))
      
      @scala.inline
      def setValueContainerUndefined: Self = StObject.set(x, "valueContainer", js.undefined)
    }
  }
  
  /* Inlined std.Partial<react-select.react-select/src/styles.Styles> */
  @js.native
  trait StylesConfig extends StObject {
    
    var clearIndicator: js.UndefOr[StylesConfigFunction[_]] = js.native
    
    var container: js.UndefOr[StylesConfigFunction[_]] = js.native
    
    var control: js.UndefOr[StylesConfigFunction[ControlProps[js.Object]]] = js.native
    
    var dropdownIndicator: js.UndefOr[StylesConfigFunction[_]] = js.native
    
    var group: js.UndefOr[StylesConfigFunction[_]] = js.native
    
    var groupHeading: js.UndefOr[StylesConfigFunction[_]] = js.native
    
    var indicatorSeparator: js.UndefOr[StylesConfigFunction[_]] = js.native
    
    var indicatorsContainer: js.UndefOr[StylesConfigFunction[_]] = js.native
    
    var input: js.UndefOr[StylesConfigFunction[_]] = js.native
    
    var loadingIndicator: js.UndefOr[StylesConfigFunction[_]] = js.native
    
    var loadingMessage: js.UndefOr[StylesConfigFunction[_]] = js.native
    
    var menu: js.UndefOr[StylesConfigFunction[_]] = js.native
    
    var menuList: js.UndefOr[StylesConfigFunction[_]] = js.native
    
    var menuPortal: js.UndefOr[StylesConfigFunction[_]] = js.native
    
    var multiValue: js.UndefOr[StylesConfigFunction[_]] = js.native
    
    var multiValueLabel: js.UndefOr[StylesConfigFunction[_]] = js.native
    
    var multiValueRemove: js.UndefOr[StylesConfigFunction[_]] = js.native
    
    var noOptionsMessage: js.UndefOr[StylesConfigFunction[_]] = js.native
    
    var option: js.UndefOr[StylesConfigFunction[_]] = js.native
    
    var placeholder: js.UndefOr[StylesConfigFunction[PlaceholderProps[js.Object]]] = js.native
    
    var singleValue: js.UndefOr[StylesConfigFunction[_]] = js.native
    
    var valueContainer: js.UndefOr[StylesConfigFunction[_]] = js.native
  }
  object StylesConfig {
    
    @scala.inline
    def apply(): StylesConfig = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[StylesConfig]
    }
    
    @scala.inline
    implicit class StylesConfigMutableBuilder[Self <: StylesConfig] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setClearIndicator(value: (/* base */ CSSProperties, _) => CSSProperties): Self = StObject.set(x, "clearIndicator", js.Any.fromFunction2(value))
      
      @scala.inline
      def setClearIndicatorUndefined: Self = StObject.set(x, "clearIndicator", js.undefined)
      
      @scala.inline
      def setContainer(value: (/* base */ CSSProperties, _) => CSSProperties): Self = StObject.set(x, "container", js.Any.fromFunction2(value))
      
      @scala.inline
      def setContainerUndefined: Self = StObject.set(x, "container", js.undefined)
      
      @scala.inline
      def setControl(value: (/* base */ CSSProperties, ControlProps[js.Object]) => CSSProperties): Self = StObject.set(x, "control", js.Any.fromFunction2(value))
      
      @scala.inline
      def setControlUndefined: Self = StObject.set(x, "control", js.undefined)
      
      @scala.inline
      def setDropdownIndicator(value: (/* base */ CSSProperties, _) => CSSProperties): Self = StObject.set(x, "dropdownIndicator", js.Any.fromFunction2(value))
      
      @scala.inline
      def setDropdownIndicatorUndefined: Self = StObject.set(x, "dropdownIndicator", js.undefined)
      
      @scala.inline
      def setGroup(value: (/* base */ CSSProperties, _) => CSSProperties): Self = StObject.set(x, "group", js.Any.fromFunction2(value))
      
      @scala.inline
      def setGroupHeading(value: (/* base */ CSSProperties, _) => CSSProperties): Self = StObject.set(x, "groupHeading", js.Any.fromFunction2(value))
      
      @scala.inline
      def setGroupHeadingUndefined: Self = StObject.set(x, "groupHeading", js.undefined)
      
      @scala.inline
      def setGroupUndefined: Self = StObject.set(x, "group", js.undefined)
      
      @scala.inline
      def setIndicatorSeparator(value: (/* base */ CSSProperties, _) => CSSProperties): Self = StObject.set(x, "indicatorSeparator", js.Any.fromFunction2(value))
      
      @scala.inline
      def setIndicatorSeparatorUndefined: Self = StObject.set(x, "indicatorSeparator", js.undefined)
      
      @scala.inline
      def setIndicatorsContainer(value: (/* base */ CSSProperties, _) => CSSProperties): Self = StObject.set(x, "indicatorsContainer", js.Any.fromFunction2(value))
      
      @scala.inline
      def setIndicatorsContainerUndefined: Self = StObject.set(x, "indicatorsContainer", js.undefined)
      
      @scala.inline
      def setInput(value: (/* base */ CSSProperties, _) => CSSProperties): Self = StObject.set(x, "input", js.Any.fromFunction2(value))
      
      @scala.inline
      def setInputUndefined: Self = StObject.set(x, "input", js.undefined)
      
      @scala.inline
      def setLoadingIndicator(value: (/* base */ CSSProperties, _) => CSSProperties): Self = StObject.set(x, "loadingIndicator", js.Any.fromFunction2(value))
      
      @scala.inline
      def setLoadingIndicatorUndefined: Self = StObject.set(x, "loadingIndicator", js.undefined)
      
      @scala.inline
      def setLoadingMessage(value: (/* base */ CSSProperties, _) => CSSProperties): Self = StObject.set(x, "loadingMessage", js.Any.fromFunction2(value))
      
      @scala.inline
      def setLoadingMessageUndefined: Self = StObject.set(x, "loadingMessage", js.undefined)
      
      @scala.inline
      def setMenu(value: (/* base */ CSSProperties, _) => CSSProperties): Self = StObject.set(x, "menu", js.Any.fromFunction2(value))
      
      @scala.inline
      def setMenuList(value: (/* base */ CSSProperties, _) => CSSProperties): Self = StObject.set(x, "menuList", js.Any.fromFunction2(value))
      
      @scala.inline
      def setMenuListUndefined: Self = StObject.set(x, "menuList", js.undefined)
      
      @scala.inline
      def setMenuPortal(value: (/* base */ CSSProperties, _) => CSSProperties): Self = StObject.set(x, "menuPortal", js.Any.fromFunction2(value))
      
      @scala.inline
      def setMenuPortalUndefined: Self = StObject.set(x, "menuPortal", js.undefined)
      
      @scala.inline
      def setMenuUndefined: Self = StObject.set(x, "menu", js.undefined)
      
      @scala.inline
      def setMultiValue(value: (/* base */ CSSProperties, _) => CSSProperties): Self = StObject.set(x, "multiValue", js.Any.fromFunction2(value))
      
      @scala.inline
      def setMultiValueLabel(value: (/* base */ CSSProperties, _) => CSSProperties): Self = StObject.set(x, "multiValueLabel", js.Any.fromFunction2(value))
      
      @scala.inline
      def setMultiValueLabelUndefined: Self = StObject.set(x, "multiValueLabel", js.undefined)
      
      @scala.inline
      def setMultiValueRemove(value: (/* base */ CSSProperties, _) => CSSProperties): Self = StObject.set(x, "multiValueRemove", js.Any.fromFunction2(value))
      
      @scala.inline
      def setMultiValueRemoveUndefined: Self = StObject.set(x, "multiValueRemove", js.undefined)
      
      @scala.inline
      def setMultiValueUndefined: Self = StObject.set(x, "multiValue", js.undefined)
      
      @scala.inline
      def setNoOptionsMessage(value: (/* base */ CSSProperties, _) => CSSProperties): Self = StObject.set(x, "noOptionsMessage", js.Any.fromFunction2(value))
      
      @scala.inline
      def setNoOptionsMessageUndefined: Self = StObject.set(x, "noOptionsMessage", js.undefined)
      
      @scala.inline
      def setOption(value: (/* base */ CSSProperties, _) => CSSProperties): Self = StObject.set(x, "option", js.Any.fromFunction2(value))
      
      @scala.inline
      def setOptionUndefined: Self = StObject.set(x, "option", js.undefined)
      
      @scala.inline
      def setPlaceholder(value: (/* base */ CSSProperties, PlaceholderProps[js.Object]) => CSSProperties): Self = StObject.set(x, "placeholder", js.Any.fromFunction2(value))
      
      @scala.inline
      def setPlaceholderUndefined: Self = StObject.set(x, "placeholder", js.undefined)
      
      @scala.inline
      def setSingleValue(value: (/* base */ CSSProperties, _) => CSSProperties): Self = StObject.set(x, "singleValue", js.Any.fromFunction2(value))
      
      @scala.inline
      def setSingleValueUndefined: Self = StObject.set(x, "singleValue", js.undefined)
      
      @scala.inline
      def setValueContainer(value: (/* base */ CSSProperties, _) => CSSProperties): Self = StObject.set(x, "valueContainer", js.Any.fromFunction2(value))
      
      @scala.inline
      def setValueContainerUndefined: Self = StObject.set(x, "valueContainer", js.undefined)
    }
  }
  
  type StylesConfigFunction[Props] = js.Function2[/* base */ CSSProperties, /* props */ Props, CSSProperties]
}
