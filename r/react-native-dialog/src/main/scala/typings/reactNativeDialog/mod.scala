package typings.reactNativeDialog

import typings.react.mod.PureComponent
import typings.react.mod.ReactNode
import typings.react.mod.Ref
import typings.reactNative.mod.AccessibilityActionEvent
import typings.reactNative.mod.AccessibilityActionInfo
import typings.reactNative.mod.AccessibilityRole
import typings.reactNative.mod.AccessibilityState
import typings.reactNative.mod.AccessibilityTrait
import typings.reactNative.mod.AccessibilityValue
import typings.reactNative.mod.GestureResponderEvent
import typings.reactNative.mod.ImageStyle
import typings.reactNative.mod.Insets
import typings.reactNative.mod.LayoutChangeEvent
import typings.reactNative.mod.NativeSyntheticEvent
import typings.reactNative.mod.StyleProp
import typings.reactNative.mod.TVParallaxProperties
import typings.reactNative.mod.TextInputProps
import typings.reactNative.mod.TextProps
import typings.reactNative.mod.TextStyle
import typings.reactNative.mod.ViewProps
import typings.reactNative.mod.ViewStyle
import typings.reactNativeAnimatable.mod.Animation
import typings.reactNativeAnimatable.mod.CustomAnimation
import typings.reactNativeDialog.reactNativeDialogStrings.`box-none`
import typings.reactNativeDialog.reactNativeDialogStrings.`box-only`
import typings.reactNativeDialog.reactNativeDialogStrings.`no-hide-descendants`
import typings.reactNativeDialog.reactNativeDialogStrings.assertive
import typings.reactNativeDialog.reactNativeDialogStrings.auto
import typings.reactNativeDialog.reactNativeDialogStrings.button
import typings.reactNativeDialog.reactNativeDialogStrings.no
import typings.reactNativeDialog.reactNativeDialogStrings.none
import typings.reactNativeDialog.reactNativeDialogStrings.polite
import typings.reactNativeDialog.reactNativeDialogStrings.radiobutton_checked
import typings.reactNativeDialog.reactNativeDialogStrings.radiobutton_unchecked
import typings.reactNativeDialog.reactNativeDialogStrings.yes
import typings.reactNativeModal.modalMod.OnSwipeCompleteParams
import typings.reactNativeModal.typesMod.Direction
import typings.reactNativeModal.typesMod.OnOrientationChange
import typings.reactNativeModal.typesMod.OrNull
import typings.reactNativeModal.typesMod.Orientation
import typings.reactNativeModal.typesMod.PresentationStyle
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  object default {
    
    @JSImport("react-native-dialog", "default.Button")
    @js.native
    class Button protected ()
      extends typings.reactNativeDialog.mod.Dialog.Button {
      def this(props: ButtonProps & ViewProps & TextProps) = this()
      /**
        * @deprecated
        * @see https://reactjs.org/docs/legacy-context.html
        */
      def this(props: ButtonProps & ViewProps & TextProps, context: js.Any) = this()
    }
    
    @JSImport("react-native-dialog", "default.Container")
    @js.native
    class Container protected ()
      extends typings.reactNativeDialog.mod.Dialog.Container {
      def this(props: ContainerProps & ViewProps & reactNativeModalContainerProps) = this()
      /**
        * @deprecated
        * @see https://reactjs.org/docs/legacy-context.html
        */
      def this(props: ContainerProps & ViewProps & reactNativeModalContainerProps, context: js.Any) = this()
    }
    
    @JSImport("react-native-dialog", "default.Description")
    @js.native
    class Description protected ()
      extends typings.reactNativeDialog.mod.Dialog.Description {
      def this(props: DescriptionProps & ViewProps & TextProps) = this()
      /**
        * @deprecated
        * @see https://reactjs.org/docs/legacy-context.html
        */
      def this(props: DescriptionProps & ViewProps & TextProps, context: js.Any) = this()
    }
    
    @JSImport("react-native-dialog", "default.Input")
    @js.native
    class Input[T] protected ()
      extends typings.reactNativeDialog.mod.Dialog.Input[T] {
      def this(props: InputProps[T] & ViewProps & TextInputProps) = this()
      /**
        * @deprecated
        * @see https://reactjs.org/docs/legacy-context.html
        */
      def this(props: InputProps[T] & ViewProps & TextInputProps, context: js.Any) = this()
    }
    
    @JSImport("react-native-dialog", "default.Title")
    @js.native
    class Title protected ()
      extends typings.reactNativeDialog.mod.Dialog.Title {
      def this(props: TitleProps & ViewProps & TextProps) = this()
      /**
        * @deprecated
        * @see https://reactjs.org/docs/legacy-context.html
        */
      def this(props: TitleProps & ViewProps & TextProps, context: js.Any) = this()
    }
  }
  
  object Dialog {
    
    @JSImport("react-native-dialog", "Dialog.Button")
    @js.native
    class Button protected ()
      extends PureComponent[ButtonProps & ViewProps & TextProps, js.Object, js.Any] {
      def this(props: ButtonProps & ViewProps & TextProps) = this()
      /**
        * @deprecated
        * @see https://reactjs.org/docs/legacy-context.html
        */
      def this(props: ButtonProps & ViewProps & TextProps, context: js.Any) = this()
    }
    
    @JSImport("react-native-dialog", "Dialog.Container")
    @js.native
    class Container protected ()
      extends PureComponent[ContainerProps & ViewProps & reactNativeModalContainerProps, js.Object, js.Any] {
      def this(props: ContainerProps & ViewProps & reactNativeModalContainerProps) = this()
      /**
        * @deprecated
        * @see https://reactjs.org/docs/legacy-context.html
        */
      def this(props: ContainerProps & ViewProps & reactNativeModalContainerProps, context: js.Any) = this()
    }
    
    @JSImport("react-native-dialog", "Dialog.Description")
    @js.native
    class Description protected ()
      extends PureComponent[DescriptionProps & ViewProps & TextProps, js.Object, js.Any] {
      def this(props: DescriptionProps & ViewProps & TextProps) = this()
      /**
        * @deprecated
        * @see https://reactjs.org/docs/legacy-context.html
        */
      def this(props: DescriptionProps & ViewProps & TextProps, context: js.Any) = this()
    }
    
    @JSImport("react-native-dialog", "Dialog.Input")
    @js.native
    class Input[T] protected ()
      extends PureComponent[InputProps[T] & ViewProps & TextInputProps, js.Object, js.Any] {
      def this(props: InputProps[T] & ViewProps & TextInputProps) = this()
      /**
        * @deprecated
        * @see https://reactjs.org/docs/legacy-context.html
        */
      def this(props: InputProps[T] & ViewProps & TextInputProps, context: js.Any) = this()
    }
    
    @JSImport("react-native-dialog", "Dialog.Title")
    @js.native
    class Title protected ()
      extends PureComponent[TitleProps & ViewProps & TextProps, js.Object, js.Any] {
      def this(props: TitleProps & ViewProps & TextProps) = this()
      /**
        * @deprecated
        * @see https://reactjs.org/docs/legacy-context.html
        */
      def this(props: TitleProps & ViewProps & TextProps, context: js.Any) = this()
    }
  }
  
  trait ButtonProps extends StObject {
    
    var bold: js.UndefOr[Boolean] = js.undefined
    
    /**
      * default:
      *      ios     #007ff9
      *      android #169689
      */
    var color: js.UndefOr[String] = js.undefined
    
    /**
      * default: false
      */
    var disabled: js.UndefOr[Boolean] = js.undefined
    
    var label: String
    
    def onPress(): Unit
  }
  object ButtonProps {
    
    @scala.inline
    def apply(label: String, onPress: () => Unit): ButtonProps = {
      val __obj = js.Dynamic.literal(label = label.asInstanceOf[js.Any], onPress = js.Any.fromFunction0(onPress))
      __obj.asInstanceOf[ButtonProps]
    }
    
    @scala.inline
    implicit class ButtonPropsMutableBuilder[Self <: ButtonProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBold(value: Boolean): Self = StObject.set(x, "bold", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBoldUndefined: Self = StObject.set(x, "bold", js.undefined)
      
      @scala.inline
      def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
      
      @scala.inline
      def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      @scala.inline
      def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnPress(value: () => Unit): Self = StObject.set(x, "onPress", js.Any.fromFunction0(value))
    }
  }
  
  trait ContainerProps extends StObject {
    
    var blurComponentIOS: js.UndefOr[ReactNode] = js.undefined
    
    var buttonSeparatorStyle: js.UndefOr[ViewStyle] = js.undefined
    
    var children: js.Array[ReactNode]
    
    var contentStyle: js.UndefOr[ViewStyle] = js.undefined
    
    var footerStyle: js.UndefOr[ViewStyle] = js.undefined
    
    var headerStyle: js.UndefOr[ViewStyle] = js.undefined
    
    /**
      * default: false
      */
    var visible: js.UndefOr[Boolean] = js.undefined
  }
  object ContainerProps {
    
    @scala.inline
    def apply(children: js.Array[ReactNode]): ContainerProps = {
      val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any])
      __obj.asInstanceOf[ContainerProps]
    }
    
    @scala.inline
    implicit class ContainerPropsMutableBuilder[Self <: ContainerProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBlurComponentIOS(value: ReactNode): Self = StObject.set(x, "blurComponentIOS", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBlurComponentIOSUndefined: Self = StObject.set(x, "blurComponentIOS", js.undefined)
      
      @scala.inline
      def setButtonSeparatorStyle(value: ViewStyle): Self = StObject.set(x, "buttonSeparatorStyle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setButtonSeparatorStyleUndefined: Self = StObject.set(x, "buttonSeparatorStyle", js.undefined)
      
      @scala.inline
      def setChildren(value: js.Array[ReactNode]): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChildrenVarargs(value: ReactNode*): Self = StObject.set(x, "children", js.Array(value :_*))
      
      @scala.inline
      def setContentStyle(value: ViewStyle): Self = StObject.set(x, "contentStyle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContentStyleUndefined: Self = StObject.set(x, "contentStyle", js.undefined)
      
      @scala.inline
      def setFooterStyle(value: ViewStyle): Self = StObject.set(x, "footerStyle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFooterStyleUndefined: Self = StObject.set(x, "footerStyle", js.undefined)
      
      @scala.inline
      def setHeaderStyle(value: ViewStyle): Self = StObject.set(x, "headerStyle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeaderStyleUndefined: Self = StObject.set(x, "headerStyle", js.undefined)
      
      @scala.inline
      def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVisibleUndefined: Self = StObject.set(x, "visible", js.undefined)
    }
  }
  
  trait DescriptionProps extends StObject {
    
    var children: String
  }
  object DescriptionProps {
    
    @scala.inline
    def apply(children: String): DescriptionProps = {
      val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any])
      __obj.asInstanceOf[DescriptionProps]
    }
    
    @scala.inline
    implicit class DescriptionPropsMutableBuilder[Self <: DescriptionProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setChildren(value: String): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    }
  }
  
  trait InputProps[T] extends StObject {
    
    var label: js.UndefOr[String] = js.undefined
    
    var textInputRef: js.UndefOr[Ref[T]] = js.undefined
    
    var wrapperStyle: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
  }
  object InputProps {
    
    @scala.inline
    def apply[T](): InputProps[T] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[InputProps[T]]
    }
    
    @scala.inline
    implicit class InputPropsMutableBuilder[Self <: InputProps[?], T] (val x: Self & InputProps[T]) extends AnyVal {
      
      @scala.inline
      def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
      
      @scala.inline
      def setTextInputRef(value: Ref[T]): Self = StObject.set(x, "textInputRef", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTextInputRefFunction1(value: /* instance */ T | Null => Unit): Self = StObject.set(x, "textInputRef", js.Any.fromFunction1(value))
      
      @scala.inline
      def setTextInputRefNull: Self = StObject.set(x, "textInputRef", null)
      
      @scala.inline
      def setTextInputRefUndefined: Self = StObject.set(x, "textInputRef", js.undefined)
      
      @scala.inline
      def setWrapperStyle(value: StyleProp[ViewStyle]): Self = StObject.set(x, "wrapperStyle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWrapperStyleNull: Self = StObject.set(x, "wrapperStyle", null)
      
      @scala.inline
      def setWrapperStyleUndefined: Self = StObject.set(x, "wrapperStyle", js.undefined)
    }
  }
  
  trait TitleProps extends StObject {
    
    var children: String
  }
  object TitleProps {
    
    @scala.inline
    def apply(children: String): TitleProps = {
      val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any])
      __obj.asInstanceOf[TitleProps]
    }
    
    @scala.inline
    implicit class TitlePropsMutableBuilder[Self <: TitleProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setChildren(value: String): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined std.Partial<std.Pick<react-native-modal.react-native-modal.ModalProps, std.Exclude<keyof react-native-modal.react-native-modal.ModalProps, 'isVisible'>>> */
  trait reactNativeModalContainerProps extends StObject {
    
    var accessibilityActions: js.UndefOr[js.Array[AccessibilityActionInfo]] = js.undefined
    
    var accessibilityComponentType: js.UndefOr[none | button | radiobutton_checked | radiobutton_unchecked] = js.undefined
    
    var accessibilityElementsHidden: js.UndefOr[Boolean] = js.undefined
    
    var accessibilityHint: js.UndefOr[String] = js.undefined
    
    var accessibilityIgnoresInvertColors: js.UndefOr[Boolean] = js.undefined
    
    var accessibilityLabel: js.UndefOr[String] = js.undefined
    
    var accessibilityLiveRegion: js.UndefOr[none | polite | assertive] = js.undefined
    
    var accessibilityRole: js.UndefOr[AccessibilityRole] = js.undefined
    
    var accessibilityState: js.UndefOr[AccessibilityState] = js.undefined
    
    var accessibilityTraits: js.UndefOr[AccessibilityTrait | js.Array[AccessibilityTrait]] = js.undefined
    
    var accessibilityValue: js.UndefOr[AccessibilityValue] = js.undefined
    
    var accessibilityViewIsModal: js.UndefOr[Boolean] = js.undefined
    
    var accessible: js.UndefOr[Boolean] = js.undefined
    
    var animationIn: js.UndefOr[Animation | (CustomAnimation[TextStyle & ViewStyle & ImageStyle])] = js.undefined
    
    var animationInTiming: js.UndefOr[Double] = js.undefined
    
    var animationOut: js.UndefOr[Animation | (CustomAnimation[TextStyle & ViewStyle & ImageStyle])] = js.undefined
    
    var animationOutTiming: js.UndefOr[Double] = js.undefined
    
    var avoidKeyboard: js.UndefOr[Boolean] = js.undefined
    
    var backdropColor: js.UndefOr[String] = js.undefined
    
    var backdropOpacity: js.UndefOr[Double] = js.undefined
    
    var backdropTransitionInTiming: js.UndefOr[Double] = js.undefined
    
    var backdropTransitionOutTiming: js.UndefOr[Double] = js.undefined
    
    var children: js.UndefOr[ReactNode] = js.undefined
    
    var collapsable: js.UndefOr[Boolean] = js.undefined
    
    var coverScreen: js.UndefOr[Boolean] = js.undefined
    
    var customBackdrop: js.UndefOr[ReactNode] = js.undefined
    
    var deviceHeight: js.UndefOr[Double] = js.undefined
    
    var deviceWidth: js.UndefOr[Double] = js.undefined
    
    var focusable: js.UndefOr[Boolean] = js.undefined
    
    var hardwareAccelerated: js.UndefOr[Boolean] = js.undefined
    
    var hasBackdrop: js.UndefOr[Boolean] = js.undefined
    
    var hasTVPreferredFocus: js.UndefOr[Boolean] = js.undefined
    
    var hideModalContentWhileAnimating: js.UndefOr[Boolean] = js.undefined
    
    var hitSlop: js.UndefOr[Insets] = js.undefined
    
    var importantForAccessibility: js.UndefOr[auto | yes | no | `no-hide-descendants`] = js.undefined
    
    var isTVSelectable: js.UndefOr[Boolean] = js.undefined
    
    var nativeID: js.UndefOr[String] = js.undefined
    
    var needsOffscreenAlphaCompositing: js.UndefOr[Boolean] = js.undefined
    
    var onAccessibilityAction: js.UndefOr[js.Function1[/* event */ AccessibilityActionEvent, Unit]] = js.undefined
    
    var onAccessibilityEscape: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var onAccessibilityTap: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var onBackButtonPress: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var onBackdropPress: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var onDismiss: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var onLayout: js.UndefOr[js.Function1[/* event */ LayoutChangeEvent, Unit]] = js.undefined
    
    var onMagicTap: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var onModalHide: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var onModalShow: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var onModalWillHide: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var onModalWillShow: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var onMoveShouldSetResponder: js.UndefOr[js.Function1[/* event */ GestureResponderEvent, Boolean]] = js.undefined
    
    var onMoveShouldSetResponderCapture: js.UndefOr[js.Function1[/* event */ GestureResponderEvent, Boolean]] = js.undefined
    
    var onOrientationChange: js.UndefOr[OnOrientationChange] = js.undefined
    
    var onResponderEnd: js.UndefOr[js.Function1[/* event */ GestureResponderEvent, Unit]] = js.undefined
    
    var onResponderGrant: js.UndefOr[js.Function1[/* event */ GestureResponderEvent, Unit]] = js.undefined
    
    var onResponderMove: js.UndefOr[js.Function1[/* event */ GestureResponderEvent, Unit]] = js.undefined
    
    var onResponderReject: js.UndefOr[js.Function1[/* event */ GestureResponderEvent, Unit]] = js.undefined
    
    var onResponderRelease: js.UndefOr[js.Function1[/* event */ GestureResponderEvent, Unit]] = js.undefined
    
    var onResponderStart: js.UndefOr[js.Function1[/* event */ GestureResponderEvent, Unit]] = js.undefined
    
    var onResponderTerminate: js.UndefOr[js.Function1[/* event */ GestureResponderEvent, Unit]] = js.undefined
    
    var onResponderTerminationRequest: js.UndefOr[js.Function1[/* event */ GestureResponderEvent, Boolean]] = js.undefined
    
    var onShow: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var onStartShouldSetResponder: js.UndefOr[js.Function1[/* event */ GestureResponderEvent, Boolean]] = js.undefined
    
    var onStartShouldSetResponderCapture: js.UndefOr[js.Function1[/* event */ GestureResponderEvent, Boolean]] = js.undefined
    
    var onSwipeCancel: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var onSwipeComplete: js.UndefOr[js.Function1[/* params */ OnSwipeCompleteParams, Unit]] = js.undefined
    
    var onSwipeMove: js.UndefOr[js.Function1[/* percentageShown */ Double, Unit]] = js.undefined
    
    var onSwipeStart: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var onTouchCancel: js.UndefOr[js.Function1[/* event */ GestureResponderEvent, Unit]] = js.undefined
    
    var onTouchEnd: js.UndefOr[js.Function1[/* event */ GestureResponderEvent, Unit]] = js.undefined
    
    var onTouchEndCapture: js.UndefOr[js.Function1[/* event */ GestureResponderEvent, Unit]] = js.undefined
    
    var onTouchMove: js.UndefOr[js.Function1[/* event */ GestureResponderEvent, Unit]] = js.undefined
    
    var onTouchStart: js.UndefOr[js.Function1[/* event */ GestureResponderEvent, Unit]] = js.undefined
    
    var pointerEvents: js.UndefOr[`box-none` | none | `box-only` | auto] = js.undefined
    
    var presentationStyle: js.UndefOr[PresentationStyle] = js.undefined
    
    var propagateSwipe: js.UndefOr[Boolean] = js.undefined
    
    var removeClippedSubviews: js.UndefOr[Boolean] = js.undefined
    
    var renderToHardwareTextureAndroid: js.UndefOr[Boolean] = js.undefined
    
    var scrollHorizontal: js.UndefOr[Boolean] = js.undefined
    
    var scrollOffset: js.UndefOr[Double] = js.undefined
    
    var scrollOffsetMax: js.UndefOr[Double] = js.undefined
    
    var scrollTo: js.UndefOr[OrNull[js.Function1[/* e */ js.Any, Unit]]] = js.undefined
    
    var shouldRasterizeIOS: js.UndefOr[Boolean] = js.undefined
    
    var style: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
    
    var supportedOrientations: js.UndefOr[js.Array[Orientation]] = js.undefined
    
    var swipeDirection: js.UndefOr[Direction | js.Array[Direction]] = js.undefined
    
    var swipeThreshold: js.UndefOr[Double] = js.undefined
    
    var testID: js.UndefOr[String] = js.undefined
    
    var tvParallaxMagnification: js.UndefOr[Double] = js.undefined
    
    var tvParallaxProperties: js.UndefOr[TVParallaxProperties] = js.undefined
    
    var tvParallaxShiftDistanceX: js.UndefOr[Double] = js.undefined
    
    var tvParallaxShiftDistanceY: js.UndefOr[Double] = js.undefined
    
    var tvParallaxTiltAngle: js.UndefOr[Double] = js.undefined
    
    var useNativeDriver: js.UndefOr[Boolean] = js.undefined
  }
  object reactNativeModalContainerProps {
    
    @scala.inline
    def apply(): reactNativeModalContainerProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[reactNativeModalContainerProps]
    }
    
    @scala.inline
    implicit class reactNativeModalContainerPropsMutableBuilder[Self <: reactNativeModalContainerProps] (val x: Self) extends AnyVal {
      
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
      def setAnimationIn(value: Animation | (CustomAnimation[TextStyle & ViewStyle & ImageStyle])): Self = StObject.set(x, "animationIn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAnimationInTiming(value: Double): Self = StObject.set(x, "animationInTiming", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAnimationInTimingUndefined: Self = StObject.set(x, "animationInTiming", js.undefined)
      
      @scala.inline
      def setAnimationInUndefined: Self = StObject.set(x, "animationIn", js.undefined)
      
      @scala.inline
      def setAnimationOut(value: Animation | (CustomAnimation[TextStyle & ViewStyle & ImageStyle])): Self = StObject.set(x, "animationOut", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAnimationOutTiming(value: Double): Self = StObject.set(x, "animationOutTiming", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAnimationOutTimingUndefined: Self = StObject.set(x, "animationOutTiming", js.undefined)
      
      @scala.inline
      def setAnimationOutUndefined: Self = StObject.set(x, "animationOut", js.undefined)
      
      @scala.inline
      def setAvoidKeyboard(value: Boolean): Self = StObject.set(x, "avoidKeyboard", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAvoidKeyboardUndefined: Self = StObject.set(x, "avoidKeyboard", js.undefined)
      
      @scala.inline
      def setBackdropColor(value: String): Self = StObject.set(x, "backdropColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBackdropColorUndefined: Self = StObject.set(x, "backdropColor", js.undefined)
      
      @scala.inline
      def setBackdropOpacity(value: Double): Self = StObject.set(x, "backdropOpacity", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBackdropOpacityUndefined: Self = StObject.set(x, "backdropOpacity", js.undefined)
      
      @scala.inline
      def setBackdropTransitionInTiming(value: Double): Self = StObject.set(x, "backdropTransitionInTiming", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBackdropTransitionInTimingUndefined: Self = StObject.set(x, "backdropTransitionInTiming", js.undefined)
      
      @scala.inline
      def setBackdropTransitionOutTiming(value: Double): Self = StObject.set(x, "backdropTransitionOutTiming", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBackdropTransitionOutTimingUndefined: Self = StObject.set(x, "backdropTransitionOutTiming", js.undefined)
      
      @scala.inline
      def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      @scala.inline
      def setCollapsable(value: Boolean): Self = StObject.set(x, "collapsable", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCollapsableUndefined: Self = StObject.set(x, "collapsable", js.undefined)
      
      @scala.inline
      def setCoverScreen(value: Boolean): Self = StObject.set(x, "coverScreen", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCoverScreenUndefined: Self = StObject.set(x, "coverScreen", js.undefined)
      
      @scala.inline
      def setCustomBackdrop(value: ReactNode): Self = StObject.set(x, "customBackdrop", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCustomBackdropUndefined: Self = StObject.set(x, "customBackdrop", js.undefined)
      
      @scala.inline
      def setDeviceHeight(value: Double): Self = StObject.set(x, "deviceHeight", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDeviceHeightUndefined: Self = StObject.set(x, "deviceHeight", js.undefined)
      
      @scala.inline
      def setDeviceWidth(value: Double): Self = StObject.set(x, "deviceWidth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDeviceWidthUndefined: Self = StObject.set(x, "deviceWidth", js.undefined)
      
      @scala.inline
      def setFocusable(value: Boolean): Self = StObject.set(x, "focusable", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFocusableUndefined: Self = StObject.set(x, "focusable", js.undefined)
      
      @scala.inline
      def setHardwareAccelerated(value: Boolean): Self = StObject.set(x, "hardwareAccelerated", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHardwareAcceleratedUndefined: Self = StObject.set(x, "hardwareAccelerated", js.undefined)
      
      @scala.inline
      def setHasBackdrop(value: Boolean): Self = StObject.set(x, "hasBackdrop", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHasBackdropUndefined: Self = StObject.set(x, "hasBackdrop", js.undefined)
      
      @scala.inline
      def setHasTVPreferredFocus(value: Boolean): Self = StObject.set(x, "hasTVPreferredFocus", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHasTVPreferredFocusUndefined: Self = StObject.set(x, "hasTVPreferredFocus", js.undefined)
      
      @scala.inline
      def setHideModalContentWhileAnimating(value: Boolean): Self = StObject.set(x, "hideModalContentWhileAnimating", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHideModalContentWhileAnimatingUndefined: Self = StObject.set(x, "hideModalContentWhileAnimating", js.undefined)
      
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
      def setOnBackButtonPress(value: () => Unit): Self = StObject.set(x, "onBackButtonPress", js.Any.fromFunction0(value))
      
      @scala.inline
      def setOnBackButtonPressUndefined: Self = StObject.set(x, "onBackButtonPress", js.undefined)
      
      @scala.inline
      def setOnBackdropPress(value: () => Unit): Self = StObject.set(x, "onBackdropPress", js.Any.fromFunction0(value))
      
      @scala.inline
      def setOnBackdropPressUndefined: Self = StObject.set(x, "onBackdropPress", js.undefined)
      
      @scala.inline
      def setOnDismiss(value: () => Unit): Self = StObject.set(x, "onDismiss", js.Any.fromFunction0(value))
      
      @scala.inline
      def setOnDismissUndefined: Self = StObject.set(x, "onDismiss", js.undefined)
      
      @scala.inline
      def setOnLayout(value: /* event */ LayoutChangeEvent => Unit): Self = StObject.set(x, "onLayout", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnLayoutUndefined: Self = StObject.set(x, "onLayout", js.undefined)
      
      @scala.inline
      def setOnMagicTap(value: () => Unit): Self = StObject.set(x, "onMagicTap", js.Any.fromFunction0(value))
      
      @scala.inline
      def setOnMagicTapUndefined: Self = StObject.set(x, "onMagicTap", js.undefined)
      
      @scala.inline
      def setOnModalHide(value: () => Unit): Self = StObject.set(x, "onModalHide", js.Any.fromFunction0(value))
      
      @scala.inline
      def setOnModalHideUndefined: Self = StObject.set(x, "onModalHide", js.undefined)
      
      @scala.inline
      def setOnModalShow(value: () => Unit): Self = StObject.set(x, "onModalShow", js.Any.fromFunction0(value))
      
      @scala.inline
      def setOnModalShowUndefined: Self = StObject.set(x, "onModalShow", js.undefined)
      
      @scala.inline
      def setOnModalWillHide(value: () => Unit): Self = StObject.set(x, "onModalWillHide", js.Any.fromFunction0(value))
      
      @scala.inline
      def setOnModalWillHideUndefined: Self = StObject.set(x, "onModalWillHide", js.undefined)
      
      @scala.inline
      def setOnModalWillShow(value: () => Unit): Self = StObject.set(x, "onModalWillShow", js.Any.fromFunction0(value))
      
      @scala.inline
      def setOnModalWillShowUndefined: Self = StObject.set(x, "onModalWillShow", js.undefined)
      
      @scala.inline
      def setOnMoveShouldSetResponder(value: /* event */ GestureResponderEvent => Boolean): Self = StObject.set(x, "onMoveShouldSetResponder", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnMoveShouldSetResponderCapture(value: /* event */ GestureResponderEvent => Boolean): Self = StObject.set(x, "onMoveShouldSetResponderCapture", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnMoveShouldSetResponderCaptureUndefined: Self = StObject.set(x, "onMoveShouldSetResponderCapture", js.undefined)
      
      @scala.inline
      def setOnMoveShouldSetResponderUndefined: Self = StObject.set(x, "onMoveShouldSetResponder", js.undefined)
      
      @scala.inline
      def setOnOrientationChange(value: /* orientation */ NativeSyntheticEvent[js.Any] => Unit): Self = StObject.set(x, "onOrientationChange", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnOrientationChangeUndefined: Self = StObject.set(x, "onOrientationChange", js.undefined)
      
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
      def setOnShow(value: () => Unit): Self = StObject.set(x, "onShow", js.Any.fromFunction0(value))
      
      @scala.inline
      def setOnShowUndefined: Self = StObject.set(x, "onShow", js.undefined)
      
      @scala.inline
      def setOnStartShouldSetResponder(value: /* event */ GestureResponderEvent => Boolean): Self = StObject.set(x, "onStartShouldSetResponder", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnStartShouldSetResponderCapture(value: /* event */ GestureResponderEvent => Boolean): Self = StObject.set(x, "onStartShouldSetResponderCapture", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnStartShouldSetResponderCaptureUndefined: Self = StObject.set(x, "onStartShouldSetResponderCapture", js.undefined)
      
      @scala.inline
      def setOnStartShouldSetResponderUndefined: Self = StObject.set(x, "onStartShouldSetResponder", js.undefined)
      
      @scala.inline
      def setOnSwipeCancel(value: () => Unit): Self = StObject.set(x, "onSwipeCancel", js.Any.fromFunction0(value))
      
      @scala.inline
      def setOnSwipeCancelUndefined: Self = StObject.set(x, "onSwipeCancel", js.undefined)
      
      @scala.inline
      def setOnSwipeComplete(value: /* params */ OnSwipeCompleteParams => Unit): Self = StObject.set(x, "onSwipeComplete", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnSwipeCompleteUndefined: Self = StObject.set(x, "onSwipeComplete", js.undefined)
      
      @scala.inline
      def setOnSwipeMove(value: /* percentageShown */ Double => Unit): Self = StObject.set(x, "onSwipeMove", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnSwipeMoveUndefined: Self = StObject.set(x, "onSwipeMove", js.undefined)
      
      @scala.inline
      def setOnSwipeStart(value: () => Unit): Self = StObject.set(x, "onSwipeStart", js.Any.fromFunction0(value))
      
      @scala.inline
      def setOnSwipeStartUndefined: Self = StObject.set(x, "onSwipeStart", js.undefined)
      
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
      def setPointerEvents(value: `box-none` | none | `box-only` | auto): Self = StObject.set(x, "pointerEvents", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPointerEventsUndefined: Self = StObject.set(x, "pointerEvents", js.undefined)
      
      @scala.inline
      def setPresentationStyle(value: PresentationStyle): Self = StObject.set(x, "presentationStyle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPresentationStyleUndefined: Self = StObject.set(x, "presentationStyle", js.undefined)
      
      @scala.inline
      def setPropagateSwipe(value: Boolean): Self = StObject.set(x, "propagateSwipe", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPropagateSwipeUndefined: Self = StObject.set(x, "propagateSwipe", js.undefined)
      
      @scala.inline
      def setRemoveClippedSubviews(value: Boolean): Self = StObject.set(x, "removeClippedSubviews", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRemoveClippedSubviewsUndefined: Self = StObject.set(x, "removeClippedSubviews", js.undefined)
      
      @scala.inline
      def setRenderToHardwareTextureAndroid(value: Boolean): Self = StObject.set(x, "renderToHardwareTextureAndroid", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRenderToHardwareTextureAndroidUndefined: Self = StObject.set(x, "renderToHardwareTextureAndroid", js.undefined)
      
      @scala.inline
      def setScrollHorizontal(value: Boolean): Self = StObject.set(x, "scrollHorizontal", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScrollHorizontalUndefined: Self = StObject.set(x, "scrollHorizontal", js.undefined)
      
      @scala.inline
      def setScrollOffset(value: Double): Self = StObject.set(x, "scrollOffset", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScrollOffsetMax(value: Double): Self = StObject.set(x, "scrollOffsetMax", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScrollOffsetMaxUndefined: Self = StObject.set(x, "scrollOffsetMax", js.undefined)
      
      @scala.inline
      def setScrollOffsetUndefined: Self = StObject.set(x, "scrollOffset", js.undefined)
      
      @scala.inline
      def setScrollTo(value: /* e */ js.Any => Unit): Self = StObject.set(x, "scrollTo", js.Any.fromFunction1(value))
      
      @scala.inline
      def setScrollToNull: Self = StObject.set(x, "scrollTo", null)
      
      @scala.inline
      def setScrollToUndefined: Self = StObject.set(x, "scrollTo", js.undefined)
      
      @scala.inline
      def setShouldRasterizeIOS(value: Boolean): Self = StObject.set(x, "shouldRasterizeIOS", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShouldRasterizeIOSUndefined: Self = StObject.set(x, "shouldRasterizeIOS", js.undefined)
      
      @scala.inline
      def setStyle(value: StyleProp[ViewStyle]): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStyleNull: Self = StObject.set(x, "style", null)
      
      @scala.inline
      def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      @scala.inline
      def setSupportedOrientations(value: js.Array[Orientation]): Self = StObject.set(x, "supportedOrientations", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSupportedOrientationsUndefined: Self = StObject.set(x, "supportedOrientations", js.undefined)
      
      @scala.inline
      def setSupportedOrientationsVarargs(value: Orientation*): Self = StObject.set(x, "supportedOrientations", js.Array(value :_*))
      
      @scala.inline
      def setSwipeDirection(value: Direction | js.Array[Direction]): Self = StObject.set(x, "swipeDirection", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSwipeDirectionUndefined: Self = StObject.set(x, "swipeDirection", js.undefined)
      
      @scala.inline
      def setSwipeDirectionVarargs(value: Direction*): Self = StObject.set(x, "swipeDirection", js.Array(value :_*))
      
      @scala.inline
      def setSwipeThreshold(value: Double): Self = StObject.set(x, "swipeThreshold", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSwipeThresholdUndefined: Self = StObject.set(x, "swipeThreshold", js.undefined)
      
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
      
      @scala.inline
      def setUseNativeDriver(value: Boolean): Self = StObject.set(x, "useNativeDriver", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUseNativeDriverUndefined: Self = StObject.set(x, "useNativeDriver", js.undefined)
    }
  }
}
