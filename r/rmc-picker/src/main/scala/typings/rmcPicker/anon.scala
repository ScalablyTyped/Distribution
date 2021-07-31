package typings.rmcPicker

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import org.scalablytyped.runtime.StringDictionary
import typings.react.mod.CSSProperties
import typings.react.mod.ReactElement
import typings.react.mod.ReactInstance
import typings.react.mod.ReactNode
import typings.react.mod.SFCElement
import typings.react.mod.global.JSX.Element
import typings.reactNative.mod.AccessibilityActionEvent
import typings.reactNative.mod.AccessibilityActionInfo
import typings.reactNative.mod.AccessibilityRole
import typings.reactNative.mod.AccessibilityState
import typings.reactNative.mod.AccessibilityTrait
import typings.reactNative.mod.AccessibilityValue
import typings.reactNative.mod.GestureResponderEvent
import typings.reactNative.mod.Insets
import typings.reactNative.mod.LayoutChangeEvent
import typings.reactNative.mod.StyleProp
import typings.reactNative.mod.TVParallaxProperties
import typings.reactNative.mod.TextStyle
import typings.rmcPicker.multiPickerPropsMod.IMultiPickerProps
import typings.rmcPicker.pickerMixinMod.IItemProps
import typings.rmcPicker.pickerTypesMod.IPickerProps
import typings.rmcPicker.rmcPickerStrings.`box-none`
import typings.rmcPicker.rmcPickerStrings.`box-only`
import typings.rmcPicker.rmcPickerStrings.`no-hide-descendants`
import typings.rmcPicker.rmcPickerStrings.assertive
import typings.rmcPicker.rmcPickerStrings.auto
import typings.rmcPicker.rmcPickerStrings.button
import typings.rmcPicker.rmcPickerStrings.dialog
import typings.rmcPicker.rmcPickerStrings.dropdown
import typings.rmcPicker.rmcPickerStrings.no
import typings.rmcPicker.rmcPickerStrings.none
import typings.rmcPicker.rmcPickerStrings.polite
import typings.rmcPicker.rmcPickerStrings.radiobutton_checked
import typings.rmcPicker.rmcPickerStrings.radiobutton_unchecked
import typings.rmcPicker.rmcPickerStrings.yes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait ComponentDidMount extends StObject {
    
    var componentDidMount: js.UndefOr[js.Function0[Unit]] = js.native
    
    var componentDidUpdate: js.UndefOr[
        js.Function3[
          /* prevProps */ Readonlydefault, 
          /* prevState */ js.Any, 
          /* prevContext */ js.Any, 
          Unit
        ]
      ] = js.native
    
    var componentWillMount: js.UndefOr[js.Function0[Unit]] = js.native
    
    var componentWillReceiveProps: js.UndefOr[js.Function2[/* nextProps */ Readonlydefault, /* nextContext */ js.Any, Unit]] = js.native
    
    var componentWillUnmount: js.UndefOr[js.Function0[Unit]] = js.native
    
    var componentWillUpdate: js.UndefOr[
        js.Function3[
          /* nextProps */ Readonlydefault, 
          /* nextState */ js.Any, 
          /* nextContext */ js.Any, 
          Unit
        ]
      ] = js.native
    
    var context: js.Any = js.native
    
    def forceUpdate(): Unit = js.native
    def forceUpdate(callBack: js.Function0[js.Any]): Unit = js.native
    
    def getValue(): js.Array[js.Any] = js.native
    
    def onChange(i: js.Any, v: js.Any, cb: js.Any): Unit = js.native
    
    def onScrollChange(i: js.Any, v: js.Any): Unit = js.native
    
    def onValueChange(i: js.Any, v: js.Any): Unit = js.native
    
    var props: ReadonlychildrenReactNode = js.native
    
    var refs: StringDictionary[ReactInstance] = js.native
    
    def render(): Element = js.native
    
    def setState[K /* <: String | Double | js.Symbol */](state: js.Any): Unit = js.native
    def setState[K /* <: String | Double | js.Symbol */](state: js.Any, callback: js.Function0[js.Any]): Unit = js.native
    
    var shouldComponentUpdate: js.UndefOr[
        js.Function3[
          /* nextProps */ Readonlydefault, 
          /* nextState */ js.Any, 
          /* nextContext */ js.Any, 
          Boolean
        ]
      ] = js.native
    
    var state: js.Any = js.native
  }
  
  @js.native
  trait ComponentDidUpdate extends StObject {
    
    var componentDidMount: js.UndefOr[js.Function0[Unit]] = js.native
    
    var componentDidUpdate: js.UndefOr[
        js.Function3[
          /* prevProps */ ReadonlyIPickerProps, 
          /* prevState */ js.Any, 
          /* prevContext */ js.Any, 
          Unit
        ]
      ] = js.native
    
    var componentWillMount: js.UndefOr[js.Function0[Unit]] = js.native
    
    var componentWillReceiveProps: js.UndefOr[
        js.Function2[/* nextProps */ ReadonlyIPickerProps, /* nextContext */ js.Any, Unit]
      ] = js.native
    
    var componentWillUnmount: js.UndefOr[js.Function0[Unit]] = js.native
    
    var componentWillUpdate: js.UndefOr[
        js.Function3[
          /* nextProps */ ReadonlyIPickerProps, 
          /* nextState */ js.Any, 
          /* nextContext */ js.Any, 
          Unit
        ]
      ] = js.native
    
    def computeChildIndex(top: js.Any, itemHeight: js.Any, childrenLength: js.Any): Double = js.native
    
    var context: js.Any = js.native
    
    def doScrollingComplete(top: js.Any, itemHeight: js.Any, fireValueChange: js.Any): Unit = js.native
    
    def forceUpdate(): Unit = js.native
    def forceUpdate(callBack: js.Function0[js.Any]): Unit = js.native
    
    var props: ReadonlychildrenReactNodeChildren = js.native
    
    var refs: StringDictionary[ReactInstance] = js.native
    
    def render(): Element = js.native
    
    def select(value: js.Any, itemHeight: js.Any, scrollTo: js.Any): Unit = js.native
    
    def selectByIndex(index: js.Any, itemHeight: js.Any, zscrollTo: js.Any): Unit = js.native
    
    def setState[K /* <: String | Double | js.Symbol */](state: js.Any): Unit = js.native
    def setState[K /* <: String | Double | js.Symbol */](state: js.Any, callback: js.Function0[js.Any]): Unit = js.native
    
    var shouldComponentUpdate: js.UndefOr[
        js.Function3[
          /* nextProps */ ReadonlyIPickerProps, 
          /* nextState */ js.Any, 
          /* nextContext */ js.Any, 
          Boolean
        ]
      ] = js.native
    
    var state: js.Any = js.native
  }
  
  @js.native
  trait ComponentWillMount extends StObject {
    
    var componentDidMount: js.UndefOr[js.Function0[Unit]] = js.native
    
    var componentDidUpdate: js.UndefOr[
        js.Function3[
          /* prevProps */ ReadonlyIPopupPickerProps, 
          /* prevState */ js.Any, 
          /* prevContext */ js.Any, 
          Unit
        ]
      ] = js.native
    
    var componentWillMount: js.UndefOr[js.Function0[Unit]] = js.native
    
    def componentWillReceiveProps(nextProps: js.Any): Unit = js.native
    
    var componentWillUnmount: js.UndefOr[js.Function0[Unit]] = js.native
    
    var componentWillUpdate: js.UndefOr[
        js.Function3[
          /* nextProps */ ReadonlyIPopupPickerProps, 
          /* nextState */ js.Any, 
          /* nextContext */ js.Any, 
          Unit
        ]
      ] = js.native
    
    var context: js.Any = js.native
    
    def fireVisibleChange(visible: js.Any): Unit = js.native
    
    def forceUpdate(): Unit = js.native
    def forceUpdate(callBack: js.Function0[js.Any]): Unit = js.native
    
    def getContent(): String | ReactElement | SFCElement[Dictx] = js.native
    
    def getRender(): js.Any = js.native
    
    def hide(): Unit = js.native
    
    def onDismiss(): Unit = js.native
    
    def onOk(): Unit = js.native
    
    def onPickerChange(pickerValue: js.Any): Unit = js.native
    
    def onTriggerClick(e: js.Any): Unit = js.native
    
    var picker: js.Any = js.native
    
    var props: ReadonlychildrenReactNodeActionTextActiveOpacity = js.native
    
    var refs: StringDictionary[ReactInstance] = js.native
    
    def render(): js.Any = js.native
    
    def saveRef(picker: js.Any): Unit = js.native
    
    def setState[K /* <: String | Double | js.Symbol */](state: js.Any): Unit = js.native
    def setState[K /* <: String | Double | js.Symbol */](state: js.Any, callback: js.Function0[js.Any]): Unit = js.native
    
    def setVisibleState(visible: js.Any): Unit = js.native
    
    var shouldComponentUpdate: js.UndefOr[
        js.Function3[
          /* nextProps */ ReadonlyIPopupPickerProps, 
          /* nextState */ js.Any, 
          /* nextContext */ js.Any, 
          Boolean
        ]
      ] = js.native
    
    var state: js.Any = js.native
  }
  
  @js.native
  trait DefaultProps
    extends StObject
       with Instantiable1[/* props */ js.Any, ComponentWillMount] {
    
    var defaultProps: js.Any = js.native
  }
  
  trait Dictx
    extends StObject
       with /* x */ StringDictionary[js.Any] {
    
    def ref(picker: js.Any): Unit
  }
  object Dictx {
    
    @scala.inline
    def apply(ref: js.Any => Unit): Dictx = {
      val __obj = js.Dynamic.literal(ref = js.Any.fromFunction1(ref))
      __obj.asInstanceOf[Dictx]
    }
    
    @scala.inline
    implicit class DictxMutableBuilder[Self <: Dictx] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setRef(value: js.Any => Unit): Self = StObject.set(x, "ref", js.Any.fromFunction1(value))
    }
  }
  
  @js.native
  trait Instantiable
    extends StObject
       with Instantiable0[ComponentDidMount]
       with Instantiable1[/* props */ IMultiPickerProps, ComponentDidMount]
       with Instantiable2[
          (/* props */ IMultiPickerProps) | (/* props */ Unit), 
          /* context */ js.Any, 
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
          /* context */ js.Any, 
          ComponentDidUpdate
        ] {
    
    def Item(_props: IItemProps): js.Any = js.native
  }
  
  trait OnValueChange extends StObject {
    
    def onValueChange(): Unit
    
    var prefixCls: String
  }
  object OnValueChange {
    
    @scala.inline
    def apply(onValueChange: () => Unit, prefixCls: String): OnValueChange = {
      val __obj = js.Dynamic.literal(onValueChange = js.Any.fromFunction0(onValueChange), prefixCls = prefixCls.asInstanceOf[js.Any])
      __obj.asInstanceOf[OnValueChange]
    }
    
    @scala.inline
    implicit class OnValueChangeMutableBuilder[Self <: OnValueChange] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setOnValueChange(value: () => Unit): Self = StObject.set(x, "onValueChange", js.Any.fromFunction0(value))
      
      @scala.inline
      def setPrefixCls(value: String): Self = StObject.set(x, "prefixCls", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined std.Readonly<rmc-picker.rmc-picker/lib/PickerTypes.IPickerProps> */
  trait ReadonlyIPickerProps extends StObject {
    
    val className: js.UndefOr[String] = js.undefined
    
    val defaultSelectedValue: js.UndefOr[js.Any] = js.undefined
    
    val disabled: js.UndefOr[Boolean] = js.undefined
    
    val indicatorClassName: js.UndefOr[String] = js.undefined
    
    val indicatorStyle: js.UndefOr[js.Any] = js.undefined
    
    val itemStyle: js.UndefOr[js.Any] = js.undefined
    
    val noAnimate: js.UndefOr[Boolean] = js.undefined
    
    val onScrollChange: js.UndefOr[js.Function1[/* value */ js.Any, Unit]] = js.undefined
    
    val onValueChange: js.UndefOr[js.Function1[/* value */ js.Any, Unit]] = js.undefined
    
    val prefixCls: js.UndefOr[String] = js.undefined
    
    val selectedValue: js.UndefOr[js.Any] = js.undefined
    
    val style: js.UndefOr[js.Any] = js.undefined
  }
  object ReadonlyIPickerProps {
    
    @scala.inline
    def apply(): ReadonlyIPickerProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ReadonlyIPickerProps]
    }
    
    @scala.inline
    implicit class ReadonlyIPickerPropsMutableBuilder[Self <: ReadonlyIPickerProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      @scala.inline
      def setDefaultSelectedValue(value: js.Any): Self = StObject.set(x, "defaultSelectedValue", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefaultSelectedValueUndefined: Self = StObject.set(x, "defaultSelectedValue", js.undefined)
      
      @scala.inline
      def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      @scala.inline
      def setIndicatorClassName(value: String): Self = StObject.set(x, "indicatorClassName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIndicatorClassNameUndefined: Self = StObject.set(x, "indicatorClassName", js.undefined)
      
      @scala.inline
      def setIndicatorStyle(value: js.Any): Self = StObject.set(x, "indicatorStyle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIndicatorStyleUndefined: Self = StObject.set(x, "indicatorStyle", js.undefined)
      
      @scala.inline
      def setItemStyle(value: js.Any): Self = StObject.set(x, "itemStyle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setItemStyleUndefined: Self = StObject.set(x, "itemStyle", js.undefined)
      
      @scala.inline
      def setNoAnimate(value: Boolean): Self = StObject.set(x, "noAnimate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNoAnimateUndefined: Self = StObject.set(x, "noAnimate", js.undefined)
      
      @scala.inline
      def setOnScrollChange(value: /* value */ js.Any => Unit): Self = StObject.set(x, "onScrollChange", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnScrollChangeUndefined: Self = StObject.set(x, "onScrollChange", js.undefined)
      
      @scala.inline
      def setOnValueChange(value: /* value */ js.Any => Unit): Self = StObject.set(x, "onValueChange", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnValueChangeUndefined: Self = StObject.set(x, "onValueChange", js.undefined)
      
      @scala.inline
      def setPrefixCls(value: String): Self = StObject.set(x, "prefixCls", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrefixClsUndefined: Self = StObject.set(x, "prefixCls", js.undefined)
      
      @scala.inline
      def setSelectedValue(value: js.Any): Self = StObject.set(x, "selectedValue", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSelectedValueUndefined: Self = StObject.set(x, "selectedValue", js.undefined)
      
      @scala.inline
      def setStyle(value: js.Any): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    }
  }
  
  /* Inlined std.Readonly<rmc-picker.rmc-picker/lib/PopupPickerTypes.IPopupPickerProps> */
  trait ReadonlyIPopupPickerProps extends StObject {
    
    val WrapComponent: js.UndefOr[js.Any] = js.undefined
    
    val actionTextActiveOpacity: js.UndefOr[Double] = js.undefined
    
    val actionTextUnderlayColor: js.UndefOr[String] = js.undefined
    
    val className: js.UndefOr[String] = js.undefined
    
    val content: js.UndefOr[ReactElement | String] = js.undefined
    
    val disabled: js.UndefOr[Boolean] = js.undefined
    
    val dismissText: js.UndefOr[String | ReactElement] = js.undefined
    
    val maskTransitionName: js.UndefOr[String] = js.undefined
    
    val okText: js.UndefOr[String | ReactElement] = js.undefined
    
    val onDismiss: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    val onOk: js.UndefOr[js.Function1[/* value */ js.UndefOr[js.Any], Unit]] = js.undefined
    
    val onVisibleChange: js.UndefOr[js.Function1[/* visible */ Boolean, Unit]] = js.undefined
    
    val picker: js.UndefOr[js.Any] = js.undefined
    
    val pickerValueChangeProp: js.UndefOr[String] = js.undefined
    
    val pickerValueProp: js.UndefOr[String] = js.undefined
    
    val popupTransitionName: js.UndefOr[String] = js.undefined
    
    val prefixCls: js.UndefOr[String] = js.undefined
    
    val style: js.UndefOr[js.Any] = js.undefined
    
    val styles: js.UndefOr[js.Any] = js.undefined
    
    val title: js.UndefOr[String | ReactElement] = js.undefined
    
    val transitionName: js.UndefOr[String] = js.undefined
    
    val triggerType: js.UndefOr[String] = js.undefined
    
    val value: js.UndefOr[js.Any] = js.undefined
    
    val visible: js.UndefOr[Boolean] = js.undefined
    
    val wrapStyle: js.UndefOr[CSSProperties] = js.undefined
  }
  object ReadonlyIPopupPickerProps {
    
    @scala.inline
    def apply(): ReadonlyIPopupPickerProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ReadonlyIPopupPickerProps]
    }
    
    @scala.inline
    implicit class ReadonlyIPopupPickerPropsMutableBuilder[Self <: ReadonlyIPopupPickerProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setActionTextActiveOpacity(value: Double): Self = StObject.set(x, "actionTextActiveOpacity", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setActionTextActiveOpacityUndefined: Self = StObject.set(x, "actionTextActiveOpacity", js.undefined)
      
      @scala.inline
      def setActionTextUnderlayColor(value: String): Self = StObject.set(x, "actionTextUnderlayColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setActionTextUnderlayColorUndefined: Self = StObject.set(x, "actionTextUnderlayColor", js.undefined)
      
      @scala.inline
      def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      @scala.inline
      def setContent(value: ReactElement | String): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContentUndefined: Self = StObject.set(x, "content", js.undefined)
      
      @scala.inline
      def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      @scala.inline
      def setDismissText(value: String | ReactElement): Self = StObject.set(x, "dismissText", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDismissTextUndefined: Self = StObject.set(x, "dismissText", js.undefined)
      
      @scala.inline
      def setMaskTransitionName(value: String): Self = StObject.set(x, "maskTransitionName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaskTransitionNameUndefined: Self = StObject.set(x, "maskTransitionName", js.undefined)
      
      @scala.inline
      def setOkText(value: String | ReactElement): Self = StObject.set(x, "okText", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOkTextUndefined: Self = StObject.set(x, "okText", js.undefined)
      
      @scala.inline
      def setOnDismiss(value: () => Unit): Self = StObject.set(x, "onDismiss", js.Any.fromFunction0(value))
      
      @scala.inline
      def setOnDismissUndefined: Self = StObject.set(x, "onDismiss", js.undefined)
      
      @scala.inline
      def setOnOk(value: /* value */ js.UndefOr[js.Any] => Unit): Self = StObject.set(x, "onOk", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnOkUndefined: Self = StObject.set(x, "onOk", js.undefined)
      
      @scala.inline
      def setOnVisibleChange(value: /* visible */ Boolean => Unit): Self = StObject.set(x, "onVisibleChange", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnVisibleChangeUndefined: Self = StObject.set(x, "onVisibleChange", js.undefined)
      
      @scala.inline
      def setPicker(value: js.Any): Self = StObject.set(x, "picker", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPickerUndefined: Self = StObject.set(x, "picker", js.undefined)
      
      @scala.inline
      def setPickerValueChangeProp(value: String): Self = StObject.set(x, "pickerValueChangeProp", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPickerValueChangePropUndefined: Self = StObject.set(x, "pickerValueChangeProp", js.undefined)
      
      @scala.inline
      def setPickerValueProp(value: String): Self = StObject.set(x, "pickerValueProp", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPickerValuePropUndefined: Self = StObject.set(x, "pickerValueProp", js.undefined)
      
      @scala.inline
      def setPopupTransitionName(value: String): Self = StObject.set(x, "popupTransitionName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPopupTransitionNameUndefined: Self = StObject.set(x, "popupTransitionName", js.undefined)
      
      @scala.inline
      def setPrefixCls(value: String): Self = StObject.set(x, "prefixCls", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrefixClsUndefined: Self = StObject.set(x, "prefixCls", js.undefined)
      
      @scala.inline
      def setStyle(value: js.Any): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      @scala.inline
      def setStyles(value: js.Any): Self = StObject.set(x, "styles", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStylesUndefined: Self = StObject.set(x, "styles", js.undefined)
      
      @scala.inline
      def setTitle(value: String | ReactElement): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
      
      @scala.inline
      def setTransitionName(value: String): Self = StObject.set(x, "transitionName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTransitionNameUndefined: Self = StObject.set(x, "transitionName", js.undefined)
      
      @scala.inline
      def setTriggerType(value: String): Self = StObject.set(x, "triggerType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTriggerTypeUndefined: Self = StObject.set(x, "triggerType", js.undefined)
      
      @scala.inline
      def setValue(value: js.Any): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
      
      @scala.inline
      def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVisibleUndefined: Self = StObject.set(x, "visible", js.undefined)
      
      @scala.inline
      def setWrapComponent(value: js.Any): Self = StObject.set(x, "WrapComponent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWrapComponentUndefined: Self = StObject.set(x, "WrapComponent", js.undefined)
      
      @scala.inline
      def setWrapStyle(value: CSSProperties): Self = StObject.set(x, "wrapStyle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWrapStyleUndefined: Self = StObject.set(x, "wrapStyle", js.undefined)
    }
  }
  
  /* Inlined std.Readonly<react-native.react-native.PickerProps> */
  trait ReadonlyPickerProps extends StObject {
    
    val accessibilityActions: js.UndefOr[js.Array[AccessibilityActionInfo]] = js.undefined
    
    val accessibilityComponentType: js.UndefOr[none | button | radiobutton_checked | radiobutton_unchecked] = js.undefined
    
    val accessibilityElementsHidden: js.UndefOr[Boolean] = js.undefined
    
    val accessibilityHint: js.UndefOr[String] = js.undefined
    
    val accessibilityIgnoresInvertColors: js.UndefOr[Boolean] = js.undefined
    
    val accessibilityLabel: js.UndefOr[String] = js.undefined
    
    val accessibilityLiveRegion: js.UndefOr[none | polite | assertive] = js.undefined
    
    val accessibilityRole: js.UndefOr[AccessibilityRole] = js.undefined
    
    val accessibilityState: js.UndefOr[AccessibilityState] = js.undefined
    
    val accessibilityTraits: js.UndefOr[AccessibilityTrait | js.Array[AccessibilityTrait]] = js.undefined
    
    val accessibilityValue: js.UndefOr[AccessibilityValue] = js.undefined
    
    val accessibilityViewIsModal: js.UndefOr[Boolean] = js.undefined
    
    val accessible: js.UndefOr[Boolean] = js.undefined
    
    val collapsable: js.UndefOr[Boolean] = js.undefined
    
    val enabled: js.UndefOr[Boolean] = js.undefined
    
    val focusable: js.UndefOr[Boolean] = js.undefined
    
    val hasTVPreferredFocus: js.UndefOr[Boolean] = js.undefined
    
    val hitSlop: js.UndefOr[Insets] = js.undefined
    
    val importantForAccessibility: js.UndefOr[auto | yes | no | `no-hide-descendants`] = js.undefined
    
    val isTVSelectable: js.UndefOr[Boolean] = js.undefined
    
    val itemStyle: js.UndefOr[StyleProp[TextStyle]] = js.undefined
    
    val mode: js.UndefOr[dialog | dropdown] = js.undefined
    
    val nativeID: js.UndefOr[String] = js.undefined
    
    val needsOffscreenAlphaCompositing: js.UndefOr[Boolean] = js.undefined
    
    val onAccessibilityAction: js.UndefOr[js.Function1[/* event */ AccessibilityActionEvent, Unit]] = js.undefined
    
    val onAccessibilityEscape: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    val onAccessibilityTap: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    val onLayout: js.UndefOr[js.Function1[/* event */ LayoutChangeEvent, Unit]] = js.undefined
    
    val onMagicTap: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    val onMoveShouldSetResponder: js.UndefOr[js.Function1[/* event */ GestureResponderEvent, Boolean]] = js.undefined
    
    val onMoveShouldSetResponderCapture: js.UndefOr[js.Function1[/* event */ GestureResponderEvent, Boolean]] = js.undefined
    
    val onResponderEnd: js.UndefOr[js.Function1[/* event */ GestureResponderEvent, Unit]] = js.undefined
    
    val onResponderGrant: js.UndefOr[js.Function1[/* event */ GestureResponderEvent, Unit]] = js.undefined
    
    val onResponderMove: js.UndefOr[js.Function1[/* event */ GestureResponderEvent, Unit]] = js.undefined
    
    val onResponderReject: js.UndefOr[js.Function1[/* event */ GestureResponderEvent, Unit]] = js.undefined
    
    val onResponderRelease: js.UndefOr[js.Function1[/* event */ GestureResponderEvent, Unit]] = js.undefined
    
    val onResponderStart: js.UndefOr[js.Function1[/* event */ GestureResponderEvent, Unit]] = js.undefined
    
    val onResponderTerminate: js.UndefOr[js.Function1[/* event */ GestureResponderEvent, Unit]] = js.undefined
    
    val onResponderTerminationRequest: js.UndefOr[js.Function1[/* event */ GestureResponderEvent, Boolean]] = js.undefined
    
    val onStartShouldSetResponder: js.UndefOr[js.Function1[/* event */ GestureResponderEvent, Boolean]] = js.undefined
    
    val onStartShouldSetResponderCapture: js.UndefOr[js.Function1[/* event */ GestureResponderEvent, Boolean]] = js.undefined
    
    val onTouchCancel: js.UndefOr[js.Function1[/* event */ GestureResponderEvent, Unit]] = js.undefined
    
    val onTouchEnd: js.UndefOr[js.Function1[/* event */ GestureResponderEvent, Unit]] = js.undefined
    
    val onTouchEndCapture: js.UndefOr[js.Function1[/* event */ GestureResponderEvent, Unit]] = js.undefined
    
    val onTouchMove: js.UndefOr[js.Function1[/* event */ GestureResponderEvent, Unit]] = js.undefined
    
    val onTouchStart: js.UndefOr[js.Function1[/* event */ GestureResponderEvent, Unit]] = js.undefined
    
    val onValueChange: js.UndefOr[js.Function2[/* itemValue */ js.Any, /* itemPosition */ Double, Unit]] = js.undefined
    
    val pointerEvents: js.UndefOr[`box-none` | none | `box-only` | auto] = js.undefined
    
    val prompt: js.UndefOr[String] = js.undefined
    
    val removeClippedSubviews: js.UndefOr[Boolean] = js.undefined
    
    val renderToHardwareTextureAndroid: js.UndefOr[Boolean] = js.undefined
    
    val selectedValue: js.UndefOr[js.Any] = js.undefined
    
    val shouldRasterizeIOS: js.UndefOr[Boolean] = js.undefined
    
    val style: js.UndefOr[StyleProp[TextStyle]] = js.undefined
    
    val testID: js.UndefOr[String] = js.undefined
    
    val testId: js.UndefOr[String] = js.undefined
    
    val tvParallaxMagnification: js.UndefOr[Double] = js.undefined
    
    val tvParallaxProperties: js.UndefOr[TVParallaxProperties] = js.undefined
    
    val tvParallaxShiftDistanceX: js.UndefOr[Double] = js.undefined
    
    val tvParallaxShiftDistanceY: js.UndefOr[Double] = js.undefined
    
    val tvParallaxTiltAngle: js.UndefOr[Double] = js.undefined
  }
  object ReadonlyPickerProps {
    
    @scala.inline
    def apply(): ReadonlyPickerProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ReadonlyPickerProps]
    }
    
    @scala.inline
    implicit class ReadonlyPickerPropsMutableBuilder[Self <: ReadonlyPickerProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAccessibilityActions(value: js.Array[AccessibilityActionInfo]): Self = StObject.set(x, "accessibilityActions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAccessibilityActionsUndefined: Self = StObject.set(x, "accessibilityActions", js.undefined)
      
      @scala.inline
      def setAccessibilityActionsVarargs(value: AccessibilityActionInfo*): Self = StObject.set(x, "accessibilityActions", js.Array(value :_*))
      
      @scala.inline
      def setAccessibilityComponentType(value: none | button | radiobutton_checked | radiobutton_unchecked): Self = StObject.set(x, "accessibilityComponentType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAccessibilityComponentTypeUndefined: Self = StObject.set(x, "accessibilityComponentType", js.undefined)
      
      @scala.inline
      def setAccessibilityElementsHidden(value: Boolean): Self = StObject.set(x, "accessibilityElementsHidden", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAccessibilityElementsHiddenUndefined: Self = StObject.set(x, "accessibilityElementsHidden", js.undefined)
      
      @scala.inline
      def setAccessibilityHint(value: String): Self = StObject.set(x, "accessibilityHint", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAccessibilityHintUndefined: Self = StObject.set(x, "accessibilityHint", js.undefined)
      
      @scala.inline
      def setAccessibilityIgnoresInvertColors(value: Boolean): Self = StObject.set(x, "accessibilityIgnoresInvertColors", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAccessibilityIgnoresInvertColorsUndefined: Self = StObject.set(x, "accessibilityIgnoresInvertColors", js.undefined)
      
      @scala.inline
      def setAccessibilityLabel(value: String): Self = StObject.set(x, "accessibilityLabel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAccessibilityLabelUndefined: Self = StObject.set(x, "accessibilityLabel", js.undefined)
      
      @scala.inline
      def setAccessibilityLiveRegion(value: none | polite | assertive): Self = StObject.set(x, "accessibilityLiveRegion", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAccessibilityLiveRegionUndefined: Self = StObject.set(x, "accessibilityLiveRegion", js.undefined)
      
      @scala.inline
      def setAccessibilityRole(value: AccessibilityRole): Self = StObject.set(x, "accessibilityRole", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAccessibilityRoleUndefined: Self = StObject.set(x, "accessibilityRole", js.undefined)
      
      @scala.inline
      def setAccessibilityState(value: AccessibilityState): Self = StObject.set(x, "accessibilityState", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAccessibilityStateUndefined: Self = StObject.set(x, "accessibilityState", js.undefined)
      
      @scala.inline
      def setAccessibilityTraits(value: AccessibilityTrait | js.Array[AccessibilityTrait]): Self = StObject.set(x, "accessibilityTraits", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAccessibilityTraitsUndefined: Self = StObject.set(x, "accessibilityTraits", js.undefined)
      
      @scala.inline
      def setAccessibilityTraitsVarargs(value: AccessibilityTrait*): Self = StObject.set(x, "accessibilityTraits", js.Array(value :_*))
      
      @scala.inline
      def setAccessibilityValue(value: AccessibilityValue): Self = StObject.set(x, "accessibilityValue", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAccessibilityValueUndefined: Self = StObject.set(x, "accessibilityValue", js.undefined)
      
      @scala.inline
      def setAccessibilityViewIsModal(value: Boolean): Self = StObject.set(x, "accessibilityViewIsModal", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAccessibilityViewIsModalUndefined: Self = StObject.set(x, "accessibilityViewIsModal", js.undefined)
      
      @scala.inline
      def setAccessible(value: Boolean): Self = StObject.set(x, "accessible", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAccessibleUndefined: Self = StObject.set(x, "accessible", js.undefined)
      
      @scala.inline
      def setCollapsable(value: Boolean): Self = StObject.set(x, "collapsable", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCollapsableUndefined: Self = StObject.set(x, "collapsable", js.undefined)
      
      @scala.inline
      def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
      
      @scala.inline
      def setFocusable(value: Boolean): Self = StObject.set(x, "focusable", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFocusableUndefined: Self = StObject.set(x, "focusable", js.undefined)
      
      @scala.inline
      def setHasTVPreferredFocus(value: Boolean): Self = StObject.set(x, "hasTVPreferredFocus", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHasTVPreferredFocusUndefined: Self = StObject.set(x, "hasTVPreferredFocus", js.undefined)
      
      @scala.inline
      def setHitSlop(value: Insets): Self = StObject.set(x, "hitSlop", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHitSlopUndefined: Self = StObject.set(x, "hitSlop", js.undefined)
      
      @scala.inline
      def setImportantForAccessibility(value: auto | yes | no | `no-hide-descendants`): Self = StObject.set(x, "importantForAccessibility", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setImportantForAccessibilityUndefined: Self = StObject.set(x, "importantForAccessibility", js.undefined)
      
      @scala.inline
      def setIsTVSelectable(value: Boolean): Self = StObject.set(x, "isTVSelectable", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsTVSelectableUndefined: Self = StObject.set(x, "isTVSelectable", js.undefined)
      
      @scala.inline
      def setItemStyle(value: StyleProp[TextStyle]): Self = StObject.set(x, "itemStyle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setItemStyleNull: Self = StObject.set(x, "itemStyle", null)
      
      @scala.inline
      def setItemStyleUndefined: Self = StObject.set(x, "itemStyle", js.undefined)
      
      @scala.inline
      def setMode(value: dialog | dropdown): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setModeUndefined: Self = StObject.set(x, "mode", js.undefined)
      
      @scala.inline
      def setNativeID(value: String): Self = StObject.set(x, "nativeID", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNativeIDUndefined: Self = StObject.set(x, "nativeID", js.undefined)
      
      @scala.inline
      def setNeedsOffscreenAlphaCompositing(value: Boolean): Self = StObject.set(x, "needsOffscreenAlphaCompositing", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNeedsOffscreenAlphaCompositingUndefined: Self = StObject.set(x, "needsOffscreenAlphaCompositing", js.undefined)
      
      @scala.inline
      def setOnAccessibilityAction(value: /* event */ AccessibilityActionEvent => Unit): Self = StObject.set(x, "onAccessibilityAction", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnAccessibilityActionUndefined: Self = StObject.set(x, "onAccessibilityAction", js.undefined)
      
      @scala.inline
      def setOnAccessibilityEscape(value: () => Unit): Self = StObject.set(x, "onAccessibilityEscape", js.Any.fromFunction0(value))
      
      @scala.inline
      def setOnAccessibilityEscapeUndefined: Self = StObject.set(x, "onAccessibilityEscape", js.undefined)
      
      @scala.inline
      def setOnAccessibilityTap(value: () => Unit): Self = StObject.set(x, "onAccessibilityTap", js.Any.fromFunction0(value))
      
      @scala.inline
      def setOnAccessibilityTapUndefined: Self = StObject.set(x, "onAccessibilityTap", js.undefined)
      
      @scala.inline
      def setOnLayout(value: /* event */ LayoutChangeEvent => Unit): Self = StObject.set(x, "onLayout", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnLayoutUndefined: Self = StObject.set(x, "onLayout", js.undefined)
      
      @scala.inline
      def setOnMagicTap(value: () => Unit): Self = StObject.set(x, "onMagicTap", js.Any.fromFunction0(value))
      
      @scala.inline
      def setOnMagicTapUndefined: Self = StObject.set(x, "onMagicTap", js.undefined)
      
      @scala.inline
      def setOnMoveShouldSetResponder(value: /* event */ GestureResponderEvent => Boolean): Self = StObject.set(x, "onMoveShouldSetResponder", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnMoveShouldSetResponderCapture(value: /* event */ GestureResponderEvent => Boolean): Self = StObject.set(x, "onMoveShouldSetResponderCapture", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnMoveShouldSetResponderCaptureUndefined: Self = StObject.set(x, "onMoveShouldSetResponderCapture", js.undefined)
      
      @scala.inline
      def setOnMoveShouldSetResponderUndefined: Self = StObject.set(x, "onMoveShouldSetResponder", js.undefined)
      
      @scala.inline
      def setOnResponderEnd(value: /* event */ GestureResponderEvent => Unit): Self = StObject.set(x, "onResponderEnd", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnResponderEndUndefined: Self = StObject.set(x, "onResponderEnd", js.undefined)
      
      @scala.inline
      def setOnResponderGrant(value: /* event */ GestureResponderEvent => Unit): Self = StObject.set(x, "onResponderGrant", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnResponderGrantUndefined: Self = StObject.set(x, "onResponderGrant", js.undefined)
      
      @scala.inline
      def setOnResponderMove(value: /* event */ GestureResponderEvent => Unit): Self = StObject.set(x, "onResponderMove", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnResponderMoveUndefined: Self = StObject.set(x, "onResponderMove", js.undefined)
      
      @scala.inline
      def setOnResponderReject(value: /* event */ GestureResponderEvent => Unit): Self = StObject.set(x, "onResponderReject", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnResponderRejectUndefined: Self = StObject.set(x, "onResponderReject", js.undefined)
      
      @scala.inline
      def setOnResponderRelease(value: /* event */ GestureResponderEvent => Unit): Self = StObject.set(x, "onResponderRelease", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnResponderReleaseUndefined: Self = StObject.set(x, "onResponderRelease", js.undefined)
      
      @scala.inline
      def setOnResponderStart(value: /* event */ GestureResponderEvent => Unit): Self = StObject.set(x, "onResponderStart", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnResponderStartUndefined: Self = StObject.set(x, "onResponderStart", js.undefined)
      
      @scala.inline
      def setOnResponderTerminate(value: /* event */ GestureResponderEvent => Unit): Self = StObject.set(x, "onResponderTerminate", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnResponderTerminateUndefined: Self = StObject.set(x, "onResponderTerminate", js.undefined)
      
      @scala.inline
      def setOnResponderTerminationRequest(value: /* event */ GestureResponderEvent => Boolean): Self = StObject.set(x, "onResponderTerminationRequest", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnResponderTerminationRequestUndefined: Self = StObject.set(x, "onResponderTerminationRequest", js.undefined)
      
      @scala.inline
      def setOnStartShouldSetResponder(value: /* event */ GestureResponderEvent => Boolean): Self = StObject.set(x, "onStartShouldSetResponder", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnStartShouldSetResponderCapture(value: /* event */ GestureResponderEvent => Boolean): Self = StObject.set(x, "onStartShouldSetResponderCapture", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnStartShouldSetResponderCaptureUndefined: Self = StObject.set(x, "onStartShouldSetResponderCapture", js.undefined)
      
      @scala.inline
      def setOnStartShouldSetResponderUndefined: Self = StObject.set(x, "onStartShouldSetResponder", js.undefined)
      
      @scala.inline
      def setOnTouchCancel(value: /* event */ GestureResponderEvent => Unit): Self = StObject.set(x, "onTouchCancel", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnTouchCancelUndefined: Self = StObject.set(x, "onTouchCancel", js.undefined)
      
      @scala.inline
      def setOnTouchEnd(value: /* event */ GestureResponderEvent => Unit): Self = StObject.set(x, "onTouchEnd", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnTouchEndCapture(value: /* event */ GestureResponderEvent => Unit): Self = StObject.set(x, "onTouchEndCapture", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnTouchEndCaptureUndefined: Self = StObject.set(x, "onTouchEndCapture", js.undefined)
      
      @scala.inline
      def setOnTouchEndUndefined: Self = StObject.set(x, "onTouchEnd", js.undefined)
      
      @scala.inline
      def setOnTouchMove(value: /* event */ GestureResponderEvent => Unit): Self = StObject.set(x, "onTouchMove", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnTouchMoveUndefined: Self = StObject.set(x, "onTouchMove", js.undefined)
      
      @scala.inline
      def setOnTouchStart(value: /* event */ GestureResponderEvent => Unit): Self = StObject.set(x, "onTouchStart", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnTouchStartUndefined: Self = StObject.set(x, "onTouchStart", js.undefined)
      
      @scala.inline
      def setOnValueChange(value: (/* itemValue */ js.Any, /* itemPosition */ Double) => Unit): Self = StObject.set(x, "onValueChange", js.Any.fromFunction2(value))
      
      @scala.inline
      def setOnValueChangeUndefined: Self = StObject.set(x, "onValueChange", js.undefined)
      
      @scala.inline
      def setPointerEvents(value: `box-none` | none | `box-only` | auto): Self = StObject.set(x, "pointerEvents", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPointerEventsUndefined: Self = StObject.set(x, "pointerEvents", js.undefined)
      
      @scala.inline
      def setPrompt(value: String): Self = StObject.set(x, "prompt", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPromptUndefined: Self = StObject.set(x, "prompt", js.undefined)
      
      @scala.inline
      def setRemoveClippedSubviews(value: Boolean): Self = StObject.set(x, "removeClippedSubviews", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRemoveClippedSubviewsUndefined: Self = StObject.set(x, "removeClippedSubviews", js.undefined)
      
      @scala.inline
      def setRenderToHardwareTextureAndroid(value: Boolean): Self = StObject.set(x, "renderToHardwareTextureAndroid", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRenderToHardwareTextureAndroidUndefined: Self = StObject.set(x, "renderToHardwareTextureAndroid", js.undefined)
      
      @scala.inline
      def setSelectedValue(value: js.Any): Self = StObject.set(x, "selectedValue", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSelectedValueUndefined: Self = StObject.set(x, "selectedValue", js.undefined)
      
      @scala.inline
      def setShouldRasterizeIOS(value: Boolean): Self = StObject.set(x, "shouldRasterizeIOS", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShouldRasterizeIOSUndefined: Self = StObject.set(x, "shouldRasterizeIOS", js.undefined)
      
      @scala.inline
      def setStyle(value: StyleProp[TextStyle]): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStyleNull: Self = StObject.set(x, "style", null)
      
      @scala.inline
      def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      @scala.inline
      def setTestID(value: String): Self = StObject.set(x, "testID", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTestIDUndefined: Self = StObject.set(x, "testID", js.undefined)
      
      @scala.inline
      def setTvParallaxMagnification(value: Double): Self = StObject.set(x, "tvParallaxMagnification", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTvParallaxMagnificationUndefined: Self = StObject.set(x, "tvParallaxMagnification", js.undefined)
      
      @scala.inline
      def setTvParallaxProperties(value: TVParallaxProperties): Self = StObject.set(x, "tvParallaxProperties", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTvParallaxPropertiesUndefined: Self = StObject.set(x, "tvParallaxProperties", js.undefined)
      
      @scala.inline
      def setTvParallaxShiftDistanceX(value: Double): Self = StObject.set(x, "tvParallaxShiftDistanceX", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTvParallaxShiftDistanceXUndefined: Self = StObject.set(x, "tvParallaxShiftDistanceX", js.undefined)
      
      @scala.inline
      def setTvParallaxShiftDistanceY(value: Double): Self = StObject.set(x, "tvParallaxShiftDistanceY", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTvParallaxShiftDistanceYUndefined: Self = StObject.set(x, "tvParallaxShiftDistanceY", js.undefined)
      
      @scala.inline
      def setTvParallaxTiltAngle(value: Double): Self = StObject.set(x, "tvParallaxTiltAngle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTvParallaxTiltAngleUndefined: Self = StObject.set(x, "tvParallaxTiltAngle", js.undefined)
    }
  }
  
  /* Inlined std.Readonly<{  children :react.react.ReactNode | undefined}> & std.Readonly<rmc-picker.rmc-picker/lib/MultiPickerProps.default> */
  trait ReadonlychildrenReactNode extends StObject {
    
    val children: js.UndefOr[ReactNode] & js.UndefOr[js.Any]
    
    val className: js.UndefOr[String] = js.undefined
    
    val onScrollChange: js.UndefOr[js.Function2[/* v */ js.UndefOr[js.Any], /* i */ js.UndefOr[Double], Unit]] = js.undefined
    
    val onValueChange: js.UndefOr[js.Function2[/* v */ js.UndefOr[js.Any], /* i */ js.UndefOr[Double], Unit]] = js.undefined
    
    val prefixCls: js.UndefOr[String] = js.undefined
    
    val rootNativeProps: js.UndefOr[js.Any] = js.undefined
    
    val selectedValue: js.UndefOr[js.Array[js.Any]] = js.undefined
    
    val style: js.UndefOr[js.Any] = js.undefined
  }
  object ReadonlychildrenReactNode {
    
    @scala.inline
    def apply(children: js.UndefOr[ReactNode] & js.UndefOr[js.Any]): ReadonlychildrenReactNode = {
      val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any])
      __obj.asInstanceOf[ReadonlychildrenReactNode]
    }
    
    @scala.inline
    implicit class ReadonlychildrenReactNodeMutableBuilder[Self <: ReadonlychildrenReactNode] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setChildren(value: js.UndefOr[ReactNode] & js.UndefOr[js.Any]): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      @scala.inline
      def setOnScrollChange(value: (/* v */ js.UndefOr[js.Any], /* i */ js.UndefOr[Double]) => Unit): Self = StObject.set(x, "onScrollChange", js.Any.fromFunction2(value))
      
      @scala.inline
      def setOnScrollChangeUndefined: Self = StObject.set(x, "onScrollChange", js.undefined)
      
      @scala.inline
      def setOnValueChange(value: (/* v */ js.UndefOr[js.Any], /* i */ js.UndefOr[Double]) => Unit): Self = StObject.set(x, "onValueChange", js.Any.fromFunction2(value))
      
      @scala.inline
      def setOnValueChangeUndefined: Self = StObject.set(x, "onValueChange", js.undefined)
      
      @scala.inline
      def setPrefixCls(value: String): Self = StObject.set(x, "prefixCls", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrefixClsUndefined: Self = StObject.set(x, "prefixCls", js.undefined)
      
      @scala.inline
      def setRootNativeProps(value: js.Any): Self = StObject.set(x, "rootNativeProps", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRootNativePropsUndefined: Self = StObject.set(x, "rootNativeProps", js.undefined)
      
      @scala.inline
      def setSelectedValue(value: js.Array[js.Any]): Self = StObject.set(x, "selectedValue", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSelectedValueUndefined: Self = StObject.set(x, "selectedValue", js.undefined)
      
      @scala.inline
      def setSelectedValueVarargs(value: js.Any*): Self = StObject.set(x, "selectedValue", js.Array(value :_*))
      
      @scala.inline
      def setStyle(value: js.Any): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    }
  }
  
  /* Inlined std.Readonly<{  children :react.react.ReactNode | undefined}> & std.Readonly<rmc-picker.rmc-picker/lib/PopupPickerTypes.IPopupPickerProps> */
  trait ReadonlychildrenReactNodeActionTextActiveOpacity extends StObject {
    
    val WrapComponent: js.UndefOr[js.Any] = js.undefined
    
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
    
    val onOk: js.UndefOr[js.Function1[/* value */ js.UndefOr[js.Any], Unit]] = js.undefined
    
    val onVisibleChange: js.UndefOr[js.Function1[/* visible */ Boolean, Unit]] = js.undefined
    
    val picker: js.UndefOr[js.Any] = js.undefined
    
    val pickerValueChangeProp: js.UndefOr[String] = js.undefined
    
    val pickerValueProp: js.UndefOr[String] = js.undefined
    
    val popupTransitionName: js.UndefOr[String] = js.undefined
    
    val prefixCls: js.UndefOr[String] = js.undefined
    
    val style: js.UndefOr[js.Any] = js.undefined
    
    val styles: js.UndefOr[js.Any] = js.undefined
    
    val title: js.UndefOr[String | ReactElement] = js.undefined
    
    val transitionName: js.UndefOr[String] = js.undefined
    
    val triggerType: js.UndefOr[String] = js.undefined
    
    val value: js.UndefOr[js.Any] = js.undefined
    
    val visible: js.UndefOr[Boolean] = js.undefined
    
    val wrapStyle: js.UndefOr[CSSProperties] = js.undefined
  }
  object ReadonlychildrenReactNodeActionTextActiveOpacity {
    
    @scala.inline
    def apply(): ReadonlychildrenReactNodeActionTextActiveOpacity = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ReadonlychildrenReactNodeActionTextActiveOpacity]
    }
    
    @scala.inline
    implicit class ReadonlychildrenReactNodeActionTextActiveOpacityMutableBuilder[Self <: ReadonlychildrenReactNodeActionTextActiveOpacity] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setActionTextActiveOpacity(value: Double): Self = StObject.set(x, "actionTextActiveOpacity", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setActionTextActiveOpacityUndefined: Self = StObject.set(x, "actionTextActiveOpacity", js.undefined)
      
      @scala.inline
      def setActionTextUnderlayColor(value: String): Self = StObject.set(x, "actionTextUnderlayColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setActionTextUnderlayColorUndefined: Self = StObject.set(x, "actionTextUnderlayColor", js.undefined)
      
      @scala.inline
      def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      @scala.inline
      def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      @scala.inline
      def setContent(value: ReactElement | String): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContentUndefined: Self = StObject.set(x, "content", js.undefined)
      
      @scala.inline
      def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      @scala.inline
      def setDismissText(value: String | ReactElement): Self = StObject.set(x, "dismissText", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDismissTextUndefined: Self = StObject.set(x, "dismissText", js.undefined)
      
      @scala.inline
      def setMaskTransitionName(value: String): Self = StObject.set(x, "maskTransitionName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaskTransitionNameUndefined: Self = StObject.set(x, "maskTransitionName", js.undefined)
      
      @scala.inline
      def setOkText(value: String | ReactElement): Self = StObject.set(x, "okText", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOkTextUndefined: Self = StObject.set(x, "okText", js.undefined)
      
      @scala.inline
      def setOnDismiss(value: () => Unit): Self = StObject.set(x, "onDismiss", js.Any.fromFunction0(value))
      
      @scala.inline
      def setOnDismissUndefined: Self = StObject.set(x, "onDismiss", js.undefined)
      
      @scala.inline
      def setOnOk(value: /* value */ js.UndefOr[js.Any] => Unit): Self = StObject.set(x, "onOk", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnOkUndefined: Self = StObject.set(x, "onOk", js.undefined)
      
      @scala.inline
      def setOnVisibleChange(value: /* visible */ Boolean => Unit): Self = StObject.set(x, "onVisibleChange", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnVisibleChangeUndefined: Self = StObject.set(x, "onVisibleChange", js.undefined)
      
      @scala.inline
      def setPicker(value: js.Any): Self = StObject.set(x, "picker", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPickerUndefined: Self = StObject.set(x, "picker", js.undefined)
      
      @scala.inline
      def setPickerValueChangeProp(value: String): Self = StObject.set(x, "pickerValueChangeProp", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPickerValueChangePropUndefined: Self = StObject.set(x, "pickerValueChangeProp", js.undefined)
      
      @scala.inline
      def setPickerValueProp(value: String): Self = StObject.set(x, "pickerValueProp", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPickerValuePropUndefined: Self = StObject.set(x, "pickerValueProp", js.undefined)
      
      @scala.inline
      def setPopupTransitionName(value: String): Self = StObject.set(x, "popupTransitionName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPopupTransitionNameUndefined: Self = StObject.set(x, "popupTransitionName", js.undefined)
      
      @scala.inline
      def setPrefixCls(value: String): Self = StObject.set(x, "prefixCls", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrefixClsUndefined: Self = StObject.set(x, "prefixCls", js.undefined)
      
      @scala.inline
      def setStyle(value: js.Any): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      @scala.inline
      def setStyles(value: js.Any): Self = StObject.set(x, "styles", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStylesUndefined: Self = StObject.set(x, "styles", js.undefined)
      
      @scala.inline
      def setTitle(value: String | ReactElement): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
      
      @scala.inline
      def setTransitionName(value: String): Self = StObject.set(x, "transitionName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTransitionNameUndefined: Self = StObject.set(x, "transitionName", js.undefined)
      
      @scala.inline
      def setTriggerType(value: String): Self = StObject.set(x, "triggerType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTriggerTypeUndefined: Self = StObject.set(x, "triggerType", js.undefined)
      
      @scala.inline
      def setValue(value: js.Any): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
      
      @scala.inline
      def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVisibleUndefined: Self = StObject.set(x, "visible", js.undefined)
      
      @scala.inline
      def setWrapComponent(value: js.Any): Self = StObject.set(x, "WrapComponent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWrapComponentUndefined: Self = StObject.set(x, "WrapComponent", js.undefined)
      
      @scala.inline
      def setWrapStyle(value: CSSProperties): Self = StObject.set(x, "wrapStyle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWrapStyleUndefined: Self = StObject.set(x, "wrapStyle", js.undefined)
    }
  }
  
  /* Inlined std.Readonly<{  children :react.react.ReactNode | undefined}> & std.Readonly<rmc-picker.rmc-picker/lib/PickerTypes.IPickerProps> */
  trait ReadonlychildrenReactNodeChildren extends StObject {
    
    val children: js.UndefOr[ReactNode] = js.undefined
    
    val className: js.UndefOr[String] = js.undefined
    
    val defaultSelectedValue: js.UndefOr[js.Any] = js.undefined
    
    val disabled: js.UndefOr[Boolean] = js.undefined
    
    val indicatorClassName: js.UndefOr[String] = js.undefined
    
    val indicatorStyle: js.UndefOr[js.Any] = js.undefined
    
    val itemStyle: js.UndefOr[js.Any] = js.undefined
    
    val noAnimate: js.UndefOr[Boolean] = js.undefined
    
    val onScrollChange: js.UndefOr[js.Function1[/* value */ js.Any, Unit]] = js.undefined
    
    val onValueChange: js.UndefOr[js.Function1[/* value */ js.Any, Unit]] = js.undefined
    
    val prefixCls: js.UndefOr[String] = js.undefined
    
    val selectedValue: js.UndefOr[js.Any] = js.undefined
    
    val style: js.UndefOr[js.Any] = js.undefined
  }
  object ReadonlychildrenReactNodeChildren {
    
    @scala.inline
    def apply(): ReadonlychildrenReactNodeChildren = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ReadonlychildrenReactNodeChildren]
    }
    
    @scala.inline
    implicit class ReadonlychildrenReactNodeChildrenMutableBuilder[Self <: ReadonlychildrenReactNodeChildren] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      @scala.inline
      def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      @scala.inline
      def setDefaultSelectedValue(value: js.Any): Self = StObject.set(x, "defaultSelectedValue", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefaultSelectedValueUndefined: Self = StObject.set(x, "defaultSelectedValue", js.undefined)
      
      @scala.inline
      def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      @scala.inline
      def setIndicatorClassName(value: String): Self = StObject.set(x, "indicatorClassName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIndicatorClassNameUndefined: Self = StObject.set(x, "indicatorClassName", js.undefined)
      
      @scala.inline
      def setIndicatorStyle(value: js.Any): Self = StObject.set(x, "indicatorStyle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIndicatorStyleUndefined: Self = StObject.set(x, "indicatorStyle", js.undefined)
      
      @scala.inline
      def setItemStyle(value: js.Any): Self = StObject.set(x, "itemStyle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setItemStyleUndefined: Self = StObject.set(x, "itemStyle", js.undefined)
      
      @scala.inline
      def setNoAnimate(value: Boolean): Self = StObject.set(x, "noAnimate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNoAnimateUndefined: Self = StObject.set(x, "noAnimate", js.undefined)
      
      @scala.inline
      def setOnScrollChange(value: /* value */ js.Any => Unit): Self = StObject.set(x, "onScrollChange", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnScrollChangeUndefined: Self = StObject.set(x, "onScrollChange", js.undefined)
      
      @scala.inline
      def setOnValueChange(value: /* value */ js.Any => Unit): Self = StObject.set(x, "onValueChange", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnValueChangeUndefined: Self = StObject.set(x, "onValueChange", js.undefined)
      
      @scala.inline
      def setPrefixCls(value: String): Self = StObject.set(x, "prefixCls", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrefixClsUndefined: Self = StObject.set(x, "prefixCls", js.undefined)
      
      @scala.inline
      def setSelectedValue(value: js.Any): Self = StObject.set(x, "selectedValue", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSelectedValueUndefined: Self = StObject.set(x, "selectedValue", js.undefined)
      
      @scala.inline
      def setStyle(value: js.Any): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    }
  }
  
  /* Inlined std.Readonly<rmc-picker.rmc-picker/lib/MultiPickerProps.default> */
  trait Readonlydefault extends StObject {
    
    val children: js.UndefOr[js.Any] = js.undefined
    
    val className: js.UndefOr[String] = js.undefined
    
    val onScrollChange: js.UndefOr[js.Function2[/* v */ js.UndefOr[js.Any], /* i */ js.UndefOr[Double], Unit]] = js.undefined
    
    val onValueChange: js.UndefOr[js.Function2[/* v */ js.UndefOr[js.Any], /* i */ js.UndefOr[Double], Unit]] = js.undefined
    
    val prefixCls: js.UndefOr[String] = js.undefined
    
    val rootNativeProps: js.UndefOr[js.Any] = js.undefined
    
    val selectedValue: js.UndefOr[js.Array[js.Any]] = js.undefined
    
    val style: js.UndefOr[js.Any] = js.undefined
  }
  object Readonlydefault {
    
    @scala.inline
    def apply(): Readonlydefault = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Readonlydefault]
    }
    
    @scala.inline
    implicit class ReadonlydefaultMutableBuilder[Self <: Readonlydefault] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setChildren(value: js.Any): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      @scala.inline
      def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      @scala.inline
      def setOnScrollChange(value: (/* v */ js.UndefOr[js.Any], /* i */ js.UndefOr[Double]) => Unit): Self = StObject.set(x, "onScrollChange", js.Any.fromFunction2(value))
      
      @scala.inline
      def setOnScrollChangeUndefined: Self = StObject.set(x, "onScrollChange", js.undefined)
      
      @scala.inline
      def setOnValueChange(value: (/* v */ js.UndefOr[js.Any], /* i */ js.UndefOr[Double]) => Unit): Self = StObject.set(x, "onValueChange", js.Any.fromFunction2(value))
      
      @scala.inline
      def setOnValueChangeUndefined: Self = StObject.set(x, "onValueChange", js.undefined)
      
      @scala.inline
      def setPrefixCls(value: String): Self = StObject.set(x, "prefixCls", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrefixClsUndefined: Self = StObject.set(x, "prefixCls", js.undefined)
      
      @scala.inline
      def setRootNativeProps(value: js.Any): Self = StObject.set(x, "rootNativeProps", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRootNativePropsUndefined: Self = StObject.set(x, "rootNativeProps", js.undefined)
      
      @scala.inline
      def setSelectedValue(value: js.Array[js.Any]): Self = StObject.set(x, "selectedValue", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSelectedValueUndefined: Self = StObject.set(x, "selectedValue", js.undefined)
      
      @scala.inline
      def setSelectedValueVarargs(value: js.Any*): Self = StObject.set(x, "selectedValue", js.Array(value :_*))
      
      @scala.inline
      def setStyle(value: js.Any): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    }
  }
}
