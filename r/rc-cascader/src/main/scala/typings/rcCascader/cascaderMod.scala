package typings.rcCascader

import org.scalablytyped.runtime.StringDictionary
import typings.rcCascader.anon.Visible
import typings.rcTrigger.interfaceMod.BuildInPlacements
import typings.react.mod.CSSProperties
import typings.react.mod.Component
import typings.react.mod.KeyboardEvent
import typings.react.mod.ReactElement
import typings.react.mod.ReactNode
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object cascaderMod {
  
  @JSImport("rc-cascader/es/Cascader", JSImport.Default)
  @js.native
  class default protected () extends Cascader {
    def this(props: CascaderProps) = this()
  }
  object default {
    
    @JSImport("rc-cascader/es/Cascader", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    @JSImport("rc-cascader/es/Cascader", "default.defaultProps")
    @js.native
    def defaultProps: CascaderProps = js.native
    inline def defaultProps_=(x: CascaderProps): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
    
    /* static member */
    inline def getDerivedStateFromProps(nextProps: CascaderProps, prevState: CascaderState): CascaderState = (^.asInstanceOf[js.Dynamic].applyDynamic("getDerivedStateFromProps")(nextProps.asInstanceOf[js.Any], prevState.asInstanceOf[js.Any])).asInstanceOf[CascaderState]
  }
  
  @js.native
  trait Cascader
    extends Component[CascaderProps, CascaderState, js.Any] {
    
    var defaultFieldNames: js.Object = js.native
    
    def getActiveOptions(activeValue: CascaderValueType): js.Array[CascaderOption] = js.native
    
    def getCurrentLevelOptions(): js.Array[CascaderOption] = js.native
    
    def getFieldName(name: String): String = js.native
    
    def getFieldNames(): CascaderFieldNames = js.native
    
    def getPopupDOMNode(): js.Any = js.native
    
    def handleChange(options: js.Array[CascaderOption], hasVisible: Visible, e: KeyboardEvent[HTMLElement]): Unit = js.native
    
    def handleItemDoubleClick(): Unit = js.native
    
    def handleKeyDown(e: KeyboardEvent[HTMLElement]): Unit = js.native
    
    def handleMenuSelect(targetOption: CascaderOption, menuIndex: Double, e: KeyboardEvent[HTMLElement]): Unit = js.native
    
    def handlePopupVisibleChange(popupVisible: Boolean): Unit = js.native
    
    def saveTrigger(node: js.Any): Unit = js.native
    
    def setPopupVisible(popupVisible: Boolean): Unit = js.native
    
    var trigger: js.Any = js.native
  }
  
  trait CascaderFieldNames extends StObject {
    
    var children: js.UndefOr[String] = js.undefined
    
    var label: js.UndefOr[String] = js.undefined
    
    var value: js.UndefOr[String | Double] = js.undefined
  }
  object CascaderFieldNames {
    
    inline def apply(): CascaderFieldNames = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CascaderFieldNames]
    }
    
    extension [Self <: CascaderFieldNames](x: Self) {
      
      inline def setChildren(value: String): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
      
      inline def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
      
      inline def setValue(value: String | Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
  
  trait CascaderOption
    extends StObject
       with /* key */ StringDictionary[js.Any] {
    
    var children: js.UndefOr[js.Array[CascaderOption]] = js.undefined
    
    var disabled: js.UndefOr[Boolean] = js.undefined
    
    var isLeaf: js.UndefOr[Boolean] = js.undefined
    
    var label: js.UndefOr[ReactNode] = js.undefined
    
    var loading: js.UndefOr[Boolean] = js.undefined
    
    var value: js.UndefOr[String | Double] = js.undefined
  }
  object CascaderOption {
    
    inline def apply(): CascaderOption = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CascaderOption]
    }
    
    extension [Self <: CascaderOption](x: Self) {
      
      inline def setChildren(value: js.Array[CascaderOption]): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setChildrenVarargs(value: CascaderOption*): Self = StObject.set(x, "children", js.Array(value :_*))
      
      inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      inline def setIsLeaf(value: Boolean): Self = StObject.set(x, "isLeaf", value.asInstanceOf[js.Any])
      
      inline def setIsLeafUndefined: Self = StObject.set(x, "isLeaf", js.undefined)
      
      inline def setLabel(value: ReactNode): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
      
      inline def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
      
      inline def setLoading(value: Boolean): Self = StObject.set(x, "loading", value.asInstanceOf[js.Any])
      
      inline def setLoadingUndefined: Self = StObject.set(x, "loading", js.undefined)
      
      inline def setValue(value: String | Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
  
  /* Inlined parent std.Pick<rc-trigger.rc-trigger.TriggerProps, 'getPopupContainer'> */
  trait CascaderProps extends StObject {
    
    var builtinPlacements: js.UndefOr[BuildInPlacements] = js.undefined
    
    var changeOnSelect: js.UndefOr[Boolean] = js.undefined
    
    var children: js.UndefOr[ReactElement] = js.undefined
    
    var defaultValue: js.UndefOr[CascaderValueType] = js.undefined
    
    var disabled: js.UndefOr[Boolean] = js.undefined
    
    var dropdownMenuColumnStyle: js.UndefOr[CSSProperties] = js.undefined
    
    var dropdownRender: js.UndefOr[js.Function1[/* menu */ ReactElement, ReactElement]] = js.undefined
    
    var expandIcon: js.UndefOr[ReactNode] = js.undefined
    
    var expandTrigger: js.UndefOr[String] = js.undefined
    
    var fieldNames: js.UndefOr[CascaderFieldNames] = js.undefined
    
    var filedNames: js.UndefOr[CascaderFieldNames] = js.undefined
    
    var getPopupContainer: js.UndefOr[js.Function1[/* node */ HTMLElement, HTMLElement]] = js.undefined
    
    var loadData: js.UndefOr[js.Function1[/* selectOptions */ js.Array[CascaderOption], Unit]] = js.undefined
    
    var loadingIcon: js.UndefOr[ReactNode] = js.undefined
    
    var onChange: js.UndefOr[
        js.Function2[/* value */ CascaderValueType, /* selectOptions */ js.Array[CascaderOption], Unit]
      ] = js.undefined
    
    var onKeyDown: js.UndefOr[js.Function1[/* e */ KeyboardEvent[HTMLElement], Unit]] = js.undefined
    
    var onPopupVisibleChange: js.UndefOr[js.Function1[/* popupVisible */ Boolean, Unit]] = js.undefined
    
    var options: js.UndefOr[js.Array[CascaderOption]] = js.undefined
    
    var popupClassName: js.UndefOr[String] = js.undefined
    
    var popupPlacement: js.UndefOr[String] = js.undefined
    
    var popupVisible: js.UndefOr[Boolean] = js.undefined
    
    var prefixCls: js.UndefOr[String] = js.undefined
    
    var transitionName: js.UndefOr[String] = js.undefined
    
    var value: js.UndefOr[CascaderValueType] = js.undefined
  }
  object CascaderProps {
    
    inline def apply(): CascaderProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CascaderProps]
    }
    
    extension [Self <: CascaderProps](x: Self) {
      
      inline def setBuiltinPlacements(value: BuildInPlacements): Self = StObject.set(x, "builtinPlacements", value.asInstanceOf[js.Any])
      
      inline def setBuiltinPlacementsUndefined: Self = StObject.set(x, "builtinPlacements", js.undefined)
      
      inline def setChangeOnSelect(value: Boolean): Self = StObject.set(x, "changeOnSelect", value.asInstanceOf[js.Any])
      
      inline def setChangeOnSelectUndefined: Self = StObject.set(x, "changeOnSelect", js.undefined)
      
      inline def setChildren(value: ReactElement): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setDefaultValue(value: CascaderValueType): Self = StObject.set(x, "defaultValue", value.asInstanceOf[js.Any])
      
      inline def setDefaultValueUndefined: Self = StObject.set(x, "defaultValue", js.undefined)
      
      inline def setDefaultValueVarargs(value: (String | Double)*): Self = StObject.set(x, "defaultValue", js.Array(value :_*))
      
      inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      inline def setDropdownMenuColumnStyle(value: CSSProperties): Self = StObject.set(x, "dropdownMenuColumnStyle", value.asInstanceOf[js.Any])
      
      inline def setDropdownMenuColumnStyleUndefined: Self = StObject.set(x, "dropdownMenuColumnStyle", js.undefined)
      
      inline def setDropdownRender(value: /* menu */ ReactElement => ReactElement): Self = StObject.set(x, "dropdownRender", js.Any.fromFunction1(value))
      
      inline def setDropdownRenderUndefined: Self = StObject.set(x, "dropdownRender", js.undefined)
      
      inline def setExpandIcon(value: ReactNode): Self = StObject.set(x, "expandIcon", value.asInstanceOf[js.Any])
      
      inline def setExpandIconUndefined: Self = StObject.set(x, "expandIcon", js.undefined)
      
      inline def setExpandTrigger(value: String): Self = StObject.set(x, "expandTrigger", value.asInstanceOf[js.Any])
      
      inline def setExpandTriggerUndefined: Self = StObject.set(x, "expandTrigger", js.undefined)
      
      inline def setFieldNames(value: CascaderFieldNames): Self = StObject.set(x, "fieldNames", value.asInstanceOf[js.Any])
      
      inline def setFieldNamesUndefined: Self = StObject.set(x, "fieldNames", js.undefined)
      
      inline def setFiledNames(value: CascaderFieldNames): Self = StObject.set(x, "filedNames", value.asInstanceOf[js.Any])
      
      inline def setFiledNamesUndefined: Self = StObject.set(x, "filedNames", js.undefined)
      
      inline def setGetPopupContainer(value: /* node */ HTMLElement => HTMLElement): Self = StObject.set(x, "getPopupContainer", js.Any.fromFunction1(value))
      
      inline def setGetPopupContainerUndefined: Self = StObject.set(x, "getPopupContainer", js.undefined)
      
      inline def setLoadData(value: /* selectOptions */ js.Array[CascaderOption] => Unit): Self = StObject.set(x, "loadData", js.Any.fromFunction1(value))
      
      inline def setLoadDataUndefined: Self = StObject.set(x, "loadData", js.undefined)
      
      inline def setLoadingIcon(value: ReactNode): Self = StObject.set(x, "loadingIcon", value.asInstanceOf[js.Any])
      
      inline def setLoadingIconUndefined: Self = StObject.set(x, "loadingIcon", js.undefined)
      
      inline def setOnChange(value: (/* value */ CascaderValueType, /* selectOptions */ js.Array[CascaderOption]) => Unit): Self = StObject.set(x, "onChange", js.Any.fromFunction2(value))
      
      inline def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
      
      inline def setOnKeyDown(value: /* e */ KeyboardEvent[HTMLElement] => Unit): Self = StObject.set(x, "onKeyDown", js.Any.fromFunction1(value))
      
      inline def setOnKeyDownUndefined: Self = StObject.set(x, "onKeyDown", js.undefined)
      
      inline def setOnPopupVisibleChange(value: /* popupVisible */ Boolean => Unit): Self = StObject.set(x, "onPopupVisibleChange", js.Any.fromFunction1(value))
      
      inline def setOnPopupVisibleChangeUndefined: Self = StObject.set(x, "onPopupVisibleChange", js.undefined)
      
      inline def setOptions(value: js.Array[CascaderOption]): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
      
      inline def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
      
      inline def setOptionsVarargs(value: CascaderOption*): Self = StObject.set(x, "options", js.Array(value :_*))
      
      inline def setPopupClassName(value: String): Self = StObject.set(x, "popupClassName", value.asInstanceOf[js.Any])
      
      inline def setPopupClassNameUndefined: Self = StObject.set(x, "popupClassName", js.undefined)
      
      inline def setPopupPlacement(value: String): Self = StObject.set(x, "popupPlacement", value.asInstanceOf[js.Any])
      
      inline def setPopupPlacementUndefined: Self = StObject.set(x, "popupPlacement", js.undefined)
      
      inline def setPopupVisible(value: Boolean): Self = StObject.set(x, "popupVisible", value.asInstanceOf[js.Any])
      
      inline def setPopupVisibleUndefined: Self = StObject.set(x, "popupVisible", js.undefined)
      
      inline def setPrefixCls(value: String): Self = StObject.set(x, "prefixCls", value.asInstanceOf[js.Any])
      
      inline def setPrefixClsUndefined: Self = StObject.set(x, "prefixCls", js.undefined)
      
      inline def setTransitionName(value: String): Self = StObject.set(x, "transitionName", value.asInstanceOf[js.Any])
      
      inline def setTransitionNameUndefined: Self = StObject.set(x, "transitionName", js.undefined)
      
      inline def setValue(value: CascaderValueType): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
      
      inline def setValueVarargs(value: (String | Double)*): Self = StObject.set(x, "value", js.Array(value :_*))
    }
  }
  
  trait CascaderState extends StObject {
    
    var activeValue: js.UndefOr[CascaderValueType] = js.undefined
    
    var popupVisible: js.UndefOr[Boolean] = js.undefined
    
    var prevProps: js.UndefOr[CascaderProps] = js.undefined
    
    var value: js.UndefOr[CascaderValueType] = js.undefined
  }
  object CascaderState {
    
    inline def apply(): CascaderState = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CascaderState]
    }
    
    extension [Self <: CascaderState](x: Self) {
      
      inline def setActiveValue(value: CascaderValueType): Self = StObject.set(x, "activeValue", value.asInstanceOf[js.Any])
      
      inline def setActiveValueUndefined: Self = StObject.set(x, "activeValue", js.undefined)
      
      inline def setActiveValueVarargs(value: (String | Double)*): Self = StObject.set(x, "activeValue", js.Array(value :_*))
      
      inline def setPopupVisible(value: Boolean): Self = StObject.set(x, "popupVisible", value.asInstanceOf[js.Any])
      
      inline def setPopupVisibleUndefined: Self = StObject.set(x, "popupVisible", js.undefined)
      
      inline def setPrevProps(value: CascaderProps): Self = StObject.set(x, "prevProps", value.asInstanceOf[js.Any])
      
      inline def setPrevPropsUndefined: Self = StObject.set(x, "prevProps", js.undefined)
      
      inline def setValue(value: CascaderValueType): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
      
      inline def setValueVarargs(value: (String | Double)*): Self = StObject.set(x, "value", js.Array(value :_*))
    }
  }
  
  type CascaderValueType = js.Array[String | Double]
}
