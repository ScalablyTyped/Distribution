package typings.rmcPicker

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import org.scalablytyped.runtime.StringDictionary
import typings.react.mod.CSSProperties
import typings.react.mod.ReactElement
import typings.react.mod.ReactInstance
import typings.react.mod.ReactNode
import typings.react.mod.global.JSX.Element
import typings.rmcPicker.libMultiPickerPropsMod.IMultiPickerProps
import typings.rmcPicker.libPickerMixinMod.IItemProps
import typings.rmcPicker.libPickerTypesMod.IPickerProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait ComponentDidMount extends StObject {
    
    var componentDidMount: js.UndefOr[js.Function0[Unit]] = js.native
    
    var componentDidUpdate: js.UndefOr[
        js.Function3[/* prevProps */ Readonlydefault, /* prevState */ Any, /* prevContext */ Any, Unit]
      ] = js.native
    
    var componentWillMount: js.UndefOr[js.Function0[Unit]] = js.native
    
    var componentWillReceiveProps: js.UndefOr[js.Function2[/* nextProps */ Readonlydefault, /* nextContext */ Any, Unit]] = js.native
    
    var componentWillUnmount: js.UndefOr[js.Function0[Unit]] = js.native
    
    var componentWillUpdate: js.UndefOr[
        js.Function3[/* nextProps */ Readonlydefault, /* nextState */ Any, /* nextContext */ Any, Unit]
      ] = js.native
    
    var context: Any = js.native
    
    def forceUpdate(): Unit = js.native
    def forceUpdate(callBack: js.Function0[Any]): Unit = js.native
    
    def getValue(): js.Array[Any] = js.native
    
    def onChange(i: Any, v: Any, cb: Any): Unit = js.native
    
    def onScrollChange(i: Any, v: Any): Unit = js.native
    
    def onValueChange(i: Any, v: Any): Unit = js.native
    
    var props: ReadonlychildrenReactNode = js.native
    
    var refs: StringDictionary[ReactInstance] = js.native
    
    def render(): Element = js.native
    
    def setState[K /* <: String | Double | js.Symbol */](state: Any): Unit = js.native
    def setState[K /* <: String | Double | js.Symbol */](state: Any, callback: js.Function0[Any]): Unit = js.native
    
    var shouldComponentUpdate: js.UndefOr[
        js.Function3[/* nextProps */ Readonlydefault, /* nextState */ Any, /* nextContext */ Any, Boolean]
      ] = js.native
    
    var state: Any = js.native
  }
  
  @js.native
  trait ComponentDidUpdate extends StObject {
    
    var componentDidMount: js.UndefOr[js.Function0[Unit]] = js.native
    
    var componentDidUpdate: js.UndefOr[
        js.Function3[/* prevProps */ ReadonlyIPickerProps, /* prevState */ Any, /* prevContext */ Any, Unit]
      ] = js.native
    
    var componentWillMount: js.UndefOr[js.Function0[Unit]] = js.native
    
    var componentWillReceiveProps: js.UndefOr[js.Function2[/* nextProps */ ReadonlyIPickerProps, /* nextContext */ Any, Unit]] = js.native
    
    var componentWillUnmount: js.UndefOr[js.Function0[Unit]] = js.native
    
    var componentWillUpdate: js.UndefOr[
        js.Function3[/* nextProps */ ReadonlyIPickerProps, /* nextState */ Any, /* nextContext */ Any, Unit]
      ] = js.native
    
    def computeChildIndex(top: Any, itemHeight: Any, childrenLength: Any): Double = js.native
    
    var context: Any = js.native
    
    def doScrollingComplete(top: Any, itemHeight: Any, fireValueChange: Any): Unit = js.native
    
    def forceUpdate(): Unit = js.native
    def forceUpdate(callBack: js.Function0[Any]): Unit = js.native
    
    var props: ReadonlychildrenReactNodeChildren = js.native
    
    var refs: StringDictionary[ReactInstance] = js.native
    
    def render(): Element = js.native
    
    def select(value: Any, itemHeight: Any, scrollTo: Any): Unit = js.native
    
    def selectByIndex(index: Any, itemHeight: Any, zscrollTo: Any): Unit = js.native
    
    def setState[K /* <: String | Double | js.Symbol */](state: Any): Unit = js.native
    def setState[K /* <: String | Double | js.Symbol */](state: Any, callback: js.Function0[Any]): Unit = js.native
    
    var shouldComponentUpdate: js.UndefOr[
        js.Function3[
          /* nextProps */ ReadonlyIPickerProps, 
          /* nextState */ Any, 
          /* nextContext */ Any, 
          Boolean
        ]
      ] = js.native
    
    var state: Any = js.native
  }
  
  @js.native
  trait ComponentWillMount extends StObject {
    
    var componentDidMount: js.UndefOr[js.Function0[Unit]] = js.native
    
    var componentDidUpdate: js.UndefOr[
        js.Function3[
          /* prevProps */ ReadonlyIPopupPickerProps, 
          /* prevState */ Any, 
          /* prevContext */ Any, 
          Unit
        ]
      ] = js.native
    
    var componentWillMount: js.UndefOr[js.Function0[Unit]] = js.native
    
    def componentWillReceiveProps(nextProps: Any): Unit = js.native
    
    var componentWillUnmount: js.UndefOr[js.Function0[Unit]] = js.native
    
    var componentWillUpdate: js.UndefOr[
        js.Function3[
          /* nextProps */ ReadonlyIPopupPickerProps, 
          /* nextState */ Any, 
          /* nextContext */ Any, 
          Unit
        ]
      ] = js.native
    
    var context: Any = js.native
    
    def fireVisibleChange(visible: Any): Unit = js.native
    
    def forceUpdate(): Unit = js.native
    def forceUpdate(callBack: js.Function0[Any]): Unit = js.native
    
    def getContent(): String | ReactElement | (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify React.SFCElement<{[x: string] : any, ref (picker : any): void}> */ Any) = js.native
    
    def getRender(): Any = js.native
    
    def hide(): Unit = js.native
    
    def onDismiss(): Unit = js.native
    
    def onOk(): Unit = js.native
    
    def onPickerChange(pickerValue: Any): Unit = js.native
    
    def onTriggerClick(e: Any): Unit = js.native
    
    var picker: Any = js.native
    
    var props: ReadonlychildrenReactNodeActionTextActiveOpacity = js.native
    
    var refs: StringDictionary[ReactInstance] = js.native
    
    def render(): Any = js.native
    
    def saveRef(picker: Any): Unit = js.native
    
    def setState[K /* <: String | Double | js.Symbol */](state: Any): Unit = js.native
    def setState[K /* <: String | Double | js.Symbol */](state: Any, callback: js.Function0[Any]): Unit = js.native
    
    def setVisibleState(visible: Any): Unit = js.native
    
    var shouldComponentUpdate: js.UndefOr[
        js.Function3[
          /* nextProps */ ReadonlyIPopupPickerProps, 
          /* nextState */ Any, 
          /* nextContext */ Any, 
          Boolean
        ]
      ] = js.native
    
    var state: Any = js.native
  }
  
  @js.native
  trait DefaultProps
    extends StObject
       with Instantiable1[/* props */ Any, ComponentWillMount] {
    
    var defaultProps: Any = js.native
  }
  
  @js.native
  trait Instantiable
    extends StObject
       with Instantiable0[ComponentDidMount]
       with Instantiable1[/* props */ IMultiPickerProps, ComponentDidMount]
       with Instantiable2[
          (/* props */ IMultiPickerProps) | (/* props */ Unit), 
          /* context */ Any, 
          ComponentDidMount
        ] {
    
    var defaultProps: OnValueChange = js.native
  }
  
  @js.native
  trait Item
    extends StObject
       with Instantiable0[ComponentDidUpdate]
       with Instantiable1[/* props */ IPickerProps, ComponentDidUpdate]
       with Instantiable2[
          (/* props */ IPickerProps) | (/* props */ Unit), 
          /* context */ Any, 
          ComponentDidUpdate
        ] {
    
    def Item(_props: IItemProps): Any = js.native
  }
  
  trait OnValueChange extends StObject {
    
    def onValueChange(): Unit
    
    var prefixCls: String
  }
  object OnValueChange {
    
    inline def apply(onValueChange: () => Unit, prefixCls: String): OnValueChange = {
      val __obj = js.Dynamic.literal(onValueChange = js.Any.fromFunction0(onValueChange), prefixCls = prefixCls.asInstanceOf[js.Any])
      __obj.asInstanceOf[OnValueChange]
    }
    
    extension [Self <: OnValueChange](x: Self) {
      
      inline def setOnValueChange(value: () => Unit): Self = StObject.set(x, "onValueChange", js.Any.fromFunction0(value))
      
      inline def setPrefixCls(value: String): Self = StObject.set(x, "prefixCls", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined std.Readonly<rmc-picker.rmc-picker/lib/PickerTypes.IPickerProps> */
  trait ReadonlyIPickerProps extends StObject {
    
    val className: js.UndefOr[String] = js.undefined
    
    val defaultSelectedValue: js.UndefOr[Any] = js.undefined
    
    val disabled: js.UndefOr[Boolean] = js.undefined
    
    val indicatorClassName: js.UndefOr[String] = js.undefined
    
    val indicatorStyle: js.UndefOr[Any] = js.undefined
    
    val itemStyle: js.UndefOr[Any] = js.undefined
    
    val noAnimate: js.UndefOr[Boolean] = js.undefined
    
    val onScrollChange: js.UndefOr[js.Function1[/* value */ Any, Unit]] = js.undefined
    
    val onValueChange: js.UndefOr[js.Function1[/* value */ Any, Unit]] = js.undefined
    
    val prefixCls: js.UndefOr[String] = js.undefined
    
    val selectedValue: js.UndefOr[Any] = js.undefined
    
    val style: js.UndefOr[Any] = js.undefined
  }
  object ReadonlyIPickerProps {
    
    inline def apply(): ReadonlyIPickerProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ReadonlyIPickerProps]
    }
    
    extension [Self <: ReadonlyIPickerProps](x: Self) {
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setDefaultSelectedValue(value: Any): Self = StObject.set(x, "defaultSelectedValue", value.asInstanceOf[js.Any])
      
      inline def setDefaultSelectedValueUndefined: Self = StObject.set(x, "defaultSelectedValue", js.undefined)
      
      inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      inline def setIndicatorClassName(value: String): Self = StObject.set(x, "indicatorClassName", value.asInstanceOf[js.Any])
      
      inline def setIndicatorClassNameUndefined: Self = StObject.set(x, "indicatorClassName", js.undefined)
      
      inline def setIndicatorStyle(value: Any): Self = StObject.set(x, "indicatorStyle", value.asInstanceOf[js.Any])
      
      inline def setIndicatorStyleUndefined: Self = StObject.set(x, "indicatorStyle", js.undefined)
      
      inline def setItemStyle(value: Any): Self = StObject.set(x, "itemStyle", value.asInstanceOf[js.Any])
      
      inline def setItemStyleUndefined: Self = StObject.set(x, "itemStyle", js.undefined)
      
      inline def setNoAnimate(value: Boolean): Self = StObject.set(x, "noAnimate", value.asInstanceOf[js.Any])
      
      inline def setNoAnimateUndefined: Self = StObject.set(x, "noAnimate", js.undefined)
      
      inline def setOnScrollChange(value: /* value */ Any => Unit): Self = StObject.set(x, "onScrollChange", js.Any.fromFunction1(value))
      
      inline def setOnScrollChangeUndefined: Self = StObject.set(x, "onScrollChange", js.undefined)
      
      inline def setOnValueChange(value: /* value */ Any => Unit): Self = StObject.set(x, "onValueChange", js.Any.fromFunction1(value))
      
      inline def setOnValueChangeUndefined: Self = StObject.set(x, "onValueChange", js.undefined)
      
      inline def setPrefixCls(value: String): Self = StObject.set(x, "prefixCls", value.asInstanceOf[js.Any])
      
      inline def setPrefixClsUndefined: Self = StObject.set(x, "prefixCls", js.undefined)
      
      inline def setSelectedValue(value: Any): Self = StObject.set(x, "selectedValue", value.asInstanceOf[js.Any])
      
      inline def setSelectedValueUndefined: Self = StObject.set(x, "selectedValue", js.undefined)
      
      inline def setStyle(value: Any): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    }
  }
  
  /* Inlined std.Readonly<rmc-picker.rmc-picker/lib/PopupPickerTypes.IPopupPickerProps> */
  trait ReadonlyIPopupPickerProps extends StObject {
    
    val WrapComponent: js.UndefOr[Any] = js.undefined
    
    val actionTextActiveOpacity: js.UndefOr[Double] = js.undefined
    
    val actionTextUnderlayColor: js.UndefOr[String] = js.undefined
    
    val className: js.UndefOr[String] = js.undefined
    
    val content: js.UndefOr[ReactElement | String] = js.undefined
    
    val disabled: js.UndefOr[Boolean] = js.undefined
    
    val dismissText: js.UndefOr[String | ReactElement] = js.undefined
    
    val maskTransitionName: js.UndefOr[String] = js.undefined
    
    val okText: js.UndefOr[String | ReactElement] = js.undefined
    
    val onDismiss: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    val onOk: js.UndefOr[js.Function1[/* value */ js.UndefOr[Any], Unit]] = js.undefined
    
    val onVisibleChange: js.UndefOr[js.Function1[/* visible */ Boolean, Unit]] = js.undefined
    
    val picker: js.UndefOr[Any] = js.undefined
    
    val pickerValueChangeProp: js.UndefOr[String] = js.undefined
    
    val pickerValueProp: js.UndefOr[String] = js.undefined
    
    val popupTransitionName: js.UndefOr[String] = js.undefined
    
    val prefixCls: js.UndefOr[String] = js.undefined
    
    val style: js.UndefOr[Any] = js.undefined
    
    val styles: js.UndefOr[Any] = js.undefined
    
    val title: js.UndefOr[String | ReactElement] = js.undefined
    
    val transitionName: js.UndefOr[String] = js.undefined
    
    val triggerType: js.UndefOr[String] = js.undefined
    
    val value: js.UndefOr[Any] = js.undefined
    
    val visible: js.UndefOr[Boolean] = js.undefined
    
    val wrapStyle: js.UndefOr[CSSProperties] = js.undefined
  }
  object ReadonlyIPopupPickerProps {
    
    inline def apply(): ReadonlyIPopupPickerProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ReadonlyIPopupPickerProps]
    }
    
    extension [Self <: ReadonlyIPopupPickerProps](x: Self) {
      
      inline def setActionTextActiveOpacity(value: Double): Self = StObject.set(x, "actionTextActiveOpacity", value.asInstanceOf[js.Any])
      
      inline def setActionTextActiveOpacityUndefined: Self = StObject.set(x, "actionTextActiveOpacity", js.undefined)
      
      inline def setActionTextUnderlayColor(value: String): Self = StObject.set(x, "actionTextUnderlayColor", value.asInstanceOf[js.Any])
      
      inline def setActionTextUnderlayColorUndefined: Self = StObject.set(x, "actionTextUnderlayColor", js.undefined)
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setContent(value: ReactElement | String): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
      
      inline def setContentUndefined: Self = StObject.set(x, "content", js.undefined)
      
      inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      inline def setDismissText(value: String | ReactElement): Self = StObject.set(x, "dismissText", value.asInstanceOf[js.Any])
      
      inline def setDismissTextUndefined: Self = StObject.set(x, "dismissText", js.undefined)
      
      inline def setMaskTransitionName(value: String): Self = StObject.set(x, "maskTransitionName", value.asInstanceOf[js.Any])
      
      inline def setMaskTransitionNameUndefined: Self = StObject.set(x, "maskTransitionName", js.undefined)
      
      inline def setOkText(value: String | ReactElement): Self = StObject.set(x, "okText", value.asInstanceOf[js.Any])
      
      inline def setOkTextUndefined: Self = StObject.set(x, "okText", js.undefined)
      
      inline def setOnDismiss(value: () => Unit): Self = StObject.set(x, "onDismiss", js.Any.fromFunction0(value))
      
      inline def setOnDismissUndefined: Self = StObject.set(x, "onDismiss", js.undefined)
      
      inline def setOnOk(value: /* value */ js.UndefOr[Any] => Unit): Self = StObject.set(x, "onOk", js.Any.fromFunction1(value))
      
      inline def setOnOkUndefined: Self = StObject.set(x, "onOk", js.undefined)
      
      inline def setOnVisibleChange(value: /* visible */ Boolean => Unit): Self = StObject.set(x, "onVisibleChange", js.Any.fromFunction1(value))
      
      inline def setOnVisibleChangeUndefined: Self = StObject.set(x, "onVisibleChange", js.undefined)
      
      inline def setPicker(value: Any): Self = StObject.set(x, "picker", value.asInstanceOf[js.Any])
      
      inline def setPickerUndefined: Self = StObject.set(x, "picker", js.undefined)
      
      inline def setPickerValueChangeProp(value: String): Self = StObject.set(x, "pickerValueChangeProp", value.asInstanceOf[js.Any])
      
      inline def setPickerValueChangePropUndefined: Self = StObject.set(x, "pickerValueChangeProp", js.undefined)
      
      inline def setPickerValueProp(value: String): Self = StObject.set(x, "pickerValueProp", value.asInstanceOf[js.Any])
      
      inline def setPickerValuePropUndefined: Self = StObject.set(x, "pickerValueProp", js.undefined)
      
      inline def setPopupTransitionName(value: String): Self = StObject.set(x, "popupTransitionName", value.asInstanceOf[js.Any])
      
      inline def setPopupTransitionNameUndefined: Self = StObject.set(x, "popupTransitionName", js.undefined)
      
      inline def setPrefixCls(value: String): Self = StObject.set(x, "prefixCls", value.asInstanceOf[js.Any])
      
      inline def setPrefixClsUndefined: Self = StObject.set(x, "prefixCls", js.undefined)
      
      inline def setStyle(value: Any): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      inline def setStyles(value: Any): Self = StObject.set(x, "styles", value.asInstanceOf[js.Any])
      
      inline def setStylesUndefined: Self = StObject.set(x, "styles", js.undefined)
      
      inline def setTitle(value: String | ReactElement): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
      
      inline def setTransitionName(value: String): Self = StObject.set(x, "transitionName", value.asInstanceOf[js.Any])
      
      inline def setTransitionNameUndefined: Self = StObject.set(x, "transitionName", js.undefined)
      
      inline def setTriggerType(value: String): Self = StObject.set(x, "triggerType", value.asInstanceOf[js.Any])
      
      inline def setTriggerTypeUndefined: Self = StObject.set(x, "triggerType", js.undefined)
      
      inline def setValue(value: Any): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
      
      inline def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
      
      inline def setVisibleUndefined: Self = StObject.set(x, "visible", js.undefined)
      
      inline def setWrapComponent(value: Any): Self = StObject.set(x, "WrapComponent", value.asInstanceOf[js.Any])
      
      inline def setWrapComponentUndefined: Self = StObject.set(x, "WrapComponent", js.undefined)
      
      inline def setWrapStyle(value: CSSProperties): Self = StObject.set(x, "wrapStyle", value.asInstanceOf[js.Any])
      
      inline def setWrapStyleUndefined: Self = StObject.set(x, "wrapStyle", js.undefined)
    }
  }
  
  /* Inlined std.Readonly<{  children :react.react.ReactNode | undefined}> & std.Readonly<rmc-picker.rmc-picker/lib/MultiPickerProps.default> */
  trait ReadonlychildrenReactNode extends StObject {
    
    val children: js.UndefOr[ReactNode] & js.UndefOr[Any]
    
    val className: js.UndefOr[String] = js.undefined
    
    val onScrollChange: js.UndefOr[js.Function2[/* v */ js.UndefOr[Any], /* i */ js.UndefOr[Double], Unit]] = js.undefined
    
    val onValueChange: js.UndefOr[js.Function2[/* v */ js.UndefOr[Any], /* i */ js.UndefOr[Double], Unit]] = js.undefined
    
    val prefixCls: js.UndefOr[String] = js.undefined
    
    val rootNativeProps: js.UndefOr[Any] = js.undefined
    
    val selectedValue: js.UndefOr[js.Array[Any]] = js.undefined
    
    val style: js.UndefOr[Any] = js.undefined
  }
  object ReadonlychildrenReactNode {
    
    inline def apply(children: js.UndefOr[ReactNode] & js.UndefOr[Any]): ReadonlychildrenReactNode = {
      val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any])
      __obj.asInstanceOf[ReadonlychildrenReactNode]
    }
    
    extension [Self <: ReadonlychildrenReactNode](x: Self) {
      
      inline def setChildren(value: js.UndefOr[ReactNode] & js.UndefOr[Any]): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setOnScrollChange(value: (/* v */ js.UndefOr[Any], /* i */ js.UndefOr[Double]) => Unit): Self = StObject.set(x, "onScrollChange", js.Any.fromFunction2(value))
      
      inline def setOnScrollChangeUndefined: Self = StObject.set(x, "onScrollChange", js.undefined)
      
      inline def setOnValueChange(value: (/* v */ js.UndefOr[Any], /* i */ js.UndefOr[Double]) => Unit): Self = StObject.set(x, "onValueChange", js.Any.fromFunction2(value))
      
      inline def setOnValueChangeUndefined: Self = StObject.set(x, "onValueChange", js.undefined)
      
      inline def setPrefixCls(value: String): Self = StObject.set(x, "prefixCls", value.asInstanceOf[js.Any])
      
      inline def setPrefixClsUndefined: Self = StObject.set(x, "prefixCls", js.undefined)
      
      inline def setRootNativeProps(value: Any): Self = StObject.set(x, "rootNativeProps", value.asInstanceOf[js.Any])
      
      inline def setRootNativePropsUndefined: Self = StObject.set(x, "rootNativeProps", js.undefined)
      
      inline def setSelectedValue(value: js.Array[Any]): Self = StObject.set(x, "selectedValue", value.asInstanceOf[js.Any])
      
      inline def setSelectedValueUndefined: Self = StObject.set(x, "selectedValue", js.undefined)
      
      inline def setSelectedValueVarargs(value: Any*): Self = StObject.set(x, "selectedValue", js.Array(value*))
      
      inline def setStyle(value: Any): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    }
  }
  
  /* Inlined std.Readonly<{  children :react.react.ReactNode | undefined}> & std.Readonly<rmc-picker.rmc-picker/lib/PopupPickerTypes.IPopupPickerProps> */
  trait ReadonlychildrenReactNodeActionTextActiveOpacity extends StObject {
    
    val WrapComponent: js.UndefOr[Any] = js.undefined
    
    val actionTextActiveOpacity: js.UndefOr[Double] = js.undefined
    
    val actionTextUnderlayColor: js.UndefOr[String] = js.undefined
    
    val children: js.UndefOr[ReactNode] = js.undefined
    
    val className: js.UndefOr[String] = js.undefined
    
    val content: js.UndefOr[ReactElement | String] = js.undefined
    
    val disabled: js.UndefOr[Boolean] = js.undefined
    
    val dismissText: js.UndefOr[String | ReactElement] = js.undefined
    
    val maskTransitionName: js.UndefOr[String] = js.undefined
    
    val okText: js.UndefOr[String | ReactElement] = js.undefined
    
    val onDismiss: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    val onOk: js.UndefOr[js.Function1[/* value */ js.UndefOr[Any], Unit]] = js.undefined
    
    val onVisibleChange: js.UndefOr[js.Function1[/* visible */ Boolean, Unit]] = js.undefined
    
    val picker: js.UndefOr[Any] = js.undefined
    
    val pickerValueChangeProp: js.UndefOr[String] = js.undefined
    
    val pickerValueProp: js.UndefOr[String] = js.undefined
    
    val popupTransitionName: js.UndefOr[String] = js.undefined
    
    val prefixCls: js.UndefOr[String] = js.undefined
    
    val style: js.UndefOr[Any] = js.undefined
    
    val styles: js.UndefOr[Any] = js.undefined
    
    val title: js.UndefOr[String | ReactElement] = js.undefined
    
    val transitionName: js.UndefOr[String] = js.undefined
    
    val triggerType: js.UndefOr[String] = js.undefined
    
    val value: js.UndefOr[Any] = js.undefined
    
    val visible: js.UndefOr[Boolean] = js.undefined
    
    val wrapStyle: js.UndefOr[CSSProperties] = js.undefined
  }
  object ReadonlychildrenReactNodeActionTextActiveOpacity {
    
    inline def apply(): ReadonlychildrenReactNodeActionTextActiveOpacity = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ReadonlychildrenReactNodeActionTextActiveOpacity]
    }
    
    extension [Self <: ReadonlychildrenReactNodeActionTextActiveOpacity](x: Self) {
      
      inline def setActionTextActiveOpacity(value: Double): Self = StObject.set(x, "actionTextActiveOpacity", value.asInstanceOf[js.Any])
      
      inline def setActionTextActiveOpacityUndefined: Self = StObject.set(x, "actionTextActiveOpacity", js.undefined)
      
      inline def setActionTextUnderlayColor(value: String): Self = StObject.set(x, "actionTextUnderlayColor", value.asInstanceOf[js.Any])
      
      inline def setActionTextUnderlayColorUndefined: Self = StObject.set(x, "actionTextUnderlayColor", js.undefined)
      
      inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setContent(value: ReactElement | String): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
      
      inline def setContentUndefined: Self = StObject.set(x, "content", js.undefined)
      
      inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      inline def setDismissText(value: String | ReactElement): Self = StObject.set(x, "dismissText", value.asInstanceOf[js.Any])
      
      inline def setDismissTextUndefined: Self = StObject.set(x, "dismissText", js.undefined)
      
      inline def setMaskTransitionName(value: String): Self = StObject.set(x, "maskTransitionName", value.asInstanceOf[js.Any])
      
      inline def setMaskTransitionNameUndefined: Self = StObject.set(x, "maskTransitionName", js.undefined)
      
      inline def setOkText(value: String | ReactElement): Self = StObject.set(x, "okText", value.asInstanceOf[js.Any])
      
      inline def setOkTextUndefined: Self = StObject.set(x, "okText", js.undefined)
      
      inline def setOnDismiss(value: () => Unit): Self = StObject.set(x, "onDismiss", js.Any.fromFunction0(value))
      
      inline def setOnDismissUndefined: Self = StObject.set(x, "onDismiss", js.undefined)
      
      inline def setOnOk(value: /* value */ js.UndefOr[Any] => Unit): Self = StObject.set(x, "onOk", js.Any.fromFunction1(value))
      
      inline def setOnOkUndefined: Self = StObject.set(x, "onOk", js.undefined)
      
      inline def setOnVisibleChange(value: /* visible */ Boolean => Unit): Self = StObject.set(x, "onVisibleChange", js.Any.fromFunction1(value))
      
      inline def setOnVisibleChangeUndefined: Self = StObject.set(x, "onVisibleChange", js.undefined)
      
      inline def setPicker(value: Any): Self = StObject.set(x, "picker", value.asInstanceOf[js.Any])
      
      inline def setPickerUndefined: Self = StObject.set(x, "picker", js.undefined)
      
      inline def setPickerValueChangeProp(value: String): Self = StObject.set(x, "pickerValueChangeProp", value.asInstanceOf[js.Any])
      
      inline def setPickerValueChangePropUndefined: Self = StObject.set(x, "pickerValueChangeProp", js.undefined)
      
      inline def setPickerValueProp(value: String): Self = StObject.set(x, "pickerValueProp", value.asInstanceOf[js.Any])
      
      inline def setPickerValuePropUndefined: Self = StObject.set(x, "pickerValueProp", js.undefined)
      
      inline def setPopupTransitionName(value: String): Self = StObject.set(x, "popupTransitionName", value.asInstanceOf[js.Any])
      
      inline def setPopupTransitionNameUndefined: Self = StObject.set(x, "popupTransitionName", js.undefined)
      
      inline def setPrefixCls(value: String): Self = StObject.set(x, "prefixCls", value.asInstanceOf[js.Any])
      
      inline def setPrefixClsUndefined: Self = StObject.set(x, "prefixCls", js.undefined)
      
      inline def setStyle(value: Any): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      inline def setStyles(value: Any): Self = StObject.set(x, "styles", value.asInstanceOf[js.Any])
      
      inline def setStylesUndefined: Self = StObject.set(x, "styles", js.undefined)
      
      inline def setTitle(value: String | ReactElement): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
      
      inline def setTransitionName(value: String): Self = StObject.set(x, "transitionName", value.asInstanceOf[js.Any])
      
      inline def setTransitionNameUndefined: Self = StObject.set(x, "transitionName", js.undefined)
      
      inline def setTriggerType(value: String): Self = StObject.set(x, "triggerType", value.asInstanceOf[js.Any])
      
      inline def setTriggerTypeUndefined: Self = StObject.set(x, "triggerType", js.undefined)
      
      inline def setValue(value: Any): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
      
      inline def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
      
      inline def setVisibleUndefined: Self = StObject.set(x, "visible", js.undefined)
      
      inline def setWrapComponent(value: Any): Self = StObject.set(x, "WrapComponent", value.asInstanceOf[js.Any])
      
      inline def setWrapComponentUndefined: Self = StObject.set(x, "WrapComponent", js.undefined)
      
      inline def setWrapStyle(value: CSSProperties): Self = StObject.set(x, "wrapStyle", value.asInstanceOf[js.Any])
      
      inline def setWrapStyleUndefined: Self = StObject.set(x, "wrapStyle", js.undefined)
    }
  }
  
  /* Inlined std.Readonly<{  children :react.react.ReactNode | undefined}> & std.Readonly<rmc-picker.rmc-picker/lib/PickerTypes.IPickerProps> */
  trait ReadonlychildrenReactNodeChildren extends StObject {
    
    val children: js.UndefOr[ReactNode] = js.undefined
    
    val className: js.UndefOr[String] = js.undefined
    
    val defaultSelectedValue: js.UndefOr[Any] = js.undefined
    
    val disabled: js.UndefOr[Boolean] = js.undefined
    
    val indicatorClassName: js.UndefOr[String] = js.undefined
    
    val indicatorStyle: js.UndefOr[Any] = js.undefined
    
    val itemStyle: js.UndefOr[Any] = js.undefined
    
    val noAnimate: js.UndefOr[Boolean] = js.undefined
    
    val onScrollChange: js.UndefOr[js.Function1[/* value */ Any, Unit]] = js.undefined
    
    val onValueChange: js.UndefOr[js.Function1[/* value */ Any, Unit]] = js.undefined
    
    val prefixCls: js.UndefOr[String] = js.undefined
    
    val selectedValue: js.UndefOr[Any] = js.undefined
    
    val style: js.UndefOr[Any] = js.undefined
  }
  object ReadonlychildrenReactNodeChildren {
    
    inline def apply(): ReadonlychildrenReactNodeChildren = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ReadonlychildrenReactNodeChildren]
    }
    
    extension [Self <: ReadonlychildrenReactNodeChildren](x: Self) {
      
      inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setDefaultSelectedValue(value: Any): Self = StObject.set(x, "defaultSelectedValue", value.asInstanceOf[js.Any])
      
      inline def setDefaultSelectedValueUndefined: Self = StObject.set(x, "defaultSelectedValue", js.undefined)
      
      inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      inline def setIndicatorClassName(value: String): Self = StObject.set(x, "indicatorClassName", value.asInstanceOf[js.Any])
      
      inline def setIndicatorClassNameUndefined: Self = StObject.set(x, "indicatorClassName", js.undefined)
      
      inline def setIndicatorStyle(value: Any): Self = StObject.set(x, "indicatorStyle", value.asInstanceOf[js.Any])
      
      inline def setIndicatorStyleUndefined: Self = StObject.set(x, "indicatorStyle", js.undefined)
      
      inline def setItemStyle(value: Any): Self = StObject.set(x, "itemStyle", value.asInstanceOf[js.Any])
      
      inline def setItemStyleUndefined: Self = StObject.set(x, "itemStyle", js.undefined)
      
      inline def setNoAnimate(value: Boolean): Self = StObject.set(x, "noAnimate", value.asInstanceOf[js.Any])
      
      inline def setNoAnimateUndefined: Self = StObject.set(x, "noAnimate", js.undefined)
      
      inline def setOnScrollChange(value: /* value */ Any => Unit): Self = StObject.set(x, "onScrollChange", js.Any.fromFunction1(value))
      
      inline def setOnScrollChangeUndefined: Self = StObject.set(x, "onScrollChange", js.undefined)
      
      inline def setOnValueChange(value: /* value */ Any => Unit): Self = StObject.set(x, "onValueChange", js.Any.fromFunction1(value))
      
      inline def setOnValueChangeUndefined: Self = StObject.set(x, "onValueChange", js.undefined)
      
      inline def setPrefixCls(value: String): Self = StObject.set(x, "prefixCls", value.asInstanceOf[js.Any])
      
      inline def setPrefixClsUndefined: Self = StObject.set(x, "prefixCls", js.undefined)
      
      inline def setSelectedValue(value: Any): Self = StObject.set(x, "selectedValue", value.asInstanceOf[js.Any])
      
      inline def setSelectedValueUndefined: Self = StObject.set(x, "selectedValue", js.undefined)
      
      inline def setStyle(value: Any): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    }
  }
  
  /* Inlined std.Readonly<rmc-picker.rmc-picker/lib/MultiPickerProps.default> */
  trait Readonlydefault extends StObject {
    
    val children: js.UndefOr[Any] = js.undefined
    
    val className: js.UndefOr[String] = js.undefined
    
    val onScrollChange: js.UndefOr[js.Function2[/* v */ js.UndefOr[Any], /* i */ js.UndefOr[Double], Unit]] = js.undefined
    
    val onValueChange: js.UndefOr[js.Function2[/* v */ js.UndefOr[Any], /* i */ js.UndefOr[Double], Unit]] = js.undefined
    
    val prefixCls: js.UndefOr[String] = js.undefined
    
    val rootNativeProps: js.UndefOr[Any] = js.undefined
    
    val selectedValue: js.UndefOr[js.Array[Any]] = js.undefined
    
    val style: js.UndefOr[Any] = js.undefined
  }
  object Readonlydefault {
    
    inline def apply(): Readonlydefault = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Readonlydefault]
    }
    
    extension [Self <: Readonlydefault](x: Self) {
      
      inline def setChildren(value: Any): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setOnScrollChange(value: (/* v */ js.UndefOr[Any], /* i */ js.UndefOr[Double]) => Unit): Self = StObject.set(x, "onScrollChange", js.Any.fromFunction2(value))
      
      inline def setOnScrollChangeUndefined: Self = StObject.set(x, "onScrollChange", js.undefined)
      
      inline def setOnValueChange(value: (/* v */ js.UndefOr[Any], /* i */ js.UndefOr[Double]) => Unit): Self = StObject.set(x, "onValueChange", js.Any.fromFunction2(value))
      
      inline def setOnValueChangeUndefined: Self = StObject.set(x, "onValueChange", js.undefined)
      
      inline def setPrefixCls(value: String): Self = StObject.set(x, "prefixCls", value.asInstanceOf[js.Any])
      
      inline def setPrefixClsUndefined: Self = StObject.set(x, "prefixCls", js.undefined)
      
      inline def setRootNativeProps(value: Any): Self = StObject.set(x, "rootNativeProps", value.asInstanceOf[js.Any])
      
      inline def setRootNativePropsUndefined: Self = StObject.set(x, "rootNativeProps", js.undefined)
      
      inline def setSelectedValue(value: js.Array[Any]): Self = StObject.set(x, "selectedValue", value.asInstanceOf[js.Any])
      
      inline def setSelectedValueUndefined: Self = StObject.set(x, "selectedValue", js.undefined)
      
      inline def setSelectedValueVarargs(value: Any*): Self = StObject.set(x, "selectedValue", js.Array(value*))
      
      inline def setStyle(value: Any): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    }
  }
}
